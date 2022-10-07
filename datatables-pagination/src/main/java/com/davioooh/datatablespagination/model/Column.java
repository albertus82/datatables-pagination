package com.davioooh.datatablespagination.model;

public interface Column {

	/**
	 * Column's data source, as defined by columns.data.
	 */
	String getData();

	/**
	 * Column's name, as defined by columns.name.
	 */
	String getName();

	/**
	 * Flag to indicate if this column is searchable (true) or not (false). This is
	 * controlled by columns.searchable.
	 */
	boolean isSearchable();

	/**
	 * Flag to indicate if this column is orderable (true) or not (false). This is
	 * controlled by columns.orderable.
	 */
	boolean isOrderable();

	/**
	 * Search criteria to apply to this specific column.
	 */
	SearchCriteria getSearch();

}