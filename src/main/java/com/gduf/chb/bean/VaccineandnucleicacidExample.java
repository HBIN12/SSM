package com.gduf.chb.bean;

import java.util.ArrayList;
import java.util.List;

public class VaccineandnucleicacidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VaccineandnucleicacidExample() {
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

        public Criteria andHospitalnumberEqualTo(Integer value) {
            addCriterion("HospitalNumber =", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotEqualTo(Integer value) {
            addCriterion("HospitalNumber <>", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberGreaterThan(Integer value) {
            addCriterion("HospitalNumber >", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("HospitalNumber >=", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberLessThan(Integer value) {
            addCriterion("HospitalNumber <", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberLessThanOrEqualTo(Integer value) {
            addCriterion("HospitalNumber <=", value, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberIn(List<Integer> values) {
            addCriterion("HospitalNumber in", values, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotIn(List<Integer> values) {
            addCriterion("HospitalNumber not in", values, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberBetween(Integer value1, Integer value2) {
            addCriterion("HospitalNumber between", value1, value2, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andHospitalnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("HospitalNumber not between", value1, value2, "hospitalnumber");
            return (Criteria) this;
        }

        public Criteria andReagenttypeIsNull() {
            addCriterion("ReagentType is null");
            return (Criteria) this;
        }

        public Criteria andReagenttypeIsNotNull() {
            addCriterion("ReagentType is not null");
            return (Criteria) this;
        }

        public Criteria andReagenttypeEqualTo(String value) {
            addCriterion("ReagentType =", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeNotEqualTo(String value) {
            addCriterion("ReagentType <>", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeGreaterThan(String value) {
            addCriterion("ReagentType >", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ReagentType >=", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeLessThan(String value) {
            addCriterion("ReagentType <", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeLessThanOrEqualTo(String value) {
            addCriterion("ReagentType <=", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeLike(String value) {
            addCriterion("ReagentType like", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeNotLike(String value) {
            addCriterion("ReagentType not like", value, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeIn(List<String> values) {
            addCriterion("ReagentType in", values, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeNotIn(List<String> values) {
            addCriterion("ReagentType not in", values, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeBetween(String value1, String value2) {
            addCriterion("ReagentType between", value1, value2, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andReagenttypeNotBetween(String value1, String value2) {
            addCriterion("ReagentType not between", value1, value2, "reagenttype");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(Integer value) {
            addCriterion("TotalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(Integer value) {
            addCriterion("TotalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(Integer value) {
            addCriterion("TotalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(Integer value) {
            addCriterion("TotalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(Integer value) {
            addCriterion("TotalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<Integer> values) {
            addCriterion("TotalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<Integer> values) {
            addCriterion("TotalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(Integer value1, Integer value2) {
            addCriterion("TotalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(Integer value1, Integer value2) {
            addCriterion("TotalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIsNull() {
            addCriterion("RemainingAmount is null");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIsNotNull() {
            addCriterion("RemainingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingamountEqualTo(Integer value) {
            addCriterion("RemainingAmount =", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotEqualTo(Integer value) {
            addCriterion("RemainingAmount <>", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountGreaterThan(Integer value) {
            addCriterion("RemainingAmount >", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RemainingAmount >=", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountLessThan(Integer value) {
            addCriterion("RemainingAmount <", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountLessThanOrEqualTo(Integer value) {
            addCriterion("RemainingAmount <=", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIn(List<Integer> values) {
            addCriterion("RemainingAmount in", values, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotIn(List<Integer> values) {
            addCriterion("RemainingAmount not in", values, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountBetween(Integer value1, Integer value2) {
            addCriterion("RemainingAmount between", value1, value2, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotBetween(Integer value1, Integer value2) {
            addCriterion("RemainingAmount not between", value1, value2, "remainingamount");
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