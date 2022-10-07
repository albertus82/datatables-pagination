package com.davioooh.datatablespagination.model.post;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.davioooh.datatablespagination.model.PaginationCriteria;

/**
 * The pagination criteria provided by the client to process and generate a
 * table page. It includes, pagination, ordering and search criteria. An
 * instance of this class can be created directly deserializing the JSON request
 * payload from the client.
 *
 * @author David Castelletti
 */
@Getter
@Setter
public class PaginationCriteriaBody implements PaginationCriteria {
    /**
     * Draw counter. This is used by DataTables to ensure that the Ajax returns from
     * server-side processing requests are drawn in sequence by DataTables (Ajax
     * requests are asynchronous and thus can return out of sequence). This is used
     * as part of the draw return parameter.
     */
    private long draw;

    /**
     * Paging first record indicator. This is the start point in the current data
     * set (0 index based - i.e. 0 is the first record).
     */
    private long start;

    /**
     * Number of records that the table can display in the current draw. It is
     * expected that the number of records returned will be equal to this number,
     * unless the server has fewer records to return. Note that this can be -1 to
     * indicate that all records should be returned (although that negates any
     * benefits of server-side processing!)
     */
    private long length;

    /**
     * Global search criteria.
     */
    private SearchCriteriaBody search;

    /**
     * Column's ordering criteria.
     */
    private List<OrderingCriteriaBody> order;

    /**
     * Table column's list.
     */
    private List<ColumnBody> columns;

}
