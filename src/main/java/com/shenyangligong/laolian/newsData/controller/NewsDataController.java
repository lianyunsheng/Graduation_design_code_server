package com.shenyangligong.laolian.newsData.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenyangligong.laolian.newsData.dto.NewsDataReqDto;
import com.shenyangligong.laolian.newsData.service.NewsDataService;

/**
 * @ClassName: NewsDataController
 * @Description: TODO(新闻数据控制层)
 * @author Administrator
 * @date 2019年5月26日
 */
@CrossOrigin
@RestController
@RequestMapping("/news")
public class NewsDataController {
	
	/**
	 * @Fields TODO(调用业务层)
	 */
	@Autowired
	private NewsDataService service;
	
	@GetMapping("all")
	public Map<String, Object> putData(NewsDataReqDto dto) {
		return service.getData(dto);
	}	

}
