package com.shenyangligong.laolian.productData.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shenyangligong.laolian.productData.dto.ProductDataReqDto;
import com.shenyangligong.laolian.productData.service.ProductDataService;

/**
 * @ClassName: ProductDataController
 * @Description: TODO(产品数据访问控制层)
 * @author Administrator
 * @date 2019年5月28日
 */
@CrossOrigin
@RestController
@RequestMapping("products")
public class ProductDataController {
	
	/**
	 * @Fields TODO(调用业务层)
	 */
	@Autowired
	private ProductDataService service;
	
	@GetMapping("all")
	public Map<String, Object> getDataBy(ProductDataReqDto dto){
		return service.getDataBy(dto);
	}
	
}
