package com.davioooh.datatablespagination.model.urlencoded;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.OrderingCriteria;

public class OrderingCriteriaParams extends LinkedHashMap<String, String> implements OrderingCriteria {

	private static final long serialVersionUID = -4379969579085902855L;

	@Override
	public int getColumn() {
		return Integer.parseInt(get("column"));
	}

	@Override
	public String getDir() {
		return get("dir");
	}

}
