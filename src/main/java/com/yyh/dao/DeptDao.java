package com.yyh.dao;

import com.yyh.po.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-01-15:14
 */
@Mapper
@Repository
public interface DeptDao {
    @Select("select * from dept")
    List<Dept> selectAll();
}
