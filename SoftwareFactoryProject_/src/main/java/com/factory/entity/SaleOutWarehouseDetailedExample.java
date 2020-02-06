package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleOutWarehouseDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOutWarehouseDetailedExample() {
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

        public Criteria andSowdIdIsNull() {
            addCriterion("sowd_id is null");
            return (Criteria) this;
        }

        public Criteria andSowdIdIsNotNull() {
            addCriterion("sowd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSowdIdEqualTo(String value) {
            addCriterion("sowd_id =", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdNotEqualTo(String value) {
            addCriterion("sowd_id <>", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdGreaterThan(String value) {
            addCriterion("sowd_id >", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_id >=", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdLessThan(String value) {
            addCriterion("sowd_id <", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdLessThanOrEqualTo(String value) {
            addCriterion("sowd_id <=", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdLike(String value) {
            addCriterion("sowd_id like", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdNotLike(String value) {
            addCriterion("sowd_id not like", value, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdIn(List<String> values) {
            addCriterion("sowd_id in", values, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdNotIn(List<String> values) {
            addCriterion("sowd_id not in", values, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdBetween(String value1, String value2) {
            addCriterion("sowd_id between", value1, value2, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowdIdNotBetween(String value1, String value2) {
            addCriterion("sowd_id not between", value1, value2, "sowdId");
            return (Criteria) this;
        }

        public Criteria andSowIdIsNull() {
            addCriterion("sow_id is null");
            return (Criteria) this;
        }

        public Criteria andSowIdIsNotNull() {
            addCriterion("sow_id is not null");
            return (Criteria) this;
        }

        public Criteria andSowIdEqualTo(String value) {
            addCriterion("sow_id =", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotEqualTo(String value) {
            addCriterion("sow_id <>", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdGreaterThan(String value) {
            addCriterion("sow_id >", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdGreaterThanOrEqualTo(String value) {
            addCriterion("sow_id >=", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLessThan(String value) {
            addCriterion("sow_id <", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLessThanOrEqualTo(String value) {
            addCriterion("sow_id <=", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdLike(String value) {
            addCriterion("sow_id like", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotLike(String value) {
            addCriterion("sow_id not like", value, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdIn(List<String> values) {
            addCriterion("sow_id in", values, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotIn(List<String> values) {
            addCriterion("sow_id not in", values, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdBetween(String value1, String value2) {
            addCriterion("sow_id between", value1, value2, "sowId");
            return (Criteria) this;
        }

        public Criteria andSowIdNotBetween(String value1, String value2) {
            addCriterion("sow_id not between", value1, value2, "sowId");
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

        public Criteria andSowdEngnameIsNull() {
            addCriterion("sowd_engname is null");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameIsNotNull() {
            addCriterion("sowd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameEqualTo(String value) {
            addCriterion("sowd_engname =", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameNotEqualTo(String value) {
            addCriterion("sowd_engname <>", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameGreaterThan(String value) {
            addCriterion("sowd_engname >", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_engname >=", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameLessThan(String value) {
            addCriterion("sowd_engname <", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameLessThanOrEqualTo(String value) {
            addCriterion("sowd_engname <=", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameLike(String value) {
            addCriterion("sowd_engname like", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameNotLike(String value) {
            addCriterion("sowd_engname not like", value, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameIn(List<String> values) {
            addCriterion("sowd_engname in", values, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameNotIn(List<String> values) {
            addCriterion("sowd_engname not in", values, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameBetween(String value1, String value2) {
            addCriterion("sowd_engname between", value1, value2, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdEngnameNotBetween(String value1, String value2) {
            addCriterion("sowd_engname not between", value1, value2, "sowdEngname");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkIsNull() {
            addCriterion("sowd_remark is null");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkIsNotNull() {
            addCriterion("sowd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkEqualTo(String value) {
            addCriterion("sowd_remark =", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkNotEqualTo(String value) {
            addCriterion("sowd_remark <>", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkGreaterThan(String value) {
            addCriterion("sowd_remark >", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_remark >=", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkLessThan(String value) {
            addCriterion("sowd_remark <", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkLessThanOrEqualTo(String value) {
            addCriterion("sowd_remark <=", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkLike(String value) {
            addCriterion("sowd_remark like", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkNotLike(String value) {
            addCriterion("sowd_remark not like", value, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkIn(List<String> values) {
            addCriterion("sowd_remark in", values, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkNotIn(List<String> values) {
            addCriterion("sowd_remark not in", values, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkBetween(String value1, String value2) {
            addCriterion("sowd_remark between", value1, value2, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdRemarkNotBetween(String value1, String value2) {
            addCriterion("sowd_remark not between", value1, value2, "sowdRemark");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxIsNull() {
            addCriterion("sowd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxIsNotNull() {
            addCriterion("sowd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxEqualTo(String value) {
            addCriterion("sowd_price_include_tax =", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("sowd_price_include_tax <>", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("sowd_price_include_tax >", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_price_include_tax >=", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxLessThan(String value) {
            addCriterion("sowd_price_include_tax <", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("sowd_price_include_tax <=", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxLike(String value) {
            addCriterion("sowd_price_include_tax like", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxNotLike(String value) {
            addCriterion("sowd_price_include_tax not like", value, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxIn(List<String> values) {
            addCriterion("sowd_price_include_tax in", values, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("sowd_price_include_tax not in", values, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("sowd_price_include_tax between", value1, value2, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("sowd_price_include_tax not between", value1, value2, "sowdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusIsNull() {
            addCriterion("sowd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusIsNotNull() {
            addCriterion("sowd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusEqualTo(Integer value) {
            addCriterion("sowd_single_status =", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusNotEqualTo(Integer value) {
            addCriterion("sowd_single_status <>", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusGreaterThan(Integer value) {
            addCriterion("sowd_single_status >", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sowd_single_status >=", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusLessThan(Integer value) {
            addCriterion("sowd_single_status <", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sowd_single_status <=", value, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusIn(List<Integer> values) {
            addCriterion("sowd_single_status in", values, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusNotIn(List<Integer> values) {
            addCriterion("sowd_single_status not in", values, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("sowd_single_status between", value1, value2, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sowd_single_status not between", value1, value2, "sowdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateIsNull() {
            addCriterion("sowd_document_date is null");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateIsNotNull() {
            addCriterion("sowd_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("sowd_document_date =", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sowd_document_date <>", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sowd_document_date >", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sowd_document_date >=", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("sowd_document_date <", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sowd_document_date <=", value, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("sowd_document_date in", values, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sowd_document_date not in", values, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sowd_document_date between", value1, value2, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sowd_document_date not between", value1, value2, "sowdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberIsNull() {
            addCriterion("sowd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberIsNotNull() {
            addCriterion("sowd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberEqualTo(Float value) {
            addCriterion("sowd_document_number =", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberNotEqualTo(Float value) {
            addCriterion("sowd_document_number <>", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberGreaterThan(Float value) {
            addCriterion("sowd_document_number >", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_document_number >=", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberLessThan(Float value) {
            addCriterion("sowd_document_number <", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberLessThanOrEqualTo(Float value) {
            addCriterion("sowd_document_number <=", value, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberIn(List<Float> values) {
            addCriterion("sowd_document_number in", values, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberNotIn(List<Float> values) {
            addCriterion("sowd_document_number not in", values, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberBetween(Float value1, Float value2) {
            addCriterion("sowd_document_number between", value1, value2, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdDocumentNumberNotBetween(Float value1, Float value2) {
            addCriterion("sowd_document_number not between", value1, value2, "sowdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIsNull() {
            addCriterion("sowd_price is null");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIsNotNull() {
            addCriterion("sowd_price is not null");
            return (Criteria) this;
        }

        public Criteria andSowdPriceEqualTo(Float value) {
            addCriterion("sowd_price =", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceNotEqualTo(Float value) {
            addCriterion("sowd_price <>", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceGreaterThan(Float value) {
            addCriterion("sowd_price >", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_price >=", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceLessThan(Float value) {
            addCriterion("sowd_price <", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceLessThanOrEqualTo(Float value) {
            addCriterion("sowd_price <=", value, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceIn(List<Float> values) {
            addCriterion("sowd_price in", values, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceNotIn(List<Float> values) {
            addCriterion("sowd_price not in", values, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceBetween(Float value1, Float value2) {
            addCriterion("sowd_price between", value1, value2, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdPriceNotBetween(Float value1, Float value2) {
            addCriterion("sowd_price not between", value1, value2, "sowdPrice");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyIsNull() {
            addCriterion("sowd_money is null");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyIsNotNull() {
            addCriterion("sowd_money is not null");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyEqualTo(Float value) {
            addCriterion("sowd_money =", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyNotEqualTo(Float value) {
            addCriterion("sowd_money <>", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyGreaterThan(Float value) {
            addCriterion("sowd_money >", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_money >=", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyLessThan(Float value) {
            addCriterion("sowd_money <", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("sowd_money <=", value, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyIn(List<Float> values) {
            addCriterion("sowd_money in", values, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyNotIn(List<Float> values) {
            addCriterion("sowd_money not in", values, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyBetween(Float value1, Float value2) {
            addCriterion("sowd_money between", value1, value2, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("sowd_money not between", value1, value2, "sowdMoney");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateIsNull() {
            addCriterion("sowd_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateIsNotNull() {
            addCriterion("sowd_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateEqualTo(Float value) {
            addCriterion("sowd_tax_rate =", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateNotEqualTo(Float value) {
            addCriterion("sowd_tax_rate <>", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateGreaterThan(Float value) {
            addCriterion("sowd_tax_rate >", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_tax_rate >=", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateLessThan(Float value) {
            addCriterion("sowd_tax_rate <", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("sowd_tax_rate <=", value, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateIn(List<Float> values) {
            addCriterion("sowd_tax_rate in", values, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateNotIn(List<Float> values) {
            addCriterion("sowd_tax_rate not in", values, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateBetween(Float value1, Float value2) {
            addCriterion("sowd_tax_rate between", value1, value2, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("sowd_tax_rate not between", value1, value2, "sowdTaxRate");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountIsNull() {
            addCriterion("sowd_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountIsNotNull() {
            addCriterion("sowd_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountEqualTo(Float value) {
            addCriterion("sowd_tax_amount =", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountNotEqualTo(Float value) {
            addCriterion("sowd_tax_amount <>", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountGreaterThan(Float value) {
            addCriterion("sowd_tax_amount >", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_tax_amount >=", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountLessThan(Float value) {
            addCriterion("sowd_tax_amount <", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("sowd_tax_amount <=", value, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountIn(List<Float> values) {
            addCriterion("sowd_tax_amount in", values, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountNotIn(List<Float> values) {
            addCriterion("sowd_tax_amount not in", values, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountBetween(Float value1, Float value2) {
            addCriterion("sowd_tax_amount between", value1, value2, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("sowd_tax_amount not between", value1, value2, "sowdTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountIsNull() {
            addCriterion("sowd_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountIsNotNull() {
            addCriterion("sowd_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountEqualTo(Float value) {
            addCriterion("sowd_including_tax_amount =", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("sowd_including_tax_amount <>", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("sowd_including_tax_amount >", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sowd_including_tax_amount >=", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountLessThan(Float value) {
            addCriterion("sowd_including_tax_amount <", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("sowd_including_tax_amount <=", value, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountIn(List<Float> values) {
            addCriterion("sowd_including_tax_amount in", values, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("sowd_including_tax_amount not in", values, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("sowd_including_tax_amount between", value1, value2, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("sowd_including_tax_amount not between", value1, value2, "sowdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberIsNull() {
            addCriterion("sowd_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberIsNotNull() {
            addCriterion("sowd_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberEqualTo(String value) {
            addCriterion("sowd_batch_number =", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberNotEqualTo(String value) {
            addCriterion("sowd_batch_number <>", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberGreaterThan(String value) {
            addCriterion("sowd_batch_number >", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_batch_number >=", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberLessThan(String value) {
            addCriterion("sowd_batch_number <", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("sowd_batch_number <=", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberLike(String value) {
            addCriterion("sowd_batch_number like", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberNotLike(String value) {
            addCriterion("sowd_batch_number not like", value, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberIn(List<String> values) {
            addCriterion("sowd_batch_number in", values, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberNotIn(List<String> values) {
            addCriterion("sowd_batch_number not in", values, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberBetween(String value1, String value2) {
            addCriterion("sowd_batch_number between", value1, value2, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdBatchNumberNotBetween(String value1, String value2) {
            addCriterion("sowd_batch_number not between", value1, value2, "sowdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationIsNull() {
            addCriterion("sowd_material_combination is null");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationIsNotNull() {
            addCriterion("sowd_material_combination is not null");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationEqualTo(String value) {
            addCriterion("sowd_material_combination =", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationNotEqualTo(String value) {
            addCriterion("sowd_material_combination <>", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationGreaterThan(String value) {
            addCriterion("sowd_material_combination >", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_material_combination >=", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationLessThan(String value) {
            addCriterion("sowd_material_combination <", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationLessThanOrEqualTo(String value) {
            addCriterion("sowd_material_combination <=", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationLike(String value) {
            addCriterion("sowd_material_combination like", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationNotLike(String value) {
            addCriterion("sowd_material_combination not like", value, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationIn(List<String> values) {
            addCriterion("sowd_material_combination in", values, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationNotIn(List<String> values) {
            addCriterion("sowd_material_combination not in", values, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationBetween(String value1, String value2) {
            addCriterion("sowd_material_combination between", value1, value2, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdMaterialCombinationNotBetween(String value1, String value2) {
            addCriterion("sowd_material_combination not between", value1, value2, "sowdMaterialCombination");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftIsNull() {
            addCriterion("sowd_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftIsNotNull() {
            addCriterion("sowd_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftEqualTo(String value) {
            addCriterion("sowd_ifgift =", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftNotEqualTo(String value) {
            addCriterion("sowd_ifgift <>", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftGreaterThan(String value) {
            addCriterion("sowd_ifgift >", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_ifgift >=", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftLessThan(String value) {
            addCriterion("sowd_ifgift <", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftLessThanOrEqualTo(String value) {
            addCriterion("sowd_ifgift <=", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftLike(String value) {
            addCriterion("sowd_ifgift like", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftNotLike(String value) {
            addCriterion("sowd_ifgift not like", value, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftIn(List<String> values) {
            addCriterion("sowd_ifgift in", values, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftNotIn(List<String> values) {
            addCriterion("sowd_ifgift not in", values, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftBetween(String value1, String value2) {
            addCriterion("sowd_ifgift between", value1, value2, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdIfgiftNotBetween(String value1, String value2) {
            addCriterion("sowd_ifgift not between", value1, value2, "sowdIfgift");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsIsNull() {
            addCriterion("sowd_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsIsNotNull() {
            addCriterion("sowd_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsEqualTo(String value) {
            addCriterion("sowd_invoice_details =", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsNotEqualTo(String value) {
            addCriterion("sowd_invoice_details <>", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsGreaterThan(String value) {
            addCriterion("sowd_invoice_details >", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_invoice_details >=", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsLessThan(String value) {
            addCriterion("sowd_invoice_details <", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("sowd_invoice_details <=", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsLike(String value) {
            addCriterion("sowd_invoice_details like", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsNotLike(String value) {
            addCriterion("sowd_invoice_details not like", value, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsIn(List<String> values) {
            addCriterion("sowd_invoice_details in", values, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsNotIn(List<String> values) {
            addCriterion("sowd_invoice_details not in", values, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("sowd_invoice_details between", value1, value2, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("sowd_invoice_details not between", value1, value2, "sowdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumIsNull() {
            addCriterion("sowd_nomake_invoice_num is null");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumIsNotNull() {
            addCriterion("sowd_nomake_invoice_num is not null");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumEqualTo(Integer value) {
            addCriterion("sowd_nomake_invoice_num =", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumNotEqualTo(Integer value) {
            addCriterion("sowd_nomake_invoice_num <>", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumGreaterThan(Integer value) {
            addCriterion("sowd_nomake_invoice_num >", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sowd_nomake_invoice_num >=", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumLessThan(Integer value) {
            addCriterion("sowd_nomake_invoice_num <", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("sowd_nomake_invoice_num <=", value, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumIn(List<Integer> values) {
            addCriterion("sowd_nomake_invoice_num in", values, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumNotIn(List<Integer> values) {
            addCriterion("sowd_nomake_invoice_num not in", values, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumBetween(Integer value1, Integer value2) {
            addCriterion("sowd_nomake_invoice_num between", value1, value2, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdNomakeInvoiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sowd_nomake_invoice_num not between", value1, value2, "sowdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksIsNull() {
            addCriterion("sowd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksIsNotNull() {
            addCriterion("sowd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksEqualTo(String value) {
            addCriterion("sowd_remarks =", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksNotEqualTo(String value) {
            addCriterion("sowd_remarks <>", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksGreaterThan(String value) {
            addCriterion("sowd_remarks >", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_remarks >=", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksLessThan(String value) {
            addCriterion("sowd_remarks <", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksLessThanOrEqualTo(String value) {
            addCriterion("sowd_remarks <=", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksLike(String value) {
            addCriterion("sowd_remarks like", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksNotLike(String value) {
            addCriterion("sowd_remarks not like", value, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksIn(List<String> values) {
            addCriterion("sowd_remarks in", values, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksNotIn(List<String> values) {
            addCriterion("sowd_remarks not in", values, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksBetween(String value1, String value2) {
            addCriterion("sowd_remarks between", value1, value2, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdRemarksNotBetween(String value1, String value2) {
            addCriterion("sowd_remarks not between", value1, value2, "sowdRemarks");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderIsNull() {
            addCriterion("sowd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderIsNotNull() {
            addCriterion("sowd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderEqualTo(String value) {
            addCriterion("sowd_source_order =", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderNotEqualTo(String value) {
            addCriterion("sowd_source_order <>", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderGreaterThan(String value) {
            addCriterion("sowd_source_order >", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_source_order >=", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderLessThan(String value) {
            addCriterion("sowd_source_order <", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("sowd_source_order <=", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderLike(String value) {
            addCriterion("sowd_source_order like", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderNotLike(String value) {
            addCriterion("sowd_source_order not like", value, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderIn(List<String> values) {
            addCriterion("sowd_source_order in", values, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderNotIn(List<String> values) {
            addCriterion("sowd_source_order not in", values, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderBetween(String value1, String value2) {
            addCriterion("sowd_source_order between", value1, value2, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("sowd_source_order not between", value1, value2, "sowdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoIsNull() {
            addCriterion("sowd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoIsNotNull() {
            addCriterion("sowd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoEqualTo(String value) {
            addCriterion("sowd_source_no =", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoNotEqualTo(String value) {
            addCriterion("sowd_source_no <>", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoGreaterThan(String value) {
            addCriterion("sowd_source_no >", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_source_no >=", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoLessThan(String value) {
            addCriterion("sowd_source_no <", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("sowd_source_no <=", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoLike(String value) {
            addCriterion("sowd_source_no like", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoNotLike(String value) {
            addCriterion("sowd_source_no not like", value, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoIn(List<String> values) {
            addCriterion("sowd_source_no in", values, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoNotIn(List<String> values) {
            addCriterion("sowd_source_no not in", values, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoBetween(String value1, String value2) {
            addCriterion("sowd_source_no between", value1, value2, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdSourceNoNotBetween(String value1, String value2) {
            addCriterion("sowd_source_no not between", value1, value2, "sowdSourceNo");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingIsNull() {
            addCriterion("sowd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingIsNotNull() {
            addCriterion("sowd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingEqualTo(String value) {
            addCriterion("sowd_auditing =", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingNotEqualTo(String value) {
            addCriterion("sowd_auditing <>", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingGreaterThan(String value) {
            addCriterion("sowd_auditing >", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_auditing >=", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingLessThan(String value) {
            addCriterion("sowd_auditing <", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingLessThanOrEqualTo(String value) {
            addCriterion("sowd_auditing <=", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingLike(String value) {
            addCriterion("sowd_auditing like", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingNotLike(String value) {
            addCriterion("sowd_auditing not like", value, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingIn(List<String> values) {
            addCriterion("sowd_auditing in", values, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingNotIn(List<String> values) {
            addCriterion("sowd_auditing not in", values, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingBetween(String value1, String value2) {
            addCriterion("sowd_auditing between", value1, value2, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdAuditingNotBetween(String value1, String value2) {
            addCriterion("sowd_auditing not between", value1, value2, "sowdAuditing");
            return (Criteria) this;
        }

        public Criteria andSowdYnIsNull() {
            addCriterion("sowd_yn is null");
            return (Criteria) this;
        }

        public Criteria andSowdYnIsNotNull() {
            addCriterion("sowd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSowdYnEqualTo(String value) {
            addCriterion("sowd_yn =", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnNotEqualTo(String value) {
            addCriterion("sowd_yn <>", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnGreaterThan(String value) {
            addCriterion("sowd_yn >", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnGreaterThanOrEqualTo(String value) {
            addCriterion("sowd_yn >=", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnLessThan(String value) {
            addCriterion("sowd_yn <", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnLessThanOrEqualTo(String value) {
            addCriterion("sowd_yn <=", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnLike(String value) {
            addCriterion("sowd_yn like", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnNotLike(String value) {
            addCriterion("sowd_yn not like", value, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnIn(List<String> values) {
            addCriterion("sowd_yn in", values, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnNotIn(List<String> values) {
            addCriterion("sowd_yn not in", values, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnBetween(String value1, String value2) {
            addCriterion("sowd_yn between", value1, value2, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdYnNotBetween(String value1, String value2) {
            addCriterion("sowd_yn not between", value1, value2, "sowdYn");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1IsNull() {
            addCriterion("sowd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1IsNotNull() {
            addCriterion("sowd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1EqualTo(String value) {
            addCriterion("sowd_custom1 =", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1NotEqualTo(String value) {
            addCriterion("sowd_custom1 <>", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1GreaterThan(String value) {
            addCriterion("sowd_custom1 >", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sowd_custom1 >=", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1LessThan(String value) {
            addCriterion("sowd_custom1 <", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1LessThanOrEqualTo(String value) {
            addCriterion("sowd_custom1 <=", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1Like(String value) {
            addCriterion("sowd_custom1 like", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1NotLike(String value) {
            addCriterion("sowd_custom1 not like", value, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1In(List<String> values) {
            addCriterion("sowd_custom1 in", values, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1NotIn(List<String> values) {
            addCriterion("sowd_custom1 not in", values, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1Between(String value1, String value2) {
            addCriterion("sowd_custom1 between", value1, value2, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom1NotBetween(String value1, String value2) {
            addCriterion("sowd_custom1 not between", value1, value2, "sowdCustom1");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2IsNull() {
            addCriterion("sowd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2IsNotNull() {
            addCriterion("sowd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2EqualTo(String value) {
            addCriterion("sowd_custom2 =", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2NotEqualTo(String value) {
            addCriterion("sowd_custom2 <>", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2GreaterThan(String value) {
            addCriterion("sowd_custom2 >", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sowd_custom2 >=", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2LessThan(String value) {
            addCriterion("sowd_custom2 <", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2LessThanOrEqualTo(String value) {
            addCriterion("sowd_custom2 <=", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2Like(String value) {
            addCriterion("sowd_custom2 like", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2NotLike(String value) {
            addCriterion("sowd_custom2 not like", value, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2In(List<String> values) {
            addCriterion("sowd_custom2 in", values, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2NotIn(List<String> values) {
            addCriterion("sowd_custom2 not in", values, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2Between(String value1, String value2) {
            addCriterion("sowd_custom2 between", value1, value2, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom2NotBetween(String value1, String value2) {
            addCriterion("sowd_custom2 not between", value1, value2, "sowdCustom2");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3IsNull() {
            addCriterion("sowd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3IsNotNull() {
            addCriterion("sowd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3EqualTo(String value) {
            addCriterion("sowd_custom3 =", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3NotEqualTo(String value) {
            addCriterion("sowd_custom3 <>", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3GreaterThan(String value) {
            addCriterion("sowd_custom3 >", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sowd_custom3 >=", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3LessThan(String value) {
            addCriterion("sowd_custom3 <", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3LessThanOrEqualTo(String value) {
            addCriterion("sowd_custom3 <=", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3Like(String value) {
            addCriterion("sowd_custom3 like", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3NotLike(String value) {
            addCriterion("sowd_custom3 not like", value, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3In(List<String> values) {
            addCriterion("sowd_custom3 in", values, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3NotIn(List<String> values) {
            addCriterion("sowd_custom3 not in", values, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3Between(String value1, String value2) {
            addCriterion("sowd_custom3 between", value1, value2, "sowdCustom3");
            return (Criteria) this;
        }

        public Criteria andSowdCustom3NotBetween(String value1, String value2) {
            addCriterion("sowd_custom3 not between", value1, value2, "sowdCustom3");
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