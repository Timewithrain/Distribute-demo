package org.watermelon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.watermelon.api.entity.Dept;
import org.watermelon.mapper.DeptMapper;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept queryDeptById(int Id) {
        return deptMapper.queryDeptById(Id);
    }

    public List<Dept> listAll() {
        return deptMapper.listAll();
    }

}
