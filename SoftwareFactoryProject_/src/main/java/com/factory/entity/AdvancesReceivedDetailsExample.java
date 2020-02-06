package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdvancesReceivedDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvancesReceivedDetailsExample() {
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

        public Criteria andPaydetailIdIsNull() {
            addCriterion("paydetail_id is null");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdIsNotNull() {
            addCriterion("paydetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdEqualTo(String value) {
            addCriterion("paydetail_id =", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdNotEqualTo(String value) {
            addCriterion("paydetail_id <>", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdGreaterThan(String value) {
            addCriterion("paydetail_id >", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("paydetail_id >=", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdLessThan(String value) {
            addCriterion("paydetail_id <", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdLessThanOrEqualTo(String value) {
            addCriterion("paydetail_id <=", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdLike(String value) {
            addCriterion("paydetail_id like", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdNotLike(String value) {
            addCriterion("paydetail_id not like", value, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdIn(List<String> values) {
            addCriterion("paydetail_id in", values, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdNotIn(List<String> values) {
            addCriterion("paydetail_id not in", values, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdBetween(String value1, String value2) {
            addCriterion("paydetail_id between", value1, value2, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPaydetailIdNotBetween(String value1, String value2) {
            addCriterion("paydetail_id not between", value1, value2, "paydetailId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdIsNull() {
            addCriterion("Payables_id is null");
            return (Criteria) this;
        }

        public Criteria andPayablesIdIsNotNull() {
            addCriterion("Payables_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesIdEqualTo(String value) {
            addCriterion("Payables_id =", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotEqualTo(String value) {
            addCriterion("Payables_id <>", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdGreaterThan(String value) {
            addCriterion("Payables_id >", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdGreaterThanOrEqualTo(String value) {
            addCriterion("Payables_id >=", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLessThan(String value) {
            addCriterion("Payables_id <", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLessThanOrEqualTo(String value) {
            addCriterion("Payables_id <=", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLike(String value) {
            addCriterion("Payables_id like", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotLike(String value) {
            addCriterion("Payables_id not like", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdIn(List<String> values) {
            addCriterion("Payables_id in", values, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotIn(List<String> values) {
            addCriterion("Payables_id not in", values, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdBetween(String value1, String value2) {
            addCriterion("Payables_id between", value1, value2, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotBetween(String value1, String value2) {
            addCriterion("Payables_id not between", value1, value2, "payablesId");
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistIsNull() {
            addCriterion("pade_sourcelist is null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistIsNotNull() {
            addCriterion("pade_sourcelist is not null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistEqualTo(String value) {
            addCriterion("pade_sourcelist =", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistNotEqualTo(String value) {
            addCriterion("pade_sourcelist <>", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistGreaterThan(String value) {
            addCriterion("pade_sourcelist >", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistGreaterThanOrEqualTo(String value) {
            addCriterion("pade_sourcelist >=", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistLessThan(String value) {
            addCriterion("pade_sourcelist <", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistLessThanOrEqualTo(String value) {
            addCriterion("pade_sourcelist <=", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistLike(String value) {
            addCriterion("pade_sourcelist like", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistNotLike(String value) {
            addCriterion("pade_sourcelist not like", value, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistIn(List<String> values) {
            addCriterion("pade_sourcelist in", values, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistNotIn(List<String> values) {
            addCriterion("pade_sourcelist not in", values, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistBetween(String value1, String value2) {
            addCriterion("pade_sourcelist between", value1, value2, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcelistNotBetween(String value1, String value2) {
            addCriterion("pade_sourcelist not between", value1, value2, "padeSourcelist");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeIsNull() {
            addCriterion("pade_sourcetime is null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeIsNotNull() {
            addCriterion("pade_sourcetime is not null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeEqualTo(Date value) {
            addCriterionForJDBCDate("pade_sourcetime =", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pade_sourcetime <>", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pade_sourcetime >", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pade_sourcetime >=", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeLessThan(Date value) {
            addCriterionForJDBCDate("pade_sourcetime <", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pade_sourcetime <=", value, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeIn(List<Date> values) {
            addCriterionForJDBCDate("pade_sourcetime in", values, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pade_sourcetime not in", values, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pade_sourcetime between", value1, value2, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pade_sourcetime not between", value1, value2, "padeSourcetime");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberIsNull() {
            addCriterion("pade_sourcenumber is null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberIsNotNull() {
            addCriterion("pade_sourcenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberEqualTo(String value) {
            addCriterion("pade_sourcenumber =", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberNotEqualTo(String value) {
            addCriterion("pade_sourcenumber <>", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberGreaterThan(String value) {
            addCriterion("pade_sourcenumber >", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberGreaterThanOrEqualTo(String value) {
            addCriterion("pade_sourcenumber >=", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberLessThan(String value) {
            addCriterion("pade_sourcenumber <", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberLessThanOrEqualTo(String value) {
            addCriterion("pade_sourcenumber <=", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberLike(String value) {
            addCriterion("pade_sourcenumber like", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberNotLike(String value) {
            addCriterion("pade_sourcenumber not like", value, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberIn(List<String> values) {
            addCriterion("pade_sourcenumber in", values, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberNotIn(List<String> values) {
            addCriterion("pade_sourcenumber not in", values, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberBetween(String value1, String value2) {
            addCriterion("pade_sourcenumber between", value1, value2, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeSourcenumberNotBetween(String value1, String value2) {
            addCriterion("pade_sourcenumber not between", value1, value2, "padeSourcenumber");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoIsNull() {
            addCriterion("pade_invoiceno is null");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoIsNotNull() {
            addCriterion("pade_invoiceno is not null");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoEqualTo(String value) {
            addCriterion("pade_invoiceno =", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoNotEqualTo(String value) {
            addCriterion("pade_invoiceno <>", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoGreaterThan(String value) {
            addCriterion("pade_invoiceno >", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("pade_invoiceno >=", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoLessThan(String value) {
            addCriterion("pade_invoiceno <", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("pade_invoiceno <=", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoLike(String value) {
            addCriterion("pade_invoiceno like", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoNotLike(String value) {
            addCriterion("pade_invoiceno not like", value, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoIn(List<String> values) {
            addCriterion("pade_invoiceno in", values, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoNotIn(List<String> values) {
            addCriterion("pade_invoiceno not in", values, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoBetween(String value1, String value2) {
            addCriterion("pade_invoiceno between", value1, value2, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeInvoicenoNotBetween(String value1, String value2) {
            addCriterion("pade_invoiceno not between", value1, value2, "padeInvoiceno");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionIsNull() {
            addCriterion("pade_transaction is null");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionIsNotNull() {
            addCriterion("pade_transaction is not null");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionEqualTo(String value) {
            addCriterion("pade_transaction =", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionNotEqualTo(String value) {
            addCriterion("pade_transaction <>", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionGreaterThan(String value) {
            addCriterion("pade_transaction >", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("pade_transaction >=", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionLessThan(String value) {
            addCriterion("pade_transaction <", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionLessThanOrEqualTo(String value) {
            addCriterion("pade_transaction <=", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionLike(String value) {
            addCriterion("pade_transaction like", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionNotLike(String value) {
            addCriterion("pade_transaction not like", value, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionIn(List<String> values) {
            addCriterion("pade_transaction in", values, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionNotIn(List<String> values) {
            addCriterion("pade_transaction not in", values, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionBetween(String value1, String value2) {
            addCriterion("pade_transaction between", value1, value2, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionNotBetween(String value1, String value2) {
            addCriterion("pade_transaction not between", value1, value2, "padeTransaction");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameIsNull() {
            addCriterion("pade_transactionname is null");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameIsNotNull() {
            addCriterion("pade_transactionname is not null");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameEqualTo(String value) {
            addCriterion("pade_transactionname =", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameNotEqualTo(String value) {
            addCriterion("pade_transactionname <>", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameGreaterThan(String value) {
            addCriterion("pade_transactionname >", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameGreaterThanOrEqualTo(String value) {
            addCriterion("pade_transactionname >=", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameLessThan(String value) {
            addCriterion("pade_transactionname <", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameLessThanOrEqualTo(String value) {
            addCriterion("pade_transactionname <=", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameLike(String value) {
            addCriterion("pade_transactionname like", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameNotLike(String value) {
            addCriterion("pade_transactionname not like", value, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameIn(List<String> values) {
            addCriterion("pade_transactionname in", values, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameNotIn(List<String> values) {
            addCriterion("pade_transactionname not in", values, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameBetween(String value1, String value2) {
            addCriterion("pade_transactionname between", value1, value2, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTransactionnameNotBetween(String value1, String value2) {
            addCriterion("pade_transactionname not between", value1, value2, "padeTransactionname");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameIsNull() {
            addCriterion("pade_team_name is null");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameIsNotNull() {
            addCriterion("pade_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameEqualTo(String value) {
            addCriterion("pade_team_name =", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameNotEqualTo(String value) {
            addCriterion("pade_team_name <>", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameGreaterThan(String value) {
            addCriterion("pade_team_name >", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("pade_team_name >=", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameLessThan(String value) {
            addCriterion("pade_team_name <", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameLessThanOrEqualTo(String value) {
            addCriterion("pade_team_name <=", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameLike(String value) {
            addCriterion("pade_team_name like", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameNotLike(String value) {
            addCriterion("pade_team_name not like", value, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameIn(List<String> values) {
            addCriterion("pade_team_name in", values, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameNotIn(List<String> values) {
            addCriterion("pade_team_name not in", values, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameBetween(String value1, String value2) {
            addCriterion("pade_team_name between", value1, value2, "padeTeamName");
            return (Criteria) this;
        }

        public Criteria andPadeTeamNameNotBetween(String value1, String value2) {
            addCriterion("pade_team_name not between", value1, value2, "padeTeamName");
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

        public Criteria andPadeStaffNameIsNull() {
            addCriterion("pade_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameIsNotNull() {
            addCriterion("pade_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameEqualTo(String value) {
            addCriterion("pade_staff_name =", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameNotEqualTo(String value) {
            addCriterion("pade_staff_name <>", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameGreaterThan(String value) {
            addCriterion("pade_staff_name >", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("pade_staff_name >=", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameLessThan(String value) {
            addCriterion("pade_staff_name <", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameLessThanOrEqualTo(String value) {
            addCriterion("pade_staff_name <=", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameLike(String value) {
            addCriterion("pade_staff_name like", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameNotLike(String value) {
            addCriterion("pade_staff_name not like", value, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameIn(List<String> values) {
            addCriterion("pade_staff_name in", values, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameNotIn(List<String> values) {
            addCriterion("pade_staff_name not in", values, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameBetween(String value1, String value2) {
            addCriterion("pade_staff_name between", value1, value2, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeStaffNameNotBetween(String value1, String value2) {
            addCriterion("pade_staff_name not between", value1, value2, "padeStaffName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameIsNull() {
            addCriterion("pade_project_name is null");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameIsNotNull() {
            addCriterion("pade_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameEqualTo(String value) {
            addCriterion("pade_project_name =", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameNotEqualTo(String value) {
            addCriterion("pade_project_name <>", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameGreaterThan(String value) {
            addCriterion("pade_project_name >", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("pade_project_name >=", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameLessThan(String value) {
            addCriterion("pade_project_name <", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameLessThanOrEqualTo(String value) {
            addCriterion("pade_project_name <=", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameLike(String value) {
            addCriterion("pade_project_name like", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameNotLike(String value) {
            addCriterion("pade_project_name not like", value, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameIn(List<String> values) {
            addCriterion("pade_project_name in", values, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameNotIn(List<String> values) {
            addCriterion("pade_project_name not in", values, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameBetween(String value1, String value2) {
            addCriterion("pade_project_name between", value1, value2, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeProjectNameNotBetween(String value1, String value2) {
            addCriterion("pade_project_name not between", value1, value2, "padeProjectName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameIsNull() {
            addCriterion("pade_currency_name is null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameIsNotNull() {
            addCriterion("pade_currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameEqualTo(String value) {
            addCriterion("pade_currency_name =", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameNotEqualTo(String value) {
            addCriterion("pade_currency_name <>", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameGreaterThan(String value) {
            addCriterion("pade_currency_name >", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("pade_currency_name >=", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameLessThan(String value) {
            addCriterion("pade_currency_name <", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("pade_currency_name <=", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameLike(String value) {
            addCriterion("pade_currency_name like", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameNotLike(String value) {
            addCriterion("pade_currency_name not like", value, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameIn(List<String> values) {
            addCriterion("pade_currency_name in", values, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameNotIn(List<String> values) {
            addCriterion("pade_currency_name not in", values, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameBetween(String value1, String value2) {
            addCriterion("pade_currency_name between", value1, value2, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("pade_currency_name not between", value1, value2, "padeCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeIsNull() {
            addCriterion("pade_currency_inexchange is null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeIsNotNull() {
            addCriterion("pade_currency_inexchange is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeEqualTo(Integer value) {
            addCriterion("pade_currency_inexchange =", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeNotEqualTo(Integer value) {
            addCriterion("pade_currency_inexchange <>", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeGreaterThan(Integer value) {
            addCriterion("pade_currency_inexchange >", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pade_currency_inexchange >=", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeLessThan(Integer value) {
            addCriterion("pade_currency_inexchange <", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeLessThanOrEqualTo(Integer value) {
            addCriterion("pade_currency_inexchange <=", value, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeIn(List<Integer> values) {
            addCriterion("pade_currency_inexchange in", values, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeNotIn(List<Integer> values) {
            addCriterion("pade_currency_inexchange not in", values, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeBetween(Integer value1, Integer value2) {
            addCriterion("pade_currency_inexchange between", value1, value2, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadeCurrencyInexchangeNotBetween(Integer value1, Integer value2) {
            addCriterion("pade_currency_inexchange not between", value1, value2, "padeCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPadePriceIsNull() {
            addCriterion("pade_price is null");
            return (Criteria) this;
        }

        public Criteria andPadePriceIsNotNull() {
            addCriterion("pade_price is not null");
            return (Criteria) this;
        }

        public Criteria andPadePriceEqualTo(Float value) {
            addCriterion("pade_price =", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceNotEqualTo(Float value) {
            addCriterion("pade_price <>", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceGreaterThan(Float value) {
            addCriterion("pade_price >", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pade_price >=", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceLessThan(Float value) {
            addCriterion("pade_price <", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceLessThanOrEqualTo(Float value) {
            addCriterion("pade_price <=", value, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceIn(List<Float> values) {
            addCriterion("pade_price in", values, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceNotIn(List<Float> values) {
            addCriterion("pade_price not in", values, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceBetween(Float value1, Float value2) {
            addCriterion("pade_price between", value1, value2, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadePriceNotBetween(Float value1, Float value2) {
            addCriterion("pade_price not between", value1, value2, "padePrice");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceIsNull() {
            addCriterion("pade_Currentbalance is null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceIsNotNull() {
            addCriterion("pade_Currentbalance is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceEqualTo(Float value) {
            addCriterion("pade_Currentbalance =", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceNotEqualTo(Float value) {
            addCriterion("pade_Currentbalance <>", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceGreaterThan(Float value) {
            addCriterion("pade_Currentbalance >", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("pade_Currentbalance >=", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceLessThan(Float value) {
            addCriterion("pade_Currentbalance <", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceLessThanOrEqualTo(Float value) {
            addCriterion("pade_Currentbalance <=", value, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceIn(List<Float> values) {
            addCriterion("pade_Currentbalance in", values, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceNotIn(List<Float> values) {
            addCriterion("pade_Currentbalance not in", values, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceBetween(Float value1, Float value2) {
            addCriterion("pade_Currentbalance between", value1, value2, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeCurrentbalanceNotBetween(Float value1, Float value2) {
            addCriterion("pade_Currentbalance not between", value1, value2, "padeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountIsNull() {
            addCriterion("pade_Discountamount is null");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountIsNotNull() {
            addCriterion("pade_Discountamount is not null");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountEqualTo(Float value) {
            addCriterion("pade_Discountamount =", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountNotEqualTo(Float value) {
            addCriterion("pade_Discountamount <>", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountGreaterThan(Float value) {
            addCriterion("pade_Discountamount >", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountGreaterThanOrEqualTo(Float value) {
            addCriterion("pade_Discountamount >=", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountLessThan(Float value) {
            addCriterion("pade_Discountamount <", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountLessThanOrEqualTo(Float value) {
            addCriterion("pade_Discountamount <=", value, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountIn(List<Float> values) {
            addCriterion("pade_Discountamount in", values, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountNotIn(List<Float> values) {
            addCriterion("pade_Discountamount not in", values, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountBetween(Float value1, Float value2) {
            addCriterion("pade_Discountamount between", value1, value2, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeDiscountamountNotBetween(Float value1, Float value2) {
            addCriterion("pade_Discountamount not between", value1, value2, "padeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedIsNull() {
            addCriterion("pade_Amountcharged is null");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedIsNotNull() {
            addCriterion("pade_Amountcharged is not null");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedEqualTo(Float value) {
            addCriterion("pade_Amountcharged =", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedNotEqualTo(Float value) {
            addCriterion("pade_Amountcharged <>", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedGreaterThan(Float value) {
            addCriterion("pade_Amountcharged >", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedGreaterThanOrEqualTo(Float value) {
            addCriterion("pade_Amountcharged >=", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedLessThan(Float value) {
            addCriterion("pade_Amountcharged <", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedLessThanOrEqualTo(Float value) {
            addCriterion("pade_Amountcharged <=", value, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedIn(List<Float> values) {
            addCriterion("pade_Amountcharged in", values, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedNotIn(List<Float> values) {
            addCriterion("pade_Amountcharged not in", values, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedBetween(Float value1, Float value2) {
            addCriterion("pade_Amountcharged between", value1, value2, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeAmountchargedNotBetween(Float value1, Float value2) {
            addCriterion("pade_Amountcharged not between", value1, value2, "padeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountIsNull() {
            addCriterion("pade_Offsetamount is null");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountIsNotNull() {
            addCriterion("pade_Offsetamount is not null");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountEqualTo(Float value) {
            addCriterion("pade_Offsetamount =", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountNotEqualTo(Float value) {
            addCriterion("pade_Offsetamount <>", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountGreaterThan(Float value) {
            addCriterion("pade_Offsetamount >", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountGreaterThanOrEqualTo(Float value) {
            addCriterion("pade_Offsetamount >=", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountLessThan(Float value) {
            addCriterion("pade_Offsetamount <", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountLessThanOrEqualTo(Float value) {
            addCriterion("pade_Offsetamount <=", value, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountIn(List<Float> values) {
            addCriterion("pade_Offsetamount in", values, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountNotIn(List<Float> values) {
            addCriterion("pade_Offsetamount not in", values, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountBetween(Float value1, Float value2) {
            addCriterion("pade_Offsetamount between", value1, value2, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeOffsetamountNotBetween(Float value1, Float value2) {
            addCriterion("pade_Offsetamount not between", value1, value2, "padeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingIsNull() {
            addCriterion("pade_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingIsNotNull() {
            addCriterion("pade_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingEqualTo(String value) {
            addCriterion("pade_Auditing =", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingNotEqualTo(String value) {
            addCriterion("pade_Auditing <>", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingGreaterThan(String value) {
            addCriterion("pade_Auditing >", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("pade_Auditing >=", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingLessThan(String value) {
            addCriterion("pade_Auditing <", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingLessThanOrEqualTo(String value) {
            addCriterion("pade_Auditing <=", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingLike(String value) {
            addCriterion("pade_Auditing like", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingNotLike(String value) {
            addCriterion("pade_Auditing not like", value, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingIn(List<String> values) {
            addCriterion("pade_Auditing in", values, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingNotIn(List<String> values) {
            addCriterion("pade_Auditing not in", values, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingBetween(String value1, String value2) {
            addCriterion("pade_Auditing between", value1, value2, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeAuditingNotBetween(String value1, String value2) {
            addCriterion("pade_Auditing not between", value1, value2, "padeAuditing");
            return (Criteria) this;
        }

        public Criteria andPadeYnIsNull() {
            addCriterion("pade_yn is null");
            return (Criteria) this;
        }

        public Criteria andPadeYnIsNotNull() {
            addCriterion("pade_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPadeYnEqualTo(String value) {
            addCriterion("pade_yn =", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnNotEqualTo(String value) {
            addCriterion("pade_yn <>", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnGreaterThan(String value) {
            addCriterion("pade_yn >", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnGreaterThanOrEqualTo(String value) {
            addCriterion("pade_yn >=", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnLessThan(String value) {
            addCriterion("pade_yn <", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnLessThanOrEqualTo(String value) {
            addCriterion("pade_yn <=", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnLike(String value) {
            addCriterion("pade_yn like", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnNotLike(String value) {
            addCriterion("pade_yn not like", value, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnIn(List<String> values) {
            addCriterion("pade_yn in", values, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnNotIn(List<String> values) {
            addCriterion("pade_yn not in", values, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnBetween(String value1, String value2) {
            addCriterion("pade_yn between", value1, value2, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeYnNotBetween(String value1, String value2) {
            addCriterion("pade_yn not between", value1, value2, "padeYn");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1IsNull() {
            addCriterion("pade_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1IsNotNull() {
            addCriterion("pade_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1EqualTo(String value) {
            addCriterion("pade_custom1 =", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1NotEqualTo(String value) {
            addCriterion("pade_custom1 <>", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1GreaterThan(String value) {
            addCriterion("pade_custom1 >", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pade_custom1 >=", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1LessThan(String value) {
            addCriterion("pade_custom1 <", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1LessThanOrEqualTo(String value) {
            addCriterion("pade_custom1 <=", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1Like(String value) {
            addCriterion("pade_custom1 like", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1NotLike(String value) {
            addCriterion("pade_custom1 not like", value, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1In(List<String> values) {
            addCriterion("pade_custom1 in", values, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1NotIn(List<String> values) {
            addCriterion("pade_custom1 not in", values, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1Between(String value1, String value2) {
            addCriterion("pade_custom1 between", value1, value2, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom1NotBetween(String value1, String value2) {
            addCriterion("pade_custom1 not between", value1, value2, "padeCustom1");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2IsNull() {
            addCriterion("pade_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2IsNotNull() {
            addCriterion("pade_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2EqualTo(String value) {
            addCriterion("pade_custom2 =", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2NotEqualTo(String value) {
            addCriterion("pade_custom2 <>", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2GreaterThan(String value) {
            addCriterion("pade_custom2 >", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pade_custom2 >=", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2LessThan(String value) {
            addCriterion("pade_custom2 <", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2LessThanOrEqualTo(String value) {
            addCriterion("pade_custom2 <=", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2Like(String value) {
            addCriterion("pade_custom2 like", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2NotLike(String value) {
            addCriterion("pade_custom2 not like", value, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2In(List<String> values) {
            addCriterion("pade_custom2 in", values, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2NotIn(List<String> values) {
            addCriterion("pade_custom2 not in", values, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2Between(String value1, String value2) {
            addCriterion("pade_custom2 between", value1, value2, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom2NotBetween(String value1, String value2) {
            addCriterion("pade_custom2 not between", value1, value2, "padeCustom2");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3IsNull() {
            addCriterion("pade_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3IsNotNull() {
            addCriterion("pade_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3EqualTo(String value) {
            addCriterion("pade_custom3 =", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3NotEqualTo(String value) {
            addCriterion("pade_custom3 <>", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3GreaterThan(String value) {
            addCriterion("pade_custom3 >", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pade_custom3 >=", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3LessThan(String value) {
            addCriterion("pade_custom3 <", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3LessThanOrEqualTo(String value) {
            addCriterion("pade_custom3 <=", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3Like(String value) {
            addCriterion("pade_custom3 like", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3NotLike(String value) {
            addCriterion("pade_custom3 not like", value, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3In(List<String> values) {
            addCriterion("pade_custom3 in", values, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3NotIn(List<String> values) {
            addCriterion("pade_custom3 not in", values, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3Between(String value1, String value2) {
            addCriterion("pade_custom3 between", value1, value2, "padeCustom3");
            return (Criteria) this;
        }

        public Criteria andPadeCustom3NotBetween(String value1, String value2) {
            addCriterion("pade_custom3 not between", value1, value2, "padeCustom3");
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