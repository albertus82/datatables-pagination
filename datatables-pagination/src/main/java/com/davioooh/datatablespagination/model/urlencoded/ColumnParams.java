package com.davioooh.datatablespagination.model.urlencoded;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.Column;

public class ColumnParams extends LinkedHashMap<String, Object> implements Column {

	private static final long serialVersionUID = -7401089762743284813L;

	public ColumnParams() {
		put("search", new SearchCriteriaParams());
	}

	@Override
	public String getData() {
		final Object data = get("data");
		return data != null ? data.toString() : null;
	}

	@Override
	public String getName() {
		final Object name = get("name");
		return name != null ? name.toString() : null;
	}

	@Override
	public boolean isSearchable() {
		return Boolean.parseBoolean(String.valueOf(get("searchable")));
	}

	@Override
	public boolean isOrderable() {
		return Boolean.parseBoolean(String.valueOf(get("orderable")));
	}

	@Override
	public SearchCriteriaParams getSearch() {
		return (SearchCriteriaParams) get("search");
	}

}
