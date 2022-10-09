package com.davioooh.datatablespagination.model;

import java.util.List;

/**
 * Class representing the data to be displayed in the table. Its JSON
 * serialization can be privided to the client as table data structure.
 */
public class TableData<T> {

	private List<T> data;

	/**
	 * Creates a new instance containing the data to be displayed in the table.
	 *
	 * @param data the data to be displayed in the table. This is an array of data
	 *        source objects, one for each row, which will be used by DataTables.
	 *        Note that this parameter's name can be changed using the ajax option's
	 *        dataSrc property.
	 */
	public TableData(List<T> data) {
		this.data = data;
	}

	/**
	 * Empty default constructor.
	 */
	protected TableData() {}

	/**
	 * Returns the data to be displayed in the table. This is an array of data
	 * source objects, one for each row, which will be used by DataTables. Note that
	 * this parameter's name can be changed using the ajax option's dataSrc
	 * property.
	 *
	 * @return the data to be displayed in the table.
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * Sets the data to be displayed in the table. This is an array of data source
	 * objects, one for each row, which will be used by DataTables. Note that this
	 * parameter's name can be changed using the ajax option's dataSrc property.
	 * 
	 * @param data the data to be displayed in the table.
	 */
	public void setData(List<T> data) {
		this.data = data;
	}

}
