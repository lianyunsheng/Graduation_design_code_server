package com.shenyangligong.laolian.newsData.service;

import java.util.Map;

import com.shenyangligong.laolian.newsData.dto.NewsDataReqDto;

/**
 * @ClassName: NewsDataService
 * @Description: TODO(业务层接口)
 * @author Administrator
 * @date 2019年5月26日
 */
public interface NewsDataService {
	
	/**
	 * @Title: getData
	 * @Description: TODO(通过请求参数获取新闻数据)
	 * @param dto
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> getData(NewsDataReqDto dto);
}
