package com.shenyangligong.laolian.productData.dto;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ProductDataResDto
 * @Description: TODO(该DTO封装产品数据响应数据)
 * @author Administrator
 * @date 2019年5月29日
 */
@Component
public class ProductDataResDto {
	
	/**
	 * @Fields TODO(产品名称)
	 */
	private String productName;
	
	/**
	 * @Fields TODO(品牌)
	 */
	private String brand;
	
	/**
	 * @Fields TODO(型号)
	 */
	private String model;
	
	/**
	 * @Fields TODO(规格)
	 */
	private String specification;
	
	/**
	 * @Fields TODO(材质)
	 */
	private String material;
	
	/**
	 * @Fields TODO(适用机床)
	 */
	private String suitableMachine;
	
	/**
	 * @Fields TODO(产品描述)
	 */
	private String description;
	
	/**
	 * @Fields TODO(产品图片的URL地址)
	 */
	private String imageUrl;
	
	/**
	 * @Fields TODO(产品数据创建时间)
	 */
	private String createTime;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSuitableMachine() {
		return suitableMachine;
	}

	public void setSuitableMachine(String suitableMachine) {
		this.suitableMachine = suitableMachine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ProductDataResDto [productName=" + productName + ", brand=" + brand + ", model=" + model
				+ ", specification=" + specification + ", material=" + material + ", suitableMachine=" + suitableMachine
				+ ", description=" + description + ", imageUrl=" + imageUrl + ", createTime=" + createTime + "]";
	}
		
}
