package com.davioooh.datatablespagination.model;

public interface IOrderingCriteria {
 
	public static final String ASC = "asc";
    public static final String DESC = "desc";

    /**
     * Column to which ordering should be applied. This is an index reference to the
     * columns array of information that is also submitted to the server.
     */
    int getColumn();

    /**
     * Ordering direction for this column. It will be asc or desc to indicate
     * ascending ordering or descending ordering, respectively.
     */
    String getDir();

}
