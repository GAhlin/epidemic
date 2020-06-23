package com.gavin.epidemic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EpidemicsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public EpidemicsExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
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
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andSerialIdIsNull() {
            addCriterion("serial_id is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(Integer value) {
            addCriterion("serial_id =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(Integer value) {
            addCriterion("serial_id <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(Integer value) {
            addCriterion("serial_id >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_id >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(Integer value) {
            addCriterion("serial_id <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(Integer value) {
            addCriterion("serial_id <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<Integer> values) {
            addCriterion("serial_id in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<Integer> values) {
            addCriterion("serial_id not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(Integer value1, Integer value2) {
            addCriterion("serial_id between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_id not between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andDataYearIsNull() {
            addCriterion("data_year is null");
            return (Criteria) this;
        }

        public Criteria andDataYearIsNotNull() {
            addCriterion("data_year is not null");
            return (Criteria) this;
        }

        public Criteria andDataYearEqualTo(Short value) {
            addCriterion("data_year =", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotEqualTo(Short value) {
            addCriterion("data_year <>", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearGreaterThan(Short value) {
            addCriterion("data_year >", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearGreaterThanOrEqualTo(Short value) {
            addCriterion("data_year >=", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearLessThan(Short value) {
            addCriterion("data_year <", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearLessThanOrEqualTo(Short value) {
            addCriterion("data_year <=", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearIn(List<Short> values) {
            addCriterion("data_year in", values, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotIn(List<Short> values) {
            addCriterion("data_year not in", values, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearBetween(Short value1, Short value2) {
            addCriterion("data_year between", value1, value2, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotBetween(Short value1, Short value2) {
            addCriterion("data_year not between", value1, value2, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNull() {
            addCriterion("data_month is null");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNotNull() {
            addCriterion("data_month is not null");
            return (Criteria) this;
        }

        public Criteria andDataMonthEqualTo(Short value) {
            addCriterion("data_month =", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotEqualTo(Short value) {
            addCriterion("data_month <>", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThan(Short value) {
            addCriterion("data_month >", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("data_month >=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThan(Short value) {
            addCriterion("data_month <", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThanOrEqualTo(Short value) {
            addCriterion("data_month <=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthIn(List<Short> values) {
            addCriterion("data_month in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotIn(List<Short> values) {
            addCriterion("data_month not in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthBetween(Short value1, Short value2) {
            addCriterion("data_month between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotBetween(Short value1, Short value2) {
            addCriterion("data_month not between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataDayIsNull() {
            addCriterion("data_day is null");
            return (Criteria) this;
        }

        public Criteria andDataDayIsNotNull() {
            addCriterion("data_day is not null");
            return (Criteria) this;
        }

        public Criteria andDataDayEqualTo(Short value) {
            addCriterion("data_day =", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayNotEqualTo(Short value) {
            addCriterion("data_day <>", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayGreaterThan(Short value) {
            addCriterion("data_day >", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayGreaterThanOrEqualTo(Short value) {
            addCriterion("data_day >=", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayLessThan(Short value) {
            addCriterion("data_day <", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayLessThanOrEqualTo(Short value) {
            addCriterion("data_day <=", value, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayIn(List<Short> values) {
            addCriterion("data_day in", values, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayNotIn(List<Short> values) {
            addCriterion("data_day not in", values, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayBetween(Short value1, Short value2) {
            addCriterion("data_day between", value1, value2, "dataDay");
            return (Criteria) this;
        }

        public Criteria andDataDayNotBetween(Short value1, Short value2) {
            addCriterion("data_day not between", value1, value2, "dataDay");
            return (Criteria) this;
        }

        public Criteria andAffirmedIsNull() {
            addCriterion("affirmed is null");
            return (Criteria) this;
        }

        public Criteria andAffirmedIsNotNull() {
            addCriterion("affirmed is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmedEqualTo(Integer value) {
            addCriterion("affirmed =", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedNotEqualTo(Integer value) {
            addCriterion("affirmed <>", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedGreaterThan(Integer value) {
            addCriterion("affirmed >", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("affirmed >=", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedLessThan(Integer value) {
            addCriterion("affirmed <", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedLessThanOrEqualTo(Integer value) {
            addCriterion("affirmed <=", value, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedIn(List<Integer> values) {
            addCriterion("affirmed in", values, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedNotIn(List<Integer> values) {
            addCriterion("affirmed not in", values, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedBetween(Integer value1, Integer value2) {
            addCriterion("affirmed between", value1, value2, "affirmed");
            return (Criteria) this;
        }

        public Criteria andAffirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("affirmed not between", value1, value2, "affirmed");
            return (Criteria) this;
        }

        public Criteria andSuspectedIsNull() {
            addCriterion("suspected is null");
            return (Criteria) this;
        }

        public Criteria andSuspectedIsNotNull() {
            addCriterion("suspected is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectedEqualTo(Integer value) {
            addCriterion("suspected =", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedNotEqualTo(Integer value) {
            addCriterion("suspected <>", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedGreaterThan(Integer value) {
            addCriterion("suspected >", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedGreaterThanOrEqualTo(Integer value) {
            addCriterion("suspected >=", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedLessThan(Integer value) {
            addCriterion("suspected <", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedLessThanOrEqualTo(Integer value) {
            addCriterion("suspected <=", value, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedIn(List<Integer> values) {
            addCriterion("suspected in", values, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedNotIn(List<Integer> values) {
            addCriterion("suspected not in", values, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedBetween(Integer value1, Integer value2) {
            addCriterion("suspected between", value1, value2, "suspected");
            return (Criteria) this;
        }

        public Criteria andSuspectedNotBetween(Integer value1, Integer value2) {
            addCriterion("suspected not between", value1, value2, "suspected");
            return (Criteria) this;
        }

        public Criteria andIsolatedIsNull() {
            addCriterion("isolated is null");
            return (Criteria) this;
        }

        public Criteria andIsolatedIsNotNull() {
            addCriterion("isolated is not null");
            return (Criteria) this;
        }

        public Criteria andIsolatedEqualTo(Integer value) {
            addCriterion("isolated =", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedNotEqualTo(Integer value) {
            addCriterion("isolated <>", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedGreaterThan(Integer value) {
            addCriterion("isolated >", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isolated >=", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedLessThan(Integer value) {
            addCriterion("isolated <", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedLessThanOrEqualTo(Integer value) {
            addCriterion("isolated <=", value, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedIn(List<Integer> values) {
            addCriterion("isolated in", values, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedNotIn(List<Integer> values) {
            addCriterion("isolated not in", values, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedBetween(Integer value1, Integer value2) {
            addCriterion("isolated between", value1, value2, "isolated");
            return (Criteria) this;
        }

        public Criteria andIsolatedNotBetween(Integer value1, Integer value2) {
            addCriterion("isolated not between", value1, value2, "isolated");
            return (Criteria) this;
        }

        public Criteria andDeadIsNull() {
            addCriterion("dead is null");
            return (Criteria) this;
        }

        public Criteria andDeadIsNotNull() {
            addCriterion("dead is not null");
            return (Criteria) this;
        }

        public Criteria andDeadEqualTo(Integer value) {
            addCriterion("dead =", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadNotEqualTo(Integer value) {
            addCriterion("dead <>", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadGreaterThan(Integer value) {
            addCriterion("dead >", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadGreaterThanOrEqualTo(Integer value) {
            addCriterion("dead >=", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadLessThan(Integer value) {
            addCriterion("dead <", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadLessThanOrEqualTo(Integer value) {
            addCriterion("dead <=", value, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadIn(List<Integer> values) {
            addCriterion("dead in", values, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadNotIn(List<Integer> values) {
            addCriterion("dead not in", values, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadBetween(Integer value1, Integer value2) {
            addCriterion("dead between", value1, value2, "dead");
            return (Criteria) this;
        }

        public Criteria andDeadNotBetween(Integer value1, Integer value2) {
            addCriterion("dead not between", value1, value2, "dead");
            return (Criteria) this;
        }

        public Criteria andCuredIsNull() {
            addCriterion("cured is null");
            return (Criteria) this;
        }

        public Criteria andCuredIsNotNull() {
            addCriterion("cured is not null");
            return (Criteria) this;
        }

        public Criteria andCuredEqualTo(Integer value) {
            addCriterion("cured =", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredNotEqualTo(Integer value) {
            addCriterion("cured <>", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredGreaterThan(Integer value) {
            addCriterion("cured >", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredGreaterThanOrEqualTo(Integer value) {
            addCriterion("cured >=", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredLessThan(Integer value) {
            addCriterion("cured <", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredLessThanOrEqualTo(Integer value) {
            addCriterion("cured <=", value, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredIn(List<Integer> values) {
            addCriterion("cured in", values, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredNotIn(List<Integer> values) {
            addCriterion("cured not in", values, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredBetween(Integer value1, Integer value2) {
            addCriterion("cured between", value1, value2, "cured");
            return (Criteria) this;
        }

        public Criteria andCuredNotBetween(Integer value1, Integer value2) {
            addCriterion("cured not between", value1, value2, "cured");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epidemics
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 23 13:03:52 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table epidemics
     *
     * @mbg.generated Tue Jun 23 13:03:52 CST 2020
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