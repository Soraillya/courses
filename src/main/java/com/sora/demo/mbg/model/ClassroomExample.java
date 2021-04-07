package com.sora.demo.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Integer value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Integer value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Integer value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Integer value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Integer> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Integer> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNull() {
            addCriterion("classroom_name is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNotNull() {
            addCriterion("classroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameEqualTo(String value) {
            addCriterion("classroom_name =", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotEqualTo(String value) {
            addCriterion("classroom_name <>", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThan(String value) {
            addCriterion("classroom_name >", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_name >=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThan(String value) {
            addCriterion("classroom_name <", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThanOrEqualTo(String value) {
            addCriterion("classroom_name <=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLike(String value) {
            addCriterion("classroom_name like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotLike(String value) {
            addCriterion("classroom_name not like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIn(List<String> values) {
            addCriterion("classroom_name in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotIn(List<String> values) {
            addCriterion("classroom_name not in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameBetween(String value1, String value2) {
            addCriterion("classroom_name between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotBetween(String value1, String value2) {
            addCriterion("classroom_name not between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitIsNull() {
            addCriterion("classroom_number_limit is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitIsNotNull() {
            addCriterion("classroom_number_limit is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitEqualTo(Integer value) {
            addCriterion("classroom_number_limit =", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitNotEqualTo(Integer value) {
            addCriterion("classroom_number_limit <>", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitGreaterThan(Integer value) {
            addCriterion("classroom_number_limit >", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_number_limit >=", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitLessThan(Integer value) {
            addCriterion("classroom_number_limit <", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_number_limit <=", value, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitIn(List<Integer> values) {
            addCriterion("classroom_number_limit in", values, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitNotIn(List<Integer> values) {
            addCriterion("classroom_number_limit not in", values, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitBetween(Integer value1, Integer value2) {
            addCriterion("classroom_number_limit between", value1, value2, "classroomNumberLimit");
            return (Criteria) this;
        }

        public Criteria andClassroomNumberLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_number_limit not between", value1, value2, "classroomNumberLimit");
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