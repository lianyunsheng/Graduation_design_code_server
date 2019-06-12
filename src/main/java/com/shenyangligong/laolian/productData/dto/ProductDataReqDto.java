package com.shenyangligong.laolian.productData.dto;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ProductDataReqDto
 * @Description: TODO(该DTO封装产品数据请求参数)
 * @author Administrator
 * @date 2019年5月29日
 */
@Component
public class ProductDataReqDto {
	
	/**
	 * @Fields TODO(产品类别)
	 */
	private String keyword;
	
	/**
	 * @Fields TODO(产品名称)
	 */
	private String productName;
	
	/**
	 * @Fields TODO(页码)
	 */
	private Integer page;
	
	/**
	 * @Fields TODO(每页显示条数)
	 */
	private Integer pageSize;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "ProductDataReqDto [keyword=" + keyword + ", productName=" + productName + ", page=" + page
				+ ", pageSize=" + pageSize + "]";
	}
	
}
