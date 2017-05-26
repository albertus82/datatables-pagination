package com.davioooh.datatablespagination;

/**
 * Basic implementation of the {@link FieldFormatter}.
 *
 * @author David Castelletti
 *
 */
public class BaseFieldFormatter implements FieldFormatter {

	@Override
	public String format(Object fieldValue) {
		return fieldValue.toString();
	}

}
