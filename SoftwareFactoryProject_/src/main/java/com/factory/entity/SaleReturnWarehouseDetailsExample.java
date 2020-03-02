package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleReturnWarehouseDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleReturnWarehouseDetailsExample() {
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

        public Criteria andSrwdIdIsNull() {
            addCriterion("srwd_id is null");
            return (Criteria) this;
        }

        public Criteria andSrwdIdIsNotNull() {
            addCriterion("srwd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdIdEqualTo(Integer value) {
            addCriterion("srwd_id =", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdNotEqualTo(Integer value) {
            addCriterion("srwd_id <>", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdGreaterThan(Integer value) {
            addCriterion("srwd_id >", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srwd_id >=", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdLessThan(Integer value) {
            addCriterion("srwd_id <", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdLessThanOrEqualTo(Integer value) {
            addCriterion("srwd_id <=", value, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdIn(List<Integer> values) {
            addCriterion("srwd_id in", values, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdNotIn(List<Integer> values) {
            addCriterion("srwd_id not in", values, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdBetween(Integer value1, Integer value2) {
            addCriterion("srwd_id between", value1, value2, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srwd_id not between", value1, value2, "srwdId");
            return (Criteria) this;
        }

        public Criteria andSrwIdIsNull() {
            addCriterion("srw_id is null");
            return (Criteria) this;
        }

        public Criteria andSrwIdIsNotNull() {
            addCriterion("srw_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrwIdEqualTo(Integer value) {
            addCriterion("srw_id =", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotEqualTo(Integer value) {
            addCriterion("srw_id <>", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdGreaterThan(Integer value) {
            addCriterion("srw_id >", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srw_id >=", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdLessThan(Integer value) {
            addCriterion("srw_id <", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdLessThanOrEqualTo(Integer value) {
            addCriterion("srw_id <=", value, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdIn(List<Integer> values) {
            addCriterion("srw_id in", values, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotIn(List<Integer> values) {
            addCriterion("srw_id not in", values, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdBetween(Integer value1, Integer value2) {
            addCriterion("srw_id between", value1, value2, "srwId");
            return (Criteria) this;
        }

        public Criteria andSrwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srw_id not between", value1, value2, "srwId");
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

        public Criteria andSrwdEngnameIsNull() {
            addCriterion("srwd_engname is null");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameIsNotNull() {
            addCriterion("srwd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameEqualTo(String value) {
            addCriterion("srwd_engname =", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameNotEqualTo(String value) {
            addCriterion("srwd_engname <>", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameGreaterThan(String value) {
            addCriterion("srwd_engname >", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_engname >=", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameLessThan(String value) {
            addCriterion("srwd_engname <", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameLessThanOrEqualTo(String value) {
            addCriterion("srwd_engname <=", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameLike(String value) {
            addCriterion("srwd_engname like", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameNotLike(String value) {
            addCriterion("srwd_engname not like", value, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameIn(List<String> values) {
            addCriterion("srwd_engname in", values, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameNotIn(List<String> values) {
            addCriterion("srwd_engname not in", values, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameBetween(String value1, String value2) {
            addCriterion("srwd_engname between", value1, value2, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdEngnameNotBetween(String value1, String value2) {
            addCriterion("srwd_engname not between", value1, value2, "srwdEngname");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkIsNull() {
            addCriterion("srwd_remark is null");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkIsNotNull() {
            addCriterion("srwd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkEqualTo(String value) {
            addCriterion("srwd_remark =", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkNotEqualTo(String value) {
            addCriterion("srwd_remark <>", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkGreaterThan(String value) {
            addCriterion("srwd_remark >", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_remark >=", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkLessThan(String value) {
            addCriterion("srwd_remark <", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkLessThanOrEqualTo(String value) {
            addCriterion("srwd_remark <=", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkLike(String value) {
            addCriterion("srwd_remark like", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkNotLike(String value) {
            addCriterion("srwd_remark not like", value, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkIn(List<String> values) {
            addCriterion("srwd_remark in", values, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkNotIn(List<String> values) {
            addCriterion("srwd_remark not in", values, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkBetween(String value1, String value2) {
            addCriterion("srwd_remark between", value1, value2, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarkNotBetween(String value1, String value2) {
            addCriterion("srwd_remark not between", value1, value2, "srwdRemark");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxIsNull() {
            addCriterion("srwd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxIsNotNull() {
            addCriterion("srwd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxEqualTo(String value) {
            addCriterion("srwd_price_include_tax =", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("srwd_price_include_tax <>", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("srwd_price_include_tax >", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_price_include_tax >=", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxLessThan(String value) {
            addCriterion("srwd_price_include_tax <", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("srwd_price_include_tax <=", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxLike(String value) {
            addCriterion("srwd_price_include_tax like", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxNotLike(String value) {
            addCriterion("srwd_price_include_tax not like", value, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxIn(List<String> values) {
            addCriterion("srwd_price_include_tax in", values, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("srwd_price_include_tax not in", values, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("srwd_price_include_tax between", value1, value2, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("srwd_price_include_tax not between", value1, value2, "srwdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusIsNull() {
            addCriterion("srwd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusIsNotNull() {
            addCriterion("srwd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusEqualTo(Integer value) {
            addCriterion("srwd_single_status =", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusNotEqualTo(Integer value) {
            addCriterion("srwd_single_status <>", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusGreaterThan(Integer value) {
            addCriterion("srwd_single_status >", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("srwd_single_status >=", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusLessThan(Integer value) {
            addCriterion("srwd_single_status <", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("srwd_single_status <=", value, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusIn(List<Integer> values) {
            addCriterion("srwd_single_status in", values, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusNotIn(List<Integer> values) {
            addCriterion("srwd_single_status not in", values, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("srwd_single_status between", value1, value2, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("srwd_single_status not between", value1, value2, "srwdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateIsNull() {
            addCriterion("srwd_document_date is null");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateIsNotNull() {
            addCriterion("srwd_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("srwd_document_date =", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("srwd_document_date <>", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("srwd_document_date >", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srwd_document_date >=", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("srwd_document_date <", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("srwd_document_date <=", value, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("srwd_document_date in", values, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("srwd_document_date not in", values, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srwd_document_date between", value1, value2, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("srwd_document_date not between", value1, value2, "srwdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberIsNull() {
            addCriterion("srwd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberIsNotNull() {
            addCriterion("srwd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberEqualTo(Float value) {
            addCriterion("srwd_document_number =", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberNotEqualTo(Float value) {
            addCriterion("srwd_document_number <>", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberGreaterThan(Float value) {
            addCriterion("srwd_document_number >", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_document_number >=", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberLessThan(Float value) {
            addCriterion("srwd_document_number <", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberLessThanOrEqualTo(Float value) {
            addCriterion("srwd_document_number <=", value, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberIn(List<Float> values) {
            addCriterion("srwd_document_number in", values, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberNotIn(List<Float> values) {
            addCriterion("srwd_document_number not in", values, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberBetween(Float value1, Float value2) {
            addCriterion("srwd_document_number between", value1, value2, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdDocumentNumberNotBetween(Float value1, Float value2) {
            addCriterion("srwd_document_number not between", value1, value2, "srwdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIsNull() {
            addCriterion("srwd_price is null");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIsNotNull() {
            addCriterion("srwd_price is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceEqualTo(Float value) {
            addCriterion("srwd_price =", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceNotEqualTo(Float value) {
            addCriterion("srwd_price <>", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceGreaterThan(Float value) {
            addCriterion("srwd_price >", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_price >=", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceLessThan(Float value) {
            addCriterion("srwd_price <", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceLessThanOrEqualTo(Float value) {
            addCriterion("srwd_price <=", value, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceIn(List<Float> values) {
            addCriterion("srwd_price in", values, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceNotIn(List<Float> values) {
            addCriterion("srwd_price not in", values, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceBetween(Float value1, Float value2) {
            addCriterion("srwd_price between", value1, value2, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdPriceNotBetween(Float value1, Float value2) {
            addCriterion("srwd_price not between", value1, value2, "srwdPrice");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyIsNull() {
            addCriterion("srwd_money is null");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyIsNotNull() {
            addCriterion("srwd_money is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyEqualTo(Float value) {
            addCriterion("srwd_money =", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyNotEqualTo(Float value) {
            addCriterion("srwd_money <>", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyGreaterThan(Float value) {
            addCriterion("srwd_money >", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_money >=", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyLessThan(Float value) {
            addCriterion("srwd_money <", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("srwd_money <=", value, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyIn(List<Float> values) {
            addCriterion("srwd_money in", values, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyNotIn(List<Float> values) {
            addCriterion("srwd_money not in", values, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyBetween(Float value1, Float value2) {
            addCriterion("srwd_money between", value1, value2, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("srwd_money not between", value1, value2, "srwdMoney");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateIsNull() {
            addCriterion("srwd_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateIsNotNull() {
            addCriterion("srwd_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateEqualTo(Float value) {
            addCriterion("srwd_tax_rate =", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateNotEqualTo(Float value) {
            addCriterion("srwd_tax_rate <>", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateGreaterThan(Float value) {
            addCriterion("srwd_tax_rate >", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_tax_rate >=", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateLessThan(Float value) {
            addCriterion("srwd_tax_rate <", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("srwd_tax_rate <=", value, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateIn(List<Float> values) {
            addCriterion("srwd_tax_rate in", values, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateNotIn(List<Float> values) {
            addCriterion("srwd_tax_rate not in", values, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateBetween(Float value1, Float value2) {
            addCriterion("srwd_tax_rate between", value1, value2, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("srwd_tax_rate not between", value1, value2, "srwdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountIsNull() {
            addCriterion("srwd_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountIsNotNull() {
            addCriterion("srwd_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountEqualTo(Float value) {
            addCriterion("srwd_tax_amount =", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountNotEqualTo(Float value) {
            addCriterion("srwd_tax_amount <>", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountGreaterThan(Float value) {
            addCriterion("srwd_tax_amount >", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_tax_amount >=", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountLessThan(Float value) {
            addCriterion("srwd_tax_amount <", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("srwd_tax_amount <=", value, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountIn(List<Float> values) {
            addCriterion("srwd_tax_amount in", values, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountNotIn(List<Float> values) {
            addCriterion("srwd_tax_amount not in", values, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountBetween(Float value1, Float value2) {
            addCriterion("srwd_tax_amount between", value1, value2, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("srwd_tax_amount not between", value1, value2, "srwdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountIsNull() {
            addCriterion("srwd_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountIsNotNull() {
            addCriterion("srwd_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountEqualTo(Float value) {
            addCriterion("srwd_including_tax_amount =", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("srwd_including_tax_amount <>", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("srwd_including_tax_amount >", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("srwd_including_tax_amount >=", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountLessThan(Float value) {
            addCriterion("srwd_including_tax_amount <", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("srwd_including_tax_amount <=", value, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountIn(List<Float> values) {
            addCriterion("srwd_including_tax_amount in", values, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("srwd_including_tax_amount not in", values, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("srwd_including_tax_amount between", value1, value2, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("srwd_including_tax_amount not between", value1, value2, "srwdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberIsNull() {
            addCriterion("srwd_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberIsNotNull() {
            addCriterion("srwd_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberEqualTo(String value) {
            addCriterion("srwd_batch_number =", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberNotEqualTo(String value) {
            addCriterion("srwd_batch_number <>", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberGreaterThan(String value) {
            addCriterion("srwd_batch_number >", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_batch_number >=", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberLessThan(String value) {
            addCriterion("srwd_batch_number <", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("srwd_batch_number <=", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberLike(String value) {
            addCriterion("srwd_batch_number like", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberNotLike(String value) {
            addCriterion("srwd_batch_number not like", value, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberIn(List<String> values) {
            addCriterion("srwd_batch_number in", values, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberNotIn(List<String> values) {
            addCriterion("srwd_batch_number not in", values, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberBetween(String value1, String value2) {
            addCriterion("srwd_batch_number between", value1, value2, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdBatchNumberNotBetween(String value1, String value2) {
            addCriterion("srwd_batch_number not between", value1, value2, "srwdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftIsNull() {
            addCriterion("srwd_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftIsNotNull() {
            addCriterion("srwd_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftEqualTo(String value) {
            addCriterion("srwd_ifgift =", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftNotEqualTo(String value) {
            addCriterion("srwd_ifgift <>", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftGreaterThan(String value) {
            addCriterion("srwd_ifgift >", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_ifgift >=", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftLessThan(String value) {
            addCriterion("srwd_ifgift <", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftLessThanOrEqualTo(String value) {
            addCriterion("srwd_ifgift <=", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftLike(String value) {
            addCriterion("srwd_ifgift like", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftNotLike(String value) {
            addCriterion("srwd_ifgift not like", value, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftIn(List<String> values) {
            addCriterion("srwd_ifgift in", values, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftNotIn(List<String> values) {
            addCriterion("srwd_ifgift not in", values, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftBetween(String value1, String value2) {
            addCriterion("srwd_ifgift between", value1, value2, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdIfgiftNotBetween(String value1, String value2) {
            addCriterion("srwd_ifgift not between", value1, value2, "srwdIfgift");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsIsNull() {
            addCriterion("srwd_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsIsNotNull() {
            addCriterion("srwd_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsEqualTo(String value) {
            addCriterion("srwd_invoice_details =", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsNotEqualTo(String value) {
            addCriterion("srwd_invoice_details <>", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsGreaterThan(String value) {
            addCriterion("srwd_invoice_details >", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_invoice_details >=", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsLessThan(String value) {
            addCriterion("srwd_invoice_details <", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("srwd_invoice_details <=", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsLike(String value) {
            addCriterion("srwd_invoice_details like", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsNotLike(String value) {
            addCriterion("srwd_invoice_details not like", value, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsIn(List<String> values) {
            addCriterion("srwd_invoice_details in", values, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsNotIn(List<String> values) {
            addCriterion("srwd_invoice_details not in", values, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("srwd_invoice_details between", value1, value2, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("srwd_invoice_details not between", value1, value2, "srwdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIsNull() {
            addCriterion("srwd_nomake_invoice_num is null");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIsNotNull() {
            addCriterion("srwd_nomake_invoice_num is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num =", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num <>", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumGreaterThan(Integer value) {
            addCriterion("srwd_nomake_invoice_num >", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num >=", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumLessThan(Integer value) {
            addCriterion("srwd_nomake_invoice_num <", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num <=", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIn(List<Integer> values) {
            addCriterion("srwd_nomake_invoice_num in", values, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotIn(List<Integer> values) {
            addCriterion("srwd_nomake_invoice_num not in", values, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumBetween(Integer value1, Integer value2) {
            addCriterion("srwd_nomake_invoice_num between", value1, value2, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("srwd_nomake_invoice_num not between", value1, value2, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksIsNull() {
            addCriterion("srwd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksIsNotNull() {
            addCriterion("srwd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksEqualTo(String value) {
            addCriterion("srwd_remarks =", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksNotEqualTo(String value) {
            addCriterion("srwd_remarks <>", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksGreaterThan(String value) {
            addCriterion("srwd_remarks >", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_remarks >=", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksLessThan(String value) {
            addCriterion("srwd_remarks <", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksLessThanOrEqualTo(String value) {
            addCriterion("srwd_remarks <=", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksLike(String value) {
            addCriterion("srwd_remarks like", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksNotLike(String value) {
            addCriterion("srwd_remarks not like", value, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksIn(List<String> values) {
            addCriterion("srwd_remarks in", values, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksNotIn(List<String> values) {
            addCriterion("srwd_remarks not in", values, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksBetween(String value1, String value2) {
            addCriterion("srwd_remarks between", value1, value2, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdRemarksNotBetween(String value1, String value2) {
            addCriterion("srwd_remarks not between", value1, value2, "srwdRemarks");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderIsNull() {
            addCriterion("srwd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderIsNotNull() {
            addCriterion("srwd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderEqualTo(String value) {
            addCriterion("srwd_source_order =", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderNotEqualTo(String value) {
            addCriterion("srwd_source_order <>", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderGreaterThan(String value) {
            addCriterion("srwd_source_order >", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_source_order >=", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderLessThan(String value) {
            addCriterion("srwd_source_order <", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("srwd_source_order <=", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderLike(String value) {
            addCriterion("srwd_source_order like", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderNotLike(String value) {
            addCriterion("srwd_source_order not like", value, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderIn(List<String> values) {
            addCriterion("srwd_source_order in", values, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderNotIn(List<String> values) {
            addCriterion("srwd_source_order not in", values, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderBetween(String value1, String value2) {
            addCriterion("srwd_source_order between", value1, value2, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("srwd_source_order not between", value1, value2, "srwdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoIsNull() {
            addCriterion("srwd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoIsNotNull() {
            addCriterion("srwd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoEqualTo(String value) {
            addCriterion("srwd_source_no =", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoNotEqualTo(String value) {
            addCriterion("srwd_source_no <>", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoGreaterThan(String value) {
            addCriterion("srwd_source_no >", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_source_no >=", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoLessThan(String value) {
            addCriterion("srwd_source_no <", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("srwd_source_no <=", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoLike(String value) {
            addCriterion("srwd_source_no like", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoNotLike(String value) {
            addCriterion("srwd_source_no not like", value, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoIn(List<String> values) {
            addCriterion("srwd_source_no in", values, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoNotIn(List<String> values) {
            addCriterion("srwd_source_no not in", values, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoBetween(String value1, String value2) {
            addCriterion("srwd_source_no between", value1, value2, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdSourceNoNotBetween(String value1, String value2) {
            addCriterion("srwd_source_no not between", value1, value2, "srwdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingIsNull() {
            addCriterion("srwd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingIsNotNull() {
            addCriterion("srwd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingEqualTo(String value) {
            addCriterion("srwd_auditing =", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingNotEqualTo(String value) {
            addCriterion("srwd_auditing <>", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingGreaterThan(String value) {
            addCriterion("srwd_auditing >", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_auditing >=", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingLessThan(String value) {
            addCriterion("srwd_auditing <", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingLessThanOrEqualTo(String value) {
            addCriterion("srwd_auditing <=", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingLike(String value) {
            addCriterion("srwd_auditing like", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingNotLike(String value) {
            addCriterion("srwd_auditing not like", value, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingIn(List<String> values) {
            addCriterion("srwd_auditing in", values, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingNotIn(List<String> values) {
            addCriterion("srwd_auditing not in", values, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingBetween(String value1, String value2) {
            addCriterion("srwd_auditing between", value1, value2, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdAuditingNotBetween(String value1, String value2) {
            addCriterion("srwd_auditing not between", value1, value2, "srwdAuditing");
            return (Criteria) this;
        }

        public Criteria andSrwdYnIsNull() {
            addCriterion("srwd_yn is null");
            return (Criteria) this;
        }

        public Criteria andSrwdYnIsNotNull() {
            addCriterion("srwd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdYnEqualTo(String value) {
            addCriterion("srwd_yn =", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnNotEqualTo(String value) {
            addCriterion("srwd_yn <>", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnGreaterThan(String value) {
            addCriterion("srwd_yn >", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnGreaterThanOrEqualTo(String value) {
            addCriterion("srwd_yn >=", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnLessThan(String value) {
            addCriterion("srwd_yn <", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnLessThanOrEqualTo(String value) {
            addCriterion("srwd_yn <=", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnLike(String value) {
            addCriterion("srwd_yn like", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnNotLike(String value) {
            addCriterion("srwd_yn not like", value, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnIn(List<String> values) {
            addCriterion("srwd_yn in", values, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnNotIn(List<String> values) {
            addCriterion("srwd_yn not in", values, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnBetween(String value1, String value2) {
            addCriterion("srwd_yn between", value1, value2, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdYnNotBetween(String value1, String value2) {
            addCriterion("srwd_yn not between", value1, value2, "srwdYn");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1IsNull() {
            addCriterion("srwd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1IsNotNull() {
            addCriterion("srwd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1EqualTo(String value) {
            addCriterion("srwd_custom1 =", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1NotEqualTo(String value) {
            addCriterion("srwd_custom1 <>", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1GreaterThan(String value) {
            addCriterion("srwd_custom1 >", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("srwd_custom1 >=", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1LessThan(String value) {
            addCriterion("srwd_custom1 <", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1LessThanOrEqualTo(String value) {
            addCriterion("srwd_custom1 <=", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1Like(String value) {
            addCriterion("srwd_custom1 like", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1NotLike(String value) {
            addCriterion("srwd_custom1 not like", value, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1In(List<String> values) {
            addCriterion("srwd_custom1 in", values, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1NotIn(List<String> values) {
            addCriterion("srwd_custom1 not in", values, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1Between(String value1, String value2) {
            addCriterion("srwd_custom1 between", value1, value2, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom1NotBetween(String value1, String value2) {
            addCriterion("srwd_custom1 not between", value1, value2, "srwdCustom1");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2IsNull() {
            addCriterion("srwd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2IsNotNull() {
            addCriterion("srwd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2EqualTo(String value) {
            addCriterion("srwd_custom2 =", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2NotEqualTo(String value) {
            addCriterion("srwd_custom2 <>", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2GreaterThan(String value) {
            addCriterion("srwd_custom2 >", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("srwd_custom2 >=", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2LessThan(String value) {
            addCriterion("srwd_custom2 <", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2LessThanOrEqualTo(String value) {
            addCriterion("srwd_custom2 <=", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2Like(String value) {
            addCriterion("srwd_custom2 like", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2NotLike(String value) {
            addCriterion("srwd_custom2 not like", value, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2In(List<String> values) {
            addCriterion("srwd_custom2 in", values, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2NotIn(List<String> values) {
            addCriterion("srwd_custom2 not in", values, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2Between(String value1, String value2) {
            addCriterion("srwd_custom2 between", value1, value2, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom2NotBetween(String value1, String value2) {
            addCriterion("srwd_custom2 not between", value1, value2, "srwdCustom2");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3IsNull() {
            addCriterion("srwd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3IsNotNull() {
            addCriterion("srwd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3EqualTo(String value) {
            addCriterion("srwd_custom3 =", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3NotEqualTo(String value) {
            addCriterion("srwd_custom3 <>", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3GreaterThan(String value) {
            addCriterion("srwd_custom3 >", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("srwd_custom3 >=", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3LessThan(String value) {
            addCriterion("srwd_custom3 <", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3LessThanOrEqualTo(String value) {
            addCriterion("srwd_custom3 <=", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3Like(String value) {
            addCriterion("srwd_custom3 like", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3NotLike(String value) {
            addCriterion("srwd_custom3 not like", value, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3In(List<String> values) {
            addCriterion("srwd_custom3 in", values, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3NotIn(List<String> values) {
            addCriterion("srwd_custom3 not in", values, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3Between(String value1, String value2) {
            addCriterion("srwd_custom3 between", value1, value2, "srwdCustom3");
            return (Criteria) this;
        }

        public Criteria andSrwdCustom3NotBetween(String value1, String value2) {
            addCriterion("srwd_custom3 not between", value1, value2, "srwdCustom3");
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