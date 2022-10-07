package com.davioooh.datatablespagination.model.post;

import com.davioooh.datatablespagination.model.OrderingCriteria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderingCriteriaBody implements OrderingCriteria {

    /**
     * Column to which ordering should be applied. This is an index reference to the
     * columns array of information that is also submitted to the server.
     */
    private int column;

    /**
     * Ordering direction for this column. It will be asc or desc to indicate
     * ascending ordering or descending ordering, respectively.
     */
    private String dir;

}