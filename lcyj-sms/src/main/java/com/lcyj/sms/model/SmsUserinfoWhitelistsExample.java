package com.lcyj.sms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsUserinfoWhitelistsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public SmsUserinfoWhitelistsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
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
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdIsNull() {
            addCriterion("smsUserId is null");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdIsNotNull() {
            addCriterion("smsUserId is not null");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdEqualTo(String value) {
            addCriterion("smsUserId =", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdNotEqualTo(String value) {
            addCriterion("smsUserId <>", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdGreaterThan(String value) {
            addCriterion("smsUserId >", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("smsUserId >=", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdLessThan(String value) {
            addCriterion("smsUserId <", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdLessThanOrEqualTo(String value) {
            addCriterion("smsUserId <=", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdLike(String value) {
            addCriterion("smsUserId like", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdNotLike(String value) {
            addCriterion("smsUserId not like", value, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdIn(List<String> values) {
            addCriterion("smsUserId in", values, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdNotIn(List<String> values) {
            addCriterion("smsUserId not in", values, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdBetween(String value1, String value2) {
            addCriterion("smsUserId between", value1, value2, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andSmsUserIdNotBetween(String value1, String value2) {
            addCriterion("smsUserId not between", value1, value2, "smsUserId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeIsNull() {
            addCriterion("startDateTime is null");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeIsNotNull() {
            addCriterion("startDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeEqualTo(Date value) {
            addCriterion("startDateTime =", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeNotEqualTo(Date value) {
            addCriterion("startDateTime <>", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeGreaterThan(Date value) {
            addCriterion("startDateTime >", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startDateTime >=", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeLessThan(Date value) {
            addCriterion("startDateTime <", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("startDateTime <=", value, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeIn(List<Date> values) {
            addCriterion("startDateTime in", values, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeNotIn(List<Date> values) {
            addCriterion("startDateTime not in", values, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeBetween(Date value1, Date value2) {
            addCriterion("startDateTime between", value1, value2, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andStartDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("startDateTime not between", value1, value2, "startDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeIsNull() {
            addCriterion("endDateTime is null");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeIsNotNull() {
            addCriterion("endDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeEqualTo(Date value) {
            addCriterion("endDateTime =", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeNotEqualTo(Date value) {
            addCriterion("endDateTime <>", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeGreaterThan(Date value) {
            addCriterion("endDateTime >", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endDateTime >=", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeLessThan(Date value) {
            addCriterion("endDateTime <", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("endDateTime <=", value, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeIn(List<Date> values) {
            addCriterion("endDateTime in", values, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeNotIn(List<Date> values) {
            addCriterion("endDateTime not in", values, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeBetween(Date value1, Date value2) {
            addCriterion("endDateTime between", value1, value2, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andEndDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("endDateTime not between", value1, value2, "endDateTime");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limitType is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limitType is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(String value) {
            addCriterion("limitType =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(String value) {
            addCriterion("limitType <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(String value) {
            addCriterion("limitType >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limitType >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(String value) {
            addCriterion("limitType <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("limitType <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLike(String value) {
            addCriterion("limitType like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotLike(String value) {
            addCriterion("limitType not like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<String> values) {
            addCriterion("limitType in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<String> values) {
            addCriterion("limitType not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(String value1, String value2) {
            addCriterion("limitType between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(String value1, String value2) {
            addCriterion("limitType not between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPlantformIdIsNull() {
            addCriterion("plantformId is null");
            return (Criteria) this;
        }

        public Criteria andPlantformIdIsNotNull() {
            addCriterion("plantformId is not null");
            return (Criteria) this;
        }

        public Criteria andPlantformIdEqualTo(String value) {
            addCriterion("plantformId =", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdNotEqualTo(String value) {
            addCriterion("plantformId <>", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdGreaterThan(String value) {
            addCriterion("plantformId >", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdGreaterThanOrEqualTo(String value) {
            addCriterion("plantformId >=", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdLessThan(String value) {
            addCriterion("plantformId <", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdLessThanOrEqualTo(String value) {
            addCriterion("plantformId <=", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdLike(String value) {
            addCriterion("plantformId like", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdNotLike(String value) {
            addCriterion("plantformId not like", value, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdIn(List<String> values) {
            addCriterion("plantformId in", values, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdNotIn(List<String> values) {
            addCriterion("plantformId not in", values, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdBetween(String value1, String value2) {
            addCriterion("plantformId between", value1, value2, "plantformId");
            return (Criteria) this;
        }

        public Criteria andPlantformIdNotBetween(String value1, String value2) {
            addCriterion("plantformId not between", value1, value2, "plantformId");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("serverId is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("serverId is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(String value) {
            addCriterion("serverId =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(String value) {
            addCriterion("serverId <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(String value) {
            addCriterion("serverId >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("serverId >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(String value) {
            addCriterion("serverId <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(String value) {
            addCriterion("serverId <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLike(String value) {
            addCriterion("serverId like", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotLike(String value) {
            addCriterion("serverId not like", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<String> values) {
            addCriterion("serverId in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<String> values) {
            addCriterion("serverId not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(String value1, String value2) {
            addCriterion("serverId between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(String value1, String value2) {
            addCriterion("serverId not between", value1, value2, "serverId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated do_not_delete_during_merge Sat Feb 29 10:46:03 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sms_userinfo_whitelists
     *
     * @mbggenerated Sat Feb 29 10:46:03 CST 2020
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