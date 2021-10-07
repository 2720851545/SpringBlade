package org.springblade.ad.feign;

import org.springblade.ad.entity.Blog;
import org.springblade.core.tool.api.R;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author liu
 * @date 2021/10/7 2:48 下午
 */
@Component
public class BlogClientFallback implements BlogClient {

	@Override
	public R<Blog> detail(Integer id) {
		Blog blog = new Blog();
		blog.setBlogTitle("Hystrix");
		blog.setBlogContent("FallBack Success");
		blog.setBlogDate(LocalDateTime.now());
		blog.setIsDeleted(0);
		return R.data(blog);
	}

}
