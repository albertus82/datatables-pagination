package com.davioooh.datatablespagination.model.get;

import java.util.LinkedHashMap;

import com.davioooh.datatablespagination.model.IOrderingCriteria;

public class OrderingCriteria extends LinkedHashMap<String, String> implements IOrderingCriteria {

	private static final long serialVersionUID = -4379969579085902855L;

	/**
	 * Column to which ordering should be applied. This is an index reference to the
	 * columns array of information that is also submitted to the server.
	 */
	@Override
	public int getColumn() {
		return Integer.parseInt(get("column"));
	}

	/**
	 * Ordering direction for this column. It will be asc or desc to indicate
	 * ascending ordering or descending ordering, respectively.
	 */
	@Override
	public String getDir() {
		return get("dir");
	}

}
