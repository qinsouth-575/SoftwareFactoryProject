package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameIsNull() {
            addCriterion("supplier_easyname is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameIsNotNull() {
            addCriterion("supplier_easyname is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameEqualTo(String value) {
            addCriterion("supplier_easyname =", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameNotEqualTo(String value) {
            addCriterion("supplier_easyname <>", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameGreaterThan(String value) {
            addCriterion("supplier_easyname >", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_easyname >=", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameLessThan(String value) {
            addCriterion("supplier_easyname <", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameLessThanOrEqualTo(String value) {
            addCriterion("supplier_easyname <=", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameLike(String value) {
            addCriterion("supplier_easyname like", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameNotLike(String value) {
            addCriterion("supplier_easyname not like", value, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameIn(List<String> values) {
            addCriterion("supplier_easyname in", values, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameNotIn(List<String> values) {
            addCriterion("supplier_easyname not in", values, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameBetween(String value1, String value2) {
            addCriterion("supplier_easyname between", value1, value2, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasynameNotBetween(String value1, String value2) {
            addCriterion("supplier_easyname not between", value1, value2, "supplierEasyname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameIsNull() {
            addCriterion("supplier_engname is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameIsNotNull() {
            addCriterion("supplier_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameEqualTo(String value) {
            addCriterion("supplier_engname =", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameNotEqualTo(String value) {
            addCriterion("supplier_engname <>", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameGreaterThan(String value) {
            addCriterion("supplier_engname >", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_engname >=", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameLessThan(String value) {
            addCriterion("supplier_engname <", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameLessThanOrEqualTo(String value) {
            addCriterion("supplier_engname <=", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameLike(String value) {
            addCriterion("supplier_engname like", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameNotLike(String value) {
            addCriterion("supplier_engname not like", value, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameIn(List<String> values) {
            addCriterion("supplier_engname in", values, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameNotIn(List<String> values) {
            addCriterion("supplier_engname not in", values, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameBetween(String value1, String value2) {
            addCriterion("supplier_engname between", value1, value2, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEngnameNotBetween(String value1, String value2) {
            addCriterion("supplier_engname not between", value1, value2, "supplierEngname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameIsNull() {
            addCriterion("supplier_easyengname is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameIsNotNull() {
            addCriterion("supplier_easyengname is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameEqualTo(String value) {
            addCriterion("supplier_easyengname =", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameNotEqualTo(String value) {
            addCriterion("supplier_easyengname <>", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameGreaterThan(String value) {
            addCriterion("supplier_easyengname >", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_easyengname >=", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameLessThan(String value) {
            addCriterion("supplier_easyengname <", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameLessThanOrEqualTo(String value) {
            addCriterion("supplier_easyengname <=", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameLike(String value) {
            addCriterion("supplier_easyengname like", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameNotLike(String value) {
            addCriterion("supplier_easyengname not like", value, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameIn(List<String> values) {
            addCriterion("supplier_easyengname in", values, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameNotIn(List<String> values) {
            addCriterion("supplier_easyengname not in", values, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameBetween(String value1, String value2) {
            addCriterion("supplier_easyengname between", value1, value2, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierEasyengnameNotBetween(String value1, String value2) {
            addCriterion("supplier_easyengname not between", value1, value2, "supplierEasyengname");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionIsNull() {
            addCriterion("supplier_account_attribution is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionIsNotNull() {
            addCriterion("supplier_account_attribution is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionEqualTo(String value) {
            addCriterion("supplier_account_attribution =", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionNotEqualTo(String value) {
            addCriterion("supplier_account_attribution <>", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionGreaterThan(String value) {
            addCriterion("supplier_account_attribution >", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_account_attribution >=", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionLessThan(String value) {
            addCriterion("supplier_account_attribution <", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionLessThanOrEqualTo(String value) {
            addCriterion("supplier_account_attribution <=", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionLike(String value) {
            addCriterion("supplier_account_attribution like", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionNotLike(String value) {
            addCriterion("supplier_account_attribution not like", value, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionIn(List<String> values) {
            addCriterion("supplier_account_attribution in", values, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionNotIn(List<String> values) {
            addCriterion("supplier_account_attribution not in", values, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionBetween(String value1, String value2) {
            addCriterion("supplier_account_attribution between", value1, value2, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierAccountAttributionNotBetween(String value1, String value2) {
            addCriterion("supplier_account_attribution not between", value1, value2, "supplierAccountAttribution");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(String value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(String value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(String value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(String value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(String value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLike(String value) {
            addCriterion("supplier_type like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotLike(String value) {
            addCriterion("supplier_type not like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<String> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<String> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(String value1, String value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(String value1, String value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneIsNull() {
            addCriterion("supplier_zone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneIsNotNull() {
            addCriterion("supplier_zone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneEqualTo(String value) {
            addCriterion("supplier_zone =", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneNotEqualTo(String value) {
            addCriterion("supplier_zone <>", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneGreaterThan(String value) {
            addCriterion("supplier_zone >", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_zone >=", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneLessThan(String value) {
            addCriterion("supplier_zone <", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_zone <=", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneLike(String value) {
            addCriterion("supplier_zone like", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneNotLike(String value) {
            addCriterion("supplier_zone not like", value, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneIn(List<String> values) {
            addCriterion("supplier_zone in", values, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneNotIn(List<String> values) {
            addCriterion("supplier_zone not in", values, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneBetween(String value1, String value2) {
            addCriterion("supplier_zone between", value1, value2, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andSupplierZoneNotBetween(String value1, String value2) {
            addCriterion("supplier_zone not between", value1, value2, "supplierZone");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanIsNull() {
            addCriterion("supplier_principalman is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanIsNotNull() {
            addCriterion("supplier_principalman is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanEqualTo(String value) {
            addCriterion("supplier_principalman =", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanNotEqualTo(String value) {
            addCriterion("supplier_principalman <>", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanGreaterThan(String value) {
            addCriterion("supplier_principalman >", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_principalman >=", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanLessThan(String value) {
            addCriterion("supplier_principalman <", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanLessThanOrEqualTo(String value) {
            addCriterion("supplier_principalman <=", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanLike(String value) {
            addCriterion("supplier_principalman like", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanNotLike(String value) {
            addCriterion("supplier_principalman not like", value, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanIn(List<String> values) {
            addCriterion("supplier_principalman in", values, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanNotIn(List<String> values) {
            addCriterion("supplier_principalman not in", values, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanBetween(String value1, String value2) {
            addCriterion("supplier_principalman between", value1, value2, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierPrincipalmanNotBetween(String value1, String value2) {
            addCriterion("supplier_principalman not between", value1, value2, "supplierPrincipalman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIsNull() {
            addCriterion("supplier_linkman is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIsNotNull() {
            addCriterion("supplier_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanEqualTo(String value) {
            addCriterion("supplier_linkman =", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotEqualTo(String value) {
            addCriterion("supplier_linkman <>", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanGreaterThan(String value) {
            addCriterion("supplier_linkman >", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_linkman >=", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLessThan(String value) {
            addCriterion("supplier_linkman <", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLessThanOrEqualTo(String value) {
            addCriterion("supplier_linkman <=", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanLike(String value) {
            addCriterion("supplier_linkman like", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotLike(String value) {
            addCriterion("supplier_linkman not like", value, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanIn(List<String> values) {
            addCriterion("supplier_linkman in", values, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotIn(List<String> values) {
            addCriterion("supplier_linkman not in", values, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanBetween(String value1, String value2) {
            addCriterion("supplier_linkman between", value1, value2, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinkmanNotBetween(String value1, String value2) {
            addCriterion("supplier_linkman not between", value1, value2, "supplierLinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaIsNull() {
            addCriterion("supplier_linktela is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaIsNotNull() {
            addCriterion("supplier_linktela is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaEqualTo(String value) {
            addCriterion("supplier_linktela =", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaNotEqualTo(String value) {
            addCriterion("supplier_linktela <>", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaGreaterThan(String value) {
            addCriterion("supplier_linktela >", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_linktela >=", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaLessThan(String value) {
            addCriterion("supplier_linktela <", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaLessThanOrEqualTo(String value) {
            addCriterion("supplier_linktela <=", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaLike(String value) {
            addCriterion("supplier_linktela like", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaNotLike(String value) {
            addCriterion("supplier_linktela not like", value, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaIn(List<String> values) {
            addCriterion("supplier_linktela in", values, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaNotIn(List<String> values) {
            addCriterion("supplier_linktela not in", values, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaBetween(String value1, String value2) {
            addCriterion("supplier_linktela between", value1, value2, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelaNotBetween(String value1, String value2) {
            addCriterion("supplier_linktela not between", value1, value2, "supplierLinktela");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbIsNull() {
            addCriterion("supplier_linktelb is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbIsNotNull() {
            addCriterion("supplier_linktelb is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbEqualTo(String value) {
            addCriterion("supplier_linktelb =", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbNotEqualTo(String value) {
            addCriterion("supplier_linktelb <>", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbGreaterThan(String value) {
            addCriterion("supplier_linktelb >", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_linktelb >=", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbLessThan(String value) {
            addCriterion("supplier_linktelb <", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbLessThanOrEqualTo(String value) {
            addCriterion("supplier_linktelb <=", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbLike(String value) {
            addCriterion("supplier_linktelb like", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbNotLike(String value) {
            addCriterion("supplier_linktelb not like", value, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbIn(List<String> values) {
            addCriterion("supplier_linktelb in", values, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbNotIn(List<String> values) {
            addCriterion("supplier_linktelb not in", values, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbBetween(String value1, String value2) {
            addCriterion("supplier_linktelb between", value1, value2, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelbNotBetween(String value1, String value2) {
            addCriterion("supplier_linktelb not between", value1, value2, "supplierLinktelb");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcIsNull() {
            addCriterion("supplier_linktelc is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcIsNotNull() {
            addCriterion("supplier_linktelc is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcEqualTo(String value) {
            addCriterion("supplier_linktelc =", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcNotEqualTo(String value) {
            addCriterion("supplier_linktelc <>", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcGreaterThan(String value) {
            addCriterion("supplier_linktelc >", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_linktelc >=", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcLessThan(String value) {
            addCriterion("supplier_linktelc <", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcLessThanOrEqualTo(String value) {
            addCriterion("supplier_linktelc <=", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcLike(String value) {
            addCriterion("supplier_linktelc like", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcNotLike(String value) {
            addCriterion("supplier_linktelc not like", value, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcIn(List<String> values) {
            addCriterion("supplier_linktelc in", values, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcNotIn(List<String> values) {
            addCriterion("supplier_linktelc not in", values, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcBetween(String value1, String value2) {
            addCriterion("supplier_linktelc between", value1, value2, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierLinktelcNotBetween(String value1, String value2) {
            addCriterion("supplier_linktelc not between", value1, value2, "supplierLinktelc");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneIsNull() {
            addCriterion("supplier_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneIsNotNull() {
            addCriterion("supplier_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneEqualTo(String value) {
            addCriterion("supplier_mobilephone =", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneNotEqualTo(String value) {
            addCriterion("supplier_mobilephone <>", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneGreaterThan(String value) {
            addCriterion("supplier_mobilephone >", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_mobilephone >=", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneLessThan(String value) {
            addCriterion("supplier_mobilephone <", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_mobilephone <=", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneLike(String value) {
            addCriterion("supplier_mobilephone like", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneNotLike(String value) {
            addCriterion("supplier_mobilephone not like", value, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneIn(List<String> values) {
            addCriterion("supplier_mobilephone in", values, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneNotIn(List<String> values) {
            addCriterion("supplier_mobilephone not in", values, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneBetween(String value1, String value2) {
            addCriterion("supplier_mobilephone between", value1, value2, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andSupplierMobilephoneNotBetween(String value1, String value2) {
            addCriterion("supplier_mobilephone not between", value1, value2, "supplierMobilephone");
            return (Criteria) this;
        }

        public Criteria andAdaIdIsNull() {
            addCriterion("ada_id is null");
            return (Criteria) this;
        }

        public Criteria andAdaIdIsNotNull() {
            addCriterion("ada_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdaIdEqualTo(String value) {
            addCriterion("ada_id =", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotEqualTo(String value) {
            addCriterion("ada_id <>", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdGreaterThan(String value) {
            addCriterion("ada_id >", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ada_id >=", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLessThan(String value) {
            addCriterion("ada_id <", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLessThanOrEqualTo(String value) {
            addCriterion("ada_id <=", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdLike(String value) {
            addCriterion("ada_id like", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotLike(String value) {
            addCriterion("ada_id not like", value, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdIn(List<String> values) {
            addCriterion("ada_id in", values, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotIn(List<String> values) {
            addCriterion("ada_id not in", values, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdBetween(String value1, String value2) {
            addCriterion("ada_id between", value1, value2, "adaId");
            return (Criteria) this;
        }

        public Criteria andAdaIdNotBetween(String value1, String value2) {
            addCriterion("ada_id not between", value1, value2, "adaId");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffIsNull() {
            addCriterion("\"supplier_procurement _staff\" is null");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffIsNotNull() {
            addCriterion("\"supplier_procurement _staff\" is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffEqualTo(String value) {
            addCriterion("\"supplier_procurement _staff\" =", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffNotEqualTo(String value) {
            addCriterion("\"supplier_procurement _staff\" <>", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffGreaterThan(String value) {
            addCriterion("\"supplier_procurement _staff\" >", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffGreaterThanOrEqualTo(String value) {
            addCriterion("\"supplier_procurement _staff\" >=", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffLessThan(String value) {
            addCriterion("\"supplier_procurement _staff\" <", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffLessThanOrEqualTo(String value) {
            addCriterion("\"supplier_procurement _staff\" <=", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffLike(String value) {
            addCriterion("\"supplier_procurement _staff\" like", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffNotLike(String value) {
            addCriterion("\"supplier_procurement _staff\" not like", value, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffIn(List<String> values) {
            addCriterion("\"supplier_procurement _staff\" in", values, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffNotIn(List<String> values) {
            addCriterion("\"supplier_procurement _staff\" not in", values, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffBetween(String value1, String value2) {
            addCriterion("\"supplier_procurement _staff\" between", value1, value2, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierProcurementStaffNotBetween(String value1, String value2) {
            addCriterion("\"supplier_procurement _staff\" not between", value1, value2, "supplierProcurementStaff");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoIsNull() {
            addCriterion("supplier_taxcheckno is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoIsNotNull() {
            addCriterion("supplier_taxcheckno is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoEqualTo(String value) {
            addCriterion("supplier_taxcheckno =", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoNotEqualTo(String value) {
            addCriterion("supplier_taxcheckno <>", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoGreaterThan(String value) {
            addCriterion("supplier_taxcheckno >", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_taxcheckno >=", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoLessThan(String value) {
            addCriterion("supplier_taxcheckno <", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoLessThanOrEqualTo(String value) {
            addCriterion("supplier_taxcheckno <=", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoLike(String value) {
            addCriterion("supplier_taxcheckno like", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoNotLike(String value) {
            addCriterion("supplier_taxcheckno not like", value, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoIn(List<String> values) {
            addCriterion("supplier_taxcheckno in", values, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoNotIn(List<String> values) {
            addCriterion("supplier_taxcheckno not in", values, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoBetween(String value1, String value2) {
            addCriterion("supplier_taxcheckno between", value1, value2, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxchecknoNotBetween(String value1, String value2) {
            addCriterion("supplier_taxcheckno not between", value1, value2, "supplierTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyIsNull() {
            addCriterion("supplier_capitalmoney is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyIsNotNull() {
            addCriterion("supplier_capitalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyEqualTo(Float value) {
            addCriterion("supplier_capitalmoney =", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyNotEqualTo(Float value) {
            addCriterion("supplier_capitalmoney <>", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyGreaterThan(Float value) {
            addCriterion("supplier_capitalmoney >", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_capitalmoney >=", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyLessThan(Float value) {
            addCriterion("supplier_capitalmoney <", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("supplier_capitalmoney <=", value, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyIn(List<Float> values) {
            addCriterion("supplier_capitalmoney in", values, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyNotIn(List<Float> values) {
            addCriterion("supplier_capitalmoney not in", values, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyBetween(Float value1, Float value2) {
            addCriterion("supplier_capitalmoney between", value1, value2, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCapitalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("supplier_capitalmoney not between", value1, value2, "supplierCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierJobIsNull() {
            addCriterion("supplier_job is null");
            return (Criteria) this;
        }

        public Criteria andSupplierJobIsNotNull() {
            addCriterion("supplier_job is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierJobEqualTo(String value) {
            addCriterion("supplier_job =", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobNotEqualTo(String value) {
            addCriterion("supplier_job <>", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobGreaterThan(String value) {
            addCriterion("supplier_job >", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_job >=", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobLessThan(String value) {
            addCriterion("supplier_job <", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobLessThanOrEqualTo(String value) {
            addCriterion("supplier_job <=", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobLike(String value) {
            addCriterion("supplier_job like", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobNotLike(String value) {
            addCriterion("supplier_job not like", value, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobIn(List<String> values) {
            addCriterion("supplier_job in", values, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobNotIn(List<String> values) {
            addCriterion("supplier_job not in", values, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobBetween(String value1, String value2) {
            addCriterion("supplier_job between", value1, value2, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierJobNotBetween(String value1, String value2) {
            addCriterion("supplier_job not between", value1, value2, "supplierJob");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNull() {
            addCriterion("supplier_email is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNotNull() {
            addCriterion("supplier_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailEqualTo(String value) {
            addCriterion("supplier_email =", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotEqualTo(String value) {
            addCriterion("supplier_email <>", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThan(String value) {
            addCriterion("supplier_email >", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_email >=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThan(String value) {
            addCriterion("supplier_email <", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThanOrEqualTo(String value) {
            addCriterion("supplier_email <=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLike(String value) {
            addCriterion("supplier_email like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotLike(String value) {
            addCriterion("supplier_email not like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIn(List<String> values) {
            addCriterion("supplier_email in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotIn(List<String> values) {
            addCriterion("supplier_email not in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailBetween(String value1, String value2) {
            addCriterion("supplier_email between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotBetween(String value1, String value2) {
            addCriterion("supplier_email not between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddIsNull() {
            addCriterion("supplier_webadd is null");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddIsNotNull() {
            addCriterion("supplier_webadd is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddEqualTo(String value) {
            addCriterion("supplier_webadd =", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddNotEqualTo(String value) {
            addCriterion("supplier_webadd <>", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddGreaterThan(String value) {
            addCriterion("supplier_webadd >", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_webadd >=", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddLessThan(String value) {
            addCriterion("supplier_webadd <", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddLessThanOrEqualTo(String value) {
            addCriterion("supplier_webadd <=", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddLike(String value) {
            addCriterion("supplier_webadd like", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddNotLike(String value) {
            addCriterion("supplier_webadd not like", value, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddIn(List<String> values) {
            addCriterion("supplier_webadd in", values, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddNotIn(List<String> values) {
            addCriterion("supplier_webadd not in", values, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddBetween(String value1, String value2) {
            addCriterion("supplier_webadd between", value1, value2, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierWebaddNotBetween(String value1, String value2) {
            addCriterion("supplier_webadd not between", value1, value2, "supplierWebadd");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoIsNull() {
            addCriterion("supplier_faxno is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoIsNotNull() {
            addCriterion("supplier_faxno is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoEqualTo(String value) {
            addCriterion("supplier_faxno =", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoNotEqualTo(String value) {
            addCriterion("supplier_faxno <>", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoGreaterThan(String value) {
            addCriterion("supplier_faxno >", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_faxno >=", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoLessThan(String value) {
            addCriterion("supplier_faxno <", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoLessThanOrEqualTo(String value) {
            addCriterion("supplier_faxno <=", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoLike(String value) {
            addCriterion("supplier_faxno like", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoNotLike(String value) {
            addCriterion("supplier_faxno not like", value, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoIn(List<String> values) {
            addCriterion("supplier_faxno in", values, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoNotIn(List<String> values) {
            addCriterion("supplier_faxno not in", values, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoBetween(String value1, String value2) {
            addCriterion("supplier_faxno between", value1, value2, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxnoNotBetween(String value1, String value2) {
            addCriterion("supplier_faxno not between", value1, value2, "supplierFaxno");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputIsNull() {
            addCriterion("supplier_cufirstsaleinput is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputIsNotNull() {
            addCriterion("supplier_cufirstsaleinput is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput =", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput <>", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput >", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput >=", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputLessThan(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput <", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput <=", value, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput in", values, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput not in", values, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput between", value1, value2, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsaleinputNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cufirstsaleinput not between", value1, value2, "supplierCufirstsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnIsNull() {
            addCriterion("supplier_cufirstsalereturn is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnIsNotNull() {
            addCriterion("supplier_cufirstsalereturn is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn =", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn <>", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn >", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn >=", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnLessThan(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn <", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn <=", value, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn in", values, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn not in", values, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn between", value1, value2, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstsalereturnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cufirstsalereturn not between", value1, value2, "supplierCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputIsNull() {
            addCriterion("supplier_curecentsaleinput is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputIsNotNull() {
            addCriterion("supplier_curecentsaleinput is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput =", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput <>", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput >", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput >=", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputLessThan(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput <", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsaleinput <=", value, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_curecentsaleinput in", values, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_curecentsaleinput not in", values, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_curecentsaleinput between", value1, value2, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsaleinputNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_curecentsaleinput not between", value1, value2, "supplierCurecentsaleinput");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnIsNull() {
            addCriterion("supplier_curecentsalereturn is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnIsNotNull() {
            addCriterion("supplier_curecentsalereturn is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn =", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn <>", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn >", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn >=", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnLessThan(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn <", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_curecentsalereturn <=", value, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_curecentsalereturn in", values, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_curecentsalereturn not in", values, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_curecentsalereturn between", value1, value2, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecentsalereturnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_curecentsalereturn not between", value1, value2, "supplierCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedIsNull() {
            addCriterion("supplier_tax_included is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedIsNotNull() {
            addCriterion("supplier_tax_included is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedEqualTo(String value) {
            addCriterion("supplier_tax_included =", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedNotEqualTo(String value) {
            addCriterion("supplier_tax_included <>", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedGreaterThan(String value) {
            addCriterion("supplier_tax_included >", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_tax_included >=", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedLessThan(String value) {
            addCriterion("supplier_tax_included <", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedLessThanOrEqualTo(String value) {
            addCriterion("supplier_tax_included <=", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedLike(String value) {
            addCriterion("supplier_tax_included like", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedNotLike(String value) {
            addCriterion("supplier_tax_included not like", value, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedIn(List<String> values) {
            addCriterion("supplier_tax_included in", values, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedNotIn(List<String> values) {
            addCriterion("supplier_tax_included not in", values, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedBetween(String value1, String value2) {
            addCriterion("supplier_tax_included between", value1, value2, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTaxIncludedNotBetween(String value1, String value2) {
            addCriterion("supplier_tax_included not between", value1, value2, "supplierTaxIncluded");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateIsNull() {
            addCriterion("supplier_terminationdate is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateIsNotNull() {
            addCriterion("supplier_terminationdate is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate =", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate <>", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate >", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate >=", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateLessThan(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate <", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_terminationdate <=", value, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_terminationdate in", values, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_terminationdate not in", values, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_terminationdate between", value1, value2, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierTerminationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_terminationdate not between", value1, value2, "supplierTerminationdate");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyIsNull() {
            addCriterion("supplier_creditmoney is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyIsNotNull() {
            addCriterion("supplier_creditmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyEqualTo(Float value) {
            addCriterion("supplier_creditmoney =", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyNotEqualTo(Float value) {
            addCriterion("supplier_creditmoney <>", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyGreaterThan(Float value) {
            addCriterion("supplier_creditmoney >", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_creditmoney >=", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyLessThan(Float value) {
            addCriterion("supplier_creditmoney <", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyLessThanOrEqualTo(Float value) {
            addCriterion("supplier_creditmoney <=", value, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyIn(List<Float> values) {
            addCriterion("supplier_creditmoney in", values, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyNotIn(List<Float> values) {
            addCriterion("supplier_creditmoney not in", values, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyBetween(Float value1, Float value2) {
            addCriterion("supplier_creditmoney between", value1, value2, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCreditmoneyNotBetween(Float value1, Float value2) {
            addCriterion("supplier_creditmoney not between", value1, value2, "supplierCreditmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetIsNull() {
            addCriterion("supplier_residuemonet is null");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetIsNotNull() {
            addCriterion("supplier_residuemonet is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetEqualTo(Float value) {
            addCriterion("supplier_residuemonet =", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetNotEqualTo(Float value) {
            addCriterion("supplier_residuemonet <>", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetGreaterThan(Float value) {
            addCriterion("supplier_residuemonet >", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_residuemonet >=", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetLessThan(Float value) {
            addCriterion("supplier_residuemonet <", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetLessThanOrEqualTo(Float value) {
            addCriterion("supplier_residuemonet <=", value, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetIn(List<Float> values) {
            addCriterion("supplier_residuemonet in", values, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetNotIn(List<Float> values) {
            addCriterion("supplier_residuemonet not in", values, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetBetween(Float value1, Float value2) {
            addCriterion("supplier_residuemonet between", value1, value2, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierResiduemonetNotBetween(Float value1, Float value2) {
            addCriterion("supplier_residuemonet not between", value1, value2, "supplierResiduemonet");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionIsNull() {
            addCriterion("supplier_condition is null");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionIsNotNull() {
            addCriterion("supplier_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionEqualTo(String value) {
            addCriterion("supplier_condition =", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionNotEqualTo(String value) {
            addCriterion("supplier_condition <>", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionGreaterThan(String value) {
            addCriterion("supplier_condition >", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_condition >=", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionLessThan(String value) {
            addCriterion("supplier_condition <", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionLessThanOrEqualTo(String value) {
            addCriterion("supplier_condition <=", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionLike(String value) {
            addCriterion("supplier_condition like", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionNotLike(String value) {
            addCriterion("supplier_condition not like", value, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionIn(List<String> values) {
            addCriterion("supplier_condition in", values, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionNotIn(List<String> values) {
            addCriterion("supplier_condition not in", values, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionBetween(String value1, String value2) {
            addCriterion("supplier_condition between", value1, value2, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierConditionNotBetween(String value1, String value2) {
            addCriterion("supplier_condition not between", value1, value2, "supplierCondition");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayIsNull() {
            addCriterion("supplier_cuendorderday is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayIsNotNull() {
            addCriterion("supplier_cuendorderday is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday =", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday <>", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayGreaterThan(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday >", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday >=", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayLessThan(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday <", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supplier_cuendorderday <=", value, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cuendorderday in", values, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("supplier_cuendorderday not in", values, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cuendorderday between", value1, value2, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendorderdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supplier_cuendorderday not between", value1, value2, "supplierCuendorderday");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvIsNull() {
            addCriterion("supplier_honestlv is null");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvIsNotNull() {
            addCriterion("supplier_honestlv is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvEqualTo(String value) {
            addCriterion("supplier_honestlv =", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvNotEqualTo(String value) {
            addCriterion("supplier_honestlv <>", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvGreaterThan(String value) {
            addCriterion("supplier_honestlv >", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_honestlv >=", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvLessThan(String value) {
            addCriterion("supplier_honestlv <", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvLessThanOrEqualTo(String value) {
            addCriterion("supplier_honestlv <=", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvLike(String value) {
            addCriterion("supplier_honestlv like", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvNotLike(String value) {
            addCriterion("supplier_honestlv not like", value, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvIn(List<String> values) {
            addCriterion("supplier_honestlv in", values, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvNotIn(List<String> values) {
            addCriterion("supplier_honestlv not in", values, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvBetween(String value1, String value2) {
            addCriterion("supplier_honestlv between", value1, value2, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierHonestlvNotBetween(String value1, String value2) {
            addCriterion("supplier_honestlv not between", value1, value2, "supplierHonestlv");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeIsNull() {
            addCriterion("supplier_invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeIsNotNull() {
            addCriterion("supplier_invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeEqualTo(String value) {
            addCriterion("supplier_invoice_type =", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeNotEqualTo(String value) {
            addCriterion("supplier_invoice_type <>", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeGreaterThan(String value) {
            addCriterion("supplier_invoice_type >", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_invoice_type >=", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeLessThan(String value) {
            addCriterion("supplier_invoice_type <", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("supplier_invoice_type <=", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeLike(String value) {
            addCriterion("supplier_invoice_type like", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeNotLike(String value) {
            addCriterion("supplier_invoice_type not like", value, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeIn(List<String> values) {
            addCriterion("supplier_invoice_type in", values, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeNotIn(List<String> values) {
            addCriterion("supplier_invoice_type not in", values, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeBetween(String value1, String value2) {
            addCriterion("supplier_invoice_type between", value1, value2, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("supplier_invoice_type not between", value1, value2, "supplierInvoiceType");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectIsNull() {
            addCriterion("supplier_cufirstcollect is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectIsNotNull() {
            addCriterion("supplier_cufirstcollect is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectEqualTo(Float value) {
            addCriterion("supplier_cufirstcollect =", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectNotEqualTo(Float value) {
            addCriterion("supplier_cufirstcollect <>", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectGreaterThan(Float value) {
            addCriterion("supplier_cufirstcollect >", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_cufirstcollect >=", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectLessThan(Float value) {
            addCriterion("supplier_cufirstcollect <", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectLessThanOrEqualTo(Float value) {
            addCriterion("supplier_cufirstcollect <=", value, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectIn(List<Float> values) {
            addCriterion("supplier_cufirstcollect in", values, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectNotIn(List<Float> values) {
            addCriterion("supplier_cufirstcollect not in", values, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectBetween(Float value1, Float value2) {
            addCriterion("supplier_cufirstcollect between", value1, value2, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCufirstcollectNotBetween(Float value1, Float value2) {
            addCriterion("supplier_cufirstcollect not between", value1, value2, "supplierCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectIsNull() {
            addCriterion("supplier_houldcollect is null");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectIsNotNull() {
            addCriterion("supplier_houldcollect is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectEqualTo(Float value) {
            addCriterion("supplier_houldcollect =", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectNotEqualTo(Float value) {
            addCriterion("supplier_houldcollect <>", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectGreaterThan(Float value) {
            addCriterion("supplier_houldcollect >", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_houldcollect >=", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectLessThan(Float value) {
            addCriterion("supplier_houldcollect <", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectLessThanOrEqualTo(Float value) {
            addCriterion("supplier_houldcollect <=", value, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectIn(List<Float> values) {
            addCriterion("supplier_houldcollect in", values, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectNotIn(List<Float> values) {
            addCriterion("supplier_houldcollect not in", values, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectBetween(Float value1, Float value2) {
            addCriterion("supplier_houldcollect between", value1, value2, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectNotBetween(Float value1, Float value2) {
            addCriterion("supplier_houldcollect not between", value1, value2, "supplierHouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectIsNull() {
            addCriterion("supplier_cuendcollect is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectIsNotNull() {
            addCriterion("supplier_cuendcollect is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectEqualTo(Float value) {
            addCriterion("supplier_cuendcollect =", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectNotEqualTo(Float value) {
            addCriterion("supplier_cuendcollect <>", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectGreaterThan(Float value) {
            addCriterion("supplier_cuendcollect >", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_cuendcollect >=", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectLessThan(Float value) {
            addCriterion("supplier_cuendcollect <", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectLessThanOrEqualTo(Float value) {
            addCriterion("supplier_cuendcollect <=", value, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectIn(List<Float> values) {
            addCriterion("supplier_cuendcollect in", values, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectNotIn(List<Float> values) {
            addCriterion("supplier_cuendcollect not in", values, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectBetween(Float value1, Float value2) {
            addCriterion("supplier_cuendcollect between", value1, value2, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendcollectNotBetween(Float value1, Float value2) {
            addCriterion("supplier_cuendcollect not between", value1, value2, "supplierCuendcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectIsNull() {
            addCriterion("supplier_cuendshouldcollect is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectIsNotNull() {
            addCriterion("supplier_cuendshouldcollect is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectEqualTo(Float value) {
            addCriterion("supplier_cuendshouldcollect =", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectNotEqualTo(Float value) {
            addCriterion("supplier_cuendshouldcollect <>", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectGreaterThan(Float value) {
            addCriterion("supplier_cuendshouldcollect >", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("supplier_cuendshouldcollect >=", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectLessThan(Float value) {
            addCriterion("supplier_cuendshouldcollect <", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectLessThanOrEqualTo(Float value) {
            addCriterion("supplier_cuendshouldcollect <=", value, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectIn(List<Float> values) {
            addCriterion("supplier_cuendshouldcollect in", values, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectNotIn(List<Float> values) {
            addCriterion("supplier_cuendshouldcollect not in", values, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectBetween(Float value1, Float value2) {
            addCriterion("supplier_cuendshouldcollect between", value1, value2, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCuendshouldcollectNotBetween(Float value1, Float value2) {
            addCriterion("supplier_cuendshouldcollect not between", value1, value2, "supplierCuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationIsNull() {
            addCriterion("supplier_cudecoration is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationIsNotNull() {
            addCriterion("supplier_cudecoration is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationEqualTo(String value) {
            addCriterion("supplier_cudecoration =", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationNotEqualTo(String value) {
            addCriterion("supplier_cudecoration <>", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationGreaterThan(String value) {
            addCriterion("supplier_cudecoration >", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_cudecoration >=", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationLessThan(String value) {
            addCriterion("supplier_cudecoration <", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationLessThanOrEqualTo(String value) {
            addCriterion("supplier_cudecoration <=", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationLike(String value) {
            addCriterion("supplier_cudecoration like", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationNotLike(String value) {
            addCriterion("supplier_cudecoration not like", value, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationIn(List<String> values) {
            addCriterion("supplier_cudecoration in", values, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationNotIn(List<String> values) {
            addCriterion("supplier_cudecoration not in", values, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationBetween(String value1, String value2) {
            addCriterion("supplier_cudecoration between", value1, value2, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCudecorationNotBetween(String value1, String value2) {
            addCriterion("supplier_cudecoration not between", value1, value2, "supplierCudecoration");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidIsNull() {
            addCriterion("supplier_collectiontermid is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidIsNotNull() {
            addCriterion("supplier_collectiontermid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidEqualTo(Integer value) {
            addCriterion("supplier_collectiontermid =", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidNotEqualTo(Integer value) {
            addCriterion("supplier_collectiontermid <>", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidGreaterThan(Integer value) {
            addCriterion("supplier_collectiontermid >", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_collectiontermid >=", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidLessThan(Integer value) {
            addCriterion("supplier_collectiontermid <", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_collectiontermid <=", value, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidIn(List<Integer> values) {
            addCriterion("supplier_collectiontermid in", values, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidNotIn(List<Integer> values) {
            addCriterion("supplier_collectiontermid not in", values, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidBetween(Integer value1, Integer value2) {
            addCriterion("supplier_collectiontermid between", value1, value2, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierCollectiontermidNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_collectiontermid not between", value1, value2, "supplierCollectiontermid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidIsNull() {
            addCriterion("supplier_invoicetypeid is null");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidIsNotNull() {
            addCriterion("supplier_invoicetypeid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidEqualTo(Integer value) {
            addCriterion("supplier_invoicetypeid =", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidNotEqualTo(Integer value) {
            addCriterion("supplier_invoicetypeid <>", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidGreaterThan(Integer value) {
            addCriterion("supplier_invoicetypeid >", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_invoicetypeid >=", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidLessThan(Integer value) {
            addCriterion("supplier_invoicetypeid <", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_invoicetypeid <=", value, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidIn(List<Integer> values) {
            addCriterion("supplier_invoicetypeid in", values, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidNotIn(List<Integer> values) {
            addCriterion("supplier_invoicetypeid not in", values, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidBetween(Integer value1, Integer value2) {
            addCriterion("supplier_invoicetypeid between", value1, value2, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierInvoicetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_invoicetypeid not between", value1, value2, "supplierInvoicetypeid");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyIsNull() {
            addCriterion("supplier_houldcollectmoney is null");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyIsNotNull() {
            addCriterion("supplier_houldcollectmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyEqualTo(Integer value) {
            addCriterion("supplier_houldcollectmoney =", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyNotEqualTo(Integer value) {
            addCriterion("supplier_houldcollectmoney <>", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyGreaterThan(Integer value) {
            addCriterion("supplier_houldcollectmoney >", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_houldcollectmoney >=", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyLessThan(Integer value) {
            addCriterion("supplier_houldcollectmoney <", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_houldcollectmoney <=", value, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyIn(List<Integer> values) {
            addCriterion("supplier_houldcollectmoney in", values, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyNotIn(List<Integer> values) {
            addCriterion("supplier_houldcollectmoney not in", values, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyBetween(Integer value1, Integer value2) {
            addCriterion("supplier_houldcollectmoney between", value1, value2, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierHouldcollectmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_houldcollectmoney not between", value1, value2, "supplierHouldcollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyIsNull() {
            addCriterion("supplier_curecollectmoney is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyIsNotNull() {
            addCriterion("supplier_curecollectmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyEqualTo(Integer value) {
            addCriterion("supplier_curecollectmoney =", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyNotEqualTo(Integer value) {
            addCriterion("supplier_curecollectmoney <>", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyGreaterThan(Integer value) {
            addCriterion("supplier_curecollectmoney >", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_curecollectmoney >=", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyLessThan(Integer value) {
            addCriterion("supplier_curecollectmoney <", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_curecollectmoney <=", value, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyIn(List<Integer> values) {
            addCriterion("supplier_curecollectmoney in", values, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyNotIn(List<Integer> values) {
            addCriterion("supplier_curecollectmoney not in", values, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyBetween(Integer value1, Integer value2) {
            addCriterion("supplier_curecollectmoney between", value1, value2, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierCurecollectmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_curecollectmoney not between", value1, value2, "supplierCurecollectmoney");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoIsNull() {
            addCriterion("supplier_address_no is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoIsNotNull() {
            addCriterion("supplier_address_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoEqualTo(String value) {
            addCriterion("supplier_address_no =", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoNotEqualTo(String value) {
            addCriterion("supplier_address_no <>", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoGreaterThan(String value) {
            addCriterion("supplier_address_no >", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_address_no >=", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoLessThan(String value) {
            addCriterion("supplier_address_no <", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoLessThanOrEqualTo(String value) {
            addCriterion("supplier_address_no <=", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoLike(String value) {
            addCriterion("supplier_address_no like", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoNotLike(String value) {
            addCriterion("supplier_address_no not like", value, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoIn(List<String> values) {
            addCriterion("supplier_address_no in", values, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoNotIn(List<String> values) {
            addCriterion("supplier_address_no not in", values, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoBetween(String value1, String value2) {
            addCriterion("supplier_address_no between", value1, value2, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNoNotBetween(String value1, String value2) {
            addCriterion("supplier_address_no not between", value1, value2, "supplierAddressNo");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkIsNull() {
            addCriterion("supplier_remark is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkIsNotNull() {
            addCriterion("supplier_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkEqualTo(String value) {
            addCriterion("supplier_remark =", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotEqualTo(String value) {
            addCriterion("supplier_remark <>", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkGreaterThan(String value) {
            addCriterion("supplier_remark >", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_remark >=", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLessThan(String value) {
            addCriterion("supplier_remark <", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLessThanOrEqualTo(String value) {
            addCriterion("supplier_remark <=", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLike(String value) {
            addCriterion("supplier_remark like", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotLike(String value) {
            addCriterion("supplier_remark not like", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkIn(List<String> values) {
            addCriterion("supplier_remark in", values, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotIn(List<String> values) {
            addCriterion("supplier_remark not in", values, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkBetween(String value1, String value2) {
            addCriterion("supplier_remark between", value1, value2, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotBetween(String value1, String value2) {
            addCriterion("supplier_remark not between", value1, value2, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingIsNull() {
            addCriterion("supplier_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingIsNotNull() {
            addCriterion("supplier_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingEqualTo(String value) {
            addCriterion("supplier_Auditing =", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingNotEqualTo(String value) {
            addCriterion("supplier_Auditing <>", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingGreaterThan(String value) {
            addCriterion("supplier_Auditing >", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Auditing >=", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingLessThan(String value) {
            addCriterion("supplier_Auditing <", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingLessThanOrEqualTo(String value) {
            addCriterion("supplier_Auditing <=", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingLike(String value) {
            addCriterion("supplier_Auditing like", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingNotLike(String value) {
            addCriterion("supplier_Auditing not like", value, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingIn(List<String> values) {
            addCriterion("supplier_Auditing in", values, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingNotIn(List<String> values) {
            addCriterion("supplier_Auditing not in", values, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingBetween(String value1, String value2) {
            addCriterion("supplier_Auditing between", value1, value2, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierAuditingNotBetween(String value1, String value2) {
            addCriterion("supplier_Auditing not between", value1, value2, "supplierAuditing");
            return (Criteria) this;
        }

        public Criteria andSupplierYnIsNull() {
            addCriterion("supplier_yn is null");
            return (Criteria) this;
        }

        public Criteria andSupplierYnIsNotNull() {
            addCriterion("supplier_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierYnEqualTo(String value) {
            addCriterion("supplier_yn =", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnNotEqualTo(String value) {
            addCriterion("supplier_yn <>", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnGreaterThan(String value) {
            addCriterion("supplier_yn >", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_yn >=", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnLessThan(String value) {
            addCriterion("supplier_yn <", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnLessThanOrEqualTo(String value) {
            addCriterion("supplier_yn <=", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnLike(String value) {
            addCriterion("supplier_yn like", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnNotLike(String value) {
            addCriterion("supplier_yn not like", value, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnIn(List<String> values) {
            addCriterion("supplier_yn in", values, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnNotIn(List<String> values) {
            addCriterion("supplier_yn not in", values, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnBetween(String value1, String value2) {
            addCriterion("supplier_yn between", value1, value2, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierYnNotBetween(String value1, String value2) {
            addCriterion("supplier_yn not between", value1, value2, "supplierYn");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1IsNull() {
            addCriterion("supplier_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1IsNotNull() {
            addCriterion("supplier_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1EqualTo(String value) {
            addCriterion("supplier_custom1 =", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1NotEqualTo(String value) {
            addCriterion("supplier_custom1 <>", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1GreaterThan(String value) {
            addCriterion("supplier_custom1 >", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom1 >=", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1LessThan(String value) {
            addCriterion("supplier_custom1 <", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom1 <=", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1Like(String value) {
            addCriterion("supplier_custom1 like", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1NotLike(String value) {
            addCriterion("supplier_custom1 not like", value, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1In(List<String> values) {
            addCriterion("supplier_custom1 in", values, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1NotIn(List<String> values) {
            addCriterion("supplier_custom1 not in", values, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1Between(String value1, String value2) {
            addCriterion("supplier_custom1 between", value1, value2, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom1NotBetween(String value1, String value2) {
            addCriterion("supplier_custom1 not between", value1, value2, "supplierCustom1");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2IsNull() {
            addCriterion("supplier_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2IsNotNull() {
            addCriterion("supplier_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2EqualTo(String value) {
            addCriterion("supplier_custom2 =", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2NotEqualTo(String value) {
            addCriterion("supplier_custom2 <>", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2GreaterThan(String value) {
            addCriterion("supplier_custom2 >", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom2 >=", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2LessThan(String value) {
            addCriterion("supplier_custom2 <", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom2 <=", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2Like(String value) {
            addCriterion("supplier_custom2 like", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2NotLike(String value) {
            addCriterion("supplier_custom2 not like", value, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2In(List<String> values) {
            addCriterion("supplier_custom2 in", values, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2NotIn(List<String> values) {
            addCriterion("supplier_custom2 not in", values, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2Between(String value1, String value2) {
            addCriterion("supplier_custom2 between", value1, value2, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom2NotBetween(String value1, String value2) {
            addCriterion("supplier_custom2 not between", value1, value2, "supplierCustom2");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3IsNull() {
            addCriterion("supplier_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3IsNotNull() {
            addCriterion("supplier_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3EqualTo(String value) {
            addCriterion("supplier_custom3 =", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3NotEqualTo(String value) {
            addCriterion("supplier_custom3 <>", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3GreaterThan(String value) {
            addCriterion("supplier_custom3 >", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom3 >=", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3LessThan(String value) {
            addCriterion("supplier_custom3 <", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom3 <=", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3Like(String value) {
            addCriterion("supplier_custom3 like", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3NotLike(String value) {
            addCriterion("supplier_custom3 not like", value, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3In(List<String> values) {
            addCriterion("supplier_custom3 in", values, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3NotIn(List<String> values) {
            addCriterion("supplier_custom3 not in", values, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3Between(String value1, String value2) {
            addCriterion("supplier_custom3 between", value1, value2, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom3NotBetween(String value1, String value2) {
            addCriterion("supplier_custom3 not between", value1, value2, "supplierCustom3");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4IsNull() {
            addCriterion("supplier_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4IsNotNull() {
            addCriterion("supplier_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4EqualTo(String value) {
            addCriterion("supplier_custom4 =", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4NotEqualTo(String value) {
            addCriterion("supplier_custom4 <>", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4GreaterThan(String value) {
            addCriterion("supplier_custom4 >", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom4 >=", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4LessThan(String value) {
            addCriterion("supplier_custom4 <", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom4 <=", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4Like(String value) {
            addCriterion("supplier_custom4 like", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4NotLike(String value) {
            addCriterion("supplier_custom4 not like", value, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4In(List<String> values) {
            addCriterion("supplier_custom4 in", values, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4NotIn(List<String> values) {
            addCriterion("supplier_custom4 not in", values, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4Between(String value1, String value2) {
            addCriterion("supplier_custom4 between", value1, value2, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom4NotBetween(String value1, String value2) {
            addCriterion("supplier_custom4 not between", value1, value2, "supplierCustom4");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5IsNull() {
            addCriterion("supplier_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5IsNotNull() {
            addCriterion("supplier_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5EqualTo(String value) {
            addCriterion("supplier_custom5 =", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5NotEqualTo(String value) {
            addCriterion("supplier_custom5 <>", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5GreaterThan(String value) {
            addCriterion("supplier_custom5 >", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom5 >=", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5LessThan(String value) {
            addCriterion("supplier_custom5 <", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom5 <=", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5Like(String value) {
            addCriterion("supplier_custom5 like", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5NotLike(String value) {
            addCriterion("supplier_custom5 not like", value, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5In(List<String> values) {
            addCriterion("supplier_custom5 in", values, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5NotIn(List<String> values) {
            addCriterion("supplier_custom5 not in", values, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5Between(String value1, String value2) {
            addCriterion("supplier_custom5 between", value1, value2, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom5NotBetween(String value1, String value2) {
            addCriterion("supplier_custom5 not between", value1, value2, "supplierCustom5");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6IsNull() {
            addCriterion("supplier_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6IsNotNull() {
            addCriterion("supplier_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6EqualTo(String value) {
            addCriterion("supplier_custom6 =", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6NotEqualTo(String value) {
            addCriterion("supplier_custom6 <>", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6GreaterThan(String value) {
            addCriterion("supplier_custom6 >", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("supplier_custom6 >=", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6LessThan(String value) {
            addCriterion("supplier_custom6 <", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6LessThanOrEqualTo(String value) {
            addCriterion("supplier_custom6 <=", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6Like(String value) {
            addCriterion("supplier_custom6 like", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6NotLike(String value) {
            addCriterion("supplier_custom6 not like", value, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6In(List<String> values) {
            addCriterion("supplier_custom6 in", values, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6NotIn(List<String> values) {
            addCriterion("supplier_custom6 not in", values, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6Between(String value1, String value2) {
            addCriterion("supplier_custom6 between", value1, value2, "supplierCustom6");
            return (Criteria) this;
        }

        public Criteria andSupplierCustom6NotBetween(String value1, String value2) {
            addCriterion("supplier_custom6 not between", value1, value2, "supplierCustom6");
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