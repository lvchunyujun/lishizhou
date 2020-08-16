package com.hexiaofei.sjzclient.dao.mapper;

import com.hexiaofei.sjzclient.domain.SjzEventIndex;
import com.hexiaofei.sjzclient.domain.SjzEventIndexExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SjzEventIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @SelectProvider(type=SjzEventIndexSqlProvider.class, method="countByExample")
    int countByExample(SjzEventIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @DeleteProvider(type=SjzEventIndexSqlProvider.class, method="deleteByExample")
    int deleteByExample(SjzEventIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @Delete({
        "delete from sjz_event_index",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @Insert({
        "insert into sjz_event_index (eventTime, ",
        "eventContent, eventType, ",
        "eventState, recordCreateTime)",
        "values (#{eventTime,jdbcType=TIMESTAMP}, ",
        "#{eventContent,jdbcType=VARCHAR}, #{eventType,jdbcType=TINYINT}, ",
        "#{eventState,jdbcType=TINYINT}, #{recordCreateTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id")
    int insert(SjzEventIndex sjzEventIndex);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @InsertProvider(type=SjzEventIndexSqlProvider.class, method="insertSelective")
    int insertSelective(SjzEventIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @SelectProvider(type=SjzEventIndexSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
        @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
        @Result(column="recordCreateTime", property="recordCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SjzEventIndex> selectByExample(SjzEventIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @Select({
        "select",
        "id, eventTime, eventContent, eventType, eventState, recordCreateTime",
        "from sjz_event_index",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
        @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
        @Result(column="recordCreateTime", property="recordCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SjzEventIndex selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SjzEventIndex record, @Param("example") SjzEventIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SjzEventIndex record, @Param("example") SjzEventIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @UpdateProvider(type=SjzEventIndexSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SjzEventIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    @Update({
        "update sjz_event_index",
        "set eventTime = #{eventTime,jdbcType=TIMESTAMP},",
          "eventContent = #{eventContent,jdbcType=VARCHAR},",
          "eventType = #{eventType,jdbcType=TINYINT},",
          "eventState = #{eventState,jdbcType=TINYINT},",
          "recordCreateTime = #{recordCreateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SjzEventIndex record);

    @Select("select count(*) from sjz_event_index ")
    int selectCountByAll();

    @Select({
            " select",
            " id, eventTime, eventContent, eventType, eventState, recordCreateTime ",
            " from sjz_event_index ",
            " order by eventTime desc ",
            " limit #{offset},#{pagesize} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
            @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
            @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
            @Result(column="recordCreateTime", property="recordCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SjzEventIndex> selectListByPaging(@Param("offset") int offset, @Param("pagesize") int pageSize);

    @SelectProvider(type=SjzEventIndexSqlProvider.class, method="selectCountByObject")
    int selectCountByObject(Map<String,Object> map);

    @SelectProvider(type=SjzEventIndexSqlProvider.class, method="selectPagingListByObject")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="eventTime", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="eventContent", property="eventContent", jdbcType=JdbcType.VARCHAR),
            @Result(column="eventType", property="eventType", jdbcType=JdbcType.TINYINT),
            @Result(column="eventState", property="eventState", jdbcType=JdbcType.TINYINT),
            @Result(column="recordCreateTime", property="recordCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SjzEventIndex> selectPagingListByObject(Map<String,Object> map);



}