package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class ChartofaccountsbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChartofaccountsbillExample() {
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

        public Criteria andCoabidIsNull() {
            addCriterion("coabid is null");
            return (Criteria) this;
        }

        public Criteria andCoabidIsNotNull() {
            addCriterion("coabid is not null");
            return (Criteria) this;
        }

        public Criteria andCoabidEqualTo(Integer value) {
            addCriterion("coabid =", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidNotEqualTo(Integer value) {
            addCriterion("coabid <>", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidGreaterThan(Integer value) {
            addCriterion("coabid >", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coabid >=", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidLessThan(Integer value) {
            addCriterion("coabid <", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidLessThanOrEqualTo(Integer value) {
            addCriterion("coabid <=", value, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidIn(List<Integer> values) {
            addCriterion("coabid in", values, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidNotIn(List<Integer> values) {
            addCriterion("coabid not in", values, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidBetween(Integer value1, Integer value2) {
            addCriterion("coabid between", value1, value2, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoabidNotBetween(Integer value1, Integer value2) {
            addCriterion("coabid not between", value1, value2, "coabid");
            return (Criteria) this;
        }

        public Criteria andCoanameIsNull() {
            addCriterion("coaname is null");
            return (Criteria) this;
        }

        public Criteria andCoanameIsNotNull() {
            addCriterion("coaname is not null");
            return (Criteria) this;
        }

        public Criteria andCoanameEqualTo(String value) {
            addCriterion("coaname =", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameNotEqualTo(String value) {
            addCriterion("coaname <>", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameGreaterThan(String value) {
            addCriterion("coaname >", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameGreaterThanOrEqualTo(String value) {
            addCriterion("coaname >=", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameLessThan(String value) {
            addCriterion("coaname <", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameLessThanOrEqualTo(String value) {
            addCriterion("coaname <=", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameLike(String value) {
            addCriterion("coaname like", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameNotLike(String value) {
            addCriterion("coaname not like", value, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameIn(List<String> values) {
            addCriterion("coaname in", values, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameNotIn(List<String> values) {
            addCriterion("coaname not in", values, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameBetween(String value1, String value2) {
            addCriterion("coaname between", value1, value2, "coaname");
            return (Criteria) this;
        }

        public Criteria andCoanameNotBetween(String value1, String value2) {
            addCriterion("coaname not between", value1, value2, "coaname");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNull() {
            addCriterion("standby1 is null");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNotNull() {
            addCriterion("standby1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby1EqualTo(String value) {
            addCriterion("standby1 =", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotEqualTo(String value) {
            addCriterion("standby1 <>", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThan(String value) {
            addCriterion("standby1 >", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThanOrEqualTo(String value) {
            addCriterion("standby1 >=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThan(String value) {
            addCriterion("standby1 <", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThanOrEqualTo(String value) {
            addCriterion("standby1 <=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Like(String value) {
            addCriterion("standby1 like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotLike(String value) {
            addCriterion("standby1 not like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1In(List<String> values) {
            addCriterion("standby1 in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotIn(List<String> values) {
            addCriterion("standby1 not in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Between(String value1, String value2) {
            addCriterion("standby1 between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotBetween(String value1, String value2) {
            addCriterion("standby1 not between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNull() {
            addCriterion("standby2 is null");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNotNull() {
            addCriterion("standby2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby2EqualTo(String value) {
            addCriterion("standby2 =", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotEqualTo(String value) {
            addCriterion("standby2 <>", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThan(String value) {
            addCriterion("standby2 >", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThanOrEqualTo(String value) {
            addCriterion("standby2 >=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThan(String value) {
            addCriterion("standby2 <", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThanOrEqualTo(String value) {
            addCriterion("standby2 <=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Like(String value) {
            addCriterion("standby2 like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotLike(String value) {
            addCriterion("standby2 not like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2In(List<String> values) {
            addCriterion("standby2 in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotIn(List<String> values) {
            addCriterion("standby2 not in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Between(String value1, String value2) {
            addCriterion("standby2 between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotBetween(String value1, String value2) {
            addCriterion("standby2 not between", value1, value2, "standby2");
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