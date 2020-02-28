package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStorageExample() {
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

        public Criteria andPsDocumentNumberIsNull() {
            addCriterion("ps_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberIsNotNull() {
            addCriterion("ps_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberEqualTo(String value) {
            addCriterion("ps_document_number =", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberNotEqualTo(String value) {
            addCriterion("ps_document_number <>", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberGreaterThan(String value) {
            addCriterion("ps_document_number >", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ps_document_number >=", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberLessThan(String value) {
            addCriterion("ps_document_number <", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("ps_document_number <=", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberLike(String value) {
            addCriterion("ps_document_number like", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberNotLike(String value) {
            addCriterion("ps_document_number not like", value, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberIn(List<String> values) {
            addCriterion("ps_document_number in", values, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberNotIn(List<String> values) {
            addCriterion("ps_document_number not in", values, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberBetween(String value1, String value2) {
            addCriterion("ps_document_number between", value1, value2, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("ps_document_number not between", value1, value2, "psDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateIsNull() {
            addCriterion("ps_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateIsNotNull() {
            addCriterion("ps_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("ps_document_date =", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ps_document_date <>", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ps_document_date >", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_document_date >=", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("ps_document_date <", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_document_date <=", value, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("ps_document_date in", values, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ps_document_date not in", values, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_document_date between", value1, value2, "psDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPsDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_document_date not between", value1, value2, "psDocumentDate");
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

        public Criteria andPsExchangeRateIsNull() {
            addCriterion("ps_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateIsNotNull() {
            addCriterion("ps_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateEqualTo(Float value) {
            addCriterion("ps_exchange_rate =", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateNotEqualTo(Float value) {
            addCriterion("ps_exchange_rate <>", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateGreaterThan(Float value) {
            addCriterion("ps_exchange_rate >", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("ps_exchange_rate >=", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateLessThan(Float value) {
            addCriterion("ps_exchange_rate <", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("ps_exchange_rate <=", value, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateIn(List<Float> values) {
            addCriterion("ps_exchange_rate in", values, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateNotIn(List<Float> values) {
            addCriterion("ps_exchange_rate not in", values, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateBetween(Float value1, Float value2) {
            addCriterion("ps_exchange_rate between", value1, value2, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("ps_exchange_rate not between", value1, value2, "psExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeIsNull() {
            addCriterion("ps_foreign_trade is null");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeIsNotNull() {
            addCriterion("ps_foreign_trade is not null");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeEqualTo(String value) {
            addCriterion("ps_foreign_trade =", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotEqualTo(String value) {
            addCriterion("ps_foreign_trade <>", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeGreaterThan(String value) {
            addCriterion("ps_foreign_trade >", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeGreaterThanOrEqualTo(String value) {
            addCriterion("ps_foreign_trade >=", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeLessThan(String value) {
            addCriterion("ps_foreign_trade <", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeLessThanOrEqualTo(String value) {
            addCriterion("ps_foreign_trade <=", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeLike(String value) {
            addCriterion("ps_foreign_trade like", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotLike(String value) {
            addCriterion("ps_foreign_trade not like", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeIn(List<String> values) {
            addCriterion("ps_foreign_trade in", values, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotIn(List<String> values) {
            addCriterion("ps_foreign_trade not in", values, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeBetween(String value1, String value2) {
            addCriterion("ps_foreign_trade between", value1, value2, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotBetween(String value1, String value2) {
            addCriterion("ps_foreign_trade not between", value1, value2, "psForeignTrade");
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

        public Criteria andPstIdIsNull() {
            addCriterion("pst_id is null");
            return (Criteria) this;
        }

        public Criteria andPstIdIsNotNull() {
            addCriterion("pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andPstIdEqualTo(String value) {
            addCriterion("pst_id =", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotEqualTo(String value) {
            addCriterion("pst_id <>", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThan(String value) {
            addCriterion("pst_id >", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThanOrEqualTo(String value) {
            addCriterion("pst_id >=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThan(String value) {
            addCriterion("pst_id <", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThanOrEqualTo(String value) {
            addCriterion("pst_id <=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLike(String value) {
            addCriterion("pst_id like", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotLike(String value) {
            addCriterion("pst_id not like", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdIn(List<String> values) {
            addCriterion("pst_id in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotIn(List<String> values) {
            addCriterion("pst_id not in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdBetween(String value1, String value2) {
            addCriterion("pst_id between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotBetween(String value1, String value2) {
            addCriterion("pst_id not between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxIsNull() {
            addCriterion("ps_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxIsNotNull() {
            addCriterion("ps_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxEqualTo(String value) {
            addCriterion("ps_price_include_tax =", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("ps_price_include_tax <>", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxGreaterThan(String value) {
            addCriterion("ps_price_include_tax >", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("ps_price_include_tax >=", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxLessThan(String value) {
            addCriterion("ps_price_include_tax <", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("ps_price_include_tax <=", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxLike(String value) {
            addCriterion("ps_price_include_tax like", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxNotLike(String value) {
            addCriterion("ps_price_include_tax not like", value, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxIn(List<String> values) {
            addCriterion("ps_price_include_tax in", values, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("ps_price_include_tax not in", values, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("ps_price_include_tax between", value1, value2, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPsPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("ps_price_include_tax not between", value1, value2, "psPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("WareHouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WareHouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("WareHouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("WareHouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("WareHouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("WareHouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("WareHouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("WareHouseID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("WareHouseID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("WareHouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("WareHouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("WareHouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("WareHouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNull() {
            addCriterion("WareHouseName is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("WareHouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("WareHouseName =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("WareHouseName <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("WareHouseName >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseName >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("WareHouseName <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("WareHouseName <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("WareHouseName like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("WareHouseName not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("WareHouseName in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("WareHouseName not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("WareHouseName between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("WareHouseName not between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusIsNull() {
            addCriterion("ps_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusIsNotNull() {
            addCriterion("ps_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusEqualTo(String value) {
            addCriterion("ps_single_status =", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusNotEqualTo(String value) {
            addCriterion("ps_single_status <>", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusGreaterThan(String value) {
            addCriterion("ps_single_status >", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ps_single_status >=", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusLessThan(String value) {
            addCriterion("ps_single_status <", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("ps_single_status <=", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusLike(String value) {
            addCriterion("ps_single_status like", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusNotLike(String value) {
            addCriterion("ps_single_status not like", value, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusIn(List<String> values) {
            addCriterion("ps_single_status in", values, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusNotIn(List<String> values) {
            addCriterion("ps_single_status not in", values, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusBetween(String value1, String value2) {
            addCriterion("ps_single_status between", value1, value2, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSingleStatusNotBetween(String value1, String value2) {
            addCriterion("ps_single_status not between", value1, value2, "psSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPsSunnumIsNull() {
            addCriterion("ps_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andPsSunnumIsNotNull() {
            addCriterion("ps_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andPsSunnumEqualTo(Integer value) {
            addCriterion("ps_sunnum =", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumNotEqualTo(Integer value) {
            addCriterion("ps_sunnum <>", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumGreaterThan(Integer value) {
            addCriterion("ps_sunnum >", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_sunnum >=", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumLessThan(Integer value) {
            addCriterion("ps_sunnum <", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("ps_sunnum <=", value, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumIn(List<Integer> values) {
            addCriterion("ps_sunnum in", values, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumNotIn(List<Integer> values) {
            addCriterion("ps_sunnum not in", values, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumBetween(Integer value1, Integer value2) {
            addCriterion("ps_sunnum between", value1, value2, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_sunnum not between", value1, value2, "psSunnum");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyIsNull() {
            addCriterion("ps_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyIsNotNull() {
            addCriterion("ps_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyEqualTo(Float value) {
            addCriterion("ps_sunmoney =", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyNotEqualTo(Float value) {
            addCriterion("ps_sunmoney <>", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyGreaterThan(Float value) {
            addCriterion("ps_sunmoney >", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("ps_sunmoney >=", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyLessThan(Float value) {
            addCriterion("ps_sunmoney <", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("ps_sunmoney <=", value, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyIn(List<Float> values) {
            addCriterion("ps_sunmoney in", values, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyNotIn(List<Float> values) {
            addCriterion("ps_sunmoney not in", values, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyBetween(Float value1, Float value2) {
            addCriterion("ps_sunmoney between", value1, value2, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("ps_sunmoney not between", value1, value2, "psSunmoney");
            return (Criteria) this;
        }

        public Criteria andPsTaxIsNull() {
            addCriterion("ps_tax is null");
            return (Criteria) this;
        }

        public Criteria andPsTaxIsNotNull() {
            addCriterion("ps_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPsTaxEqualTo(Float value) {
            addCriterion("ps_tax =", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxNotEqualTo(Float value) {
            addCriterion("ps_tax <>", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxGreaterThan(Float value) {
            addCriterion("ps_tax >", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("ps_tax >=", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxLessThan(Float value) {
            addCriterion("ps_tax <", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxLessThanOrEqualTo(Float value) {
            addCriterion("ps_tax <=", value, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxIn(List<Float> values) {
            addCriterion("ps_tax in", values, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxNotIn(List<Float> values) {
            addCriterion("ps_tax not in", values, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxBetween(Float value1, Float value2) {
            addCriterion("ps_tax between", value1, value2, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsTaxNotBetween(Float value1, Float value2) {
            addCriterion("ps_tax not between", value1, value2, "psTax");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountIsNull() {
            addCriterion("ps_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountIsNotNull() {
            addCriterion("ps_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountEqualTo(Float value) {
            addCriterion("ps_include_tax_amount =", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("ps_include_tax_amount <>", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("ps_include_tax_amount >", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("ps_include_tax_amount >=", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountLessThan(Float value) {
            addCriterion("ps_include_tax_amount <", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("ps_include_tax_amount <=", value, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountIn(List<Float> values) {
            addCriterion("ps_include_tax_amount in", values, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("ps_include_tax_amount not in", values, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("ps_include_tax_amount between", value1, value2, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("ps_include_tax_amount not between", value1, value2, "psIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchIsNull() {
            addCriterion("ps_went_dutch is null");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchIsNotNull() {
            addCriterion("ps_went_dutch is not null");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchEqualTo(Float value) {
            addCriterion("ps_went_dutch =", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchNotEqualTo(Float value) {
            addCriterion("ps_went_dutch <>", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchGreaterThan(Float value) {
            addCriterion("ps_went_dutch >", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchGreaterThanOrEqualTo(Float value) {
            addCriterion("ps_went_dutch >=", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchLessThan(Float value) {
            addCriterion("ps_went_dutch <", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchLessThanOrEqualTo(Float value) {
            addCriterion("ps_went_dutch <=", value, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchIn(List<Float> values) {
            addCriterion("ps_went_dutch in", values, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchNotIn(List<Float> values) {
            addCriterion("ps_went_dutch not in", values, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchBetween(Float value1, Float value2) {
            addCriterion("ps_went_dutch between", value1, value2, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsWentDutchNotBetween(Float value1, Float value2) {
            addCriterion("ps_went_dutch not between", value1, value2, "psWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdIsNull() {
            addCriterion("ps_account_ownership_id is null");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdIsNotNull() {
            addCriterion("ps_account_ownership_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdEqualTo(String value) {
            addCriterion("ps_account_ownership_id =", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdNotEqualTo(String value) {
            addCriterion("ps_account_ownership_id <>", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdGreaterThan(String value) {
            addCriterion("ps_account_ownership_id >", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_account_ownership_id >=", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdLessThan(String value) {
            addCriterion("ps_account_ownership_id <", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdLessThanOrEqualTo(String value) {
            addCriterion("ps_account_ownership_id <=", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdLike(String value) {
            addCriterion("ps_account_ownership_id like", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdNotLike(String value) {
            addCriterion("ps_account_ownership_id not like", value, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdIn(List<String> values) {
            addCriterion("ps_account_ownership_id in", values, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdNotIn(List<String> values) {
            addCriterion("ps_account_ownership_id not in", values, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdBetween(String value1, String value2) {
            addCriterion("ps_account_ownership_id between", value1, value2, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipIdNotBetween(String value1, String value2) {
            addCriterion("ps_account_ownership_id not between", value1, value2, "psAccountOwnershipId");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameIsNull() {
            addCriterion("ps_account_ownership_name is null");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameIsNotNull() {
            addCriterion("ps_account_ownership_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameEqualTo(String value) {
            addCriterion("ps_account_ownership_name =", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameNotEqualTo(String value) {
            addCriterion("ps_account_ownership_name <>", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameGreaterThan(String value) {
            addCriterion("ps_account_ownership_name >", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_account_ownership_name >=", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameLessThan(String value) {
            addCriterion("ps_account_ownership_name <", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameLessThanOrEqualTo(String value) {
            addCriterion("ps_account_ownership_name <=", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameLike(String value) {
            addCriterion("ps_account_ownership_name like", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameNotLike(String value) {
            addCriterion("ps_account_ownership_name not like", value, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameIn(List<String> values) {
            addCriterion("ps_account_ownership_name in", values, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameNotIn(List<String> values) {
            addCriterion("ps_account_ownership_name not in", values, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameBetween(String value1, String value2) {
            addCriterion("ps_account_ownership_name between", value1, value2, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsAccountOwnershipNameNotBetween(String value1, String value2) {
            addCriterion("ps_account_ownership_name not between", value1, value2, "psAccountOwnershipName");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseIsNull() {
            addCriterion("ps_payment_clause is null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseIsNotNull() {
            addCriterion("ps_payment_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseEqualTo(String value) {
            addCriterion("ps_payment_clause =", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNotEqualTo(String value) {
            addCriterion("ps_payment_clause <>", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseGreaterThan(String value) {
            addCriterion("ps_payment_clause >", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseGreaterThanOrEqualTo(String value) {
            addCriterion("ps_payment_clause >=", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseLessThan(String value) {
            addCriterion("ps_payment_clause <", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseLessThanOrEqualTo(String value) {
            addCriterion("ps_payment_clause <=", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseLike(String value) {
            addCriterion("ps_payment_clause like", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNotLike(String value) {
            addCriterion("ps_payment_clause not like", value, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseIn(List<String> values) {
            addCriterion("ps_payment_clause in", values, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNotIn(List<String> values) {
            addCriterion("ps_payment_clause not in", values, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseBetween(String value1, String value2) {
            addCriterion("ps_payment_clause between", value1, value2, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNotBetween(String value1, String value2) {
            addCriterion("ps_payment_clause not between", value1, value2, "psPaymentClause");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumIsNull() {
            addCriterion("ps_payment_clause_num is null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumIsNotNull() {
            addCriterion("ps_payment_clause_num is not null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumEqualTo(Short value) {
            addCriterion("ps_payment_clause_num =", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumNotEqualTo(Short value) {
            addCriterion("ps_payment_clause_num <>", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumGreaterThan(Short value) {
            addCriterion("ps_payment_clause_num >", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumGreaterThanOrEqualTo(Short value) {
            addCriterion("ps_payment_clause_num >=", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumLessThan(Short value) {
            addCriterion("ps_payment_clause_num <", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumLessThanOrEqualTo(Short value) {
            addCriterion("ps_payment_clause_num <=", value, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumIn(List<Short> values) {
            addCriterion("ps_payment_clause_num in", values, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumNotIn(List<Short> values) {
            addCriterion("ps_payment_clause_num not in", values, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumBetween(Short value1, Short value2) {
            addCriterion("ps_payment_clause_num between", value1, value2, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentClauseNumNotBetween(Short value1, Short value2) {
            addCriterion("ps_payment_clause_num not between", value1, value2, "psPaymentClauseNum");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateIsNull() {
            addCriterion("ps_payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateIsNotNull() {
            addCriterion("ps_payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("ps_payment_date =", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ps_payment_date <>", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ps_payment_date >", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_payment_date >=", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("ps_payment_date <", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_payment_date <=", value, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("ps_payment_date in", values, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ps_payment_date not in", values, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_payment_date between", value1, value2, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsPaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_payment_date not between", value1, value2, "psPaymentDate");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableIsNull() {
            addCriterion("ps_account_receivable is null");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableIsNotNull() {
            addCriterion("ps_account_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableEqualTo(String value) {
            addCriterion("ps_account_receivable =", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableNotEqualTo(String value) {
            addCriterion("ps_account_receivable <>", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableGreaterThan(String value) {
            addCriterion("ps_account_receivable >", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableGreaterThanOrEqualTo(String value) {
            addCriterion("ps_account_receivable >=", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableLessThan(String value) {
            addCriterion("ps_account_receivable <", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableLessThanOrEqualTo(String value) {
            addCriterion("ps_account_receivable <=", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableLike(String value) {
            addCriterion("ps_account_receivable like", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableNotLike(String value) {
            addCriterion("ps_account_receivable not like", value, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableIn(List<String> values) {
            addCriterion("ps_account_receivable in", values, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableNotIn(List<String> values) {
            addCriterion("ps_account_receivable not in", values, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableBetween(String value1, String value2) {
            addCriterion("ps_account_receivable between", value1, value2, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsAccountReceivableNotBetween(String value1, String value2) {
            addCriterion("ps_account_receivable not between", value1, value2, "psAccountReceivable");
            return (Criteria) this;
        }

        public Criteria andPsCustom1IsNull() {
            addCriterion("ps_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom1IsNotNull() {
            addCriterion("ps_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom1EqualTo(String value) {
            addCriterion("ps_custom1 =", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1NotEqualTo(String value) {
            addCriterion("ps_custom1 <>", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1GreaterThan(String value) {
            addCriterion("ps_custom1 >", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom1 >=", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1LessThan(String value) {
            addCriterion("ps_custom1 <", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1LessThanOrEqualTo(String value) {
            addCriterion("ps_custom1 <=", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1Like(String value) {
            addCriterion("ps_custom1 like", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1NotLike(String value) {
            addCriterion("ps_custom1 not like", value, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1In(List<String> values) {
            addCriterion("ps_custom1 in", values, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1NotIn(List<String> values) {
            addCriterion("ps_custom1 not in", values, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1Between(String value1, String value2) {
            addCriterion("ps_custom1 between", value1, value2, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom1NotBetween(String value1, String value2) {
            addCriterion("ps_custom1 not between", value1, value2, "psCustom1");
            return (Criteria) this;
        }

        public Criteria andPsCustom2IsNull() {
            addCriterion("ps_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom2IsNotNull() {
            addCriterion("ps_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom2EqualTo(String value) {
            addCriterion("ps_custom2 =", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2NotEqualTo(String value) {
            addCriterion("ps_custom2 <>", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2GreaterThan(String value) {
            addCriterion("ps_custom2 >", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom2 >=", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2LessThan(String value) {
            addCriterion("ps_custom2 <", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2LessThanOrEqualTo(String value) {
            addCriterion("ps_custom2 <=", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2Like(String value) {
            addCriterion("ps_custom2 like", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2NotLike(String value) {
            addCriterion("ps_custom2 not like", value, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2In(List<String> values) {
            addCriterion("ps_custom2 in", values, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2NotIn(List<String> values) {
            addCriterion("ps_custom2 not in", values, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2Between(String value1, String value2) {
            addCriterion("ps_custom2 between", value1, value2, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsCustom2NotBetween(String value1, String value2) {
            addCriterion("ps_custom2 not between", value1, value2, "psCustom2");
            return (Criteria) this;
        }

        public Criteria andPsRemarkIsNull() {
            addCriterion("ps_remark is null");
            return (Criteria) this;
        }

        public Criteria andPsRemarkIsNotNull() {
            addCriterion("ps_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPsRemarkEqualTo(String value) {
            addCriterion("ps_remark =", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkNotEqualTo(String value) {
            addCriterion("ps_remark <>", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkGreaterThan(String value) {
            addCriterion("ps_remark >", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ps_remark >=", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkLessThan(String value) {
            addCriterion("ps_remark <", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkLessThanOrEqualTo(String value) {
            addCriterion("ps_remark <=", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkLike(String value) {
            addCriterion("ps_remark like", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkNotLike(String value) {
            addCriterion("ps_remark not like", value, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkIn(List<String> values) {
            addCriterion("ps_remark in", values, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkNotIn(List<String> values) {
            addCriterion("ps_remark not in", values, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkBetween(String value1, String value2) {
            addCriterion("ps_remark between", value1, value2, "psRemark");
            return (Criteria) this;
        }

        public Criteria andPsRemarkNotBetween(String value1, String value2) {
            addCriterion("ps_remark not between", value1, value2, "psRemark");
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

        public Criteria andPsBelongsProjectIsNull() {
            addCriterion("ps_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectIsNotNull() {
            addCriterion("ps_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectEqualTo(String value) {
            addCriterion("ps_belongs_project =", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectNotEqualTo(String value) {
            addCriterion("ps_belongs_project <>", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectGreaterThan(String value) {
            addCriterion("ps_belongs_project >", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("ps_belongs_project >=", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectLessThan(String value) {
            addCriterion("ps_belongs_project <", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("ps_belongs_project <=", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectLike(String value) {
            addCriterion("ps_belongs_project like", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectNotLike(String value) {
            addCriterion("ps_belongs_project not like", value, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectIn(List<String> values) {
            addCriterion("ps_belongs_project in", values, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectNotIn(List<String> values) {
            addCriterion("ps_belongs_project not in", values, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectBetween(String value1, String value2) {
            addCriterion("ps_belongs_project between", value1, value2, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("ps_belongs_project not between", value1, value2, "psBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPsExecutorIsNull() {
            addCriterion("ps_executor is null");
            return (Criteria) this;
        }

        public Criteria andPsExecutorIsNotNull() {
            addCriterion("ps_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPsExecutorEqualTo(String value) {
            addCriterion("ps_executor =", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorNotEqualTo(String value) {
            addCriterion("ps_executor <>", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorGreaterThan(String value) {
            addCriterion("ps_executor >", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("ps_executor >=", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorLessThan(String value) {
            addCriterion("ps_executor <", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorLessThanOrEqualTo(String value) {
            addCriterion("ps_executor <=", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorLike(String value) {
            addCriterion("ps_executor like", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorNotLike(String value) {
            addCriterion("ps_executor not like", value, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorIn(List<String> values) {
            addCriterion("ps_executor in", values, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorNotIn(List<String> values) {
            addCriterion("ps_executor not in", values, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorBetween(String value1, String value2) {
            addCriterion("ps_executor between", value1, value2, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsExecutorNotBetween(String value1, String value2) {
            addCriterion("ps_executor not between", value1, value2, "psExecutor");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffIsNull() {
            addCriterion("ps_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffIsNotNull() {
            addCriterion("ps_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffEqualTo(String value) {
            addCriterion("ps_checkagain_staff =", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffNotEqualTo(String value) {
            addCriterion("ps_checkagain_staff <>", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffGreaterThan(String value) {
            addCriterion("ps_checkagain_staff >", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("ps_checkagain_staff >=", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffLessThan(String value) {
            addCriterion("ps_checkagain_staff <", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("ps_checkagain_staff <=", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffLike(String value) {
            addCriterion("ps_checkagain_staff like", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffNotLike(String value) {
            addCriterion("ps_checkagain_staff not like", value, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffIn(List<String> values) {
            addCriterion("ps_checkagain_staff in", values, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffNotIn(List<String> values) {
            addCriterion("ps_checkagain_staff not in", values, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffBetween(String value1, String value2) {
            addCriterion("ps_checkagain_staff between", value1, value2, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("ps_checkagain_staff not between", value1, value2, "psCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPsAuditionIsNull() {
            addCriterion("ps_audition is null");
            return (Criteria) this;
        }

        public Criteria andPsAuditionIsNotNull() {
            addCriterion("ps_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPsAuditionEqualTo(String value) {
            addCriterion("ps_audition =", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionNotEqualTo(String value) {
            addCriterion("ps_audition <>", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionGreaterThan(String value) {
            addCriterion("ps_audition >", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("ps_audition >=", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionLessThan(String value) {
            addCriterion("ps_audition <", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionLessThanOrEqualTo(String value) {
            addCriterion("ps_audition <=", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionLike(String value) {
            addCriterion("ps_audition like", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionNotLike(String value) {
            addCriterion("ps_audition not like", value, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionIn(List<String> values) {
            addCriterion("ps_audition in", values, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionNotIn(List<String> values) {
            addCriterion("ps_audition not in", values, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionBetween(String value1, String value2) {
            addCriterion("ps_audition between", value1, value2, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsAuditionNotBetween(String value1, String value2) {
            addCriterion("ps_audition not between", value1, value2, "psAudition");
            return (Criteria) this;
        }

        public Criteria andPsYnIsNull() {
            addCriterion("ps_yn is null");
            return (Criteria) this;
        }

        public Criteria andPsYnIsNotNull() {
            addCriterion("ps_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPsYnEqualTo(String value) {
            addCriterion("ps_yn =", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnNotEqualTo(String value) {
            addCriterion("ps_yn <>", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnGreaterThan(String value) {
            addCriterion("ps_yn >", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnGreaterThanOrEqualTo(String value) {
            addCriterion("ps_yn >=", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnLessThan(String value) {
            addCriterion("ps_yn <", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnLessThanOrEqualTo(String value) {
            addCriterion("ps_yn <=", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnLike(String value) {
            addCriterion("ps_yn like", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnNotLike(String value) {
            addCriterion("ps_yn not like", value, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnIn(List<String> values) {
            addCriterion("ps_yn in", values, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnNotIn(List<String> values) {
            addCriterion("ps_yn not in", values, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnBetween(String value1, String value2) {
            addCriterion("ps_yn between", value1, value2, "psYn");
            return (Criteria) this;
        }

        public Criteria andPsYnNotBetween(String value1, String value2) {
            addCriterion("ps_yn not between", value1, value2, "psYn");
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