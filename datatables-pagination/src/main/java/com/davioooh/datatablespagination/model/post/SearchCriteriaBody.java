package com.davioooh.datatablespagination.model.post;

import com.davioooh.datatablespagination.model.SearchCriteria;

public class SearchCriteriaBody implements SearchCriteria {

	private String value;

	private boolean regex;

	@Override
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean isRegex() {
		return regex;
	}

	public void setRegex(boolean regex) {
		this.regex = regex;
	}

}
