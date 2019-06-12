package com.shenyangligong.laolian.newsData.dto;

import org.springframework.stereotype.Component;

/**
 * @ClassName: NewsDataReqDto
 * @Description: TODO(该DTO封装新闻数据请求参数)
 * @author Administrator
 * @date 2019年5月26日
 */
@Component
public class NewsDataReqDto {
	
	/**
	 * @Fields TODO(页数)
	 */
	private Integer page;
	
	/**
	 * @Fields TODO(每页显示的条数)
	 */
	private Integer pageSize;
	
	/**
	 * @Fields TODO(起始时间)
	 */
	private String startTime;
	
	/**
	 * @Fields TODO(结束时间)
	 */
	private String endTime;
	
	/**
	 * @Fields TODO(新闻标题)
	 */
	private String keyword;

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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "NewsDataReqDto [page=" + page + ", pageSize=" + pageSize + ", startTime=" + startTime + ", endTime="
				+ endTime + ", keyword=" + keyword + "]";
	}
	
}
