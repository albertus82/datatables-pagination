package com.davioooh.datatablespagination.model;

/**
 * Column's ordering criteria.
 */
public interface OrderingCriteria {

	public static final String ASC = "asc";
	public static final String DESC = "desc";

	/**
	 * Returns the index of the column to which ordering should be applied. This is
	 * an index reference to the columns array of information that is also submitted
	 * to the server.
	 * 
	 * @return the index of the column to which ordering should be applied.
	 */
	int getColumn();

	/**
	 * Returns the ordering direction for this column. It will be asc or desc to
	 * indicate ascending ordering or descending ordering, respectively.
	 * 
	 * @return the ordering direction for this column.
	 */
	String getDir();

}
