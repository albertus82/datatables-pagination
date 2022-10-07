package com.davioooh.datatablespagination.model;

import java.util.List;

/**
 * The pagination criteria provided by the client to process and generate a
 * table page. It includes, pagination, ordering and search criteria. An
 * instance of this class can be created directly deserializing the JSON request
 * payload from the client.
 *
 * @author David Castelletti
 */
public interface PaginationCriteria<O extends OrderingCriteria, C extends Column> {

	/**
	 * Draw counter. This is used by DataTables to ensure that the Ajax returns from
	 * server-side processing requests are drawn in sequence by DataTables (Ajax
	 * requests are asynchronous and thus can return out of sequence). This is used
	 * as part of the draw return parameter.
	 */
	long getDraw();

	/**
	 * Paging first record indicator. This is the start point in the current data
	 * set (0 index based - i.e. 0 is the first record).
	 */
	long getStart();

	/**
	 * Number of records that the table can display in the current draw. It is
	 * expected that the number of records returned will be equal to this number,
	 * unless the server has fewer records to return. Note that this can be -1 to
	 * indicate that all records should be returned (although that negates any
	 * benefits of server-side processing!)
	 */
	long getLength();

	/**
	 * Global search criteria.
	 */
	SearchCriteria getSearch();

	/**
	 * Column's ordering criteria.
	 */
	List<O> getOrder();

	/**
	 * Table column's list.
	 */
	List<C> getColumns();

}
