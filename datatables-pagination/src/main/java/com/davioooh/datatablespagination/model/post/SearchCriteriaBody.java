package com.davioooh.datatablespagination.model.post;

import com.davioooh.datatablespagination.model.SearchCriteria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCriteriaBody implements SearchCriteria {

	private String value;

	private boolean regex;

}