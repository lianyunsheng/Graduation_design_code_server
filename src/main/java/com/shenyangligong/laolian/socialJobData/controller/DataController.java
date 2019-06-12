package com.shenyangligong.laolian.socialJobData.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenyangligong.laolian.socialJobData.dto.ReqDto;
import com.shenyangligong.laolian.socialJobData.service.DataService;

/**
 * @ClassName: DataController
 * @Description: TODO(控制层)
 * @author Administrator
 * @date 2019年5月12日
 */
@CrossOrigin
@RestController
@RequestMapping("/social")
public class DataController {
	
	/**
	 * @Fields TODO(调用业务层)
	 */
	@Autowired
	private DataService service;
	
	@GetMapping("jobs") 
	public Map<String, Object> getData(ReqDto dto){
		return service.findDataByDto(dto);	
	}
	
}
