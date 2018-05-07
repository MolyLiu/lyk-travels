package com.lyk.travels.mapper;

import com.lyk.travels.model.Staff;
import org.apache.ibatis.annotations.*;

@Mapper
public interface staffMapper {


    @Select({"select * from staff where user_account=#{cltEmail} and user_password=#{password}"})
    @Results({
            @Result(property = "cltId", column = "clt_id"),
            @Result(property = "cltName", column = "clt_name"),
            @Result(property = "cltPassword", column = "clt_password"),
            @Result(property = "cltTel", column = "clt_tel"),
            @Result(property = "cltLoc", column = "clt_loc"),
            @Result(property = "cltLoc", column = "clt_loc"),
            @Result(property = "cltEmail", column = "clt_email")
    })
//    todo  todo
    public Staff staffLogin(@Param("")String cltEmail, @Param("password")String password);

}
