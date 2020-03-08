package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class DiscountschedulebillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscountschedulebillExample() {
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

        public Criteria andDsbidIsNull() {
            addCriterion("dsbid is null");
            return (Criteria) this;
        }

        public Criteria andDsbidIsNotNull() {
            addCriterion("dsbid is not null");
            return (Criteria) this;
        }

        public Criteria andDsbidEqualTo(Integer value) {
            addCriterion("dsbid =", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidNotEqualTo(Integer value) {
            addCriterion("dsbid <>", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidGreaterThan(Integer value) {
            addCriterion("dsbid >", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsbid >=", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidLessThan(Integer value) {
            addCriterion("dsbid <", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidLessThanOrEqualTo(Integer value) {
            addCriterion("dsbid <=", value, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidIn(List<Integer> values) {
            addCriterion("dsbid in", values, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidNotIn(List<Integer> values) {
            addCriterion("dsbid not in", values, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidBetween(Integer value1, Integer value2) {
            addCriterion("dsbid between", value1, value2, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDsbidNotBetween(Integer value1, Integer value2) {
            addCriterion("dsbid not between", value1, value2, "dsbid");
            return (Criteria) this;
        }

        public Criteria andDpbidIsNull() {
            addCriterion("dpbid is null");
            return (Criteria) this;
        }

        public Criteria andDpbidIsNotNull() {
            addCriterion("dpbid is not null");
            return (Criteria) this;
        }

        public Criteria andDpbidEqualTo(String value) {
            addCriterion("dpbid =", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotEqualTo(String value) {
            addCriterion("dpbid <>", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidGreaterThan(String value) {
            addCriterion("dpbid >", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidGreaterThanOrEqualTo(String value) {
            addCriterion("dpbid >=", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLessThan(String value) {
            addCriterion("dpbid <", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLessThanOrEqualTo(String value) {
            addCriterion("dpbid <=", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidLike(String value) {
            addCriterion("dpbid like", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotLike(String value) {
            addCriterion("dpbid not like", value, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidIn(List<String> values) {
            addCriterion("dpbid in", values, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotIn(List<String> values) {
            addCriterion("dpbid not in", values, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidBetween(String value1, String value2) {
            addCriterion("dpbid between", value1, value2, "dpbid");
            return (Criteria) this;
        }

        public Criteria andDpbidNotBetween(String value1, String value2) {
            addCriterion("dpbid not between", value1, value2, "dpbid");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNull() {
            addCriterion("stockNumber is null");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNotNull() {
            addCriterion("stockNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumberEqualTo(String value) {
            addCriterion("stockNumber =", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotEqualTo(String value) {
            addCriterion("stockNumber <>", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThan(String value) {
            addCriterion("stockNumber >", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThanOrEqualTo(String value) {
            addCriterion("stockNumber >=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThan(String value) {
            addCriterion("stockNumber <", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThanOrEqualTo(String value) {
            addCriterion("stockNumber <=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLike(String value) {
            addCriterion("stockNumber like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotLike(String value) {
            addCriterion("stockNumber not like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberIn(List<String> values) {
            addCriterion("stockNumber in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotIn(List<String> values) {
            addCriterion("stockNumber not in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberBetween(String value1, String value2) {
            addCriterion("stockNumber between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotBetween(String value1, String value2) {
            addCriterion("stockNumber not between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNull() {
            addCriterion("matterName is null");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNotNull() {
            addCriterion("matterName is not null");
            return (Criteria) this;
        }

        public Criteria andMatternameEqualTo(String value) {
            addCriterion("matterName =", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotEqualTo(String value) {
            addCriterion("matterName <>", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThan(String value) {
            addCriterion("matterName >", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThanOrEqualTo(String value) {
            addCriterion("matterName >=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThan(String value) {
            addCriterion("matterName <", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThanOrEqualTo(String value) {
            addCriterion("matterName <=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLike(String value) {
            addCriterion("matterName like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotLike(String value) {
            addCriterion("matterName not like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameIn(List<String> values) {
            addCriterion("matterName in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotIn(List<String> values) {
            addCriterion("matterName not in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameBetween(String value1, String value2) {
            addCriterion("matterName between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotBetween(String value1, String value2) {
            addCriterion("matterName not between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMattersizeIsNull() {
            addCriterion("matterSize is null");
            return (Criteria) this;
        }

        public Criteria andMattersizeIsNotNull() {
            addCriterion("matterSize is not null");
            return (Criteria) this;
        }

        public Criteria andMattersizeEqualTo(String value) {
            addCriterion("matterSize =", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeNotEqualTo(String value) {
            addCriterion("matterSize <>", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeGreaterThan(String value) {
            addCriterion("matterSize >", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeGreaterThanOrEqualTo(String value) {
            addCriterion("matterSize >=", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeLessThan(String value) {
            addCriterion("matterSize <", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeLessThanOrEqualTo(String value) {
            addCriterion("matterSize <=", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeLike(String value) {
            addCriterion("matterSize like", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeNotLike(String value) {
            addCriterion("matterSize not like", value, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeIn(List<String> values) {
            addCriterion("matterSize in", values, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeNotIn(List<String> values) {
            addCriterion("matterSize not in", values, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeBetween(String value1, String value2) {
            addCriterion("matterSize between", value1, value2, "mattersize");
            return (Criteria) this;
        }

        public Criteria andMattersizeNotBetween(String value1, String value2) {
            addCriterion("matterSize not between", value1, value2, "mattersize");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("unitid is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitid is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("unitid =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("unitid <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("unitid >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("unitid >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("unitid <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("unitid <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("unitid like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("unitid not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("unitid in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("unitid not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("unitid between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("unitid not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountIsNull() {
            addCriterion("matter_nowcount is null");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountIsNotNull() {
            addCriterion("matter_nowcount is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountEqualTo(Integer value) {
            addCriterion("matter_nowcount =", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountNotEqualTo(Integer value) {
            addCriterion("matter_nowcount <>", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountGreaterThan(Integer value) {
            addCriterion("matter_nowcount >", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_nowcount >=", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountLessThan(Integer value) {
            addCriterion("matter_nowcount <", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountLessThanOrEqualTo(Integer value) {
            addCriterion("matter_nowcount <=", value, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountIn(List<Integer> values) {
            addCriterion("matter_nowcount in", values, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountNotIn(List<Integer> values) {
            addCriterion("matter_nowcount not in", values, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountBetween(Integer value1, Integer value2) {
            addCriterion("matter_nowcount between", value1, value2, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowcountNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_nowcount not between", value1, value2, "matterNowcount");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostIsNull() {
            addCriterion("matter_nowavgcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostIsNotNull() {
            addCriterion("matter_nowavgcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostEqualTo(Float value) {
            addCriterion("matter_nowavgcost =", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostNotEqualTo(Float value) {
            addCriterion("matter_nowavgcost <>", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostGreaterThan(Float value) {
            addCriterion("matter_nowavgcost >", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_nowavgcost >=", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostLessThan(Float value) {
            addCriterion("matter_nowavgcost <", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_nowavgcost <=", value, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostIn(List<Float> values) {
            addCriterion("matter_nowavgcost in", values, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostNotIn(List<Float> values) {
            addCriterion("matter_nowavgcost not in", values, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostBetween(Float value1, Float value2) {
            addCriterion("matter_nowavgcost between", value1, value2, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowavgcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_nowavgcost not between", value1, value2, "matterNowavgcost");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Float value) {
            addCriterion("unitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Float value) {
            addCriterion("unitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Float value) {
            addCriterion("unitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("unitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Float value) {
            addCriterion("unitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Float value) {
            addCriterion("unitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Float> values) {
            addCriterion("unitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Float> values) {
            addCriterion("unitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Float value1, Float value2) {
            addCriterion("unitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Float value1, Float value2) {
            addCriterion("unitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNull() {
            addCriterion("discountPrice is null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNotNull() {
            addCriterion("discountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceEqualTo(Float value) {
            addCriterion("discountPrice =", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotEqualTo(Float value) {
            addCriterion("discountPrice <>", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThan(Float value) {
            addCriterion("discountPrice >", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("discountPrice >=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThan(Float value) {
            addCriterion("discountPrice <", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThanOrEqualTo(Float value) {
            addCriterion("discountPrice <=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIn(List<Float> values) {
            addCriterion("discountPrice in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotIn(List<Float> values) {
            addCriterion("discountPrice not in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceBetween(Float value1, Float value2) {
            addCriterion("discountPrice between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotBetween(Float value1, Float value2) {
            addCriterion("discountPrice not between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNull() {
            addCriterion("standby is null");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNotNull() {
            addCriterion("standby is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyEqualTo(String value) {
            addCriterion("standby =", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotEqualTo(String value) {
            addCriterion("standby <>", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThan(String value) {
            addCriterion("standby >", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThanOrEqualTo(String value) {
            addCriterion("standby >=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThan(String value) {
            addCriterion("standby <", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThanOrEqualTo(String value) {
            addCriterion("standby <=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLike(String value) {
            addCriterion("standby like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotLike(String value) {
            addCriterion("standby not like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyIn(List<String> values) {
            addCriterion("standby in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotIn(List<String> values) {
            addCriterion("standby not in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyBetween(String value1, String value2) {
            addCriterion("standby between", value1, value2, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotBetween(String value1, String value2) {
            addCriterion("standby not between", value1, value2, "standby");
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