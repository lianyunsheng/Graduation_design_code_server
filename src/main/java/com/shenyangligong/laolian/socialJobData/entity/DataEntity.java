package com.shenyangligong.laolian.socialJobData.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: DataEntity
 * @Description: TODO(社会招聘职位信息实体类)
 * @author Administrator
 * @date 2019年5月12日
 */
@Entity
@Table(name="social_job_datas")
public class DataEntity implements Serializable {

	/**
	 * @Fields TODO(版本号)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @Fields TODO(主键)
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="record_id")
	private Long recordId;
	
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
	 * @Fields TODO(创建时间)
	 */
	@Column(name="create_time")
	private Date createTime;
	
	/**
	 * @Fields TODO(职责)
	 */
	private String responsibilities;
	
	/**
	 * @Fields TODO(职位要求)
	 */
	private String qualifications;

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DataEntity [recordId=" + recordId + ", job=" + job + ", location=" + location + ", type=" + type
				+ ", department=" + department + ", createTime=" + createTime + ", responsibilities=" + responsibilities
				+ ", qualifications=" + qualifications + "]";
	}
	
}
