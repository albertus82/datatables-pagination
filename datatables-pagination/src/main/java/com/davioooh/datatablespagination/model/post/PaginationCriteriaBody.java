package com.davioooh.datatablespagination.model.post;

import java.util.List;

import com.davioooh.datatablespagination.model.PaginationCriteria;

/**
 * The pagination criteria provided by the client to process and generate a
 * table page. It includes, pagination, ordering and search criteria. An
 * instance of this class can be created directly deserializing the JSON request
 * payload from the client.
 *
 * @author David Castelletti
 */
public class PaginationCriteriaBody implements PaginationCriteria {

	private long draw;

	private long start;

	private long length;

	private SearchCriteriaBody search;

	private List<OrderingCriteriaBody> order;

	private List<ColumnBody> columns;

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

	public void setLength(long length) {
		this.length = length;
	}

	@Override
	public SearchCriteriaBody getSearch() {
		return search;
	}

	public void setSearch(SearchCriteriaBody search) {
		this.search = search;
	}

	@Override
	public List<OrderingCriteriaBody> getOrder() {
		return order;
	}

	public void setOrder(List<OrderingCriteriaBody> order) {
		this.order = order;
	}

	@Override
	public List<ColumnBody> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnBody> columns) {
		this.columns = columns;
	}

}
