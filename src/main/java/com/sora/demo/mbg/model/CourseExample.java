package com.sora.demo.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(String value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(String value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(String value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(String value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(String value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLike(String value) {
            addCriterion("classroom_id like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotLike(String value) {
            addCriterion("classroom_id not like", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<String> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<String> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(String value1, String value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(String value1, String value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseImageIsNull() {
            addCriterion("course_image is null");
            return (Criteria) this;
        }

        public Criteria andCourseImageIsNotNull() {
            addCriterion("course_image is not null");
            return (Criteria) this;
        }

        public Criteria andCourseImageEqualTo(String value) {
            addCriterion("course_image =", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotEqualTo(String value) {
            addCriterion("course_image <>", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageGreaterThan(String value) {
            addCriterion("course_image >", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageGreaterThanOrEqualTo(String value) {
            addCriterion("course_image >=", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLessThan(String value) {
            addCriterion("course_image <", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLessThanOrEqualTo(String value) {
            addCriterion("course_image <=", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageLike(String value) {
            addCriterion("course_image like", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotLike(String value) {
            addCriterion("course_image not like", value, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageIn(List<String> values) {
            addCriterion("course_image in", values, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotIn(List<String> values) {
            addCriterion("course_image not in", values, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageBetween(String value1, String value2) {
            addCriterion("course_image between", value1, value2, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseImageNotBetween(String value1, String value2) {
            addCriterion("course_image not between", value1, value2, "courseImage");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateIsNull() {
            addCriterion("course_start_date is null");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateIsNotNull() {
            addCriterion("course_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateEqualTo(Date value) {
            addCriterion("course_start_date =", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateNotEqualTo(Date value) {
            addCriterion("course_start_date <>", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateGreaterThan(Date value) {
            addCriterion("course_start_date >", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_start_date >=", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateLessThan(Date value) {
            addCriterion("course_start_date <", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateLessThanOrEqualTo(Date value) {
            addCriterion("course_start_date <=", value, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateIn(List<Date> values) {
            addCriterion("course_start_date in", values, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateNotIn(List<Date> values) {
            addCriterion("course_start_date not in", values, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateBetween(Date value1, Date value2) {
            addCriterion("course_start_date between", value1, value2, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseStartDateNotBetween(Date value1, Date value2) {
            addCriterion("course_start_date not between", value1, value2, "courseStartDate");
            return (Criteria) this;
        }

        public Criteria andCourseTermIsNull() {
            addCriterion("course_term is null");
            return (Criteria) this;
        }

        public Criteria andCourseTermIsNotNull() {
            addCriterion("course_term is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTermEqualTo(Integer value) {
            addCriterion("course_term =", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotEqualTo(Integer value) {
            addCriterion("course_term <>", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermGreaterThan(Integer value) {
            addCriterion("course_term >", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_term >=", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermLessThan(Integer value) {
            addCriterion("course_term <", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermLessThanOrEqualTo(Integer value) {
            addCriterion("course_term <=", value, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermIn(List<Integer> values) {
            addCriterion("course_term in", values, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotIn(List<Integer> values) {
            addCriterion("course_term not in", values, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermBetween(Integer value1, Integer value2) {
            addCriterion("course_term between", value1, value2, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseTermNotBetween(Integer value1, Integer value2) {
            addCriterion("course_term not between", value1, value2, "courseTerm");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitIsNull() {
            addCriterion("course_number_limit is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitIsNotNull() {
            addCriterion("course_number_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitEqualTo(String value) {
            addCriterion("course_number_limit =", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitNotEqualTo(String value) {
            addCriterion("course_number_limit <>", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitGreaterThan(String value) {
            addCriterion("course_number_limit >", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitGreaterThanOrEqualTo(String value) {
            addCriterion("course_number_limit >=", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitLessThan(String value) {
            addCriterion("course_number_limit <", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitLessThanOrEqualTo(String value) {
            addCriterion("course_number_limit <=", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitLike(String value) {
            addCriterion("course_number_limit like", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitNotLike(String value) {
            addCriterion("course_number_limit not like", value, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitIn(List<String> values) {
            addCriterion("course_number_limit in", values, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitNotIn(List<String> values) {
            addCriterion("course_number_limit not in", values, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitBetween(String value1, String value2) {
            addCriterion("course_number_limit between", value1, value2, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLimitNotBetween(String value1, String value2) {
            addCriterion("course_number_limit not between", value1, value2, "courseNumberLimit");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(BigDecimal value) {
            addCriterion("course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(BigDecimal value) {
            addCriterion("course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(BigDecimal value) {
            addCriterion("course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(BigDecimal value) {
            addCriterion("course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<BigDecimal> values) {
            addCriterion("course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<BigDecimal> values) {
            addCriterion("course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceIsNull() {
            addCriterion("course_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceIsNotNull() {
            addCriterion("course_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceEqualTo(BigDecimal value) {
            addCriterion("course_vip_price =", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceNotEqualTo(BigDecimal value) {
            addCriterion("course_vip_price <>", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceGreaterThan(BigDecimal value) {
            addCriterion("course_vip_price >", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("course_vip_price >=", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceLessThan(BigDecimal value) {
            addCriterion("course_vip_price <", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("course_vip_price <=", value, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceIn(List<BigDecimal> values) {
            addCriterion("course_vip_price in", values, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceNotIn(List<BigDecimal> values) {
            addCriterion("course_vip_price not in", values, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("course_vip_price between", value1, value2, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseVipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("course_vip_price not between", value1, value2, "courseVipPrice");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNull() {
            addCriterion("course_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNotNull() {
            addCriterion("course_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusEqualTo(Integer value) {
            addCriterion("course_status =", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotEqualTo(Integer value) {
            addCriterion("course_status <>", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThan(Integer value) {
            addCriterion("course_status >", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_status >=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThan(Integer value) {
            addCriterion("course_status <", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("course_status <=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIn(List<Integer> values) {
            addCriterion("course_status in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotIn(List<Integer> values) {
            addCriterion("course_status not in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusBetween(Integer value1, Integer value2) {
            addCriterion("course_status between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("course_status not between", value1, value2, "courseStatus");
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