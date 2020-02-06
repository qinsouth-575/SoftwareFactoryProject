package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class ComfaremeansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComfaremeansExample() {
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

        public Criteria andFareclassidIsNull() {
            addCriterion("FareClassID is null");
            return (Criteria) this;
        }

        public Criteria andFareclassidIsNotNull() {
            addCriterion("FareClassID is not null");
            return (Criteria) this;
        }

        public Criteria andFareclassidEqualTo(String value) {
            addCriterion("FareClassID =", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidNotEqualTo(String value) {
            addCriterion("FareClassID <>", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidGreaterThan(String value) {
            addCriterion("FareClassID >", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidGreaterThanOrEqualTo(String value) {
            addCriterion("FareClassID >=", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidLessThan(String value) {
            addCriterion("FareClassID <", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidLessThanOrEqualTo(String value) {
            addCriterion("FareClassID <=", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidLike(String value) {
            addCriterion("FareClassID like", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidNotLike(String value) {
            addCriterion("FareClassID not like", value, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidIn(List<String> values) {
            addCriterion("FareClassID in", values, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidNotIn(List<String> values) {
            addCriterion("FareClassID not in", values, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidBetween(String value1, String value2) {
            addCriterion("FareClassID between", value1, value2, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassidNotBetween(String value1, String value2) {
            addCriterion("FareClassID not between", value1, value2, "fareclassid");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIsNull() {
            addCriterion("FareClassName is null");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIsNotNull() {
            addCriterion("FareClassName is not null");
            return (Criteria) this;
        }

        public Criteria andFareclassnameEqualTo(String value) {
            addCriterion("FareClassName =", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotEqualTo(String value) {
            addCriterion("FareClassName <>", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameGreaterThan(String value) {
            addCriterion("FareClassName >", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("FareClassName >=", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLessThan(String value) {
            addCriterion("FareClassName <", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLessThanOrEqualTo(String value) {
            addCriterion("FareClassName <=", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameLike(String value) {
            addCriterion("FareClassName like", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotLike(String value) {
            addCriterion("FareClassName not like", value, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameIn(List<String> values) {
            addCriterion("FareClassName in", values, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotIn(List<String> values) {
            addCriterion("FareClassName not in", values, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameBetween(String value1, String value2) {
            addCriterion("FareClassName between", value1, value2, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andFareclassnameNotBetween(String value1, String value2) {
            addCriterion("FareClassName not between", value1, value2, "fareclassname");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("EngName is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("EngName is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("EngName =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("EngName <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("EngName >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngName >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("EngName <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("EngName <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("EngName like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("EngName not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("EngName in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("EngName not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("EngName between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("EngName not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidIsNull() {
            addCriterion("AccSubjectID is null");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidIsNotNull() {
            addCriterion("AccSubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidEqualTo(String value) {
            addCriterion("AccSubjectID =", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidNotEqualTo(String value) {
            addCriterion("AccSubjectID <>", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidGreaterThan(String value) {
            addCriterion("AccSubjectID >", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("AccSubjectID >=", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidLessThan(String value) {
            addCriterion("AccSubjectID <", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidLessThanOrEqualTo(String value) {
            addCriterion("AccSubjectID <=", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidLike(String value) {
            addCriterion("AccSubjectID like", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidNotLike(String value) {
            addCriterion("AccSubjectID not like", value, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidIn(List<String> values) {
            addCriterion("AccSubjectID in", values, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidNotIn(List<String> values) {
            addCriterion("AccSubjectID not in", values, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidBetween(String value1, String value2) {
            addCriterion("AccSubjectID between", value1, value2, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andAccsubjectidNotBetween(String value1, String value2) {
            addCriterion("AccSubjectID not between", value1, value2, "accsubjectid");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Short value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Short value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Short value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Short value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Short value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Short> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Short> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Short value1, Short value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Short value1, Short value2) {
            addCriterion("Flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIsNull() {
            addCriterion("MergeOutState is null");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIsNotNull() {
            addCriterion("MergeOutState is not null");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateEqualTo(Short value) {
            addCriterion("MergeOutState =", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotEqualTo(Short value) {
            addCriterion("MergeOutState <>", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateGreaterThan(Short value) {
            addCriterion("MergeOutState >", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateGreaterThanOrEqualTo(Short value) {
            addCriterion("MergeOutState >=", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateLessThan(Short value) {
            addCriterion("MergeOutState <", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateLessThanOrEqualTo(Short value) {
            addCriterion("MergeOutState <=", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIn(List<Short> values) {
            addCriterion("MergeOutState in", values, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotIn(List<Short> values) {
            addCriterion("MergeOutState not in", values, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateBetween(Short value1, Short value2) {
            addCriterion("MergeOutState between", value1, value2, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotBetween(Short value1, Short value2) {
            addCriterion("MergeOutState not between", value1, value2, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameIsNull() {
            addCriterion("InvoProdName is null");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameIsNotNull() {
            addCriterion("InvoProdName is not null");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameEqualTo(String value) {
            addCriterion("InvoProdName =", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameNotEqualTo(String value) {
            addCriterion("InvoProdName <>", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameGreaterThan(String value) {
            addCriterion("InvoProdName >", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameGreaterThanOrEqualTo(String value) {
            addCriterion("InvoProdName >=", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameLessThan(String value) {
            addCriterion("InvoProdName <", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameLessThanOrEqualTo(String value) {
            addCriterion("InvoProdName <=", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameLike(String value) {
            addCriterion("InvoProdName like", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameNotLike(String value) {
            addCriterion("InvoProdName not like", value, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameIn(List<String> values) {
            addCriterion("InvoProdName in", values, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameNotIn(List<String> values) {
            addCriterion("InvoProdName not in", values, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameBetween(String value1, String value2) {
            addCriterion("InvoProdName between", value1, value2, "invoprodname");
            return (Criteria) this;
        }

        public Criteria andInvoprodnameNotBetween(String value1, String value2) {
            addCriterion("InvoProdName not between", value1, value2, "invoprodname");
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