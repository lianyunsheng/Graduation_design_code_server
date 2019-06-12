package com.shenyangligong.laolian.newsData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.shenyangligong.laolian.newsData.entity.NewsData;

/**
 * @ClassName: NewsRepository
 * @Description: TODO(数据访问层)
 * @author Administrator
 * @date 2019年5月26日
 */
@Repository
public interface NewsRepository extends JpaRepository<NewsData, Long>, JpaSpecificationExecutor<NewsData> {
	//有隐藏方法
}
