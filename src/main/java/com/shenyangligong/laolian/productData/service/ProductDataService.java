package com.shenyangligong.laolian.productData.service;

import java.util.Map;

import com.shenyangligong.laolian.productData.dto.ProductDataReqDto;

/**
 * @ClassName: ProductDataService
 * @Description: TODO(业务层接口)
 * @author Administrator
 * @date 2019年5月29日
 */
public interface ProductDataService {

	/**
	 * @Title: getDataBy
	 * @Description: TODO(根据请求参数dto来查询数据)
	 * @param dto
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> getDataBy(ProductDataReqDto dto);
	
}
