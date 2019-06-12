package com.shenyangligong.laolian.schoolJobData.dto;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ReqDto
 * @Description: TODO(该DTO封装请求参数)
 * @author Administrator
 * @date 2019年5月12日
 */
@Component
public class SchoolReqDto {
	
	/**
	 * @Fields TODO(当前页)
	 */
	private Integer current;
	
	/**
	 * @Fields TODO(每页的数据条数)
	 */
	private Integer pageSize;
	
	/**
	 * @Fields TODO(职位名称)
	 */
	private String job;
	
	/**
	 * @Fields TODO(工作地点)
	 */
	private String location;
	
	/**
	 * @Fields TODO(职能类型)
	 */
	private String type;
	
	/**
	 * @Fields TODO(部门)
	 */
	private String department;

	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "SchoolReqDto [current=" + current + ", pageSize=" + pageSize + ", job=" + job + ", location=" + location
				+ ", type=" + type + ", department=" + department + "]";
	}
	
}
