package com.shenyangligong.laolian.productData.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: productData
 * @Description: TODO(产品数据实体类)
 * @author Administrator
 * @date 2019年5月28日
 */
@Entity
@Table(name="product_datas")
public class ProductData implements Serializable{
	
	/**
	 * @Fields TODO(版本号)
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @Fields TODO(主键id)
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="record_id")
	private Long recordId;
	
	/**
	 * @Fields TODO(产品名称)
	 */
	@Column(name="product_name")
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
	@Column(name="suitable_machine")
	private String suitableMachine;
	
	/**
	 * @Fields TODO(描述)
	 */
	private String description;
	
	/**
	 * @Fields TODO(图片链接)
	 */
	@Column(name="image_url")
	private String imageUrl;
	
	/**
	 * @Fields TODO(创建时间)
	 */
	@Column(name="create_time")
	private Date createTime;

	/**
	 * @Fields TODO(关键字)
	 */
	private String keyword;
	
	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "ProductData [recordId=" + recordId + ", productName=" + productName + ", brand=" + brand + ", model="
				+ model + ", specification=" + specification + ", material=" + material + ", suitableMachine="
				+ suitableMachine + ", description=" + description + ", imageUrl=" + imageUrl + ", createTime="
				+ createTime + ", keyword=" + keyword + "]";
	}
		
}
