package com.davioooh.datatablespagination.model;

import java.util.List;

/**
 * The pagination criteria provided by the client to process and generate a
 * table page. It includes, pagination, ordering and search criteria.
 *
 * @author David Castelletti
 */
public interface PaginationCriteria {

	/**
	 * Returns the draw counter. This is used by DataTables to ensure that the Ajax
	 * returns from server-side processing requests are drawn in sequence by
	 * DataTables (Ajax requests are asynchronous and thus can return out of
	 * sequence). This is used as part of the draw return parameter.
	 * 
	 * @return the draw counter.
	 */
	long getDraw();

	/**
	 * Returns the paging first record indicator. This is the start point in the
	 * current data set (0 index based - i.e. 0 is the first record).
	 * 
	 * @return the start point in the current data set.
	 */
	long getStart();

	/**
	 * Returns the number of records that the table can display in the current draw.
	 * It is expected that the number of records returned will be equal to this
	 * number, unless the server has fewer records to return. Note that this can be
	 * -1 to indicate that all records should be returned (although that negates any
	 * benefits of server-side processing!).
	 * 
	 * @return the number of records that the table can display in the current draw.
	 */
	long getLength();

	/**
	 * Returns the global search criteria. To be applied to all columns which have
	 * searchable as true.
	 * 
	 * @return the global search criteria.
	 */
	SearchCriteria getSearch();

	/**
	 * Returns the columns ordering criteria.
	 * 
	 * @return the columns ordering criteria.
	 */
	List<? extends OrderingCriteria> getOrder();

	/**
	 * Returns the table columns list.
	 * 
	 * @return the table columns list.
	 */
	List<? extends Column> getColumns();

}
