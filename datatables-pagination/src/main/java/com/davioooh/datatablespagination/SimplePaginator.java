package com.davioooh.datatablespagination;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.davioooh.datatablespagination.data.TableDataException;
import com.davioooh.datatablespagination.data.TableDataService;
import com.davioooh.datatablespagination.model.PaginationCriteria;
import com.davioooh.datatablespagination.model.TablePage;

public class SimplePaginator implements TablePaginator<Map<String, String>> {

	private static final Logger log = LoggerFactory.getLogger(SimplePaginator.class);

	private TableDataService<Map<String, String>> dataService;

	public SimplePaginator(TableDataService<Map<String, String>> dataService) {
		this.dataService = dataService;
	}

	@Override
	public TablePage<Map<String, String>> getPage(PaginationCriteria paginationCriteria) {
		TablePage<Map<String, String>> page = new TablePage<>();
		try {
			page = generatePage(paginationCriteria);
		}
		catch (TableDataException tde) {
			log.error("Error generating table page.", tde);
			page.setError("Error generating table page.");
		}
		return page;
	}

	protected TablePage<Map<String, String>> generatePage(PaginationCriteria paginationCriteria) throws TableDataException {
		TablePage<Map<String, String>> page = new TablePage<>();

		page.setDraw(paginationCriteria.getDraw());
		log.debug("Draw set...");

		page.setRecordsTotal(dataService.countTotalEntries());
		log.debug("RecordsTotal set...");

		page.setRecordsFiltered(dataService.countFilteredEntries(paginationCriteria));
		log.debug("RecordsFiltered set...");

		page.setData(dataService.getPageEntries(paginationCriteria));
		log.debug("Data set...");

		return page;
	}
}
