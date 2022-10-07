package com.davioooh.datatablespagination.model;

public interface SearchCriteria {

    /**
     * Search value. To be applied to all columns which have searchable as
     * true.
     */
	String getValue();

    /**
     * true if the filter should be treated as a regular expression for
     * advanced searching, false otherwise.
     */
	boolean isRegex(); // not used

}