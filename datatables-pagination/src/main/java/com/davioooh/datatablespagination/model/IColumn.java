package com.davioooh.datatablespagination.model;

public interface IColumn {

    /**
     * Column's data source.
     */
    String getData();

    /**
     * Column's name.
     */
    String getName();

    /**
     * Flag to indicate if this column is searchable (true) or not (false).
     */
    boolean isSearchable();

    /**
     * Flag to indicate if this column is orderable (true) or not (false).
     */
    boolean isOrderable();

    /**
     * Search criteria to apply to this specific column.
     */
    ISearchCriteria getSearch();

}