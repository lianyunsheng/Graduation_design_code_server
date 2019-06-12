package com.shenyangligong.laolian.newsData.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.shenyangligong.laolian.newsData.dto.NewsDataReqDto;
import com.shenyangligong.laolian.newsData.dto.NewsDataResDto;
import com.shenyangligong.laolian.newsData.entity.NewsData;
import com.shenyangligong.laolian.newsData.repository.NewsRepository;

@Service
public class NewsDataServiceImpl implements NewsDataService{

	/**
	 * @Fields TODO(调用数据访问层)
	 */
	@Autowired
	private NewsRepository repo;
	
	@Override
	public Map<String, Object> getData(NewsDataReqDto dto) {
		Pageable pageable = PageRequest.of(dto.getPage()-1, dto.getPageSize(), Sort.Direction.DESC, "createTime");
		Page<NewsData> page=repo.findAll(new Specification<NewsData>() {

			/**
			 * @Fields TODO(版本号)
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<NewsData> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<Predicate>();
                try {
                	if(dto.getKeyword()!=null && dto.getKeyword()!=""){
                        list.add(criteriaBuilder.like(root.get("title").as(String.class), "%"+dto.getKeyword()+"%"));
                    }
                    if(dto.getStartTime()!=null && dto.getStartTime()!="" && dto.getEndTime()!=null && dto.getEndTime()!=""){
                        list.add(criteriaBuilder.between(root.get("createTime").as(Date.class),
                        		new SimpleDateFormat("yyyy/MM/dd").parse(dto.getStartTime()),
                        		new SimpleDateFormat("yyyy/MM/dd").parse(dto.getEndTime())));
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
                Predicate[] p = new Predicate[list.size()];
                query.where(criteriaBuilder.and(list.toArray(p)));
                return query.getRestriction();
			}
		}, pageable);
		//把查询到的数据封装到DTO里面去
		List<NewsDataResDto> resDtoList=new ArrayList<NewsDataResDto>();
		for(NewsData item : page.getContent()) {
			NewsDataResDto resDto=new NewsDataResDto();
			resDto.setTitle(item.getTitle());
			resDto.setContent(item.getContent().split("&"));
			resDto.setCreateTime(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(item.getCreateTime()));
			resDto.setImageUrl(item.getImageUrl());
			resDtoList.add(resDto);
		}
		//把结果封装到Map对象里面，返回给客户端
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", page.getTotalElements());
		map.put("data", resDtoList);
		return map;
	}

}
