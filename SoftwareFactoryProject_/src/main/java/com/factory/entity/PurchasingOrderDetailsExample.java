package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class PurchasingOrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchasingOrderDetailsExample() {
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

        public Criteria andPodIdIsNull() {
            addCriterion("pod_id is null");
            return (Criteria) this;
        }

        public Criteria andPodIdIsNotNull() {
            addCriterion("pod_id is not null");
            return (Criteria) this;
        }

        public Criteria andPodIdEqualTo(String value) {
            addCriterion("pod_id =", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdNotEqualTo(String value) {
            addCriterion("pod_id <>", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdGreaterThan(String value) {
            addCriterion("pod_id >", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdGreaterThanOrEqualTo(String value) {
            addCriterion("pod_id >=", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdLessThan(String value) {
            addCriterion("pod_id <", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdLessThanOrEqualTo(String value) {
            addCriterion("pod_id <=", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdLike(String value) {
            addCriterion("pod_id like", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdNotLike(String value) {
            addCriterion("pod_id not like", value, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdIn(List<String> values) {
            addCriterion("pod_id in", values, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdNotIn(List<String> values) {
            addCriterion("pod_id not in", values, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdBetween(String value1, String value2) {
            addCriterion("pod_id between", value1, value2, "podId");
            return (Criteria) this;
        }

        public Criteria andPodIdNotBetween(String value1, String value2) {
            addCriterion("pod_id not between", value1, value2, "podId");
            return (Criteria) this;
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

        public Criteria andPoMatterIdIsNull() {
            addCriterion("po_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdIsNotNull() {
            addCriterion("po_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdEqualTo(String value) {
            addCriterion("po_matter_id =", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdNotEqualTo(String value) {
            addCriterion("po_matter_id <>", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdGreaterThan(String value) {
            addCriterion("po_matter_id >", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("po_matter_id >=", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdLessThan(String value) {
            addCriterion("po_matter_id <", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdLessThanOrEqualTo(String value) {
            addCriterion("po_matter_id <=", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdLike(String value) {
            addCriterion("po_matter_id like", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdNotLike(String value) {
            addCriterion("po_matter_id not like", value, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdIn(List<String> values) {
            addCriterion("po_matter_id in", values, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdNotIn(List<String> values) {
            addCriterion("po_matter_id not in", values, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdBetween(String value1, String value2) {
            addCriterion("po_matter_id between", value1, value2, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPoMatterIdNotBetween(String value1, String value2) {
            addCriterion("po_matter_id not between", value1, value2, "poMatterId");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameIsNull() {
            addCriterion("pod_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameIsNotNull() {
            addCriterion("pod_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameEqualTo(String value) {
            addCriterion("pod_matter_name =", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameNotEqualTo(String value) {
            addCriterion("pod_matter_name <>", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameGreaterThan(String value) {
            addCriterion("pod_matter_name >", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("pod_matter_name >=", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameLessThan(String value) {
            addCriterion("pod_matter_name <", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameLessThanOrEqualTo(String value) {
            addCriterion("pod_matter_name <=", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameLike(String value) {
            addCriterion("pod_matter_name like", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameNotLike(String value) {
            addCriterion("pod_matter_name not like", value, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameIn(List<String> values) {
            addCriterion("pod_matter_name in", values, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameNotIn(List<String> values) {
            addCriterion("pod_matter_name not in", values, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameBetween(String value1, String value2) {
            addCriterion("pod_matter_name between", value1, value2, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodMatterNameNotBetween(String value1, String value2) {
            addCriterion("pod_matter_name not between", value1, value2, "podMatterName");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsIsNull() {
            addCriterion("pod_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsIsNotNull() {
            addCriterion("pod_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsEqualTo(String value) {
            addCriterion("pod_specifications =", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsNotEqualTo(String value) {
            addCriterion("pod_specifications <>", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsGreaterThan(String value) {
            addCriterion("pod_specifications >", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("pod_specifications >=", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsLessThan(String value) {
            addCriterion("pod_specifications <", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("pod_specifications <=", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsLike(String value) {
            addCriterion("pod_specifications like", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsNotLike(String value) {
            addCriterion("pod_specifications not like", value, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsIn(List<String> values) {
            addCriterion("pod_specifications in", values, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsNotIn(List<String> values) {
            addCriterion("pod_specifications not in", values, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsBetween(String value1, String value2) {
            addCriterion("pod_specifications between", value1, value2, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodSpecificationsNotBetween(String value1, String value2) {
            addCriterion("pod_specifications not between", value1, value2, "podSpecifications");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameIsNull() {
            addCriterion("pod_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameIsNotNull() {
            addCriterion("pod_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameEqualTo(String value) {
            addCriterion("pod_company_name =", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameNotEqualTo(String value) {
            addCriterion("pod_company_name <>", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameGreaterThan(String value) {
            addCriterion("pod_company_name >", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("pod_company_name >=", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameLessThan(String value) {
            addCriterion("pod_company_name <", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("pod_company_name <=", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameLike(String value) {
            addCriterion("pod_company_name like", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameNotLike(String value) {
            addCriterion("pod_company_name not like", value, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameIn(List<String> values) {
            addCriterion("pod_company_name in", values, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameNotIn(List<String> values) {
            addCriterion("pod_company_name not in", values, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameBetween(String value1, String value2) {
            addCriterion("pod_company_name between", value1, value2, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodCompanyNameNotBetween(String value1, String value2) {
            addCriterion("pod_company_name not between", value1, value2, "podCompanyName");
            return (Criteria) this;
        }

        public Criteria andPodAmountIsNull() {
            addCriterion("pod_amount is null");
            return (Criteria) this;
        }

        public Criteria andPodAmountIsNotNull() {
            addCriterion("pod_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPodAmountEqualTo(Integer value) {
            addCriterion("pod_amount =", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountNotEqualTo(Integer value) {
            addCriterion("pod_amount <>", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountGreaterThan(Integer value) {
            addCriterion("pod_amount >", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pod_amount >=", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountLessThan(Integer value) {
            addCriterion("pod_amount <", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pod_amount <=", value, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountIn(List<Integer> values) {
            addCriterion("pod_amount in", values, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountNotIn(List<Integer> values) {
            addCriterion("pod_amount not in", values, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountBetween(Integer value1, Integer value2) {
            addCriterion("pod_amount between", value1, value2, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pod_amount not between", value1, value2, "podAmount");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeIsNull() {
            addCriterion("pod_money_discount_before is null");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeIsNotNull() {
            addCriterion("pod_money_discount_before is not null");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeEqualTo(Float value) {
            addCriterion("pod_money_discount_before =", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeNotEqualTo(Float value) {
            addCriterion("pod_money_discount_before <>", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeGreaterThan(Float value) {
            addCriterion("pod_money_discount_before >", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_money_discount_before >=", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeLessThan(Float value) {
            addCriterion("pod_money_discount_before <", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeLessThanOrEqualTo(Float value) {
            addCriterion("pod_money_discount_before <=", value, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeIn(List<Float> values) {
            addCriterion("pod_money_discount_before in", values, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeNotIn(List<Float> values) {
            addCriterion("pod_money_discount_before not in", values, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeBetween(Float value1, Float value2) {
            addCriterion("pod_money_discount_before between", value1, value2, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodMoneyDiscountBeforeNotBetween(Float value1, Float value2) {
            addCriterion("pod_money_discount_before not between", value1, value2, "podMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberIsNull() {
            addCriterion("pod_discount_number is null");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberIsNotNull() {
            addCriterion("pod_discount_number is not null");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberEqualTo(String value) {
            addCriterion("pod_discount_number =", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberNotEqualTo(String value) {
            addCriterion("pod_discount_number <>", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberGreaterThan(String value) {
            addCriterion("pod_discount_number >", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pod_discount_number >=", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberLessThan(String value) {
            addCriterion("pod_discount_number <", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberLessThanOrEqualTo(String value) {
            addCriterion("pod_discount_number <=", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberLike(String value) {
            addCriterion("pod_discount_number like", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberNotLike(String value) {
            addCriterion("pod_discount_number not like", value, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberIn(List<String> values) {
            addCriterion("pod_discount_number in", values, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberNotIn(List<String> values) {
            addCriterion("pod_discount_number not in", values, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberBetween(String value1, String value2) {
            addCriterion("pod_discount_number between", value1, value2, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodDiscountNumberNotBetween(String value1, String value2) {
            addCriterion("pod_discount_number not between", value1, value2, "podDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andPodPriceIsNull() {
            addCriterion("pod_price is null");
            return (Criteria) this;
        }

        public Criteria andPodPriceIsNotNull() {
            addCriterion("pod_price is not null");
            return (Criteria) this;
        }

        public Criteria andPodPriceEqualTo(Float value) {
            addCriterion("pod_price =", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceNotEqualTo(Float value) {
            addCriterion("pod_price <>", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceGreaterThan(Float value) {
            addCriterion("pod_price >", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_price >=", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceLessThan(Float value) {
            addCriterion("pod_price <", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceLessThanOrEqualTo(Float value) {
            addCriterion("pod_price <=", value, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceIn(List<Float> values) {
            addCriterion("pod_price in", values, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceNotIn(List<Float> values) {
            addCriterion("pod_price not in", values, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceBetween(Float value1, Float value2) {
            addCriterion("pod_price between", value1, value2, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodPriceNotBetween(Float value1, Float value2) {
            addCriterion("pod_price not between", value1, value2, "podPrice");
            return (Criteria) this;
        }

        public Criteria andPodMoneyIsNull() {
            addCriterion("pod_money is null");
            return (Criteria) this;
        }

        public Criteria andPodMoneyIsNotNull() {
            addCriterion("pod_money is not null");
            return (Criteria) this;
        }

        public Criteria andPodMoneyEqualTo(Float value) {
            addCriterion("pod_money =", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyNotEqualTo(Float value) {
            addCriterion("pod_money <>", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyGreaterThan(Float value) {
            addCriterion("pod_money >", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_money >=", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyLessThan(Float value) {
            addCriterion("pod_money <", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyLessThanOrEqualTo(Float value) {
            addCriterion("pod_money <=", value, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyIn(List<Float> values) {
            addCriterion("pod_money in", values, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyNotIn(List<Float> values) {
            addCriterion("pod_money not in", values, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyBetween(Float value1, Float value2) {
            addCriterion("pod_money between", value1, value2, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodMoneyNotBetween(Float value1, Float value2) {
            addCriterion("pod_money not between", value1, value2, "podMoney");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateIsNull() {
            addCriterion("pod_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateIsNotNull() {
            addCriterion("pod_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateEqualTo(Float value) {
            addCriterion("pod_tax_rate =", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateNotEqualTo(Float value) {
            addCriterion("pod_tax_rate <>", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateGreaterThan(Float value) {
            addCriterion("pod_tax_rate >", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_tax_rate >=", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateLessThan(Float value) {
            addCriterion("pod_tax_rate <", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("pod_tax_rate <=", value, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateIn(List<Float> values) {
            addCriterion("pod_tax_rate in", values, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateNotIn(List<Float> values) {
            addCriterion("pod_tax_rate not in", values, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateBetween(Float value1, Float value2) {
            addCriterion("pod_tax_rate between", value1, value2, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("pod_tax_rate not between", value1, value2, "podTaxRate");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountIsNull() {
            addCriterion("pod_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountIsNotNull() {
            addCriterion("pod_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountEqualTo(Float value) {
            addCriterion("pod_tax_amount =", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountNotEqualTo(Float value) {
            addCriterion("pod_tax_amount <>", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountGreaterThan(Float value) {
            addCriterion("pod_tax_amount >", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_tax_amount >=", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountLessThan(Float value) {
            addCriterion("pod_tax_amount <", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pod_tax_amount <=", value, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountIn(List<Float> values) {
            addCriterion("pod_tax_amount in", values, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountNotIn(List<Float> values) {
            addCriterion("pod_tax_amount not in", values, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pod_tax_amount between", value1, value2, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pod_tax_amount not between", value1, value2, "podTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountIsNull() {
            addCriterion("pod_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountIsNotNull() {
            addCriterion("pod_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountEqualTo(Float value) {
            addCriterion("pod_include_tax_amount =", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("pod_include_tax_amount <>", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("pod_include_tax_amount >", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pod_include_tax_amount >=", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountLessThan(Float value) {
            addCriterion("pod_include_tax_amount <", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pod_include_tax_amount <=", value, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountIn(List<Float> values) {
            addCriterion("pod_include_tax_amount in", values, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("pod_include_tax_amount not in", values, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pod_include_tax_amount between", value1, value2, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pod_include_tax_amount not between", value1, value2, "podIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateIsNull() {
            addCriterion("pod_beforehand_laidup_date is null");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateIsNotNull() {
            addCriterion("pod_beforehand_laidup_date is not null");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateEqualTo(String value) {
            addCriterion("pod_beforehand_laidup_date =", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateNotEqualTo(String value) {
            addCriterion("pod_beforehand_laidup_date <>", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateGreaterThan(String value) {
            addCriterion("pod_beforehand_laidup_date >", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateGreaterThanOrEqualTo(String value) {
            addCriterion("pod_beforehand_laidup_date >=", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateLessThan(String value) {
            addCriterion("pod_beforehand_laidup_date <", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateLessThanOrEqualTo(String value) {
            addCriterion("pod_beforehand_laidup_date <=", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateLike(String value) {
            addCriterion("pod_beforehand_laidup_date like", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateNotLike(String value) {
            addCriterion("pod_beforehand_laidup_date not like", value, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateIn(List<String> values) {
            addCriterion("pod_beforehand_laidup_date in", values, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateNotIn(List<String> values) {
            addCriterion("pod_beforehand_laidup_date not in", values, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateBetween(String value1, String value2) {
            addCriterion("pod_beforehand_laidup_date between", value1, value2, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodBeforehandLaidupDateNotBetween(String value1, String value2) {
            addCriterion("pod_beforehand_laidup_date not between", value1, value2, "podBeforehandLaidupDate");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumIsNull() {
            addCriterion("pod_not_laiup_num is null");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumIsNotNull() {
            addCriterion("pod_not_laiup_num is not null");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumEqualTo(Integer value) {
            addCriterion("pod_not_laiup_num =", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumNotEqualTo(Integer value) {
            addCriterion("pod_not_laiup_num <>", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumGreaterThan(Integer value) {
            addCriterion("pod_not_laiup_num >", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pod_not_laiup_num >=", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumLessThan(Integer value) {
            addCriterion("pod_not_laiup_num <", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumLessThanOrEqualTo(Integer value) {
            addCriterion("pod_not_laiup_num <=", value, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumIn(List<Integer> values) {
            addCriterion("pod_not_laiup_num in", values, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumNotIn(List<Integer> values) {
            addCriterion("pod_not_laiup_num not in", values, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumBetween(Integer value1, Integer value2) {
            addCriterion("pod_not_laiup_num between", value1, value2, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodNotLaiupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pod_not_laiup_num not between", value1, value2, "podNotLaiupNum");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftIsNull() {
            addCriterion("pod_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftIsNotNull() {
            addCriterion("pod_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftEqualTo(String value) {
            addCriterion("pod_ifgift =", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftNotEqualTo(String value) {
            addCriterion("pod_ifgift <>", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftGreaterThan(String value) {
            addCriterion("pod_ifgift >", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("pod_ifgift >=", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftLessThan(String value) {
            addCriterion("pod_ifgift <", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftLessThanOrEqualTo(String value) {
            addCriterion("pod_ifgift <=", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftLike(String value) {
            addCriterion("pod_ifgift like", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftNotLike(String value) {
            addCriterion("pod_ifgift not like", value, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftIn(List<String> values) {
            addCriterion("pod_ifgift in", values, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftNotIn(List<String> values) {
            addCriterion("pod_ifgift not in", values, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftBetween(String value1, String value2) {
            addCriterion("pod_ifgift between", value1, value2, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodIfgiftNotBetween(String value1, String value2) {
            addCriterion("pod_ifgift not between", value1, value2, "podIfgift");
            return (Criteria) this;
        }

        public Criteria andPodRemarksIsNull() {
            addCriterion("pod_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPodRemarksIsNotNull() {
            addCriterion("pod_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPodRemarksEqualTo(String value) {
            addCriterion("pod_remarks =", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksNotEqualTo(String value) {
            addCriterion("pod_remarks <>", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksGreaterThan(String value) {
            addCriterion("pod_remarks >", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("pod_remarks >=", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksLessThan(String value) {
            addCriterion("pod_remarks <", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksLessThanOrEqualTo(String value) {
            addCriterion("pod_remarks <=", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksLike(String value) {
            addCriterion("pod_remarks like", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksNotLike(String value) {
            addCriterion("pod_remarks not like", value, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksIn(List<String> values) {
            addCriterion("pod_remarks in", values, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksNotIn(List<String> values) {
            addCriterion("pod_remarks not in", values, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksBetween(String value1, String value2) {
            addCriterion("pod_remarks between", value1, value2, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodRemarksNotBetween(String value1, String value2) {
            addCriterion("pod_remarks not between", value1, value2, "podRemarks");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderIsNull() {
            addCriterion("pod_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderIsNotNull() {
            addCriterion("pod_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderEqualTo(String value) {
            addCriterion("pod_source_order =", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderNotEqualTo(String value) {
            addCriterion("pod_source_order <>", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderGreaterThan(String value) {
            addCriterion("pod_source_order >", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("pod_source_order >=", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderLessThan(String value) {
            addCriterion("pod_source_order <", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("pod_source_order <=", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderLike(String value) {
            addCriterion("pod_source_order like", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderNotLike(String value) {
            addCriterion("pod_source_order not like", value, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderIn(List<String> values) {
            addCriterion("pod_source_order in", values, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderNotIn(List<String> values) {
            addCriterion("pod_source_order not in", values, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderBetween(String value1, String value2) {
            addCriterion("pod_source_order between", value1, value2, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceOrderNotBetween(String value1, String value2) {
            addCriterion("pod_source_order not between", value1, value2, "podSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoIsNull() {
            addCriterion("pod_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoIsNotNull() {
            addCriterion("pod_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoEqualTo(String value) {
            addCriterion("pod_source_no =", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoNotEqualTo(String value) {
            addCriterion("pod_source_no <>", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoGreaterThan(String value) {
            addCriterion("pod_source_no >", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("pod_source_no >=", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoLessThan(String value) {
            addCriterion("pod_source_no <", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoLessThanOrEqualTo(String value) {
            addCriterion("pod_source_no <=", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoLike(String value) {
            addCriterion("pod_source_no like", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoNotLike(String value) {
            addCriterion("pod_source_no not like", value, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoIn(List<String> values) {
            addCriterion("pod_source_no in", values, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoNotIn(List<String> values) {
            addCriterion("pod_source_no not in", values, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoBetween(String value1, String value2) {
            addCriterion("pod_source_no between", value1, value2, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodSourceNoNotBetween(String value1, String value2) {
            addCriterion("pod_source_no not between", value1, value2, "podSourceNo");
            return (Criteria) this;
        }

        public Criteria andPodAuditionIsNull() {
            addCriterion("pod_audition is null");
            return (Criteria) this;
        }

        public Criteria andPodAuditionIsNotNull() {
            addCriterion("pod_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPodAuditionEqualTo(String value) {
            addCriterion("pod_audition =", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionNotEqualTo(String value) {
            addCriterion("pod_audition <>", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionGreaterThan(String value) {
            addCriterion("pod_audition >", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pod_audition >=", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionLessThan(String value) {
            addCriterion("pod_audition <", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionLessThanOrEqualTo(String value) {
            addCriterion("pod_audition <=", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionLike(String value) {
            addCriterion("pod_audition like", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionNotLike(String value) {
            addCriterion("pod_audition not like", value, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionIn(List<String> values) {
            addCriterion("pod_audition in", values, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionNotIn(List<String> values) {
            addCriterion("pod_audition not in", values, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionBetween(String value1, String value2) {
            addCriterion("pod_audition between", value1, value2, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodAuditionNotBetween(String value1, String value2) {
            addCriterion("pod_audition not between", value1, value2, "podAudition");
            return (Criteria) this;
        }

        public Criteria andPodYnIsNull() {
            addCriterion("pod_yn is null");
            return (Criteria) this;
        }

        public Criteria andPodYnIsNotNull() {
            addCriterion("pod_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPodYnEqualTo(String value) {
            addCriterion("pod_yn =", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnNotEqualTo(String value) {
            addCriterion("pod_yn <>", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnGreaterThan(String value) {
            addCriterion("pod_yn >", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnGreaterThanOrEqualTo(String value) {
            addCriterion("pod_yn >=", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnLessThan(String value) {
            addCriterion("pod_yn <", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnLessThanOrEqualTo(String value) {
            addCriterion("pod_yn <=", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnLike(String value) {
            addCriterion("pod_yn like", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnNotLike(String value) {
            addCriterion("pod_yn not like", value, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnIn(List<String> values) {
            addCriterion("pod_yn in", values, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnNotIn(List<String> values) {
            addCriterion("pod_yn not in", values, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnBetween(String value1, String value2) {
            addCriterion("pod_yn between", value1, value2, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodYnNotBetween(String value1, String value2) {
            addCriterion("pod_yn not between", value1, value2, "podYn");
            return (Criteria) this;
        }

        public Criteria andPodCustom1IsNull() {
            addCriterion("pod_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPodCustom1IsNotNull() {
            addCriterion("pod_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPodCustom1EqualTo(String value) {
            addCriterion("pod_custom1 =", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1NotEqualTo(String value) {
            addCriterion("pod_custom1 <>", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1GreaterThan(String value) {
            addCriterion("pod_custom1 >", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pod_custom1 >=", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1LessThan(String value) {
            addCriterion("pod_custom1 <", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1LessThanOrEqualTo(String value) {
            addCriterion("pod_custom1 <=", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1Like(String value) {
            addCriterion("pod_custom1 like", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1NotLike(String value) {
            addCriterion("pod_custom1 not like", value, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1In(List<String> values) {
            addCriterion("pod_custom1 in", values, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1NotIn(List<String> values) {
            addCriterion("pod_custom1 not in", values, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1Between(String value1, String value2) {
            addCriterion("pod_custom1 between", value1, value2, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom1NotBetween(String value1, String value2) {
            addCriterion("pod_custom1 not between", value1, value2, "podCustom1");
            return (Criteria) this;
        }

        public Criteria andPodCustom2IsNull() {
            addCriterion("pod_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPodCustom2IsNotNull() {
            addCriterion("pod_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPodCustom2EqualTo(String value) {
            addCriterion("pod_custom2 =", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2NotEqualTo(String value) {
            addCriterion("pod_custom2 <>", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2GreaterThan(String value) {
            addCriterion("pod_custom2 >", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pod_custom2 >=", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2LessThan(String value) {
            addCriterion("pod_custom2 <", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2LessThanOrEqualTo(String value) {
            addCriterion("pod_custom2 <=", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2Like(String value) {
            addCriterion("pod_custom2 like", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2NotLike(String value) {
            addCriterion("pod_custom2 not like", value, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2In(List<String> values) {
            addCriterion("pod_custom2 in", values, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2NotIn(List<String> values) {
            addCriterion("pod_custom2 not in", values, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2Between(String value1, String value2) {
            addCriterion("pod_custom2 between", value1, value2, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom2NotBetween(String value1, String value2) {
            addCriterion("pod_custom2 not between", value1, value2, "podCustom2");
            return (Criteria) this;
        }

        public Criteria andPodCustom3IsNull() {
            addCriterion("pod_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPodCustom3IsNotNull() {
            addCriterion("pod_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPodCustom3EqualTo(String value) {
            addCriterion("pod_custom3 =", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3NotEqualTo(String value) {
            addCriterion("pod_custom3 <>", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3GreaterThan(String value) {
            addCriterion("pod_custom3 >", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pod_custom3 >=", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3LessThan(String value) {
            addCriterion("pod_custom3 <", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3LessThanOrEqualTo(String value) {
            addCriterion("pod_custom3 <=", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3Like(String value) {
            addCriterion("pod_custom3 like", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3NotLike(String value) {
            addCriterion("pod_custom3 not like", value, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3In(List<String> values) {
            addCriterion("pod_custom3 in", values, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3NotIn(List<String> values) {
            addCriterion("pod_custom3 not in", values, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3Between(String value1, String value2) {
            addCriterion("pod_custom3 between", value1, value2, "podCustom3");
            return (Criteria) this;
        }

        public Criteria andPodCustom3NotBetween(String value1, String value2) {
            addCriterion("pod_custom3 not between", value1, value2, "podCustom3");
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