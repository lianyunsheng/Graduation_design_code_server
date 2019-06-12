package com.shenyangligong.laolian.schoolJobData.dto;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ResDto
 * @Description: TODO(该DTO封装响应数据)
 * @author Administrator
 * @date 2019年5月12日
 */
@Component
public class SchoolResDto {
	
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
	
	/**
	 * @Fields TODO(职位信息创建时间)
	 */
	private String createTime;
	
	/**
	 * @Fields TODO(工作职责)
	 */
	private String[] responsibilities;
	
	/**
	 * @Fields TODO(任职要求)
	 */
	private String[] qualifications;

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

	public String[] getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String[] responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String[] getQualifications() {
		return qualifications;
	}

	public void setQualifications(String[] qualifications) {
		this.qualifications = qualifications;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "SchoolResDto [job=" + job + ", location=" + location + ", type=" + type + ", department=" + department
				+ ", createTime=" + createTime + ", responsibilities=" + Arrays.toString(responsibilities)
				+ ", qualifications=" + Arrays.toString(qualifications) + "]";
	}
	
}
