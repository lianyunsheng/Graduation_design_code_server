package com.shenyangligong.laolian.productData.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.shenyangligong.laolian.productData.dao.ProductDataRepository;
import com.shenyangligong.laolian.productData.dto.ProductDataReqDto;
import com.shenyangligong.laolian.productData.dto.ProductDataResDto;
import com.shenyangligong.laolian.productData.entity.ProductData;

/**
 * @ClassName: ProductDataServiceImpl
 * @Description: TODO(业务层接口实现类)
 * @author Administrator
 * @date 2019年5月29日
 */
@Service
public class ProductDataServiceImpl implements ProductDataService{

	/**
	 * @Fields TODO(调用数据访问层)
	 */
	@Autowired
	private ProductDataRepository repo;
	
	@Override
	public Map<String, Object> getDataBy(ProductDataReqDto dto) {
		
		Pageable pageable = PageRequest.of(dto.getPage()-1, dto.getPageSize(), Sort.Direction.DESC, "createTime");
		Page<ProductData> page=repo.findAll(new Specification<ProductData>() {

			/**
			 * @Fields TODO(版本号)
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<ProductData> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<Predicate>();
                try {
                	if(dto.getProductName()!=null && dto.getProductName()!=""){
                        list.add(criteriaBuilder.like(root.get("productName").as(String.class), "%"+dto.getProductName()+"%"));
                    }
                    if(dto.getKeyword()!=null && dto.getKeyword()!=""){
                        list.add(criteriaBuilder.equal(root.get("keyword").as(String.class),dto.getKeyword()));
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
		List<ProductDataResDto> resDtoList=new ArrayList<ProductDataResDto>();
		for(ProductData item : page.getContent()) {
			ProductDataResDto resDto=new ProductDataResDto();
			resDto.setBrand(item.getBrand());
			resDto.setCreateTime(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(item.getCreateTime()));
			resDto.setDescription(item.getDescription());
			resDto.setImageUrl(item.getImageUrl());
			resDto.setMaterial(item.getMaterial());
			resDto.setModel(item.getModel());
			resDto.setProductName(item.getProductName());
			resDto.setSpecification(item.getSpecification());
			resDto.setSuitableMachine(item.getSuitableMachine());
			resDtoList.add(resDto);
		}
		//把结果封装到Map对象里面，返回给客户端
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", page.getTotalElements());
		map.put("data", resDtoList);
		return map;
	}
}
