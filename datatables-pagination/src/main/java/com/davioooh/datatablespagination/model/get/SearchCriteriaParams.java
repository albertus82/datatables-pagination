package com.davioooh.datatablespagination.model.get;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.SearchCriteria;

public class SearchCriteriaParams extends LinkedHashMap<String, String> implements SearchCriteria {

	private static final long serialVersionUID = -9171844131235679867L;

	/**
	 * Global search value. To be applied to all columns which have searchable as
	 * true.
	 */
	@Override
	public String getValue() {
		return get("value");
	}

	/**
	 * true if the global filter should be treated as a regular expression for
	 * advanced searching, false otherwise. Note that normally server-side
	 * processing scripts will not perform regular expression searching for
	 * performance reasons on large data sets, but it is technically possible and at
	 * the discretion of your script.
	 */
	@Override
	public boolean isRegex() {
		return Boolean.parseBoolean(get("regex"));
	}

}
