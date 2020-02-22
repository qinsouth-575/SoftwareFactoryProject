package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiscountprimarybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscountprimarybillExample() {
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

        public Criteria andDpbidIsNull() {
            addCriterion("dpbid is null");
            return (Criteria) this;
        }

        public Criteria andDpbidIsNotNull() {
            addCriterion("dpbid is not null");
            return (Criteria) this;
        }

        public Criteria andDpbidEqualTo(String value) {
            addCriterion("dpbid =", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotEqualTo(String value) {
            addCriterion("dpbid <>", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidGreaterThan(String value) {
            addCriterion("dpbid >", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidGreaterThanOrEqualTo(String value) {
            addCriterion("dpbid >=", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLessThan(String value) {
            addCriterion("dpbid <", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLessThanOrEqualTo(String value) {
            addCriterion("dpbid <=", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLike(String value) {
            addCriterion("dpbid like", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotLike(String value) {
            addCriterion("dpbid not like", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidIn(List<String> values) {
            addCriterion("dpbid in", values, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotIn(List<String> values) {
            addCriterion("dpbid not in", values, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidBetween(String value1, String value2) {
            addCriterion("dpbid between", value1, value2, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotBetween(String value1, String value2) {
            addCriterion("dpbid not between", value1, value2, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbdateIsNull() {
            addCriterion("dpbDate is null");
            return (Criteria) this;
        }

        public Criteria andDpbdateIsNotNull() {
            addCriterion("dpbDate is not null");
            return (Criteria) this;
        }

        public Criteria andDpbdateEqualTo(Date value) {
            addCriterionForJDBCDate("dpbDate =", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dpbDate <>", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("dpbDate >", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dpbDate >=", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateLessThan(Date value) {
            addCriterionForJDBCDate("dpbDate <", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dpbDate <=", value, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateIn(List<Date> values) {
            addCriterionForJDBCDate("dpbDate in", values, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dpbDate not in", values, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dpbDate between", value1, value2, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andDpbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dpbDate not between", value1, value2, "dpbdate");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemIsNull() {
            addCriterion("appreciationItem is null");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemIsNotNull() {
            addCriterion("appreciationItem is not null");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemEqualTo(String value) {
            addCriterion("appreciationItem =", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemNotEqualTo(String value) {
            addCriterion("appreciationItem <>", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemGreaterThan(String value) {
            addCriterion("appreciationItem >", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemGreaterThanOrEqualTo(String value) {
            addCriterion("appreciationItem >=", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemLessThan(String value) {
            addCriterion("appreciationItem <", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemLessThanOrEqualTo(String value) {
            addCriterion("appreciationItem <=", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemLike(String value) {
            addCriterion("appreciationItem like", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemNotLike(String value) {
            addCriterion("appreciationItem not like", value, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemIn(List<String> values) {
            addCriterion("appreciationItem in", values, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemNotIn(List<String> values) {
            addCriterion("appreciationItem not in", values, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemBetween(String value1, String value2) {
            addCriterion("appreciationItem between", value1, value2, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andAppreciationitemNotBetween(String value1, String value2) {
            addCriterion("appreciationItem not between", value1, value2, "appreciationitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemIsNull() {
            addCriterion("impairmentItem is null");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemIsNotNull() {
            addCriterion("impairmentItem is not null");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemEqualTo(String value) {
            addCriterion("impairmentItem =", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemNotEqualTo(String value) {
            addCriterion("impairmentItem <>", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemGreaterThan(String value) {
            addCriterion("impairmentItem >", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemGreaterThanOrEqualTo(String value) {
            addCriterion("impairmentItem >=", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemLessThan(String value) {
            addCriterion("impairmentItem <", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemLessThanOrEqualTo(String value) {
            addCriterion("impairmentItem <=", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemLike(String value) {
            addCriterion("impairmentItem like", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemNotLike(String value) {
            addCriterion("impairmentItem not like", value, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemIn(List<String> values) {
            addCriterion("impairmentItem in", values, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemNotIn(List<String> values) {
            addCriterion("impairmentItem not in", values, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemBetween(String value1, String value2) {
            addCriterion("impairmentItem between", value1, value2, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andImpairmentitemNotBetween(String value1, String value2) {
            addCriterion("impairmentItem not between", value1, value2, "impairmentitem");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodIsNull() {
            addCriterion("straighteningMethod is null");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodIsNotNull() {
            addCriterion("straighteningMethod is not null");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodEqualTo(String value) {
            addCriterion("straighteningMethod =", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodNotEqualTo(String value) {
            addCriterion("straighteningMethod <>", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodGreaterThan(String value) {
            addCriterion("straighteningMethod >", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodGreaterThanOrEqualTo(String value) {
            addCriterion("straighteningMethod >=", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodLessThan(String value) {
            addCriterion("straighteningMethod <", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodLessThanOrEqualTo(String value) {
            addCriterion("straighteningMethod <=", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodLike(String value) {
            addCriterion("straighteningMethod like", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodNotLike(String value) {
            addCriterion("straighteningMethod not like", value, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodIn(List<String> values) {
            addCriterion("straighteningMethod in", values, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodNotIn(List<String> values) {
            addCriterion("straighteningMethod not in", values, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodBetween(String value1, String value2) {
            addCriterion("straighteningMethod between", value1, value2, "straighteningmethod");
            return (Criteria) this;
        }

        public Criteria andStraighteningmethodNotBetween(String value1, String value2) {
            addCriterion("straighteningMethod not between", value1, value2, "straighteningmethod");
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
            addCriterion("verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("verifier not between", value1, value2, "verifier");
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

        public Criteria andExaminetypeIsNull() {
            addCriterion("examineType is null");
            return (Criteria) this;
        }

        public Criteria andExaminetypeIsNotNull() {
            addCriterion("examineType is not null");
            return (Criteria) this;
        }

        public Criteria andExaminetypeEqualTo(String value) {
            addCriterion("examineType =", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeNotEqualTo(String value) {
            addCriterion("examineType <>", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeGreaterThan(String value) {
            addCriterion("examineType >", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeGreaterThanOrEqualTo(String value) {
            addCriterion("examineType >=", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeLessThan(String value) {
            addCriterion("examineType <", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeLessThanOrEqualTo(String value) {
            addCriterion("examineType <=", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeLike(String value) {
            addCriterion("examineType like", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeNotLike(String value) {
            addCriterion("examineType not like", value, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeIn(List<String> values) {
            addCriterion("examineType in", values, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeNotIn(List<String> values) {
            addCriterion("examineType not in", values, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeBetween(String value1, String value2) {
            addCriterion("examineType between", value1, value2, "examinetype");
            return (Criteria) this;
        }

        public Criteria andExaminetypeNotBetween(String value1, String value2) {
            addCriterion("examineType not between", value1, value2, "examinetype");
            return (Criteria) this;
        }

        public Criteria andDeltypeIsNull() {
            addCriterion("delType is null");
            return (Criteria) this;
        }

        public Criteria andDeltypeIsNotNull() {
            addCriterion("delType is not null");
            return (Criteria) this;
        }

        public Criteria andDeltypeEqualTo(String value) {
            addCriterion("delType =", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeNotEqualTo(String value) {
            addCriterion("delType <>", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeGreaterThan(String value) {
            addCriterion("delType >", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("delType >=", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeLessThan(String value) {
            addCriterion("delType <", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeLessThanOrEqualTo(String value) {
            addCriterion("delType <=", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeLike(String value) {
            addCriterion("delType like", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeNotLike(String value) {
            addCriterion("delType not like", value, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeIn(List<String> values) {
            addCriterion("delType in", values, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeNotIn(List<String> values) {
            addCriterion("delType not in", values, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeBetween(String value1, String value2) {
            addCriterion("delType between", value1, value2, "deltype");
            return (Criteria) this;
        }

        public Criteria andDeltypeNotBetween(String value1, String value2) {
            addCriterion("delType not between", value1, value2, "deltype");
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