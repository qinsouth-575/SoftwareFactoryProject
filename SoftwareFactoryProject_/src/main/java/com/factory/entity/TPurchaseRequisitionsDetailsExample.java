package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPurchaseRequisitionsDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPurchaseRequisitionsDetailsExample() {
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

        public Criteria andPrdIdIsNull() {
            addCriterion("prd_id is null");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNotNull() {
            addCriterion("prd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrdIdEqualTo(Integer value) {
            addCriterion("prd_id =", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotEqualTo(Integer value) {
            addCriterion("prd_id <>", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThan(Integer value) {
            addCriterion("prd_id >", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_id >=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThan(Integer value) {
            addCriterion("prd_id <", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("prd_id <=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdIn(List<Integer> values) {
            addCriterion("prd_id in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotIn(List<Integer> values) {
            addCriterion("prd_id not in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdBetween(Integer value1, Integer value2) {
            addCriterion("prd_id between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_id not between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberIsNull() {
            addCriterion("prd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberIsNotNull() {
            addCriterion("prd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberEqualTo(String value) {
            addCriterion("prd_document_number =", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberNotEqualTo(String value) {
            addCriterion("prd_document_number <>", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberGreaterThan(String value) {
            addCriterion("prd_document_number >", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("prd_document_number >=", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberLessThan(String value) {
            addCriterion("prd_document_number <", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("prd_document_number <=", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberLike(String value) {
            addCriterion("prd_document_number like", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberNotLike(String value) {
            addCriterion("prd_document_number not like", value, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberIn(List<String> values) {
            addCriterion("prd_document_number in", values, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberNotIn(List<String> values) {
            addCriterion("prd_document_number not in", values, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberBetween(String value1, String value2) {
            addCriterion("prd_document_number between", value1, value2, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("prd_document_number not between", value1, value2, "prdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoIsNull() {
            addCriterion("prd_column_no is null");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoIsNotNull() {
            addCriterion("prd_column_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoEqualTo(String value) {
            addCriterion("prd_column_no =", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoNotEqualTo(String value) {
            addCriterion("prd_column_no <>", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoGreaterThan(String value) {
            addCriterion("prd_column_no >", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoGreaterThanOrEqualTo(String value) {
            addCriterion("prd_column_no >=", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoLessThan(String value) {
            addCriterion("prd_column_no <", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoLessThanOrEqualTo(String value) {
            addCriterion("prd_column_no <=", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoLike(String value) {
            addCriterion("prd_column_no like", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoNotLike(String value) {
            addCriterion("prd_column_no not like", value, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoIn(List<String> values) {
            addCriterion("prd_column_no in", values, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoNotIn(List<String> values) {
            addCriterion("prd_column_no not in", values, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoBetween(String value1, String value2) {
            addCriterion("prd_column_no between", value1, value2, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdColumnNoNotBetween(String value1, String value2) {
            addCriterion("prd_column_no not between", value1, value2, "prdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdIsNull() {
            addCriterion("prd_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdIsNotNull() {
            addCriterion("prd_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdEqualTo(String value) {
            addCriterion("prd_matter_id =", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdNotEqualTo(String value) {
            addCriterion("prd_matter_id <>", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdGreaterThan(String value) {
            addCriterion("prd_matter_id >", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("prd_matter_id >=", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdLessThan(String value) {
            addCriterion("prd_matter_id <", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdLessThanOrEqualTo(String value) {
            addCriterion("prd_matter_id <=", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdLike(String value) {
            addCriterion("prd_matter_id like", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdNotLike(String value) {
            addCriterion("prd_matter_id not like", value, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdIn(List<String> values) {
            addCriterion("prd_matter_id in", values, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdNotIn(List<String> values) {
            addCriterion("prd_matter_id not in", values, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdBetween(String value1, String value2) {
            addCriterion("prd_matter_id between", value1, value2, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterIdNotBetween(String value1, String value2) {
            addCriterion("prd_matter_id not between", value1, value2, "prdMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIsNull() {
            addCriterion("prd_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIsNotNull() {
            addCriterion("prd_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameEqualTo(String value) {
            addCriterion("prd_matter_name =", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotEqualTo(String value) {
            addCriterion("prd_matter_name <>", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameGreaterThan(String value) {
            addCriterion("prd_matter_name >", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_matter_name >=", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLessThan(String value) {
            addCriterion("prd_matter_name <", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLessThanOrEqualTo(String value) {
            addCriterion("prd_matter_name <=", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLike(String value) {
            addCriterion("prd_matter_name like", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotLike(String value) {
            addCriterion("prd_matter_name not like", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIn(List<String> values) {
            addCriterion("prd_matter_name in", values, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotIn(List<String> values) {
            addCriterion("prd_matter_name not in", values, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameBetween(String value1, String value2) {
            addCriterion("prd_matter_name between", value1, value2, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotBetween(String value1, String value2) {
            addCriterion("prd_matter_name not between", value1, value2, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIsNull() {
            addCriterion("prd_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIsNotNull() {
            addCriterion("prd_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsEqualTo(String value) {
            addCriterion("prd_specifications =", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotEqualTo(String value) {
            addCriterion("prd_specifications <>", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsGreaterThan(String value) {
            addCriterion("prd_specifications >", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("prd_specifications >=", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLessThan(String value) {
            addCriterion("prd_specifications <", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("prd_specifications <=", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLike(String value) {
            addCriterion("prd_specifications like", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotLike(String value) {
            addCriterion("prd_specifications not like", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIn(List<String> values) {
            addCriterion("prd_specifications in", values, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotIn(List<String> values) {
            addCriterion("prd_specifications not in", values, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsBetween(String value1, String value2) {
            addCriterion("prd_specifications between", value1, value2, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotBetween(String value1, String value2) {
            addCriterion("prd_specifications not between", value1, value2, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIsNull() {
            addCriterion("prd_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIsNotNull() {
            addCriterion("prd_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameEqualTo(String value) {
            addCriterion("prd_company_name =", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotEqualTo(String value) {
            addCriterion("prd_company_name <>", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameGreaterThan(String value) {
            addCriterion("prd_company_name >", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_company_name >=", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLessThan(String value) {
            addCriterion("prd_company_name <", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("prd_company_name <=", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLike(String value) {
            addCriterion("prd_company_name like", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotLike(String value) {
            addCriterion("prd_company_name not like", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIn(List<String> values) {
            addCriterion("prd_company_name in", values, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotIn(List<String> values) {
            addCriterion("prd_company_name not in", values, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameBetween(String value1, String value2) {
            addCriterion("prd_company_name between", value1, value2, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotBetween(String value1, String value2) {
            addCriterion("prd_company_name not between", value1, value2, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIsNull() {
            addCriterion("prd_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIsNotNull() {
            addCriterion("prd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdAmountEqualTo(Integer value) {
            addCriterion("prd_amount =", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotEqualTo(Integer value) {
            addCriterion("prd_amount <>", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountGreaterThan(Integer value) {
            addCriterion("prd_amount >", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_amount >=", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountLessThan(Integer value) {
            addCriterion("prd_amount <", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountLessThanOrEqualTo(Integer value) {
            addCriterion("prd_amount <=", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIn(List<Integer> values) {
            addCriterion("prd_amount in", values, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotIn(List<Integer> values) {
            addCriterion("prd_amount not in", values, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountBetween(Integer value1, Integer value2) {
            addCriterion("prd_amount between", value1, value2, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_amount not between", value1, value2, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameIsNull() {
            addCriterion("prd_standard_currency_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameIsNotNull() {
            addCriterion("prd_standard_currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameEqualTo(String value) {
            addCriterion("prd_standard_currency_name =", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameNotEqualTo(String value) {
            addCriterion("prd_standard_currency_name <>", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameGreaterThan(String value) {
            addCriterion("prd_standard_currency_name >", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_standard_currency_name >=", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameLessThan(String value) {
            addCriterion("prd_standard_currency_name <", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("prd_standard_currency_name <=", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameLike(String value) {
            addCriterion("prd_standard_currency_name like", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameNotLike(String value) {
            addCriterion("prd_standard_currency_name not like", value, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameIn(List<String> values) {
            addCriterion("prd_standard_currency_name in", values, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameNotIn(List<String> values) {
            addCriterion("prd_standard_currency_name not in", values, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameBetween(String value1, String value2) {
            addCriterion("prd_standard_currency_name between", value1, value2, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("prd_standard_currency_name not between", value1, value2, "prdStandardCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIsNull() {
            addCriterion("prd_standard_price is null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIsNotNull() {
            addCriterion("prd_standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceEqualTo(Float value) {
            addCriterion("prd_standard_price =", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotEqualTo(Float value) {
            addCriterion("prd_standard_price <>", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceGreaterThan(Float value) {
            addCriterion("prd_standard_price >", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_standard_price >=", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceLessThan(Float value) {
            addCriterion("prd_standard_price <", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceLessThanOrEqualTo(Float value) {
            addCriterion("prd_standard_price <=", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIn(List<Float> values) {
            addCriterion("prd_standard_price in", values, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotIn(List<Float> values) {
            addCriterion("prd_standard_price not in", values, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceBetween(Float value1, Float value2) {
            addCriterion("prd_standard_price between", value1, value2, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotBetween(Float value1, Float value2) {
            addCriterion("prd_standard_price not between", value1, value2, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountIsNull() {
            addCriterion("prd_standard_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountIsNotNull() {
            addCriterion("prd_standard_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountEqualTo(Float value) {
            addCriterion("prd_standard_amount =", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountNotEqualTo(Float value) {
            addCriterion("prd_standard_amount <>", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountGreaterThan(Float value) {
            addCriterion("prd_standard_amount >", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_standard_amount >=", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountLessThan(Float value) {
            addCriterion("prd_standard_amount <", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountLessThanOrEqualTo(Float value) {
            addCriterion("prd_standard_amount <=", value, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountIn(List<Float> values) {
            addCriterion("prd_standard_amount in", values, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountNotIn(List<Float> values) {
            addCriterion("prd_standard_amount not in", values, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountBetween(Float value1, Float value2) {
            addCriterion("prd_standard_amount between", value1, value2, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardAmountNotBetween(Float value1, Float value2) {
            addCriterion("prd_standard_amount not between", value1, value2, "prdStandardAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameIsNull() {
            addCriterion("prd_finally_currency_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameIsNotNull() {
            addCriterion("prd_finally_currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameEqualTo(String value) {
            addCriterion("prd_finally_currency_name =", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameNotEqualTo(String value) {
            addCriterion("prd_finally_currency_name <>", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameGreaterThan(String value) {
            addCriterion("prd_finally_currency_name >", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_finally_currency_name >=", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameLessThan(String value) {
            addCriterion("prd_finally_currency_name <", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("prd_finally_currency_name <=", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameLike(String value) {
            addCriterion("prd_finally_currency_name like", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameNotLike(String value) {
            addCriterion("prd_finally_currency_name not like", value, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameIn(List<String> values) {
            addCriterion("prd_finally_currency_name in", values, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameNotIn(List<String> values) {
            addCriterion("prd_finally_currency_name not in", values, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameBetween(String value1, String value2) {
            addCriterion("prd_finally_currency_name between", value1, value2, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("prd_finally_currency_name not between", value1, value2, "prdFinallyCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceIsNull() {
            addCriterion("prd_finally_price is null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceIsNotNull() {
            addCriterion("prd_finally_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceEqualTo(Float value) {
            addCriterion("prd_finally_price =", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceNotEqualTo(Float value) {
            addCriterion("prd_finally_price <>", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceGreaterThan(Float value) {
            addCriterion("prd_finally_price >", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_finally_price >=", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceLessThan(Float value) {
            addCriterion("prd_finally_price <", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceLessThanOrEqualTo(Float value) {
            addCriterion("prd_finally_price <=", value, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceIn(List<Float> values) {
            addCriterion("prd_finally_price in", values, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceNotIn(List<Float> values) {
            addCriterion("prd_finally_price not in", values, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceBetween(Float value1, Float value2) {
            addCriterion("prd_finally_price between", value1, value2, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyPriceNotBetween(Float value1, Float value2) {
            addCriterion("prd_finally_price not between", value1, value2, "prdFinallyPrice");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountIsNull() {
            addCriterion("prd_finally_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountIsNotNull() {
            addCriterion("prd_finally_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountEqualTo(Float value) {
            addCriterion("prd_finally_amount =", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountNotEqualTo(Float value) {
            addCriterion("prd_finally_amount <>", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountGreaterThan(Float value) {
            addCriterion("prd_finally_amount >", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_finally_amount >=", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountLessThan(Float value) {
            addCriterion("prd_finally_amount <", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountLessThanOrEqualTo(Float value) {
            addCriterion("prd_finally_amount <=", value, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountIn(List<Float> values) {
            addCriterion("prd_finally_amount in", values, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountNotIn(List<Float> values) {
            addCriterion("prd_finally_amount not in", values, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountBetween(Float value1, Float value2) {
            addCriterion("prd_finally_amount between", value1, value2, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdFinallyAmountNotBetween(Float value1, Float value2) {
            addCriterion("prd_finally_amount not between", value1, value2, "prdFinallyAmount");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateIsNull() {
            addCriterion("prd_required_date is null");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateIsNotNull() {
            addCriterion("prd_required_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateEqualTo(Date value) {
            addCriterionForJDBCDate("prd_required_date =", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prd_required_date <>", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prd_required_date >", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_required_date >=", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateLessThan(Date value) {
            addCriterionForJDBCDate("prd_required_date <", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_required_date <=", value, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateIn(List<Date> values) {
            addCriterionForJDBCDate("prd_required_date in", values, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prd_required_date not in", values, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_required_date between", value1, value2, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdRequiredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_required_date not between", value1, value2, "prdRequiredDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateIsNull() {
            addCriterion("prd_proposed_date is null");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateIsNotNull() {
            addCriterion("prd_proposed_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateEqualTo(Date value) {
            addCriterionForJDBCDate("prd_proposed_date =", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prd_proposed_date <>", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prd_proposed_date >", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_proposed_date >=", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateLessThan(Date value) {
            addCriterionForJDBCDate("prd_proposed_date <", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_proposed_date <=", value, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateIn(List<Date> values) {
            addCriterionForJDBCDate("prd_proposed_date in", values, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prd_proposed_date not in", values, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_proposed_date between", value1, value2, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdProposedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_proposed_date not between", value1, value2, "prdProposedDate");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityIsNull() {
            addCriterion("prd_not_purchase_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityIsNotNull() {
            addCriterion("prd_not_purchase_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityEqualTo(Integer value) {
            addCriterion("prd_not_purchase_quantity =", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityNotEqualTo(Integer value) {
            addCriterion("prd_not_purchase_quantity <>", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityGreaterThan(Integer value) {
            addCriterion("prd_not_purchase_quantity >", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_not_purchase_quantity >=", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityLessThan(Integer value) {
            addCriterion("prd_not_purchase_quantity <", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("prd_not_purchase_quantity <=", value, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityIn(List<Integer> values) {
            addCriterion("prd_not_purchase_quantity in", values, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityNotIn(List<Integer> values) {
            addCriterion("prd_not_purchase_quantity not in", values, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityBetween(Integer value1, Integer value2) {
            addCriterion("prd_not_purchase_quantity between", value1, value2, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdNotPurchaseQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_not_purchase_quantity not between", value1, value2, "prdNotPurchaseQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIsNull() {
            addCriterion("prd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIsNotNull() {
            addCriterion("prd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksEqualTo(String value) {
            addCriterion("prd_remarks =", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotEqualTo(String value) {
            addCriterion("prd_remarks <>", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksGreaterThan(String value) {
            addCriterion("prd_remarks >", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("prd_remarks >=", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLessThan(String value) {
            addCriterion("prd_remarks <", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLessThanOrEqualTo(String value) {
            addCriterion("prd_remarks <=", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLike(String value) {
            addCriterion("prd_remarks like", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotLike(String value) {
            addCriterion("prd_remarks not like", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIn(List<String> values) {
            addCriterion("prd_remarks in", values, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotIn(List<String> values) {
            addCriterion("prd_remarks not in", values, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksBetween(String value1, String value2) {
            addCriterion("prd_remarks between", value1, value2, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotBetween(String value1, String value2) {
            addCriterion("prd_remarks not between", value1, value2, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIsNull() {
            addCriterion("prd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIsNotNull() {
            addCriterion("prd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderEqualTo(String value) {
            addCriterion("prd_source_order =", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotEqualTo(String value) {
            addCriterion("prd_source_order <>", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderGreaterThan(String value) {
            addCriterion("prd_source_order >", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("prd_source_order >=", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLessThan(String value) {
            addCriterion("prd_source_order <", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("prd_source_order <=", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLike(String value) {
            addCriterion("prd_source_order like", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotLike(String value) {
            addCriterion("prd_source_order not like", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIn(List<String> values) {
            addCriterion("prd_source_order in", values, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotIn(List<String> values) {
            addCriterion("prd_source_order not in", values, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderBetween(String value1, String value2) {
            addCriterion("prd_source_order between", value1, value2, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("prd_source_order not between", value1, value2, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIsNull() {
            addCriterion("prd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIsNotNull() {
            addCriterion("prd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoEqualTo(String value) {
            addCriterion("prd_source_no =", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotEqualTo(String value) {
            addCriterion("prd_source_no <>", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoGreaterThan(String value) {
            addCriterion("prd_source_no >", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("prd_source_no >=", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLessThan(String value) {
            addCriterion("prd_source_no <", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("prd_source_no <=", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLike(String value) {
            addCriterion("prd_source_no like", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotLike(String value) {
            addCriterion("prd_source_no not like", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIn(List<String> values) {
            addCriterion("prd_source_no in", values, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotIn(List<String> values) {
            addCriterion("prd_source_no not in", values, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoBetween(String value1, String value2) {
            addCriterion("prd_source_no between", value1, value2, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotBetween(String value1, String value2) {
            addCriterion("prd_source_no not between", value1, value2, "prdSourceNo");
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