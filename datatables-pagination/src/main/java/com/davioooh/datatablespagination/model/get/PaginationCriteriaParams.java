package com.davioooh.datatablespagination.model.get;

import java.util.List;

import com.davioooh.datatablespagination.model.PaginationCriteria;

/**
 * When making a request to the server using server-side processing, DataTables
 * will send the following data in order to let the server know what data is
 * required:
 */
public class PaginationCriteriaParams implements PaginationCriteria {

	/**
	 * Draw counter. This is used by DataTables to ensure that the Ajax returns from
	 * server-side processing requests are drawn in sequence by DataTables (Ajax
	 * requests are asynchronous and thus can return out of sequence). This is used
	 * as part of the draw return parameter (see below).
	 */
	private long draw;

	/**
	 * Paging first record indicator. This is the start point in the current data
	 * set (0 index based - i.e. 0 is the first record).
	 */
	private long start;

	/**
	 * Number of records that the table can display in the current draw. It is
	 * expected that the number of records returned will be equal to this number,
	 * unless the server has fewer records to return. Note that this can be -1 to
	 * indicate that all records should be returned (although that negates any
	 * benefits of server-side processing!)
	 */
	private long length;

	private SearchCriteria search;

	private List<OrderingCriteria> order;

	private List<Column> columns;

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
	public SearchCriteria getSearch() {
		return search;
	}

	public void setSearch(SearchCriteria search) {
		this.search = search;
	}

	public List<OrderingCriteria> getOrder() {
		return order;
	}

	public void setOrder(List<OrderingCriteria> order) {
		this.order = order;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

}
