package com.davioooh.datatablespagination.model.get;

import java.util.List;

import com.davioooh.datatablespagination.model.PaginationCriteria;

/**
 * When making a request to the server using server-side processing, DataTables
 * will send the following data in order to let the server know what data is
 * required:
 */
public class PaginationCriteriaParams implements PaginationCriteria<OrderingCriteriaParams, ColumnParams> {

	private long draw;

	private long start;

	private long length;

	private SearchCriteriaParams search;

	private List<OrderingCriteriaParams> order;

	private List<ColumnParams> columns;

	@Override
	public long getDraw() {
		return draw;
	}

	public void setDraw(long draw) {
		this.draw = draw;
	}

	@Override
	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	@Override
	public long getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public SearchCriteriaParams getSearch() {
		return search;
	}

	public void setSearch(SearchCriteriaParams search) {
		this.search = search;
	}

	@Override
	public List<OrderingCriteriaParams> getOrder() {
		return order;
	}

	public void setOrder(List<OrderingCriteriaParams> order) {
		this.order = order;
	}

	@Override
	public List<ColumnParams> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnParams> columns) {
		this.columns = columns;
	}

}
