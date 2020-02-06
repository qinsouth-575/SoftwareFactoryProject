package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class AssusestateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssusestateExample() {
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

        public Criteria andStateidIsNull() {
            addCriterion("StateID is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("StateID is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(String value) {
            addCriterion("StateID =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(String value) {
            addCriterion("StateID <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(String value) {
            addCriterion("StateID >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(String value) {
            addCriterion("StateID >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(String value) {
            addCriterion("StateID <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(String value) {
            addCriterion("StateID <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLike(String value) {
            addCriterion("StateID like", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotLike(String value) {
            addCriterion("StateID not like", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<String> values) {
            addCriterion("StateID in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<String> values) {
            addCriterion("StateID not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(String value1, String value2) {
            addCriterion("StateID between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(String value1, String value2) {
            addCriterion("StateID not between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNull() {
            addCriterion("StateName is null");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNotNull() {
            addCriterion("StateName is not null");
            return (Criteria) this;
        }

        public Criteria andStatenameEqualTo(String value) {
            addCriterion("StateName =", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotEqualTo(String value) {
            addCriterion("StateName <>", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThan(String value) {
            addCriterion("StateName >", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("StateName >=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThan(String value) {
            addCriterion("StateName <", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThanOrEqualTo(String value) {
            addCriterion("StateName <=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLike(String value) {
            addCriterion("StateName like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotLike(String value) {
            addCriterion("StateName not like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameIn(List<String> values) {
            addCriterion("StateName in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotIn(List<String> values) {
            addCriterion("StateName not in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameBetween(String value1, String value2) {
            addCriterion("StateName between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotBetween(String value1, String value2) {
            addCriterion("StateName not between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andIsdeprIsNull() {
            addCriterion("IsDepr is null");
            return (Criteria) this;
        }

        public Criteria andIsdeprIsNotNull() {
            addCriterion("IsDepr is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeprEqualTo(Boolean value) {
            addCriterion("IsDepr =", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprNotEqualTo(Boolean value) {
            addCriterion("IsDepr <>", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprGreaterThan(Boolean value) {
            addCriterion("IsDepr >", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDepr >=", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprLessThan(Boolean value) {
            addCriterion("IsDepr <", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDepr <=", value, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprIn(List<Boolean> values) {
            addCriterion("IsDepr in", values, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprNotIn(List<Boolean> values) {
            addCriterion("IsDepr not in", values, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDepr between", value1, value2, "isdepr");
            return (Criteria) this;
        }

        public Criteria andIsdeprNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDepr not between", value1, value2, "isdepr");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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