package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseReturnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseReturnsExample() {
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

        public Criteria andPureIdIsNull() {
            addCriterion("pure_id is null");
            return (Criteria) this;
        }

        public Criteria andPureIdIsNotNull() {
            addCriterion("pure_id is not null");
            return (Criteria) this;
        }

        public Criteria andPureIdEqualTo(String value) {
            addCriterion("pure_id =", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotEqualTo(String value) {
            addCriterion("pure_id <>", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdGreaterThan(String value) {
            addCriterion("pure_id >", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdGreaterThanOrEqualTo(String value) {
            addCriterion("pure_id >=", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLessThan(String value) {
            addCriterion("pure_id <", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLessThanOrEqualTo(String value) {
            addCriterion("pure_id <=", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdLike(String value) {
            addCriterion("pure_id like", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotLike(String value) {
            addCriterion("pure_id not like", value, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdIn(List<String> values) {
            addCriterion("pure_id in", values, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotIn(List<String> values) {
            addCriterion("pure_id not in", values, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdBetween(String value1, String value2) {
            addCriterion("pure_id between", value1, value2, "pureId");
            return (Criteria) this;
        }

        public Criteria andPureIdNotBetween(String value1, String value2) {
            addCriterion("pure_id not between", value1, value2, "pureId");
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

        public Criteria andPureEngnameIsNull() {
            addCriterion("pure_engname is null");
            return (Criteria) this;
        }

        public Criteria andPureEngnameIsNotNull() {
            addCriterion("pure_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPureEngnameEqualTo(String value) {
            addCriterion("pure_engname =", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameNotEqualTo(String value) {
            addCriterion("pure_engname <>", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameGreaterThan(String value) {
            addCriterion("pure_engname >", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("pure_engname >=", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameLessThan(String value) {
            addCriterion("pure_engname <", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameLessThanOrEqualTo(String value) {
            addCriterion("pure_engname <=", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameLike(String value) {
            addCriterion("pure_engname like", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameNotLike(String value) {
            addCriterion("pure_engname not like", value, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameIn(List<String> values) {
            addCriterion("pure_engname in", values, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameNotIn(List<String> values) {
            addCriterion("pure_engname not in", values, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameBetween(String value1, String value2) {
            addCriterion("pure_engname between", value1, value2, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPureEngnameNotBetween(String value1, String value2) {
            addCriterion("pure_engname not between", value1, value2, "pureEngname");
            return (Criteria) this;
        }

        public Criteria andPuretIdIsNull() {
            addCriterion("puret_id is null");
            return (Criteria) this;
        }

        public Criteria andPuretIdIsNotNull() {
            addCriterion("puret_id is not null");
            return (Criteria) this;
        }

        public Criteria andPuretIdEqualTo(String value) {
            addCriterion("puret_id =", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdNotEqualTo(String value) {
            addCriterion("puret_id <>", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdGreaterThan(String value) {
            addCriterion("puret_id >", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdGreaterThanOrEqualTo(String value) {
            addCriterion("puret_id >=", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdLessThan(String value) {
            addCriterion("puret_id <", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdLessThanOrEqualTo(String value) {
            addCriterion("puret_id <=", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdLike(String value) {
            addCriterion("puret_id like", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdNotLike(String value) {
            addCriterion("puret_id not like", value, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdIn(List<String> values) {
            addCriterion("puret_id in", values, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdNotIn(List<String> values) {
            addCriterion("puret_id not in", values, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdBetween(String value1, String value2) {
            addCriterion("puret_id between", value1, value2, "puretId");
            return (Criteria) this;
        }

        public Criteria andPuretIdNotBetween(String value1, String value2) {
            addCriterion("puret_id not between", value1, value2, "puretId");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxIsNull() {
            addCriterion("pure_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxIsNotNull() {
            addCriterion("pure_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxEqualTo(String value) {
            addCriterion("pure_price_include_tax =", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxNotEqualTo(String value) {
            addCriterion("pure_price_include_tax <>", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxGreaterThan(String value) {
            addCriterion("pure_price_include_tax >", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("pure_price_include_tax >=", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxLessThan(String value) {
            addCriterion("pure_price_include_tax <", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("pure_price_include_tax <=", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxLike(String value) {
            addCriterion("pure_price_include_tax like", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxNotLike(String value) {
            addCriterion("pure_price_include_tax not like", value, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxIn(List<String> values) {
            addCriterion("pure_price_include_tax in", values, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxNotIn(List<String> values) {
            addCriterion("pure_price_include_tax not in", values, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("pure_price_include_tax between", value1, value2, "purePriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPurePriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("pure_price_include_tax not between", value1, value2, "purePriceIncludeTax");
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

        public Criteria andPureSingleStatusIsNull() {
            addCriterion("pure_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusIsNotNull() {
            addCriterion("pure_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusEqualTo(String value) {
            addCriterion("pure_single_status =", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusNotEqualTo(String value) {
            addCriterion("pure_single_status <>", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusGreaterThan(String value) {
            addCriterion("pure_single_status >", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pure_single_status >=", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusLessThan(String value) {
            addCriterion("pure_single_status <", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("pure_single_status <=", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusLike(String value) {
            addCriterion("pure_single_status like", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusNotLike(String value) {
            addCriterion("pure_single_status not like", value, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusIn(List<String> values) {
            addCriterion("pure_single_status in", values, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusNotIn(List<String> values) {
            addCriterion("pure_single_status not in", values, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusBetween(String value1, String value2) {
            addCriterion("pure_single_status between", value1, value2, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureSingleStatusNotBetween(String value1, String value2) {
            addCriterion("pure_single_status not between", value1, value2, "pureSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateIsNull() {
            addCriterion("pure_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateIsNotNull() {
            addCriterion("pure_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pure_document_date =", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pure_document_date <>", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pure_document_date >", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pure_document_date >=", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pure_document_date <", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pure_document_date <=", value, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pure_document_date in", values, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pure_document_date not in", values, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pure_document_date between", value1, value2, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pure_document_date not between", value1, value2, "pureDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberIsNull() {
            addCriterion("pure_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberIsNotNull() {
            addCriterion("pure_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberEqualTo(String value) {
            addCriterion("pure_document_number =", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberNotEqualTo(String value) {
            addCriterion("pure_document_number <>", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberGreaterThan(String value) {
            addCriterion("pure_document_number >", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pure_document_number >=", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberLessThan(String value) {
            addCriterion("pure_document_number <", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pure_document_number <=", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberLike(String value) {
            addCriterion("pure_document_number like", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberNotLike(String value) {
            addCriterion("pure_document_number not like", value, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberIn(List<String> values) {
            addCriterion("pure_document_number in", values, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberNotIn(List<String> values) {
            addCriterion("pure_document_number not in", values, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberBetween(String value1, String value2) {
            addCriterion("pure_document_number between", value1, value2, "pureDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPureDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pure_document_number not between", value1, value2, "pureDocumentNumber");
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

        public Criteria andPureExchangeRateIsNull() {
            addCriterion("pure_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateIsNotNull() {
            addCriterion("pure_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateEqualTo(Float value) {
            addCriterion("pure_exchange_rate =", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateNotEqualTo(Float value) {
            addCriterion("pure_exchange_rate <>", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateGreaterThan(Float value) {
            addCriterion("pure_exchange_rate >", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pure_exchange_rate >=", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateLessThan(Float value) {
            addCriterion("pure_exchange_rate <", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("pure_exchange_rate <=", value, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateIn(List<Float> values) {
            addCriterion("pure_exchange_rate in", values, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateNotIn(List<Float> values) {
            addCriterion("pure_exchange_rate not in", values, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateBetween(Float value1, Float value2) {
            addCriterion("pure_exchange_rate between", value1, value2, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("pure_exchange_rate not between", value1, value2, "pureExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeIsNull() {
            addCriterion("pure_foreign_trade is null");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeIsNotNull() {
            addCriterion("pure_foreign_trade is not null");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeEqualTo(Integer value) {
            addCriterion("pure_foreign_trade =", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeNotEqualTo(Integer value) {
            addCriterion("pure_foreign_trade <>", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeGreaterThan(Integer value) {
            addCriterion("pure_foreign_trade >", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pure_foreign_trade >=", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeLessThan(Integer value) {
            addCriterion("pure_foreign_trade <", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeLessThanOrEqualTo(Integer value) {
            addCriterion("pure_foreign_trade <=", value, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeIn(List<Integer> values) {
            addCriterion("pure_foreign_trade in", values, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeNotIn(List<Integer> values) {
            addCriterion("pure_foreign_trade not in", values, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeBetween(Integer value1, Integer value2) {
            addCriterion("pure_foreign_trade between", value1, value2, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureForeignTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("pure_foreign_trade not between", value1, value2, "pureForeignTrade");
            return (Criteria) this;
        }

        public Criteria andPureSunnumIsNull() {
            addCriterion("pure_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andPureSunnumIsNotNull() {
            addCriterion("pure_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andPureSunnumEqualTo(Integer value) {
            addCriterion("pure_sunnum =", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumNotEqualTo(Integer value) {
            addCriterion("pure_sunnum <>", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumGreaterThan(Integer value) {
            addCriterion("pure_sunnum >", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pure_sunnum >=", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumLessThan(Integer value) {
            addCriterion("pure_sunnum <", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("pure_sunnum <=", value, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumIn(List<Integer> values) {
            addCriterion("pure_sunnum in", values, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumNotIn(List<Integer> values) {
            addCriterion("pure_sunnum not in", values, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumBetween(Integer value1, Integer value2) {
            addCriterion("pure_sunnum between", value1, value2, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pure_sunnum not between", value1, value2, "pureSunnum");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyIsNull() {
            addCriterion("pure_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyIsNotNull() {
            addCriterion("pure_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyEqualTo(Float value) {
            addCriterion("pure_sunmoney =", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyNotEqualTo(Float value) {
            addCriterion("pure_sunmoney <>", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyGreaterThan(Float value) {
            addCriterion("pure_sunmoney >", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pure_sunmoney >=", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyLessThan(Float value) {
            addCriterion("pure_sunmoney <", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("pure_sunmoney <=", value, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyIn(List<Float> values) {
            addCriterion("pure_sunmoney in", values, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyNotIn(List<Float> values) {
            addCriterion("pure_sunmoney not in", values, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyBetween(Float value1, Float value2) {
            addCriterion("pure_sunmoney between", value1, value2, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("pure_sunmoney not between", value1, value2, "pureSunmoney");
            return (Criteria) this;
        }

        public Criteria andPureTaxIsNull() {
            addCriterion("pure_tax is null");
            return (Criteria) this;
        }

        public Criteria andPureTaxIsNotNull() {
            addCriterion("pure_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPureTaxEqualTo(Float value) {
            addCriterion("pure_tax =", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxNotEqualTo(Float value) {
            addCriterion("pure_tax <>", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxGreaterThan(Float value) {
            addCriterion("pure_tax >", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("pure_tax >=", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxLessThan(Float value) {
            addCriterion("pure_tax <", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxLessThanOrEqualTo(Float value) {
            addCriterion("pure_tax <=", value, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxIn(List<Float> values) {
            addCriterion("pure_tax in", values, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxNotIn(List<Float> values) {
            addCriterion("pure_tax not in", values, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxBetween(Float value1, Float value2) {
            addCriterion("pure_tax between", value1, value2, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureTaxNotBetween(Float value1, Float value2) {
            addCriterion("pure_tax not between", value1, value2, "pureTax");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountIsNull() {
            addCriterion("pure_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountIsNotNull() {
            addCriterion("pure_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountEqualTo(Float value) {
            addCriterion("pure_include_tax_amount =", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("pure_include_tax_amount <>", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("pure_include_tax_amount >", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pure_include_tax_amount >=", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountLessThan(Float value) {
            addCriterion("pure_include_tax_amount <", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pure_include_tax_amount <=", value, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountIn(List<Float> values) {
            addCriterion("pure_include_tax_amount in", values, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("pure_include_tax_amount not in", values, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pure_include_tax_amount between", value1, value2, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pure_include_tax_amount not between", value1, value2, "pureIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressIsNull() {
            addCriterion("pure_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressIsNotNull() {
            addCriterion("pure_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressEqualTo(String value) {
            addCriterion("pure_delivery_address =", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressNotEqualTo(String value) {
            addCriterion("pure_delivery_address <>", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressGreaterThan(String value) {
            addCriterion("pure_delivery_address >", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pure_delivery_address >=", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressLessThan(String value) {
            addCriterion("pure_delivery_address <", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("pure_delivery_address <=", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressLike(String value) {
            addCriterion("pure_delivery_address like", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressNotLike(String value) {
            addCriterion("pure_delivery_address not like", value, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressIn(List<String> values) {
            addCriterion("pure_delivery_address in", values, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressNotIn(List<String> values) {
            addCriterion("pure_delivery_address not in", values, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressBetween(String value1, String value2) {
            addCriterion("pure_delivery_address between", value1, value2, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("pure_delivery_address not between", value1, value2, "pureDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPureBuyerIsNull() {
            addCriterion("pure_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPureBuyerIsNotNull() {
            addCriterion("pure_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPureBuyerEqualTo(String value) {
            addCriterion("pure_buyer =", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerNotEqualTo(String value) {
            addCriterion("pure_buyer <>", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerGreaterThan(String value) {
            addCriterion("pure_buyer >", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("pure_buyer >=", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerLessThan(String value) {
            addCriterion("pure_buyer <", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerLessThanOrEqualTo(String value) {
            addCriterion("pure_buyer <=", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerLike(String value) {
            addCriterion("pure_buyer like", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerNotLike(String value) {
            addCriterion("pure_buyer not like", value, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerIn(List<String> values) {
            addCriterion("pure_buyer in", values, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerNotIn(List<String> values) {
            addCriterion("pure_buyer not in", values, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerBetween(String value1, String value2) {
            addCriterion("pure_buyer between", value1, value2, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBuyerNotBetween(String value1, String value2) {
            addCriterion("pure_buyer not between", value1, value2, "pureBuyer");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionIsNull() {
            addCriterion("pure_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionIsNotNull() {
            addCriterion("pure_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionEqualTo(String value) {
            addCriterion("pure_belongs_section =", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionNotEqualTo(String value) {
            addCriterion("pure_belongs_section <>", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionGreaterThan(String value) {
            addCriterion("pure_belongs_section >", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pure_belongs_section >=", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionLessThan(String value) {
            addCriterion("pure_belongs_section <", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("pure_belongs_section <=", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionLike(String value) {
            addCriterion("pure_belongs_section like", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionNotLike(String value) {
            addCriterion("pure_belongs_section not like", value, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionIn(List<String> values) {
            addCriterion("pure_belongs_section in", values, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionNotIn(List<String> values) {
            addCriterion("pure_belongs_section not in", values, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionBetween(String value1, String value2) {
            addCriterion("pure_belongs_section between", value1, value2, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("pure_belongs_section not between", value1, value2, "pureBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectIsNull() {
            addCriterion("pure_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectIsNotNull() {
            addCriterion("pure_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectEqualTo(String value) {
            addCriterion("pure_belongs_project =", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectNotEqualTo(String value) {
            addCriterion("pure_belongs_project <>", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectGreaterThan(String value) {
            addCriterion("pure_belongs_project >", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("pure_belongs_project >=", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectLessThan(String value) {
            addCriterion("pure_belongs_project <", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("pure_belongs_project <=", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectLike(String value) {
            addCriterion("pure_belongs_project like", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectNotLike(String value) {
            addCriterion("pure_belongs_project not like", value, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectIn(List<String> values) {
            addCriterion("pure_belongs_project in", values, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectNotIn(List<String> values) {
            addCriterion("pure_belongs_project not in", values, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectBetween(String value1, String value2) {
            addCriterion("pure_belongs_project between", value1, value2, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("pure_belongs_project not between", value1, value2, "pureBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPureExecutorIsNull() {
            addCriterion("pure_executor is null");
            return (Criteria) this;
        }

        public Criteria andPureExecutorIsNotNull() {
            addCriterion("pure_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPureExecutorEqualTo(String value) {
            addCriterion("pure_executor =", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorNotEqualTo(String value) {
            addCriterion("pure_executor <>", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorGreaterThan(String value) {
            addCriterion("pure_executor >", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("pure_executor >=", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorLessThan(String value) {
            addCriterion("pure_executor <", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorLessThanOrEqualTo(String value) {
            addCriterion("pure_executor <=", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorLike(String value) {
            addCriterion("pure_executor like", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorNotLike(String value) {
            addCriterion("pure_executor not like", value, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorIn(List<String> values) {
            addCriterion("pure_executor in", values, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorNotIn(List<String> values) {
            addCriterion("pure_executor not in", values, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorBetween(String value1, String value2) {
            addCriterion("pure_executor between", value1, value2, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureExecutorNotBetween(String value1, String value2) {
            addCriterion("pure_executor not between", value1, value2, "pureExecutor");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffIsNull() {
            addCriterion("pure_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffIsNotNull() {
            addCriterion("pure_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffEqualTo(String value) {
            addCriterion("pure_checkagain_staff =", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffNotEqualTo(String value) {
            addCriterion("pure_checkagain_staff <>", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffGreaterThan(String value) {
            addCriterion("pure_checkagain_staff >", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pure_checkagain_staff >=", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffLessThan(String value) {
            addCriterion("pure_checkagain_staff <", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("pure_checkagain_staff <=", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffLike(String value) {
            addCriterion("pure_checkagain_staff like", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffNotLike(String value) {
            addCriterion("pure_checkagain_staff not like", value, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffIn(List<String> values) {
            addCriterion("pure_checkagain_staff in", values, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffNotIn(List<String> values) {
            addCriterion("pure_checkagain_staff not in", values, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffBetween(String value1, String value2) {
            addCriterion("pure_checkagain_staff between", value1, value2, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("pure_checkagain_staff not between", value1, value2, "pureCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionIsNull() {
            addCriterion("pure_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionIsNotNull() {
            addCriterion("pure_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionEqualTo(String value) {
            addCriterion("pure_header_provision =", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionNotEqualTo(String value) {
            addCriterion("pure_header_provision <>", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionGreaterThan(String value) {
            addCriterion("pure_header_provision >", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("pure_header_provision >=", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionLessThan(String value) {
            addCriterion("pure_header_provision <", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("pure_header_provision <=", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionLike(String value) {
            addCriterion("pure_header_provision like", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionNotLike(String value) {
            addCriterion("pure_header_provision not like", value, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionIn(List<String> values) {
            addCriterion("pure_header_provision in", values, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionNotIn(List<String> values) {
            addCriterion("pure_header_provision not in", values, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionBetween(String value1, String value2) {
            addCriterion("pure_header_provision between", value1, value2, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("pure_header_provision not between", value1, value2, "pureHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseIsNull() {
            addCriterion("pure_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseIsNotNull() {
            addCriterion("pure_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseEqualTo(String value) {
            addCriterion("pure_end_clause =", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseNotEqualTo(String value) {
            addCriterion("pure_end_clause <>", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseGreaterThan(String value) {
            addCriterion("pure_end_clause >", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("pure_end_clause >=", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseLessThan(String value) {
            addCriterion("pure_end_clause <", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseLessThanOrEqualTo(String value) {
            addCriterion("pure_end_clause <=", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseLike(String value) {
            addCriterion("pure_end_clause like", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseNotLike(String value) {
            addCriterion("pure_end_clause not like", value, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseIn(List<String> values) {
            addCriterion("pure_end_clause in", values, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseNotIn(List<String> values) {
            addCriterion("pure_end_clause not in", values, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseBetween(String value1, String value2) {
            addCriterion("pure_end_clause between", value1, value2, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureEndClauseNotBetween(String value1, String value2) {
            addCriterion("pure_end_clause not between", value1, value2, "pureEndClause");
            return (Criteria) this;
        }

        public Criteria andPureRemarkIsNull() {
            addCriterion("pure_remark is null");
            return (Criteria) this;
        }

        public Criteria andPureRemarkIsNotNull() {
            addCriterion("pure_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPureRemarkEqualTo(String value) {
            addCriterion("pure_remark =", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkNotEqualTo(String value) {
            addCriterion("pure_remark <>", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkGreaterThan(String value) {
            addCriterion("pure_remark >", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pure_remark >=", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkLessThan(String value) {
            addCriterion("pure_remark <", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkLessThanOrEqualTo(String value) {
            addCriterion("pure_remark <=", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkLike(String value) {
            addCriterion("pure_remark like", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkNotLike(String value) {
            addCriterion("pure_remark not like", value, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkIn(List<String> values) {
            addCriterion("pure_remark in", values, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkNotIn(List<String> values) {
            addCriterion("pure_remark not in", values, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkBetween(String value1, String value2) {
            addCriterion("pure_remark between", value1, value2, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureRemarkNotBetween(String value1, String value2) {
            addCriterion("pure_remark not between", value1, value2, "pureRemark");
            return (Criteria) this;
        }

        public Criteria andPureAuditionIsNull() {
            addCriterion("pure_audition is null");
            return (Criteria) this;
        }

        public Criteria andPureAuditionIsNotNull() {
            addCriterion("pure_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPureAuditionEqualTo(String value) {
            addCriterion("pure_audition =", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionNotEqualTo(String value) {
            addCriterion("pure_audition <>", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionGreaterThan(String value) {
            addCriterion("pure_audition >", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pure_audition >=", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionLessThan(String value) {
            addCriterion("pure_audition <", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionLessThanOrEqualTo(String value) {
            addCriterion("pure_audition <=", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionLike(String value) {
            addCriterion("pure_audition like", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionNotLike(String value) {
            addCriterion("pure_audition not like", value, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionIn(List<String> values) {
            addCriterion("pure_audition in", values, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionNotIn(List<String> values) {
            addCriterion("pure_audition not in", values, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionBetween(String value1, String value2) {
            addCriterion("pure_audition between", value1, value2, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureAuditionNotBetween(String value1, String value2) {
            addCriterion("pure_audition not between", value1, value2, "pureAudition");
            return (Criteria) this;
        }

        public Criteria andPureYnIsNull() {
            addCriterion("pure_yn is null");
            return (Criteria) this;
        }

        public Criteria andPureYnIsNotNull() {
            addCriterion("pure_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPureYnEqualTo(String value) {
            addCriterion("pure_yn =", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnNotEqualTo(String value) {
            addCriterion("pure_yn <>", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnGreaterThan(String value) {
            addCriterion("pure_yn >", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnGreaterThanOrEqualTo(String value) {
            addCriterion("pure_yn >=", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnLessThan(String value) {
            addCriterion("pure_yn <", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnLessThanOrEqualTo(String value) {
            addCriterion("pure_yn <=", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnLike(String value) {
            addCriterion("pure_yn like", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnNotLike(String value) {
            addCriterion("pure_yn not like", value, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnIn(List<String> values) {
            addCriterion("pure_yn in", values, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnNotIn(List<String> values) {
            addCriterion("pure_yn not in", values, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnBetween(String value1, String value2) {
            addCriterion("pure_yn between", value1, value2, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureYnNotBetween(String value1, String value2) {
            addCriterion("pure_yn not between", value1, value2, "pureYn");
            return (Criteria) this;
        }

        public Criteria andPureCustom1IsNull() {
            addCriterion("pure_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPureCustom1IsNotNull() {
            addCriterion("pure_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPureCustom1EqualTo(String value) {
            addCriterion("pure_custom1 =", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1NotEqualTo(String value) {
            addCriterion("pure_custom1 <>", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1GreaterThan(String value) {
            addCriterion("pure_custom1 >", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pure_custom1 >=", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1LessThan(String value) {
            addCriterion("pure_custom1 <", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1LessThanOrEqualTo(String value) {
            addCriterion("pure_custom1 <=", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1Like(String value) {
            addCriterion("pure_custom1 like", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1NotLike(String value) {
            addCriterion("pure_custom1 not like", value, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1In(List<String> values) {
            addCriterion("pure_custom1 in", values, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1NotIn(List<String> values) {
            addCriterion("pure_custom1 not in", values, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1Between(String value1, String value2) {
            addCriterion("pure_custom1 between", value1, value2, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom1NotBetween(String value1, String value2) {
            addCriterion("pure_custom1 not between", value1, value2, "pureCustom1");
            return (Criteria) this;
        }

        public Criteria andPureCustom2IsNull() {
            addCriterion("pure_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPureCustom2IsNotNull() {
            addCriterion("pure_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPureCustom2EqualTo(String value) {
            addCriterion("pure_custom2 =", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2NotEqualTo(String value) {
            addCriterion("pure_custom2 <>", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2GreaterThan(String value) {
            addCriterion("pure_custom2 >", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pure_custom2 >=", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2LessThan(String value) {
            addCriterion("pure_custom2 <", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2LessThanOrEqualTo(String value) {
            addCriterion("pure_custom2 <=", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2Like(String value) {
            addCriterion("pure_custom2 like", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2NotLike(String value) {
            addCriterion("pure_custom2 not like", value, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2In(List<String> values) {
            addCriterion("pure_custom2 in", values, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2NotIn(List<String> values) {
            addCriterion("pure_custom2 not in", values, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2Between(String value1, String value2) {
            addCriterion("pure_custom2 between", value1, value2, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom2NotBetween(String value1, String value2) {
            addCriterion("pure_custom2 not between", value1, value2, "pureCustom2");
            return (Criteria) this;
        }

        public Criteria andPureCustom3IsNull() {
            addCriterion("pure_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPureCustom3IsNotNull() {
            addCriterion("pure_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPureCustom3EqualTo(String value) {
            addCriterion("pure_custom3 =", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3NotEqualTo(String value) {
            addCriterion("pure_custom3 <>", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3GreaterThan(String value) {
            addCriterion("pure_custom3 >", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pure_custom3 >=", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3LessThan(String value) {
            addCriterion("pure_custom3 <", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3LessThanOrEqualTo(String value) {
            addCriterion("pure_custom3 <=", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3Like(String value) {
            addCriterion("pure_custom3 like", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3NotLike(String value) {
            addCriterion("pure_custom3 not like", value, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3In(List<String> values) {
            addCriterion("pure_custom3 in", values, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3NotIn(List<String> values) {
            addCriterion("pure_custom3 not in", values, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3Between(String value1, String value2) {
            addCriterion("pure_custom3 between", value1, value2, "pureCustom3");
            return (Criteria) this;
        }

        public Criteria andPureCustom3NotBetween(String value1, String value2) {
            addCriterion("pure_custom3 not between", value1, value2, "pureCustom3");
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