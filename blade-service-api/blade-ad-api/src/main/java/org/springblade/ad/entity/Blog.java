package org.springblade.ad.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author liu
 * @date 2021/9/30 5:20 下午
 */
@Data
@TableName("blade_blog")
public class Blog {

	@TableId(type = IdType.AUTO)
	private Integer id;
	private String blogTitle;
	private String blogContent;
	private LocalDateTime blogDate;
	private Integer isDeleted;


}
