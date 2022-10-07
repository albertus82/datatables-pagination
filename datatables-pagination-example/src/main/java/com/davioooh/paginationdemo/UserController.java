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
import com.davioooh.datatablespagination.model.get.PaginationCriteriaParams;
import com.davioooh.datatablespagination.model.post.PaginationCriteriaBody;

@Controller
@RequestMapping
public class UserController {

	private TablePaginator<Map<String, String>> paginator = new SimplePaginator(new UserTableRepository());

	@GetMapping("/users/get")
	public String getUsersGet() {
		return "list-get";
	}

	@GetMapping("/users/post")
	public String getUsersPost() {
		return "list-post";
	}

	@GetMapping("/users/data")
	public @ResponseBody TablePage<Map<String, String>> getUsersData(PaginationCriteriaParams treq) {
		return paginator.getPage(treq);
	}

	@PostMapping("/users/data")
	public @ResponseBody TablePage<Map<String, String>> postUsersData(@RequestBody PaginationCriteriaBody treq) {
		return paginator.getPage(treq);
	}

}
