package com.shenyangligong.laolian.schoolJobData.service;

import java.util.Map;

import com.shenyangligong.laolian.schoolJobData.dto.SchoolReqDto;

/**
 * @ClassName: DataService
 * @Description: TODO(业务层接口)
 * @author Administrator
 * @date 2019年5月12日
 */
public interface SchoolDataService {
	
	/**
	 * @Title: findDataByDto
	 * @Description: TODO(根据请求参数获取数据)
	 * @param dto
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> findDataByDto(SchoolReqDto dto);
}
