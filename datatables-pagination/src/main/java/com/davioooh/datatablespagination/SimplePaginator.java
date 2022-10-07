package com.davioooh.datatablespagination;

import java.util.Map;

import com.davioooh.datatablespagination.data.TableDataException;
import com.davioooh.datatablespagination.data.TableDataService;
import com.davioooh.datatablespagination.model.PaginationCriteria;
import com.davioooh.datatablespagination.model.TablePage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimplePaginator implements TablePaginator<Map<String, String>> {

    private TableDataService dataService;

    public SimplePaginator(TableDataService dataService) {
        this.dataService = dataService;
    }

    @Override
	public TablePage<Map<String, String>> getPage(PaginationCriteria<?, ?> paginationCriteria) {
        TablePage<Map<String, String>> page = new TablePage<>();
        try {
            page = generatePage(paginationCriteria);
        } catch (TableDataException tde) {
            log.error("Error generating table page.", tde);
            page.setError("Error generating table page.");
        }
        return page;
    }

	protected TablePage<Map<String, String>> generatePage(PaginationCriteria<?, ?> paginationCriteria) throws TableDataException {
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
