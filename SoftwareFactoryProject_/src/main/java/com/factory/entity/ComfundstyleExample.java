package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class ComfundstyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComfundstyleExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("ClassID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("ClassID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andAccbankidIsNull() {
            addCriterion("AccBankID is null");
            return (Criteria) this;
        }

        public Criteria andAccbankidIsNotNull() {
            addCriterion("AccBankID is not null");
            return (Criteria) this;
        }

        public Criteria andAccbankidEqualTo(String value) {
            addCriterion("AccBankID =", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidNotEqualTo(String value) {
            addCriterion("AccBankID <>", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidGreaterThan(String value) {
            addCriterion("AccBankID >", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidGreaterThanOrEqualTo(String value) {
            addCriterion("AccBankID >=", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidLessThan(String value) {
            addCriterion("AccBankID <", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidLessThanOrEqualTo(String value) {
            addCriterion("AccBankID <=", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidLike(String value) {
            addCriterion("AccBankID like", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidNotLike(String value) {
            addCriterion("AccBankID not like", value, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidIn(List<String> values) {
            addCriterion("AccBankID in", values, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidNotIn(List<String> values) {
            addCriterion("AccBankID not in", values, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidBetween(String value1, String value2) {
            addCriterion("AccBankID between", value1, value2, "accbankid");
            return (Criteria) this;
        }

        public Criteria andAccbankidNotBetween(String value1, String value2) {
            addCriterion("AccBankID not between", value1, value2, "accbankid");
            return (Criteria) this;
        }

        public Criteria andEngclassnameIsNull() {
            addCriterion("EngClassName is null");
            return (Criteria) this;
        }

        public Criteria andEngclassnameIsNotNull() {
            addCriterion("EngClassName is not null");
            return (Criteria) this;
        }

        public Criteria andEngclassnameEqualTo(String value) {
            addCriterion("EngClassName =", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameNotEqualTo(String value) {
            addCriterion("EngClassName <>", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameGreaterThan(String value) {
            addCriterion("EngClassName >", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngClassName >=", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameLessThan(String value) {
            addCriterion("EngClassName <", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameLessThanOrEqualTo(String value) {
            addCriterion("EngClassName <=", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameLike(String value) {
            addCriterion("EngClassName like", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameNotLike(String value) {
            addCriterion("EngClassName not like", value, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameIn(List<String> values) {
            addCriterion("EngClassName in", values, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameNotIn(List<String> values) {
            addCriterion("EngClassName not in", values, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameBetween(String value1, String value2) {
            addCriterion("EngClassName between", value1, value2, "engclassname");
            return (Criteria) this;
        }

        public Criteria andEngclassnameNotBetween(String value1, String value2) {
            addCriterion("EngClassName not between", value1, value2, "engclassname");
            return (Criteria) this;
        }

        public Criteria andPosaccIsNull() {
            addCriterion("PosAcc is null");
            return (Criteria) this;
        }

        public Criteria andPosaccIsNotNull() {
            addCriterion("PosAcc is not null");
            return (Criteria) this;
        }

        public Criteria andPosaccEqualTo(String value) {
            addCriterion("PosAcc =", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccNotEqualTo(String value) {
            addCriterion("PosAcc <>", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccGreaterThan(String value) {
            addCriterion("PosAcc >", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccGreaterThanOrEqualTo(String value) {
            addCriterion("PosAcc >=", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccLessThan(String value) {
            addCriterion("PosAcc <", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccLessThanOrEqualTo(String value) {
            addCriterion("PosAcc <=", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccLike(String value) {
            addCriterion("PosAcc like", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccNotLike(String value) {
            addCriterion("PosAcc not like", value, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccIn(List<String> values) {
            addCriterion("PosAcc in", values, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccNotIn(List<String> values) {
            addCriterion("PosAcc not in", values, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccBetween(String value1, String value2) {
            addCriterion("PosAcc between", value1, value2, "posacc");
            return (Criteria) this;
        }

        public Criteria andPosaccNotBetween(String value1, String value2) {
            addCriterion("PosAcc not between", value1, value2, "posacc");
            return (Criteria) this;
        }

        public Criteria andNegaccIsNull() {
            addCriterion("NegAcc is null");
            return (Criteria) this;
        }

        public Criteria andNegaccIsNotNull() {
            addCriterion("NegAcc is not null");
            return (Criteria) this;
        }

        public Criteria andNegaccEqualTo(String value) {
            addCriterion("NegAcc =", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccNotEqualTo(String value) {
            addCriterion("NegAcc <>", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccGreaterThan(String value) {
            addCriterion("NegAcc >", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccGreaterThanOrEqualTo(String value) {
            addCriterion("NegAcc >=", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccLessThan(String value) {
            addCriterion("NegAcc <", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccLessThanOrEqualTo(String value) {
            addCriterion("NegAcc <=", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccLike(String value) {
            addCriterion("NegAcc like", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccNotLike(String value) {
            addCriterion("NegAcc not like", value, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccIn(List<String> values) {
            addCriterion("NegAcc in", values, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccNotIn(List<String> values) {
            addCriterion("NegAcc not in", values, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccBetween(String value1, String value2) {
            addCriterion("NegAcc between", value1, value2, "negacc");
            return (Criteria) this;
        }

        public Criteria andNegaccNotBetween(String value1, String value2) {
            addCriterion("NegAcc not between", value1, value2, "negacc");
            return (Criteria) this;
        }

        public Criteria andIscashIsNull() {
            addCriterion("IsCash is null");
            return (Criteria) this;
        }

        public Criteria andIscashIsNotNull() {
            addCriterion("IsCash is not null");
            return (Criteria) this;
        }

        public Criteria andIscashEqualTo(Integer value) {
            addCriterion("IsCash =", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashNotEqualTo(Integer value) {
            addCriterion("IsCash <>", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashGreaterThan(Integer value) {
            addCriterion("IsCash >", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCash >=", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashLessThan(Integer value) {
            addCriterion("IsCash <", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashLessThanOrEqualTo(Integer value) {
            addCriterion("IsCash <=", value, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashIn(List<Integer> values) {
            addCriterion("IsCash in", values, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashNotIn(List<Integer> values) {
            addCriterion("IsCash not in", values, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashBetween(Integer value1, Integer value2) {
            addCriterion("IsCash between", value1, value2, "iscash");
            return (Criteria) this;
        }

        public Criteria andIscashNotBetween(Integer value1, Integer value2) {
            addCriterion("IsCash not between", value1, value2, "iscash");
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

        public Criteria andDataverIsNull() {
            addCriterion("DataVer is null");
            return (Criteria) this;
        }

        public Criteria andDataverIsNotNull() {
            addCriterion("DataVer is not null");
            return (Criteria) this;
        }

        public Criteria andDataverEqualTo(Integer value) {
            addCriterion("DataVer =", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverNotEqualTo(Integer value) {
            addCriterion("DataVer <>", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverGreaterThan(Integer value) {
            addCriterion("DataVer >", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataVer >=", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverLessThan(Integer value) {
            addCriterion("DataVer <", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverLessThanOrEqualTo(Integer value) {
            addCriterion("DataVer <=", value, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverIn(List<Integer> values) {
            addCriterion("DataVer in", values, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverNotIn(List<Integer> values) {
            addCriterion("DataVer not in", values, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverBetween(Integer value1, Integer value2) {
            addCriterion("DataVer between", value1, value2, "dataver");
            return (Criteria) this;
        }

        public Criteria andDataverNotBetween(Integer value1, Integer value2) {
            addCriterion("DataVer not between", value1, value2, "dataver");
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