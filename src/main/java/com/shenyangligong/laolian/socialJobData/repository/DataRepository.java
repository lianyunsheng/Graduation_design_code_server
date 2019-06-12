package com.shenyangligong.laolian.socialJobData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.shenyangligong.laolian.socialJobData.entity.DataEntity;

/**
 * @ClassName: DataRepository
 * @Description: TODO(数据访问层)
 * @author Administrator
 * @date 2019年5月12日
 */
@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long>,JpaSpecificationExecutor<DataEntity> {
	
}
