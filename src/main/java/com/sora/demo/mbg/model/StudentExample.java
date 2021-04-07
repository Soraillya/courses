package com.sora.demo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentImageIsNull() {
            addCriterion("student_image is null");
            return (Criteria) this;
        }

        public Criteria andStudentImageIsNotNull() {
            addCriterion("student_image is not null");
            return (Criteria) this;
        }

        public Criteria andStudentImageEqualTo(String value) {
            addCriterion("student_image =", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotEqualTo(String value) {
            addCriterion("student_image <>", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageGreaterThan(String value) {
            addCriterion("student_image >", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageGreaterThanOrEqualTo(String value) {
            addCriterion("student_image >=", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLessThan(String value) {
            addCriterion("student_image <", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLessThanOrEqualTo(String value) {
            addCriterion("student_image <=", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLike(String value) {
            addCriterion("student_image like", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotLike(String value) {
            addCriterion("student_image not like", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageIn(List<String> values) {
            addCriterion("student_image in", values, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotIn(List<String> values) {
            addCriterion("student_image not in", values, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageBetween(String value1, String value2) {
            addCriterion("student_image between", value1, value2, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotBetween(String value1, String value2) {
            addCriterion("student_image not between", value1, value2, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNull() {
            addCriterion("student_gender is null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNotNull() {
            addCriterion("student_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderEqualTo(Integer value) {
            addCriterion("student_gender =", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotEqualTo(Integer value) {
            addCriterion("student_gender <>", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThan(Integer value) {
            addCriterion("student_gender >", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_gender >=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThan(Integer value) {
            addCriterion("student_gender <", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThanOrEqualTo(Integer value) {
            addCriterion("student_gender <=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIn(List<Integer> values) {
            addCriterion("student_gender in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotIn(List<Integer> values) {
            addCriterion("student_gender not in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderBetween(Integer value1, Integer value2) {
            addCriterion("student_gender between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("student_gender not between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceIsNull() {
            addCriterion("student_account_balance is null");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceIsNotNull() {
            addCriterion("student_account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceEqualTo(String value) {
            addCriterion("student_account_balance =", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceNotEqualTo(String value) {
            addCriterion("student_account_balance <>", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceGreaterThan(String value) {
            addCriterion("student_account_balance >", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("student_account_balance >=", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceLessThan(String value) {
            addCriterion("student_account_balance <", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceLessThanOrEqualTo(String value) {
            addCriterion("student_account_balance <=", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceLike(String value) {
            addCriterion("student_account_balance like", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceNotLike(String value) {
            addCriterion("student_account_balance not like", value, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceIn(List<String> values) {
            addCriterion("student_account_balance in", values, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceNotIn(List<String> values) {
            addCriterion("student_account_balance not in", values, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceBetween(String value1, String value2) {
            addCriterion("student_account_balance between", value1, value2, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentAccountBalanceNotBetween(String value1, String value2) {
            addCriterion("student_account_balance not between", value1, value2, "studentAccountBalance");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordIsNull() {
            addCriterion("student_payment_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordIsNotNull() {
            addCriterion("student_payment_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordEqualTo(String value) {
            addCriterion("student_payment_password =", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordNotEqualTo(String value) {
            addCriterion("student_payment_password <>", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordGreaterThan(String value) {
            addCriterion("student_payment_password >", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_payment_password >=", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordLessThan(String value) {
            addCriterion("student_payment_password <", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_payment_password <=", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordLike(String value) {
            addCriterion("student_payment_password like", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordNotLike(String value) {
            addCriterion("student_payment_password not like", value, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordIn(List<String> values) {
            addCriterion("student_payment_password in", values, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordNotIn(List<String> values) {
            addCriterion("student_payment_password not in", values, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordBetween(String value1, String value2) {
            addCriterion("student_payment_password between", value1, value2, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPaymentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_payment_password not between", value1, value2, "studentPaymentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusIsNull() {
            addCriterion("student_vip_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusIsNotNull() {
            addCriterion("student_vip_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusEqualTo(Integer value) {
            addCriterion("student_vip_status =", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusNotEqualTo(Integer value) {
            addCriterion("student_vip_status <>", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusGreaterThan(Integer value) {
            addCriterion("student_vip_status >", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_vip_status >=", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusLessThan(Integer value) {
            addCriterion("student_vip_status <", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusLessThanOrEqualTo(Integer value) {
            addCriterion("student_vip_status <=", value, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusIn(List<Integer> values) {
            addCriterion("student_vip_status in", values, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusNotIn(List<Integer> values) {
            addCriterion("student_vip_status not in", values, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusBetween(Integer value1, Integer value2) {
            addCriterion("student_vip_status between", value1, value2, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("student_vip_status not between", value1, value2, "studentVipStatus");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeIsNull() {
            addCriterion("student_vip_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeIsNotNull() {
            addCriterion("student_vip_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeEqualTo(Date value) {
            addCriterion("student_vip_time =", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeNotEqualTo(Date value) {
            addCriterion("student_vip_time <>", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeGreaterThan(Date value) {
            addCriterion("student_vip_time >", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_vip_time >=", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeLessThan(Date value) {
            addCriterion("student_vip_time <", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_vip_time <=", value, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeIn(List<Date> values) {
            addCriterion("student_vip_time in", values, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeNotIn(List<Date> values) {
            addCriterion("student_vip_time not in", values, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeBetween(Date value1, Date value2) {
            addCriterion("student_vip_time between", value1, value2, "studentVipTime");
            return (Criteria) this;
        }

        public Criteria andStudentVipTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_vip_time not between", value1, value2, "studentVipTime");
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