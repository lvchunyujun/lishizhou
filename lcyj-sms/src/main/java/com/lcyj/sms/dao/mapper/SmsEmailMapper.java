package com.lcyj.sms.dao.mapper;

import com.lcyj.sms.model.SmsEmail;
import com.lcyj.sms.model.SmsEmailExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmsEmailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @SelectProvider(type=SmsEmailSqlProvider.class, method="countByExample")
    int countByExample(SmsEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @DeleteProvider(type=SmsEmailSqlProvider.class, method="deleteByExample")
    int deleteByExample(SmsEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @Delete({
        "delete from sms_email",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @Insert({
        "insert into sms_email (id, smsUserId, ",
        "toEmail, platformId, ",
        "serverId, fromEmail, ",
        "emailType, subject, ",
        "content, enclosure, ",
        "sendStatus, createTime, ",
        "sendTime, sendCount, ",
        "lastUpdateTime)",
        "values (#{id,jdbcType=INTEGER}, #{smsUserId,jdbcType=VARCHAR}, ",
        "#{toEmail,jdbcType=VARCHAR}, #{platformId,jdbcType=VARCHAR}, ",
        "#{serverId,jdbcType=VARCHAR}, #{fromEmail,jdbcType=VARCHAR}, ",
        "#{emailType,jdbcType=VARCHAR}, #{subject,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{enclosure,jdbcType=VARCHAR}, ",
        "#{sendStatus,jdbcType=SMALLINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{sendTime,jdbcType=TIMESTAMP}, #{sendCount,jdbcType=INTEGER}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(SmsEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @InsertProvider(type=SmsEmailSqlProvider.class, method="insertSelective")
    int insertSelective(SmsEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @SelectProvider(type=SmsEmailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="smsUserId", property="smsUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="toEmail", property="toEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="platformId", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serverId", property="serverId", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromEmail", property="fromEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="emailType", property="emailType", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="enclosure", property="enclosure", jdbcType=JdbcType.VARCHAR),
        @Result(column="sendStatus", property="sendStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sendTime", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sendCount", property="sendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsEmail> selectByExample(SmsEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @Select({
        "select",
        "id, smsUserId, toEmail, platformId, serverId, fromEmail, emailType, subject, ",
        "content, enclosure, sendStatus, createTime, sendTime, sendCount, lastUpdateTime",
        "from sms_email",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="smsUserId", property="smsUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="toEmail", property="toEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="platformId", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="serverId", property="serverId", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromEmail", property="fromEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="emailType", property="emailType", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="enclosure", property="enclosure", jdbcType=JdbcType.VARCHAR),
        @Result(column="sendStatus", property="sendStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sendTime", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sendCount", property="sendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SmsEmail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @UpdateProvider(type=SmsEmailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SmsEmail record, @Param("example") SmsEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @UpdateProvider(type=SmsEmailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SmsEmail record, @Param("example") SmsEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @UpdateProvider(type=SmsEmailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SmsEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_email
     *
     * @mbggenerated Sat Feb 29 11:20:40 CST 2020
     */
    @Update({
        "update sms_email",
        "set smsUserId = #{smsUserId,jdbcType=VARCHAR},",
          "toEmail = #{toEmail,jdbcType=VARCHAR},",
          "platformId = #{platformId,jdbcType=VARCHAR},",
          "serverId = #{serverId,jdbcType=VARCHAR},",
          "fromEmail = #{fromEmail,jdbcType=VARCHAR},",
          "emailType = #{emailType,jdbcType=VARCHAR},",
          "subject = #{subject,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "enclosure = #{enclosure,jdbcType=VARCHAR},",
          "sendStatus = #{sendStatus,jdbcType=SMALLINT},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "sendTime = #{sendTime,jdbcType=TIMESTAMP},",
          "sendCount = #{sendCount,jdbcType=INTEGER},",
          "lastUpdateTime = #{lastUpdateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SmsEmail record);

    @Select(" select count(*) from sms_email ")
    int selectCountByAll();

    @Select({
            " select",
            " id, smsUserId, toEmail, platformId, serverId, fromEmail, emailType, subject, ",
            " content, enclosure, sendStatus, createTime, sendTime, sendCount, lastUpdateTime",
            " from sms_email",
            " limit #{offset},#{pagesize} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="smsUserId", property="smsUserId", jdbcType=JdbcType.VARCHAR),
            @Result(column="toEmail", property="toEmail", jdbcType=JdbcType.VARCHAR),
            @Result(column="platformId", property="platformId", jdbcType=JdbcType.VARCHAR),
            @Result(column="serverId", property="serverId", jdbcType=JdbcType.VARCHAR),
            @Result(column="fromEmail", property="fromEmail", jdbcType=JdbcType.VARCHAR),
            @Result(column="emailType", property="emailType", jdbcType=JdbcType.VARCHAR),
            @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
            @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
            @Result(column="enclosure", property="enclosure", jdbcType=JdbcType.VARCHAR),
            @Result(column="sendStatus", property="sendStatus", jdbcType=JdbcType.SMALLINT),
            @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="sendTime", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="sendCount", property="sendCount", jdbcType=JdbcType.INTEGER),
            @Result(column="lastUpdateTime", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsEmail> selectListByPaging(@Param("offset") int offset, @Param("pagesize")  int pageSize);
}