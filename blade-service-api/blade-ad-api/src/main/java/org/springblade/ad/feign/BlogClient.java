package org.springblade.ad.feign;

import org.springblade.ad.entity.Blog;
import org.springblade.common.constant.CommonConstant;
import org.springblade.core.tool.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liu
 * @date 2021/10/7 2:16 下午
 */
@FeignClient(value = CommonConstant.APPLICATION_AD_NAME, fallback = BlogClientFallback.class)
public interface BlogClient {

	String API_PREFIX = "/api/ad";

	@GetMapping(API_PREFIX + "/detail")
	R<Blog> detail(@RequestParam Integer id);

}
