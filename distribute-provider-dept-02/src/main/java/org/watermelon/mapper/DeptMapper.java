package org.watermelon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.watermelon.api.entity.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept queryDeptById(int Id);

    List<Dept> listAll();
}