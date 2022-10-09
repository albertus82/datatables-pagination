package com.davioooh.datatablespagination.model;

/**
 * Table column.
 */
public interface Column {

	/**
	 * Returns the column's data source, as defined by columns.data.
	 *
	 * @return the column's data source.
	 */
	String getData();

	/**
	 * Returns the column's name, as defined by columns.name.
	 *
	 * @return the column's name.
	 */
	String getName();

	/**
	 * Returns true if this column is searchable, false otherwise. This is
	 * controlled by columns.searchable.
	 * 
	 * @return true if this column is searchable, false otherwise.
	 */
	boolean isSearchable();

	/**
	 * Returns true if this column is orderable, false otherwise. This is controlled
	 * by columns.orderable.
	 * 
	 * @return true if this column is orderable, false otherwise.
	 */
	boolean isOrderable();

	/**
	 * Returns the search criteria to apply to this specific column.
	 * 
	 * @return the search criteria to apply to this specific column.
	 */
	SearchCriteria getSearch();

}
