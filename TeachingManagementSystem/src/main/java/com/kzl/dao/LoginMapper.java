package com.kzl.dao;

import com.kzl.entity.ManageUser;
import com.kzl.entity.Student;
import com.kzl.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    ManageUser selectManageUser(ManageUser user);
//Mapper接口定义SQL操作(LoginMapper)
    Student selectStudent(Student user);

    Teacher selectTeacher(Teacher user);
}
