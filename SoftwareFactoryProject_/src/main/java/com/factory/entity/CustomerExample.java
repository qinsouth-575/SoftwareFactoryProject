package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameIsNull() {
            addCriterion("customer_easyname is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameIsNotNull() {
            addCriterion("customer_easyname is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameEqualTo(String value) {
            addCriterion("customer_easyname =", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameNotEqualTo(String value) {
            addCriterion("customer_easyname <>", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameGreaterThan(String value) {
            addCriterion("customer_easyname >", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_easyname >=", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameLessThan(String value) {
            addCriterion("customer_easyname <", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameLessThanOrEqualTo(String value) {
            addCriterion("customer_easyname <=", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameLike(String value) {
            addCriterion("customer_easyname like", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameNotLike(String value) {
            addCriterion("customer_easyname not like", value, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameIn(List<String> values) {
            addCriterion("customer_easyname in", values, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameNotIn(List<String> values) {
            addCriterion("customer_easyname not in", values, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameBetween(String value1, String value2) {
            addCriterion("customer_easyname between", value1, value2, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEasynameNotBetween(String value1, String value2) {
            addCriterion("customer_easyname not between", value1, value2, "customerEasyname");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameIsNull() {
            addCriterion("customer_english_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameIsNotNull() {
            addCriterion("customer_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameEqualTo(String value) {
            addCriterion("customer_english_name =", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameNotEqualTo(String value) {
            addCriterion("customer_english_name <>", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameGreaterThan(String value) {
            addCriterion("customer_english_name >", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_english_name >=", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameLessThan(String value) {
            addCriterion("customer_english_name <", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("customer_english_name <=", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameLike(String value) {
            addCriterion("customer_english_name like", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameNotLike(String value) {
            addCriterion("customer_english_name not like", value, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameIn(List<String> values) {
            addCriterion("customer_english_name in", values, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameNotIn(List<String> values) {
            addCriterion("customer_english_name not in", values, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameBetween(String value1, String value2) {
            addCriterion("customer_english_name between", value1, value2, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerEnglishNameNotBetween(String value1, String value2) {
            addCriterion("customer_english_name not between", value1, value2, "customerEnglishName");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonIsNull() {
            addCriterion("customer_charge_person is null");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonIsNotNull() {
            addCriterion("customer_charge_person is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonEqualTo(String value) {
            addCriterion("customer_charge_person =", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonNotEqualTo(String value) {
            addCriterion("customer_charge_person <>", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonGreaterThan(String value) {
            addCriterion("customer_charge_person >", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonGreaterThanOrEqualTo(String value) {
            addCriterion("customer_charge_person >=", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonLessThan(String value) {
            addCriterion("customer_charge_person <", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonLessThanOrEqualTo(String value) {
            addCriterion("customer_charge_person <=", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonLike(String value) {
            addCriterion("customer_charge_person like", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonNotLike(String value) {
            addCriterion("customer_charge_person not like", value, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonIn(List<String> values) {
            addCriterion("customer_charge_person in", values, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonNotIn(List<String> values) {
            addCriterion("customer_charge_person not in", values, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonBetween(String value1, String value2) {
            addCriterion("customer_charge_person between", value1, value2, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerChargePersonNotBetween(String value1, String value2) {
            addCriterion("customer_charge_person not between", value1, value2, "customerChargePerson");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipIsNull() {
            addCriterion("customer_account_ownership is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipIsNotNull() {
            addCriterion("customer_account_ownership is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipEqualTo(String value) {
            addCriterion("customer_account_ownership =", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipNotEqualTo(String value) {
            addCriterion("customer_account_ownership <>", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipGreaterThan(String value) {
            addCriterion("customer_account_ownership >", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("customer_account_ownership >=", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipLessThan(String value) {
            addCriterion("customer_account_ownership <", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipLessThanOrEqualTo(String value) {
            addCriterion("customer_account_ownership <=", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipLike(String value) {
            addCriterion("customer_account_ownership like", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipNotLike(String value) {
            addCriterion("customer_account_ownership not like", value, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipIn(List<String> values) {
            addCriterion("customer_account_ownership in", values, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipNotIn(List<String> values) {
            addCriterion("customer_account_ownership not in", values, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipBetween(String value1, String value2) {
            addCriterion("customer_account_ownership between", value1, value2, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountOwnershipNotBetween(String value1, String value2) {
            addCriterion("customer_account_ownership not between", value1, value2, "customerAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneIsNull() {
            addCriterion("customer_zone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneIsNotNull() {
            addCriterion("customer_zone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneEqualTo(String value) {
            addCriterion("customer_zone =", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneNotEqualTo(String value) {
            addCriterion("customer_zone <>", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneGreaterThan(String value) {
            addCriterion("customer_zone >", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_zone >=", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneLessThan(String value) {
            addCriterion("customer_zone <", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneLessThanOrEqualTo(String value) {
            addCriterion("customer_zone <=", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneLike(String value) {
            addCriterion("customer_zone like", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneNotLike(String value) {
            addCriterion("customer_zone not like", value, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneIn(List<String> values) {
            addCriterion("customer_zone in", values, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneNotIn(List<String> values) {
            addCriterion("customer_zone not in", values, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneBetween(String value1, String value2) {
            addCriterion("customer_zone between", value1, value2, "customerZone");
            return (Criteria) this;
        }

        public Criteria andCustomerZoneNotBetween(String value1, String value2) {
            addCriterion("customer_zone not between", value1, value2, "customerZone");
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

        public Criteria andCustomerPrincipalmanIsNull() {
            addCriterion("customer_principalman is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanIsNotNull() {
            addCriterion("customer_principalman is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanEqualTo(String value) {
            addCriterion("customer_principalman =", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanNotEqualTo(String value) {
            addCriterion("customer_principalman <>", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanGreaterThan(String value) {
            addCriterion("customer_principalman >", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanGreaterThanOrEqualTo(String value) {
            addCriterion("customer_principalman >=", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanLessThan(String value) {
            addCriterion("customer_principalman <", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanLessThanOrEqualTo(String value) {
            addCriterion("customer_principalman <=", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanLike(String value) {
            addCriterion("customer_principalman like", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanNotLike(String value) {
            addCriterion("customer_principalman not like", value, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanIn(List<String> values) {
            addCriterion("customer_principalman in", values, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanNotIn(List<String> values) {
            addCriterion("customer_principalman not in", values, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanBetween(String value1, String value2) {
            addCriterion("customer_principalman between", value1, value2, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerPrincipalmanNotBetween(String value1, String value2) {
            addCriterion("customer_principalman not between", value1, value2, "customerPrincipalman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIsNull() {
            addCriterion("customer_linkman is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIsNotNull() {
            addCriterion("customer_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanEqualTo(String value) {
            addCriterion("customer_linkman =", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotEqualTo(String value) {
            addCriterion("customer_linkman <>", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanGreaterThan(String value) {
            addCriterion("customer_linkman >", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("customer_linkman >=", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLessThan(String value) {
            addCriterion("customer_linkman <", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLessThanOrEqualTo(String value) {
            addCriterion("customer_linkman <=", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanLike(String value) {
            addCriterion("customer_linkman like", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotLike(String value) {
            addCriterion("customer_linkman not like", value, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanIn(List<String> values) {
            addCriterion("customer_linkman in", values, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotIn(List<String> values) {
            addCriterion("customer_linkman not in", values, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanBetween(String value1, String value2) {
            addCriterion("customer_linkman between", value1, value2, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinkmanNotBetween(String value1, String value2) {
            addCriterion("customer_linkman not between", value1, value2, "customerLinkman");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaIsNull() {
            addCriterion("customer_linktela is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaIsNotNull() {
            addCriterion("customer_linktela is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaEqualTo(String value) {
            addCriterion("customer_linktela =", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaNotEqualTo(String value) {
            addCriterion("customer_linktela <>", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaGreaterThan(String value) {
            addCriterion("customer_linktela >", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaGreaterThanOrEqualTo(String value) {
            addCriterion("customer_linktela >=", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaLessThan(String value) {
            addCriterion("customer_linktela <", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaLessThanOrEqualTo(String value) {
            addCriterion("customer_linktela <=", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaLike(String value) {
            addCriterion("customer_linktela like", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaNotLike(String value) {
            addCriterion("customer_linktela not like", value, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaIn(List<String> values) {
            addCriterion("customer_linktela in", values, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaNotIn(List<String> values) {
            addCriterion("customer_linktela not in", values, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaBetween(String value1, String value2) {
            addCriterion("customer_linktela between", value1, value2, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelaNotBetween(String value1, String value2) {
            addCriterion("customer_linktela not between", value1, value2, "customerLinktela");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbIsNull() {
            addCriterion("customer_linktelb is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbIsNotNull() {
            addCriterion("customer_linktelb is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbEqualTo(String value) {
            addCriterion("customer_linktelb =", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbNotEqualTo(String value) {
            addCriterion("customer_linktelb <>", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbGreaterThan(String value) {
            addCriterion("customer_linktelb >", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbGreaterThanOrEqualTo(String value) {
            addCriterion("customer_linktelb >=", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbLessThan(String value) {
            addCriterion("customer_linktelb <", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbLessThanOrEqualTo(String value) {
            addCriterion("customer_linktelb <=", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbLike(String value) {
            addCriterion("customer_linktelb like", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbNotLike(String value) {
            addCriterion("customer_linktelb not like", value, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbIn(List<String> values) {
            addCriterion("customer_linktelb in", values, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbNotIn(List<String> values) {
            addCriterion("customer_linktelb not in", values, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbBetween(String value1, String value2) {
            addCriterion("customer_linktelb between", value1, value2, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelbNotBetween(String value1, String value2) {
            addCriterion("customer_linktelb not between", value1, value2, "customerLinktelb");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcIsNull() {
            addCriterion("customer_linktelc is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcIsNotNull() {
            addCriterion("customer_linktelc is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcEqualTo(String value) {
            addCriterion("customer_linktelc =", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcNotEqualTo(String value) {
            addCriterion("customer_linktelc <>", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcGreaterThan(String value) {
            addCriterion("customer_linktelc >", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcGreaterThanOrEqualTo(String value) {
            addCriterion("customer_linktelc >=", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcLessThan(String value) {
            addCriterion("customer_linktelc <", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcLessThanOrEqualTo(String value) {
            addCriterion("customer_linktelc <=", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcLike(String value) {
            addCriterion("customer_linktelc like", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcNotLike(String value) {
            addCriterion("customer_linktelc not like", value, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcIn(List<String> values) {
            addCriterion("customer_linktelc in", values, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcNotIn(List<String> values) {
            addCriterion("customer_linktelc not in", values, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcBetween(String value1, String value2) {
            addCriterion("customer_linktelc between", value1, value2, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerLinktelcNotBetween(String value1, String value2) {
            addCriterion("customer_linktelc not between", value1, value2, "customerLinktelc");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneIsNull() {
            addCriterion("customer_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneIsNotNull() {
            addCriterion("customer_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneEqualTo(String value) {
            addCriterion("customer_mobilephone =", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneNotEqualTo(String value) {
            addCriterion("customer_mobilephone <>", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneGreaterThan(String value) {
            addCriterion("customer_mobilephone >", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_mobilephone >=", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneLessThan(String value) {
            addCriterion("customer_mobilephone <", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("customer_mobilephone <=", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneLike(String value) {
            addCriterion("customer_mobilephone like", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneNotLike(String value) {
            addCriterion("customer_mobilephone not like", value, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneIn(List<String> values) {
            addCriterion("customer_mobilephone in", values, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneNotIn(List<String> values) {
            addCriterion("customer_mobilephone not in", values, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneBetween(String value1, String value2) {
            addCriterion("customer_mobilephone between", value1, value2, "customerMobilephone");
            return (Criteria) this;
        }

        public Criteria andCustomerMobilephoneNotBetween(String value1, String value2) {
            addCriterion("customer_mobilephone not between", value1, value2, "customerMobilephone");
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

        public Criteria andCustomerTaxchecknoIsNull() {
            addCriterion("customer_taxcheckno is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoIsNotNull() {
            addCriterion("customer_taxcheckno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoEqualTo(String value) {
            addCriterion("customer_taxcheckno =", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoNotEqualTo(String value) {
            addCriterion("customer_taxcheckno <>", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoGreaterThan(String value) {
            addCriterion("customer_taxcheckno >", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_taxcheckno >=", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoLessThan(String value) {
            addCriterion("customer_taxcheckno <", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoLessThanOrEqualTo(String value) {
            addCriterion("customer_taxcheckno <=", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoLike(String value) {
            addCriterion("customer_taxcheckno like", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoNotLike(String value) {
            addCriterion("customer_taxcheckno not like", value, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoIn(List<String> values) {
            addCriterion("customer_taxcheckno in", values, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoNotIn(List<String> values) {
            addCriterion("customer_taxcheckno not in", values, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoBetween(String value1, String value2) {
            addCriterion("customer_taxcheckno between", value1, value2, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxchecknoNotBetween(String value1, String value2) {
            addCriterion("customer_taxcheckno not between", value1, value2, "customerTaxcheckno");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyIsNull() {
            addCriterion("customer_capitalmoney is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyIsNotNull() {
            addCriterion("customer_capitalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyEqualTo(Float value) {
            addCriterion("customer_capitalmoney =", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyNotEqualTo(Float value) {
            addCriterion("customer_capitalmoney <>", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyGreaterThan(Float value) {
            addCriterion("customer_capitalmoney >", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_capitalmoney >=", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyLessThan(Float value) {
            addCriterion("customer_capitalmoney <", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("customer_capitalmoney <=", value, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyIn(List<Float> values) {
            addCriterion("customer_capitalmoney in", values, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyNotIn(List<Float> values) {
            addCriterion("customer_capitalmoney not in", values, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyBetween(Float value1, Float value2) {
            addCriterion("customer_capitalmoney between", value1, value2, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCapitalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("customer_capitalmoney not between", value1, value2, "customerCapitalmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIsNull() {
            addCriterion("customer_job is null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIsNotNull() {
            addCriterion("customer_job is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobEqualTo(String value) {
            addCriterion("customer_job =", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotEqualTo(String value) {
            addCriterion("customer_job <>", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobGreaterThan(String value) {
            addCriterion("customer_job >", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobGreaterThanOrEqualTo(String value) {
            addCriterion("customer_job >=", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLessThan(String value) {
            addCriterion("customer_job <", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLessThanOrEqualTo(String value) {
            addCriterion("customer_job <=", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLike(String value) {
            addCriterion("customer_job like", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotLike(String value) {
            addCriterion("customer_job not like", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIn(List<String> values) {
            addCriterion("customer_job in", values, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotIn(List<String> values) {
            addCriterion("customer_job not in", values, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobBetween(String value1, String value2) {
            addCriterion("customer_job between", value1, value2, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotBetween(String value1, String value2) {
            addCriterion("customer_job not between", value1, value2, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddIsNull() {
            addCriterion("customer_webadd is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddIsNotNull() {
            addCriterion("customer_webadd is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddEqualTo(String value) {
            addCriterion("customer_webadd =", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddNotEqualTo(String value) {
            addCriterion("customer_webadd <>", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddGreaterThan(String value) {
            addCriterion("customer_webadd >", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddGreaterThanOrEqualTo(String value) {
            addCriterion("customer_webadd >=", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddLessThan(String value) {
            addCriterion("customer_webadd <", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddLessThanOrEqualTo(String value) {
            addCriterion("customer_webadd <=", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddLike(String value) {
            addCriterion("customer_webadd like", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddNotLike(String value) {
            addCriterion("customer_webadd not like", value, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddIn(List<String> values) {
            addCriterion("customer_webadd in", values, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddNotIn(List<String> values) {
            addCriterion("customer_webadd not in", values, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddBetween(String value1, String value2) {
            addCriterion("customer_webadd between", value1, value2, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerWebaddNotBetween(String value1, String value2) {
            addCriterion("customer_webadd not between", value1, value2, "customerWebadd");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoIsNull() {
            addCriterion("customer_faxno is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoIsNotNull() {
            addCriterion("customer_faxno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoEqualTo(String value) {
            addCriterion("customer_faxno =", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoNotEqualTo(String value) {
            addCriterion("customer_faxno <>", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoGreaterThan(String value) {
            addCriterion("customer_faxno >", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_faxno >=", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoLessThan(String value) {
            addCriterion("customer_faxno <", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoLessThanOrEqualTo(String value) {
            addCriterion("customer_faxno <=", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoLike(String value) {
            addCriterion("customer_faxno like", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoNotLike(String value) {
            addCriterion("customer_faxno not like", value, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoIn(List<String> values) {
            addCriterion("customer_faxno in", values, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoNotIn(List<String> values) {
            addCriterion("customer_faxno not in", values, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoBetween(String value1, String value2) {
            addCriterion("customer_faxno between", value1, value2, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxnoNotBetween(String value1, String value2) {
            addCriterion("customer_faxno not between", value1, value2, "customerFaxno");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutIsNull() {
            addCriterion("customer_cufirstsaleout is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutIsNotNull() {
            addCriterion("customer_cufirstsaleout is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout =", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout <>", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout >", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout >=", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutLessThan(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout <", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsaleout <=", value, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cufirstsaleout in", values, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cufirstsaleout not in", values, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cufirstsaleout between", value1, value2, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsaleoutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cufirstsaleout not between", value1, value2, "customerCufirstsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnIsNull() {
            addCriterion("customer_cufirstsalereturn is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnIsNotNull() {
            addCriterion("customer_cufirstsalereturn is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn =", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn <>", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn >", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn >=", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnLessThan(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn <", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cufirstsalereturn <=", value, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cufirstsalereturn in", values, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cufirstsalereturn not in", values, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cufirstsalereturn between", value1, value2, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstsalereturnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cufirstsalereturn not between", value1, value2, "customerCufirstsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutIsNull() {
            addCriterion("customer_curecentsaleout is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutIsNotNull() {
            addCriterion("customer_curecentsaleout is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout =", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout <>", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout >", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout >=", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutLessThan(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout <", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsaleout <=", value, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentsaleout in", values, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentsaleout not in", values, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentsaleout between", value1, value2, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsaleoutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentsaleout not between", value1, value2, "customerCurecentsaleout");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnIsNull() {
            addCriterion("customer_curecentsalereturn is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnIsNotNull() {
            addCriterion("customer_curecentsalereturn is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn =", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn <>", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn >", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn >=", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnLessThan(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn <", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentsalereturn <=", value, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentsalereturn in", values, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentsalereturn not in", values, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentsalereturn between", value1, value2, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentsalereturnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentsalereturn not between", value1, value2, "customerCurecentsalereturn");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitIsNull() {
            addCriterion("customer_curecentvisit is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitIsNotNull() {
            addCriterion("customer_curecentvisit is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit =", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit <>", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit >", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit >=", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitLessThan(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit <", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_curecentvisit <=", value, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentvisit in", values, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_curecentvisit not in", values, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentvisit between", value1, value2, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCurecentvisitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_curecentvisit not between", value1, value2, "customerCurecentvisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitIsNull() {
            addCriterion("customer_cuordervisit is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitIsNotNull() {
            addCriterion("customer_cuordervisit is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit =", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit <>", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit >", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit >=", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitLessThan(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit <", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuordervisit <=", value, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cuordervisit in", values, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cuordervisit not in", values, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cuordervisit between", value1, value2, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerCuordervisitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cuordervisit not between", value1, value2, "customerCuordervisit");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointIsNull() {
            addCriterion("customer_discountpoint is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointIsNotNull() {
            addCriterion("customer_discountpoint is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointEqualTo(Float value) {
            addCriterion("customer_discountpoint =", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointNotEqualTo(Float value) {
            addCriterion("customer_discountpoint <>", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointGreaterThan(Float value) {
            addCriterion("customer_discountpoint >", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_discountpoint >=", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointLessThan(Float value) {
            addCriterion("customer_discountpoint <", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointLessThanOrEqualTo(Float value) {
            addCriterion("customer_discountpoint <=", value, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointIn(List<Float> values) {
            addCriterion("customer_discountpoint in", values, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointNotIn(List<Float> values) {
            addCriterion("customer_discountpoint not in", values, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointBetween(Float value1, Float value2) {
            addCriterion("customer_discountpoint between", value1, value2, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerDiscountpointNotBetween(Float value1, Float value2) {
            addCriterion("customer_discountpoint not between", value1, value2, "customerDiscountpoint");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvIsNull() {
            addCriterion("customer_salelv is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvIsNotNull() {
            addCriterion("customer_salelv is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvEqualTo(String value) {
            addCriterion("customer_salelv =", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvNotEqualTo(String value) {
            addCriterion("customer_salelv <>", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvGreaterThan(String value) {
            addCriterion("customer_salelv >", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvGreaterThanOrEqualTo(String value) {
            addCriterion("customer_salelv >=", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvLessThan(String value) {
            addCriterion("customer_salelv <", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvLessThanOrEqualTo(String value) {
            addCriterion("customer_salelv <=", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvLike(String value) {
            addCriterion("customer_salelv like", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvNotLike(String value) {
            addCriterion("customer_salelv not like", value, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvIn(List<String> values) {
            addCriterion("customer_salelv in", values, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvNotIn(List<String> values) {
            addCriterion("customer_salelv not in", values, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvBetween(String value1, String value2) {
            addCriterion("customer_salelv between", value1, value2, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerSalelvNotBetween(String value1, String value2) {
            addCriterion("customer_salelv not between", value1, value2, "customerSalelv");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxIsNull() {
            addCriterion("customer_cuiftax is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxIsNotNull() {
            addCriterion("customer_cuiftax is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxEqualTo(Integer value) {
            addCriterion("customer_cuiftax =", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxNotEqualTo(Integer value) {
            addCriterion("customer_cuiftax <>", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxGreaterThan(Integer value) {
            addCriterion("customer_cuiftax >", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_cuiftax >=", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxLessThan(Integer value) {
            addCriterion("customer_cuiftax <", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxLessThanOrEqualTo(Integer value) {
            addCriterion("customer_cuiftax <=", value, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxIn(List<Integer> values) {
            addCriterion("customer_cuiftax in", values, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxNotIn(List<Integer> values) {
            addCriterion("customer_cuiftax not in", values, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxBetween(Integer value1, Integer value2) {
            addCriterion("customer_cuiftax between", value1, value2, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerCuiftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_cuiftax not between", value1, value2, "customerCuiftax");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoIsNull() {
            addCriterion("customer_latentcusno is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoIsNotNull() {
            addCriterion("customer_latentcusno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoEqualTo(String value) {
            addCriterion("customer_latentcusno =", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoNotEqualTo(String value) {
            addCriterion("customer_latentcusno <>", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoGreaterThan(String value) {
            addCriterion("customer_latentcusno >", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_latentcusno >=", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoLessThan(String value) {
            addCriterion("customer_latentcusno <", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoLessThanOrEqualTo(String value) {
            addCriterion("customer_latentcusno <=", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoLike(String value) {
            addCriterion("customer_latentcusno like", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoNotLike(String value) {
            addCriterion("customer_latentcusno not like", value, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoIn(List<String> values) {
            addCriterion("customer_latentcusno in", values, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoNotIn(List<String> values) {
            addCriterion("customer_latentcusno not in", values, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoBetween(String value1, String value2) {
            addCriterion("customer_latentcusno between", value1, value2, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerLatentcusnoNotBetween(String value1, String value2) {
            addCriterion("customer_latentcusno not between", value1, value2, "customerLatentcusno");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateIsNull() {
            addCriterion("customer_tanddate is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateIsNotNull() {
            addCriterion("customer_tanddate is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateEqualTo(Date value) {
            addCriterionForJDBCDate("customer_tanddate =", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_tanddate <>", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_tanddate >", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_tanddate >=", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateLessThan(Date value) {
            addCriterionForJDBCDate("customer_tanddate <", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_tanddate <=", value, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateIn(List<Date> values) {
            addCriterionForJDBCDate("customer_tanddate in", values, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_tanddate not in", values, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_tanddate between", value1, value2, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andCustomerTanddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_tanddate not between", value1, value2, "customerTanddate");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayIsNull() {
            addCriterion("endbusinessday is null");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayIsNotNull() {
            addCriterion("endbusinessday is not null");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayEqualTo(Date value) {
            addCriterionForJDBCDate("endbusinessday =", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("endbusinessday <>", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayGreaterThan(Date value) {
            addCriterionForJDBCDate("endbusinessday >", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endbusinessday >=", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayLessThan(Date value) {
            addCriterionForJDBCDate("endbusinessday <", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endbusinessday <=", value, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayIn(List<Date> values) {
            addCriterionForJDBCDate("endbusinessday in", values, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("endbusinessday not in", values, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endbusinessday between", value1, value2, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andEndbusinessdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endbusinessday not between", value1, value2, "endbusinessday");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyIsNull() {
            addCriterion("customer_creditmoney is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyIsNotNull() {
            addCriterion("customer_creditmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyEqualTo(Float value) {
            addCriterion("customer_creditmoney =", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyNotEqualTo(Float value) {
            addCriterion("customer_creditmoney <>", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyGreaterThan(Float value) {
            addCriterion("customer_creditmoney >", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_creditmoney >=", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyLessThan(Float value) {
            addCriterion("customer_creditmoney <", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyLessThanOrEqualTo(Float value) {
            addCriterion("customer_creditmoney <=", value, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyIn(List<Float> values) {
            addCriterion("customer_creditmoney in", values, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyNotIn(List<Float> values) {
            addCriterion("customer_creditmoney not in", values, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyBetween(Float value1, Float value2) {
            addCriterion("customer_creditmoney between", value1, value2, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditmoneyNotBetween(Float value1, Float value2) {
            addCriterion("customer_creditmoney not between", value1, value2, "customerCreditmoney");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetIsNull() {
            addCriterion("customer_residuemonet is null");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetIsNotNull() {
            addCriterion("customer_residuemonet is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetEqualTo(Float value) {
            addCriterion("customer_residuemonet =", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetNotEqualTo(Float value) {
            addCriterion("customer_residuemonet <>", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetGreaterThan(Float value) {
            addCriterion("customer_residuemonet >", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_residuemonet >=", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetLessThan(Float value) {
            addCriterion("customer_residuemonet <", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetLessThanOrEqualTo(Float value) {
            addCriterion("customer_residuemonet <=", value, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetIn(List<Float> values) {
            addCriterion("customer_residuemonet in", values, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetNotIn(List<Float> values) {
            addCriterion("customer_residuemonet not in", values, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetBetween(Float value1, Float value2) {
            addCriterion("customer_residuemonet between", value1, value2, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andCustomerResiduemonetNotBetween(Float value1, Float value2) {
            addCriterion("customer_residuemonet not between", value1, value2, "customerResiduemonet");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNull() {
            addCriterion("Receivable_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIsNotNull() {
            addCriterion("Receivable_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableIdEqualTo(String value) {
            addCriterion("Receivable_id =", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotEqualTo(String value) {
            addCriterion("Receivable_id <>", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThan(String value) {
            addCriterion("Receivable_id >", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdGreaterThanOrEqualTo(String value) {
            addCriterion("Receivable_id >=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThan(String value) {
            addCriterion("Receivable_id <", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLessThanOrEqualTo(String value) {
            addCriterion("Receivable_id <=", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdLike(String value) {
            addCriterion("Receivable_id like", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotLike(String value) {
            addCriterion("Receivable_id not like", value, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdIn(List<String> values) {
            addCriterion("Receivable_id in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotIn(List<String> values) {
            addCriterion("Receivable_id not in", values, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdBetween(String value1, String value2) {
            addCriterion("Receivable_id between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andReceivableIdNotBetween(String value1, String value2) {
            addCriterion("Receivable_id not between", value1, value2, "receivableId");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayIsNull() {
            addCriterion("customer_cuendorderday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayIsNotNull() {
            addCriterion("customer_cuendorderday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday =", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday <>", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday >", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday >=", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayLessThan(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday <", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_cuendorderday <=", value, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cuendorderday in", values, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_cuendorderday not in", values, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cuendorderday between", value1, value2, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendorderdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_cuendorderday not between", value1, value2, "customerCuendorderday");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvIsNull() {
            addCriterion("customer_honestlv is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvIsNotNull() {
            addCriterion("customer_honestlv is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvEqualTo(String value) {
            addCriterion("customer_honestlv =", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvNotEqualTo(String value) {
            addCriterion("customer_honestlv <>", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvGreaterThan(String value) {
            addCriterion("customer_honestlv >", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvGreaterThanOrEqualTo(String value) {
            addCriterion("customer_honestlv >=", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvLessThan(String value) {
            addCriterion("customer_honestlv <", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvLessThanOrEqualTo(String value) {
            addCriterion("customer_honestlv <=", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvLike(String value) {
            addCriterion("customer_honestlv like", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvNotLike(String value) {
            addCriterion("customer_honestlv not like", value, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvIn(List<String> values) {
            addCriterion("customer_honestlv in", values, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvNotIn(List<String> values) {
            addCriterion("customer_honestlv not in", values, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvBetween(String value1, String value2) {
            addCriterion("customer_honestlv between", value1, value2, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andCustomerHonestlvNotBetween(String value1, String value2) {
            addCriterion("customer_honestlv not between", value1, value2, "customerHonestlv");
            return (Criteria) this;
        }

        public Criteria andItIdIsNull() {
            addCriterion("it_id is null");
            return (Criteria) this;
        }

        public Criteria andItIdIsNotNull() {
            addCriterion("it_id is not null");
            return (Criteria) this;
        }

        public Criteria andItIdEqualTo(String value) {
            addCriterion("it_id =", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotEqualTo(String value) {
            addCriterion("it_id <>", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThan(String value) {
            addCriterion("it_id >", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdGreaterThanOrEqualTo(String value) {
            addCriterion("it_id >=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThan(String value) {
            addCriterion("it_id <", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLessThanOrEqualTo(String value) {
            addCriterion("it_id <=", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdLike(String value) {
            addCriterion("it_id like", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotLike(String value) {
            addCriterion("it_id not like", value, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdIn(List<String> values) {
            addCriterion("it_id in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotIn(List<String> values) {
            addCriterion("it_id not in", values, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdBetween(String value1, String value2) {
            addCriterion("it_id between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItIdNotBetween(String value1, String value2) {
            addCriterion("it_id not between", value1, value2, "itId");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIsNull() {
            addCriterion("It_Accounts_eceivable_subject is null");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIsNotNull() {
            addCriterion("It_Accounts_eceivable_subject is not null");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject =", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject <>", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectGreaterThan(String value) {
            addCriterion("It_Accounts_eceivable_subject >", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject >=", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLessThan(String value) {
            addCriterion("It_Accounts_eceivable_subject <", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLessThanOrEqualTo(String value) {
            addCriterion("It_Accounts_eceivable_subject <=", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectLike(String value) {
            addCriterion("It_Accounts_eceivable_subject like", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotLike(String value) {
            addCriterion("It_Accounts_eceivable_subject not like", value, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectIn(List<String> values) {
            addCriterion("It_Accounts_eceivable_subject in", values, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotIn(List<String> values) {
            addCriterion("It_Accounts_eceivable_subject not in", values, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectBetween(String value1, String value2) {
            addCriterion("It_Accounts_eceivable_subject between", value1, value2, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andItAccountsEceivableSubjectNotBetween(String value1, String value2) {
            addCriterion("It_Accounts_eceivable_subject not between", value1, value2, "itAccountsEceivableSubject");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectIsNull() {
            addCriterion("customer_cufirstcollect is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectIsNotNull() {
            addCriterion("customer_cufirstcollect is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectEqualTo(Float value) {
            addCriterion("customer_cufirstcollect =", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectNotEqualTo(Float value) {
            addCriterion("customer_cufirstcollect <>", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectGreaterThan(Float value) {
            addCriterion("customer_cufirstcollect >", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_cufirstcollect >=", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectLessThan(Float value) {
            addCriterion("customer_cufirstcollect <", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectLessThanOrEqualTo(Float value) {
            addCriterion("customer_cufirstcollect <=", value, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectIn(List<Float> values) {
            addCriterion("customer_cufirstcollect in", values, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectNotIn(List<Float> values) {
            addCriterion("customer_cufirstcollect not in", values, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectBetween(Float value1, Float value2) {
            addCriterion("customer_cufirstcollect between", value1, value2, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCufirstcollectNotBetween(Float value1, Float value2) {
            addCriterion("customer_cufirstcollect not between", value1, value2, "customerCufirstcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectIsNull() {
            addCriterion("customer_houldcollect is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectIsNotNull() {
            addCriterion("customer_houldcollect is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectEqualTo(Float value) {
            addCriterion("customer_houldcollect =", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectNotEqualTo(Float value) {
            addCriterion("customer_houldcollect <>", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectGreaterThan(Float value) {
            addCriterion("customer_houldcollect >", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_houldcollect >=", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectLessThan(Float value) {
            addCriterion("customer_houldcollect <", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectLessThanOrEqualTo(Float value) {
            addCriterion("customer_houldcollect <=", value, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectIn(List<Float> values) {
            addCriterion("customer_houldcollect in", values, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectNotIn(List<Float> values) {
            addCriterion("customer_houldcollect not in", values, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectBetween(Float value1, Float value2) {
            addCriterion("customer_houldcollect between", value1, value2, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerHouldcollectNotBetween(Float value1, Float value2) {
            addCriterion("customer_houldcollect not between", value1, value2, "customerHouldcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectIsNull() {
            addCriterion("customer_cuendcollect is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectIsNotNull() {
            addCriterion("customer_cuendcollect is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectEqualTo(Float value) {
            addCriterion("customer_cuendcollect =", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectNotEqualTo(Float value) {
            addCriterion("customer_cuendcollect <>", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectGreaterThan(Float value) {
            addCriterion("customer_cuendcollect >", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_cuendcollect >=", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectLessThan(Float value) {
            addCriterion("customer_cuendcollect <", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectLessThanOrEqualTo(Float value) {
            addCriterion("customer_cuendcollect <=", value, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectIn(List<Float> values) {
            addCriterion("customer_cuendcollect in", values, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectNotIn(List<Float> values) {
            addCriterion("customer_cuendcollect not in", values, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectBetween(Float value1, Float value2) {
            addCriterion("customer_cuendcollect between", value1, value2, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCustomerCuendcollectNotBetween(Float value1, Float value2) {
            addCriterion("customer_cuendcollect not between", value1, value2, "customerCuendcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectIsNull() {
            addCriterion("cuendshouldcollect is null");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectIsNotNull() {
            addCriterion("cuendshouldcollect is not null");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectEqualTo(Float value) {
            addCriterion("cuendshouldcollect =", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectNotEqualTo(Float value) {
            addCriterion("cuendshouldcollect <>", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectGreaterThan(Float value) {
            addCriterion("cuendshouldcollect >", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectGreaterThanOrEqualTo(Float value) {
            addCriterion("cuendshouldcollect >=", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectLessThan(Float value) {
            addCriterion("cuendshouldcollect <", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectLessThanOrEqualTo(Float value) {
            addCriterion("cuendshouldcollect <=", value, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectIn(List<Float> values) {
            addCriterion("cuendshouldcollect in", values, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectNotIn(List<Float> values) {
            addCriterion("cuendshouldcollect not in", values, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectBetween(Float value1, Float value2) {
            addCriterion("cuendshouldcollect between", value1, value2, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andCuendshouldcollectNotBetween(Float value1, Float value2) {
            addCriterion("cuendshouldcollect not between", value1, value2, "cuendshouldcollect");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIsNull() {
            addCriterion("It_deposit_received_subject is null");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIsNotNull() {
            addCriterion("It_deposit_received_subject is not null");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectEqualTo(String value) {
            addCriterion("It_deposit_received_subject =", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotEqualTo(String value) {
            addCriterion("It_deposit_received_subject <>", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectGreaterThan(String value) {
            addCriterion("It_deposit_received_subject >", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("It_deposit_received_subject >=", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLessThan(String value) {
            addCriterion("It_deposit_received_subject <", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLessThanOrEqualTo(String value) {
            addCriterion("It_deposit_received_subject <=", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectLike(String value) {
            addCriterion("It_deposit_received_subject like", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotLike(String value) {
            addCriterion("It_deposit_received_subject not like", value, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectIn(List<String> values) {
            addCriterion("It_deposit_received_subject in", values, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotIn(List<String> values) {
            addCriterion("It_deposit_received_subject not in", values, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectBetween(String value1, String value2) {
            addCriterion("It_deposit_received_subject between", value1, value2, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andItDepositReceivedSubjectNotBetween(String value1, String value2) {
            addCriterion("It_deposit_received_subject not between", value1, value2, "itDepositReceivedSubject");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationIsNull() {
            addCriterion("customer_cudecoration is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationIsNotNull() {
            addCriterion("customer_cudecoration is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationEqualTo(String value) {
            addCriterion("customer_cudecoration =", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationNotEqualTo(String value) {
            addCriterion("customer_cudecoration <>", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationGreaterThan(String value) {
            addCriterion("customer_cudecoration >", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cudecoration >=", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationLessThan(String value) {
            addCriterion("customer_cudecoration <", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationLessThanOrEqualTo(String value) {
            addCriterion("customer_cudecoration <=", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationLike(String value) {
            addCriterion("customer_cudecoration like", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationNotLike(String value) {
            addCriterion("customer_cudecoration not like", value, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationIn(List<String> values) {
            addCriterion("customer_cudecoration in", values, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationNotIn(List<String> values) {
            addCriterion("customer_cudecoration not in", values, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationBetween(String value1, String value2) {
            addCriterion("customer_cudecoration between", value1, value2, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerCudecorationNotBetween(String value1, String value2) {
            addCriterion("customer_cudecoration not between", value1, value2, "customerCudecoration");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingIsNull() {
            addCriterion("customer_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingIsNotNull() {
            addCriterion("customer_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingEqualTo(String value) {
            addCriterion("customer_Auditing =", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingNotEqualTo(String value) {
            addCriterion("customer_Auditing <>", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingGreaterThan(String value) {
            addCriterion("customer_Auditing >", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("customer_Auditing >=", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingLessThan(String value) {
            addCriterion("customer_Auditing <", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingLessThanOrEqualTo(String value) {
            addCriterion("customer_Auditing <=", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingLike(String value) {
            addCriterion("customer_Auditing like", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingNotLike(String value) {
            addCriterion("customer_Auditing not like", value, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingIn(List<String> values) {
            addCriterion("customer_Auditing in", values, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingNotIn(List<String> values) {
            addCriterion("customer_Auditing not in", values, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingBetween(String value1, String value2) {
            addCriterion("customer_Auditing between", value1, value2, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerAuditingNotBetween(String value1, String value2) {
            addCriterion("customer_Auditing not between", value1, value2, "customerAuditing");
            return (Criteria) this;
        }

        public Criteria andCustomerYnIsNull() {
            addCriterion("customer_yn is null");
            return (Criteria) this;
        }

        public Criteria andCustomerYnIsNotNull() {
            addCriterion("customer_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerYnEqualTo(String value) {
            addCriterion("customer_yn =", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnNotEqualTo(String value) {
            addCriterion("customer_yn <>", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnGreaterThan(String value) {
            addCriterion("customer_yn >", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnGreaterThanOrEqualTo(String value) {
            addCriterion("customer_yn >=", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnLessThan(String value) {
            addCriterion("customer_yn <", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnLessThanOrEqualTo(String value) {
            addCriterion("customer_yn <=", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnLike(String value) {
            addCriterion("customer_yn like", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnNotLike(String value) {
            addCriterion("customer_yn not like", value, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnIn(List<String> values) {
            addCriterion("customer_yn in", values, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnNotIn(List<String> values) {
            addCriterion("customer_yn not in", values, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnBetween(String value1, String value2) {
            addCriterion("customer_yn between", value1, value2, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerYnNotBetween(String value1, String value2) {
            addCriterion("customer_yn not between", value1, value2, "customerYn");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1IsNull() {
            addCriterion("customer_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1IsNotNull() {
            addCriterion("customer_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1EqualTo(String value) {
            addCriterion("customer_custom1 =", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1NotEqualTo(String value) {
            addCriterion("customer_custom1 <>", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1GreaterThan(String value) {
            addCriterion("customer_custom1 >", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom1 >=", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1LessThan(String value) {
            addCriterion("customer_custom1 <", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1LessThanOrEqualTo(String value) {
            addCriterion("customer_custom1 <=", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1Like(String value) {
            addCriterion("customer_custom1 like", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1NotLike(String value) {
            addCriterion("customer_custom1 not like", value, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1In(List<String> values) {
            addCriterion("customer_custom1 in", values, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1NotIn(List<String> values) {
            addCriterion("customer_custom1 not in", values, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1Between(String value1, String value2) {
            addCriterion("customer_custom1 between", value1, value2, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom1NotBetween(String value1, String value2) {
            addCriterion("customer_custom1 not between", value1, value2, "customerCustom1");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2IsNull() {
            addCriterion("customer_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2IsNotNull() {
            addCriterion("customer_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2EqualTo(String value) {
            addCriterion("customer_custom2 =", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2NotEqualTo(String value) {
            addCriterion("customer_custom2 <>", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2GreaterThan(String value) {
            addCriterion("customer_custom2 >", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom2 >=", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2LessThan(String value) {
            addCriterion("customer_custom2 <", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2LessThanOrEqualTo(String value) {
            addCriterion("customer_custom2 <=", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2Like(String value) {
            addCriterion("customer_custom2 like", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2NotLike(String value) {
            addCriterion("customer_custom2 not like", value, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2In(List<String> values) {
            addCriterion("customer_custom2 in", values, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2NotIn(List<String> values) {
            addCriterion("customer_custom2 not in", values, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2Between(String value1, String value2) {
            addCriterion("customer_custom2 between", value1, value2, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom2NotBetween(String value1, String value2) {
            addCriterion("customer_custom2 not between", value1, value2, "customerCustom2");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3IsNull() {
            addCriterion("customer_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3IsNotNull() {
            addCriterion("customer_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3EqualTo(String value) {
            addCriterion("customer_custom3 =", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3NotEqualTo(String value) {
            addCriterion("customer_custom3 <>", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3GreaterThan(String value) {
            addCriterion("customer_custom3 >", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom3 >=", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3LessThan(String value) {
            addCriterion("customer_custom3 <", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3LessThanOrEqualTo(String value) {
            addCriterion("customer_custom3 <=", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3Like(String value) {
            addCriterion("customer_custom3 like", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3NotLike(String value) {
            addCriterion("customer_custom3 not like", value, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3In(List<String> values) {
            addCriterion("customer_custom3 in", values, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3NotIn(List<String> values) {
            addCriterion("customer_custom3 not in", values, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3Between(String value1, String value2) {
            addCriterion("customer_custom3 between", value1, value2, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom3NotBetween(String value1, String value2) {
            addCriterion("customer_custom3 not between", value1, value2, "customerCustom3");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4IsNull() {
            addCriterion("customer_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4IsNotNull() {
            addCriterion("customer_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4EqualTo(String value) {
            addCriterion("customer_custom4 =", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4NotEqualTo(String value) {
            addCriterion("customer_custom4 <>", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4GreaterThan(String value) {
            addCriterion("customer_custom4 >", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom4 >=", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4LessThan(String value) {
            addCriterion("customer_custom4 <", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4LessThanOrEqualTo(String value) {
            addCriterion("customer_custom4 <=", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4Like(String value) {
            addCriterion("customer_custom4 like", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4NotLike(String value) {
            addCriterion("customer_custom4 not like", value, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4In(List<String> values) {
            addCriterion("customer_custom4 in", values, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4NotIn(List<String> values) {
            addCriterion("customer_custom4 not in", values, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4Between(String value1, String value2) {
            addCriterion("customer_custom4 between", value1, value2, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom4NotBetween(String value1, String value2) {
            addCriterion("customer_custom4 not between", value1, value2, "customerCustom4");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5IsNull() {
            addCriterion("customer_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5IsNotNull() {
            addCriterion("customer_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5EqualTo(String value) {
            addCriterion("customer_custom5 =", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5NotEqualTo(String value) {
            addCriterion("customer_custom5 <>", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5GreaterThan(String value) {
            addCriterion("customer_custom5 >", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom5 >=", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5LessThan(String value) {
            addCriterion("customer_custom5 <", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5LessThanOrEqualTo(String value) {
            addCriterion("customer_custom5 <=", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5Like(String value) {
            addCriterion("customer_custom5 like", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5NotLike(String value) {
            addCriterion("customer_custom5 not like", value, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5In(List<String> values) {
            addCriterion("customer_custom5 in", values, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5NotIn(List<String> values) {
            addCriterion("customer_custom5 not in", values, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5Between(String value1, String value2) {
            addCriterion("customer_custom5 between", value1, value2, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom5NotBetween(String value1, String value2) {
            addCriterion("customer_custom5 not between", value1, value2, "customerCustom5");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6IsNull() {
            addCriterion("customer_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6IsNotNull() {
            addCriterion("customer_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6EqualTo(String value) {
            addCriterion("customer_custom6 =", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6NotEqualTo(String value) {
            addCriterion("customer_custom6 <>", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6GreaterThan(String value) {
            addCriterion("customer_custom6 >", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("customer_custom6 >=", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6LessThan(String value) {
            addCriterion("customer_custom6 <", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6LessThanOrEqualTo(String value) {
            addCriterion("customer_custom6 <=", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6Like(String value) {
            addCriterion("customer_custom6 like", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6NotLike(String value) {
            addCriterion("customer_custom6 not like", value, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6In(List<String> values) {
            addCriterion("customer_custom6 in", values, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6NotIn(List<String> values) {
            addCriterion("customer_custom6 not in", values, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6Between(String value1, String value2) {
            addCriterion("customer_custom6 between", value1, value2, "customerCustom6");
            return (Criteria) this;
        }

        public Criteria andCustomerCustom6NotBetween(String value1, String value2) {
            addCriterion("customer_custom6 not between", value1, value2, "customerCustom6");
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