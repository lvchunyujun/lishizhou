package com.shijianzhou.language.dao.mapper;

import com.shijianzhou.language.domain.SjzNlWordMeta;
import com.shijianzhou.language.domain.SjzNlWordMetaExample;
import com.shijianzhou.language.domain.SjzNlWordMetaExample.Criteria;
import com.shijianzhou.language.domain.SjzNlWordMetaExample.Criterion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

@Repository
public class SjzNlWordMetaSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String countByExample(SjzNlWordMetaExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sjz_nl_word_meta");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String deleteByExample(SjzNlWordMetaExample example) {
        BEGIN();
        DELETE_FROM("sjz_nl_word_meta");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String insertSelective(SjzNlWordMeta record) {
        BEGIN();
        INSERT_INTO("sjz_nl_word_meta");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getWordMetaCode() != null) {
            VALUES("wordMetaCode", "#{wordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getWordMetaEn() != null) {
            VALUES("wordMetaEn", "#{wordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getWordMetaZh() != null) {
            VALUES("wordMetaZh", "#{wordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaEn() != null) {
            VALUES("simpleWordMetaEn", "#{simpleWordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaZh() != null) {
            VALUES("simpleWordMetaZh", "#{simpleWordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getLanguageId() != null) {
            VALUES("languageId", "#{languageId,jdbcType=INTEGER}");
        }
        
        if (record.getLanguageTypeCode() != null) {
            VALUES("languageTypeCode", "#{languageTypeCode,jdbcType=CHAR}");
        }
        
        if (record.getParentWordMetaCode() != null) {
            VALUES("parentWordMetaCode", "#{parentWordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            VALUES("level", "#{level,jdbcType=SMALLINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("createTime", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String selectByExample(SjzNlWordMetaExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("wordMetaCode");
        SELECT("wordMetaEn");
        SELECT("wordMetaZh");
        SELECT("simpleWordMetaEn");
        SELECT("simpleWordMetaZh");
        SELECT("languageId");
        SELECT("languageTypeCode");
        SELECT("parentWordMetaCode");
        SELECT("level");
        SELECT("createTime");
        SELECT("description");
        FROM("sjz_nl_word_meta");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SjzNlWordMeta record = (SjzNlWordMeta) parameter.get("record");
        SjzNlWordMetaExample example = (SjzNlWordMetaExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sjz_nl_word_meta");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getWordMetaCode() != null) {
            SET("wordMetaCode = #{record.wordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getWordMetaEn() != null) {
            SET("wordMetaEn = #{record.wordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getWordMetaZh() != null) {
            SET("wordMetaZh = #{record.wordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaEn() != null) {
            SET("simpleWordMetaEn = #{record.simpleWordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaZh() != null) {
            SET("simpleWordMetaZh = #{record.simpleWordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getLanguageId() != null) {
            SET("languageId = #{record.languageId,jdbcType=INTEGER}");
        }
        
        if (record.getLanguageTypeCode() != null) {
            SET("languageTypeCode = #{record.languageTypeCode,jdbcType=CHAR}");
        }
        
        if (record.getParentWordMetaCode() != null) {
            SET("parentWordMetaCode = #{record.parentWordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{record.level,jdbcType=SMALLINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("createTime = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sjz_nl_word_meta");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("wordMetaCode = #{record.wordMetaCode,jdbcType=INTEGER}");
        SET("wordMetaEn = #{record.wordMetaEn,jdbcType=CHAR}");
        SET("wordMetaZh = #{record.wordMetaZh,jdbcType=CHAR}");
        SET("simpleWordMetaEn = #{record.simpleWordMetaEn,jdbcType=CHAR}");
        SET("simpleWordMetaZh = #{record.simpleWordMetaZh,jdbcType=CHAR}");
        SET("languageId = #{record.languageId,jdbcType=INTEGER}");
        SET("languageTypeCode = #{record.languageTypeCode,jdbcType=CHAR}");
        SET("parentWordMetaCode = #{record.parentWordMetaCode,jdbcType=INTEGER}");
        SET("level = #{record.level,jdbcType=SMALLINT}");
        SET("createTime = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        
        SjzNlWordMetaExample example = (SjzNlWordMetaExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    public String updateByPrimaryKeySelective(SjzNlWordMeta record) {
        BEGIN();
        UPDATE("sjz_nl_word_meta");
        
        if (record.getWordMetaCode() != null) {
            SET("wordMetaCode = #{wordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getWordMetaEn() != null) {
            SET("wordMetaEn = #{wordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getWordMetaZh() != null) {
            SET("wordMetaZh = #{wordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaEn() != null) {
            SET("simpleWordMetaEn = #{simpleWordMetaEn,jdbcType=CHAR}");
        }
        
        if (record.getSimpleWordMetaZh() != null) {
            SET("simpleWordMetaZh = #{simpleWordMetaZh,jdbcType=CHAR}");
        }
        
        if (record.getLanguageId() != null) {
            SET("languageId = #{languageId,jdbcType=INTEGER}");
        }
        
        if (record.getLanguageTypeCode() != null) {
            SET("languageTypeCode = #{languageTypeCode,jdbcType=CHAR}");
        }
        
        if (record.getParentWordMetaCode() != null) {
            SET("parentWordMetaCode = #{parentWordMetaCode,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{level,jdbcType=SMALLINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("createTime = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sjz_nl_word_meta
     *
     * @mbggenerated Thu Oct 03 16:22:15 CST 2019
     */
    protected void applyWhere(SjzNlWordMetaExample example, boolean includeExamplePhrase) {
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