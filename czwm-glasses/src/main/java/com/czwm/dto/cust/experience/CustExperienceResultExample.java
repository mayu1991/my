package com.czwm.dto.cust.experience;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustExperienceResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustExperienceResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyIsNull() {
            addCriterion("experience_frequency is null");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyIsNotNull() {
            addCriterion("experience_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyEqualTo(Integer value) {
            addCriterion("experience_frequency =", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyNotEqualTo(Integer value) {
            addCriterion("experience_frequency <>", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyGreaterThan(Integer value) {
            addCriterion("experience_frequency >", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_frequency >=", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyLessThan(Integer value) {
            addCriterion("experience_frequency <", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("experience_frequency <=", value, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyIn(List<Integer> values) {
            addCriterion("experience_frequency in", values, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyNotIn(List<Integer> values) {
            addCriterion("experience_frequency not in", values, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("experience_frequency between", value1, value2, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andExperienceFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_frequency not between", value1, value2, "experienceFrequency");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(Date value) {
            addCriterion("appointment_time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(Date value) {
            addCriterion("appointment_time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(Date value) {
            addCriterion("appointment_time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointment_time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(Date value) {
            addCriterion("appointment_time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("appointment_time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<Date> values) {
            addCriterion("appointment_time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<Date> values) {
            addCriterion("appointment_time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(Date value1, Date value2) {
            addCriterion("appointment_time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("appointment_time not between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIsNull() {
            addCriterion("experience_time is null");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIsNotNull() {
            addCriterion("experience_time is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeEqualTo(Date value) {
            addCriterion("experience_time =", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotEqualTo(Date value) {
            addCriterion("experience_time <>", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeGreaterThan(Date value) {
            addCriterion("experience_time >", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("experience_time >=", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeLessThan(Date value) {
            addCriterion("experience_time <", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeLessThanOrEqualTo(Date value) {
            addCriterion("experience_time <=", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIn(List<Date> values) {
            addCriterion("experience_time in", values, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotIn(List<Date> values) {
            addCriterion("experience_time not in", values, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeBetween(Date value1, Date value2) {
            addCriterion("experience_time between", value1, value2, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotBetween(Date value1, Date value2) {
            addCriterion("experience_time not between", value1, value2, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andReceptionNameIsNull() {
            addCriterion("reception_name is null");
            return (Criteria) this;
        }

        public Criteria andReceptionNameIsNotNull() {
            addCriterion("reception_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionNameEqualTo(String value) {
            addCriterion("reception_name =", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameNotEqualTo(String value) {
            addCriterion("reception_name <>", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameGreaterThan(String value) {
            addCriterion("reception_name >", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("reception_name >=", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameLessThan(String value) {
            addCriterion("reception_name <", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameLessThanOrEqualTo(String value) {
            addCriterion("reception_name <=", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameLike(String value) {
            addCriterion("reception_name like", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameNotLike(String value) {
            addCriterion("reception_name not like", value, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameIn(List<String> values) {
            addCriterion("reception_name in", values, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameNotIn(List<String> values) {
            addCriterion("reception_name not in", values, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameBetween(String value1, String value2) {
            addCriterion("reception_name between", value1, value2, "receptionName");
            return (Criteria) this;
        }

        public Criteria andReceptionNameNotBetween(String value1, String value2) {
            addCriterion("reception_name not between", value1, value2, "receptionName");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("last_updated_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("last_updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(Integer value) {
            addCriterion("last_updated_by =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(Integer value) {
            addCriterion("last_updated_by <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(Integer value) {
            addCriterion("last_updated_by >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_updated_by >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(Integer value) {
            addCriterion("last_updated_by <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("last_updated_by <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<Integer> values) {
            addCriterion("last_updated_by in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<Integer> values) {
            addCriterion("last_updated_by not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("last_updated_by between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("last_updated_by not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNull() {
            addCriterion("last_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIsNotNull() {
            addCriterion("last_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeEqualTo(Date value) {
            addCriterion("last_updated_time =", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotEqualTo(Date value) {
            addCriterion("last_updated_time <>", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThan(Date value) {
            addCriterion("last_updated_time >", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updated_time >=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThan(Date value) {
            addCriterion("last_updated_time <", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_updated_time <=", value, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeIn(List<Date> values) {
            addCriterion("last_updated_time in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotIn(List<Date> values) {
            addCriterion("last_updated_time not in", values, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("last_updated_time between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_updated_time not between", value1, value2, "lastUpdatedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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