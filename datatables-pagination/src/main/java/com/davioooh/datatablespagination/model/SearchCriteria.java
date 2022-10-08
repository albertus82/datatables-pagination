package com.davioooh.datatablespagination.model;

public interface SearchCriteria {

	/**
	 * Search value.
	 */
	String getValue();

	/**
	 * true if the filter should be treated as a regular expression for advanced
	 * searching, false otherwise. Note that normally server-side processing scripts
	 * will not perform regular expression searching for performance reasons on
	 * large data sets, but it is technically possible and at the discretion of your
	 * script.
	 */
	boolean isRegex();

}
