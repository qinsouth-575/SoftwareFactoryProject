package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockprimarybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockprimarybillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSpbidIsNull() {
            addCriterion("spbid is null");
            return (Criteria) this;
        }

        public Criteria andSpbidIsNotNull() {
            addCriterion("spbid is not null");
            return (Criteria) this;
        }

        public Criteria andSpbidEqualTo(Integer value) {
            addCriterion("spbid =", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidNotEqualTo(Integer value) {
            addCriterion("spbid <>", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidGreaterThan(Integer value) {
            addCriterion("spbid >", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spbid >=", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidLessThan(Integer value) {
            addCriterion("spbid <", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidLessThanOrEqualTo(Integer value) {
            addCriterion("spbid <=", value, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidIn(List<Integer> values) {
            addCriterion("spbid in", values, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidNotIn(List<Integer> values) {
            addCriterion("spbid not in", values, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidBetween(Integer value1, Integer value2) {
            addCriterion("spbid between", value1, value2, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbidNotBetween(Integer value1, Integer value2) {
            addCriterion("spbid not between", value1, value2, "spbid");
            return (Criteria) this;
        }

        public Criteria andSpbdateIsNull() {
            addCriterion("spbDate is null");
            return (Criteria) this;
        }

        public Criteria andSpbdateIsNotNull() {
            addCriterion("spbDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpbdateEqualTo(Date value) {
            addCriterionForJDBCDate("spbDate =", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("spbDate <>", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("spbDate >", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("spbDate >=", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateLessThan(Date value) {
            addCriterionForJDBCDate("spbDate <", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("spbDate <=", value, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateIn(List<Date> values) {
            addCriterionForJDBCDate("spbDate in", values, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("spbDate not in", values, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("spbDate between", value1, value2, "spbdate");
            return (Criteria) this;
        }

        public Criteria andSpbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("spbDate not between", value1, value2, "spbdate");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseid is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseid is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Integer value) {
            addCriterion("warehouseid =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Integer value) {
            addCriterion("warehouseid <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Integer value) {
            addCriterion("warehouseid >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouseid >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Integer value) {
            addCriterion("warehouseid <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("warehouseid <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Integer> values) {
            addCriterion("warehouseid in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Integer> values) {
            addCriterion("warehouseid not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("warehouseid between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouseid not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andStocktypeIsNull() {
            addCriterion("stocktype is null");
            return (Criteria) this;
        }

        public Criteria andStocktypeIsNotNull() {
            addCriterion("stocktype is not null");
            return (Criteria) this;
        }

        public Criteria andStocktypeEqualTo(String value) {
            addCriterion("stocktype =", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotEqualTo(String value) {
            addCriterion("stocktype <>", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeGreaterThan(String value) {
            addCriterion("stocktype >", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeGreaterThanOrEqualTo(String value) {
            addCriterion("stocktype >=", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLessThan(String value) {
            addCriterion("stocktype <", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLessThanOrEqualTo(String value) {
            addCriterion("stocktype <=", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLike(String value) {
            addCriterion("stocktype like", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotLike(String value) {
            addCriterion("stocktype not like", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeIn(List<String> values) {
            addCriterion("stocktype in", values, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotIn(List<String> values) {
            addCriterion("stocktype not in", values, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeBetween(String value1, String value2) {
            addCriterion("stocktype between", value1, value2, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotBetween(String value1, String value2) {
            addCriterion("stocktype not between", value1, value2, "stocktype");
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