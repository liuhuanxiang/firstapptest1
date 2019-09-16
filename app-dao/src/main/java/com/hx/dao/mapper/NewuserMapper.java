package com.hx.dao.mapper;

import com.hx.dao.model.Newuser;
import com.hx.dao.model.NewuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewuserMapper {
    int countByExample(NewuserExample example);

    int deleteByExample(NewuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Newuser record);

    int insertSelective(Newuser record);

    List<Newuser> selectByExample(NewuserExample example);

    Newuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Newuser record, @Param("example") NewuserExample example);

    int updateByExample(@Param("record") Newuser record, @Param("example") NewuserExample example);

    int updateByPrimaryKeySelective(Newuser record);

    int updateByPrimaryKey(Newuser record);
}