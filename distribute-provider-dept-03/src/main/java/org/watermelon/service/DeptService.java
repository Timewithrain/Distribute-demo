package org.watermelon.service;

import org.watermelon.api.entity.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryDeptById(int Id);

    List listAll();

}
