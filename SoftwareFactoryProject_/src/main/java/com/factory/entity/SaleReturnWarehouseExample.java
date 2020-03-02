package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleReturnWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleReturnWarehouseExample() {
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

        public Criteria andSrwIdIsNull() {
            addCriterion("srw_id is null");
            return (Criteria) this;
        }

        public Criteria andSrwIdIsNotNull() {
            addCriterion("srw_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrwIdEqualTo(Integer value) {
            addCriterion("srw_id =", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotEqualTo(Integer value) {
            addCriterion("srw_id <>", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdGreaterThan(Integer value) {
            addCriterion("srw_id >", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srw_id >=", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdLessThan(Integer value) {
            addCriterion("srw_id <", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdLessThanOrEqualTo(Integer value) {
            addCriterion("srw_id <=", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdIn(List<Integer> values) {
            addCriterion("srw_id in", values, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotIn(List<Integer> values) {
            addCriterion("srw_id not in", values, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdBetween(Integer value1, Integer value2) {
            addCriterion("srw_id between", value1, value2, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srw_id not between", value1, value2, "srwId");
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

        public Criteria andSrwAddressIsNull() {
            addCriterion("srw_address is null");
            return (Criteria) this;
        }

        public Criteria andSrwAddressIsNotNull() {
            addCriterion("srw_address is not null");
            return (Criteria) this;
        }

        public Criteria andSrwAddressEqualTo(String value) {
            addCriterion("srw_address =", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressNotEqualTo(String value) {
            addCriterion("srw_address <>", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressGreaterThan(String value) {
            addCriterion("srw_address >", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressGreaterThanOrEqualTo(String value) {
            addCriterion("srw_address >=", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressLessThan(String value) {
            addCriterion("srw_address <", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressLessThanOrEqualTo(String value) {
            addCriterion("srw_address <=", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressLike(String value) {
            addCriterion("srw_address like", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressNotLike(String value) {
            addCriterion("srw_address not like", value, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressIn(List<String> values) {
            addCriterion("srw_address in", values, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressNotIn(List<String> values) {
            addCriterion("srw_address not in", values, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressBetween(String value1, String value2) {
            addCriterion("srw_address between", value1, value2, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwAddressNotBetween(String value1, String value2) {
            addCriterion("srw_address not between", value1, value2, "srwAddress");
            return (Criteria) this;
        }

        public Criteria andSrwtIdIsNull() {
            addCriterion("srwt_id is null");
            return (Criteria) this;
        }

        public Criteria andSrwtIdIsNotNull() {
            addCriterion("srwt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrwtIdEqualTo(String value) {
            addCriterion("srwt_id =", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdNotEqualTo(String value) {
            addCriterion("srwt_id <>", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdGreaterThan(String value) {
            addCriterion("srwt_id >", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdGreaterThanOrEqualTo(String value) {
            addCriterion("srwt_id >=", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdLessThan(String value) {
            addCriterion("srwt_id <", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdLessThanOrEqualTo(String value) {
            addCriterion("srwt_id <=", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdLike(String value) {
            addCriterion("srwt_id like", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdNotLike(String value) {
            addCriterion("srwt_id not like", value, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdIn(List<String> values) {
            addCriterion("srwt_id in", values, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdNotIn(List<String> values) {
            addCriterion("srwt_id not in", values, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdBetween(String value1, String value2) {
            addCriterion("srwt_id between", value1, value2, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwtIdNotBetween(String value1, String value2) {
            addCriterion("srwt_id not between", value1, value2, "srwtId");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxIsNull() {
            addCriterion("srw_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxIsNotNull() {
            addCriterion("srw_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxEqualTo(String value) {
            addCriterion("srw_price_include_tax =", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("srw_price_include_tax <>", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxGreaterThan(String value) {
            addCriterion("srw_price_include_tax >", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("srw_price_include_tax >=", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxLessThan(String value) {
            addCriterion("srw_price_include_tax <", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("srw_price_include_tax <=", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxLike(String value) {
            addCriterion("srw_price_include_tax like", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxNotLike(String value) {
            addCriterion("srw_price_include_tax not like", value, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxIn(List<String> values) {
            addCriterion("srw_price_include_tax in", values, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("srw_price_include_tax not in", values, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("srw_price_include_tax between", value1, value2, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("srw_price_include_tax not between", value1, value2, "srwPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSalescxrkIsNull() {
            addCriterion("salescxrk is null");
            return (Criteria) this;
        }

        public Criteria andSalescxrkIsNotNull() {
            addCriterion("salescxrk is not null");
            return (Criteria) this;
        }

        public Criteria andSalescxrkEqualTo(Integer value) {
            addCriterion("salescxrk =", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkNotEqualTo(Integer value) {
            addCriterion("salescxrk <>", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkGreaterThan(Integer value) {
            addCriterion("salescxrk >", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkGreaterThanOrEqualTo(Integer value) {
            addCriterion("salescxrk >=", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkLessThan(Integer value) {
            addCriterion("salescxrk <", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkLessThanOrEqualTo(Integer value) {
            addCriterion("salescxrk <=", value, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkIn(List<Integer> values) {
            addCriterion("salescxrk in", values, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkNotIn(List<Integer> values) {
            addCriterion("salescxrk not in", values, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkBetween(Integer value1, Integer value2) {
            addCriterion("salescxrk between", value1, value2, "salescxrk");
            return (Criteria) this;
        }

        public Criteria andSalescxrkNotBetween(Integer value1, Integer value2) {
            addCriterion("salescxrk not between", value1, value2, "salescxrk");
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

        public Criteria andSrwCertificateNumberIsNull() {
            addCriterion("srw_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberIsNotNull() {
            addCriterion("srw_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberEqualTo(String value) {
            addCriterion("srw_certificate_number =", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberNotEqualTo(String value) {
            addCriterion("srw_certificate_number <>", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberGreaterThan(String value) {
            addCriterion("srw_certificate_number >", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("srw_certificate_number >=", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberLessThan(String value) {
            addCriterion("srw_certificate_number <", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("srw_certificate_number <=", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberLike(String value) {
            addCriterion("srw_certificate_number like", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberNotLike(String value) {
            addCriterion("srw_certificate_number not like", value, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberIn(List<String> values) {
            addCriterion("srw_certificate_number in", values, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberNotIn(List<String> values) {
            addCriterion("srw_certificate_number not in", values, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberBetween(String value1, String value2) {
            addCriterion("srw_certificate_number between", value1, value2, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("srw_certificate_number not between", value1, value2, "srwCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateIsNull() {
            addCriterion("srw_document_date is null");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateIsNotNull() {
            addCriterion("srw_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("srw_document_date =", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("srw_document_date <>", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("srw_document_date >", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_document_date >=", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("srw_document_date <", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_document_date <=", value, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("srw_document_date in", values, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("srw_document_date not in", values, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_document_date between", value1, value2, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_document_date not between", value1, value2, "srwDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberIsNull() {
            addCriterion("srw_document_number is null");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberIsNotNull() {
            addCriterion("srw_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberEqualTo(String value) {
            addCriterion("srw_document_number =", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberNotEqualTo(String value) {
            addCriterion("srw_document_number <>", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberGreaterThan(String value) {
            addCriterion("srw_document_number >", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("srw_document_number >=", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberLessThan(String value) {
            addCriterion("srw_document_number <", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("srw_document_number <=", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberLike(String value) {
            addCriterion("srw_document_number like", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberNotLike(String value) {
            addCriterion("srw_document_number not like", value, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberIn(List<String> values) {
            addCriterion("srw_document_number in", values, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberNotIn(List<String> values) {
            addCriterion("srw_document_number not in", values, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberBetween(String value1, String value2) {
            addCriterion("srw_document_number between", value1, value2, "srwDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("srw_document_number not between", value1, value2, "srwDocumentNumber");
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

        public Criteria andSrwExchangeRateIsNull() {
            addCriterion("srw_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateIsNotNull() {
            addCriterion("srw_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateEqualTo(Float value) {
            addCriterion("srw_exchange_rate =", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateNotEqualTo(Float value) {
            addCriterion("srw_exchange_rate <>", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateGreaterThan(Float value) {
            addCriterion("srw_exchange_rate >", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("srw_exchange_rate >=", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateLessThan(Float value) {
            addCriterion("srw_exchange_rate <", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("srw_exchange_rate <=", value, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateIn(List<Float> values) {
            addCriterion("srw_exchange_rate in", values, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateNotIn(List<Float> values) {
            addCriterion("srw_exchange_rate not in", values, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateBetween(Float value1, Float value2) {
            addCriterion("srw_exchange_rate between", value1, value2, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("srw_exchange_rate not between", value1, value2, "srwExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeIsNull() {
            addCriterion("srw_foreign_trade is null");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeIsNotNull() {
            addCriterion("srw_foreign_trade is not null");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeEqualTo(Integer value) {
            addCriterion("srw_foreign_trade =", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeNotEqualTo(Integer value) {
            addCriterion("srw_foreign_trade <>", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeGreaterThan(Integer value) {
            addCriterion("srw_foreign_trade >", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("srw_foreign_trade >=", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeLessThan(Integer value) {
            addCriterion("srw_foreign_trade <", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeLessThanOrEqualTo(Integer value) {
            addCriterion("srw_foreign_trade <=", value, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeIn(List<Integer> values) {
            addCriterion("srw_foreign_trade in", values, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeNotIn(List<Integer> values) {
            addCriterion("srw_foreign_trade not in", values, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeBetween(Integer value1, Integer value2) {
            addCriterion("srw_foreign_trade between", value1, value2, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwForeignTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("srw_foreign_trade not between", value1, value2, "srwForeignTrade");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumIsNull() {
            addCriterion("srw_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumIsNotNull() {
            addCriterion("srw_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumEqualTo(Float value) {
            addCriterion("srw_sunnum =", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumNotEqualTo(Float value) {
            addCriterion("srw_sunnum <>", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumGreaterThan(Float value) {
            addCriterion("srw_sunnum >", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumGreaterThanOrEqualTo(Float value) {
            addCriterion("srw_sunnum >=", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumLessThan(Float value) {
            addCriterion("srw_sunnum <", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumLessThanOrEqualTo(Float value) {
            addCriterion("srw_sunnum <=", value, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumIn(List<Float> values) {
            addCriterion("srw_sunnum in", values, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumNotIn(List<Float> values) {
            addCriterion("srw_sunnum not in", values, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumBetween(Float value1, Float value2) {
            addCriterion("srw_sunnum between", value1, value2, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunnumNotBetween(Float value1, Float value2) {
            addCriterion("srw_sunnum not between", value1, value2, "srwSunnum");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyIsNull() {
            addCriterion("srw_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyIsNotNull() {
            addCriterion("srw_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyEqualTo(Float value) {
            addCriterion("srw_sunmoney =", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyNotEqualTo(Float value) {
            addCriterion("srw_sunmoney <>", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyGreaterThan(Float value) {
            addCriterion("srw_sunmoney >", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("srw_sunmoney >=", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyLessThan(Float value) {
            addCriterion("srw_sunmoney <", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("srw_sunmoney <=", value, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyIn(List<Float> values) {
            addCriterion("srw_sunmoney in", values, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyNotIn(List<Float> values) {
            addCriterion("srw_sunmoney not in", values, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyBetween(Float value1, Float value2) {
            addCriterion("srw_sunmoney between", value1, value2, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("srw_sunmoney not between", value1, value2, "srwSunmoney");
            return (Criteria) this;
        }

        public Criteria andSrwTaxIsNull() {
            addCriterion("srw_tax is null");
            return (Criteria) this;
        }

        public Criteria andSrwTaxIsNotNull() {
            addCriterion("srw_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSrwTaxEqualTo(Float value) {
            addCriterion("srw_tax =", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxNotEqualTo(Float value) {
            addCriterion("srw_tax <>", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxGreaterThan(Float value) {
            addCriterion("srw_tax >", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("srw_tax >=", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxLessThan(Float value) {
            addCriterion("srw_tax <", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxLessThanOrEqualTo(Float value) {
            addCriterion("srw_tax <=", value, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxIn(List<Float> values) {
            addCriterion("srw_tax in", values, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxNotIn(List<Float> values) {
            addCriterion("srw_tax not in", values, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxBetween(Float value1, Float value2) {
            addCriterion("srw_tax between", value1, value2, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwTaxNotBetween(Float value1, Float value2) {
            addCriterion("srw_tax not between", value1, value2, "srwTax");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountIsNull() {
            addCriterion("srw_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountIsNotNull() {
            addCriterion("srw_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountEqualTo(String value) {
            addCriterion("srw_including_tax_amount =", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountNotEqualTo(String value) {
            addCriterion("srw_including_tax_amount <>", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountGreaterThan(String value) {
            addCriterion("srw_including_tax_amount >", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountGreaterThanOrEqualTo(String value) {
            addCriterion("srw_including_tax_amount >=", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountLessThan(String value) {
            addCriterion("srw_including_tax_amount <", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountLessThanOrEqualTo(String value) {
            addCriterion("srw_including_tax_amount <=", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountLike(String value) {
            addCriterion("srw_including_tax_amount like", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountNotLike(String value) {
            addCriterion("srw_including_tax_amount not like", value, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountIn(List<String> values) {
            addCriterion("srw_including_tax_amount in", values, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountNotIn(List<String> values) {
            addCriterion("srw_including_tax_amount not in", values, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountBetween(String value1, String value2) {
            addCriterion("srw_including_tax_amount between", value1, value2, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwIncludingTaxAmountNotBetween(String value1, String value2) {
            addCriterion("srw_including_tax_amount not between", value1, value2, "srwIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsIsNull() {
            addCriterion("srw_saleszkgs is null");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsIsNotNull() {
            addCriterion("srw_saleszkgs is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsEqualTo(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs =", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsNotEqualTo(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs <>", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsGreaterThan(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs >", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs >=", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsLessThan(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs <", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_saleszkgs <=", value, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsIn(List<Date> values) {
            addCriterionForJDBCDate("srw_saleszkgs in", values, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsNotIn(List<Date> values) {
            addCriterionForJDBCDate("srw_saleszkgs not in", values, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_saleszkgs between", value1, value2, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSaleszkgsNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_saleszkgs not between", value1, value2, "srwSaleszkgs");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateIsNull() {
            addCriterion("srw_salesdate is null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateIsNotNull() {
            addCriterion("srw_salesdate is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateEqualTo(String value) {
            addCriterion("srw_salesdate =", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateNotEqualTo(String value) {
            addCriterion("srw_salesdate <>", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateGreaterThan(String value) {
            addCriterion("srw_salesdate >", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateGreaterThanOrEqualTo(String value) {
            addCriterion("srw_salesdate >=", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateLessThan(String value) {
            addCriterion("srw_salesdate <", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateLessThanOrEqualTo(String value) {
            addCriterion("srw_salesdate <=", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateLike(String value) {
            addCriterion("srw_salesdate like", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateNotLike(String value) {
            addCriterion("srw_salesdate not like", value, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateIn(List<String> values) {
            addCriterion("srw_salesdate in", values, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateNotIn(List<String> values) {
            addCriterion("srw_salesdate not in", values, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateBetween(String value1, String value2) {
            addCriterion("srw_salesdate between", value1, value2, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdateNotBetween(String value1, String value2) {
            addCriterion("srw_salesdate not between", value1, value2, "srwSalesdate");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjIsNull() {
            addCriterion("srw_salessktj is null");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjIsNotNull() {
            addCriterion("srw_salessktj is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjEqualTo(Integer value) {
            addCriterion("srw_salessktj =", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjNotEqualTo(Integer value) {
            addCriterion("srw_salessktj <>", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjGreaterThan(Integer value) {
            addCriterion("srw_salessktj >", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjGreaterThanOrEqualTo(Integer value) {
            addCriterion("srw_salessktj >=", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjLessThan(Integer value) {
            addCriterion("srw_salessktj <", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjLessThanOrEqualTo(Integer value) {
            addCriterion("srw_salessktj <=", value, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjIn(List<Integer> values) {
            addCriterion("srw_salessktj in", values, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjNotIn(List<Integer> values) {
            addCriterion("srw_salessktj not in", values, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjBetween(Integer value1, Integer value2) {
            addCriterion("srw_salessktj between", value1, value2, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalessktjNotBetween(Integer value1, Integer value2) {
            addCriterion("srw_salessktj not between", value1, value2, "srwSalessktj");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayIsNull() {
            addCriterion("srw_salesday is null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayIsNotNull() {
            addCriterion("srw_salesday is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayEqualTo(Date value) {
            addCriterionForJDBCDate("srw_salesday =", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("srw_salesday <>", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayGreaterThan(Date value) {
            addCriterionForJDBCDate("srw_salesday >", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_salesday >=", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayLessThan(Date value) {
            addCriterionForJDBCDate("srw_salesday <", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srw_salesday <=", value, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayIn(List<Date> values) {
            addCriterionForJDBCDate("srw_salesday in", values, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("srw_salesday not in", values, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_salesday between", value1, value2, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srw_salesday not between", value1, value2, "srwSalesday");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueIsNull() {
            addCriterion("srw_salesyue is null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueIsNotNull() {
            addCriterion("srw_salesyue is not null");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueEqualTo(String value) {
            addCriterion("srw_salesyue =", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueNotEqualTo(String value) {
            addCriterion("srw_salesyue <>", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueGreaterThan(String value) {
            addCriterion("srw_salesyue >", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueGreaterThanOrEqualTo(String value) {
            addCriterion("srw_salesyue >=", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueLessThan(String value) {
            addCriterion("srw_salesyue <", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueLessThanOrEqualTo(String value) {
            addCriterion("srw_salesyue <=", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueLike(String value) {
            addCriterion("srw_salesyue like", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueNotLike(String value) {
            addCriterion("srw_salesyue not like", value, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueIn(List<String> values) {
            addCriterion("srw_salesyue in", values, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueNotIn(List<String> values) {
            addCriterion("srw_salesyue not in", values, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueBetween(String value1, String value2) {
            addCriterion("srw_salesyue between", value1, value2, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwSalesyueNotBetween(String value1, String value2) {
            addCriterion("srw_salesyue not between", value1, value2, "srwSalesyue");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerIsNull() {
            addCriterion("srw_buyer is null");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerIsNotNull() {
            addCriterion("srw_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerEqualTo(String value) {
            addCriterion("srw_buyer =", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerNotEqualTo(String value) {
            addCriterion("srw_buyer <>", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerGreaterThan(String value) {
            addCriterion("srw_buyer >", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("srw_buyer >=", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerLessThan(String value) {
            addCriterion("srw_buyer <", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerLessThanOrEqualTo(String value) {
            addCriterion("srw_buyer <=", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerLike(String value) {
            addCriterion("srw_buyer like", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerNotLike(String value) {
            addCriterion("srw_buyer not like", value, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerIn(List<String> values) {
            addCriterion("srw_buyer in", values, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerNotIn(List<String> values) {
            addCriterion("srw_buyer not in", values, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerBetween(String value1, String value2) {
            addCriterion("srw_buyer between", value1, value2, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBuyerNotBetween(String value1, String value2) {
            addCriterion("srw_buyer not between", value1, value2, "srwBuyer");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionIsNull() {
            addCriterion("srw_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionIsNotNull() {
            addCriterion("srw_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionEqualTo(String value) {
            addCriterion("srw_belongs_section =", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionNotEqualTo(String value) {
            addCriterion("srw_belongs_section <>", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionGreaterThan(String value) {
            addCriterion("srw_belongs_section >", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("srw_belongs_section >=", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionLessThan(String value) {
            addCriterion("srw_belongs_section <", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("srw_belongs_section <=", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionLike(String value) {
            addCriterion("srw_belongs_section like", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionNotLike(String value) {
            addCriterion("srw_belongs_section not like", value, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionIn(List<String> values) {
            addCriterion("srw_belongs_section in", values, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionNotIn(List<String> values) {
            addCriterion("srw_belongs_section not in", values, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionBetween(String value1, String value2) {
            addCriterion("srw_belongs_section between", value1, value2, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("srw_belongs_section not between", value1, value2, "srwBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectIsNull() {
            addCriterion("srw_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectIsNotNull() {
            addCriterion("srw_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectEqualTo(String value) {
            addCriterion("srw_belongs_project =", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectNotEqualTo(String value) {
            addCriterion("srw_belongs_project <>", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectGreaterThan(String value) {
            addCriterion("srw_belongs_project >", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("srw_belongs_project >=", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectLessThan(String value) {
            addCriterion("srw_belongs_project <", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("srw_belongs_project <=", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectLike(String value) {
            addCriterion("srw_belongs_project like", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectNotLike(String value) {
            addCriterion("srw_belongs_project not like", value, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectIn(List<String> values) {
            addCriterion("srw_belongs_project in", values, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectNotIn(List<String> values) {
            addCriterion("srw_belongs_project not in", values, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectBetween(String value1, String value2) {
            addCriterion("srw_belongs_project between", value1, value2, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("srw_belongs_project not between", value1, value2, "srwBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSrwFormIsNull() {
            addCriterion("srw_form is null");
            return (Criteria) this;
        }

        public Criteria andSrwFormIsNotNull() {
            addCriterion("srw_form is not null");
            return (Criteria) this;
        }

        public Criteria andSrwFormEqualTo(String value) {
            addCriterion("srw_form =", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormNotEqualTo(String value) {
            addCriterion("srw_form <>", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormGreaterThan(String value) {
            addCriterion("srw_form >", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormGreaterThanOrEqualTo(String value) {
            addCriterion("srw_form >=", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormLessThan(String value) {
            addCriterion("srw_form <", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormLessThanOrEqualTo(String value) {
            addCriterion("srw_form <=", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormLike(String value) {
            addCriterion("srw_form like", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormNotLike(String value) {
            addCriterion("srw_form not like", value, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormIn(List<String> values) {
            addCriterion("srw_form in", values, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormNotIn(List<String> values) {
            addCriterion("srw_form not in", values, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormBetween(String value1, String value2) {
            addCriterion("srw_form between", value1, value2, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwFormNotBetween(String value1, String value2) {
            addCriterion("srw_form not between", value1, value2, "srwForm");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffIsNull() {
            addCriterion("srw_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffIsNotNull() {
            addCriterion("srw_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffEqualTo(String value) {
            addCriterion("srw_checkagain_staff =", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffNotEqualTo(String value) {
            addCriterion("srw_checkagain_staff <>", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffGreaterThan(String value) {
            addCriterion("srw_checkagain_staff >", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("srw_checkagain_staff >=", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffLessThan(String value) {
            addCriterion("srw_checkagain_staff <", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("srw_checkagain_staff <=", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffLike(String value) {
            addCriterion("srw_checkagain_staff like", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffNotLike(String value) {
            addCriterion("srw_checkagain_staff not like", value, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffIn(List<String> values) {
            addCriterion("srw_checkagain_staff in", values, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffNotIn(List<String> values) {
            addCriterion("srw_checkagain_staff not in", values, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffBetween(String value1, String value2) {
            addCriterion("srw_checkagain_staff between", value1, value2, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("srw_checkagain_staff not between", value1, value2, "srwCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionIsNull() {
            addCriterion("srw_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionIsNotNull() {
            addCriterion("srw_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionEqualTo(String value) {
            addCriterion("srw_header_provision =", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionNotEqualTo(String value) {
            addCriterion("srw_header_provision <>", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionGreaterThan(String value) {
            addCriterion("srw_header_provision >", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("srw_header_provision >=", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionLessThan(String value) {
            addCriterion("srw_header_provision <", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("srw_header_provision <=", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionLike(String value) {
            addCriterion("srw_header_provision like", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionNotLike(String value) {
            addCriterion("srw_header_provision not like", value, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionIn(List<String> values) {
            addCriterion("srw_header_provision in", values, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionNotIn(List<String> values) {
            addCriterion("srw_header_provision not in", values, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionBetween(String value1, String value2) {
            addCriterion("srw_header_provision between", value1, value2, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("srw_header_provision not between", value1, value2, "srwHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseIsNull() {
            addCriterion("srw_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseIsNotNull() {
            addCriterion("srw_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseEqualTo(String value) {
            addCriterion("srw_end_clause =", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseNotEqualTo(String value) {
            addCriterion("srw_end_clause <>", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseGreaterThan(String value) {
            addCriterion("srw_end_clause >", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("srw_end_clause >=", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseLessThan(String value) {
            addCriterion("srw_end_clause <", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseLessThanOrEqualTo(String value) {
            addCriterion("srw_end_clause <=", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseLike(String value) {
            addCriterion("srw_end_clause like", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseNotLike(String value) {
            addCriterion("srw_end_clause not like", value, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseIn(List<String> values) {
            addCriterion("srw_end_clause in", values, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseNotIn(List<String> values) {
            addCriterion("srw_end_clause not in", values, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseBetween(String value1, String value2) {
            addCriterion("srw_end_clause between", value1, value2, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwEndClauseNotBetween(String value1, String value2) {
            addCriterion("srw_end_clause not between", value1, value2, "srwEndClause");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkIsNull() {
            addCriterion("srw_remark is null");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkIsNotNull() {
            addCriterion("srw_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkEqualTo(String value) {
            addCriterion("srw_remark =", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkNotEqualTo(String value) {
            addCriterion("srw_remark <>", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkGreaterThan(String value) {
            addCriterion("srw_remark >", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("srw_remark >=", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkLessThan(String value) {
            addCriterion("srw_remark <", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkLessThanOrEqualTo(String value) {
            addCriterion("srw_remark <=", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkLike(String value) {
            addCriterion("srw_remark like", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkNotLike(String value) {
            addCriterion("srw_remark not like", value, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkIn(List<String> values) {
            addCriterion("srw_remark in", values, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkNotIn(List<String> values) {
            addCriterion("srw_remark not in", values, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkBetween(String value1, String value2) {
            addCriterion("srw_remark between", value1, value2, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwRemarkNotBetween(String value1, String value2) {
            addCriterion("srw_remark not between", value1, value2, "srwRemark");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingIsNull() {
            addCriterion("srw_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingIsNotNull() {
            addCriterion("srw_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingEqualTo(String value) {
            addCriterion("srw_auditing =", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingNotEqualTo(String value) {
            addCriterion("srw_auditing <>", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingGreaterThan(String value) {
            addCriterion("srw_auditing >", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("srw_auditing >=", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingLessThan(String value) {
            addCriterion("srw_auditing <", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingLessThanOrEqualTo(String value) {
            addCriterion("srw_auditing <=", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingLike(String value) {
            addCriterion("srw_auditing like", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingNotLike(String value) {
            addCriterion("srw_auditing not like", value, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingIn(List<String> values) {
            addCriterion("srw_auditing in", values, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingNotIn(List<String> values) {
            addCriterion("srw_auditing not in", values, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingBetween(String value1, String value2) {
            addCriterion("srw_auditing between", value1, value2, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwAuditingNotBetween(String value1, String value2) {
            addCriterion("srw_auditing not between", value1, value2, "srwAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwYnIsNull() {
            addCriterion("srw_yn is null");
            return (Criteria) this;
        }

        public Criteria andSrwYnIsNotNull() {
            addCriterion("srw_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSrwYnEqualTo(String value) {
            addCriterion("srw_yn =", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnNotEqualTo(String value) {
            addCriterion("srw_yn <>", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnGreaterThan(String value) {
            addCriterion("srw_yn >", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnGreaterThanOrEqualTo(String value) {
            addCriterion("srw_yn >=", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnLessThan(String value) {
            addCriterion("srw_yn <", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnLessThanOrEqualTo(String value) {
            addCriterion("srw_yn <=", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnLike(String value) {
            addCriterion("srw_yn like", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnNotLike(String value) {
            addCriterion("srw_yn not like", value, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnIn(List<String> values) {
            addCriterion("srw_yn in", values, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnNotIn(List<String> values) {
            addCriterion("srw_yn not in", values, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnBetween(String value1, String value2) {
            addCriterion("srw_yn between", value1, value2, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwYnNotBetween(String value1, String value2) {
            addCriterion("srw_yn not between", value1, value2, "srwYn");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1IsNull() {
            addCriterion("srw_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1IsNotNull() {
            addCriterion("srw_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1EqualTo(String value) {
            addCriterion("srw_custom1 =", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1NotEqualTo(String value) {
            addCriterion("srw_custom1 <>", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1GreaterThan(String value) {
            addCriterion("srw_custom1 >", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("srw_custom1 >=", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1LessThan(String value) {
            addCriterion("srw_custom1 <", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1LessThanOrEqualTo(String value) {
            addCriterion("srw_custom1 <=", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1Like(String value) {
            addCriterion("srw_custom1 like", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1NotLike(String value) {
            addCriterion("srw_custom1 not like", value, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1In(List<String> values) {
            addCriterion("srw_custom1 in", values, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1NotIn(List<String> values) {
            addCriterion("srw_custom1 not in", values, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1Between(String value1, String value2) {
            addCriterion("srw_custom1 between", value1, value2, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom1NotBetween(String value1, String value2) {
            addCriterion("srw_custom1 not between", value1, value2, "srwCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2IsNull() {
            addCriterion("srw_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2IsNotNull() {
            addCriterion("srw_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2EqualTo(String value) {
            addCriterion("srw_custom2 =", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2NotEqualTo(String value) {
            addCriterion("srw_custom2 <>", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2GreaterThan(String value) {
            addCriterion("srw_custom2 >", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("srw_custom2 >=", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2LessThan(String value) {
            addCriterion("srw_custom2 <", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2LessThanOrEqualTo(String value) {
            addCriterion("srw_custom2 <=", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2Like(String value) {
            addCriterion("srw_custom2 like", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2NotLike(String value) {
            addCriterion("srw_custom2 not like", value, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2In(List<String> values) {
            addCriterion("srw_custom2 in", values, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2NotIn(List<String> values) {
            addCriterion("srw_custom2 not in", values, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2Between(String value1, String value2) {
            addCriterion("srw_custom2 between", value1, value2, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom2NotBetween(String value1, String value2) {
            addCriterion("srw_custom2 not between", value1, value2, "srwCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3IsNull() {
            addCriterion("srw_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3IsNotNull() {
            addCriterion("srw_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3EqualTo(String value) {
            addCriterion("srw_custom3 =", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3NotEqualTo(String value) {
            addCriterion("srw_custom3 <>", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3GreaterThan(String value) {
            addCriterion("srw_custom3 >", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("srw_custom3 >=", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3LessThan(String value) {
            addCriterion("srw_custom3 <", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3LessThanOrEqualTo(String value) {
            addCriterion("srw_custom3 <=", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3Like(String value) {
            addCriterion("srw_custom3 like", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3NotLike(String value) {
            addCriterion("srw_custom3 not like", value, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3In(List<String> values) {
            addCriterion("srw_custom3 in", values, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3NotIn(List<String> values) {
            addCriterion("srw_custom3 not in", values, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3Between(String value1, String value2) {
            addCriterion("srw_custom3 between", value1, value2, "srwCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwCustom3NotBetween(String value1, String value2) {
            addCriterion("srw_custom3 not between", value1, value2, "srwCustom3");
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