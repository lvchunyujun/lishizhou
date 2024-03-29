package com.hexiaofei.provider0.dao.mapper;

import com.hexiaofei.provider0.domain.LszTag;
import com.hexiaofei.provider0.domain.LszTagExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface LszTagMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    @Delete({
        "delete from lsz_tag",
        "where tagId = #{tagId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    @Insert({
        "insert into lsz_tag (recordId, ",
        "tagType, wordMetaCode, ",
        "wordMetaEn, wordMetaZh)",
        "values (#{recordId,jdbcType=INTEGER}, ",
        "#{tagType,jdbcType=VARCHAR}, #{wordMetaCode,jdbcType=INTEGER}, ",
        "#{wordMetaEn,jdbcType=CHAR}, #{wordMetaZh,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true, keyProperty="tagId")
    int insert(LszTag record);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    @Select({
        "select",
        "tagId, recordId, tagType, wordMetaCode, wordMetaEn, wordMetaZh",
        "from lsz_tag",
        "where tagId = #{tagId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="tagId", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="recordId", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="tagType", property="tagType", jdbcType=JdbcType.VARCHAR),
        @Result(column="wordMetaCode", property="wordMetaCode", jdbcType=JdbcType.INTEGER),
        @Result(column="wordMetaEn", property="wordMetaEn", jdbcType=JdbcType.CHAR),
        @Result(column="wordMetaZh", property="wordMetaZh", jdbcType=JdbcType.CHAR)
    })
    LszTag selectByPrimaryKey(Integer tagId);


    @Select({
            "select",
            "tagId, recordId, tagType, wordMetaCode, wordMetaEn, wordMetaZh",
            "from lsz_tag",
            "where recordId = #{recordId,jdbcType=INTEGER} and tagType = #{tagType,jdbcType=VARCHAR}"
    })
    LszTag selectByLszTag(LszTag lszTag);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    @Update({
        "update lsz_tag",
        "set recordId = #{recordId,jdbcType=INTEGER},",
          "tagType = #{tagType,jdbcType=VARCHAR},",
          "wordMetaCode = #{wordMetaCode,jdbcType=INTEGER},",
          "wordMetaEn = #{wordMetaEn,jdbcType=CHAR},",
          "wordMetaZh = #{wordMetaZh,jdbcType=CHAR}",
        "where tagId = #{tagId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LszTag record);
}