package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleQuotationDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleQuotationDetailsExample() {
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

        public Criteria andSqdProdidIsNull() {
            addCriterion("Sqd_ProdID is null");
            return (Criteria) this;
        }

        public Criteria andSqdProdidIsNotNull() {
            addCriterion("Sqd_ProdID is not null");
            return (Criteria) this;
        }

        public Criteria andSqdProdidEqualTo(String value) {
            addCriterion("Sqd_ProdID =", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidNotEqualTo(String value) {
            addCriterion("Sqd_ProdID <>", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidGreaterThan(String value) {
            addCriterion("Sqd_ProdID >", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdID >=", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidLessThan(String value) {
            addCriterion("Sqd_ProdID <", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidLessThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdID <=", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidLike(String value) {
            addCriterion("Sqd_ProdID like", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidNotLike(String value) {
            addCriterion("Sqd_ProdID not like", value, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidIn(List<String> values) {
            addCriterion("Sqd_ProdID in", values, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidNotIn(List<String> values) {
            addCriterion("Sqd_ProdID not in", values, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidBetween(String value1, String value2) {
            addCriterion("Sqd_ProdID between", value1, value2, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdProdidNotBetween(String value1, String value2) {
            addCriterion("Sqd_ProdID not between", value1, value2, "sqdProdid");
            return (Criteria) this;
        }

        public Criteria andSqdSernoIsNull() {
            addCriterion("Sqd_SerNO is null");
            return (Criteria) this;
        }

        public Criteria andSqdSernoIsNotNull() {
            addCriterion("Sqd_SerNO is not null");
            return (Criteria) this;
        }

        public Criteria andSqdSernoEqualTo(String value) {
            addCriterion("Sqd_SerNO =", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoNotEqualTo(String value) {
            addCriterion("Sqd_SerNO <>", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoGreaterThan(String value) {
            addCriterion("Sqd_SerNO >", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_SerNO >=", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoLessThan(String value) {
            addCriterion("Sqd_SerNO <", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoLessThanOrEqualTo(String value) {
            addCriterion("Sqd_SerNO <=", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoLike(String value) {
            addCriterion("Sqd_SerNO like", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoNotLike(String value) {
            addCriterion("Sqd_SerNO not like", value, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoIn(List<String> values) {
            addCriterion("Sqd_SerNO in", values, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoNotIn(List<String> values) {
            addCriterion("Sqd_SerNO not in", values, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoBetween(String value1, String value2) {
            addCriterion("Sqd_SerNO between", value1, value2, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdSernoNotBetween(String value1, String value2) {
            addCriterion("Sqd_SerNO not between", value1, value2, "sqdSerno");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameIsNull() {
            addCriterion("Sqd_ProdName is null");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameIsNotNull() {
            addCriterion("Sqd_ProdName is not null");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameEqualTo(String value) {
            addCriterion("Sqd_ProdName =", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameNotEqualTo(String value) {
            addCriterion("Sqd_ProdName <>", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameGreaterThan(String value) {
            addCriterion("Sqd_ProdName >", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdName >=", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameLessThan(String value) {
            addCriterion("Sqd_ProdName <", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameLessThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdName <=", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameLike(String value) {
            addCriterion("Sqd_ProdName like", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameNotLike(String value) {
            addCriterion("Sqd_ProdName not like", value, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameIn(List<String> values) {
            addCriterion("Sqd_ProdName in", values, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameNotIn(List<String> values) {
            addCriterion("Sqd_ProdName not in", values, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameBetween(String value1, String value2) {
            addCriterion("Sqd_ProdName between", value1, value2, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdnameNotBetween(String value1, String value2) {
            addCriterion("Sqd_ProdName not between", value1, value2, "sqdProdname");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeIsNull() {
            addCriterion("Sqd_ProdSize is null");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeIsNotNull() {
            addCriterion("Sqd_ProdSize is not null");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeEqualTo(String value) {
            addCriterion("Sqd_ProdSize =", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeNotEqualTo(String value) {
            addCriterion("Sqd_ProdSize <>", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeGreaterThan(String value) {
            addCriterion("Sqd_ProdSize >", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdSize >=", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeLessThan(String value) {
            addCriterion("Sqd_ProdSize <", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeLessThanOrEqualTo(String value) {
            addCriterion("Sqd_ProdSize <=", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeLike(String value) {
            addCriterion("Sqd_ProdSize like", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeNotLike(String value) {
            addCriterion("Sqd_ProdSize not like", value, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeIn(List<String> values) {
            addCriterion("Sqd_ProdSize in", values, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeNotIn(List<String> values) {
            addCriterion("Sqd_ProdSize not in", values, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeBetween(String value1, String value2) {
            addCriterion("Sqd_ProdSize between", value1, value2, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdProdsizeNotBetween(String value1, String value2) {
            addCriterion("Sqd_ProdSize not between", value1, value2, "sqdProdsize");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameIsNull() {
            addCriterion("Sqd_UnitName is null");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameIsNotNull() {
            addCriterion("Sqd_UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameEqualTo(String value) {
            addCriterion("Sqd_UnitName =", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameNotEqualTo(String value) {
            addCriterion("Sqd_UnitName <>", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameGreaterThan(String value) {
            addCriterion("Sqd_UnitName >", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_UnitName >=", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameLessThan(String value) {
            addCriterion("Sqd_UnitName <", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameLessThanOrEqualTo(String value) {
            addCriterion("Sqd_UnitName <=", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameLike(String value) {
            addCriterion("Sqd_UnitName like", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameNotLike(String value) {
            addCriterion("Sqd_UnitName not like", value, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameIn(List<String> values) {
            addCriterion("Sqd_UnitName in", values, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameNotIn(List<String> values) {
            addCriterion("Sqd_UnitName not in", values, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameBetween(String value1, String value2) {
            addCriterion("Sqd_UnitName between", value1, value2, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdUnitnameNotBetween(String value1, String value2) {
            addCriterion("Sqd_UnitName not between", value1, value2, "sqdUnitname");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityIsNull() {
            addCriterion("Sqd_sQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityIsNotNull() {
            addCriterion("Sqd_sQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityEqualTo(Integer value) {
            addCriterion("Sqd_sQuantity =", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityNotEqualTo(Integer value) {
            addCriterion("Sqd_sQuantity <>", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityGreaterThan(Integer value) {
            addCriterion("Sqd_sQuantity >", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sqd_sQuantity >=", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityLessThan(Integer value) {
            addCriterion("Sqd_sQuantity <", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityLessThanOrEqualTo(Integer value) {
            addCriterion("Sqd_sQuantity <=", value, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityIn(List<Integer> values) {
            addCriterion("Sqd_sQuantity in", values, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityNotIn(List<Integer> values) {
            addCriterion("Sqd_sQuantity not in", values, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityBetween(Integer value1, Integer value2) {
            addCriterion("Sqd_sQuantity between", value1, value2, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdSquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Sqd_sQuantity not between", value1, value2, "sqdSquantity");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceIsNull() {
            addCriterion("Sqd_ZkqPrice is null");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceIsNotNull() {
            addCriterion("Sqd_ZkqPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceEqualTo(Float value) {
            addCriterion("Sqd_ZkqPrice =", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceNotEqualTo(Float value) {
            addCriterion("Sqd_ZkqPrice <>", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceGreaterThan(Float value) {
            addCriterion("Sqd_ZkqPrice >", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_ZkqPrice >=", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceLessThan(Float value) {
            addCriterion("Sqd_ZkqPrice <", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_ZkqPrice <=", value, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceIn(List<Float> values) {
            addCriterion("Sqd_ZkqPrice in", values, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceNotIn(List<Float> values) {
            addCriterion("Sqd_ZkqPrice not in", values, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceBetween(Float value1, Float value2) {
            addCriterion("Sqd_ZkqPrice between", value1, value2, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdZkqpriceNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_ZkqPrice not between", value1, value2, "sqdZkqprice");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountIsNull() {
            addCriterion("Sqd_Discount is null");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountIsNotNull() {
            addCriterion("Sqd_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountEqualTo(Float value) {
            addCriterion("Sqd_Discount =", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountNotEqualTo(Float value) {
            addCriterion("Sqd_Discount <>", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountGreaterThan(Float value) {
            addCriterion("Sqd_Discount >", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_Discount >=", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountLessThan(Float value) {
            addCriterion("Sqd_Discount <", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_Discount <=", value, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountIn(List<Float> values) {
            addCriterion("Sqd_Discount in", values, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountNotIn(List<Float> values) {
            addCriterion("Sqd_Discount not in", values, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountBetween(Float value1, Float value2) {
            addCriterion("Sqd_Discount between", value1, value2, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdDiscountNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_Discount not between", value1, value2, "sqdDiscount");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceIsNull() {
            addCriterion("Sqd_UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceIsNotNull() {
            addCriterion("Sqd_UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceEqualTo(Float value) {
            addCriterion("Sqd_UnitPrice =", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceNotEqualTo(Float value) {
            addCriterion("Sqd_UnitPrice <>", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceGreaterThan(Float value) {
            addCriterion("Sqd_UnitPrice >", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_UnitPrice >=", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceLessThan(Float value) {
            addCriterion("Sqd_UnitPrice <", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_UnitPrice <=", value, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceIn(List<Float> values) {
            addCriterion("Sqd_UnitPrice in", values, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceNotIn(List<Float> values) {
            addCriterion("Sqd_UnitPrice not in", values, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceBetween(Float value1, Float value2) {
            addCriterion("Sqd_UnitPrice between", value1, value2, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdUnitpriceNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_UnitPrice not between", value1, value2, "sqdUnitprice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIsNull() {
            addCriterion("Sqd_Price is null");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIsNotNull() {
            addCriterion("Sqd_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSqdPriceEqualTo(Float value) {
            addCriterion("Sqd_Price =", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotEqualTo(Float value) {
            addCriterion("Sqd_Price <>", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceGreaterThan(Float value) {
            addCriterion("Sqd_Price >", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_Price >=", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceLessThan(Float value) {
            addCriterion("Sqd_Price <", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_Price <=", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIn(List<Float> values) {
            addCriterion("Sqd_Price in", values, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotIn(List<Float> values) {
            addCriterion("Sqd_Price not in", values, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceBetween(Float value1, Float value2) {
            addCriterion("Sqd_Price between", value1, value2, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_Price not between", value1, value2, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateIsNull() {
            addCriterion("Sqd_TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateIsNotNull() {
            addCriterion("Sqd_TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateEqualTo(Float value) {
            addCriterion("Sqd_TaxRate =", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateNotEqualTo(Float value) {
            addCriterion("Sqd_TaxRate <>", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateGreaterThan(Float value) {
            addCriterion("Sqd_TaxRate >", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_TaxRate >=", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateLessThan(Float value) {
            addCriterion("Sqd_TaxRate <", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_TaxRate <=", value, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateIn(List<Float> values) {
            addCriterion("Sqd_TaxRate in", values, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateNotIn(List<Float> values) {
            addCriterion("Sqd_TaxRate not in", values, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateBetween(Float value1, Float value2) {
            addCriterion("Sqd_TaxRate between", value1, value2, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxrateNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_TaxRate not between", value1, value2, "sqdTaxrate");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitIsNull() {
            addCriterion("Sqd_Taxlimit is null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitIsNotNull() {
            addCriterion("Sqd_Taxlimit is not null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitEqualTo(Float value) {
            addCriterion("Sqd_Taxlimit =", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitNotEqualTo(Float value) {
            addCriterion("Sqd_Taxlimit <>", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitGreaterThan(Float value) {
            addCriterion("Sqd_Taxlimit >", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_Taxlimit >=", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitLessThan(Float value) {
            addCriterion("Sqd_Taxlimit <", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_Taxlimit <=", value, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitIn(List<Float> values) {
            addCriterion("Sqd_Taxlimit in", values, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitNotIn(List<Float> values) {
            addCriterion("Sqd_Taxlimit not in", values, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitBetween(Float value1, Float value2) {
            addCriterion("Sqd_Taxlimit between", value1, value2, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxlimitNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_Taxlimit not between", value1, value2, "sqdTaxlimit");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceIsNull() {
            addCriterion("Sqd_TaxInclusivePrice is null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceIsNotNull() {
            addCriterion("Sqd_TaxInclusivePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceEqualTo(Float value) {
            addCriterion("Sqd_TaxInclusivePrice =", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceNotEqualTo(Float value) {
            addCriterion("Sqd_TaxInclusivePrice <>", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceGreaterThan(Float value) {
            addCriterion("Sqd_TaxInclusivePrice >", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sqd_TaxInclusivePrice >=", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceLessThan(Float value) {
            addCriterion("Sqd_TaxInclusivePrice <", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceLessThanOrEqualTo(Float value) {
            addCriterion("Sqd_TaxInclusivePrice <=", value, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceIn(List<Float> values) {
            addCriterion("Sqd_TaxInclusivePrice in", values, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceNotIn(List<Float> values) {
            addCriterion("Sqd_TaxInclusivePrice not in", values, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceBetween(Float value1, Float value2) {
            addCriterion("Sqd_TaxInclusivePrice between", value1, value2, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdTaxinclusivepriceNotBetween(Float value1, Float value2) {
            addCriterion("Sqd_TaxInclusivePrice not between", value1, value2, "sqdTaxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartIsNull() {
            addCriterion("Sqd_Complimentart is null");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartIsNotNull() {
            addCriterion("Sqd_Complimentart is not null");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartEqualTo(Integer value) {
            addCriterion("Sqd_Complimentart =", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartNotEqualTo(Integer value) {
            addCriterion("Sqd_Complimentart <>", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartGreaterThan(Integer value) {
            addCriterion("Sqd_Complimentart >", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sqd_Complimentart >=", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartLessThan(Integer value) {
            addCriterion("Sqd_Complimentart <", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartLessThanOrEqualTo(Integer value) {
            addCriterion("Sqd_Complimentart <=", value, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartIn(List<Integer> values) {
            addCriterion("Sqd_Complimentart in", values, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartNotIn(List<Integer> values) {
            addCriterion("Sqd_Complimentart not in", values, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartBetween(Integer value1, Integer value2) {
            addCriterion("Sqd_Complimentart between", value1, value2, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdComplimentartNotBetween(Integer value1, Integer value2) {
            addCriterion("Sqd_Complimentart not between", value1, value2, "sqdComplimentart");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkIsNull() {
            addCriterion("Sqd_ItemRemark is null");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkIsNotNull() {
            addCriterion("Sqd_ItemRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkEqualTo(String value) {
            addCriterion("Sqd_ItemRemark =", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkNotEqualTo(String value) {
            addCriterion("Sqd_ItemRemark <>", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkGreaterThan(String value) {
            addCriterion("Sqd_ItemRemark >", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_ItemRemark >=", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkLessThan(String value) {
            addCriterion("Sqd_ItemRemark <", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkLessThanOrEqualTo(String value) {
            addCriterion("Sqd_ItemRemark <=", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkLike(String value) {
            addCriterion("Sqd_ItemRemark like", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkNotLike(String value) {
            addCriterion("Sqd_ItemRemark not like", value, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkIn(List<String> values) {
            addCriterion("Sqd_ItemRemark in", values, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkNotIn(List<String> values) {
            addCriterion("Sqd_ItemRemark not in", values, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkBetween(String value1, String value2) {
            addCriterion("Sqd_ItemRemark between", value1, value2, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqdItemremarkNotBetween(String value1, String value2) {
            addCriterion("Sqd_ItemRemark not between", value1, value2, "sqdItemremark");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNull() {
            addCriterion("sql_id is null");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNotNull() {
            addCriterion("sql_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqlIdEqualTo(String value) {
            addCriterion("sql_id =", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotEqualTo(String value) {
            addCriterion("sql_id <>", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThan(String value) {
            addCriterion("sql_id >", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThanOrEqualTo(String value) {
            addCriterion("sql_id >=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThan(String value) {
            addCriterion("sql_id <", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThanOrEqualTo(String value) {
            addCriterion("sql_id <=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLike(String value) {
            addCriterion("sql_id like", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotLike(String value) {
            addCriterion("sql_id not like", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdIn(List<String> values) {
            addCriterion("sql_id in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotIn(List<String> values) {
            addCriterion("sql_id not in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdBetween(String value1, String value2) {
            addCriterion("sql_id between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotBetween(String value1, String value2) {
            addCriterion("sql_id not between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingIsNull() {
            addCriterion("Sqd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingIsNotNull() {
            addCriterion("Sqd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingEqualTo(String value) {
            addCriterion("Sqd_auditing =", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingNotEqualTo(String value) {
            addCriterion("Sqd_auditing <>", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingGreaterThan(String value) {
            addCriterion("Sqd_auditing >", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_auditing >=", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingLessThan(String value) {
            addCriterion("Sqd_auditing <", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingLessThanOrEqualTo(String value) {
            addCriterion("Sqd_auditing <=", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingLike(String value) {
            addCriterion("Sqd_auditing like", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingNotLike(String value) {
            addCriterion("Sqd_auditing not like", value, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingIn(List<String> values) {
            addCriterion("Sqd_auditing in", values, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingNotIn(List<String> values) {
            addCriterion("Sqd_auditing not in", values, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingBetween(String value1, String value2) {
            addCriterion("Sqd_auditing between", value1, value2, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdAuditingNotBetween(String value1, String value2) {
            addCriterion("Sqd_auditing not between", value1, value2, "sqdAuditing");
            return (Criteria) this;
        }

        public Criteria andSqdYnIsNull() {
            addCriterion("Sqd_yn is null");
            return (Criteria) this;
        }

        public Criteria andSqdYnIsNotNull() {
            addCriterion("Sqd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSqdYnEqualTo(String value) {
            addCriterion("Sqd_yn =", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnNotEqualTo(String value) {
            addCriterion("Sqd_yn <>", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnGreaterThan(String value) {
            addCriterion("Sqd_yn >", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnGreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_yn >=", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnLessThan(String value) {
            addCriterion("Sqd_yn <", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnLessThanOrEqualTo(String value) {
            addCriterion("Sqd_yn <=", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnLike(String value) {
            addCriterion("Sqd_yn like", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnNotLike(String value) {
            addCriterion("Sqd_yn not like", value, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnIn(List<String> values) {
            addCriterion("Sqd_yn in", values, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnNotIn(List<String> values) {
            addCriterion("Sqd_yn not in", values, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnBetween(String value1, String value2) {
            addCriterion("Sqd_yn between", value1, value2, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdYnNotBetween(String value1, String value2) {
            addCriterion("Sqd_yn not between", value1, value2, "sqdYn");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1IsNull() {
            addCriterion("Sqd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1IsNotNull() {
            addCriterion("Sqd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1EqualTo(String value) {
            addCriterion("Sqd_custom1 =", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1NotEqualTo(String value) {
            addCriterion("Sqd_custom1 <>", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1GreaterThan(String value) {
            addCriterion("Sqd_custom1 >", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_custom1 >=", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1LessThan(String value) {
            addCriterion("Sqd_custom1 <", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1LessThanOrEqualTo(String value) {
            addCriterion("Sqd_custom1 <=", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1Like(String value) {
            addCriterion("Sqd_custom1 like", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1NotLike(String value) {
            addCriterion("Sqd_custom1 not like", value, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1In(List<String> values) {
            addCriterion("Sqd_custom1 in", values, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1NotIn(List<String> values) {
            addCriterion("Sqd_custom1 not in", values, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1Between(String value1, String value2) {
            addCriterion("Sqd_custom1 between", value1, value2, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom1NotBetween(String value1, String value2) {
            addCriterion("Sqd_custom1 not between", value1, value2, "sqdCustom1");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2IsNull() {
            addCriterion("Sqd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2IsNotNull() {
            addCriterion("Sqd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2EqualTo(String value) {
            addCriterion("Sqd_custom2 =", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2NotEqualTo(String value) {
            addCriterion("Sqd_custom2 <>", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2GreaterThan(String value) {
            addCriterion("Sqd_custom2 >", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_custom2 >=", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2LessThan(String value) {
            addCriterion("Sqd_custom2 <", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2LessThanOrEqualTo(String value) {
            addCriterion("Sqd_custom2 <=", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2Like(String value) {
            addCriterion("Sqd_custom2 like", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2NotLike(String value) {
            addCriterion("Sqd_custom2 not like", value, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2In(List<String> values) {
            addCriterion("Sqd_custom2 in", values, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2NotIn(List<String> values) {
            addCriterion("Sqd_custom2 not in", values, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2Between(String value1, String value2) {
            addCriterion("Sqd_custom2 between", value1, value2, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom2NotBetween(String value1, String value2) {
            addCriterion("Sqd_custom2 not between", value1, value2, "sqdCustom2");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3IsNull() {
            addCriterion("Sqd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3IsNotNull() {
            addCriterion("Sqd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3EqualTo(String value) {
            addCriterion("Sqd_custom3 =", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3NotEqualTo(String value) {
            addCriterion("Sqd_custom3 <>", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3GreaterThan(String value) {
            addCriterion("Sqd_custom3 >", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("Sqd_custom3 >=", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3LessThan(String value) {
            addCriterion("Sqd_custom3 <", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3LessThanOrEqualTo(String value) {
            addCriterion("Sqd_custom3 <=", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3Like(String value) {
            addCriterion("Sqd_custom3 like", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3NotLike(String value) {
            addCriterion("Sqd_custom3 not like", value, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3In(List<String> values) {
            addCriterion("Sqd_custom3 in", values, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3NotIn(List<String> values) {
            addCriterion("Sqd_custom3 not in", values, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3Between(String value1, String value2) {
            addCriterion("Sqd_custom3 between", value1, value2, "sqdCustom3");
            return (Criteria) this;
        }

        public Criteria andSqdCustom3NotBetween(String value1, String value2) {
            addCriterion("Sqd_custom3 not between", value1, value2, "sqdCustom3");
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