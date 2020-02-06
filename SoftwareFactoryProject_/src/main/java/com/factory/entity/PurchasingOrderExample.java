package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchasingOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchasingOrderExample() {
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

        public Criteria andPoIdIsNull() {
            addCriterion("po_id is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("po_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(String value) {
            addCriterion("po_id =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(String value) {
            addCriterion("po_id <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(String value) {
            addCriterion("po_id >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(String value) {
            addCriterion("po_id >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(String value) {
            addCriterion("po_id <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(String value) {
            addCriterion("po_id <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLike(String value) {
            addCriterion("po_id like", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotLike(String value) {
            addCriterion("po_id not like", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<String> values) {
            addCriterion("po_id in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<String> values) {
            addCriterion("po_id not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(String value1, String value2) {
            addCriterion("po_id between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(String value1, String value2) {
            addCriterion("po_id not between", value1, value2, "poId");
            return (Criteria) this;
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

        public Criteria andPoEngnameIsNull() {
            addCriterion("po_engname is null");
            return (Criteria) this;
        }

        public Criteria andPoEngnameIsNotNull() {
            addCriterion("po_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPoEngnameEqualTo(String value) {
            addCriterion("po_engname =", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameNotEqualTo(String value) {
            addCriterion("po_engname <>", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameGreaterThan(String value) {
            addCriterion("po_engname >", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("po_engname >=", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameLessThan(String value) {
            addCriterion("po_engname <", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameLessThanOrEqualTo(String value) {
            addCriterion("po_engname <=", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameLike(String value) {
            addCriterion("po_engname like", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameNotLike(String value) {
            addCriterion("po_engname not like", value, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameIn(List<String> values) {
            addCriterion("po_engname in", values, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameNotIn(List<String> values) {
            addCriterion("po_engname not in", values, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameBetween(String value1, String value2) {
            addCriterion("po_engname between", value1, value2, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPoEngnameNotBetween(String value1, String value2) {
            addCriterion("po_engname not between", value1, value2, "poEngname");
            return (Criteria) this;
        }

        public Criteria andPotIdIsNull() {
            addCriterion("pot_id is null");
            return (Criteria) this;
        }

        public Criteria andPotIdIsNotNull() {
            addCriterion("pot_id is not null");
            return (Criteria) this;
        }

        public Criteria andPotIdEqualTo(String value) {
            addCriterion("pot_id =", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotEqualTo(String value) {
            addCriterion("pot_id <>", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdGreaterThan(String value) {
            addCriterion("pot_id >", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdGreaterThanOrEqualTo(String value) {
            addCriterion("pot_id >=", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLessThan(String value) {
            addCriterion("pot_id <", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLessThanOrEqualTo(String value) {
            addCriterion("pot_id <=", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLike(String value) {
            addCriterion("pot_id like", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotLike(String value) {
            addCriterion("pot_id not like", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdIn(List<String> values) {
            addCriterion("pot_id in", values, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotIn(List<String> values) {
            addCriterion("pot_id not in", values, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdBetween(String value1, String value2) {
            addCriterion("pot_id between", value1, value2, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotBetween(String value1, String value2) {
            addCriterion("pot_id not between", value1, value2, "potId");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxIsNull() {
            addCriterion("po_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxIsNotNull() {
            addCriterion("po_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxEqualTo(String value) {
            addCriterion("po_price_include_tax =", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("po_price_include_tax <>", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxGreaterThan(String value) {
            addCriterion("po_price_include_tax >", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("po_price_include_tax >=", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxLessThan(String value) {
            addCriterion("po_price_include_tax <", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("po_price_include_tax <=", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxLike(String value) {
            addCriterion("po_price_include_tax like", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxNotLike(String value) {
            addCriterion("po_price_include_tax not like", value, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxIn(List<String> values) {
            addCriterion("po_price_include_tax in", values, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("po_price_include_tax not in", values, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("po_price_include_tax between", value1, value2, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("po_price_include_tax not between", value1, value2, "poPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusIsNull() {
            addCriterion("po_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusIsNotNull() {
            addCriterion("po_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusEqualTo(String value) {
            addCriterion("po_single_status =", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusNotEqualTo(String value) {
            addCriterion("po_single_status <>", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusGreaterThan(String value) {
            addCriterion("po_single_status >", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("po_single_status >=", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusLessThan(String value) {
            addCriterion("po_single_status <", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("po_single_status <=", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusLike(String value) {
            addCriterion("po_single_status like", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusNotLike(String value) {
            addCriterion("po_single_status not like", value, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusIn(List<String> values) {
            addCriterion("po_single_status in", values, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusNotIn(List<String> values) {
            addCriterion("po_single_status not in", values, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusBetween(String value1, String value2) {
            addCriterion("po_single_status between", value1, value2, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoSingleStatusNotBetween(String value1, String value2) {
            addCriterion("po_single_status not between", value1, value2, "poSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateIsNull() {
            addCriterion("po_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateIsNotNull() {
            addCriterion("po_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("po_document_date =", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("po_document_date <>", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("po_document_date >", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_document_date >=", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("po_document_date <", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_document_date <=", value, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("po_document_date in", values, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("po_document_date not in", values, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_document_date between", value1, value2, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_document_date not between", value1, value2, "poDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberIsNull() {
            addCriterion("po_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberIsNotNull() {
            addCriterion("po_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberEqualTo(String value) {
            addCriterion("po_document_number =", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberNotEqualTo(String value) {
            addCriterion("po_document_number <>", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberGreaterThan(String value) {
            addCriterion("po_document_number >", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("po_document_number >=", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberLessThan(String value) {
            addCriterion("po_document_number <", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("po_document_number <=", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberLike(String value) {
            addCriterion("po_document_number like", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberNotLike(String value) {
            addCriterion("po_document_number not like", value, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberIn(List<String> values) {
            addCriterion("po_document_number in", values, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberNotIn(List<String> values) {
            addCriterion("po_document_number not in", values, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberBetween(String value1, String value2) {
            addCriterion("po_document_number between", value1, value2, "poDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPoDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("po_document_number not between", value1, value2, "poDocumentNumber");
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

        public Criteria andPoExchangeRateIsNull() {
            addCriterion("po_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateIsNotNull() {
            addCriterion("po_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateEqualTo(Float value) {
            addCriterion("po_exchange_rate =", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateNotEqualTo(Float value) {
            addCriterion("po_exchange_rate <>", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateGreaterThan(Float value) {
            addCriterion("po_exchange_rate >", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("po_exchange_rate >=", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateLessThan(Float value) {
            addCriterion("po_exchange_rate <", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("po_exchange_rate <=", value, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateIn(List<Float> values) {
            addCriterion("po_exchange_rate in", values, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateNotIn(List<Float> values) {
            addCriterion("po_exchange_rate not in", values, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateBetween(Float value1, Float value2) {
            addCriterion("po_exchange_rate between", value1, value2, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("po_exchange_rate not between", value1, value2, "poExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressIsNull() {
            addCriterion("po_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressIsNotNull() {
            addCriterion("po_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressEqualTo(String value) {
            addCriterion("po_delivery_address =", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressNotEqualTo(String value) {
            addCriterion("po_delivery_address <>", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressGreaterThan(String value) {
            addCriterion("po_delivery_address >", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("po_delivery_address >=", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressLessThan(String value) {
            addCriterion("po_delivery_address <", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("po_delivery_address <=", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressLike(String value) {
            addCriterion("po_delivery_address like", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressNotLike(String value) {
            addCriterion("po_delivery_address not like", value, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressIn(List<String> values) {
            addCriterion("po_delivery_address in", values, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressNotIn(List<String> values) {
            addCriterion("po_delivery_address not in", values, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressBetween(String value1, String value2) {
            addCriterion("po_delivery_address between", value1, value2, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("po_delivery_address not between", value1, value2, "poDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPoBuyerIsNull() {
            addCriterion("po_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPoBuyerIsNotNull() {
            addCriterion("po_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPoBuyerEqualTo(String value) {
            addCriterion("po_buyer =", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerNotEqualTo(String value) {
            addCriterion("po_buyer <>", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerGreaterThan(String value) {
            addCriterion("po_buyer >", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("po_buyer >=", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerLessThan(String value) {
            addCriterion("po_buyer <", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerLessThanOrEqualTo(String value) {
            addCriterion("po_buyer <=", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerLike(String value) {
            addCriterion("po_buyer like", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerNotLike(String value) {
            addCriterion("po_buyer not like", value, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerIn(List<String> values) {
            addCriterion("po_buyer in", values, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerNotIn(List<String> values) {
            addCriterion("po_buyer not in", values, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerBetween(String value1, String value2) {
            addCriterion("po_buyer between", value1, value2, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBuyerNotBetween(String value1, String value2) {
            addCriterion("po_buyer not between", value1, value2, "poBuyer");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionIsNull() {
            addCriterion("po_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionIsNotNull() {
            addCriterion("po_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionEqualTo(String value) {
            addCriterion("po_belongs_section =", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionNotEqualTo(String value) {
            addCriterion("po_belongs_section <>", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionGreaterThan(String value) {
            addCriterion("po_belongs_section >", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("po_belongs_section >=", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionLessThan(String value) {
            addCriterion("po_belongs_section <", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("po_belongs_section <=", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionLike(String value) {
            addCriterion("po_belongs_section like", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionNotLike(String value) {
            addCriterion("po_belongs_section not like", value, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionIn(List<String> values) {
            addCriterion("po_belongs_section in", values, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionNotIn(List<String> values) {
            addCriterion("po_belongs_section not in", values, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionBetween(String value1, String value2) {
            addCriterion("po_belongs_section between", value1, value2, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("po_belongs_section not between", value1, value2, "poBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectIsNull() {
            addCriterion("po_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectIsNotNull() {
            addCriterion("po_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectEqualTo(String value) {
            addCriterion("po_belongs_project =", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectNotEqualTo(String value) {
            addCriterion("po_belongs_project <>", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectGreaterThan(String value) {
            addCriterion("po_belongs_project >", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("po_belongs_project >=", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectLessThan(String value) {
            addCriterion("po_belongs_project <", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("po_belongs_project <=", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectLike(String value) {
            addCriterion("po_belongs_project like", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectNotLike(String value) {
            addCriterion("po_belongs_project not like", value, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectIn(List<String> values) {
            addCriterion("po_belongs_project in", values, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectNotIn(List<String> values) {
            addCriterion("po_belongs_project not in", values, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectBetween(String value1, String value2) {
            addCriterion("po_belongs_project between", value1, value2, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("po_belongs_project not between", value1, value2, "poBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionIsNull() {
            addCriterion("po_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionIsNotNull() {
            addCriterion("po_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionEqualTo(String value) {
            addCriterion("po_header_provision =", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionNotEqualTo(String value) {
            addCriterion("po_header_provision <>", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionGreaterThan(String value) {
            addCriterion("po_header_provision >", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("po_header_provision >=", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionLessThan(String value) {
            addCriterion("po_header_provision <", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("po_header_provision <=", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionLike(String value) {
            addCriterion("po_header_provision like", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionNotLike(String value) {
            addCriterion("po_header_provision not like", value, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionIn(List<String> values) {
            addCriterion("po_header_provision in", values, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionNotIn(List<String> values) {
            addCriterion("po_header_provision not in", values, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionBetween(String value1, String value2) {
            addCriterion("po_header_provision between", value1, value2, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("po_header_provision not between", value1, value2, "poHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseIsNull() {
            addCriterion("po_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseIsNotNull() {
            addCriterion("po_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseEqualTo(String value) {
            addCriterion("po_end_clause =", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseNotEqualTo(String value) {
            addCriterion("po_end_clause <>", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseGreaterThan(String value) {
            addCriterion("po_end_clause >", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("po_end_clause >=", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseLessThan(String value) {
            addCriterion("po_end_clause <", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseLessThanOrEqualTo(String value) {
            addCriterion("po_end_clause <=", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseLike(String value) {
            addCriterion("po_end_clause like", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseNotLike(String value) {
            addCriterion("po_end_clause not like", value, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseIn(List<String> values) {
            addCriterion("po_end_clause in", values, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseNotIn(List<String> values) {
            addCriterion("po_end_clause not in", values, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseBetween(String value1, String value2) {
            addCriterion("po_end_clause between", value1, value2, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoEndClauseNotBetween(String value1, String value2) {
            addCriterion("po_end_clause not between", value1, value2, "poEndClause");
            return (Criteria) this;
        }

        public Criteria andPoRemarkIsNull() {
            addCriterion("po_remark is null");
            return (Criteria) this;
        }

        public Criteria andPoRemarkIsNotNull() {
            addCriterion("po_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPoRemarkEqualTo(String value) {
            addCriterion("po_remark =", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkNotEqualTo(String value) {
            addCriterion("po_remark <>", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkGreaterThan(String value) {
            addCriterion("po_remark >", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("po_remark >=", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkLessThan(String value) {
            addCriterion("po_remark <", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkLessThanOrEqualTo(String value) {
            addCriterion("po_remark <=", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkLike(String value) {
            addCriterion("po_remark like", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkNotLike(String value) {
            addCriterion("po_remark not like", value, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkIn(List<String> values) {
            addCriterion("po_remark in", values, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkNotIn(List<String> values) {
            addCriterion("po_remark not in", values, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkBetween(String value1, String value2) {
            addCriterion("po_remark between", value1, value2, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoRemarkNotBetween(String value1, String value2) {
            addCriterion("po_remark not between", value1, value2, "poRemark");
            return (Criteria) this;
        }

        public Criteria andPoAuditionIsNull() {
            addCriterion("po_audition is null");
            return (Criteria) this;
        }

        public Criteria andPoAuditionIsNotNull() {
            addCriterion("po_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPoAuditionEqualTo(String value) {
            addCriterion("po_audition =", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionNotEqualTo(String value) {
            addCriterion("po_audition <>", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionGreaterThan(String value) {
            addCriterion("po_audition >", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("po_audition >=", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionLessThan(String value) {
            addCriterion("po_audition <", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionLessThanOrEqualTo(String value) {
            addCriterion("po_audition <=", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionLike(String value) {
            addCriterion("po_audition like", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionNotLike(String value) {
            addCriterion("po_audition not like", value, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionIn(List<String> values) {
            addCriterion("po_audition in", values, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionNotIn(List<String> values) {
            addCriterion("po_audition not in", values, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionBetween(String value1, String value2) {
            addCriterion("po_audition between", value1, value2, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoAuditionNotBetween(String value1, String value2) {
            addCriterion("po_audition not between", value1, value2, "poAudition");
            return (Criteria) this;
        }

        public Criteria andPoYnIsNull() {
            addCriterion("po_yn is null");
            return (Criteria) this;
        }

        public Criteria andPoYnIsNotNull() {
            addCriterion("po_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPoYnEqualTo(String value) {
            addCriterion("po_yn =", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnNotEqualTo(String value) {
            addCriterion("po_yn <>", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnGreaterThan(String value) {
            addCriterion("po_yn >", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnGreaterThanOrEqualTo(String value) {
            addCriterion("po_yn >=", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnLessThan(String value) {
            addCriterion("po_yn <", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnLessThanOrEqualTo(String value) {
            addCriterion("po_yn <=", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnLike(String value) {
            addCriterion("po_yn like", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnNotLike(String value) {
            addCriterion("po_yn not like", value, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnIn(List<String> values) {
            addCriterion("po_yn in", values, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnNotIn(List<String> values) {
            addCriterion("po_yn not in", values, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnBetween(String value1, String value2) {
            addCriterion("po_yn between", value1, value2, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoYnNotBetween(String value1, String value2) {
            addCriterion("po_yn not between", value1, value2, "poYn");
            return (Criteria) this;
        }

        public Criteria andPoCustom1IsNull() {
            addCriterion("po_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPoCustom1IsNotNull() {
            addCriterion("po_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPoCustom1EqualTo(String value) {
            addCriterion("po_custom1 =", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1NotEqualTo(String value) {
            addCriterion("po_custom1 <>", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1GreaterThan(String value) {
            addCriterion("po_custom1 >", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("po_custom1 >=", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1LessThan(String value) {
            addCriterion("po_custom1 <", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1LessThanOrEqualTo(String value) {
            addCriterion("po_custom1 <=", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1Like(String value) {
            addCriterion("po_custom1 like", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1NotLike(String value) {
            addCriterion("po_custom1 not like", value, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1In(List<String> values) {
            addCriterion("po_custom1 in", values, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1NotIn(List<String> values) {
            addCriterion("po_custom1 not in", values, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1Between(String value1, String value2) {
            addCriterion("po_custom1 between", value1, value2, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom1NotBetween(String value1, String value2) {
            addCriterion("po_custom1 not between", value1, value2, "poCustom1");
            return (Criteria) this;
        }

        public Criteria andPoCustom2IsNull() {
            addCriterion("po_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPoCustom2IsNotNull() {
            addCriterion("po_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPoCustom2EqualTo(String value) {
            addCriterion("po_custom2 =", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2NotEqualTo(String value) {
            addCriterion("po_custom2 <>", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2GreaterThan(String value) {
            addCriterion("po_custom2 >", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("po_custom2 >=", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2LessThan(String value) {
            addCriterion("po_custom2 <", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2LessThanOrEqualTo(String value) {
            addCriterion("po_custom2 <=", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2Like(String value) {
            addCriterion("po_custom2 like", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2NotLike(String value) {
            addCriterion("po_custom2 not like", value, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2In(List<String> values) {
            addCriterion("po_custom2 in", values, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2NotIn(List<String> values) {
            addCriterion("po_custom2 not in", values, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2Between(String value1, String value2) {
            addCriterion("po_custom2 between", value1, value2, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom2NotBetween(String value1, String value2) {
            addCriterion("po_custom2 not between", value1, value2, "poCustom2");
            return (Criteria) this;
        }

        public Criteria andPoCustom3IsNull() {
            addCriterion("po_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPoCustom3IsNotNull() {
            addCriterion("po_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPoCustom3EqualTo(String value) {
            addCriterion("po_custom3 =", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3NotEqualTo(String value) {
            addCriterion("po_custom3 <>", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3GreaterThan(String value) {
            addCriterion("po_custom3 >", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("po_custom3 >=", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3LessThan(String value) {
            addCriterion("po_custom3 <", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3LessThanOrEqualTo(String value) {
            addCriterion("po_custom3 <=", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3Like(String value) {
            addCriterion("po_custom3 like", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3NotLike(String value) {
            addCriterion("po_custom3 not like", value, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3In(List<String> values) {
            addCriterion("po_custom3 in", values, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3NotIn(List<String> values) {
            addCriterion("po_custom3 not in", values, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3Between(String value1, String value2) {
            addCriterion("po_custom3 between", value1, value2, "poCustom3");
            return (Criteria) this;
        }

        public Criteria andPoCustom3NotBetween(String value1, String value2) {
            addCriterion("po_custom3 not between", value1, value2, "poCustom3");
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