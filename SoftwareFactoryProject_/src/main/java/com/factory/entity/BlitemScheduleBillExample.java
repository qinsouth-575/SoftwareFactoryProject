package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class BlitemScheduleBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlitemScheduleBillExample() {
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

        public Criteria andBsbidIsNull() {
            addCriterion("bsbid is null");
            return (Criteria) this;
        }

        public Criteria andBsbidIsNotNull() {
            addCriterion("bsbid is not null");
            return (Criteria) this;
        }

        public Criteria andBsbidEqualTo(Integer value) {
            addCriterion("bsbid =", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotEqualTo(Integer value) {
            addCriterion("bsbid <>", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidGreaterThan(Integer value) {
            addCriterion("bsbid >", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bsbid >=", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidLessThan(Integer value) {
            addCriterion("bsbid <", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidLessThanOrEqualTo(Integer value) {
            addCriterion("bsbid <=", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidIn(List<Integer> values) {
            addCriterion("bsbid in", values, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotIn(List<Integer> values) {
            addCriterion("bsbid not in", values, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidBetween(Integer value1, Integer value2) {
            addCriterion("bsbid between", value1, value2, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotBetween(Integer value1, Integer value2) {
            addCriterion("bsbid not between", value1, value2, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBpbidIsNull() {
            addCriterion("bpbid is null");
            return (Criteria) this;
        }

        public Criteria andBpbidIsNotNull() {
            addCriterion("bpbid is not null");
            return (Criteria) this;
        }

        public Criteria andBpbidEqualTo(String value) {
            addCriterion("bpbid =", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotEqualTo(String value) {
            addCriterion("bpbid <>", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidGreaterThan(String value) {
            addCriterion("bpbid >", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidGreaterThanOrEqualTo(String value) {
            addCriterion("bpbid >=", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLessThan(String value) {
            addCriterion("bpbid <", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLessThanOrEqualTo(String value) {
            addCriterion("bpbid <=", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLike(String value) {
            addCriterion("bpbid like", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotLike(String value) {
            addCriterion("bpbid not like", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidIn(List<String> values) {
            addCriterion("bpbid in", values, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotIn(List<String> values) {
            addCriterion("bpbid not in", values, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidBetween(String value1, String value2) {
            addCriterion("bpbid between", value1, value2, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotBetween(String value1, String value2) {
            addCriterion("bpbid not between", value1, value2, "bpbid");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNull() {
            addCriterion("stockNumber is null");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNotNull() {
            addCriterion("stockNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumberEqualTo(String value) {
            addCriterion("stockNumber =", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotEqualTo(String value) {
            addCriterion("stockNumber <>", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThan(String value) {
            addCriterion("stockNumber >", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThanOrEqualTo(String value) {
            addCriterion("stockNumber >=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThan(String value) {
            addCriterion("stockNumber <", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThanOrEqualTo(String value) {
            addCriterion("stockNumber <=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLike(String value) {
            addCriterion("stockNumber like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotLike(String value) {
            addCriterion("stockNumber not like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberIn(List<String> values) {
            addCriterion("stockNumber in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotIn(List<String> values) {
            addCriterion("stockNumber not in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberBetween(String value1, String value2) {
            addCriterion("stockNumber between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotBetween(String value1, String value2) {
            addCriterion("stockNumber not between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andBookamoutIsNull() {
            addCriterion("bookAmout is null");
            return (Criteria) this;
        }

        public Criteria andBookamoutIsNotNull() {
            addCriterion("bookAmout is not null");
            return (Criteria) this;
        }

        public Criteria andBookamoutEqualTo(String value) {
            addCriterion("bookAmout =", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotEqualTo(String value) {
            addCriterion("bookAmout <>", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutGreaterThan(String value) {
            addCriterion("bookAmout >", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutGreaterThanOrEqualTo(String value) {
            addCriterion("bookAmout >=", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutLessThan(String value) {
            addCriterion("bookAmout <", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutLessThanOrEqualTo(String value) {
            addCriterion("bookAmout <=", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutLike(String value) {
            addCriterion("bookAmout like", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotLike(String value) {
            addCriterion("bookAmout not like", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutIn(List<String> values) {
            addCriterion("bookAmout in", values, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotIn(List<String> values) {
            addCriterion("bookAmout not in", values, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutBetween(String value1, String value2) {
            addCriterion("bookAmout between", value1, value2, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotBetween(String value1, String value2) {
            addCriterion("bookAmout not between", value1, value2, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIsNull() {
            addCriterion("blitemAmout is null");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIsNotNull() {
            addCriterion("blitemAmout is not null");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutEqualTo(String value) {
            addCriterion("blitemAmout =", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotEqualTo(String value) {
            addCriterion("blitemAmout <>", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutGreaterThan(String value) {
            addCriterion("blitemAmout >", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutGreaterThanOrEqualTo(String value) {
            addCriterion("blitemAmout >=", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutLessThan(String value) {
            addCriterion("blitemAmout <", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutLessThanOrEqualTo(String value) {
            addCriterion("blitemAmout <=", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutLike(String value) {
            addCriterion("blitemAmout like", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotLike(String value) {
            addCriterion("blitemAmout not like", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIn(List<String> values) {
            addCriterion("blitemAmout in", values, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotIn(List<String> values) {
            addCriterion("blitemAmout not in", values, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutBetween(String value1, String value2) {
            addCriterion("blitemAmout between", value1, value2, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotBetween(String value1, String value2) {
            addCriterion("blitemAmout not between", value1, value2, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutIsNull() {
            addCriterion("PALAmout is null");
            return (Criteria) this;
        }

        public Criteria andPalamoutIsNotNull() {
            addCriterion("PALAmout is not null");
            return (Criteria) this;
        }

        public Criteria andPalamoutEqualTo(String value) {
            addCriterion("PALAmout =", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotEqualTo(String value) {
            addCriterion("PALAmout <>", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutGreaterThan(String value) {
            addCriterion("PALAmout >", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutGreaterThanOrEqualTo(String value) {
            addCriterion("PALAmout >=", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutLessThan(String value) {
            addCriterion("PALAmout <", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutLessThanOrEqualTo(String value) {
            addCriterion("PALAmout <=", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutLike(String value) {
            addCriterion("PALAmout like", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotLike(String value) {
            addCriterion("PALAmout not like", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutIn(List<String> values) {
            addCriterion("PALAmout in", values, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotIn(List<String> values) {
            addCriterion("PALAmout not in", values, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutBetween(String value1, String value2) {
            addCriterion("PALAmout between", value1, value2, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotBetween(String value1, String value2) {
            addCriterion("PALAmout not between", value1, value2, "palamout");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
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