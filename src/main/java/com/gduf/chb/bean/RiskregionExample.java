package com.gduf.chb.bean;

import java.util.ArrayList;
import java.util.List;

public class RiskregionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskregionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportingPersonIsNull() {
            addCriterion("\"reporting person\" is null");
            return (Criteria) this;
        }

        public Criteria andReportingPersonIsNotNull() {
            addCriterion("\"reporting person\" is not null");
            return (Criteria) this;
        }

        public Criteria andReportingPersonEqualTo(String value) {
            addCriterion("\"reporting person\" =", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonNotEqualTo(String value) {
            addCriterion("\"reporting person\" <>", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonGreaterThan(String value) {
            addCriterion("\"reporting person\" >", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonGreaterThanOrEqualTo(String value) {
            addCriterion("\"reporting person\" >=", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonLessThan(String value) {
            addCriterion("\"reporting person\" <", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonLessThanOrEqualTo(String value) {
            addCriterion("\"reporting person\" <=", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonLike(String value) {
            addCriterion("\"reporting person\" like", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonNotLike(String value) {
            addCriterion("\"reporting person\" not like", value, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonIn(List<String> values) {
            addCriterion("\"reporting person\" in", values, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonNotIn(List<String> values) {
            addCriterion("\"reporting person\" not in", values, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonBetween(String value1, String value2) {
            addCriterion("\"reporting person\" between", value1, value2, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andReportingPersonNotBetween(String value1, String value2) {
            addCriterion("\"reporting person\" not between", value1, value2, "reportingPerson");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRiskSituationIsNull() {
            addCriterion("\"risk situation\" is null");
            return (Criteria) this;
        }

        public Criteria andRiskSituationIsNotNull() {
            addCriterion("\"risk situation\" is not null");
            return (Criteria) this;
        }

        public Criteria andRiskSituationEqualTo(String value) {
            addCriterion("\"risk situation\" =", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationNotEqualTo(String value) {
            addCriterion("\"risk situation\" <>", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationGreaterThan(String value) {
            addCriterion("\"risk situation\" >", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationGreaterThanOrEqualTo(String value) {
            addCriterion("\"risk situation\" >=", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationLessThan(String value) {
            addCriterion("\"risk situation\" <", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationLessThanOrEqualTo(String value) {
            addCriterion("\"risk situation\" <=", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationLike(String value) {
            addCriterion("\"risk situation\" like", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationNotLike(String value) {
            addCriterion("\"risk situation\" not like", value, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationIn(List<String> values) {
            addCriterion("\"risk situation\" in", values, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationNotIn(List<String> values) {
            addCriterion("\"risk situation\" not in", values, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationBetween(String value1, String value2) {
            addCriterion("\"risk situation\" between", value1, value2, "riskSituation");
            return (Criteria) this;
        }

        public Criteria andRiskSituationNotBetween(String value1, String value2) {
            addCriterion("\"risk situation\" not between", value1, value2, "riskSituation");
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