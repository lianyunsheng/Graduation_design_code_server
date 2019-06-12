package com.shenyangligong.laolian.newsData.dto;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * @ClassName: NewsDataResDto
 * @Description: TODO(该DTO封装新闻数据响应数据)
 * @author Administrator
 * @date 2019年5月26日
 */
@Component
public class NewsDataResDto {
	
	/**
	 * @Fields TODO(新闻标题)
	 */
	private String title;
	
	/**
	 * @Fields TODO(新闻正文，数组，里面的每一项代表一段内容)
	 */
	private String[] content;
	
	/**
	 * @Fields TODO(新闻创建时间)
	 */
	private String createTime;
	
	/**
	 * @Fields TODO(新闻图片的URL地址)
	 */
	private String imageUrl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "NewsDataResDto [title=" + title + ", content=" + Arrays.toString(content) + ", createTime=" + createTime
				+ ", imageUrl=" + imageUrl + "]";
	}
	
}
