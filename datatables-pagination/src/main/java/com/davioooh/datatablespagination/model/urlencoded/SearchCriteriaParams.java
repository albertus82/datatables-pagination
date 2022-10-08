package com.davioooh.datatablespagination.model.urlencoded;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.SearchCriteria;

public class SearchCriteriaParams extends LinkedHashMap<String, String> implements SearchCriteria {

	private static final long serialVersionUID = -9171844131235679867L;

	@Override
	public String getValue() {
		return get("value");
	}

	@Override
	public boolean isRegex() {
		return Boolean.parseBoolean(get("regex"));
	}

}
