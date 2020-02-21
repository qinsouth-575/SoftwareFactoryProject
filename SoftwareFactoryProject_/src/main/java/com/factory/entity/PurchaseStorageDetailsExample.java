package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class PurchaseStorageDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStorageDetailsExample() {
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

        public Criteria andPsdIdIsNull() {
            addCriterion("psd_id is null");
            return (Criteria) this;
        }

        public Criteria andPsdIdIsNotNull() {
            addCriterion("psd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsdIdEqualTo(Integer value) {
            addCriterion("psd_id =", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotEqualTo(Integer value) {
            addCriterion("psd_id <>", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdGreaterThan(Integer value) {
            addCriterion("psd_id >", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_id >=", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdLessThan(Integer value) {
            addCriterion("psd_id <", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdLessThanOrEqualTo(Integer value) {
            addCriterion("psd_id <=", value, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdIn(List<Integer> values) {
            addCriterion("psd_id in", values, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotIn(List<Integer> values) {
            addCriterion("psd_id not in", values, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdBetween(Integer value1, Integer value2) {
            addCriterion("psd_id between", value1, value2, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_id not between", value1, value2, "psdId");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoIsNull() {
            addCriterion("psd_column_no is null");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoIsNotNull() {
            addCriterion("psd_column_no is not null");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoEqualTo(String value) {
            addCriterion("psd_column_no =", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoNotEqualTo(String value) {
            addCriterion("psd_column_no <>", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoGreaterThan(String value) {
            addCriterion("psd_column_no >", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoGreaterThanOrEqualTo(String value) {
            addCriterion("psd_column_no >=", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoLessThan(String value) {
            addCriterion("psd_column_no <", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoLessThanOrEqualTo(String value) {
            addCriterion("psd_column_no <=", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoLike(String value) {
            addCriterion("psd_column_no like", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoNotLike(String value) {
            addCriterion("psd_column_no not like", value, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoIn(List<String> values) {
            addCriterion("psd_column_no in", values, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoNotIn(List<String> values) {
            addCriterion("psd_column_no not in", values, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoBetween(String value1, String value2) {
            addCriterion("psd_column_no between", value1, value2, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdColumnNoNotBetween(String value1, String value2) {
            addCriterion("psd_column_no not between", value1, value2, "psdColumnNo");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIsNull() {
            addCriterion("psd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIsNotNull() {
            addCriterion("psd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberEqualTo(String value) {
            addCriterion("psd_document_number =", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotEqualTo(String value) {
            addCriterion("psd_document_number <>", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberGreaterThan(String value) {
            addCriterion("psd_document_number >", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("psd_document_number >=", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLessThan(String value) {
            addCriterion("psd_document_number <", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("psd_document_number <=", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberLike(String value) {
            addCriterion("psd_document_number like", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotLike(String value) {
            addCriterion("psd_document_number not like", value, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberIn(List<String> values) {
            addCriterion("psd_document_number in", values, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotIn(List<String> values) {
            addCriterion("psd_document_number not in", values, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberBetween(String value1, String value2) {
            addCriterion("psd_document_number between", value1, value2, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPsdDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("psd_document_number not between", value1, value2, "psdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNull() {
            addCriterion("matter_id is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("matter_id =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("matter_id <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("matter_id >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("matter_id >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("matter_id <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("matter_id <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("matter_id like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("matter_id not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("matter_id in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("matter_id not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("matter_id between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("matter_id not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNull() {
            addCriterion("matter_name is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNotNull() {
            addCriterion("matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameEqualTo(String value) {
            addCriterion("matter_name =", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotEqualTo(String value) {
            addCriterion("matter_name <>", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThan(String value) {
            addCriterion("matter_name >", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_name >=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThan(String value) {
            addCriterion("matter_name <", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThanOrEqualTo(String value) {
            addCriterion("matter_name <=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLike(String value) {
            addCriterion("matter_name like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotLike(String value) {
            addCriterion("matter_name not like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameIn(List<String> values) {
            addCriterion("matter_name in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotIn(List<String> values) {
            addCriterion("matter_name not in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameBetween(String value1, String value2) {
            addCriterion("matter_name between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotBetween(String value1, String value2) {
            addCriterion("matter_name not between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsIsNull() {
            addCriterion("psd_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsIsNotNull() {
            addCriterion("psd_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsEqualTo(String value) {
            addCriterion("psd_specifications =", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsNotEqualTo(String value) {
            addCriterion("psd_specifications <>", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsGreaterThan(String value) {
            addCriterion("psd_specifications >", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("psd_specifications >=", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsLessThan(String value) {
            addCriterion("psd_specifications <", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("psd_specifications <=", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsLike(String value) {
            addCriterion("psd_specifications like", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsNotLike(String value) {
            addCriterion("psd_specifications not like", value, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsIn(List<String> values) {
            addCriterion("psd_specifications in", values, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsNotIn(List<String> values) {
            addCriterion("psd_specifications not in", values, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsBetween(String value1, String value2) {
            addCriterion("psd_specifications between", value1, value2, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdSpecificationsNotBetween(String value1, String value2) {
            addCriterion("psd_specifications not between", value1, value2, "psdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameIsNull() {
            addCriterion("psd_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameIsNotNull() {
            addCriterion("psd_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameEqualTo(String value) {
            addCriterion("psd_company_name =", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameNotEqualTo(String value) {
            addCriterion("psd_company_name <>", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameGreaterThan(String value) {
            addCriterion("psd_company_name >", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("psd_company_name >=", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameLessThan(String value) {
            addCriterion("psd_company_name <", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("psd_company_name <=", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameLike(String value) {
            addCriterion("psd_company_name like", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameNotLike(String value) {
            addCriterion("psd_company_name not like", value, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameIn(List<String> values) {
            addCriterion("psd_company_name in", values, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameNotIn(List<String> values) {
            addCriterion("psd_company_name not in", values, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameBetween(String value1, String value2) {
            addCriterion("psd_company_name between", value1, value2, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdCompanyNameNotBetween(String value1, String value2) {
            addCriterion("psd_company_name not between", value1, value2, "psdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPsdAmountIsNull() {
            addCriterion("psd_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsdAmountIsNotNull() {
            addCriterion("psd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsdAmountEqualTo(Integer value) {
            addCriterion("psd_amount =", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountNotEqualTo(Integer value) {
            addCriterion("psd_amount <>", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountGreaterThan(Integer value) {
            addCriterion("psd_amount >", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_amount >=", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountLessThan(Integer value) {
            addCriterion("psd_amount <", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountLessThanOrEqualTo(Integer value) {
            addCriterion("psd_amount <=", value, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountIn(List<Integer> values) {
            addCriterion("psd_amount in", values, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountNotIn(List<Integer> values) {
            addCriterion("psd_amount not in", values, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountBetween(Integer value1, Integer value2) {
            addCriterion("psd_amount between", value1, value2, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_amount not between", value1, value2, "psdAmount");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeIsNull() {
            addCriterion("psd_money_discount_before is null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeIsNotNull() {
            addCriterion("psd_money_discount_before is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeEqualTo(Float value) {
            addCriterion("psd_money_discount_before =", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeNotEqualTo(Float value) {
            addCriterion("psd_money_discount_before <>", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeGreaterThan(Float value) {
            addCriterion("psd_money_discount_before >", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_money_discount_before >=", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeLessThan(Float value) {
            addCriterion("psd_money_discount_before <", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeLessThanOrEqualTo(Float value) {
            addCriterion("psd_money_discount_before <=", value, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeIn(List<Float> values) {
            addCriterion("psd_money_discount_before in", values, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeNotIn(List<Float> values) {
            addCriterion("psd_money_discount_before not in", values, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeBetween(Float value1, Float value2) {
            addCriterion("psd_money_discount_before between", value1, value2, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyDiscountBeforeNotBetween(Float value1, Float value2) {
            addCriterion("psd_money_discount_before not between", value1, value2, "psdMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberIsNull() {
            addCriterion("psd_fold_number is null");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberIsNotNull() {
            addCriterion("psd_fold_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberEqualTo(String value) {
            addCriterion("psd_fold_number =", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberNotEqualTo(String value) {
            addCriterion("psd_fold_number <>", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberGreaterThan(String value) {
            addCriterion("psd_fold_number >", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberGreaterThanOrEqualTo(String value) {
            addCriterion("psd_fold_number >=", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberLessThan(String value) {
            addCriterion("psd_fold_number <", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberLessThanOrEqualTo(String value) {
            addCriterion("psd_fold_number <=", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberLike(String value) {
            addCriterion("psd_fold_number like", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberNotLike(String value) {
            addCriterion("psd_fold_number not like", value, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberIn(List<String> values) {
            addCriterion("psd_fold_number in", values, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberNotIn(List<String> values) {
            addCriterion("psd_fold_number not in", values, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberBetween(String value1, String value2) {
            addCriterion("psd_fold_number between", value1, value2, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdFoldNumberNotBetween(String value1, String value2) {
            addCriterion("psd_fold_number not between", value1, value2, "psdFoldNumber");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIsNull() {
            addCriterion("psd_price is null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIsNotNull() {
            addCriterion("psd_price is not null");
            return (Criteria) this;
        }

        public Criteria andPsdPriceEqualTo(Float value) {
            addCriterion("psd_price =", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotEqualTo(Float value) {
            addCriterion("psd_price <>", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceGreaterThan(Float value) {
            addCriterion("psd_price >", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_price >=", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceLessThan(Float value) {
            addCriterion("psd_price <", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceLessThanOrEqualTo(Float value) {
            addCriterion("psd_price <=", value, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceIn(List<Float> values) {
            addCriterion("psd_price in", values, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotIn(List<Float> values) {
            addCriterion("psd_price not in", values, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceBetween(Float value1, Float value2) {
            addCriterion("psd_price between", value1, value2, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdPriceNotBetween(Float value1, Float value2) {
            addCriterion("psd_price not between", value1, value2, "psdPrice");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIsNull() {
            addCriterion("psd_money is null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIsNotNull() {
            addCriterion("psd_money is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyEqualTo(Float value) {
            addCriterion("psd_money =", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotEqualTo(Float value) {
            addCriterion("psd_money <>", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyGreaterThan(Float value) {
            addCriterion("psd_money >", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_money >=", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyLessThan(Float value) {
            addCriterion("psd_money <", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("psd_money <=", value, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyIn(List<Float> values) {
            addCriterion("psd_money in", values, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotIn(List<Float> values) {
            addCriterion("psd_money not in", values, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyBetween(Float value1, Float value2) {
            addCriterion("psd_money between", value1, value2, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("psd_money not between", value1, value2, "psdMoney");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIsNull() {
            addCriterion("psd_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIsNotNull() {
            addCriterion("psd_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateEqualTo(Float value) {
            addCriterion("psd_tax_rate =", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotEqualTo(Float value) {
            addCriterion("psd_tax_rate <>", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateGreaterThan(Float value) {
            addCriterion("psd_tax_rate >", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_tax_rate >=", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateLessThan(Float value) {
            addCriterion("psd_tax_rate <", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("psd_tax_rate <=", value, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateIn(List<Float> values) {
            addCriterion("psd_tax_rate in", values, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotIn(List<Float> values) {
            addCriterion("psd_tax_rate not in", values, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateBetween(Float value1, Float value2) {
            addCriterion("psd_tax_rate between", value1, value2, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("psd_tax_rate not between", value1, value2, "psdTaxRate");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIsNull() {
            addCriterion("psd_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIsNotNull() {
            addCriterion("psd_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountEqualTo(Float value) {
            addCriterion("psd_tax_amount =", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotEqualTo(Float value) {
            addCriterion("psd_tax_amount <>", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountGreaterThan(Float value) {
            addCriterion("psd_tax_amount >", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_tax_amount >=", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountLessThan(Float value) {
            addCriterion("psd_tax_amount <", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("psd_tax_amount <=", value, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountIn(List<Float> values) {
            addCriterion("psd_tax_amount in", values, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotIn(List<Float> values) {
            addCriterion("psd_tax_amount not in", values, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountBetween(Float value1, Float value2) {
            addCriterion("psd_tax_amount between", value1, value2, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("psd_tax_amount not between", value1, value2, "psdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIsNull() {
            addCriterion("psd_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIsNotNull() {
            addCriterion("psd_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountEqualTo(Float value) {
            addCriterion("psd_including_tax_amount =", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("psd_including_tax_amount <>", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("psd_including_tax_amount >", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("psd_including_tax_amount >=", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountLessThan(Float value) {
            addCriterion("psd_including_tax_amount <", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("psd_including_tax_amount <=", value, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountIn(List<Float> values) {
            addCriterion("psd_including_tax_amount in", values, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("psd_including_tax_amount not in", values, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("psd_including_tax_amount between", value1, value2, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("psd_including_tax_amount not between", value1, value2, "psdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberIsNull() {
            addCriterion("psd_lot_number is null");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberIsNotNull() {
            addCriterion("psd_lot_number is not null");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberEqualTo(String value) {
            addCriterion("psd_lot_number =", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberNotEqualTo(String value) {
            addCriterion("psd_lot_number <>", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberGreaterThan(String value) {
            addCriterion("psd_lot_number >", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberGreaterThanOrEqualTo(String value) {
            addCriterion("psd_lot_number >=", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberLessThan(String value) {
            addCriterion("psd_lot_number <", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberLessThanOrEqualTo(String value) {
            addCriterion("psd_lot_number <=", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberLike(String value) {
            addCriterion("psd_lot_number like", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberNotLike(String value) {
            addCriterion("psd_lot_number not like", value, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberIn(List<String> values) {
            addCriterion("psd_lot_number in", values, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberNotIn(List<String> values) {
            addCriterion("psd_lot_number not in", values, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberBetween(String value1, String value2) {
            addCriterion("psd_lot_number between", value1, value2, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdLotNumberNotBetween(String value1, String value2) {
            addCriterion("psd_lot_number not between", value1, value2, "psdLotNumber");
            return (Criteria) this;
        }

        public Criteria andPsdGiftIsNull() {
            addCriterion("psd_gift is null");
            return (Criteria) this;
        }

        public Criteria andPsdGiftIsNotNull() {
            addCriterion("psd_gift is not null");
            return (Criteria) this;
        }

        public Criteria andPsdGiftEqualTo(String value) {
            addCriterion("psd_gift =", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftNotEqualTo(String value) {
            addCriterion("psd_gift <>", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftGreaterThan(String value) {
            addCriterion("psd_gift >", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftGreaterThanOrEqualTo(String value) {
            addCriterion("psd_gift >=", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftLessThan(String value) {
            addCriterion("psd_gift <", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftLessThanOrEqualTo(String value) {
            addCriterion("psd_gift <=", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftLike(String value) {
            addCriterion("psd_gift like", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftNotLike(String value) {
            addCriterion("psd_gift not like", value, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftIn(List<String> values) {
            addCriterion("psd_gift in", values, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftNotIn(List<String> values) {
            addCriterion("psd_gift not in", values, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftBetween(String value1, String value2) {
            addCriterion("psd_gift between", value1, value2, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdGiftNotBetween(String value1, String value2) {
            addCriterion("psd_gift not between", value1, value2, "psdGift");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNull() {
            addCriterion("psd_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNotNull() {
            addCriterion("psd_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsEqualTo(String value) {
            addCriterion("psd_invoice_details =", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotEqualTo(String value) {
            addCriterion("psd_invoice_details <>", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThan(String value) {
            addCriterion("psd_invoice_details >", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details >=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThan(String value) {
            addCriterion("psd_invoice_details <", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details <=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLike(String value) {
            addCriterion("psd_invoice_details like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotLike(String value) {
            addCriterion("psd_invoice_details not like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIn(List<String> values) {
            addCriterion("psd_invoice_details in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotIn(List<String> values) {
            addCriterion("psd_invoice_details not in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("psd_invoice_details between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("psd_invoice_details not between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityIsNull() {
            addCriterion("psd_uninvoiced_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityIsNotNull() {
            addCriterion("psd_uninvoiced_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityEqualTo(String value) {
            addCriterion("psd_uninvoiced_quantity =", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityNotEqualTo(String value) {
            addCriterion("psd_uninvoiced_quantity <>", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityGreaterThan(String value) {
            addCriterion("psd_uninvoiced_quantity >", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("psd_uninvoiced_quantity >=", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityLessThan(String value) {
            addCriterion("psd_uninvoiced_quantity <", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityLessThanOrEqualTo(String value) {
            addCriterion("psd_uninvoiced_quantity <=", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityLike(String value) {
            addCriterion("psd_uninvoiced_quantity like", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityNotLike(String value) {
            addCriterion("psd_uninvoiced_quantity not like", value, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityIn(List<String> values) {
            addCriterion("psd_uninvoiced_quantity in", values, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityNotIn(List<String> values) {
            addCriterion("psd_uninvoiced_quantity not in", values, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityBetween(String value1, String value2) {
            addCriterion("psd_uninvoiced_quantity between", value1, value2, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdUninvoicedQuantityNotBetween(String value1, String value2) {
            addCriterion("psd_uninvoiced_quantity not between", value1, value2, "psdUninvoicedQuantity");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIsNull() {
            addCriterion("psd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIsNotNull() {
            addCriterion("psd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksEqualTo(String value) {
            addCriterion("psd_remarks =", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotEqualTo(String value) {
            addCriterion("psd_remarks <>", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksGreaterThan(String value) {
            addCriterion("psd_remarks >", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("psd_remarks >=", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLessThan(String value) {
            addCriterion("psd_remarks <", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLessThanOrEqualTo(String value) {
            addCriterion("psd_remarks <=", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksLike(String value) {
            addCriterion("psd_remarks like", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotLike(String value) {
            addCriterion("psd_remarks not like", value, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksIn(List<String> values) {
            addCriterion("psd_remarks in", values, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotIn(List<String> values) {
            addCriterion("psd_remarks not in", values, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksBetween(String value1, String value2) {
            addCriterion("psd_remarks between", value1, value2, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdRemarksNotBetween(String value1, String value2) {
            addCriterion("psd_remarks not between", value1, value2, "psdRemarks");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIsNull() {
            addCriterion("psd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIsNotNull() {
            addCriterion("psd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderEqualTo(String value) {
            addCriterion("psd_source_order =", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotEqualTo(String value) {
            addCriterion("psd_source_order <>", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderGreaterThan(String value) {
            addCriterion("psd_source_order >", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("psd_source_order >=", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLessThan(String value) {
            addCriterion("psd_source_order <", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("psd_source_order <=", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderLike(String value) {
            addCriterion("psd_source_order like", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotLike(String value) {
            addCriterion("psd_source_order not like", value, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderIn(List<String> values) {
            addCriterion("psd_source_order in", values, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotIn(List<String> values) {
            addCriterion("psd_source_order not in", values, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderBetween(String value1, String value2) {
            addCriterion("psd_source_order between", value1, value2, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("psd_source_order not between", value1, value2, "psdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIsNull() {
            addCriterion("psd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIsNotNull() {
            addCriterion("psd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoEqualTo(String value) {
            addCriterion("psd_source_no =", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotEqualTo(String value) {
            addCriterion("psd_source_no <>", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoGreaterThan(String value) {
            addCriterion("psd_source_no >", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("psd_source_no >=", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLessThan(String value) {
            addCriterion("psd_source_no <", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("psd_source_no <=", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoLike(String value) {
            addCriterion("psd_source_no like", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotLike(String value) {
            addCriterion("psd_source_no not like", value, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoIn(List<String> values) {
            addCriterion("psd_source_no in", values, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotIn(List<String> values) {
            addCriterion("psd_source_no not in", values, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoBetween(String value1, String value2) {
            addCriterion("psd_source_no between", value1, value2, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdSourceNoNotBetween(String value1, String value2) {
            addCriterion("psd_source_no not between", value1, value2, "psdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchIsNull() {
            addCriterion("psd_went_dutch is null");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchIsNotNull() {
            addCriterion("psd_went_dutch is not null");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchEqualTo(String value) {
            addCriterion("psd_went_dutch =", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchNotEqualTo(String value) {
            addCriterion("psd_went_dutch <>", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchGreaterThan(String value) {
            addCriterion("psd_went_dutch >", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchGreaterThanOrEqualTo(String value) {
            addCriterion("psd_went_dutch >=", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchLessThan(String value) {
            addCriterion("psd_went_dutch <", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchLessThanOrEqualTo(String value) {
            addCriterion("psd_went_dutch <=", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchLike(String value) {
            addCriterion("psd_went_dutch like", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchNotLike(String value) {
            addCriterion("psd_went_dutch not like", value, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchIn(List<String> values) {
            addCriterion("psd_went_dutch in", values, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchNotIn(List<String> values) {
            addCriterion("psd_went_dutch not in", values, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchBetween(String value1, String value2) {
            addCriterion("psd_went_dutch between", value1, value2, "psdWentDutch");
            return (Criteria) this;
        }

        public Criteria andPsdWentDutchNotBetween(String value1, String value2) {
            addCriterion("psd_went_dutch not between", value1, value2, "psdWentDutch");
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