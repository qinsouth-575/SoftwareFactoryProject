package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOrderDetailExample() {
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

        public Criteria andSolIdIsNull() {
            addCriterion("sol_id is null");
            return (Criteria) this;
        }

        public Criteria andSolIdIsNotNull() {
            addCriterion("sol_id is not null");
            return (Criteria) this;
        }

        public Criteria andSolIdEqualTo(Integer value) {
            addCriterion("sol_id =", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotEqualTo(Integer value) {
            addCriterion("sol_id <>", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThan(Integer value) {
            addCriterion("sol_id >", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_id >=", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdLessThan(Integer value) {
            addCriterion("sol_id <", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdLessThanOrEqualTo(Integer value) {
            addCriterion("sol_id <=", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdIn(List<Integer> values) {
            addCriterion("sol_id in", values, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotIn(List<Integer> values) {
            addCriterion("sol_id not in", values, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdBetween(Integer value1, Integer value2) {
            addCriterion("sol_id between", value1, value2, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_id not between", value1, value2, "solId");
            return (Criteria) this;
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

        public Criteria andSolMatNameIsNull() {
            addCriterion("sol_mat_name is null");
            return (Criteria) this;
        }

        public Criteria andSolMatNameIsNotNull() {
            addCriterion("sol_mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andSolMatNameEqualTo(String value) {
            addCriterion("sol_mat_name =", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameNotEqualTo(String value) {
            addCriterion("sol_mat_name <>", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameGreaterThan(String value) {
            addCriterion("sol_mat_name >", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("sol_mat_name >=", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameLessThan(String value) {
            addCriterion("sol_mat_name <", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameLessThanOrEqualTo(String value) {
            addCriterion("sol_mat_name <=", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameLike(String value) {
            addCriterion("sol_mat_name like", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameNotLike(String value) {
            addCriterion("sol_mat_name not like", value, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameIn(List<String> values) {
            addCriterion("sol_mat_name in", values, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameNotIn(List<String> values) {
            addCriterion("sol_mat_name not in", values, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameBetween(String value1, String value2) {
            addCriterion("sol_mat_name between", value1, value2, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatNameNotBetween(String value1, String value2) {
            addCriterion("sol_mat_name not between", value1, value2, "solMatName");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeIsNull() {
            addCriterion("sol_mat_type is null");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeIsNotNull() {
            addCriterion("sol_mat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeEqualTo(String value) {
            addCriterion("sol_mat_type =", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeNotEqualTo(String value) {
            addCriterion("sol_mat_type <>", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeGreaterThan(String value) {
            addCriterion("sol_mat_type >", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sol_mat_type >=", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeLessThan(String value) {
            addCriterion("sol_mat_type <", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeLessThanOrEqualTo(String value) {
            addCriterion("sol_mat_type <=", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeLike(String value) {
            addCriterion("sol_mat_type like", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeNotLike(String value) {
            addCriterion("sol_mat_type not like", value, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeIn(List<String> values) {
            addCriterion("sol_mat_type in", values, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeNotIn(List<String> values) {
            addCriterion("sol_mat_type not in", values, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeBetween(String value1, String value2) {
            addCriterion("sol_mat_type between", value1, value2, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolMatTypeNotBetween(String value1, String value2) {
            addCriterion("sol_mat_type not between", value1, value2, "solMatType");
            return (Criteria) this;
        }

        public Criteria andSolNominalIsNull() {
            addCriterion("sol_nominal is null");
            return (Criteria) this;
        }

        public Criteria andSolNominalIsNotNull() {
            addCriterion("sol_nominal is not null");
            return (Criteria) this;
        }

        public Criteria andSolNominalEqualTo(String value) {
            addCriterion("sol_nominal =", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalNotEqualTo(String value) {
            addCriterion("sol_nominal <>", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalGreaterThan(String value) {
            addCriterion("sol_nominal >", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalGreaterThanOrEqualTo(String value) {
            addCriterion("sol_nominal >=", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalLessThan(String value) {
            addCriterion("sol_nominal <", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalLessThanOrEqualTo(String value) {
            addCriterion("sol_nominal <=", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalLike(String value) {
            addCriterion("sol_nominal like", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalNotLike(String value) {
            addCriterion("sol_nominal not like", value, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalIn(List<String> values) {
            addCriterion("sol_nominal in", values, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalNotIn(List<String> values) {
            addCriterion("sol_nominal not in", values, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalBetween(String value1, String value2) {
            addCriterion("sol_nominal between", value1, value2, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolNominalNotBetween(String value1, String value2) {
            addCriterion("sol_nominal not between", value1, value2, "solNominal");
            return (Criteria) this;
        }

        public Criteria andSolQuantityIsNull() {
            addCriterion("sol_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSolQuantityIsNotNull() {
            addCriterion("sol_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSolQuantityEqualTo(Integer value) {
            addCriterion("sol_quantity =", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityNotEqualTo(Integer value) {
            addCriterion("sol_quantity <>", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityGreaterThan(Integer value) {
            addCriterion("sol_quantity >", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_quantity >=", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityLessThan(Integer value) {
            addCriterion("sol_quantity <", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("sol_quantity <=", value, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityIn(List<Integer> values) {
            addCriterion("sol_quantity in", values, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityNotIn(List<Integer> values) {
            addCriterion("sol_quantity not in", values, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityBetween(Integer value1, Integer value2) {
            addCriterion("sol_quantity between", value1, value2, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_quantity not between", value1, value2, "solQuantity");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceIsNull() {
            addCriterion("sol_pre_price is null");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceIsNotNull() {
            addCriterion("sol_pre_price is not null");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceEqualTo(Float value) {
            addCriterion("sol_pre_price =", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceNotEqualTo(Float value) {
            addCriterion("sol_pre_price <>", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceGreaterThan(Float value) {
            addCriterion("sol_pre_price >", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_pre_price >=", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceLessThan(Float value) {
            addCriterion("sol_pre_price <", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceLessThanOrEqualTo(Float value) {
            addCriterion("sol_pre_price <=", value, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceIn(List<Float> values) {
            addCriterion("sol_pre_price in", values, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceNotIn(List<Float> values) {
            addCriterion("sol_pre_price not in", values, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceBetween(Float value1, Float value2) {
            addCriterion("sol_pre_price between", value1, value2, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolPrePriceNotBetween(Float value1, Float value2) {
            addCriterion("sol_pre_price not between", value1, value2, "solPrePrice");
            return (Criteria) this;
        }

        public Criteria andSolFoldIsNull() {
            addCriterion("sol_fold is null");
            return (Criteria) this;
        }

        public Criteria andSolFoldIsNotNull() {
            addCriterion("sol_fold is not null");
            return (Criteria) this;
        }

        public Criteria andSolFoldEqualTo(Integer value) {
            addCriterion("sol_fold =", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldNotEqualTo(Integer value) {
            addCriterion("sol_fold <>", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldGreaterThan(Integer value) {
            addCriterion("sol_fold >", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_fold >=", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldLessThan(Integer value) {
            addCriterion("sol_fold <", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldLessThanOrEqualTo(Integer value) {
            addCriterion("sol_fold <=", value, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldIn(List<Integer> values) {
            addCriterion("sol_fold in", values, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldNotIn(List<Integer> values) {
            addCriterion("sol_fold not in", values, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldBetween(Integer value1, Integer value2) {
            addCriterion("sol_fold between", value1, value2, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolFoldNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_fold not between", value1, value2, "solFold");
            return (Criteria) this;
        }

        public Criteria andSolPriceIsNull() {
            addCriterion("sol_price is null");
            return (Criteria) this;
        }

        public Criteria andSolPriceIsNotNull() {
            addCriterion("sol_price is not null");
            return (Criteria) this;
        }

        public Criteria andSolPriceEqualTo(Float value) {
            addCriterion("sol_price =", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceNotEqualTo(Float value) {
            addCriterion("sol_price <>", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceGreaterThan(Float value) {
            addCriterion("sol_price >", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_price >=", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceLessThan(Float value) {
            addCriterion("sol_price <", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceLessThanOrEqualTo(Float value) {
            addCriterion("sol_price <=", value, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceIn(List<Float> values) {
            addCriterion("sol_price in", values, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceNotIn(List<Float> values) {
            addCriterion("sol_price not in", values, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceBetween(Float value1, Float value2) {
            addCriterion("sol_price between", value1, value2, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolPriceNotBetween(Float value1, Float value2) {
            addCriterion("sol_price not between", value1, value2, "solPrice");
            return (Criteria) this;
        }

        public Criteria andSolAmountIsNull() {
            addCriterion("sol_amount is null");
            return (Criteria) this;
        }

        public Criteria andSolAmountIsNotNull() {
            addCriterion("sol_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSolAmountEqualTo(Float value) {
            addCriterion("sol_amount =", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountNotEqualTo(Float value) {
            addCriterion("sol_amount <>", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountGreaterThan(Float value) {
            addCriterion("sol_amount >", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_amount >=", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountLessThan(Float value) {
            addCriterion("sol_amount <", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountLessThanOrEqualTo(Float value) {
            addCriterion("sol_amount <=", value, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountIn(List<Float> values) {
            addCriterion("sol_amount in", values, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountNotIn(List<Float> values) {
            addCriterion("sol_amount not in", values, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountBetween(Float value1, Float value2) {
            addCriterion("sol_amount between", value1, value2, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolAmountNotBetween(Float value1, Float value2) {
            addCriterion("sol_amount not between", value1, value2, "solAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateIsNull() {
            addCriterion("sol_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateIsNotNull() {
            addCriterion("sol_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateEqualTo(Float value) {
            addCriterion("sol_tax_rate =", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateNotEqualTo(Float value) {
            addCriterion("sol_tax_rate <>", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateGreaterThan(Float value) {
            addCriterion("sol_tax_rate >", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_tax_rate >=", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateLessThan(Float value) {
            addCriterion("sol_tax_rate <", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("sol_tax_rate <=", value, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateIn(List<Float> values) {
            addCriterion("sol_tax_rate in", values, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateNotIn(List<Float> values) {
            addCriterion("sol_tax_rate not in", values, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateBetween(Float value1, Float value2) {
            addCriterion("sol_tax_rate between", value1, value2, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("sol_tax_rate not between", value1, value2, "solTaxRate");
            return (Criteria) this;
        }

        public Criteria andSolTaxIsNull() {
            addCriterion("sol_tax is null");
            return (Criteria) this;
        }

        public Criteria andSolTaxIsNotNull() {
            addCriterion("sol_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSolTaxEqualTo(Float value) {
            addCriterion("sol_tax =", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxNotEqualTo(Float value) {
            addCriterion("sol_tax <>", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxGreaterThan(Float value) {
            addCriterion("sol_tax >", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_tax >=", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxLessThan(Float value) {
            addCriterion("sol_tax <", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxLessThanOrEqualTo(Float value) {
            addCriterion("sol_tax <=", value, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxIn(List<Float> values) {
            addCriterion("sol_tax in", values, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxNotIn(List<Float> values) {
            addCriterion("sol_tax not in", values, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxBetween(Float value1, Float value2) {
            addCriterion("sol_tax between", value1, value2, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxNotBetween(Float value1, Float value2) {
            addCriterion("sol_tax not between", value1, value2, "solTax");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountIsNull() {
            addCriterion("sol_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountIsNotNull() {
            addCriterion("sol_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountEqualTo(Float value) {
            addCriterion("sol_tax_amount =", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountNotEqualTo(Float value) {
            addCriterion("sol_tax_amount <>", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountGreaterThan(Float value) {
            addCriterion("sol_tax_amount >", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sol_tax_amount >=", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountLessThan(Float value) {
            addCriterion("sol_tax_amount <", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("sol_tax_amount <=", value, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountIn(List<Float> values) {
            addCriterion("sol_tax_amount in", values, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountNotIn(List<Float> values) {
            addCriterion("sol_tax_amount not in", values, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountBetween(Float value1, Float value2) {
            addCriterion("sol_tax_amount between", value1, value2, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("sol_tax_amount not between", value1, value2, "solTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayIsNull() {
            addCriterion("sol_giveaway is null");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayIsNotNull() {
            addCriterion("sol_giveaway is not null");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayEqualTo(Integer value) {
            addCriterion("sol_giveaway =", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayNotEqualTo(Integer value) {
            addCriterion("sol_giveaway <>", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayGreaterThan(Integer value) {
            addCriterion("sol_giveaway >", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_giveaway >=", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayLessThan(Integer value) {
            addCriterion("sol_giveaway <", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayLessThanOrEqualTo(Integer value) {
            addCriterion("sol_giveaway <=", value, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayIn(List<Integer> values) {
            addCriterion("sol_giveaway in", values, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayNotIn(List<Integer> values) {
            addCriterion("sol_giveaway not in", values, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayBetween(Integer value1, Integer value2) {
            addCriterion("sol_giveaway between", value1, value2, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolGiveawayNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_giveaway not between", value1, value2, "solGiveaway");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingIsNull() {
            addCriterion("sol_journalizing is null");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingIsNotNull() {
            addCriterion("sol_journalizing is not null");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingEqualTo(String value) {
            addCriterion("sol_journalizing =", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingNotEqualTo(String value) {
            addCriterion("sol_journalizing <>", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingGreaterThan(String value) {
            addCriterion("sol_journalizing >", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingGreaterThanOrEqualTo(String value) {
            addCriterion("sol_journalizing >=", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingLessThan(String value) {
            addCriterion("sol_journalizing <", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingLessThanOrEqualTo(String value) {
            addCriterion("sol_journalizing <=", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingLike(String value) {
            addCriterion("sol_journalizing like", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingNotLike(String value) {
            addCriterion("sol_journalizing not like", value, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingIn(List<String> values) {
            addCriterion("sol_journalizing in", values, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingNotIn(List<String> values) {
            addCriterion("sol_journalizing not in", values, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingBetween(String value1, String value2) {
            addCriterion("sol_journalizing between", value1, value2, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolJournalizingNotBetween(String value1, String value2) {
            addCriterion("sol_journalizing not between", value1, value2, "solJournalizing");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionIsNull() {
            addCriterion("sol_material_composition is null");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionIsNotNull() {
            addCriterion("sol_material_composition is not null");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionEqualTo(Integer value) {
            addCriterion("sol_material_composition =", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionNotEqualTo(Integer value) {
            addCriterion("sol_material_composition <>", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionGreaterThan(Integer value) {
            addCriterion("sol_material_composition >", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_material_composition >=", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionLessThan(Integer value) {
            addCriterion("sol_material_composition <", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionLessThanOrEqualTo(Integer value) {
            addCriterion("sol_material_composition <=", value, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionIn(List<Integer> values) {
            addCriterion("sol_material_composition in", values, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionNotIn(List<Integer> values) {
            addCriterion("sol_material_composition not in", values, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionBetween(Integer value1, Integer value2) {
            addCriterion("sol_material_composition between", value1, value2, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolMaterialCompositionNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_material_composition not between", value1, value2, "solMaterialComposition");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceIsNull() {
            addCriterion("sol_single_source is null");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceIsNotNull() {
            addCriterion("sol_single_source is not null");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceEqualTo(String value) {
            addCriterion("sol_single_source =", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceNotEqualTo(String value) {
            addCriterion("sol_single_source <>", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceGreaterThan(String value) {
            addCriterion("sol_single_source >", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceGreaterThanOrEqualTo(String value) {
            addCriterion("sol_single_source >=", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceLessThan(String value) {
            addCriterion("sol_single_source <", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceLessThanOrEqualTo(String value) {
            addCriterion("sol_single_source <=", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceLike(String value) {
            addCriterion("sol_single_source like", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceNotLike(String value) {
            addCriterion("sol_single_source not like", value, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceIn(List<String> values) {
            addCriterion("sol_single_source in", values, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceNotIn(List<String> values) {
            addCriterion("sol_single_source not in", values, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceBetween(String value1, String value2) {
            addCriterion("sol_single_source between", value1, value2, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleSourceNotBetween(String value1, String value2) {
            addCriterion("sol_single_source not between", value1, value2, "solSingleSource");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderIsNull() {
            addCriterion("sol_single_oder is null");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderIsNotNull() {
            addCriterion("sol_single_oder is not null");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderEqualTo(String value) {
            addCriterion("sol_single_oder =", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderNotEqualTo(String value) {
            addCriterion("sol_single_oder <>", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderGreaterThan(String value) {
            addCriterion("sol_single_oder >", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderGreaterThanOrEqualTo(String value) {
            addCriterion("sol_single_oder >=", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderLessThan(String value) {
            addCriterion("sol_single_oder <", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderLessThanOrEqualTo(String value) {
            addCriterion("sol_single_oder <=", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderLike(String value) {
            addCriterion("sol_single_oder like", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderNotLike(String value) {
            addCriterion("sol_single_oder not like", value, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderIn(List<String> values) {
            addCriterion("sol_single_oder in", values, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderNotIn(List<String> values) {
            addCriterion("sol_single_oder not in", values, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderBetween(String value1, String value2) {
            addCriterion("sol_single_oder between", value1, value2, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolSingleOderNotBetween(String value1, String value2) {
            addCriterion("sol_single_oder not between", value1, value2, "solSingleOder");
            return (Criteria) this;
        }

        public Criteria andSolProductionIsNull() {
            addCriterion("sol_production is null");
            return (Criteria) this;
        }

        public Criteria andSolProductionIsNotNull() {
            addCriterion("sol_production is not null");
            return (Criteria) this;
        }

        public Criteria andSolProductionEqualTo(Integer value) {
            addCriterion("sol_production =", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionNotEqualTo(Integer value) {
            addCriterion("sol_production <>", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionGreaterThan(Integer value) {
            addCriterion("sol_production >", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_production >=", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionLessThan(Integer value) {
            addCriterion("sol_production <", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionLessThanOrEqualTo(Integer value) {
            addCriterion("sol_production <=", value, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionIn(List<Integer> values) {
            addCriterion("sol_production in", values, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionNotIn(List<Integer> values) {
            addCriterion("sol_production not in", values, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionBetween(Integer value1, Integer value2) {
            addCriterion("sol_production between", value1, value2, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolProductionNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_production not between", value1, value2, "solProduction");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberIsNull() {
            addCriterion("sol_scheduling_single_number is null");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberIsNotNull() {
            addCriterion("sol_scheduling_single_number is not null");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberEqualTo(String value) {
            addCriterion("sol_scheduling_single_number =", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberNotEqualTo(String value) {
            addCriterion("sol_scheduling_single_number <>", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberGreaterThan(String value) {
            addCriterion("sol_scheduling_single_number >", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sol_scheduling_single_number >=", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberLessThan(String value) {
            addCriterion("sol_scheduling_single_number <", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberLessThanOrEqualTo(String value) {
            addCriterion("sol_scheduling_single_number <=", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberLike(String value) {
            addCriterion("sol_scheduling_single_number like", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberNotLike(String value) {
            addCriterion("sol_scheduling_single_number not like", value, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberIn(List<String> values) {
            addCriterion("sol_scheduling_single_number in", values, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberNotIn(List<String> values) {
            addCriterion("sol_scheduling_single_number not in", values, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberBetween(String value1, String value2) {
            addCriterion("sol_scheduling_single_number between", value1, value2, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolSchedulingSingleNumberNotBetween(String value1, String value2) {
            addCriterion("sol_scheduling_single_number not between", value1, value2, "solSchedulingSingleNumber");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityIsNull() {
            addCriterion("sol_produced_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityIsNotNull() {
            addCriterion("sol_produced_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityEqualTo(Integer value) {
            addCriterion("sol_produced_quantity =", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityNotEqualTo(Integer value) {
            addCriterion("sol_produced_quantity <>", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityGreaterThan(Integer value) {
            addCriterion("sol_produced_quantity >", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sol_produced_quantity >=", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityLessThan(Integer value) {
            addCriterion("sol_produced_quantity <", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("sol_produced_quantity <=", value, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityIn(List<Integer> values) {
            addCriterion("sol_produced_quantity in", values, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityNotIn(List<Integer> values) {
            addCriterion("sol_produced_quantity not in", values, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityBetween(Integer value1, Integer value2) {
            addCriterion("sol_produced_quantity between", value1, value2, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolProducedQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sol_produced_quantity not between", value1, value2, "solProducedQuantity");
            return (Criteria) this;
        }

        public Criteria andSolAuditingIsNull() {
            addCriterion("sol_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSolAuditingIsNotNull() {
            addCriterion("sol_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSolAuditingEqualTo(String value) {
            addCriterion("sol_auditing =", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingNotEqualTo(String value) {
            addCriterion("sol_auditing <>", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingGreaterThan(String value) {
            addCriterion("sol_auditing >", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sol_auditing >=", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingLessThan(String value) {
            addCriterion("sol_auditing <", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingLessThanOrEqualTo(String value) {
            addCriterion("sol_auditing <=", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingLike(String value) {
            addCriterion("sol_auditing like", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingNotLike(String value) {
            addCriterion("sol_auditing not like", value, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingIn(List<String> values) {
            addCriterion("sol_auditing in", values, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingNotIn(List<String> values) {
            addCriterion("sol_auditing not in", values, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingBetween(String value1, String value2) {
            addCriterion("sol_auditing between", value1, value2, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolAuditingNotBetween(String value1, String value2) {
            addCriterion("sol_auditing not between", value1, value2, "solAuditing");
            return (Criteria) this;
        }

        public Criteria andSolYnIsNull() {
            addCriterion("sol_yn is null");
            return (Criteria) this;
        }

        public Criteria andSolYnIsNotNull() {
            addCriterion("sol_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSolYnEqualTo(String value) {
            addCriterion("sol_yn =", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnNotEqualTo(String value) {
            addCriterion("sol_yn <>", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnGreaterThan(String value) {
            addCriterion("sol_yn >", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnGreaterThanOrEqualTo(String value) {
            addCriterion("sol_yn >=", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnLessThan(String value) {
            addCriterion("sol_yn <", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnLessThanOrEqualTo(String value) {
            addCriterion("sol_yn <=", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnLike(String value) {
            addCriterion("sol_yn like", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnNotLike(String value) {
            addCriterion("sol_yn not like", value, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnIn(List<String> values) {
            addCriterion("sol_yn in", values, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnNotIn(List<String> values) {
            addCriterion("sol_yn not in", values, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnBetween(String value1, String value2) {
            addCriterion("sol_yn between", value1, value2, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolYnNotBetween(String value1, String value2) {
            addCriterion("sol_yn not between", value1, value2, "solYn");
            return (Criteria) this;
        }

        public Criteria andSolCustom1IsNull() {
            addCriterion("sol_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSolCustom1IsNotNull() {
            addCriterion("sol_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSolCustom1EqualTo(String value) {
            addCriterion("sol_custom1 =", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1NotEqualTo(String value) {
            addCriterion("sol_custom1 <>", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1GreaterThan(String value) {
            addCriterion("sol_custom1 >", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sol_custom1 >=", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1LessThan(String value) {
            addCriterion("sol_custom1 <", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1LessThanOrEqualTo(String value) {
            addCriterion("sol_custom1 <=", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1Like(String value) {
            addCriterion("sol_custom1 like", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1NotLike(String value) {
            addCriterion("sol_custom1 not like", value, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1In(List<String> values) {
            addCriterion("sol_custom1 in", values, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1NotIn(List<String> values) {
            addCriterion("sol_custom1 not in", values, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1Between(String value1, String value2) {
            addCriterion("sol_custom1 between", value1, value2, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom1NotBetween(String value1, String value2) {
            addCriterion("sol_custom1 not between", value1, value2, "solCustom1");
            return (Criteria) this;
        }

        public Criteria andSolCustom2IsNull() {
            addCriterion("sol_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSolCustom2IsNotNull() {
            addCriterion("sol_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSolCustom2EqualTo(String value) {
            addCriterion("sol_custom2 =", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2NotEqualTo(String value) {
            addCriterion("sol_custom2 <>", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2GreaterThan(String value) {
            addCriterion("sol_custom2 >", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sol_custom2 >=", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2LessThan(String value) {
            addCriterion("sol_custom2 <", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2LessThanOrEqualTo(String value) {
            addCriterion("sol_custom2 <=", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2Like(String value) {
            addCriterion("sol_custom2 like", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2NotLike(String value) {
            addCriterion("sol_custom2 not like", value, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2In(List<String> values) {
            addCriterion("sol_custom2 in", values, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2NotIn(List<String> values) {
            addCriterion("sol_custom2 not in", values, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2Between(String value1, String value2) {
            addCriterion("sol_custom2 between", value1, value2, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom2NotBetween(String value1, String value2) {
            addCriterion("sol_custom2 not between", value1, value2, "solCustom2");
            return (Criteria) this;
        }

        public Criteria andSolCustom3IsNull() {
            addCriterion("sol_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSolCustom3IsNotNull() {
            addCriterion("sol_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSolCustom3EqualTo(String value) {
            addCriterion("sol_custom3 =", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3NotEqualTo(String value) {
            addCriterion("sol_custom3 <>", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3GreaterThan(String value) {
            addCriterion("sol_custom3 >", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sol_custom3 >=", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3LessThan(String value) {
            addCriterion("sol_custom3 <", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3LessThanOrEqualTo(String value) {
            addCriterion("sol_custom3 <=", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3Like(String value) {
            addCriterion("sol_custom3 like", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3NotLike(String value) {
            addCriterion("sol_custom3 not like", value, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3In(List<String> values) {
            addCriterion("sol_custom3 in", values, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3NotIn(List<String> values) {
            addCriterion("sol_custom3 not in", values, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3Between(String value1, String value2) {
            addCriterion("sol_custom3 between", value1, value2, "solCustom3");
            return (Criteria) this;
        }

        public Criteria andSolCustom3NotBetween(String value1, String value2) {
            addCriterion("sol_custom3 not between", value1, value2, "solCustom3");
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