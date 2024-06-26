package com.lcyj.sms.dao.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lcyj.sms.model.SmsPlatformServer;
import com.lcyj.sms.model.SmsPlatformServerExample.Criteria;
import com.lcyj.sms.model.SmsPlatformServerExample.Criterion;
import com.lcyj.sms.model.SmsPlatformServerExample;
import java.util.List;
import java.util.Map;

public class SmsPlatformServerSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String countByExample(SmsPlatformServerExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sms_platform_server");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String deleteByExample(SmsPlatformServerExample example) {
        BEGIN();
        DELETE_FROM("sms_platform_server");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String insertSelective(SmsPlatformServer record) {
        BEGIN();
        INSERT_INTO("sms_platform_server");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPlatformId() != null) {
            VALUES("platformId", "#{platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            VALUES("serverId", "#{serverId,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatformName() != null) {
            VALUES("platformName", "#{platformName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            VALUES("serverName", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            VALUES("serverIp", "#{serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerUrl() != null) {
            VALUES("serverUrl", "#{serverUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String selectByExample(SmsPlatformServerExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("platformId");
        SELECT("serverId");
        SELECT("platformName");
        SELECT("serverName");
        SELECT("serverIp");
        SELECT("serverUrl");
        SELECT("description");
        FROM("sms_platform_server");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SmsPlatformServer record = (SmsPlatformServer) parameter.get("record");
        SmsPlatformServerExample example = (SmsPlatformServerExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sms_platform_server");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getPlatformId() != null) {
            SET("platformId = #{record.platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            SET("serverId = #{record.serverId,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatformName() != null) {
            SET("platformName = #{record.platformName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            SET("serverName = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            SET("serverIp = #{record.serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerUrl() != null) {
            SET("serverUrl = #{record.serverUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sms_platform_server");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("platformId = #{record.platformId,jdbcType=VARCHAR}");
        SET("serverId = #{record.serverId,jdbcType=VARCHAR}");
        SET("platformName = #{record.platformName,jdbcType=VARCHAR}");
        SET("serverName = #{record.serverName,jdbcType=VARCHAR}");
        SET("serverIp = #{record.serverIp,jdbcType=VARCHAR}");
        SET("serverUrl = #{record.serverUrl,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        
        SmsPlatformServerExample example = (SmsPlatformServerExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String updateByPrimaryKeySelective(SmsPlatformServer record) {
        BEGIN();
        UPDATE("sms_platform_server");
        
        if (record.getPlatformId() != null) {
            SET("platformId = #{platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            SET("serverId = #{serverId,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatformName() != null) {
            SET("platformName = #{platformName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            SET("serverName = #{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            SET("serverIp = #{serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerUrl() != null) {
            SET("serverUrl = #{serverUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_platform_server
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    protected void applyWhere(SmsPlatformServerExample example, boolean includeExamplePhrase) {
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