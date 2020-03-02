package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class AllocationScheduleBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationScheduleBillExample() {
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

        public Criteria andAsbidIsNull() {
            addCriterion("asbid is null");
            return (Criteria) this;
        }

        public Criteria andAsbidIsNotNull() {
            addCriterion("asbid is not null");
            return (Criteria) this;
        }

        public Criteria andAsbidEqualTo(Integer value) {
            addCriterion("asbid =", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidNotEqualTo(Integer value) {
            addCriterion("asbid <>", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidGreaterThan(Integer value) {
            addCriterion("asbid >", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("asbid >=", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidLessThan(Integer value) {
            addCriterion("asbid <", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidLessThanOrEqualTo(Integer value) {
            addCriterion("asbid <=", value, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidIn(List<Integer> values) {
            addCriterion("asbid in", values, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidNotIn(List<Integer> values) {
            addCriterion("asbid not in", values, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidBetween(Integer value1, Integer value2) {
            addCriterion("asbid between", value1, value2, "asbid");
            return (Criteria) this;
        }

        public Criteria andAsbidNotBetween(Integer value1, Integer value2) {
            addCriterion("asbid not between", value1, value2, "asbid");
            return (Criteria) this;
        }

        public Criteria andApbidIsNull() {
            addCriterion("apbid is null");
            return (Criteria) this;
        }

        public Criteria andApbidIsNotNull() {
            addCriterion("apbid is not null");
            return (Criteria) this;
        }

        public Criteria andApbidEqualTo(String value) {
            addCriterion("apbid =", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotEqualTo(String value) {
            addCriterion("apbid <>", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidGreaterThan(String value) {
            addCriterion("apbid >", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidGreaterThanOrEqualTo(String value) {
            addCriterion("apbid >=", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLessThan(String value) {
            addCriterion("apbid <", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLessThanOrEqualTo(String value) {
            addCriterion("apbid <=", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidLike(String value) {
            addCriterion("apbid like", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotLike(String value) {
            addCriterion("apbid not like", value, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidIn(List<String> values) {
            addCriterion("apbid in", values, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotIn(List<String> values) {
            addCriterion("apbid not in", values, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidBetween(String value1, String value2) {
            addCriterion("apbid between", value1, value2, "apbid");
            return (Criteria) this;
        }

        public Criteria andApbidNotBetween(String value1, String value2) {
            addCriterion("apbid not between", value1, value2, "apbid");
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

        public Criteria andWmrexistingnumberIsNull() {
            addCriterion("wmrExistingNumber is null");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberIsNotNull() {
            addCriterion("wmrExistingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberEqualTo(Integer value) {
            addCriterion("wmrExistingNumber =", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberNotEqualTo(Integer value) {
            addCriterion("wmrExistingNumber <>", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberGreaterThan(Integer value) {
            addCriterion("wmrExistingNumber >", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("wmrExistingNumber >=", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberLessThan(Integer value) {
            addCriterion("wmrExistingNumber <", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberLessThanOrEqualTo(Integer value) {
            addCriterion("wmrExistingNumber <=", value, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberIn(List<Integer> values) {
            addCriterion("wmrExistingNumber in", values, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberNotIn(List<Integer> values) {
            addCriterion("wmrExistingNumber not in", values, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberBetween(Integer value1, Integer value2) {
            addCriterion("wmrExistingNumber between", value1, value2, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andWmrexistingnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("wmrExistingNumber not between", value1, value2, "wmrexistingnumber");
            return (Criteria) this;
        }

        public Criteria andAmoutIsNull() {
            addCriterion("amout is null");
            return (Criteria) this;
        }

        public Criteria andAmoutIsNotNull() {
            addCriterion("amout is not null");
            return (Criteria) this;
        }

        public Criteria andAmoutEqualTo(Integer value) {
            addCriterion("amout =", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotEqualTo(Integer value) {
            addCriterion("amout <>", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutGreaterThan(Integer value) {
            addCriterion("amout >", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("amout >=", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutLessThan(Integer value) {
            addCriterion("amout <", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutLessThanOrEqualTo(Integer value) {
            addCriterion("amout <=", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutIn(List<Integer> values) {
            addCriterion("amout in", values, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotIn(List<Integer> values) {
            addCriterion("amout not in", values, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutBetween(Integer value1, Integer value2) {
            addCriterion("amout between", value1, value2, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotBetween(Integer value1, Integer value2) {
            addCriterion("amout not between", value1, value2, "amout");
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