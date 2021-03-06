package com.ll.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This class corresponds to the database table comment
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Integer value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Integer value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Integer value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Integer value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Integer value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Integer> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Integer> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Integer value1, Integer value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoCordIsNull() {
            addCriterion("co_cord is null");
            return (Criteria) this;
        }

        public Criteria andCoCordIsNotNull() {
            addCriterion("co_cord is not null");
            return (Criteria) this;
        }

        public Criteria andCoCordEqualTo(Double value) {
            addCriterion("co_cord =", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordNotEqualTo(Double value) {
            addCriterion("co_cord <>", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordGreaterThan(Double value) {
            addCriterion("co_cord >", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordGreaterThanOrEqualTo(Double value) {
            addCriterion("co_cord >=", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordLessThan(Double value) {
            addCriterion("co_cord <", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordLessThanOrEqualTo(Double value) {
            addCriterion("co_cord <=", value, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordIn(List<Double> values) {
            addCriterion("co_cord in", values, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordNotIn(List<Double> values) {
            addCriterion("co_cord not in", values, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordBetween(Double value1, Double value2) {
            addCriterion("co_cord between", value1, value2, "coCord");
            return (Criteria) this;
        }

        public Criteria andCoCordNotBetween(Double value1, Double value2) {
            addCriterion("co_cord not between", value1, value2, "coCord");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNull() {
            addCriterion("co_content is null");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNotNull() {
            addCriterion("co_content is not null");
            return (Criteria) this;
        }

        public Criteria andCoContentEqualTo(String value) {
            addCriterion("co_content =", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotEqualTo(String value) {
            addCriterion("co_content <>", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThan(String value) {
            addCriterion("co_content >", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThanOrEqualTo(String value) {
            addCriterion("co_content >=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThan(String value) {
            addCriterion("co_content <", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThanOrEqualTo(String value) {
            addCriterion("co_content <=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLike(String value) {
            addCriterion("co_content like", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotLike(String value) {
            addCriterion("co_content not like", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentIn(List<String> values) {
            addCriterion("co_content in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotIn(List<String> values) {
            addCriterion("co_content not in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentBetween(String value1, String value2) {
            addCriterion("co_content between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotBetween(String value1, String value2) {
            addCriterion("co_content not between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoDateIsNull() {
            addCriterion("co_date is null");
            return (Criteria) this;
        }

        public Criteria andCoDateIsNotNull() {
            addCriterion("co_date is not null");
            return (Criteria) this;
        }

        public Criteria andCoDateEqualTo(Date value) {
            addCriterion("co_date =", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateNotEqualTo(Date value) {
            addCriterion("co_date <>", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateGreaterThan(Date value) {
            addCriterion("co_date >", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("co_date >=", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateLessThan(Date value) {
            addCriterion("co_date <", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateLessThanOrEqualTo(Date value) {
            addCriterion("co_date <=", value, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateIn(List<Date> values) {
            addCriterion("co_date in", values, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateNotIn(List<Date> values) {
            addCriterion("co_date not in", values, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateBetween(Date value1, Date value2) {
            addCriterion("co_date between", value1, value2, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoDateNotBetween(Date value1, Date value2) {
            addCriterion("co_date not between", value1, value2, "coDate");
            return (Criteria) this;
        }

        public Criteria andCoTempIsNull() {
            addCriterion("co_temp is null");
            return (Criteria) this;
        }

        public Criteria andCoTempIsNotNull() {
            addCriterion("co_temp is not null");
            return (Criteria) this;
        }

        public Criteria andCoTempEqualTo(String value) {
            addCriterion("co_temp =", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempNotEqualTo(String value) {
            addCriterion("co_temp <>", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempGreaterThan(String value) {
            addCriterion("co_temp >", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempGreaterThanOrEqualTo(String value) {
            addCriterion("co_temp >=", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempLessThan(String value) {
            addCriterion("co_temp <", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempLessThanOrEqualTo(String value) {
            addCriterion("co_temp <=", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempLike(String value) {
            addCriterion("co_temp like", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempNotLike(String value) {
            addCriterion("co_temp not like", value, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempIn(List<String> values) {
            addCriterion("co_temp in", values, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempNotIn(List<String> values) {
            addCriterion("co_temp not in", values, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempBetween(String value1, String value2) {
            addCriterion("co_temp between", value1, value2, "coTemp");
            return (Criteria) this;
        }

        public Criteria andCoTempNotBetween(String value1, String value2) {
            addCriterion("co_temp not between", value1, value2, "coTemp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
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
     * This class corresponds to the database table comment
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