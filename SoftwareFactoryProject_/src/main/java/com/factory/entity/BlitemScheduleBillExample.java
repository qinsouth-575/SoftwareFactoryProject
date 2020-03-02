package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class BlitemScheduleBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlitemScheduleBillExample() {
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

        public Criteria andBsbidIsNull() {
            addCriterion("bsbid is null");
            return (Criteria) this;
        }

        public Criteria andBsbidIsNotNull() {
            addCriterion("bsbid is not null");
            return (Criteria) this;
        }

        public Criteria andBsbidEqualTo(Integer value) {
            addCriterion("bsbid =", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotEqualTo(Integer value) {
            addCriterion("bsbid <>", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidGreaterThan(Integer value) {
            addCriterion("bsbid >", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bsbid >=", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidLessThan(Integer value) {
            addCriterion("bsbid <", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidLessThanOrEqualTo(Integer value) {
            addCriterion("bsbid <=", value, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidIn(List<Integer> values) {
            addCriterion("bsbid in", values, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotIn(List<Integer> values) {
            addCriterion("bsbid not in", values, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidBetween(Integer value1, Integer value2) {
            addCriterion("bsbid between", value1, value2, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBsbidNotBetween(Integer value1, Integer value2) {
            addCriterion("bsbid not between", value1, value2, "bsbid");
            return (Criteria) this;
        }

        public Criteria andBpbidIsNull() {
            addCriterion("bpbid is null");
            return (Criteria) this;
        }

        public Criteria andBpbidIsNotNull() {
            addCriterion("bpbid is not null");
            return (Criteria) this;
        }

        public Criteria andBpbidEqualTo(String value) {
            addCriterion("bpbid =", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotEqualTo(String value) {
            addCriterion("bpbid <>", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidGreaterThan(String value) {
            addCriterion("bpbid >", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidGreaterThanOrEqualTo(String value) {
            addCriterion("bpbid >=", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLessThan(String value) {
            addCriterion("bpbid <", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLessThanOrEqualTo(String value) {
            addCriterion("bpbid <=", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidLike(String value) {
            addCriterion("bpbid like", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotLike(String value) {
            addCriterion("bpbid not like", value, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidIn(List<String> values) {
            addCriterion("bpbid in", values, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotIn(List<String> values) {
            addCriterion("bpbid not in", values, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidBetween(String value1, String value2) {
            addCriterion("bpbid between", value1, value2, "bpbid");
            return (Criteria) this;
        }

        public Criteria andBpbidNotBetween(String value1, String value2) {
            addCriterion("bpbid not between", value1, value2, "bpbid");
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

        public Criteria andBookamoutIsNull() {
            addCriterion("bookAmout is null");
            return (Criteria) this;
        }

        public Criteria andBookamoutIsNotNull() {
            addCriterion("bookAmout is not null");
            return (Criteria) this;
        }

        public Criteria andBookamoutEqualTo(Integer value) {
            addCriterion("bookAmout =", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotEqualTo(Integer value) {
            addCriterion("bookAmout <>", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutGreaterThan(Integer value) {
            addCriterion("bookAmout >", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookAmout >=", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutLessThan(Integer value) {
            addCriterion("bookAmout <", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutLessThanOrEqualTo(Integer value) {
            addCriterion("bookAmout <=", value, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutIn(List<Integer> values) {
            addCriterion("bookAmout in", values, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotIn(List<Integer> values) {
            addCriterion("bookAmout not in", values, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutBetween(Integer value1, Integer value2) {
            addCriterion("bookAmout between", value1, value2, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBookamoutNotBetween(Integer value1, Integer value2) {
            addCriterion("bookAmout not between", value1, value2, "bookamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIsNull() {
            addCriterion("blitemAmout is null");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIsNotNull() {
            addCriterion("blitemAmout is not null");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutEqualTo(Integer value) {
            addCriterion("blitemAmout =", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotEqualTo(Integer value) {
            addCriterion("blitemAmout <>", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutGreaterThan(Integer value) {
            addCriterion("blitemAmout >", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("blitemAmout >=", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutLessThan(Integer value) {
            addCriterion("blitemAmout <", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutLessThanOrEqualTo(Integer value) {
            addCriterion("blitemAmout <=", value, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutIn(List<Integer> values) {
            addCriterion("blitemAmout in", values, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotIn(List<Integer> values) {
            addCriterion("blitemAmout not in", values, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutBetween(Integer value1, Integer value2) {
            addCriterion("blitemAmout between", value1, value2, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andBlitemamoutNotBetween(Integer value1, Integer value2) {
            addCriterion("blitemAmout not between", value1, value2, "blitemamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutIsNull() {
            addCriterion("palamout is null");
            return (Criteria) this;
        }

        public Criteria andPalamoutIsNotNull() {
            addCriterion("palamout is not null");
            return (Criteria) this;
        }

        public Criteria andPalamoutEqualTo(Integer value) {
            addCriterion("palamout =", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotEqualTo(Integer value) {
            addCriterion("palamout <>", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutGreaterThan(Integer value) {
            addCriterion("palamout >", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("palamout >=", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutLessThan(Integer value) {
            addCriterion("palamout <", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutLessThanOrEqualTo(Integer value) {
            addCriterion("palamout <=", value, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutIn(List<Integer> values) {
            addCriterion("palamout in", values, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotIn(List<Integer> values) {
            addCriterion("palamout not in", values, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutBetween(Integer value1, Integer value2) {
            addCriterion("palamout between", value1, value2, "palamout");
            return (Criteria) this;
        }

        public Criteria andPalamoutNotBetween(Integer value1, Integer value2) {
            addCriterion("palamout not between", value1, value2, "palamout");
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

        public Criteria andPalamoneyIsNull() {
            addCriterion("palaMoney is null");
            return (Criteria) this;
        }

        public Criteria andPalamoneyIsNotNull() {
            addCriterion("palaMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPalamoneyEqualTo(Float value) {
            addCriterion("palaMoney =", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyNotEqualTo(Float value) {
            addCriterion("palaMoney <>", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyGreaterThan(Float value) {
            addCriterion("palaMoney >", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("palaMoney >=", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyLessThan(Float value) {
            addCriterion("palaMoney <", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyLessThanOrEqualTo(Float value) {
            addCriterion("palaMoney <=", value, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyIn(List<Float> values) {
            addCriterion("palaMoney in", values, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyNotIn(List<Float> values) {
            addCriterion("palaMoney not in", values, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyBetween(Float value1, Float value2) {
            addCriterion("palaMoney between", value1, value2, "palamoney");
            return (Criteria) this;
        }

        public Criteria andPalamoneyNotBetween(Float value1, Float value2) {
            addCriterion("palaMoney not between", value1, value2, "palamoney");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("batchNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("batchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("batchNumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("batchNumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("batchNumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("batchNumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("batchNumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("batchNumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("batchNumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("batchNumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("batchNumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("batchNumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("batchNumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("batchNumber not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
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