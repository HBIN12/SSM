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

        public Criteria andHospitalNumberIsNull() {
            addCriterion("\"hospital number\" is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberIsNotNull() {
            addCriterion("\"hospital number\" is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberEqualTo(Integer value) {
            addCriterion("\"hospital number\" =", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotEqualTo(Integer value) {
            addCriterion("\"hospital number\" <>", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberGreaterThan(Integer value) {
            addCriterion("\"hospital number\" >", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"hospital number\" >=", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberLessThan(Integer value) {
            addCriterion("\"hospital number\" <", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("\"hospital number\" <=", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberIn(List<Integer> values) {
            addCriterion("\"hospital number\" in", values, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotIn(List<Integer> values) {
            addCriterion("\"hospital number\" not in", values, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberBetween(Integer value1, Integer value2) {
            addCriterion("\"hospital number\" between", value1, value2, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("\"hospital number\" not between", value1, value2, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andReagentTypeIsNull() {
            addCriterion("\"reagent type\" is null");
            return (Criteria) this;
        }

        public Criteria andReagentTypeIsNotNull() {
            addCriterion("\"reagent type\" is not null");
            return (Criteria) this;
        }

        public Criteria andReagentTypeEqualTo(String value) {
            addCriterion("\"reagent type\" =", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeNotEqualTo(String value) {
            addCriterion("\"reagent type\" <>", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeGreaterThan(String value) {
            addCriterion("\"reagent type\" >", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"reagent type\" >=", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeLessThan(String value) {
            addCriterion("\"reagent type\" <", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeLessThanOrEqualTo(String value) {
            addCriterion("\"reagent type\" <=", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeLike(String value) {
            addCriterion("\"reagent type\" like", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeNotLike(String value) {
            addCriterion("\"reagent type\" not like", value, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeIn(List<String> values) {
            addCriterion("\"reagent type\" in", values, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeNotIn(List<String> values) {
            addCriterion("\"reagent type\" not in", values, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeBetween(String value1, String value2) {
            addCriterion("\"reagent type\" between", value1, value2, "reagentType");
            return (Criteria) this;
        }

        public Criteria andReagentTypeNotBetween(String value1, String value2) {
            addCriterion("\"reagent type\" not between", value1, value2, "reagentType");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("\"total amount\" is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("\"total amount\" is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Integer value) {
            addCriterion("\"total amount\" =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Integer value) {
            addCriterion("\"total amount\" <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Integer value) {
            addCriterion("\"total amount\" >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"total amount\" >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Integer value) {
            addCriterion("\"total amount\" <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("\"total amount\" <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Integer> values) {
            addCriterion("\"total amount\" in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Integer> values) {
            addCriterion("\"total amount\" not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("\"total amount\" between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("\"total amount\" not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNull() {
            addCriterion("\"remaining amount\" is null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNotNull() {
            addCriterion("\"remaining amount\" is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountEqualTo(Integer value) {
            addCriterion("\"remaining amount\" =", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotEqualTo(Integer value) {
            addCriterion("\"remaining amount\" <>", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThan(Integer value) {
            addCriterion("\"remaining amount\" >", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"remaining amount\" >=", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThan(Integer value) {
            addCriterion("\"remaining amount\" <", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThanOrEqualTo(Integer value) {
            addCriterion("\"remaining amount\" <=", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIn(List<Integer> values) {
            addCriterion("\"remaining amount\" in", values, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotIn(List<Integer> values) {
            addCriterion("\"remaining amount\" not in", values, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountBetween(Integer value1, Integer value2) {
            addCriterion("\"remaining amount\" between", value1, value2, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("\"remaining amount\" not between", value1, value2, "remainingAmount");
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