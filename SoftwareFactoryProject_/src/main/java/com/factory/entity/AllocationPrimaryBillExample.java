package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AllocationPrimaryBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationPrimaryBillExample() {
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

        public Criteria andApbidIsNull() {
            addCriterion("apbid is null");
            return (Criteria) this;
        }

        public Criteria andApbidIsNotNull() {
            addCriterion("apbid is not null");
            return (Criteria) this;
        }

        public Criteria andApbidEqualTo(String value) {
            addCriterion("apbid =", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotEqualTo(String value) {
            addCriterion("apbid <>", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidGreaterThan(String value) {
            addCriterion("apbid >", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidGreaterThanOrEqualTo(String value) {
            addCriterion("apbid >=", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLessThan(String value) {
            addCriterion("apbid <", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLessThanOrEqualTo(String value) {
            addCriterion("apbid <=", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLike(String value) {
            addCriterion("apbid like", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotLike(String value) {
            addCriterion("apbid not like", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidIn(List<String> values) {
            addCriterion("apbid in", values, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotIn(List<String> values) {
            addCriterion("apbid not in", values, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidBetween(String value1, String value2) {
            addCriterion("apbid between", value1, value2, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotBetween(String value1, String value2) {
            addCriterion("apbid not between", value1, value2, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbdateIsNull() {
            addCriterion("apbDate is null");
            return (Criteria) this;
        }

        public Criteria andApbdateIsNotNull() {
            addCriterion("apbDate is not null");
            return (Criteria) this;
        }

        public Criteria andApbdateEqualTo(Date value) {
            addCriterionForJDBCDate("apbDate =", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("apbDate <>", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("apbDate >", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apbDate >=", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateLessThan(Date value) {
            addCriterionForJDBCDate("apbDate <", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apbDate <=", value, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateIn(List<Date> values) {
            addCriterionForJDBCDate("apbDate in", values, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("apbDate not in", values, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apbDate between", value1, value2, "apbdate");
            return (Criteria) this;
        }

        public Criteria andApbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apbDate not between", value1, value2, "apbdate");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidIsNull() {
            addCriterion("foldWarehouseid is null");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidIsNotNull() {
            addCriterion("foldWarehouseid is not null");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidEqualTo(String value) {
            addCriterion("foldWarehouseid =", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidNotEqualTo(String value) {
            addCriterion("foldWarehouseid <>", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidGreaterThan(String value) {
            addCriterion("foldWarehouseid >", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("foldWarehouseid >=", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidLessThan(String value) {
            addCriterion("foldWarehouseid <", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("foldWarehouseid <=", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidLike(String value) {
            addCriterion("foldWarehouseid like", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidNotLike(String value) {
            addCriterion("foldWarehouseid not like", value, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidIn(List<String> values) {
            addCriterion("foldWarehouseid in", values, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidNotIn(List<String> values) {
            addCriterion("foldWarehouseid not in", values, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidBetween(String value1, String value2) {
            addCriterion("foldWarehouseid between", value1, value2, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFoldwarehouseidNotBetween(String value1, String value2) {
            addCriterion("foldWarehouseid not between", value1, value2, "foldwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidIsNull() {
            addCriterion("exportWarehouseid is null");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidIsNotNull() {
            addCriterion("exportWarehouseid is not null");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidEqualTo(String value) {
            addCriterion("exportWarehouseid =", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidNotEqualTo(String value) {
            addCriterion("exportWarehouseid <>", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidGreaterThan(String value) {
            addCriterion("exportWarehouseid >", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("exportWarehouseid >=", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidLessThan(String value) {
            addCriterion("exportWarehouseid <", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("exportWarehouseid <=", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidLike(String value) {
            addCriterion("exportWarehouseid like", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidNotLike(String value) {
            addCriterion("exportWarehouseid not like", value, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidIn(List<String> values) {
            addCriterion("exportWarehouseid in", values, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidNotIn(List<String> values) {
            addCriterion("exportWarehouseid not in", values, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidBetween(String value1, String value2) {
            addCriterion("exportWarehouseid between", value1, value2, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andExportwarehouseidNotBetween(String value1, String value2) {
            addCriterion("exportWarehouseid not between", value1, value2, "exportwarehouseid");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerIsNull() {
            addCriterion("documentMaker is null");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerIsNotNull() {
            addCriterion("documentMaker is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerEqualTo(String value) {
            addCriterion("documentMaker =", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerNotEqualTo(String value) {
            addCriterion("documentMaker <>", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerGreaterThan(String value) {
            addCriterion("documentMaker >", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerGreaterThanOrEqualTo(String value) {
            addCriterion("documentMaker >=", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerLessThan(String value) {
            addCriterion("documentMaker <", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerLessThanOrEqualTo(String value) {
            addCriterion("documentMaker <=", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerLike(String value) {
            addCriterion("documentMaker like", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerNotLike(String value) {
            addCriterion("documentMaker not like", value, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerIn(List<String> values) {
            addCriterion("documentMaker in", values, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerNotIn(List<String> values) {
            addCriterion("documentMaker not in", values, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerBetween(String value1, String value2) {
            addCriterion("documentMaker between", value1, value2, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andDocumentmakerNotBetween(String value1, String value2) {
            addCriterion("documentMaker not between", value1, value2, "documentmaker");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("Verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("Verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("Verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("Verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("Verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("Verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("Verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("Verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("Verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("Verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("Verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("Verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("Verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("Verifier not between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("custom1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("custom1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("custom1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("custom1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("custom1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("custom1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("custom1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("custom1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("custom1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("custom1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("custom1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("custom1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("custom2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("custom2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("custom2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("custom2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("custom2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("custom2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("custom2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("custom2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("custom2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("custom2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("custom2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("custom2 not between", value1, value2, "custom2");
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