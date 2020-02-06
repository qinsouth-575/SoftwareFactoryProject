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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(String value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(String value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(String value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(String value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(String value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLike(String value) {
            addCriterion("ps_id like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotLike(String value) {
            addCriterion("ps_id not like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<String> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<String> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(String value1, String value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(String value1, String value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
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

        public Criteria andPsEngnameIsNull() {
            addCriterion("ps_engname is null");
            return (Criteria) this;
        }

        public Criteria andPsEngnameIsNotNull() {
            addCriterion("ps_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPsEngnameEqualTo(String value) {
            addCriterion("ps_engname =", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameNotEqualTo(String value) {
            addCriterion("ps_engname <>", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameGreaterThan(String value) {
            addCriterion("ps_engname >", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_engname >=", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameLessThan(String value) {
            addCriterion("ps_engname <", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameLessThanOrEqualTo(String value) {
            addCriterion("ps_engname <=", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameLike(String value) {
            addCriterion("ps_engname like", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameNotLike(String value) {
            addCriterion("ps_engname not like", value, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameIn(List<String> values) {
            addCriterion("ps_engname in", values, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameNotIn(List<String> values) {
            addCriterion("ps_engname not in", values, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameBetween(String value1, String value2) {
            addCriterion("ps_engname between", value1, value2, "psEngname");
            return (Criteria) this;
        }

        public Criteria andPsEngnameNotBetween(String value1, String value2) {
            addCriterion("ps_engname not between", value1, value2, "psEngname");
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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

        public Criteria andPsForeignTradeEqualTo(Integer value) {
            addCriterion("ps_foreign_trade =", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotEqualTo(Integer value) {
            addCriterion("ps_foreign_trade <>", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeGreaterThan(Integer value) {
            addCriterion("ps_foreign_trade >", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_foreign_trade >=", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeLessThan(Integer value) {
            addCriterion("ps_foreign_trade <", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeLessThanOrEqualTo(Integer value) {
            addCriterion("ps_foreign_trade <=", value, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeIn(List<Integer> values) {
            addCriterion("ps_foreign_trade in", values, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotIn(List<Integer> values) {
            addCriterion("ps_foreign_trade not in", values, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeBetween(Integer value1, Integer value2) {
            addCriterion("ps_foreign_trade between", value1, value2, "psForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPsForeignTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_foreign_trade not between", value1, value2, "psForeignTrade");
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

        public Criteria andPsDeliveryAddressIsNull() {
            addCriterion("ps_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressIsNotNull() {
            addCriterion("ps_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressEqualTo(String value) {
            addCriterion("ps_delivery_address =", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressNotEqualTo(String value) {
            addCriterion("ps_delivery_address <>", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressGreaterThan(String value) {
            addCriterion("ps_delivery_address >", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ps_delivery_address >=", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressLessThan(String value) {
            addCriterion("ps_delivery_address <", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("ps_delivery_address <=", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressLike(String value) {
            addCriterion("ps_delivery_address like", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressNotLike(String value) {
            addCriterion("ps_delivery_address not like", value, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressIn(List<String> values) {
            addCriterion("ps_delivery_address in", values, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressNotIn(List<String> values) {
            addCriterion("ps_delivery_address not in", values, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressBetween(String value1, String value2) {
            addCriterion("ps_delivery_address between", value1, value2, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("ps_delivery_address not between", value1, value2, "psDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPsBuyerIsNull() {
            addCriterion("ps_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPsBuyerIsNotNull() {
            addCriterion("ps_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPsBuyerEqualTo(String value) {
            addCriterion("ps_buyer =", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerNotEqualTo(String value) {
            addCriterion("ps_buyer <>", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerGreaterThan(String value) {
            addCriterion("ps_buyer >", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("ps_buyer >=", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerLessThan(String value) {
            addCriterion("ps_buyer <", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerLessThanOrEqualTo(String value) {
            addCriterion("ps_buyer <=", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerLike(String value) {
            addCriterion("ps_buyer like", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerNotLike(String value) {
            addCriterion("ps_buyer not like", value, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerIn(List<String> values) {
            addCriterion("ps_buyer in", values, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerNotIn(List<String> values) {
            addCriterion("ps_buyer not in", values, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerBetween(String value1, String value2) {
            addCriterion("ps_buyer between", value1, value2, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBuyerNotBetween(String value1, String value2) {
            addCriterion("ps_buyer not between", value1, value2, "psBuyer");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionIsNull() {
            addCriterion("ps_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionIsNotNull() {
            addCriterion("ps_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionEqualTo(String value) {
            addCriterion("ps_belongs_section =", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionNotEqualTo(String value) {
            addCriterion("ps_belongs_section <>", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionGreaterThan(String value) {
            addCriterion("ps_belongs_section >", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("ps_belongs_section >=", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionLessThan(String value) {
            addCriterion("ps_belongs_section <", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("ps_belongs_section <=", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionLike(String value) {
            addCriterion("ps_belongs_section like", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionNotLike(String value) {
            addCriterion("ps_belongs_section not like", value, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionIn(List<String> values) {
            addCriterion("ps_belongs_section in", values, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionNotIn(List<String> values) {
            addCriterion("ps_belongs_section not in", values, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionBetween(String value1, String value2) {
            addCriterion("ps_belongs_section between", value1, value2, "psBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPsBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("ps_belongs_section not between", value1, value2, "psBelongsSection");
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

        public Criteria andPsHeaderProvisionIsNull() {
            addCriterion("ps_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionIsNotNull() {
            addCriterion("ps_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionEqualTo(String value) {
            addCriterion("ps_header_provision =", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionNotEqualTo(String value) {
            addCriterion("ps_header_provision <>", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionGreaterThan(String value) {
            addCriterion("ps_header_provision >", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("ps_header_provision >=", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionLessThan(String value) {
            addCriterion("ps_header_provision <", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("ps_header_provision <=", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionLike(String value) {
            addCriterion("ps_header_provision like", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionNotLike(String value) {
            addCriterion("ps_header_provision not like", value, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionIn(List<String> values) {
            addCriterion("ps_header_provision in", values, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionNotIn(List<String> values) {
            addCriterion("ps_header_provision not in", values, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionBetween(String value1, String value2) {
            addCriterion("ps_header_provision between", value1, value2, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("ps_header_provision not between", value1, value2, "psHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseIsNull() {
            addCriterion("ps_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseIsNotNull() {
            addCriterion("ps_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseEqualTo(String value) {
            addCriterion("ps_end_clause =", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseNotEqualTo(String value) {
            addCriterion("ps_end_clause <>", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseGreaterThan(String value) {
            addCriterion("ps_end_clause >", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("ps_end_clause >=", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseLessThan(String value) {
            addCriterion("ps_end_clause <", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseLessThanOrEqualTo(String value) {
            addCriterion("ps_end_clause <=", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseLike(String value) {
            addCriterion("ps_end_clause like", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseNotLike(String value) {
            addCriterion("ps_end_clause not like", value, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseIn(List<String> values) {
            addCriterion("ps_end_clause in", values, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseNotIn(List<String> values) {
            addCriterion("ps_end_clause not in", values, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseBetween(String value1, String value2) {
            addCriterion("ps_end_clause between", value1, value2, "psEndClause");
            return (Criteria) this;
        }

        public Criteria andPsEndClauseNotBetween(String value1, String value2) {
            addCriterion("ps_end_clause not between", value1, value2, "psEndClause");
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

        public Criteria andPsCustom3IsNull() {
            addCriterion("ps_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom3IsNotNull() {
            addCriterion("ps_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom3EqualTo(String value) {
            addCriterion("ps_custom3 =", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3NotEqualTo(String value) {
            addCriterion("ps_custom3 <>", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3GreaterThan(String value) {
            addCriterion("ps_custom3 >", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom3 >=", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3LessThan(String value) {
            addCriterion("ps_custom3 <", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3LessThanOrEqualTo(String value) {
            addCriterion("ps_custom3 <=", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3Like(String value) {
            addCriterion("ps_custom3 like", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3NotLike(String value) {
            addCriterion("ps_custom3 not like", value, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3In(List<String> values) {
            addCriterion("ps_custom3 in", values, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3NotIn(List<String> values) {
            addCriterion("ps_custom3 not in", values, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3Between(String value1, String value2) {
            addCriterion("ps_custom3 between", value1, value2, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom3NotBetween(String value1, String value2) {
            addCriterion("ps_custom3 not between", value1, value2, "psCustom3");
            return (Criteria) this;
        }

        public Criteria andPsCustom4IsNull() {
            addCriterion("ps_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom4IsNotNull() {
            addCriterion("ps_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom4EqualTo(String value) {
            addCriterion("ps_custom4 =", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4NotEqualTo(String value) {
            addCriterion("ps_custom4 <>", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4GreaterThan(String value) {
            addCriterion("ps_custom4 >", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom4 >=", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4LessThan(String value) {
            addCriterion("ps_custom4 <", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4LessThanOrEqualTo(String value) {
            addCriterion("ps_custom4 <=", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4Like(String value) {
            addCriterion("ps_custom4 like", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4NotLike(String value) {
            addCriterion("ps_custom4 not like", value, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4In(List<String> values) {
            addCriterion("ps_custom4 in", values, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4NotIn(List<String> values) {
            addCriterion("ps_custom4 not in", values, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4Between(String value1, String value2) {
            addCriterion("ps_custom4 between", value1, value2, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom4NotBetween(String value1, String value2) {
            addCriterion("ps_custom4 not between", value1, value2, "psCustom4");
            return (Criteria) this;
        }

        public Criteria andPsCustom5IsNull() {
            addCriterion("ps_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom5IsNotNull() {
            addCriterion("ps_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom5EqualTo(String value) {
            addCriterion("ps_custom5 =", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5NotEqualTo(String value) {
            addCriterion("ps_custom5 <>", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5GreaterThan(String value) {
            addCriterion("ps_custom5 >", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom5 >=", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5LessThan(String value) {
            addCriterion("ps_custom5 <", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5LessThanOrEqualTo(String value) {
            addCriterion("ps_custom5 <=", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5Like(String value) {
            addCriterion("ps_custom5 like", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5NotLike(String value) {
            addCriterion("ps_custom5 not like", value, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5In(List<String> values) {
            addCriterion("ps_custom5 in", values, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5NotIn(List<String> values) {
            addCriterion("ps_custom5 not in", values, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5Between(String value1, String value2) {
            addCriterion("ps_custom5 between", value1, value2, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom5NotBetween(String value1, String value2) {
            addCriterion("ps_custom5 not between", value1, value2, "psCustom5");
            return (Criteria) this;
        }

        public Criteria andPsCustom6IsNull() {
            addCriterion("ps_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPsCustom6IsNotNull() {
            addCriterion("ps_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustom6EqualTo(String value) {
            addCriterion("ps_custom6 =", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6NotEqualTo(String value) {
            addCriterion("ps_custom6 <>", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6GreaterThan(String value) {
            addCriterion("ps_custom6 >", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ps_custom6 >=", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6LessThan(String value) {
            addCriterion("ps_custom6 <", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6LessThanOrEqualTo(String value) {
            addCriterion("ps_custom6 <=", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6Like(String value) {
            addCriterion("ps_custom6 like", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6NotLike(String value) {
            addCriterion("ps_custom6 not like", value, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6In(List<String> values) {
            addCriterion("ps_custom6 in", values, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6NotIn(List<String> values) {
            addCriterion("ps_custom6 not in", values, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6Between(String value1, String value2) {
            addCriterion("ps_custom6 between", value1, value2, "psCustom6");
            return (Criteria) this;
        }

        public Criteria andPsCustom6NotBetween(String value1, String value2) {
            addCriterion("ps_custom6 not between", value1, value2, "psCustom6");
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