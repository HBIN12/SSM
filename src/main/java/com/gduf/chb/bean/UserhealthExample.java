package com.gduf.chb.bean;

import java.util.ArrayList;
import java.util.List;

public class UserhealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserhealthExample() {
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

        public Criteria andIdcardIsNull() {
            addCriterion("IDcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidIsNull() {
            addCriterion("\"nucleic acid\" is null");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidIsNotNull() {
            addCriterion("\"nucleic acid\" is not null");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidEqualTo(String value) {
            addCriterion("\"nucleic acid\" =", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidNotEqualTo(String value) {
            addCriterion("\"nucleic acid\" <>", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidGreaterThan(String value) {
            addCriterion("\"nucleic acid\" >", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidGreaterThanOrEqualTo(String value) {
            addCriterion("\"nucleic acid\" >=", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidLessThan(String value) {
            addCriterion("\"nucleic acid\" <", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidLessThanOrEqualTo(String value) {
            addCriterion("\"nucleic acid\" <=", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidLike(String value) {
            addCriterion("\"nucleic acid\" like", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidNotLike(String value) {
            addCriterion("\"nucleic acid\" not like", value, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidIn(List<String> values) {
            addCriterion("\"nucleic acid\" in", values, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidNotIn(List<String> values) {
            addCriterion("\"nucleic acid\" not in", values, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidBetween(String value1, String value2) {
            addCriterion("\"nucleic acid\" between", value1, value2, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andNucleicAcidNotBetween(String value1, String value2) {
            addCriterion("\"nucleic acid\" not between", value1, value2, "nucleicAcid");
            return (Criteria) this;
        }

        public Criteria andVaccinationIsNull() {
            addCriterion("vaccination is null");
            return (Criteria) this;
        }

        public Criteria andVaccinationIsNotNull() {
            addCriterion("vaccination is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinationEqualTo(String value) {
            addCriterion("vaccination =", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationNotEqualTo(String value) {
            addCriterion("vaccination <>", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationGreaterThan(String value) {
            addCriterion("vaccination >", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationGreaterThanOrEqualTo(String value) {
            addCriterion("vaccination >=", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationLessThan(String value) {
            addCriterion("vaccination <", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationLessThanOrEqualTo(String value) {
            addCriterion("vaccination <=", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationLike(String value) {
            addCriterion("vaccination like", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationNotLike(String value) {
            addCriterion("vaccination not like", value, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationIn(List<String> values) {
            addCriterion("vaccination in", values, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationNotIn(List<String> values) {
            addCriterion("vaccination not in", values, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationBetween(String value1, String value2) {
            addCriterion("vaccination between", value1, value2, "vaccination");
            return (Criteria) this;
        }

        public Criteria andVaccinationNotBetween(String value1, String value2) {
            addCriterion("vaccination not between", value1, value2, "vaccination");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(String value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(String value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(String value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(String value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(String value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLike(String value) {
            addCriterion("current like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotLike(String value) {
            addCriterion("current not like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<String> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<String> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(String value1, String value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(String value1, String value2) {
            addCriterion("current not between", value1, value2, "current");
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