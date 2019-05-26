package com.evan.springcloud.mapper;

import com.evan.springcloud.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**  
    Created by IntelliJ IDEA
    * @author evan
    * @date 2019-05-26 12:04
    * @description  
    */
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}