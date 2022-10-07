package com.davioooh.datatablespagination.model.post;

import com.davioooh.datatablespagination.model.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnBody implements Column {

	private String data;

	private String name;

	private boolean searchable;

	private boolean orderable;

	private SearchCriteriaBody search;

}