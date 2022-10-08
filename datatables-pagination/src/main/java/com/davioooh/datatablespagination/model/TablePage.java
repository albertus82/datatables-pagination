package com.davioooh.datatablespagination.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Class representing the result of the server-side pagination. Its JSON
 * serialization can be privided to the client as table data structure.
 *
 * @author David Castelletti
 */
public class TablePage<T> {

	/**
	 * The draw counter that this object is a response to - from the draw parameter
	 * sent as part of the data request. Note that it is strongly recommended for
	 * security reasons that you cast this parameter to an integer, rather than
	 * simply echoing back to the client what it sent in the draw parameter, in
	 * order to prevent Cross Site Scripting (XSS) attacks.
	 */
	private long draw;

	/**
	 * Total records, before filtering (i.e. the total number of records in the
	 * database)
	 */
	private long recordsTotal;

	/**
	 * Total records, after filtering (i.e. the total number of records after
	 * filtering has been applied - not just the number of records being returned
	 * for this page of data).
	 */
	private long recordsFiltered;

	/**
	 * The data to be displayed in the table. This is an array of data source
	 * objects, one for each row, which will be used by DataTables. Note that this
	 * parameter's name can be changed using the ajax option's dataSrc property.
	 */
	private List<T> data;

	/**
	 * Optional: If an error occurs during the running of the server-side processing
	 * script, you can inform the user of this error by passing back the error
	 * message to be displayed using this parameter. Do not include if there is no
	 * error.
	 */
	@JsonInclude(Include.NON_EMPTY) // Do not include if there is no error!
	private String error;

	public long getDraw() {
		return draw;
	}

	public void setDraw(long draw) {
		this.draw = draw;
	}

	public long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
