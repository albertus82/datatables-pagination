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
public class TablePage<T> extends TableData<T> {

	/**
	 * Creates a new instance containing the result of the server-side pagination.
	 * 
	 * @param data the data to be displayed in the table; this is an array of data
	 *        source objects, one for each row, which will be used by DataTables.
	 * @param draw the draw counter that this object is a response to - from the
	 *        draw parameter sent as part of the data request.
	 * @param recordsTotal total records, before filtering (i.e. the total number of
	 *        records in the database).
	 * @param recordsFiltered total records, after filtering (i.e. the total number
	 *        of records after filtering has been applied - not just the number of
	 *        records being returned for this page of data).
	 */
	public TablePage(List<T> data, long draw, long recordsTotal, long recordsFiltered) {
		super(data);
		this.draw = draw;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
	}

	public TablePage() {}

	private long draw;

	private long recordsTotal;

	private long recordsFiltered;

	@JsonInclude(Include.NON_EMPTY) // Do not include if there is no error!
	private String error;

	/**
	 * Returns the draw counter that this object is a response to - from the draw
	 * parameter sent as part of the data request. Note that it is strongly
	 * recommended for security reasons that you cast this parameter to an integer,
	 * rather than simply echoing back to the client what it sent in the draw
	 * parameter, in order to prevent Cross Site Scripting (XSS) attacks.
	 *
	 * @return the draw counter.
	 */
	public long getDraw() {
		return draw;
	}

	/**
	 * Sets the draw counter that this object is a response to - from the draw
	 * parameter sent as part of the data request. Note that it is strongly
	 * recommended for security reasons that you cast this parameter to an integer,
	 * rather than simply echoing back to the client what it sent in the draw
	 * parameter, in order to prevent Cross Site Scripting (XSS) attacks.
	 * 
	 * @param draw the draw counter.
	 */
	public void setDraw(long draw) {
		this.draw = draw;
	}

	/**
	 * Returns the total record count before filtering (i.e. the total number of
	 * records in the database).
	 *
	 * @return total records before filtering.
	 */
	public long getRecordsTotal() {
		return recordsTotal;
	}

	/**
	 * Sets the total record count before filtering (i.e. the total number of
	 * records in the database).
	 * 
	 * @param recordsTotal total records before filtering.
	 */
	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	/**
	 * Returns the total record count after filtering (i.e. the total number of
	 * records after filtering has been applied - not just the number of records
	 * being returned for this page of data).
	 *
	 * @return total records after filtering.
	 */
	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	/**
	 * Sets the total record count after filtering (i.e. the total number of records
	 * after filtering has been applied - not just the number of records being
	 * returned for this page of data).
	 * 
	 * @param recordsFiltered total records after filtering.
	 */
	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	/**
	 * Optional: If an error occurs during the running of the server-side processing
	 * script, you can inform the user of this error by passing back the error
	 * message to be displayed using this parameter. Do not include if there is no
	 * error.
	 *
	 * @return the error message to be displayed.
	 */
	public String getError() {
		return error;
	}

	/**
	 * Optional: If an error occurs during the running of the server-side processing
	 * script, you can inform the user of this error by passing back the error
	 * message to be displayed using this parameter. Do not include if there is no
	 * error.
	 *
	 * @param error the error message to be displayed.
	 */
	public void setError(String error) {
		this.error = error;
	}

}
