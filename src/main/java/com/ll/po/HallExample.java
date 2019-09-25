package com.ll.po;

import java.util.ArrayList;
import java.util.List;

public class HallExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hall
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hall
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hall
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public HallExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
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
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hall
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hall
     *
     * @mbggenerated
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(String value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(String value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(String value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(String value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(String value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLike(String value) {
            addCriterion("h_type like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotLike(String value) {
            addCriterion("h_type not like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<String> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<String> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(String value1, String value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(String value1, String value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHDescIsNull() {
            addCriterion("h_desc is null");
            return (Criteria) this;
        }

        public Criteria andHDescIsNotNull() {
            addCriterion("h_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHDescEqualTo(String value) {
            addCriterion("h_desc =", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotEqualTo(String value) {
            addCriterion("h_desc <>", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThan(String value) {
            addCriterion("h_desc >", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThanOrEqualTo(String value) {
            addCriterion("h_desc >=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThan(String value) {
            addCriterion("h_desc <", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThanOrEqualTo(String value) {
            addCriterion("h_desc <=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLike(String value) {
            addCriterion("h_desc like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotLike(String value) {
            addCriterion("h_desc not like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescIn(List<String> values) {
            addCriterion("h_desc in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotIn(List<String> values) {
            addCriterion("h_desc not in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescBetween(String value1, String value2) {
            addCriterion("h_desc between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotBetween(String value1, String value2) {
            addCriterion("h_desc not between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHSizeIsNull() {
            addCriterion("h_size is null");
            return (Criteria) this;
        }

        public Criteria andHSizeIsNotNull() {
            addCriterion("h_size is not null");
            return (Criteria) this;
        }

        public Criteria andHSizeEqualTo(String value) {
            addCriterion("h_size =", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeNotEqualTo(String value) {
            addCriterion("h_size <>", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeGreaterThan(String value) {
            addCriterion("h_size >", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeGreaterThanOrEqualTo(String value) {
            addCriterion("h_size >=", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeLessThan(String value) {
            addCriterion("h_size <", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeLessThanOrEqualTo(String value) {
            addCriterion("h_size <=", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeLike(String value) {
            addCriterion("h_size like", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeNotLike(String value) {
            addCriterion("h_size not like", value, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeIn(List<String> values) {
            addCriterion("h_size in", values, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeNotIn(List<String> values) {
            addCriterion("h_size not in", values, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeBetween(String value1, String value2) {
            addCriterion("h_size between", value1, value2, "hSize");
            return (Criteria) this;
        }

        public Criteria andHSizeNotBetween(String value1, String value2) {
            addCriterion("h_size not between", value1, value2, "hSize");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNull() {
            addCriterion("h_status is null");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNotNull() {
            addCriterion("h_status is not null");
            return (Criteria) this;
        }

        public Criteria andHStatusEqualTo(Integer value) {
            addCriterion("h_status =", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotEqualTo(Integer value) {
            addCriterion("h_status <>", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThan(Integer value) {
            addCriterion("h_status >", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_status >=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThan(Integer value) {
            addCriterion("h_status <", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThanOrEqualTo(Integer value) {
            addCriterion("h_status <=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusIn(List<Integer> values) {
            addCriterion("h_status in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotIn(List<Integer> values) {
            addCriterion("h_status not in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusBetween(Integer value1, Integer value2) {
            addCriterion("h_status between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("h_status not between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHTempIsNull() {
            addCriterion("h_temp is null");
            return (Criteria) this;
        }

        public Criteria andHTempIsNotNull() {
            addCriterion("h_temp is not null");
            return (Criteria) this;
        }

        public Criteria andHTempEqualTo(String value) {
            addCriterion("h_temp =", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempNotEqualTo(String value) {
            addCriterion("h_temp <>", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempGreaterThan(String value) {
            addCriterion("h_temp >", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempGreaterThanOrEqualTo(String value) {
            addCriterion("h_temp >=", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempLessThan(String value) {
            addCriterion("h_temp <", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempLessThanOrEqualTo(String value) {
            addCriterion("h_temp <=", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempLike(String value) {
            addCriterion("h_temp like", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempNotLike(String value) {
            addCriterion("h_temp not like", value, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempIn(List<String> values) {
            addCriterion("h_temp in", values, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempNotIn(List<String> values) {
            addCriterion("h_temp not in", values, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempBetween(String value1, String value2) {
            addCriterion("h_temp between", value1, value2, "hTemp");
            return (Criteria) this;
        }

        public Criteria andHTempNotBetween(String value1, String value2) {
            addCriterion("h_temp not between", value1, value2, "hTemp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hall
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hall
     *
     * @mbggenerated
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