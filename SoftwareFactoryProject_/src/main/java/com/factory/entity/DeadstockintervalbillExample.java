package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class DeadstockintervalbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeadstockintervalbillExample() {
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

        public Criteria andDsibidIsNull() {
            addCriterion("dsibid is null");
            return (Criteria) this;
        }

        public Criteria andDsibidIsNotNull() {
            addCriterion("dsibid is not null");
            return (Criteria) this;
        }

        public Criteria andDsibidEqualTo(Integer value) {
            addCriterion("dsibid =", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidNotEqualTo(Integer value) {
            addCriterion("dsibid <>", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidGreaterThan(Integer value) {
            addCriterion("dsibid >", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsibid >=", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidLessThan(Integer value) {
            addCriterion("dsibid <", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidLessThanOrEqualTo(Integer value) {
            addCriterion("dsibid <=", value, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidIn(List<Integer> values) {
            addCriterion("dsibid in", values, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidNotIn(List<Integer> values) {
            addCriterion("dsibid not in", values, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidBetween(Integer value1, Integer value2) {
            addCriterion("dsibid between", value1, value2, "dsibid");
            return (Criteria) this;
        }

        public Criteria andDsibidNotBetween(Integer value1, Integer value2) {
            addCriterion("dsibid not between", value1, value2, "dsibid");
            return (Criteria) this;
        }

        public Criteria andStartdayIsNull() {
            addCriterion("startDay is null");
            return (Criteria) this;
        }

        public Criteria andStartdayIsNotNull() {
            addCriterion("startDay is not null");
            return (Criteria) this;
        }

        public Criteria andStartdayEqualTo(Integer value) {
            addCriterion("startDay =", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotEqualTo(Integer value) {
            addCriterion("startDay <>", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThan(Integer value) {
            addCriterion("startDay >", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("startDay >=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThan(Integer value) {
            addCriterion("startDay <", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThanOrEqualTo(Integer value) {
            addCriterion("startDay <=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayIn(List<Integer> values) {
            addCriterion("startDay in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotIn(List<Integer> values) {
            addCriterion("startDay not in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayBetween(Integer value1, Integer value2) {
            addCriterion("startDay between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotBetween(Integer value1, Integer value2) {
            addCriterion("startDay not between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andOverdayIsNull() {
            addCriterion("overDay is null");
            return (Criteria) this;
        }

        public Criteria andOverdayIsNotNull() {
            addCriterion("overDay is not null");
            return (Criteria) this;
        }

        public Criteria andOverdayEqualTo(Integer value) {
            addCriterion("overDay =", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayNotEqualTo(Integer value) {
            addCriterion("overDay <>", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayGreaterThan(Integer value) {
            addCriterion("overDay >", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("overDay >=", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayLessThan(Integer value) {
            addCriterion("overDay <", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayLessThanOrEqualTo(Integer value) {
            addCriterion("overDay <=", value, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayIn(List<Integer> values) {
            addCriterion("overDay in", values, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayNotIn(List<Integer> values) {
            addCriterion("overDay not in", values, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayBetween(Integer value1, Integer value2) {
            addCriterion("overDay between", value1, value2, "overday");
            return (Criteria) this;
        }

        public Criteria andOverdayNotBetween(Integer value1, Integer value2) {
            addCriterion("overDay not between", value1, value2, "overday");
            return (Criteria) this;
        }

        public Criteria andDsiexplainIsNull() {
            addCriterion("dsiexplain is null");
            return (Criteria) this;
        }

        public Criteria andDsiexplainIsNotNull() {
            addCriterion("dsiexplain is not null");
            return (Criteria) this;
        }

        public Criteria andDsiexplainEqualTo(String value) {
            addCriterion("dsiexplain =", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainNotEqualTo(String value) {
            addCriterion("dsiexplain <>", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainGreaterThan(String value) {
            addCriterion("dsiexplain >", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainGreaterThanOrEqualTo(String value) {
            addCriterion("dsiexplain >=", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainLessThan(String value) {
            addCriterion("dsiexplain <", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainLessThanOrEqualTo(String value) {
            addCriterion("dsiexplain <=", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainLike(String value) {
            addCriterion("dsiexplain like", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainNotLike(String value) {
            addCriterion("dsiexplain not like", value, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainIn(List<String> values) {
            addCriterion("dsiexplain in", values, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainNotIn(List<String> values) {
            addCriterion("dsiexplain not in", values, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainBetween(String value1, String value2) {
            addCriterion("dsiexplain between", value1, value2, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andDsiexplainNotBetween(String value1, String value2) {
            addCriterion("dsiexplain not between", value1, value2, "dsiexplain");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNull() {
            addCriterion("standby is null");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNotNull() {
            addCriterion("standby is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyEqualTo(String value) {
            addCriterion("standby =", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotEqualTo(String value) {
            addCriterion("standby <>", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThan(String value) {
            addCriterion("standby >", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThanOrEqualTo(String value) {
            addCriterion("standby >=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThan(String value) {
            addCriterion("standby <", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThanOrEqualTo(String value) {
            addCriterion("standby <=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLike(String value) {
            addCriterion("standby like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotLike(String value) {
            addCriterion("standby not like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyIn(List<String> values) {
            addCriterion("standby in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotIn(List<String> values) {
            addCriterion("standby not in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyBetween(String value1, String value2) {
            addCriterion("standby between", value1, value2, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotBetween(String value1, String value2) {
            addCriterion("standby not between", value1, value2, "standby");
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