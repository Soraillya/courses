package com.sora.demo.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class Student_orderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Student_orderExample() {
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

        public Criteria andStudentOrderIdIsNull() {
            addCriterion("student_order_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdIsNotNull() {
            addCriterion("student_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdEqualTo(Integer value) {
            addCriterion("student_order_id =", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdNotEqualTo(Integer value) {
            addCriterion("student_order_id <>", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdGreaterThan(Integer value) {
            addCriterion("student_order_id >", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_order_id >=", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdLessThan(Integer value) {
            addCriterion("student_order_id <", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_order_id <=", value, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdIn(List<Integer> values) {
            addCriterion("student_order_id in", values, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdNotIn(List<Integer> values) {
            addCriterion("student_order_id not in", values, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("student_order_id between", value1, value2, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_order_id not between", value1, value2, "studentOrderId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
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

        public Criteria andTotalClassHourIsNull() {
            addCriterion("total_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourIsNotNull() {
            addCriterion("total_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourEqualTo(String value) {
            addCriterion("total_class_hour =", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourNotEqualTo(String value) {
            addCriterion("total_class_hour <>", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourGreaterThan(String value) {
            addCriterion("total_class_hour >", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourGreaterThanOrEqualTo(String value) {
            addCriterion("total_class_hour >=", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourLessThan(String value) {
            addCriterion("total_class_hour <", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourLessThanOrEqualTo(String value) {
            addCriterion("total_class_hour <=", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourLike(String value) {
            addCriterion("total_class_hour like", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourNotLike(String value) {
            addCriterion("total_class_hour not like", value, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourIn(List<String> values) {
            addCriterion("total_class_hour in", values, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourNotIn(List<String> values) {
            addCriterion("total_class_hour not in", values, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourBetween(String value1, String value2) {
            addCriterion("total_class_hour between", value1, value2, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andTotalClassHourNotBetween(String value1, String value2) {
            addCriterion("total_class_hour not between", value1, value2, "totalClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourIsNull() {
            addCriterion("used_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourIsNotNull() {
            addCriterion("used_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourEqualTo(String value) {
            addCriterion("used_class_hour =", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourNotEqualTo(String value) {
            addCriterion("used_class_hour <>", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourGreaterThan(String value) {
            addCriterion("used_class_hour >", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourGreaterThanOrEqualTo(String value) {
            addCriterion("used_class_hour >=", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourLessThan(String value) {
            addCriterion("used_class_hour <", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourLessThanOrEqualTo(String value) {
            addCriterion("used_class_hour <=", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourLike(String value) {
            addCriterion("used_class_hour like", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourNotLike(String value) {
            addCriterion("used_class_hour not like", value, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourIn(List<String> values) {
            addCriterion("used_class_hour in", values, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourNotIn(List<String> values) {
            addCriterion("used_class_hour not in", values, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourBetween(String value1, String value2) {
            addCriterion("used_class_hour between", value1, value2, "usedClassHour");
            return (Criteria) this;
        }

        public Criteria andUsedClassHourNotBetween(String value1, String value2) {
            addCriterion("used_class_hour not between", value1, value2, "usedClassHour");
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