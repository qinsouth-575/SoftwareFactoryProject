package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleOutWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOutWarehouseExample() {
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

        public Criteria andSowIdIsNull() {
            addCriterion("sow_id is null");
            return (Criteria) this;
        }

        public Criteria andSowIdIsNotNull() {
            addCriterion("sow_id is not null");
            return (Criteria) this;
        }

        public Criteria andSowIdEqualTo(String value) {
            addCriterion("sow_id =", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotEqualTo(String value) {
            addCriterion("sow_id <>", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdGreaterThan(String value) {
            addCriterion("sow_id >", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdGreaterThanOrEqualTo(String value) {
            addCriterion("sow_id >=", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLessThan(String value) {
            addCriterion("sow_id <", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLessThanOrEqualTo(String value) {
            addCriterion("sow_id <=", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLike(String value) {
            addCriterion("sow_id like", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotLike(String value) {
            addCriterion("sow_id not like", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdIn(List<String> values) {
            addCriterion("sow_id in", values, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotIn(List<String> values) {
            addCriterion("sow_id not in", values, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdBetween(String value1, String value2) {
            addCriterion("sow_id between", value1, value2, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotBetween(String value1, String value2) {
            addCriterion("sow_id not between", value1, value2, "sowId");
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

        public Criteria andSowAddressIsNull() {
            addCriterion("sow_address is null");
            return (Criteria) this;
        }

        public Criteria andSowAddressIsNotNull() {
            addCriterion("sow_address is not null");
            return (Criteria) this;
        }

        public Criteria andSowAddressEqualTo(String value) {
            addCriterion("sow_address =", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressNotEqualTo(String value) {
            addCriterion("sow_address <>", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressGreaterThan(String value) {
            addCriterion("sow_address >", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sow_address >=", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressLessThan(String value) {
            addCriterion("sow_address <", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressLessThanOrEqualTo(String value) {
            addCriterion("sow_address <=", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressLike(String value) {
            addCriterion("sow_address like", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressNotLike(String value) {
            addCriterion("sow_address not like", value, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressIn(List<String> values) {
            addCriterion("sow_address in", values, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressNotIn(List<String> values) {
            addCriterion("sow_address not in", values, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressBetween(String value1, String value2) {
            addCriterion("sow_address between", value1, value2, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowAddressNotBetween(String value1, String value2) {
            addCriterion("sow_address not between", value1, value2, "sowAddress");
            return (Criteria) this;
        }

        public Criteria andSowtIdIsNull() {
            addCriterion("sowt_id is null");
            return (Criteria) this;
        }

        public Criteria andSowtIdIsNotNull() {
            addCriterion("sowt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSowtIdEqualTo(String value) {
            addCriterion("sowt_id =", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotEqualTo(String value) {
            addCriterion("sowt_id <>", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdGreaterThan(String value) {
            addCriterion("sowt_id >", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdGreaterThanOrEqualTo(String value) {
            addCriterion("sowt_id >=", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLessThan(String value) {
            addCriterion("sowt_id <", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLessThanOrEqualTo(String value) {
            addCriterion("sowt_id <=", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdLike(String value) {
            addCriterion("sowt_id like", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotLike(String value) {
            addCriterion("sowt_id not like", value, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdIn(List<String> values) {
            addCriterion("sowt_id in", values, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotIn(List<String> values) {
            addCriterion("sowt_id not in", values, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdBetween(String value1, String value2) {
            addCriterion("sowt_id between", value1, value2, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowtIdNotBetween(String value1, String value2) {
            addCriterion("sowt_id not between", value1, value2, "sowtId");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxIsNull() {
            addCriterion("sow_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxIsNotNull() {
            addCriterion("sow_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxEqualTo(String value) {
            addCriterion("sow_price_include_tax =", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("sow_price_include_tax <>", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxGreaterThan(String value) {
            addCriterion("sow_price_include_tax >", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("sow_price_include_tax >=", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxLessThan(String value) {
            addCriterion("sow_price_include_tax <", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("sow_price_include_tax <=", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxLike(String value) {
            addCriterion("sow_price_include_tax like", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxNotLike(String value) {
            addCriterion("sow_price_include_tax not like", value, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxIn(List<String> values) {
            addCriterion("sow_price_include_tax in", values, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("sow_price_include_tax not in", values, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("sow_price_include_tax between", value1, value2, "sowPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("sow_price_include_tax not between", value1, value2, "sowPriceIncludeTax");
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

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberIsNull() {
            addCriterion("sow_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberIsNotNull() {
            addCriterion("sow_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberEqualTo(String value) {
            addCriterion("sow_certificate_number =", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberNotEqualTo(String value) {
            addCriterion("sow_certificate_number <>", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberGreaterThan(String value) {
            addCriterion("sow_certificate_number >", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sow_certificate_number >=", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberLessThan(String value) {
            addCriterion("sow_certificate_number <", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("sow_certificate_number <=", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberLike(String value) {
            addCriterion("sow_certificate_number like", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberNotLike(String value) {
            addCriterion("sow_certificate_number not like", value, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberIn(List<String> values) {
            addCriterion("sow_certificate_number in", values, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberNotIn(List<String> values) {
            addCriterion("sow_certificate_number not in", values, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberBetween(String value1, String value2) {
            addCriterion("sow_certificate_number between", value1, value2, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("sow_certificate_number not between", value1, value2, "sowCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateIsNull() {
            addCriterion("sow_document_date is null");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateIsNotNull() {
            addCriterion("sow_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("sow_document_date =", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sow_document_date <>", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sow_document_date >", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_document_date >=", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("sow_document_date <", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_document_date <=", value, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("sow_document_date in", values, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sow_document_date not in", values, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_document_date between", value1, value2, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_document_date not between", value1, value2, "sowDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberIsNull() {
            addCriterion("sow_document_number is null");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberIsNotNull() {
            addCriterion("sow_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberEqualTo(String value) {
            addCriterion("sow_document_number =", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberNotEqualTo(String value) {
            addCriterion("sow_document_number <>", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberGreaterThan(String value) {
            addCriterion("sow_document_number >", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sow_document_number >=", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberLessThan(String value) {
            addCriterion("sow_document_number <", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("sow_document_number <=", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberLike(String value) {
            addCriterion("sow_document_number like", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberNotLike(String value) {
            addCriterion("sow_document_number not like", value, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberIn(List<String> values) {
            addCriterion("sow_document_number in", values, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberNotIn(List<String> values) {
            addCriterion("sow_document_number not in", values, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberBetween(String value1, String value2) {
            addCriterion("sow_document_number between", value1, value2, "sowDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("sow_document_number not between", value1, value2, "sowDocumentNumber");
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

        public Criteria andSowExchangeRateIsNull() {
            addCriterion("sow_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateIsNotNull() {
            addCriterion("sow_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateEqualTo(Float value) {
            addCriterion("sow_exchange_rate =", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateNotEqualTo(Float value) {
            addCriterion("sow_exchange_rate <>", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateGreaterThan(Float value) {
            addCriterion("sow_exchange_rate >", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sow_exchange_rate >=", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateLessThan(Float value) {
            addCriterion("sow_exchange_rate <", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("sow_exchange_rate <=", value, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateIn(List<Float> values) {
            addCriterion("sow_exchange_rate in", values, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateNotIn(List<Float> values) {
            addCriterion("sow_exchange_rate not in", values, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateBetween(Float value1, Float value2) {
            addCriterion("sow_exchange_rate between", value1, value2, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("sow_exchange_rate not between", value1, value2, "sowExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeIsNull() {
            addCriterion("sow_foreign_trade is null");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeIsNotNull() {
            addCriterion("sow_foreign_trade is not null");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeEqualTo(String value) {
            addCriterion("sow_foreign_trade =", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeNotEqualTo(String value) {
            addCriterion("sow_foreign_trade <>", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeGreaterThan(String value) {
            addCriterion("sow_foreign_trade >", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeGreaterThanOrEqualTo(String value) {
            addCriterion("sow_foreign_trade >=", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeLessThan(String value) {
            addCriterion("sow_foreign_trade <", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeLessThanOrEqualTo(String value) {
            addCriterion("sow_foreign_trade <=", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeLike(String value) {
            addCriterion("sow_foreign_trade like", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeNotLike(String value) {
            addCriterion("sow_foreign_trade not like", value, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeIn(List<String> values) {
            addCriterion("sow_foreign_trade in", values, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeNotIn(List<String> values) {
            addCriterion("sow_foreign_trade not in", values, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeBetween(String value1, String value2) {
            addCriterion("sow_foreign_trade between", value1, value2, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowForeignTradeNotBetween(String value1, String value2) {
            addCriterion("sow_foreign_trade not between", value1, value2, "sowForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSowSunnumIsNull() {
            addCriterion("sow_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andSowSunnumIsNotNull() {
            addCriterion("sow_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andSowSunnumEqualTo(Integer value) {
            addCriterion("sow_sunnum =", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumNotEqualTo(Integer value) {
            addCriterion("sow_sunnum <>", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumGreaterThan(Integer value) {
            addCriterion("sow_sunnum >", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sow_sunnum >=", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumLessThan(Integer value) {
            addCriterion("sow_sunnum <", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("sow_sunnum <=", value, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumIn(List<Integer> values) {
            addCriterion("sow_sunnum in", values, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumNotIn(List<Integer> values) {
            addCriterion("sow_sunnum not in", values, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumBetween(Integer value1, Integer value2) {
            addCriterion("sow_sunnum between", value1, value2, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sow_sunnum not between", value1, value2, "sowSunnum");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyIsNull() {
            addCriterion("sow_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyIsNotNull() {
            addCriterion("sow_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyEqualTo(Float value) {
            addCriterion("sow_sunmoney =", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyNotEqualTo(Float value) {
            addCriterion("sow_sunmoney <>", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyGreaterThan(Float value) {
            addCriterion("sow_sunmoney >", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("sow_sunmoney >=", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyLessThan(Float value) {
            addCriterion("sow_sunmoney <", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("sow_sunmoney <=", value, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyIn(List<Float> values) {
            addCriterion("sow_sunmoney in", values, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyNotIn(List<Float> values) {
            addCriterion("sow_sunmoney not in", values, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyBetween(Float value1, Float value2) {
            addCriterion("sow_sunmoney between", value1, value2, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("sow_sunmoney not between", value1, value2, "sowSunmoney");
            return (Criteria) this;
        }

        public Criteria andSowTaxIsNull() {
            addCriterion("sow_tax is null");
            return (Criteria) this;
        }

        public Criteria andSowTaxIsNotNull() {
            addCriterion("sow_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSowTaxEqualTo(Float value) {
            addCriterion("sow_tax =", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxNotEqualTo(Float value) {
            addCriterion("sow_tax <>", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxGreaterThan(Float value) {
            addCriterion("sow_tax >", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("sow_tax >=", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxLessThan(Float value) {
            addCriterion("sow_tax <", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxLessThanOrEqualTo(Float value) {
            addCriterion("sow_tax <=", value, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxIn(List<Float> values) {
            addCriterion("sow_tax in", values, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxNotIn(List<Float> values) {
            addCriterion("sow_tax not in", values, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxBetween(Float value1, Float value2) {
            addCriterion("sow_tax between", value1, value2, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowTaxNotBetween(Float value1, Float value2) {
            addCriterion("sow_tax not between", value1, value2, "sowTax");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountIsNull() {
            addCriterion("sow_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountIsNotNull() {
            addCriterion("sow_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountEqualTo(Float value) {
            addCriterion("sow_including_tax_amount =", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("sow_including_tax_amount <>", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("sow_including_tax_amount >", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sow_including_tax_amount >=", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountLessThan(Float value) {
            addCriterion("sow_including_tax_amount <", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("sow_including_tax_amount <=", value, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountIn(List<Float> values) {
            addCriterion("sow_including_tax_amount in", values, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("sow_including_tax_amount not in", values, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("sow_including_tax_amount between", value1, value2, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("sow_including_tax_amount not between", value1, value2, "sowIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsIsNull() {
            addCriterion("sow_saleszkgs is null");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsIsNotNull() {
            addCriterion("sow_saleszkgs is not null");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsEqualTo(String value) {
            addCriterion("sow_saleszkgs =", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsNotEqualTo(String value) {
            addCriterion("sow_saleszkgs <>", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsGreaterThan(String value) {
            addCriterion("sow_saleszkgs >", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsGreaterThanOrEqualTo(String value) {
            addCriterion("sow_saleszkgs >=", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsLessThan(String value) {
            addCriterion("sow_saleszkgs <", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsLessThanOrEqualTo(String value) {
            addCriterion("sow_saleszkgs <=", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsLike(String value) {
            addCriterion("sow_saleszkgs like", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsNotLike(String value) {
            addCriterion("sow_saleszkgs not like", value, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsIn(List<String> values) {
            addCriterion("sow_saleszkgs in", values, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsNotIn(List<String> values) {
            addCriterion("sow_saleszkgs not in", values, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsBetween(String value1, String value2) {
            addCriterion("sow_saleszkgs between", value1, value2, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSaleszkgsNotBetween(String value1, String value2) {
            addCriterion("sow_saleszkgs not between", value1, value2, "sowSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateIsNull() {
            addCriterion("sow_salesdate is null");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateIsNotNull() {
            addCriterion("sow_salesdate is not null");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesdate =", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesdate <>", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sow_salesdate >", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesdate >=", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateLessThan(Date value) {
            addCriterionForJDBCDate("sow_salesdate <", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesdate <=", value, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateIn(List<Date> values) {
            addCriterionForJDBCDate("sow_salesdate in", values, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sow_salesdate not in", values, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_salesdate between", value1, value2, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalesdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_salesdate not between", value1, value2, "sowSalesdate");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjIsNull() {
            addCriterion("sow_salessktj is null");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjIsNotNull() {
            addCriterion("sow_salessktj is not null");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjEqualTo(String value) {
            addCriterion("sow_salessktj =", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjNotEqualTo(String value) {
            addCriterion("sow_salessktj <>", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjGreaterThan(String value) {
            addCriterion("sow_salessktj >", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjGreaterThanOrEqualTo(String value) {
            addCriterion("sow_salessktj >=", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjLessThan(String value) {
            addCriterion("sow_salessktj <", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjLessThanOrEqualTo(String value) {
            addCriterion("sow_salessktj <=", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjLike(String value) {
            addCriterion("sow_salessktj like", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjNotLike(String value) {
            addCriterion("sow_salessktj not like", value, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjIn(List<String> values) {
            addCriterion("sow_salessktj in", values, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjNotIn(List<String> values) {
            addCriterion("sow_salessktj not in", values, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjBetween(String value1, String value2) {
            addCriterion("sow_salessktj between", value1, value2, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalessktjNotBetween(String value1, String value2) {
            addCriterion("sow_salessktj not between", value1, value2, "sowSalessktj");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayIsNull() {
            addCriterion("sow_salesday is null");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayIsNotNull() {
            addCriterion("sow_salesday is not null");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayEqualTo(Integer value) {
            addCriterion("sow_salesday =", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayNotEqualTo(Integer value) {
            addCriterion("sow_salesday <>", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayGreaterThan(Integer value) {
            addCriterion("sow_salesday >", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sow_salesday >=", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayLessThan(Integer value) {
            addCriterion("sow_salesday <", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayLessThanOrEqualTo(Integer value) {
            addCriterion("sow_salesday <=", value, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayIn(List<Integer> values) {
            addCriterion("sow_salesday in", values, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayNotIn(List<Integer> values) {
            addCriterion("sow_salesday not in", values, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayBetween(Integer value1, Integer value2) {
            addCriterion("sow_salesday between", value1, value2, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesdayNotBetween(Integer value1, Integer value2) {
            addCriterion("sow_salesday not between", value1, value2, "sowSalesday");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueIsNull() {
            addCriterion("sow_salesyue is null");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueIsNotNull() {
            addCriterion("sow_salesyue is not null");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesyue =", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueNotEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesyue <>", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueGreaterThan(Date value) {
            addCriterionForJDBCDate("sow_salesyue >", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesyue >=", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueLessThan(Date value) {
            addCriterionForJDBCDate("sow_salesyue <", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sow_salesyue <=", value, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueIn(List<Date> values) {
            addCriterionForJDBCDate("sow_salesyue in", values, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueNotIn(List<Date> values) {
            addCriterionForJDBCDate("sow_salesyue not in", values, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_salesyue between", value1, value2, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowSalesyueNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sow_salesyue not between", value1, value2, "sowSalesyue");
            return (Criteria) this;
        }

        public Criteria andSowBuyerIsNull() {
            addCriterion("sow_buyer is null");
            return (Criteria) this;
        }

        public Criteria andSowBuyerIsNotNull() {
            addCriterion("sow_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andSowBuyerEqualTo(String value) {
            addCriterion("sow_buyer =", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerNotEqualTo(String value) {
            addCriterion("sow_buyer <>", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerGreaterThan(String value) {
            addCriterion("sow_buyer >", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("sow_buyer >=", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerLessThan(String value) {
            addCriterion("sow_buyer <", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerLessThanOrEqualTo(String value) {
            addCriterion("sow_buyer <=", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerLike(String value) {
            addCriterion("sow_buyer like", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerNotLike(String value) {
            addCriterion("sow_buyer not like", value, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerIn(List<String> values) {
            addCriterion("sow_buyer in", values, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerNotIn(List<String> values) {
            addCriterion("sow_buyer not in", values, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerBetween(String value1, String value2) {
            addCriterion("sow_buyer between", value1, value2, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBuyerNotBetween(String value1, String value2) {
            addCriterion("sow_buyer not between", value1, value2, "sowBuyer");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionIsNull() {
            addCriterion("sow_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionIsNotNull() {
            addCriterion("sow_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionEqualTo(String value) {
            addCriterion("sow_belongs_section =", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionNotEqualTo(String value) {
            addCriterion("sow_belongs_section <>", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionGreaterThan(String value) {
            addCriterion("sow_belongs_section >", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("sow_belongs_section >=", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionLessThan(String value) {
            addCriterion("sow_belongs_section <", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("sow_belongs_section <=", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionLike(String value) {
            addCriterion("sow_belongs_section like", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionNotLike(String value) {
            addCriterion("sow_belongs_section not like", value, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionIn(List<String> values) {
            addCriterion("sow_belongs_section in", values, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionNotIn(List<String> values) {
            addCriterion("sow_belongs_section not in", values, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionBetween(String value1, String value2) {
            addCriterion("sow_belongs_section between", value1, value2, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("sow_belongs_section not between", value1, value2, "sowBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectIsNull() {
            addCriterion("sow_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectIsNotNull() {
            addCriterion("sow_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectEqualTo(String value) {
            addCriterion("sow_belongs_project =", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectNotEqualTo(String value) {
            addCriterion("sow_belongs_project <>", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectGreaterThan(String value) {
            addCriterion("sow_belongs_project >", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("sow_belongs_project >=", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectLessThan(String value) {
            addCriterion("sow_belongs_project <", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("sow_belongs_project <=", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectLike(String value) {
            addCriterion("sow_belongs_project like", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectNotLike(String value) {
            addCriterion("sow_belongs_project not like", value, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectIn(List<String> values) {
            addCriterion("sow_belongs_project in", values, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectNotIn(List<String> values) {
            addCriterion("sow_belongs_project not in", values, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectBetween(String value1, String value2) {
            addCriterion("sow_belongs_project between", value1, value2, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("sow_belongs_project not between", value1, value2, "sowBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSowFormIsNull() {
            addCriterion("sow_form is null");
            return (Criteria) this;
        }

        public Criteria andSowFormIsNotNull() {
            addCriterion("sow_form is not null");
            return (Criteria) this;
        }

        public Criteria andSowFormEqualTo(String value) {
            addCriterion("sow_form =", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormNotEqualTo(String value) {
            addCriterion("sow_form <>", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormGreaterThan(String value) {
            addCriterion("sow_form >", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormGreaterThanOrEqualTo(String value) {
            addCriterion("sow_form >=", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormLessThan(String value) {
            addCriterion("sow_form <", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormLessThanOrEqualTo(String value) {
            addCriterion("sow_form <=", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormLike(String value) {
            addCriterion("sow_form like", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormNotLike(String value) {
            addCriterion("sow_form not like", value, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormIn(List<String> values) {
            addCriterion("sow_form in", values, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormNotIn(List<String> values) {
            addCriterion("sow_form not in", values, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormBetween(String value1, String value2) {
            addCriterion("sow_form between", value1, value2, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowFormNotBetween(String value1, String value2) {
            addCriterion("sow_form not between", value1, value2, "sowForm");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffIsNull() {
            addCriterion("sow_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffIsNotNull() {
            addCriterion("sow_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffEqualTo(String value) {
            addCriterion("sow_checkagain_staff =", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffNotEqualTo(String value) {
            addCriterion("sow_checkagain_staff <>", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffGreaterThan(String value) {
            addCriterion("sow_checkagain_staff >", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("sow_checkagain_staff >=", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffLessThan(String value) {
            addCriterion("sow_checkagain_staff <", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("sow_checkagain_staff <=", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffLike(String value) {
            addCriterion("sow_checkagain_staff like", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffNotLike(String value) {
            addCriterion("sow_checkagain_staff not like", value, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffIn(List<String> values) {
            addCriterion("sow_checkagain_staff in", values, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffNotIn(List<String> values) {
            addCriterion("sow_checkagain_staff not in", values, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffBetween(String value1, String value2) {
            addCriterion("sow_checkagain_staff between", value1, value2, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("sow_checkagain_staff not between", value1, value2, "sowCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSowProjectIsNull() {
            addCriterion("sow_project is null");
            return (Criteria) this;
        }

        public Criteria andSowProjectIsNotNull() {
            addCriterion("sow_project is not null");
            return (Criteria) this;
        }

        public Criteria andSowProjectEqualTo(String value) {
            addCriterion("sow_project =", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectNotEqualTo(String value) {
            addCriterion("sow_project <>", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectGreaterThan(String value) {
            addCriterion("sow_project >", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectGreaterThanOrEqualTo(String value) {
            addCriterion("sow_project >=", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectLessThan(String value) {
            addCriterion("sow_project <", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectLessThanOrEqualTo(String value) {
            addCriterion("sow_project <=", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectLike(String value) {
            addCriterion("sow_project like", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectNotLike(String value) {
            addCriterion("sow_project not like", value, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectIn(List<String> values) {
            addCriterion("sow_project in", values, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectNotIn(List<String> values) {
            addCriterion("sow_project not in", values, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectBetween(String value1, String value2) {
            addCriterion("sow_project between", value1, value2, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowProjectNotBetween(String value1, String value2) {
            addCriterion("sow_project not between", value1, value2, "sowProject");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionIsNull() {
            addCriterion("sow_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionIsNotNull() {
            addCriterion("sow_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionEqualTo(String value) {
            addCriterion("sow_header_provision =", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionNotEqualTo(String value) {
            addCriterion("sow_header_provision <>", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionGreaterThan(String value) {
            addCriterion("sow_header_provision >", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("sow_header_provision >=", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionLessThan(String value) {
            addCriterion("sow_header_provision <", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("sow_header_provision <=", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionLike(String value) {
            addCriterion("sow_header_provision like", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionNotLike(String value) {
            addCriterion("sow_header_provision not like", value, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionIn(List<String> values) {
            addCriterion("sow_header_provision in", values, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionNotIn(List<String> values) {
            addCriterion("sow_header_provision not in", values, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionBetween(String value1, String value2) {
            addCriterion("sow_header_provision between", value1, value2, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("sow_header_provision not between", value1, value2, "sowHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseIsNull() {
            addCriterion("sow_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseIsNotNull() {
            addCriterion("sow_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseEqualTo(String value) {
            addCriterion("sow_end_clause =", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseNotEqualTo(String value) {
            addCriterion("sow_end_clause <>", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseGreaterThan(String value) {
            addCriterion("sow_end_clause >", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("sow_end_clause >=", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseLessThan(String value) {
            addCriterion("sow_end_clause <", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseLessThanOrEqualTo(String value) {
            addCriterion("sow_end_clause <=", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseLike(String value) {
            addCriterion("sow_end_clause like", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseNotLike(String value) {
            addCriterion("sow_end_clause not like", value, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseIn(List<String> values) {
            addCriterion("sow_end_clause in", values, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseNotIn(List<String> values) {
            addCriterion("sow_end_clause not in", values, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseBetween(String value1, String value2) {
            addCriterion("sow_end_clause between", value1, value2, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowEndClauseNotBetween(String value1, String value2) {
            addCriterion("sow_end_clause not between", value1, value2, "sowEndClause");
            return (Criteria) this;
        }

        public Criteria andSowRemarkIsNull() {
            addCriterion("sow_remark is null");
            return (Criteria) this;
        }

        public Criteria andSowRemarkIsNotNull() {
            addCriterion("sow_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSowRemarkEqualTo(String value) {
            addCriterion("sow_remark =", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkNotEqualTo(String value) {
            addCriterion("sow_remark <>", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkGreaterThan(String value) {
            addCriterion("sow_remark >", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sow_remark >=", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkLessThan(String value) {
            addCriterion("sow_remark <", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkLessThanOrEqualTo(String value) {
            addCriterion("sow_remark <=", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkLike(String value) {
            addCriterion("sow_remark like", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkNotLike(String value) {
            addCriterion("sow_remark not like", value, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkIn(List<String> values) {
            addCriterion("sow_remark in", values, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkNotIn(List<String> values) {
            addCriterion("sow_remark not in", values, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkBetween(String value1, String value2) {
            addCriterion("sow_remark between", value1, value2, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowRemarkNotBetween(String value1, String value2) {
            addCriterion("sow_remark not between", value1, value2, "sowRemark");
            return (Criteria) this;
        }

        public Criteria andSowAuditingIsNull() {
            addCriterion("sow_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSowAuditingIsNotNull() {
            addCriterion("sow_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSowAuditingEqualTo(String value) {
            addCriterion("sow_auditing =", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingNotEqualTo(String value) {
            addCriterion("sow_auditing <>", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingGreaterThan(String value) {
            addCriterion("sow_auditing >", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sow_auditing >=", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingLessThan(String value) {
            addCriterion("sow_auditing <", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingLessThanOrEqualTo(String value) {
            addCriterion("sow_auditing <=", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingLike(String value) {
            addCriterion("sow_auditing like", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingNotLike(String value) {
            addCriterion("sow_auditing not like", value, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingIn(List<String> values) {
            addCriterion("sow_auditing in", values, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingNotIn(List<String> values) {
            addCriterion("sow_auditing not in", values, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingBetween(String value1, String value2) {
            addCriterion("sow_auditing between", value1, value2, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowAuditingNotBetween(String value1, String value2) {
            addCriterion("sow_auditing not between", value1, value2, "sowAuditing");
            return (Criteria) this;
        }

        public Criteria andSowYnIsNull() {
            addCriterion("sow_yn is null");
            return (Criteria) this;
        }

        public Criteria andSowYnIsNotNull() {
            addCriterion("sow_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSowYnEqualTo(String value) {
            addCriterion("sow_yn =", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnNotEqualTo(String value) {
            addCriterion("sow_yn <>", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnGreaterThan(String value) {
            addCriterion("sow_yn >", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnGreaterThanOrEqualTo(String value) {
            addCriterion("sow_yn >=", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnLessThan(String value) {
            addCriterion("sow_yn <", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnLessThanOrEqualTo(String value) {
            addCriterion("sow_yn <=", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnLike(String value) {
            addCriterion("sow_yn like", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnNotLike(String value) {
            addCriterion("sow_yn not like", value, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnIn(List<String> values) {
            addCriterion("sow_yn in", values, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnNotIn(List<String> values) {
            addCriterion("sow_yn not in", values, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnBetween(String value1, String value2) {
            addCriterion("sow_yn between", value1, value2, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowYnNotBetween(String value1, String value2) {
            addCriterion("sow_yn not between", value1, value2, "sowYn");
            return (Criteria) this;
        }

        public Criteria andSowCustom1IsNull() {
            addCriterion("sow_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSowCustom1IsNotNull() {
            addCriterion("sow_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSowCustom1EqualTo(String value) {
            addCriterion("sow_custom1 =", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1NotEqualTo(String value) {
            addCriterion("sow_custom1 <>", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1GreaterThan(String value) {
            addCriterion("sow_custom1 >", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sow_custom1 >=", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1LessThan(String value) {
            addCriterion("sow_custom1 <", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1LessThanOrEqualTo(String value) {
            addCriterion("sow_custom1 <=", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1Like(String value) {
            addCriterion("sow_custom1 like", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1NotLike(String value) {
            addCriterion("sow_custom1 not like", value, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1In(List<String> values) {
            addCriterion("sow_custom1 in", values, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1NotIn(List<String> values) {
            addCriterion("sow_custom1 not in", values, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1Between(String value1, String value2) {
            addCriterion("sow_custom1 between", value1, value2, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom1NotBetween(String value1, String value2) {
            addCriterion("sow_custom1 not between", value1, value2, "sowCustom1");
            return (Criteria) this;
        }

        public Criteria andSowCustom2IsNull() {
            addCriterion("sow_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSowCustom2IsNotNull() {
            addCriterion("sow_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSowCustom2EqualTo(String value) {
            addCriterion("sow_custom2 =", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2NotEqualTo(String value) {
            addCriterion("sow_custom2 <>", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2GreaterThan(String value) {
            addCriterion("sow_custom2 >", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sow_custom2 >=", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2LessThan(String value) {
            addCriterion("sow_custom2 <", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2LessThanOrEqualTo(String value) {
            addCriterion("sow_custom2 <=", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2Like(String value) {
            addCriterion("sow_custom2 like", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2NotLike(String value) {
            addCriterion("sow_custom2 not like", value, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2In(List<String> values) {
            addCriterion("sow_custom2 in", values, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2NotIn(List<String> values) {
            addCriterion("sow_custom2 not in", values, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2Between(String value1, String value2) {
            addCriterion("sow_custom2 between", value1, value2, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom2NotBetween(String value1, String value2) {
            addCriterion("sow_custom2 not between", value1, value2, "sowCustom2");
            return (Criteria) this;
        }

        public Criteria andSowCustom3IsNull() {
            addCriterion("sow_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSowCustom3IsNotNull() {
            addCriterion("sow_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSowCustom3EqualTo(String value) {
            addCriterion("sow_custom3 =", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3NotEqualTo(String value) {
            addCriterion("sow_custom3 <>", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3GreaterThan(String value) {
            addCriterion("sow_custom3 >", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sow_custom3 >=", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3LessThan(String value) {
            addCriterion("sow_custom3 <", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3LessThanOrEqualTo(String value) {
            addCriterion("sow_custom3 <=", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3Like(String value) {
            addCriterion("sow_custom3 like", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3NotLike(String value) {
            addCriterion("sow_custom3 not like", value, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3In(List<String> values) {
            addCriterion("sow_custom3 in", values, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3NotIn(List<String> values) {
            addCriterion("sow_custom3 not in", values, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3Between(String value1, String value2) {
            addCriterion("sow_custom3 between", value1, value2, "sowCustom3");
            return (Criteria) this;
        }

        public Criteria andSowCustom3NotBetween(String value1, String value2) {
            addCriterion("sow_custom3 not between", value1, value2, "sowCustom3");
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