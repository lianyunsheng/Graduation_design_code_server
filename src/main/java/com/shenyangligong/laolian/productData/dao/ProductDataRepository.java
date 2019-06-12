package com.shenyangligong.laolian.productData.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.shenyangligong.laolian.productData.entity.ProductData;

/**
 * @ClassName: ProductDataRepository
 * @Description: TODO(数据访问层)
 * @author Administrator
 * @date 2019年5月28日
 */
@Repository
public interface ProductDataRepository extends JpaRepository<ProductData, Long>, JpaSpecificationExecutor<ProductData> {
	//
}
