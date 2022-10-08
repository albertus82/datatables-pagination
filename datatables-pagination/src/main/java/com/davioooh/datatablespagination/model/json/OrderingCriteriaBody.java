package com.davioooh.datatablespagination.model.json;

import com.davioooh.datatablespagination.model.OrderingCriteria;

public class OrderingCriteriaBody implements OrderingCriteria {

	private int column;

	private String dir;

	@Override
	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

}
