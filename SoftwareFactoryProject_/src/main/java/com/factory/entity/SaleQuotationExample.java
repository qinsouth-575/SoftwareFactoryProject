package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleQuotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleQuotationExample() {
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

        public Criteria andSqIdIsNull() {
            addCriterion("sq_id is null");
            return (Criteria) this;
        }

        public Criteria andSqIdIsNotNull() {
            addCriterion("sq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqIdEqualTo(String value) {
            addCriterion("sq_id =", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotEqualTo(String value) {
            addCriterion("sq_id <>", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThan(String value) {
            addCriterion("sq_id >", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThanOrEqualTo(String value) {
            addCriterion("sq_id >=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThan(String value) {
            addCriterion("sq_id <", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThanOrEqualTo(String value) {
            addCriterion("sq_id <=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLike(String value) {
            addCriterion("sq_id like", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotLike(String value) {
            addCriterion("sq_id not like", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdIn(List<String> values) {
            addCriterion("sq_id in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotIn(List<String> values) {
            addCriterion("sq_id not in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdBetween(String value1, String value2) {
            addCriterion("sq_id between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotBetween(String value1, String value2) {
            addCriterion("sq_id not between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIsNull() {
            addCriterion("sq_document_time is null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIsNotNull() {
            addCriterion("sq_document_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sq_document_time =", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sq_document_time <>", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sq_document_time >", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sq_document_time >=", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeLessThan(Date value) {
            addCriterionForJDBCDate("sq_document_time <", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sq_document_time <=", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sq_document_time in", values, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sq_document_time not in", values, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sq_document_time between", value1, value2, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sq_document_time not between", value1, value2, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameIsNull() {
            addCriterion("currency_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameIsNotNull() {
            addCriterion("currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameEqualTo(String value) {
            addCriterion("currency_name =", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotEqualTo(String value) {
            addCriterion("currency_name <>", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameGreaterThan(String value) {
            addCriterion("currency_name >", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("currency_name >=", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLessThan(String value) {
            addCriterion("currency_name <", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("currency_name <=", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameLike(String value) {
            addCriterion("currency_name like", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotLike(String value) {
            addCriterion("currency_name not like", value, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameIn(List<String> values) {
            addCriterion("currency_name in", values, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotIn(List<String> values) {
            addCriterion("currency_name not in", values, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameBetween(String value1, String value2) {
            addCriterion("currency_name between", value1, value2, "currencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("currency_name not between", value1, value2, "currencyName");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIsNull() {
            addCriterion("sq_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIsNotNull() {
            addCriterion("sq_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateEqualTo(Float value) {
            addCriterion("sq_exchange_rate =", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotEqualTo(Float value) {
            addCriterion("sq_exchange_rate <>", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateGreaterThan(Float value) {
            addCriterion("sq_exchange_rate >", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sq_exchange_rate >=", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateLessThan(Float value) {
            addCriterion("sq_exchange_rate <", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("sq_exchange_rate <=", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIn(List<Float> values) {
            addCriterion("sq_exchange_rate in", values, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotIn(List<Float> values) {
            addCriterion("sq_exchange_rate not in", values, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateBetween(Float value1, Float value2) {
            addCriterion("sq_exchange_rate between", value1, value2, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("sq_exchange_rate not between", value1, value2, "sqExchangeRate");
            return (Criteria) this;
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

        public Criteria andSqDeliveryAddressIsNull() {
            addCriterion("sq_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressIsNotNull() {
            addCriterion("sq_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressEqualTo(String value) {
            addCriterion("sq_delivery_address =", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotEqualTo(String value) {
            addCriterion("sq_delivery_address <>", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressGreaterThan(String value) {
            addCriterion("sq_delivery_address >", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sq_delivery_address >=", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLessThan(String value) {
            addCriterion("sq_delivery_address <", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("sq_delivery_address <=", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLike(String value) {
            addCriterion("sq_delivery_address like", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotLike(String value) {
            addCriterion("sq_delivery_address not like", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressIn(List<String> values) {
            addCriterion("sq_delivery_address in", values, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotIn(List<String> values) {
            addCriterion("sq_delivery_address not in", values, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressBetween(String value1, String value2) {
            addCriterion("sq_delivery_address between", value1, value2, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("sq_delivery_address not between", value1, value2, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIsNull() {
            addCriterion("sq_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIsNotNull() {
            addCriterion("sq_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sq_effective_time =", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sq_effective_time <>", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sq_effective_time >", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sq_effective_time >=", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("sq_effective_time <", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sq_effective_time <=", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sq_effective_time in", values, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sq_effective_time not in", values, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sq_effective_time between", value1, value2, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sq_effective_time not between", value1, value2, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqTaxIsNull() {
            addCriterion("sq_tax is null");
            return (Criteria) this;
        }

        public Criteria andSqTaxIsNotNull() {
            addCriterion("sq_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSqTaxEqualTo(Integer value) {
            addCriterion("sq_tax =", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotEqualTo(Integer value) {
            addCriterion("sq_tax <>", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxGreaterThan(Integer value) {
            addCriterion("sq_tax >", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("sq_tax >=", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxLessThan(Integer value) {
            addCriterion("sq_tax <", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxLessThanOrEqualTo(Integer value) {
            addCriterion("sq_tax <=", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxIn(List<Integer> values) {
            addCriterion("sq_tax in", values, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotIn(List<Integer> values) {
            addCriterion("sq_tax not in", values, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxBetween(Integer value1, Integer value2) {
            addCriterion("sq_tax between", value1, value2, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("sq_tax not between", value1, value2, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqMonographIsNull() {
            addCriterion("sq_monograph is null");
            return (Criteria) this;
        }

        public Criteria andSqMonographIsNotNull() {
            addCriterion("sq_monograph is not null");
            return (Criteria) this;
        }

        public Criteria andSqMonographEqualTo(String value) {
            addCriterion("sq_monograph =", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotEqualTo(String value) {
            addCriterion("sq_monograph <>", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographGreaterThan(String value) {
            addCriterion("sq_monograph >", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographGreaterThanOrEqualTo(String value) {
            addCriterion("sq_monograph >=", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLessThan(String value) {
            addCriterion("sq_monograph <", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLessThanOrEqualTo(String value) {
            addCriterion("sq_monograph <=", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLike(String value) {
            addCriterion("sq_monograph like", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotLike(String value) {
            addCriterion("sq_monograph not like", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographIn(List<String> values) {
            addCriterion("sq_monograph in", values, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotIn(List<String> values) {
            addCriterion("sq_monograph not in", values, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographBetween(String value1, String value2) {
            addCriterion("sq_monograph between", value1, value2, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotBetween(String value1, String value2) {
            addCriterion("sq_monograph not between", value1, value2, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqReviewerIsNull() {
            addCriterion("sq_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andSqReviewerIsNotNull() {
            addCriterion("sq_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andSqReviewerEqualTo(String value) {
            addCriterion("sq_reviewer =", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerNotEqualTo(String value) {
            addCriterion("sq_reviewer <>", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerGreaterThan(String value) {
            addCriterion("sq_reviewer >", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("sq_reviewer >=", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerLessThan(String value) {
            addCriterion("sq_reviewer <", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerLessThanOrEqualTo(String value) {
            addCriterion("sq_reviewer <=", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerLike(String value) {
            addCriterion("sq_reviewer like", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerNotLike(String value) {
            addCriterion("sq_reviewer not like", value, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerIn(List<String> values) {
            addCriterion("sq_reviewer in", values, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerNotIn(List<String> values) {
            addCriterion("sq_reviewer not in", values, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerBetween(String value1, String value2) {
            addCriterion("sq_reviewer between", value1, value2, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqReviewerNotBetween(String value1, String value2) {
            addCriterion("sq_reviewer not between", value1, value2, "sqReviewer");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIsNull() {
            addCriterion("sq_watchword is null");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIsNotNull() {
            addCriterion("sq_watchword is not null");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordEqualTo(String value) {
            addCriterion("sq_watchword =", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotEqualTo(String value) {
            addCriterion("sq_watchword <>", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordGreaterThan(String value) {
            addCriterion("sq_watchword >", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordGreaterThanOrEqualTo(String value) {
            addCriterion("sq_watchword >=", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLessThan(String value) {
            addCriterion("sq_watchword <", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLessThanOrEqualTo(String value) {
            addCriterion("sq_watchword <=", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLike(String value) {
            addCriterion("sq_watchword like", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotLike(String value) {
            addCriterion("sq_watchword not like", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIn(List<String> values) {
            addCriterion("sq_watchword in", values, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotIn(List<String> values) {
            addCriterion("sq_watchword not in", values, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordBetween(String value1, String value2) {
            addCriterion("sq_watchword between", value1, value2, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotBetween(String value1, String value2) {
            addCriterion("sq_watchword not between", value1, value2, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIsNull() {
            addCriterion("sq_tailclause is null");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIsNotNull() {
            addCriterion("sq_tailclause is not null");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseEqualTo(String value) {
            addCriterion("sq_tailclause =", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotEqualTo(String value) {
            addCriterion("sq_tailclause <>", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseGreaterThan(String value) {
            addCriterion("sq_tailclause >", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseGreaterThanOrEqualTo(String value) {
            addCriterion("sq_tailclause >=", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLessThan(String value) {
            addCriterion("sq_tailclause <", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLessThanOrEqualTo(String value) {
            addCriterion("sq_tailclause <=", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLike(String value) {
            addCriterion("sq_tailclause like", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotLike(String value) {
            addCriterion("sq_tailclause not like", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIn(List<String> values) {
            addCriterion("sq_tailclause in", values, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotIn(List<String> values) {
            addCriterion("sq_tailclause not in", values, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseBetween(String value1, String value2) {
            addCriterion("sq_tailclause between", value1, value2, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotBetween(String value1, String value2) {
            addCriterion("sq_tailclause not between", value1, value2, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIsNull() {
            addCriterion("sq_remark is null");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIsNotNull() {
            addCriterion("sq_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSqRemarkEqualTo(String value) {
            addCriterion("sq_remark =", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotEqualTo(String value) {
            addCriterion("sq_remark <>", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkGreaterThan(String value) {
            addCriterion("sq_remark >", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sq_remark >=", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLessThan(String value) {
            addCriterion("sq_remark <", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLessThanOrEqualTo(String value) {
            addCriterion("sq_remark <=", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLike(String value) {
            addCriterion("sq_remark like", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotLike(String value) {
            addCriterion("sq_remark not like", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIn(List<String> values) {
            addCriterion("sq_remark in", values, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotIn(List<String> values) {
            addCriterion("sq_remark not in", values, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkBetween(String value1, String value2) {
            addCriterion("sq_remark between", value1, value2, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotBetween(String value1, String value2) {
            addCriterion("sq_remark not between", value1, value2, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andSqAuditingIsNull() {
            addCriterion("sq_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSqAuditingIsNotNull() {
            addCriterion("sq_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSqAuditingEqualTo(String value) {
            addCriterion("sq_auditing =", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingNotEqualTo(String value) {
            addCriterion("sq_auditing <>", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingGreaterThan(String value) {
            addCriterion("sq_auditing >", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sq_auditing >=", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingLessThan(String value) {
            addCriterion("sq_auditing <", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingLessThanOrEqualTo(String value) {
            addCriterion("sq_auditing <=", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingLike(String value) {
            addCriterion("sq_auditing like", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingNotLike(String value) {
            addCriterion("sq_auditing not like", value, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingIn(List<String> values) {
            addCriterion("sq_auditing in", values, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingNotIn(List<String> values) {
            addCriterion("sq_auditing not in", values, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingBetween(String value1, String value2) {
            addCriterion("sq_auditing between", value1, value2, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqAuditingNotBetween(String value1, String value2) {
            addCriterion("sq_auditing not between", value1, value2, "sqAuditing");
            return (Criteria) this;
        }

        public Criteria andSqYnIsNull() {
            addCriterion("sq_yn is null");
            return (Criteria) this;
        }

        public Criteria andSqYnIsNotNull() {
            addCriterion("sq_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSqYnEqualTo(String value) {
            addCriterion("sq_yn =", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnNotEqualTo(String value) {
            addCriterion("sq_yn <>", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnGreaterThan(String value) {
            addCriterion("sq_yn >", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnGreaterThanOrEqualTo(String value) {
            addCriterion("sq_yn >=", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnLessThan(String value) {
            addCriterion("sq_yn <", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnLessThanOrEqualTo(String value) {
            addCriterion("sq_yn <=", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnLike(String value) {
            addCriterion("sq_yn like", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnNotLike(String value) {
            addCriterion("sq_yn not like", value, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnIn(List<String> values) {
            addCriterion("sq_yn in", values, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnNotIn(List<String> values) {
            addCriterion("sq_yn not in", values, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnBetween(String value1, String value2) {
            addCriterion("sq_yn between", value1, value2, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqYnNotBetween(String value1, String value2) {
            addCriterion("sq_yn not between", value1, value2, "sqYn");
            return (Criteria) this;
        }

        public Criteria andSqCustom1IsNull() {
            addCriterion("sq_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSqCustom1IsNotNull() {
            addCriterion("sq_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqCustom1EqualTo(String value) {
            addCriterion("sq_custom1 =", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1NotEqualTo(String value) {
            addCriterion("sq_custom1 <>", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1GreaterThan(String value) {
            addCriterion("sq_custom1 >", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sq_custom1 >=", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1LessThan(String value) {
            addCriterion("sq_custom1 <", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1LessThanOrEqualTo(String value) {
            addCriterion("sq_custom1 <=", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1Like(String value) {
            addCriterion("sq_custom1 like", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1NotLike(String value) {
            addCriterion("sq_custom1 not like", value, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1In(List<String> values) {
            addCriterion("sq_custom1 in", values, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1NotIn(List<String> values) {
            addCriterion("sq_custom1 not in", values, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1Between(String value1, String value2) {
            addCriterion("sq_custom1 between", value1, value2, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom1NotBetween(String value1, String value2) {
            addCriterion("sq_custom1 not between", value1, value2, "sqCustom1");
            return (Criteria) this;
        }

        public Criteria andSqCustom2IsNull() {
            addCriterion("sq_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSqCustom2IsNotNull() {
            addCriterion("sq_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqCustom2EqualTo(String value) {
            addCriterion("sq_custom2 =", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2NotEqualTo(String value) {
            addCriterion("sq_custom2 <>", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2GreaterThan(String value) {
            addCriterion("sq_custom2 >", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sq_custom2 >=", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2LessThan(String value) {
            addCriterion("sq_custom2 <", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2LessThanOrEqualTo(String value) {
            addCriterion("sq_custom2 <=", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2Like(String value) {
            addCriterion("sq_custom2 like", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2NotLike(String value) {
            addCriterion("sq_custom2 not like", value, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2In(List<String> values) {
            addCriterion("sq_custom2 in", values, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2NotIn(List<String> values) {
            addCriterion("sq_custom2 not in", values, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2Between(String value1, String value2) {
            addCriterion("sq_custom2 between", value1, value2, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom2NotBetween(String value1, String value2) {
            addCriterion("sq_custom2 not between", value1, value2, "sqCustom2");
            return (Criteria) this;
        }

        public Criteria andSqCustom3IsNull() {
            addCriterion("sq_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSqCustom3IsNotNull() {
            addCriterion("sq_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqCustom3EqualTo(String value) {
            addCriterion("sq_custom3 =", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3NotEqualTo(String value) {
            addCriterion("sq_custom3 <>", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3GreaterThan(String value) {
            addCriterion("sq_custom3 >", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sq_custom3 >=", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3LessThan(String value) {
            addCriterion("sq_custom3 <", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3LessThanOrEqualTo(String value) {
            addCriterion("sq_custom3 <=", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3Like(String value) {
            addCriterion("sq_custom3 like", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3NotLike(String value) {
            addCriterion("sq_custom3 not like", value, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3In(List<String> values) {
            addCriterion("sq_custom3 in", values, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3NotIn(List<String> values) {
            addCriterion("sq_custom3 not in", values, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3Between(String value1, String value2) {
            addCriterion("sq_custom3 between", value1, value2, "sqCustom3");
            return (Criteria) this;
        }

        public Criteria andSqCustom3NotBetween(String value1, String value2) {
            addCriterion("sq_custom3 not between", value1, value2, "sqCustom3");
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