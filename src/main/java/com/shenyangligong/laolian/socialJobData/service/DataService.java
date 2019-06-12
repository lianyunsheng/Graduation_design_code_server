package com.shenyangligong.laolian.socialJobData.service;

import java.util.Map;

import com.shenyangligong.laolian.socialJobData.dto.ReqDto;

/**
 * @ClassName: DataService
 * @Description: TODO(业务层接口)
 * @author Administrator
 * @date 2019年5月12日
 */
public interface DataService {
	/**
	 * @Title: findDataByDto
	 * @Description: TODO(根据请求参数获取社会招聘职位信息)
	 * @param dto
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> findDataByDto(ReqDto dto);
}
