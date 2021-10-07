package org.springblade.ad.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.springblade.ad.entity.Blog;
import org.springblade.ad.service.BlogService;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

/**
 * @author liu
 * @date 2021/9/30 4:21 下午
 */
@RestController()
@RequestMapping("api")
@Slf4j
public class DemoController {

	@Autowired
	private BlogService blogService;

	@Cacheable(cacheNames = "demo-info", key = "#name")
	@RequestMapping("hello")
	public String hello(String name) {
		log.info("本条信息没有从缓存获取");
		return "My Name:" + name;
	}

	@RequestMapping("save")
	public R save(@RequestBody Blog blog) {
		return R.status(blogService.save(blog));
	}

	@PostMapping("update")
	public R update(@RequestBody Blog blog) {
		return R.status(blogService.updateById(blog));
	}

	@PostMapping("remove")
	public R update(@RequestParam String ids) {
		return R.status(blogService.removeByIds(Func.toIntList(ids)));
	}

	@GetMapping("detail")
	public R detail(Integer id) {
		return R.data(blogService.getById(id));
	}

	@GetMapping("list")
	public R list(Blog blog, Query query) {
		return R.data(blogService.page(Condition.getPage(query), Condition.getQueryWrapper(blog)));
	}

}
