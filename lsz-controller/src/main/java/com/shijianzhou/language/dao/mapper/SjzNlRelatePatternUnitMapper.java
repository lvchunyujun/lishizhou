package com.shijianzhou.language.dao.mapper;

import com.shijianzhou.language.domain.SjzNlRelatePatternUnit;
import com.shijianzhou.language.domain.SjzNlRelatePatternUnitExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SjzNlRelatePatternUnitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @SelectProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="countByExample")
    int countByExample(SjzNlRelatePatternUnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @DeleteProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="deleteByExample")
    int deleteByExample(SjzNlRelatePatternUnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @Delete({
        "delete from sjz_nl_relate_pattern_unit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @Insert({
        "insert into sjz_nl_relate_pattern_unit (id, patternName, ",
        "unitSerialNo, regExpCode, ",
        "regExpPattern, relateType, ",
        "createTime, lastUpdateTime, ",
        "descript, useStatus)",
        "values (#{id,jdbcType=INTEGER}, #{patternName,jdbcType=VARCHAR}, ",
        "#{unitSerialNo,jdbcType=INTEGER}, #{regExpCode,jdbcType=VARCHAR}, ",
        "#{regExpPattern,jdbcType=VARCHAR}, #{relateType,jdbcType=SMALLINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{descript,jdbcType=VARCHAR}, #{useStatus,jdbcType=SMALLINT})"
    })
    int insert(SjzNlRelatePatternUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @InsertProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="insertSelective")
    int insertSelective(SjzNlRelatePatternUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @SelectProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
        @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
        @Result(column="regExpCode", property="regExpCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="regExpPattern", property="regExpPattern", jdbcType=JdbcType.VARCHAR),
        @Result(column="relateType", property="relateType", jdbcType=JdbcType.SMALLINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
        @Result(column="useStatus", property="useStatus", jdbcType=JdbcType.SMALLINT)
    })
    List<SjzNlRelatePatternUnit> selectByExample(SjzNlRelatePatternUnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @Select({
        "select",
        "id, patternName, unitSerialNo, regExpCode, regExpPattern, relateType, createTime, ",
        "lastUpdateTime, descript, useStatus",
        "from sjz_nl_relate_pattern_unit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
        @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
        @Result(column="regExpCode", property="regExpCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="regExpPattern", property="regExpPattern", jdbcType=JdbcType.VARCHAR),
        @Result(column="relateType", property="relateType", jdbcType=JdbcType.SMALLINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
        @Result(column="useStatus", property="useStatus", jdbcType=JdbcType.SMALLINT)
    })
    SjzNlRelatePatternUnit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @UpdateProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SjzNlRelatePatternUnit record, @Param("example") SjzNlRelatePatternUnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @UpdateProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SjzNlRelatePatternUnit record, @Param("example") SjzNlRelatePatternUnitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @UpdateProvider(type=SjzNlRelatePatternUnitSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SjzNlRelatePatternUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_relate_pattern_unit
     *
     * @mbggenerated Fri Oct 04 21:29:50 CST 2019
     */
    @Update({
        "update sjz_nl_relate_pattern_unit",
        "set patternName = #{patternName,jdbcType=VARCHAR},",
          "unitSerialNo = #{unitSerialNo,jdbcType=INTEGER},",
          "regExpCode = #{regExpCode,jdbcType=VARCHAR},",
          "regExpPattern = #{regExpPattern,jdbcType=VARCHAR},",
          "relateType = #{relateType,jdbcType=SMALLINT},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "lastUpdateTime = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "descript = #{descript,jdbcType=VARCHAR},",
          "useStatus = #{useStatus,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SjzNlRelatePatternUnit record);

    @Select("select count(*) from sjz_nl_relate_pattern_unit ")
    int selectCountByAll();

    @Select({
            "select",
            "id, patternName, unitSerialNo, regExpCode, regExpPattern, relateType, createTime, ",
            "lastUpdateTime, descript, useStatus",
            "from sjz_nl_relate_pattern_unit",
            " order by id desc ",
            " limit #{offset},#{pagesize} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
            @Result(column="unitSerialNo", property="unitSerialNo", jdbcType=JdbcType.INTEGER),
            @Result(column="regExpCode", property="regExpCode", jdbcType=JdbcType.VARCHAR),
            @Result(column="regExpPattern", property="regExpPattern", jdbcType=JdbcType.VARCHAR),
            @Result(column="relateType", property="relateType", jdbcType=JdbcType.SMALLINT),
            @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
            @Result(column="useStatus", property="useStatus", jdbcType=JdbcType.SMALLINT)
    })
    List<SjzNlRelatePatternUnit> selectListByPaging(@Param("offset") int offset, @Param("pagesize")  int pageSize);

    @Select({" select rpu.patternName,rpu.useStatus from sjz_nl_relate_pattern_unit rpu group by rpu.patternName,rpu.useStatus "})
    @Results({
            @Result(column="patternName", property="patternName", jdbcType=JdbcType.VARCHAR),
            @Result(column="useStatus", property="useStatus", jdbcType=JdbcType.SMALLINT)
    })
    List<Map<String,Object>> selectGroupByPatternName();
}