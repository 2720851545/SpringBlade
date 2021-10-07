package org.springblade.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springblade.ad.entity.Blog;
import org.springblade.ad.mapper.BlogMapper;
import org.springblade.ad.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * @author liu
 * @date 2021/9/30 5:30 下午
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
}
