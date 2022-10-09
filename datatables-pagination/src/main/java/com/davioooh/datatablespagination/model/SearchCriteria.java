package com.davioooh.datatablespagination.model;

/**
 * Search criteria.
 */
public interface SearchCriteria {

	/**
	 * Returns the search value.
	 * 
	 * @return the search value.
	 */
	String getValue();

	/**
	 * Returns true if the filter should be treated as a regular expression for
	 * advanced searching, false otherwise. Note that normally server-side
	 * processing scripts will not perform regular expression searching for
	 * performance reasons on large data sets, but it is technically possible and at
	 * the discretion of your script.
	 * 
	 * @return true if the filter should be treated as a regular expression for
	 *         advanced searching, false otherwise.
	 */
	boolean isRegex();

}
