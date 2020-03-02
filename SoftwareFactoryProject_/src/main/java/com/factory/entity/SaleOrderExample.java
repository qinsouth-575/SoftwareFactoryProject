package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOrderExample() {
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

        public Criteria andSoIdIsNull() {
            addCriterion("so_id is null");
            return (Criteria) this;
        }

        public Criteria andSoIdIsNotNull() {
            addCriterion("so_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoIdEqualTo(Integer value) {
            addCriterion("so_id =", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotEqualTo(Integer value) {
            addCriterion("so_id <>", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThan(Integer value) {
            addCriterion("so_id >", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_id >=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThan(Integer value) {
            addCriterion("so_id <", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThanOrEqualTo(Integer value) {
            addCriterion("so_id <=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdIn(List<Integer> values) {
            addCriterion("so_id in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotIn(List<Integer> values) {
            addCriterion("so_id not in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdBetween(Integer value1, Integer value2) {
            addCriterion("so_id between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("so_id not between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdIsNull() {
            addCriterion("customerorder_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdIsNotNull() {
            addCriterion("customerorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdEqualTo(String value) {
            addCriterion("customerorder_id =", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdNotEqualTo(String value) {
            addCriterion("customerorder_id <>", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdGreaterThan(String value) {
            addCriterion("customerorder_id >", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdGreaterThanOrEqualTo(String value) {
            addCriterion("customerorder_id >=", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdLessThan(String value) {
            addCriterion("customerorder_id <", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdLessThanOrEqualTo(String value) {
            addCriterion("customerorder_id <=", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdLike(String value) {
            addCriterion("customerorder_id like", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdNotLike(String value) {
            addCriterion("customerorder_id not like", value, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdIn(List<String> values) {
            addCriterion("customerorder_id in", values, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdNotIn(List<String> values) {
            addCriterion("customerorder_id not in", values, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdBetween(String value1, String value2) {
            addCriterion("customerorder_id between", value1, value2, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIdNotBetween(String value1, String value2) {
            addCriterion("customerorder_id not between", value1, value2, "customerorderId");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIsNull() {
            addCriterion("so_document_time is null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIsNotNull() {
            addCriterion("so_document_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("so_document_time =", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("so_document_time <>", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("so_document_time >", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_document_time >=", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeLessThan(Date value) {
            addCriterionForJDBCDate("so_document_time <", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_document_time <=", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("so_document_time in", values, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("so_document_time not in", values, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_document_time between", value1, value2, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_document_time not between", value1, value2, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberIsNull() {
            addCriterion("so_documentnumber is null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberIsNotNull() {
            addCriterion("so_documentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberEqualTo(String value) {
            addCriterion("so_documentnumber =", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotEqualTo(String value) {
            addCriterion("so_documentnumber <>", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberGreaterThan(String value) {
            addCriterion("so_documentnumber >", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("so_documentnumber >=", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLessThan(String value) {
            addCriterion("so_documentnumber <", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLessThanOrEqualTo(String value) {
            addCriterion("so_documentnumber <=", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLike(String value) {
            addCriterion("so_documentnumber like", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotLike(String value) {
            addCriterion("so_documentnumber not like", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberIn(List<String> values) {
            addCriterion("so_documentnumber in", values, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotIn(List<String> values) {
            addCriterion("so_documentnumber not in", values, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberBetween(String value1, String value2) {
            addCriterion("so_documentnumber between", value1, value2, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotBetween(String value1, String value2) {
            addCriterion("so_documentnumber not between", value1, value2, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIsNull() {
            addCriterion("so_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIsNotNull() {
            addCriterion("so_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressEqualTo(String value) {
            addCriterion("so_delivery_address =", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotEqualTo(String value) {
            addCriterion("so_delivery_address <>", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressGreaterThan(String value) {
            addCriterion("so_delivery_address >", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("so_delivery_address >=", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLessThan(String value) {
            addCriterion("so_delivery_address <", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("so_delivery_address <=", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLike(String value) {
            addCriterion("so_delivery_address like", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotLike(String value) {
            addCriterion("so_delivery_address not like", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIn(List<String> values) {
            addCriterion("so_delivery_address in", values, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotIn(List<String> values) {
            addCriterion("so_delivery_address not in", values, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressBetween(String value1, String value2) {
            addCriterion("so_delivery_address between", value1, value2, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("so_delivery_address not between", value1, value2, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSotIdIsNull() {
            addCriterion("sot_id is null");
            return (Criteria) this;
        }

        public Criteria andSotIdIsNotNull() {
            addCriterion("sot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSotIdEqualTo(String value) {
            addCriterion("sot_id =", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotEqualTo(String value) {
            addCriterion("sot_id <>", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdGreaterThan(String value) {
            addCriterion("sot_id >", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdGreaterThanOrEqualTo(String value) {
            addCriterion("sot_id >=", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLessThan(String value) {
            addCriterion("sot_id <", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLessThanOrEqualTo(String value) {
            addCriterion("sot_id <=", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLike(String value) {
            addCriterion("sot_id like", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotLike(String value) {
            addCriterion("sot_id not like", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdIn(List<String> values) {
            addCriterion("sot_id in", values, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotIn(List<String> values) {
            addCriterion("sot_id not in", values, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdBetween(String value1, String value2) {
            addCriterion("sot_id between", value1, value2, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotBetween(String value1, String value2) {
            addCriterion("sot_id not between", value1, value2, "sotId");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIsNull() {
            addCriterion("so_customerorder is null");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIsNotNull() {
            addCriterion("so_customerorder is not null");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderEqualTo(String value) {
            addCriterion("so_customerorder =", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotEqualTo(String value) {
            addCriterion("so_customerorder <>", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderGreaterThan(String value) {
            addCriterion("so_customerorder >", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderGreaterThanOrEqualTo(String value) {
            addCriterion("so_customerorder >=", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLessThan(String value) {
            addCriterion("so_customerorder <", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLessThanOrEqualTo(String value) {
            addCriterion("so_customerorder <=", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLike(String value) {
            addCriterion("so_customerorder like", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotLike(String value) {
            addCriterion("so_customerorder not like", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIn(List<String> values) {
            addCriterion("so_customerorder in", values, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotIn(List<String> values) {
            addCriterion("so_customerorder not in", values, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderBetween(String value1, String value2) {
            addCriterion("so_customerorder between", value1, value2, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotBetween(String value1, String value2) {
            addCriterion("so_customerorder not between", value1, value2, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoTaxIsNull() {
            addCriterion("so_tax is null");
            return (Criteria) this;
        }

        public Criteria andSoTaxIsNotNull() {
            addCriterion("so_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSoTaxEqualTo(Integer value) {
            addCriterion("so_tax =", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotEqualTo(Integer value) {
            addCriterion("so_tax <>", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxGreaterThan(Integer value) {
            addCriterion("so_tax >", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_tax >=", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxLessThan(Integer value) {
            addCriterion("so_tax <", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxLessThanOrEqualTo(Integer value) {
            addCriterion("so_tax <=", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxIn(List<Integer> values) {
            addCriterion("so_tax in", values, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotIn(List<Integer> values) {
            addCriterion("so_tax not in", values, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxBetween(Integer value1, Integer value2) {
            addCriterion("so_tax between", value1, value2, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("so_tax not between", value1, value2, "soTax");
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

        public Criteria andSoOderStaticIsNull() {
            addCriterion("so_oder_static is null");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticIsNotNull() {
            addCriterion("so_oder_static is not null");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticEqualTo(Integer value) {
            addCriterion("so_oder_static =", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotEqualTo(Integer value) {
            addCriterion("so_oder_static <>", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticGreaterThan(Integer value) {
            addCriterion("so_oder_static >", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_oder_static >=", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticLessThan(Integer value) {
            addCriterion("so_oder_static <", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticLessThanOrEqualTo(Integer value) {
            addCriterion("so_oder_static <=", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticIn(List<Integer> values) {
            addCriterion("so_oder_static in", values, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotIn(List<Integer> values) {
            addCriterion("so_oder_static not in", values, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticBetween(Integer value1, Integer value2) {
            addCriterion("so_oder_static between", value1, value2, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotBetween(Integer value1, Integer value2) {
            addCriterion("so_oder_static not between", value1, value2, "soOderStatic");
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

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
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

        public Criteria andSoMonographIsNull() {
            addCriterion("so_monograph is null");
            return (Criteria) this;
        }

        public Criteria andSoMonographIsNotNull() {
            addCriterion("so_monograph is not null");
            return (Criteria) this;
        }

        public Criteria andSoMonographEqualTo(String value) {
            addCriterion("so_monograph =", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotEqualTo(String value) {
            addCriterion("so_monograph <>", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographGreaterThan(String value) {
            addCriterion("so_monograph >", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographGreaterThanOrEqualTo(String value) {
            addCriterion("so_monograph >=", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLessThan(String value) {
            addCriterion("so_monograph <", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLessThanOrEqualTo(String value) {
            addCriterion("so_monograph <=", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLike(String value) {
            addCriterion("so_monograph like", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotLike(String value) {
            addCriterion("so_monograph not like", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographIn(List<String> values) {
            addCriterion("so_monograph in", values, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotIn(List<String> values) {
            addCriterion("so_monograph not in", values, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographBetween(String value1, String value2) {
            addCriterion("so_monograph between", value1, value2, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotBetween(String value1, String value2) {
            addCriterion("so_monograph not between", value1, value2, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIsNull() {
            addCriterion("so_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIsNotNull() {
            addCriterion("so_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andSoReviewerEqualTo(String value) {
            addCriterion("so_reviewer =", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotEqualTo(String value) {
            addCriterion("so_reviewer <>", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerGreaterThan(String value) {
            addCriterion("so_reviewer >", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("so_reviewer >=", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLessThan(String value) {
            addCriterion("so_reviewer <", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLessThanOrEqualTo(String value) {
            addCriterion("so_reviewer <=", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLike(String value) {
            addCriterion("so_reviewer like", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotLike(String value) {
            addCriterion("so_reviewer not like", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIn(List<String> values) {
            addCriterion("so_reviewer in", values, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotIn(List<String> values) {
            addCriterion("so_reviewer not in", values, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerBetween(String value1, String value2) {
            addCriterion("so_reviewer between", value1, value2, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotBetween(String value1, String value2) {
            addCriterion("so_reviewer not between", value1, value2, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIsNull() {
            addCriterion("so_subordinate is null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIsNotNull() {
            addCriterion("so_subordinate is not null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateEqualTo(String value) {
            addCriterion("so_subordinate =", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotEqualTo(String value) {
            addCriterion("so_subordinate <>", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateGreaterThan(String value) {
            addCriterion("so_subordinate >", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateGreaterThanOrEqualTo(String value) {
            addCriterion("so_subordinate >=", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLessThan(String value) {
            addCriterion("so_subordinate <", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLessThanOrEqualTo(String value) {
            addCriterion("so_subordinate <=", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLike(String value) {
            addCriterion("so_subordinate like", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotLike(String value) {
            addCriterion("so_subordinate not like", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIn(List<String> values) {
            addCriterion("so_subordinate in", values, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotIn(List<String> values) {
            addCriterion("so_subordinate not in", values, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateBetween(String value1, String value2) {
            addCriterion("so_subordinate between", value1, value2, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotBetween(String value1, String value2) {
            addCriterion("so_subordinate not between", value1, value2, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIsNull() {
            addCriterion("so_watchword is null");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIsNotNull() {
            addCriterion("so_watchword is not null");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordEqualTo(String value) {
            addCriterion("so_watchword =", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotEqualTo(String value) {
            addCriterion("so_watchword <>", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordGreaterThan(String value) {
            addCriterion("so_watchword >", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordGreaterThanOrEqualTo(String value) {
            addCriterion("so_watchword >=", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLessThan(String value) {
            addCriterion("so_watchword <", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLessThanOrEqualTo(String value) {
            addCriterion("so_watchword <=", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLike(String value) {
            addCriterion("so_watchword like", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotLike(String value) {
            addCriterion("so_watchword not like", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIn(List<String> values) {
            addCriterion("so_watchword in", values, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotIn(List<String> values) {
            addCriterion("so_watchword not in", values, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordBetween(String value1, String value2) {
            addCriterion("so_watchword between", value1, value2, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotBetween(String value1, String value2) {
            addCriterion("so_watchword not between", value1, value2, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIsNull() {
            addCriterion("so_tailclause is null");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIsNotNull() {
            addCriterion("so_tailclause is not null");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseEqualTo(String value) {
            addCriterion("so_tailclause =", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotEqualTo(String value) {
            addCriterion("so_tailclause <>", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseGreaterThan(String value) {
            addCriterion("so_tailclause >", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseGreaterThanOrEqualTo(String value) {
            addCriterion("so_tailclause >=", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLessThan(String value) {
            addCriterion("so_tailclause <", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLessThanOrEqualTo(String value) {
            addCriterion("so_tailclause <=", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLike(String value) {
            addCriterion("so_tailclause like", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotLike(String value) {
            addCriterion("so_tailclause not like", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIn(List<String> values) {
            addCriterion("so_tailclause in", values, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotIn(List<String> values) {
            addCriterion("so_tailclause not in", values, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseBetween(String value1, String value2) {
            addCriterion("so_tailclause between", value1, value2, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotBetween(String value1, String value2) {
            addCriterion("so_tailclause not between", value1, value2, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIsNull() {
            addCriterion("so_remark is null");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIsNotNull() {
            addCriterion("so_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSoRemarkEqualTo(String value) {
            addCriterion("so_remark =", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotEqualTo(String value) {
            addCriterion("so_remark <>", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkGreaterThan(String value) {
            addCriterion("so_remark >", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("so_remark >=", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLessThan(String value) {
            addCriterion("so_remark <", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLessThanOrEqualTo(String value) {
            addCriterion("so_remark <=", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLike(String value) {
            addCriterion("so_remark like", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotLike(String value) {
            addCriterion("so_remark not like", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIn(List<String> values) {
            addCriterion("so_remark in", values, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotIn(List<String> values) {
            addCriterion("so_remark not in", values, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkBetween(String value1, String value2) {
            addCriterion("so_remark between", value1, value2, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotBetween(String value1, String value2) {
            addCriterion("so_remark not between", value1, value2, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIsNull() {
            addCriterion("so_account_ownership is null");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIsNotNull() {
            addCriterion("so_account_ownership is not null");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipEqualTo(String value) {
            addCriterion("so_account_ownership =", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotEqualTo(String value) {
            addCriterion("so_account_ownership <>", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipGreaterThan(String value) {
            addCriterion("so_account_ownership >", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("so_account_ownership >=", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLessThan(String value) {
            addCriterion("so_account_ownership <", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLessThanOrEqualTo(String value) {
            addCriterion("so_account_ownership <=", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLike(String value) {
            addCriterion("so_account_ownership like", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotLike(String value) {
            addCriterion("so_account_ownership not like", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIn(List<String> values) {
            addCriterion("so_account_ownership in", values, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotIn(List<String> values) {
            addCriterion("so_account_ownership not in", values, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipBetween(String value1, String value2) {
            addCriterion("so_account_ownership between", value1, value2, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotBetween(String value1, String value2) {
            addCriterion("so_account_ownership not between", value1, value2, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIsNull() {
            addCriterion("so_collection_time is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIsNotNull() {
            addCriterion("so_collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeEqualTo(String value) {
            addCriterion("so_collection_time =", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotEqualTo(String value) {
            addCriterion("so_collection_time <>", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeGreaterThan(String value) {
            addCriterion("so_collection_time >", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_time >=", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeLessThan(String value) {
            addCriterion("so_collection_time <", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeLessThanOrEqualTo(String value) {
            addCriterion("so_collection_time <=", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeLike(String value) {
            addCriterion("so_collection_time like", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotLike(String value) {
            addCriterion("so_collection_time not like", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIn(List<String> values) {
            addCriterion("so_collection_time in", values, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotIn(List<String> values) {
            addCriterion("so_collection_time not in", values, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeBetween(String value1, String value2) {
            addCriterion("so_collection_time between", value1, value2, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotBetween(String value1, String value2) {
            addCriterion("so_collection_time not between", value1, value2, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIsNull() {
            addCriterion("so_collection_month is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIsNotNull() {
            addCriterion("so_collection_month is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthEqualTo(String value) {
            addCriterion("so_collection_month =", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotEqualTo(String value) {
            addCriterion("so_collection_month <>", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthGreaterThan(String value) {
            addCriterion("so_collection_month >", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_month >=", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthLessThan(String value) {
            addCriterion("so_collection_month <", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthLessThanOrEqualTo(String value) {
            addCriterion("so_collection_month <=", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthLike(String value) {
            addCriterion("so_collection_month like", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotLike(String value) {
            addCriterion("so_collection_month not like", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIn(List<String> values) {
            addCriterion("so_collection_month in", values, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotIn(List<String> values) {
            addCriterion("so_collection_month not in", values, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthBetween(String value1, String value2) {
            addCriterion("so_collection_month between", value1, value2, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotBetween(String value1, String value2) {
            addCriterion("so_collection_month not between", value1, value2, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIsNull() {
            addCriterion("so_collection_terms is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIsNotNull() {
            addCriterion("so_collection_terms is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsEqualTo(String value) {
            addCriterion("so_collection_terms =", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotEqualTo(String value) {
            addCriterion("so_collection_terms <>", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsGreaterThan(String value) {
            addCriterion("so_collection_terms >", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_terms >=", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLessThan(String value) {
            addCriterion("so_collection_terms <", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLessThanOrEqualTo(String value) {
            addCriterion("so_collection_terms <=", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLike(String value) {
            addCriterion("so_collection_terms like", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotLike(String value) {
            addCriterion("so_collection_terms not like", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIn(List<String> values) {
            addCriterion("so_collection_terms in", values, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotIn(List<String> values) {
            addCriterion("so_collection_terms not in", values, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsBetween(String value1, String value2) {
            addCriterion("so_collection_terms between", value1, value2, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotBetween(String value1, String value2) {
            addCriterion("so_collection_terms not between", value1, value2, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIsNull() {
            addCriterion("so_collection_terms_day is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIsNotNull() {
            addCriterion("so_collection_terms_day is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayEqualTo(String value) {
            addCriterion("so_collection_terms_day =", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotEqualTo(String value) {
            addCriterion("so_collection_terms_day <>", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayGreaterThan(String value) {
            addCriterion("so_collection_terms_day >", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_terms_day >=", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLessThan(String value) {
            addCriterion("so_collection_terms_day <", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLessThanOrEqualTo(String value) {
            addCriterion("so_collection_terms_day <=", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLike(String value) {
            addCriterion("so_collection_terms_day like", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotLike(String value) {
            addCriterion("so_collection_terms_day not like", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIn(List<String> values) {
            addCriterion("so_collection_terms_day in", values, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotIn(List<String> values) {
            addCriterion("so_collection_terms_day not in", values, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayBetween(String value1, String value2) {
            addCriterion("so_collection_terms_day between", value1, value2, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotBetween(String value1, String value2) {
            addCriterion("so_collection_terms_day not between", value1, value2, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoAuditingIsNull() {
            addCriterion("so_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSoAuditingIsNotNull() {
            addCriterion("so_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSoAuditingEqualTo(String value) {
            addCriterion("so_auditing =", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingNotEqualTo(String value) {
            addCriterion("so_auditing <>", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingGreaterThan(String value) {
            addCriterion("so_auditing >", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("so_auditing >=", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingLessThan(String value) {
            addCriterion("so_auditing <", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingLessThanOrEqualTo(String value) {
            addCriterion("so_auditing <=", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingLike(String value) {
            addCriterion("so_auditing like", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingNotLike(String value) {
            addCriterion("so_auditing not like", value, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingIn(List<String> values) {
            addCriterion("so_auditing in", values, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingNotIn(List<String> values) {
            addCriterion("so_auditing not in", values, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingBetween(String value1, String value2) {
            addCriterion("so_auditing between", value1, value2, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoAuditingNotBetween(String value1, String value2) {
            addCriterion("so_auditing not between", value1, value2, "soAuditing");
            return (Criteria) this;
        }

        public Criteria andSoYnIsNull() {
            addCriterion("so_yn is null");
            return (Criteria) this;
        }

        public Criteria andSoYnIsNotNull() {
            addCriterion("so_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSoYnEqualTo(String value) {
            addCriterion("so_yn =", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnNotEqualTo(String value) {
            addCriterion("so_yn <>", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnGreaterThan(String value) {
            addCriterion("so_yn >", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnGreaterThanOrEqualTo(String value) {
            addCriterion("so_yn >=", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnLessThan(String value) {
            addCriterion("so_yn <", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnLessThanOrEqualTo(String value) {
            addCriterion("so_yn <=", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnLike(String value) {
            addCriterion("so_yn like", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnNotLike(String value) {
            addCriterion("so_yn not like", value, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnIn(List<String> values) {
            addCriterion("so_yn in", values, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnNotIn(List<String> values) {
            addCriterion("so_yn not in", values, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnBetween(String value1, String value2) {
            addCriterion("so_yn between", value1, value2, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoYnNotBetween(String value1, String value2) {
            addCriterion("so_yn not between", value1, value2, "soYn");
            return (Criteria) this;
        }

        public Criteria andSoCustom1IsNull() {
            addCriterion("so_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSoCustom1IsNotNull() {
            addCriterion("so_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoCustom1EqualTo(String value) {
            addCriterion("so_custom1 =", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1NotEqualTo(String value) {
            addCriterion("so_custom1 <>", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1GreaterThan(String value) {
            addCriterion("so_custom1 >", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("so_custom1 >=", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1LessThan(String value) {
            addCriterion("so_custom1 <", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1LessThanOrEqualTo(String value) {
            addCriterion("so_custom1 <=", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1Like(String value) {
            addCriterion("so_custom1 like", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1NotLike(String value) {
            addCriterion("so_custom1 not like", value, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1In(List<String> values) {
            addCriterion("so_custom1 in", values, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1NotIn(List<String> values) {
            addCriterion("so_custom1 not in", values, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1Between(String value1, String value2) {
            addCriterion("so_custom1 between", value1, value2, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom1NotBetween(String value1, String value2) {
            addCriterion("so_custom1 not between", value1, value2, "soCustom1");
            return (Criteria) this;
        }

        public Criteria andSoCustom2IsNull() {
            addCriterion("so_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSoCustom2IsNotNull() {
            addCriterion("so_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoCustom2EqualTo(String value) {
            addCriterion("so_custom2 =", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2NotEqualTo(String value) {
            addCriterion("so_custom2 <>", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2GreaterThan(String value) {
            addCriterion("so_custom2 >", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("so_custom2 >=", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2LessThan(String value) {
            addCriterion("so_custom2 <", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2LessThanOrEqualTo(String value) {
            addCriterion("so_custom2 <=", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2Like(String value) {
            addCriterion("so_custom2 like", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2NotLike(String value) {
            addCriterion("so_custom2 not like", value, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2In(List<String> values) {
            addCriterion("so_custom2 in", values, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2NotIn(List<String> values) {
            addCriterion("so_custom2 not in", values, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2Between(String value1, String value2) {
            addCriterion("so_custom2 between", value1, value2, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom2NotBetween(String value1, String value2) {
            addCriterion("so_custom2 not between", value1, value2, "soCustom2");
            return (Criteria) this;
        }

        public Criteria andSoCustom3IsNull() {
            addCriterion("so_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSoCustom3IsNotNull() {
            addCriterion("so_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoCustom3EqualTo(String value) {
            addCriterion("so_custom3 =", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3NotEqualTo(String value) {
            addCriterion("so_custom3 <>", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3GreaterThan(String value) {
            addCriterion("so_custom3 >", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("so_custom3 >=", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3LessThan(String value) {
            addCriterion("so_custom3 <", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3LessThanOrEqualTo(String value) {
            addCriterion("so_custom3 <=", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3Like(String value) {
            addCriterion("so_custom3 like", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3NotLike(String value) {
            addCriterion("so_custom3 not like", value, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3In(List<String> values) {
            addCriterion("so_custom3 in", values, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3NotIn(List<String> values) {
            addCriterion("so_custom3 not in", values, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3Between(String value1, String value2) {
            addCriterion("so_custom3 between", value1, value2, "soCustom3");
            return (Criteria) this;
        }

        public Criteria andSoCustom3NotBetween(String value1, String value2) {
            addCriterion("so_custom3 not between", value1, value2, "soCustom3");
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