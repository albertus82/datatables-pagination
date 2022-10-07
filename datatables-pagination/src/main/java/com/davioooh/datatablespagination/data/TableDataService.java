package com.davioooh.datatablespagination.data;

import java.util.List;

import com.davioooh.datatablespagination.model.PaginationCriteria;

/**
 * This interface defines API to fetch data to be paginated. Classes
 * implementing {@link TableDataService} should also implement filter and
 * ordering logic.
 *
 * @author David Castelletti
 */
public interface TableDataService<T> {

	/**
	 * Used to get the total count of the entries (before filtering).
	 *
	 * @return the total count of the entries.
	 * @throws TableDataException
	 */
	long countTotalEntries() throws TableDataException;

	/**
	 * Used to get the number of total filtered result according to provided search
	 * criteria declared in {@code PaginationCriteria}}
	 *
	 * @param paginationCriteria pagination criteria.
	 * @return the count of filter entries.
	 * @throws TableDataException
	 */
	long countFilteredEntries(PaginationCriteria paginationCriteria) throws TableDataException;

	/**
	 * Returns entries for a table page. It should filter entries by search keys and
	 * sort them by ordering criteria declared in {@code PaginationCriteria}}
	 *
	 * @param paginationCriteria pagination criteria.
	 * @return filter and ordered entities.
	 * @throws TableDataException
	 */
	List<T> getPageEntries(PaginationCriteria paginationCriteria) throws TableDataException;

}
