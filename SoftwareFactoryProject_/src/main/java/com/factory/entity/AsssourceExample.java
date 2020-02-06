package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class AsssourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AsssourceExample() {
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

        public Criteria andSourceidIsNull() {
            addCriterion("SourceID is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("SourceID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(String value) {
            addCriterion("SourceID =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(String value) {
            addCriterion("SourceID <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(String value) {
            addCriterion("SourceID >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(String value) {
            addCriterion("SourceID >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(String value) {
            addCriterion("SourceID <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(String value) {
            addCriterion("SourceID <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLike(String value) {
            addCriterion("SourceID like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotLike(String value) {
            addCriterion("SourceID not like", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<String> values) {
            addCriterion("SourceID in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<String> values) {
            addCriterion("SourceID not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(String value1, String value2) {
            addCriterion("SourceID between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(String value1, String value2) {
            addCriterion("SourceID not between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourcenameIsNull() {
            addCriterion("SourceName is null");
            return (Criteria) this;
        }

        public Criteria andSourcenameIsNotNull() {
            addCriterion("SourceName is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenameEqualTo(String value) {
            addCriterion("SourceName =", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotEqualTo(String value) {
            addCriterion("SourceName <>", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameGreaterThan(String value) {
            addCriterion("SourceName >", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("SourceName >=", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLessThan(String value) {
            addCriterion("SourceName <", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLessThanOrEqualTo(String value) {
            addCriterion("SourceName <=", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameLike(String value) {
            addCriterion("SourceName like", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotLike(String value) {
            addCriterion("SourceName not like", value, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameIn(List<String> values) {
            addCriterion("SourceName in", values, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotIn(List<String> values) {
            addCriterion("SourceName not in", values, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameBetween(String value1, String value2) {
            addCriterion("SourceName between", value1, value2, "sourcename");
            return (Criteria) this;
        }

        public Criteria andSourcenameNotBetween(String value1, String value2) {
            addCriterion("SourceName not between", value1, value2, "sourcename");
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

        public Criteria andChangetypeIsNull() {
            addCriterion("ChangeType is null");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNotNull() {
            addCriterion("ChangeType is not null");
            return (Criteria) this;
        }

        public Criteria andChangetypeEqualTo(Boolean value) {
            addCriterion("ChangeType =", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotEqualTo(Boolean value) {
            addCriterion("ChangeType <>", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThan(Boolean value) {
            addCriterion("ChangeType >", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ChangeType >=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThan(Boolean value) {
            addCriterion("ChangeType <", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThanOrEqualTo(Boolean value) {
            addCriterion("ChangeType <=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeIn(List<Boolean> values) {
            addCriterion("ChangeType in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotIn(List<Boolean> values) {
            addCriterion("ChangeType not in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeBetween(Boolean value1, Boolean value2) {
            addCriterion("ChangeType between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ChangeType not between", value1, value2, "changetype");
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

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Flag not between", value1, value2, "flag");
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