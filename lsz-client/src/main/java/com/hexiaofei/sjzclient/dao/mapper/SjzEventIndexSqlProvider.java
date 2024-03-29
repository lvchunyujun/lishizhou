package com.hexiaofei.sjzclient.dao.mapper;


import com.hexiaofei.sjzclient.domain.LszTag;
import com.hexiaofei.sjzclient.domain.SjzEventIndex;
import com.hexiaofei.sjzclient.domain.SjzEventIndexExample;
import com.hexiaofei.sjzclient.domain.SjzEventIndexExample.Criteria;
import com.hexiaofei.sjzclient.domain.SjzEventIndexExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class SjzEventIndexSqlProvider {

    public String selectCountByLszTag(Map<String,Object>  map){
        StringBuilder sql = new StringBuilder();

        SjzEventIndex sjzEventIndex = (SjzEventIndex)map.get("sjzEventIndex");
        LszTag lszTag = (LszTag)map.get("lszTag");

        Integer authorId = (Integer)map.get("authorId");

        sql.append(" select count(*) from sjz_event_index sei ");
        sql.append(" left join lsz_tag lt on sei.id = lt.recordId and lt.tagType = 'event' ");
        sql.append(" where 1=1 ");

        // 事件标签
        if(lszTag != null && lszTag.getWordMetaCode() != null){
            sql.append(" and lt.wordMetaCode = #{lszTag.wordMetaCode} ");
        }
        if(sjzEventIndex!=null && sjzEventIndex.getEventState() != null){
            sql.append(" and sei.eventState = #{sjzEventIndex.eventState,jdbcType=TINYINT} ");
        }

        if(authorId!=null){
            sql.append(" and exists (select 1 from sjz_event_author sea where sea.userId = #{authorId,jdbcType=INTEGER} and sea.eventIndexId= sei.id)");
        }

        return sql.toString();
    }
    /**
     * 分页查询列表
     * @param map 条件
     * @return
     */
    public String selectPagingListByLszTag(Map<String,Object>  map){
        StringBuilder sql = new StringBuilder();

        SjzEventIndex sjzEventIndex = (SjzEventIndex)map.get("sjzEventIndex");
        LszTag lszTag = (LszTag)map.get("lszTag");
        Integer authorId = (Integer)map.get("authorId");

        sql.append(" select sei.*,lt.wordMetaCode,lt.wordMetaZh,lt.wordMetaEn from sjz_event_index sei ");
        sql.append(" left join lsz_tag lt on sei.id = lt.recordId and lt.tagType = 'event' ");
        sql.append(" where 1=1 ");
        if(sjzEventIndex!=null && sjzEventIndex.getEventState() != null){
            sql.append(" and sei.eventState = #{sjzEventIndex.eventState,jdbcType=TINYINT} ");
        }

        // 事件标签
        if(lszTag != null && lszTag.getWordMetaCode() != null){
            sql.append(" and lt.wordMetaCode = #{lszTag.wordMetaCode} ");
        }
        if(authorId!=null){
            sql.append(" and exists (select 1 from sjz_event_author sea where sea.userId = #{authorId,jdbcType=INTEGER} and sea.eventIndexId= sei.id)");
        }

        sql.append(" order by sei.eventTime desc ");

        // limit
        sql.append(" limit #{offset,jdbcType=INTEGER}, #{pageSize,jdbcType=INTEGER}");

        return sql.toString();
    }


    public String selectCountByObject(Map<String,Object>  map){
        StringBuilder sql = new StringBuilder();

        SjzEventIndex sjzEventIndex = (SjzEventIndex)map.get("sjzEventIndex");

        Integer authorId = (Integer)map.get("authorId");

        sql.append(" select count(*) from sjz_event_index sei ");
        sql.append(" where 1=1 ");

        if(sjzEventIndex!=null && sjzEventIndex.getEventState() != null){
            sql.append(" and sei.eventState = #{sjzEventIndex.eventState,jdbcType=TINYINT} ");
        }

        if(authorId!=null){
            sql.append(" and exists (select 1 from sjz_event_author sea where sea.userId = #{authorId,jdbcType=INTEGER} and sea.eventIndexId= sei.id)");
        }

        return sql.toString();
    }

    /**
     * 分页查询列表
     * @param map 条件
     * @return
     */
    public String selectPagingListByObject(Map<String,Object>  map){
        StringBuilder sql = new StringBuilder();

        SjzEventIndex sjzEventIndex = (SjzEventIndex)map.get("sjzEventIndex");

        Integer authorId = (Integer)map.get("authorId");

        sql.append(" select sei.* from sjz_event_index sei ");
        sql.append(" where 1=1 ");

        if(sjzEventIndex != null && sjzEventIndex.getEventState() != null){
           sql.append(" and sei.eventState = #{sjzEventIndex.eventState,jdbcType=TINYINT} ");
        }
        if(authorId!=null){
           sql.append(" and exists (select 1 from sjz_event_author sea where sea.userId = #{authorId,jdbcType=INTEGER} and sea.eventIndexId= sei.id)");
        }

        sql.append(" order by sei.eventTime desc ");

        // limit
        sql.append(" limit #{offset,jdbcType=INTEGER}, #{pageSize,jdbcType=INTEGER}");

        return sql.toString();
    }



    public String selectListByPaging(SjzEventIndex sjzEventIndex){
        StringBuffer sqlStr = new StringBuffer();
        sqlStr.append(" select id,eventTime,eventContent,eventType,eventState,recordCreateTime ");
        sqlStr.append(" from sjz_event_index ");

        sqlStr.append(" order by eventTime ");
        return sqlStr.toString();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String countByExample(SjzEventIndexExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sjz_event_index");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String deleteByExample(SjzEventIndexExample example) {
        BEGIN();
        DELETE_FROM("sjz_event_index");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String insertSelective(SjzEventIndex record) {
        BEGIN();
        INSERT_INTO("sjz_event_index");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getEventTime() != null) {
            VALUES("eventTime", "#{eventTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventContent() != null) {
            VALUES("eventContent", "#{eventContent,jdbcType=VARCHAR}");
        }
        
        if (record.getEventType() != null) {
            VALUES("eventType", "#{eventType,jdbcType=TINYINT}");
        }
        
        if (record.getEventState() != null) {
            VALUES("eventState", "#{eventState,jdbcType=TINYINT}");
        }
        
        if (record.getRecordCreateTime() != null) {
            VALUES("recordCreateTime", "#{recordCreateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String selectByExample(SjzEventIndexExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("eventTime");
        SELECT("eventContent");
        SELECT("eventType");
        SELECT("eventState");
        SELECT("recordCreateTime");
        FROM("sjz_event_index");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SjzEventIndex record = (SjzEventIndex) parameter.get("record");
        SjzEventIndexExample example = (SjzEventIndexExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sjz_event_index");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getEventTime() != null) {
            SET("eventTime = #{record.eventTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventContent() != null) {
            SET("eventContent = #{record.eventContent,jdbcType=VARCHAR}");
        }
        
        if (record.getEventType() != null) {
            SET("eventType = #{record.eventType,jdbcType=TINYINT}");
        }
        
        if (record.getEventState() != null) {
            SET("eventState = #{record.eventState,jdbcType=TINYINT}");
        }
        
        if (record.getRecordCreateTime() != null) {
            SET("recordCreateTime = #{record.recordCreateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sjz_event_index");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("eventTime = #{record.eventTime,jdbcType=TIMESTAMP}");
        SET("eventContent = #{record.eventContent,jdbcType=VARCHAR}");
        SET("eventType = #{record.eventType,jdbcType=TINYINT}");
        SET("eventState = #{record.eventState,jdbcType=TINYINT}");
        SET("recordCreateTime = #{record.recordCreateTime,jdbcType=TIMESTAMP}");
        
        SjzEventIndexExample example = (SjzEventIndexExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    public String updateByPrimaryKeySelective(SjzEventIndex record) {
        BEGIN();
        UPDATE("sjz_event_index");
        
        if (record.getEventTime() != null) {
            SET("eventTime = #{eventTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventContent() != null) {
            SET("eventContent = #{eventContent,jdbcType=VARCHAR}");
        }
        
        if (record.getEventType() != null) {
            SET("eventType = #{eventType,jdbcType=TINYINT}");
        }
        
        if (record.getEventState() != null) {
            SET("eventState = #{eventState,jdbcType=TINYINT}");
        }
        
        if (record.getRecordCreateTime() != null) {
            SET("recordCreateTime = #{recordCreateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_event_index
     *
     * @mbggenerated Sun Jun 16 20:12:05 CST 2019
     */
    protected void applyWhere(SjzEventIndexExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}