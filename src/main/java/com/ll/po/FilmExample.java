package com.ll.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table film
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public FilmExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
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
     * This method corresponds to the database table film
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
     * This method corresponds to the database table film
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
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
     * This class corresponds to the database table film
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

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFDirectorIsNull() {
            addCriterion("f_director is null");
            return (Criteria) this;
        }

        public Criteria andFDirectorIsNotNull() {
            addCriterion("f_director is not null");
            return (Criteria) this;
        }

        public Criteria andFDirectorEqualTo(String value) {
            addCriterion("f_director =", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorNotEqualTo(String value) {
            addCriterion("f_director <>", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorGreaterThan(String value) {
            addCriterion("f_director >", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("f_director >=", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorLessThan(String value) {
            addCriterion("f_director <", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorLessThanOrEqualTo(String value) {
            addCriterion("f_director <=", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorLike(String value) {
            addCriterion("f_director like", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorNotLike(String value) {
            addCriterion("f_director not like", value, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorIn(List<String> values) {
            addCriterion("f_director in", values, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorNotIn(List<String> values) {
            addCriterion("f_director not in", values, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorBetween(String value1, String value2) {
            addCriterion("f_director between", value1, value2, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFDirectorNotBetween(String value1, String value2) {
            addCriterion("f_director not between", value1, value2, "fDirector");
            return (Criteria) this;
        }

        public Criteria andFActorIsNull() {
            addCriterion("f_actor is null");
            return (Criteria) this;
        }

        public Criteria andFActorIsNotNull() {
            addCriterion("f_actor is not null");
            return (Criteria) this;
        }

        public Criteria andFActorEqualTo(String value) {
            addCriterion("f_actor =", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorNotEqualTo(String value) {
            addCriterion("f_actor <>", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorGreaterThan(String value) {
            addCriterion("f_actor >", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorGreaterThanOrEqualTo(String value) {
            addCriterion("f_actor >=", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorLessThan(String value) {
            addCriterion("f_actor <", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorLessThanOrEqualTo(String value) {
            addCriterion("f_actor <=", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorLike(String value) {
            addCriterion("f_actor like", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorNotLike(String value) {
            addCriterion("f_actor not like", value, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorIn(List<String> values) {
            addCriterion("f_actor in", values, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorNotIn(List<String> values) {
            addCriterion("f_actor not in", values, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorBetween(String value1, String value2) {
            addCriterion("f_actor between", value1, value2, "fActor");
            return (Criteria) this;
        }

        public Criteria andFActorNotBetween(String value1, String value2) {
            addCriterion("f_actor not between", value1, value2, "fActor");
            return (Criteria) this;
        }

        public Criteria andFPdateIsNull() {
            addCriterion("f_pdate is null");
            return (Criteria) this;
        }

        public Criteria andFPdateIsNotNull() {
            addCriterion("f_pdate is not null");
            return (Criteria) this;
        }

        public Criteria andFPdateEqualTo(Date value) {
            addCriterion("f_pdate =", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateNotEqualTo(Date value) {
            addCriterion("f_pdate <>", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateGreaterThan(Date value) {
            addCriterion("f_pdate >", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_pdate >=", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateLessThan(Date value) {
            addCriterion("f_pdate <", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateLessThanOrEqualTo(Date value) {
            addCriterion("f_pdate <=", value, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateIn(List<Date> values) {
            addCriterion("f_pdate in", values, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateNotIn(List<Date> values) {
            addCriterion("f_pdate not in", values, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateBetween(Date value1, Date value2) {
            addCriterion("f_pdate between", value1, value2, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFPdateNotBetween(Date value1, Date value2) {
            addCriterion("f_pdate not between", value1, value2, "fPdate");
            return (Criteria) this;
        }

        public Criteria andFCordIsNull() {
            addCriterion("f_cord is null");
            return (Criteria) this;
        }

        public Criteria andFCordIsNotNull() {
            addCriterion("f_cord is not null");
            return (Criteria) this;
        }

        public Criteria andFCordEqualTo(Double value) {
            addCriterion("f_cord =", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordNotEqualTo(Double value) {
            addCriterion("f_cord <>", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordGreaterThan(Double value) {
            addCriterion("f_cord >", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordGreaterThanOrEqualTo(Double value) {
            addCriterion("f_cord >=", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordLessThan(Double value) {
            addCriterion("f_cord <", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordLessThanOrEqualTo(Double value) {
            addCriterion("f_cord <=", value, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordIn(List<Double> values) {
            addCriterion("f_cord in", values, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordNotIn(List<Double> values) {
            addCriterion("f_cord not in", values, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordBetween(Double value1, Double value2) {
            addCriterion("f_cord between", value1, value2, "fCord");
            return (Criteria) this;
        }

        public Criteria andFCordNotBetween(Double value1, Double value2) {
            addCriterion("f_cord not between", value1, value2, "fCord");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("f_type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("f_type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("f_type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("f_type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("f_type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("f_type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("f_type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("f_type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("f_type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("f_type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("f_type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("f_type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("f_type not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTimeIsNull() {
            addCriterion("f_time is null");
            return (Criteria) this;
        }

        public Criteria andFTimeIsNotNull() {
            addCriterion("f_time is not null");
            return (Criteria) this;
        }

        public Criteria andFTimeEqualTo(String value) {
            addCriterion("f_time =", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotEqualTo(String value) {
            addCriterion("f_time <>", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeGreaterThan(String value) {
            addCriterion("f_time >", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeGreaterThanOrEqualTo(String value) {
            addCriterion("f_time >=", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeLessThan(String value) {
            addCriterion("f_time <", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeLessThanOrEqualTo(String value) {
            addCriterion("f_time <=", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeLike(String value) {
            addCriterion("f_time like", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotLike(String value) {
            addCriterion("f_time not like", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeIn(List<String> values) {
            addCriterion("f_time in", values, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotIn(List<String> values) {
            addCriterion("f_time not in", values, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeBetween(String value1, String value2) {
            addCriterion("f_time between", value1, value2, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotBetween(String value1, String value2) {
            addCriterion("f_time not between", value1, value2, "fTime");
            return (Criteria) this;
        }

        public Criteria andFPicIsNull() {
            addCriterion("f_pic is null");
            return (Criteria) this;
        }

        public Criteria andFPicIsNotNull() {
            addCriterion("f_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFPicEqualTo(String value) {
            addCriterion("f_pic =", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotEqualTo(String value) {
            addCriterion("f_pic <>", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicGreaterThan(String value) {
            addCriterion("f_pic >", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicGreaterThanOrEqualTo(String value) {
            addCriterion("f_pic >=", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLessThan(String value) {
            addCriterion("f_pic <", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLessThanOrEqualTo(String value) {
            addCriterion("f_pic <=", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLike(String value) {
            addCriterion("f_pic like", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotLike(String value) {
            addCriterion("f_pic not like", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicIn(List<String> values) {
            addCriterion("f_pic in", values, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotIn(List<String> values) {
            addCriterion("f_pic not in", values, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicBetween(String value1, String value2) {
            addCriterion("f_pic between", value1, value2, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotBetween(String value1, String value2) {
            addCriterion("f_pic not between", value1, value2, "fPic");
            return (Criteria) this;
        }

        public Criteria andFVideoIsNull() {
            addCriterion("f_video is null");
            return (Criteria) this;
        }

        public Criteria andFVideoIsNotNull() {
            addCriterion("f_video is not null");
            return (Criteria) this;
        }

        public Criteria andFVideoEqualTo(String value) {
            addCriterion("f_video =", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoNotEqualTo(String value) {
            addCriterion("f_video <>", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoGreaterThan(String value) {
            addCriterion("f_video >", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoGreaterThanOrEqualTo(String value) {
            addCriterion("f_video >=", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoLessThan(String value) {
            addCriterion("f_video <", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoLessThanOrEqualTo(String value) {
            addCriterion("f_video <=", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoLike(String value) {
            addCriterion("f_video like", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoNotLike(String value) {
            addCriterion("f_video not like", value, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoIn(List<String> values) {
            addCriterion("f_video in", values, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoNotIn(List<String> values) {
            addCriterion("f_video not in", values, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoBetween(String value1, String value2) {
            addCriterion("f_video between", value1, value2, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFVideoNotBetween(String value1, String value2) {
            addCriterion("f_video not between", value1, value2, "fVideo");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(Integer value) {
            addCriterion("f_status =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(Integer value) {
            addCriterion("f_status <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(Integer value) {
            addCriterion("f_status >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_status >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(Integer value) {
            addCriterion("f_status <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(Integer value) {
            addCriterion("f_status <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<Integer> values) {
            addCriterion("f_status in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<Integer> values) {
            addCriterion("f_status not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(Integer value1, Integer value2) {
            addCriterion("f_status between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("f_status not between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFTempIsNull() {
            addCriterion("f_temp is null");
            return (Criteria) this;
        }

        public Criteria andFTempIsNotNull() {
            addCriterion("f_temp is not null");
            return (Criteria) this;
        }

        public Criteria andFTempEqualTo(String value) {
            addCriterion("f_temp =", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempNotEqualTo(String value) {
            addCriterion("f_temp <>", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempGreaterThan(String value) {
            addCriterion("f_temp >", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempGreaterThanOrEqualTo(String value) {
            addCriterion("f_temp >=", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempLessThan(String value) {
            addCriterion("f_temp <", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempLessThanOrEqualTo(String value) {
            addCriterion("f_temp <=", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempLike(String value) {
            addCriterion("f_temp like", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempNotLike(String value) {
            addCriterion("f_temp not like", value, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempIn(List<String> values) {
            addCriterion("f_temp in", values, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempNotIn(List<String> values) {
            addCriterion("f_temp not in", values, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempBetween(String value1, String value2) {
            addCriterion("f_temp between", value1, value2, "fTemp");
            return (Criteria) this;
        }

        public Criteria andFTempNotBetween(String value1, String value2) {
            addCriterion("f_temp not between", value1, value2, "fTemp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table film
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
     * This class corresponds to the database table film
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