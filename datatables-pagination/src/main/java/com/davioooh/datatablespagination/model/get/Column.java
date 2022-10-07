package com.davioooh.datatablespagination.model.get;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.IColumn;

public class Column extends LinkedHashMap<String, Object> implements IColumn {

	private static final long serialVersionUID = -7401089762743284813L;

	public Column() {
		put("search", new SearchCriteria());
	}

	/** Column's data source, as defined by columns.data. */
	@Override
	public String getData() {
		final Object data = get("data");
		return data != null ? data.toString() : null;
	}

	/** Column's name, as defined by columns.name. */
	@Override
	public String getName() {
		final Object name = get("name");
		return name != null ? name.toString() : null;
	}

	/**
	 * Flag to indicate if this column is searchable (true) or not (false). This is
	 * controlled by columns.searchable.
	 */
	@Override
	public boolean isSearchable() {
		return Boolean.parseBoolean(String.valueOf(get("searchable")));
	}

	/**
	 * Flag to indicate if this column is orderable (true) or not (false). This is
	 * controlled by columns.orderable.
	 */
	@Override
	public boolean isOrderable() {
		return Boolean.parseBoolean(String.valueOf(get("orderable")));
	}

	@Override
	public SearchCriteria getSearch() {
		return (SearchCriteria) get("search");
	}

}
