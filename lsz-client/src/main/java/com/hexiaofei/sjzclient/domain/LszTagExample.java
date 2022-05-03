package com.hexiaofei.sjzclient.domain;

import java.util.ArrayList;
import java.util.List;

public class LszTagExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public LszTagExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tagId is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tagId is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Integer value) {
            addCriterion("tagId =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Integer value) {
            addCriterion("tagId <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Integer value) {
            addCriterion("tagId >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tagId >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Integer value) {
            addCriterion("tagId <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("tagId <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Integer> values) {
            addCriterion("tagId in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Integer> values) {
            addCriterion("tagId not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Integer value1, Integer value2) {
            addCriterion("tagId between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tagId not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("recordId =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("recordId <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("recordId >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordId >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("recordId <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("recordId <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("recordId in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("recordId not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("recordId between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recordId not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andTagTypeIsNull() {
            addCriterion("tagType is null");
            return (Criteria) this;
        }

        public Criteria andTagTypeIsNotNull() {
            addCriterion("tagType is not null");
            return (Criteria) this;
        }

        public Criteria andTagTypeEqualTo(String value) {
            addCriterion("tagType =", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotEqualTo(String value) {
            addCriterion("tagType <>", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeGreaterThan(String value) {
            addCriterion("tagType >", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tagType >=", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeLessThan(String value) {
            addCriterion("tagType <", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeLessThanOrEqualTo(String value) {
            addCriterion("tagType <=", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeLike(String value) {
            addCriterion("tagType like", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotLike(String value) {
            addCriterion("tagType not like", value, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeIn(List<String> values) {
            addCriterion("tagType in", values, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotIn(List<String> values) {
            addCriterion("tagType not in", values, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeBetween(String value1, String value2) {
            addCriterion("tagType between", value1, value2, "tagType");
            return (Criteria) this;
        }

        public Criteria andTagTypeNotBetween(String value1, String value2) {
            addCriterion("tagType not between", value1, value2, "tagType");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeIsNull() {
            addCriterion("wordMetaCode is null");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeIsNotNull() {
            addCriterion("wordMetaCode is not null");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeEqualTo(Integer value) {
            addCriterion("wordMetaCode =", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeNotEqualTo(Integer value) {
            addCriterion("wordMetaCode <>", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeGreaterThan(Integer value) {
            addCriterion("wordMetaCode >", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordMetaCode >=", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeLessThan(Integer value) {
            addCriterion("wordMetaCode <", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeLessThanOrEqualTo(Integer value) {
            addCriterion("wordMetaCode <=", value, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeIn(List<Integer> values) {
            addCriterion("wordMetaCode in", values, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeNotIn(List<Integer> values) {
            addCriterion("wordMetaCode not in", values, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeBetween(Integer value1, Integer value2) {
            addCriterion("wordMetaCode between", value1, value2, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("wordMetaCode not between", value1, value2, "wordMetaCode");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnIsNull() {
            addCriterion("wordMetaEn is null");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnIsNotNull() {
            addCriterion("wordMetaEn is not null");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnEqualTo(String value) {
            addCriterion("wordMetaEn =", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnNotEqualTo(String value) {
            addCriterion("wordMetaEn <>", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnGreaterThan(String value) {
            addCriterion("wordMetaEn >", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnGreaterThanOrEqualTo(String value) {
            addCriterion("wordMetaEn >=", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnLessThan(String value) {
            addCriterion("wordMetaEn <", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnLessThanOrEqualTo(String value) {
            addCriterion("wordMetaEn <=", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnLike(String value) {
            addCriterion("wordMetaEn like", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnNotLike(String value) {
            addCriterion("wordMetaEn not like", value, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnIn(List<String> values) {
            addCriterion("wordMetaEn in", values, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnNotIn(List<String> values) {
            addCriterion("wordMetaEn not in", values, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnBetween(String value1, String value2) {
            addCriterion("wordMetaEn between", value1, value2, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaEnNotBetween(String value1, String value2) {
            addCriterion("wordMetaEn not between", value1, value2, "wordMetaEn");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhIsNull() {
            addCriterion("wordMetaZh is null");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhIsNotNull() {
            addCriterion("wordMetaZh is not null");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhEqualTo(String value) {
            addCriterion("wordMetaZh =", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhNotEqualTo(String value) {
            addCriterion("wordMetaZh <>", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhGreaterThan(String value) {
            addCriterion("wordMetaZh >", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhGreaterThanOrEqualTo(String value) {
            addCriterion("wordMetaZh >=", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhLessThan(String value) {
            addCriterion("wordMetaZh <", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhLessThanOrEqualTo(String value) {
            addCriterion("wordMetaZh <=", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhLike(String value) {
            addCriterion("wordMetaZh like", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhNotLike(String value) {
            addCriterion("wordMetaZh not like", value, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhIn(List<String> values) {
            addCriterion("wordMetaZh in", values, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhNotIn(List<String> values) {
            addCriterion("wordMetaZh not in", values, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhBetween(String value1, String value2) {
            addCriterion("wordMetaZh between", value1, value2, "wordMetaZh");
            return (Criteria) this;
        }

        public Criteria andWordMetaZhNotBetween(String value1, String value2) {
            addCriterion("wordMetaZh not between", value1, value2, "wordMetaZh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lsz_tag
     *
     * @mbggenerated do_not_delete_during_merge Sat Nov 28 15:02:24 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lsz_tag
     *
     * @mbggenerated Sat Nov 28 15:02:24 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}