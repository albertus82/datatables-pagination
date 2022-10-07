package com.davioooh.paginationdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.davioooh.datatablespagination.data.DataServiceBase;
import com.davioooh.datatablespagination.data.TableDataException;
import com.davioooh.datatablespagination.model.OrderingCriteria;
import com.davioooh.datatablespagination.model.PaginationCriteria;

public class UserTableRepository extends DataServiceBase<User> {

	private static final List<User> TEST_DATA = Arrays.asList(new User(1, "Lisa", 20), new User(2, "Tom", 31), new User(3, "David", 38), new User(4, "Marco", 23), new User(5, "Jenny", 15));

	@Override
	public long countTotalEntries() throws TableDataException {
		return TEST_DATA.size();
	}

	@Override
	public long countFilteredEntries(PaginationCriteria paginationCriteria) throws TableDataException {
		return filter(paginationCriteria).count();
	}

	@Override
	protected List<User> getData(PaginationCriteria paginationCriteria) throws TableDataException {
		return filter(paginationCriteria).collect(Collectors.toList());
	}

	private static Stream<User> filter(PaginationCriteria paginationCriteria) {
		Stream<User> filter = TEST_DATA.stream().filter(u -> u.getName() == null || u.getName().contains(paginationCriteria.getSearch().getValue()));
		if (!paginationCriteria.getOrder().isEmpty()) {
			filter = filter.sorted((a, b) -> {
				OrderingCriteria order = paginationCriteria.getOrder().get(0);
				int dir = order.getDir().equalsIgnoreCase(OrderingCriteria.DESC) ? -1 : 1;
				switch (paginationCriteria.getColumns().get(order.getColumn()).getData()) {
				case "id":
					return dir * Integer.compare(a.getId(), b.getId());
				case "name":
					if (a.getName() == null) {
						return dir * 1;
					}
					if (b.getName() == null) {
						return dir * -1;
					}
					return dir * a.getName().compareTo(b.getName());
				case "age":
					return dir * Integer.compare(a.getAge(), b.getAge());
				default:
					return 0;
				}
			});
		}
		return filter;
	}

}
