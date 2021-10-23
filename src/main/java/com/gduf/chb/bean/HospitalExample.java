package com.gduf.chb.bean;

import java.util.ArrayList;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalExample() {
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

        public Criteria andHospitalnumberIsNull() {
            addCriterion("HospitalNumber is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberIsNotNull() {
            addCriterion("HospitalNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberEqualTo(String value) {
            addCriterion("HospitalNumber =", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotEqualTo(String value) {
            addCriterion("HospitalNumber <>", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberGreaterThan(String value) {
            addCriterion("HospitalNumber >", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberGreaterThanOrEqualTo(String value) {
            addCriterion("HospitalNumber >=", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberLessThan(String value) {
            addCriterion("HospitalNumber <", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberLessThanOrEqualTo(String value) {
            addCriterion("HospitalNumber <=", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberLike(String value) {
            addCriterion("HospitalNumber like", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotLike(String value) {
            addCriterion("HospitalNumber not like", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberIn(List<String> values) {
            addCriterion("HospitalNumber in", values, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotIn(List<String> values) {
            addCriterion("HospitalNumber not in", values, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberBetween(String value1, String value2) {
            addCriterion("HospitalNumber between", value1, value2, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotBetween(String value1, String value2) {
            addCriterion("HospitalNumber not between", value1, value2, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("HospitalName is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("HospitalName is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("HospitalName =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("HospitalName <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("HospitalName >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("HospitalName >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("HospitalName <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("HospitalName <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("HospitalName like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("HospitalName not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("HospitalName in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("HospitalName not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("HospitalName between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("HospitalName not between", value1, value2, "hospitalname");
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