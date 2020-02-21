package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class WarehouseMaterialRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseMaterialRelationExample() {
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

        public Criteria andWmrIdIsNull() {
            addCriterion("wmr_id is null");
            return (Criteria) this;
        }

        public Criteria andWmrIdIsNotNull() {
            addCriterion("wmr_id is not null");
            return (Criteria) this;
        }

        public Criteria andWmrIdEqualTo(Integer value) {
            addCriterion("wmr_id =", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdNotEqualTo(Integer value) {
            addCriterion("wmr_id <>", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdGreaterThan(Integer value) {
            addCriterion("wmr_id >", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wmr_id >=", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdLessThan(Integer value) {
            addCriterion("wmr_id <", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdLessThanOrEqualTo(Integer value) {
            addCriterion("wmr_id <=", value, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdIn(List<Integer> values) {
            addCriterion("wmr_id in", values, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdNotIn(List<Integer> values) {
            addCriterion("wmr_id not in", values, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdBetween(Integer value1, Integer value2) {
            addCriterion("wmr_id between", value1, value2, "wmrId");
            return (Criteria) this;
        }

        public Criteria andWmrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wmr_id not between", value1, value2, "wmrId");
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("WareHouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WareHouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("WareHouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("WareHouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("WareHouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("WareHouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("WareHouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("WareHouseID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("WareHouseID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("WareHouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("WareHouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("WareHouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("WareHouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNull() {
            addCriterion("WareHouseName is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIsNotNull() {
            addCriterion("WareHouseName is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenameEqualTo(String value) {
            addCriterion("WareHouseName =", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotEqualTo(String value) {
            addCriterion("WareHouseName <>", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThan(String value) {
            addCriterion("WareHouseName >", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouseName >=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThan(String value) {
            addCriterion("WareHouseName <", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLessThanOrEqualTo(String value) {
            addCriterion("WareHouseName <=", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameLike(String value) {
            addCriterion("WareHouseName like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotLike(String value) {
            addCriterion("WareHouseName not like", value, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameIn(List<String> values) {
            addCriterion("WareHouseName in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotIn(List<String> values) {
            addCriterion("WareHouseName not in", values, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameBetween(String value1, String value2) {
            addCriterion("WareHouseName between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWarehousenameNotBetween(String value1, String value2) {
            addCriterion("WareHouseName not between", value1, value2, "warehousename");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockIsNull() {
            addCriterion("wmr_beginning_stock is null");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockIsNotNull() {
            addCriterion("wmr_beginning_stock is not null");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockEqualTo(Integer value) {
            addCriterion("wmr_beginning_stock =", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockNotEqualTo(Integer value) {
            addCriterion("wmr_beginning_stock <>", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockGreaterThan(Integer value) {
            addCriterion("wmr_beginning_stock >", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("wmr_beginning_stock >=", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockLessThan(Integer value) {
            addCriterion("wmr_beginning_stock <", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockLessThanOrEqualTo(Integer value) {
            addCriterion("wmr_beginning_stock <=", value, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockIn(List<Integer> values) {
            addCriterion("wmr_beginning_stock in", values, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockNotIn(List<Integer> values) {
            addCriterion("wmr_beginning_stock not in", values, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockBetween(Integer value1, Integer value2) {
            addCriterion("wmr_beginning_stock between", value1, value2, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrBeginningStockNotBetween(Integer value1, Integer value2) {
            addCriterion("wmr_beginning_stock not between", value1, value2, "wmrBeginningStock");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberIsNull() {
            addCriterion("wmr_existing_number is null");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberIsNotNull() {
            addCriterion("wmr_existing_number is not null");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberEqualTo(Integer value) {
            addCriterion("wmr_existing_number =", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberNotEqualTo(Integer value) {
            addCriterion("wmr_existing_number <>", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberGreaterThan(Integer value) {
            addCriterion("wmr_existing_number >", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("wmr_existing_number >=", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberLessThan(Integer value) {
            addCriterion("wmr_existing_number <", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("wmr_existing_number <=", value, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberIn(List<Integer> values) {
            addCriterion("wmr_existing_number in", values, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberNotIn(List<Integer> values) {
            addCriterion("wmr_existing_number not in", values, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberBetween(Integer value1, Integer value2) {
            addCriterion("wmr_existing_number between", value1, value2, "wmrExistingNumber");
            return (Criteria) this;
        }

        public Criteria andWmrExistingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("wmr_existing_number not between", value1, value2, "wmrExistingNumber");
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