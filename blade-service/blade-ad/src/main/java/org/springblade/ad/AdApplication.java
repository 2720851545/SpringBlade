package org.springblade.ad;

import org.springblade.common.constant.CommonConstant;
import org.springblade.core.cloud.client.BladeCloudApplication;
import org.springblade.core.launch.BladeApplication;

/**
 * @author liu
 * @date 2021/9/30 4:01 下午
 */
@BladeCloudApplication
public class AdApplication {

	public static void main(String[] args) {
		BladeApplication.run(CommonConstant.APPLICATION_AD_NAME, AdApplication.class, args);
	}

}
