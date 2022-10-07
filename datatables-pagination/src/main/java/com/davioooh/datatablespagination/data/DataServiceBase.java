package com.davioooh.datatablespagination.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.davioooh.datatablespagination.model.PaginationCriteria;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class DataServiceBase<T> implements TableDataService<Map<String, String>> {

	private static final Logger log = LoggerFactory.getLogger(DataServiceBase.class);

	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public List<Map<String, String>> getPageEntries(PaginationCriteria<?, ?> paginationCriteria) throws TableDataException {
		List<T> data = getData(paginationCriteria);
		log.debug("Table data retrieved...");

		List<Map<String, String>> records = new ArrayList<>(data.size());
		try {
			data.forEach(i -> {
				Map<String, Object> m = objectMapper.convertValue(i, Map.class);
				records.add(m.entrySet().stream().collect(Collectors.toMap(Entry::getKey, v -> v.getValue().toString())));
			});
			log.debug("Data map generated...");
		}
		catch (Exception e) {
			throw new TableDataException("Error fetching page entries", e);
		}
		return records;
	}

	protected abstract List<T> getData(PaginationCriteria<?, ?> paginationCriteria) throws TableDataException;

}
