package com.davioooh.paginationdemo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.davioooh.datatablespagination.SimplePaginator;
import com.davioooh.datatablespagination.TablePaginator;
import com.davioooh.datatablespagination.model.TablePage;
import com.davioooh.datatablespagination.model.urlencoded.PaginationCriteriaParams;

@Controller
@RequestMapping("/users")
public class UserController {

	private TablePaginator<Map<String, String>> paginator = new SimplePaginator(new UserTableRepository());

	@GetMapping("/data-urlencoded")
	public @ResponseBody TablePage<Map<String, String>> getUsersDataUrlEncoded(PaginationCriteriaParams treq) {
		return paginator.getPage(treq);
	}

	@PostMapping("/data-urlencoded")
	public @ResponseBody TablePage<Map<String, String>> postUsersDataUrlEncoded(PaginationCriteriaParams treq) {
		return paginator.getPage(treq);
	}

	@PostMapping("/data-json")
	public @ResponseBody TablePage<Map<String, String>> postUsersDataJson(@RequestBody PaginationCriteriaParams treq) {
		return paginator.getPage(treq);
	}

}
