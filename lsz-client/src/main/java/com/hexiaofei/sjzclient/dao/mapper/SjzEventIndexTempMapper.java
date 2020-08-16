package com.hexiaofei.sjzclient.dao.mapper;

import com.hexiaofei.sjzclient.domain.SjzEventIndexTemp;
import com.hexiaofei.sjzclient.domain.SjzEventIndexTempExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SjzEventIndexTempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @SelectProvider(type=SjzEventIndexTempSqlProvider.class, method="countByExample")
    int countByExample(SjzEventIndexTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @DeleteProvider(type=SjzEventIndexTempSqlProvider.class, method="deleteByExample")
    int deleteByExample(SjzEventIndexTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @Delete({
        "delete from sjz_event_index_temp",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @Insert({
        "insert into sjz_event_index_temp (id, eventTime, ",
        "eventContent, eventType, ",
        "eventState, createTime, ",
        "patternName, unitSerialNo, ",
        "domainName)",
        "values (#{id,jdbcType=INTEGER}, #{eventTime,jdbcType=TIMESTAMP}, ",
        "#{eventContent,jdbcType=VARCHAR}, #{eventType,jdbcType=TINYINT}, ",
        "#{eventState,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{patternName,jdbcType=VARCHAR}, #{unitSerialNo,jdbcType=INTEGER}, ",
        "#{domainName,jdbcType=VARCHAR})"
    })
    int insert(SjzEventIndexTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @InsertProvider(type=SjzEventIndexTempSqlProvider.class, method="insertSelective")
    int insertSelective(SjzEventIndexTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @SelectProvider(type=SjzEventIndexTempSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
        @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
        @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
        @Result(column="domainName", property="domainName", jdbcType=JdbcType.VARCHAR)
    })
    List<SjzEventIndexTemp> selectByExample(SjzEventIndexTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @Select({
        "select",
        "id, eventTime, eventContent, eventType, eventState, createTime, patternName, ",
        "unitSerialNo, domainName",
        "from sjz_event_index_temp",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
        @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
        @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
        @Result(column="domainName", property="domainName", jdbcType=JdbcType.VARCHAR)
    })
    SjzEventIndexTemp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexTempSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SjzEventIndexTemp record, @Param("example") SjzEventIndexTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexTempSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SjzEventIndexTemp record, @Param("example") SjzEventIndexTempExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexTempSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SjzEventIndexTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index_temp
     *
     * @mbggenerated Fri Oct 04 21:47:35 CST 2019
     */
    @Update({
        "update sjz_event_index_temp",
        "set eventTime = #{eventTime,jdbcType=TIMESTAMP},",
          "eventContent = #{eventContent,jdbcType=VARCHAR},",
          "eventType = #{eventType,jdbcType=TINYINT},",
          "eventState = #{eventState,jdbcType=TINYINT},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "patternName = #{patternName,jdbcType=VARCHAR},",
          "unitSerialNo = #{unitSerialNo,jdbcType=INTEGER},",
          "domainName = #{domainName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SjzEventIndexTemp record);


    @Select("select count(*) from sjz_event_index_temp ")
    int selectCountByAll();

    @Select({
            " select",
            " id, eventTime, eventContent, eventType, eventState, createTime, patternName, ",
            " unitSerialNo, domainName",
            " from sjz_event_index_temp",
            " order by id desc ",
            " limit #{offset},#{pagesize} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
            @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
            @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
            @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
            @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
            @Result(column="domainName", property="domainName", jdbcType=JdbcType.VARCHAR)
    })
    List<SjzEventIndexTemp> selectListByPaging(@Param("offset") int offset, @Param("pagesize") int pageSize);
}