package org.springblade.ad.feign;

import lombok.AllArgsConstructor;
import org.springblade.ad.entity.Blog;
import org.springblade.ad.mapper.BlogMapper;
import org.springblade.core.tool.api.R;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liu
 * @date 2021/10/7 2:20 下午
 */
@RestController
@AllArgsConstructor
public class BlogClientImpl implements BlogClient {

	private BlogMapper blogMapper;

	@Override
	public R<Blog> detail(Integer id) {
		return R.data(blogMapper.selectById(id));
	}
}
