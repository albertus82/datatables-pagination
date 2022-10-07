package com.davioooh.datatablespagination.data;

public class TableDataException extends Exception {

	private static final long serialVersionUID = -259512394743155335L;

	public TableDataException(String string, Throwable ex) {
		super(string, ex);
	}

	public TableDataException(String message) {
		super(message);
	}

}
