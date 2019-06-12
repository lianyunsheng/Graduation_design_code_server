package com.shenyangligong.laolian.newsData.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: NewsData
 * @Description: TODO(新闻数据实体类)
 * @author Administrator
 * @date 2019年5月26日
 */
@Entity
@Table(name="news_datas")
public class NewsData implements Serializable{
	
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
	 * @Fields TODO(新闻标题)
	 */
	private String title;
	
	/**
	 * @Fields TODO(新闻正文)
	 */
	private String content;
	
	/**
	 * @Fields TODO(新闻创建时间)
	 */
	@Column(name="create_time")
	private Date createTime;
	
	/**
	 * @Fields TODO(新闻图片的URL地址)
	 */
	@Column(name="image_url")
	private String imageUrl;

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NewsData [recordId=" + recordId + ", title=" + title + ", content=" + content + ", createTime="
				+ createTime + ", imageUrl=" + imageUrl + "]";
	}

}
