package com.shenyangligong.laolian.schoolJobData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.shenyangligong.laolian.schoolJobData.entity.SchoolDataEntity;

/**
 * @ClassName: DataRepository
 * @Description: TODO(数据访问层)
 * @author Administrator
 * @date 2019年5月12日
 */
@Repository
public interface SchoolDataRepository extends JpaRepository<SchoolDataEntity, Long>,JpaSpecificationExecutor<SchoolDataEntity> {
	
}
