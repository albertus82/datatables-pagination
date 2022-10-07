package com.davioooh.datatablespagination.model.post;

import com.davioooh.datatablespagination.model.Column;

public class ColumnBody implements Column {

	private String data;

	private String name;

	private boolean searchable;

	private boolean orderable;

	private SearchCriteriaBody search;

	@Override
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean isSearchable() {
		return searchable;
	}

	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}

	@Override
	public boolean isOrderable() {
		return orderable;
	}

	public void setOrderable(boolean orderable) {
		this.orderable = orderable;
	}

	@Override
	public SearchCriteriaBody getSearch() {
		return search;
	}

	public void setSearch(SearchCriteriaBody search) {
		this.search = search;
	}

}
