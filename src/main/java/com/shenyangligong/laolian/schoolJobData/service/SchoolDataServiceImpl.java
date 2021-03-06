package com.shenyangligong.laolian.schoolJobData.service;

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

import com.shenyangligong.laolian.schoolJobData.dto.SchoolReqDto;
import com.shenyangligong.laolian.schoolJobData.dto.SchoolResDto;
import com.shenyangligong.laolian.schoolJobData.entity.SchoolDataEntity;
import com.shenyangligong.laolian.schoolJobData.repository.SchoolDataRepository;

/**
 * @ClassName: DataServiceImpl
 * @Description: TODO(业务层接口实现类)
 * @author Administrator
 * @date 2019年5月12日
 */
@Service
public class SchoolDataServiceImpl implements SchoolDataService {
	
	/**
	 * @Fields TODO(调用数据访问层)
	 */
	@Autowired
	private SchoolDataRepository repo;
	
	@Override
	public Map<String, Object> findDataByDto(SchoolReqDto dto) {
		Pageable pageable = PageRequest.of(dto.getCurrent()-1, dto.getPageSize(), Sort.Direction.DESC, "createTime");
		Page<SchoolDataEntity> page=repo.findAll(new Specification<SchoolDataEntity>() {

			/**
			 * @Fields TODO(版本号)
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<SchoolDataEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<Predicate>();
                if(dto.getJob()!=null && dto.getJob()!=""){
                    list.add(criteriaBuilder.like(root.get("job").as(String.class), "%"+dto.getJob()+"%"));
                }
                if(dto.getLocation()!=null && dto.getLocation()!=""){
                    list.add(criteriaBuilder.equal(root.get("location").as(String.class), dto.getLocation()));
                }
                if(dto.getType()!=null && dto.getType()!=""){
                    list.add(criteriaBuilder.equal(root.get("type").as(String.class), dto.getType()));
                }
                if(dto.getDepartment()!=null && dto.getDepartment()!=""){
                    list.add(criteriaBuilder.equal(root.get("department").as(String.class), dto.getDepartment()));
                }
                Predicate[] p = new Predicate[list.size()];
                query.where(criteriaBuilder.and(list.toArray(p)));
                return query.getRestriction();

			}
		}, pageable);
		//把查询到的数据封装到DTO里面去
		List<SchoolResDto> resDtoList=new ArrayList<SchoolResDto>();
		for(SchoolDataEntity item : page.getContent()) {
			SchoolResDto resDto=new SchoolResDto();
			resDto.setJob(item.getJob());
			resDto.setLocation(item.getLocation());
			resDto.setType(item.getType());
			resDto.setCreateTime(new SimpleDateFormat("yyyy年MM月dd日").format(item.getCreateTime()));
			resDto.setDepartment(item.getDepartment());
			resDto.setResponsibilities(item.getResponsibilities().split("&"));
			resDto.setQualifications(item.getQualifications().split("&"));
			resDtoList.add(resDto);
		}
		//把结果封装到Map对象里面，返回给客户端
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", page.getTotalElements());
		map.put("data", resDtoList);
		return map;
	}

}
