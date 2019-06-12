package com.shenyangligong.laolian.schoolJobData.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenyangligong.laolian.schoolJobData.dto.SchoolReqDto;
import com.shenyangligong.laolian.schoolJobData.service.SchoolDataService;

/**
 * @ClassName: DataController
 * @Description: TODO(校园招聘职位数据控制层)
 * @author Administrator
 * @date 2019年5月12日
 */
@CrossOrigin
@RestController
@RequestMapping("/school")
public class SchoolDataController {
	
	/**
	 * @Fields TODO(调用业务层)
	 */
	@Autowired
	private SchoolDataService service;

	@GetMapping("jobs") 
	public Map<String, Object> getData(SchoolReqDto dto){
		return service.findDataByDto(dto);	
	}
	
}
