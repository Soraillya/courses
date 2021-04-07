package com.sora.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Signed_inExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Signed_inExample() {
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

        public Criteria andSignedInIdIsNull() {
            addCriterion("signed_in_id is null");
            return (Criteria) this;
        }

        public Criteria andSignedInIdIsNotNull() {
            addCriterion("signed_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignedInIdEqualTo(Integer value) {
            addCriterion("signed_in_id =", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdNotEqualTo(Integer value) {
            addCriterion("signed_in_id <>", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdGreaterThan(Integer value) {
            addCriterion("signed_in_id >", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("signed_in_id >=", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdLessThan(Integer value) {
            addCriterion("signed_in_id <", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdLessThanOrEqualTo(Integer value) {
            addCriterion("signed_in_id <=", value, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdIn(List<Integer> values) {
            addCriterion("signed_in_id in", values, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdNotIn(List<Integer> values) {
            addCriterion("signed_in_id not in", values, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdBetween(Integer value1, Integer value2) {
            addCriterion("signed_in_id between", value1, value2, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignedInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("signed_in_id not between", value1, value2, "signedInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdIsNull() {
            addCriterion("sign_in_id is null");
            return (Criteria) this;
        }

        public Criteria andSignInIdIsNotNull() {
            addCriterion("sign_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignInIdEqualTo(Integer value) {
            addCriterion("sign_in_id =", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotEqualTo(Integer value) {
            addCriterion("sign_in_id <>", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThan(Integer value) {
            addCriterion("sign_in_id >", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_id >=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThan(Integer value) {
            addCriterion("sign_in_id <", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_id <=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdIn(List<Integer> values) {
            addCriterion("sign_in_id in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotIn(List<Integer> values) {
            addCriterion("sign_in_id not in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_id between", value1, value2, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_id not between", value1, value2, "signInId");
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

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeIsNull() {
            addCriterion("signed_in_time is null");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeIsNotNull() {
            addCriterion("signed_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeEqualTo(Date value) {
            addCriterion("signed_in_time =", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeNotEqualTo(Date value) {
            addCriterion("signed_in_time <>", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeGreaterThan(Date value) {
            addCriterion("signed_in_time >", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signed_in_time >=", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeLessThan(Date value) {
            addCriterion("signed_in_time <", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeLessThanOrEqualTo(Date value) {
            addCriterion("signed_in_time <=", value, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeIn(List<Date> values) {
            addCriterion("signed_in_time in", values, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeNotIn(List<Date> values) {
            addCriterion("signed_in_time not in", values, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeBetween(Date value1, Date value2) {
            addCriterion("signed_in_time between", value1, value2, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInTimeNotBetween(Date value1, Date value2) {
            addCriterion("signed_in_time not between", value1, value2, "signedInTime");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusIsNull() {
            addCriterion("signed_in_status is null");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusIsNotNull() {
            addCriterion("signed_in_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusEqualTo(String value) {
            addCriterion("signed_in_status =", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusNotEqualTo(String value) {
            addCriterion("signed_in_status <>", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusGreaterThan(String value) {
            addCriterion("signed_in_status >", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusGreaterThanOrEqualTo(String value) {
            addCriterion("signed_in_status >=", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusLessThan(String value) {
            addCriterion("signed_in_status <", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusLessThanOrEqualTo(String value) {
            addCriterion("signed_in_status <=", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusLike(String value) {
            addCriterion("signed_in_status like", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusNotLike(String value) {
            addCriterion("signed_in_status not like", value, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusIn(List<String> values) {
            addCriterion("signed_in_status in", values, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusNotIn(List<String> values) {
            addCriterion("signed_in_status not in", values, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusBetween(String value1, String value2) {
            addCriterion("signed_in_status between", value1, value2, "signedInStatus");
            return (Criteria) this;
        }

        public Criteria andSignedInStatusNotBetween(String value1, String value2) {
            addCriterion("signed_in_status not between", value1, value2, "signedInStatus");
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