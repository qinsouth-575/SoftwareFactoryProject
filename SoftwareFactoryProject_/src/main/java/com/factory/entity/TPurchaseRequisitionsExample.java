package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPurchaseRequisitionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPurchaseRequisitionsExample() {
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

        public Criteria andPrDocumentNumberIsNull() {
            addCriterion("pr_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberIsNotNull() {
            addCriterion("pr_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberEqualTo(String value) {
            addCriterion("pr_document_number =", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotEqualTo(String value) {
            addCriterion("pr_document_number <>", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberGreaterThan(String value) {
            addCriterion("pr_document_number >", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pr_document_number >=", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLessThan(String value) {
            addCriterion("pr_document_number <", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pr_document_number <=", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberLike(String value) {
            addCriterion("pr_document_number like", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotLike(String value) {
            addCriterion("pr_document_number not like", value, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberIn(List<String> values) {
            addCriterion("pr_document_number in", values, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotIn(List<String> values) {
            addCriterion("pr_document_number not in", values, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberBetween(String value1, String value2) {
            addCriterion("pr_document_number between", value1, value2, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pr_document_number not between", value1, value2, "prDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIsNull() {
            addCriterion("pr_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIsNotNull() {
            addCriterion("pr_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date =", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date <>", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pr_document_date >", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date >=", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pr_document_date <", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pr_document_date <=", value, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pr_document_date in", values, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pr_document_date not in", values, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_document_date between", value1, value2, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pr_document_date not between", value1, value2, "prDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdIsNull() {
            addCriterion("pr_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdIsNotNull() {
            addCriterion("pr_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdEqualTo(String value) {
            addCriterion("pr_type_id =", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotEqualTo(String value) {
            addCriterion("pr_type_id <>", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdGreaterThan(String value) {
            addCriterion("pr_type_id >", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_type_id >=", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdLessThan(String value) {
            addCriterion("pr_type_id <", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdLessThanOrEqualTo(String value) {
            addCriterion("pr_type_id <=", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdLike(String value) {
            addCriterion("pr_type_id like", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotLike(String value) {
            addCriterion("pr_type_id not like", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdIn(List<String> values) {
            addCriterion("pr_type_id in", values, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotIn(List<String> values) {
            addCriterion("pr_type_id not in", values, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdBetween(String value1, String value2) {
            addCriterion("pr_type_id between", value1, value2, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotBetween(String value1, String value2) {
            addCriterion("pr_type_id not between", value1, value2, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameIsNull() {
            addCriterion("pr_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameIsNotNull() {
            addCriterion("pr_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameEqualTo(String value) {
            addCriterion("pr_type_name =", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameNotEqualTo(String value) {
            addCriterion("pr_type_name <>", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameGreaterThan(String value) {
            addCriterion("pr_type_name >", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pr_type_name >=", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameLessThan(String value) {
            addCriterion("pr_type_name <", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pr_type_name <=", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameLike(String value) {
            addCriterion("pr_type_name like", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameNotLike(String value) {
            addCriterion("pr_type_name not like", value, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameIn(List<String> values) {
            addCriterion("pr_type_name in", values, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameNotIn(List<String> values) {
            addCriterion("pr_type_name not in", values, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameBetween(String value1, String value2) {
            addCriterion("pr_type_name between", value1, value2, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrTypeNameNotBetween(String value1, String value2) {
            addCriterion("pr_type_name not between", value1, value2, "prTypeName");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseIsNull() {
            addCriterion("pr_single_case is null");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseIsNotNull() {
            addCriterion("pr_single_case is not null");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseEqualTo(Integer value) {
            addCriterion("pr_single_case =", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseNotEqualTo(Integer value) {
            addCriterion("pr_single_case <>", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseGreaterThan(Integer value) {
            addCriterion("pr_single_case >", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_single_case >=", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseLessThan(Integer value) {
            addCriterion("pr_single_case <", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseLessThanOrEqualTo(Integer value) {
            addCriterion("pr_single_case <=", value, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseIn(List<Integer> values) {
            addCriterion("pr_single_case in", values, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseNotIn(List<Integer> values) {
            addCriterion("pr_single_case not in", values, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseBetween(Integer value1, Integer value2) {
            addCriterion("pr_single_case between", value1, value2, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrSingleCaseNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_single_case not between", value1, value2, "prSingleCase");
            return (Criteria) this;
        }

        public Criteria andPrAmountIsNull() {
            addCriterion("pr_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrAmountIsNotNull() {
            addCriterion("pr_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrAmountEqualTo(Integer value) {
            addCriterion("pr_amount =", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountNotEqualTo(Integer value) {
            addCriterion("pr_amount <>", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountGreaterThan(Integer value) {
            addCriterion("pr_amount >", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_amount >=", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountLessThan(Integer value) {
            addCriterion("pr_amount <", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pr_amount <=", value, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountIn(List<Integer> values) {
            addCriterion("pr_amount in", values, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountNotIn(List<Integer> values) {
            addCriterion("pr_amount not in", values, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountBetween(Integer value1, Integer value2) {
            addCriterion("pr_amount between", value1, value2, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_amount not between", value1, value2, "prAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountIsNull() {
            addCriterion("pr_sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountIsNotNull() {
            addCriterion("pr_sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountEqualTo(Integer value) {
            addCriterion("pr_sum_amount =", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountNotEqualTo(Integer value) {
            addCriterion("pr_sum_amount <>", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountGreaterThan(Integer value) {
            addCriterion("pr_sum_amount >", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_sum_amount >=", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountLessThan(Integer value) {
            addCriterion("pr_sum_amount <", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pr_sum_amount <=", value, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountIn(List<Integer> values) {
            addCriterion("pr_sum_amount in", values, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountNotIn(List<Integer> values) {
            addCriterion("pr_sum_amount not in", values, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountBetween(Integer value1, Integer value2) {
            addCriterion("pr_sum_amount between", value1, value2, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrSumAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_sum_amount not between", value1, value2, "prSumAmount");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionIsNull() {
            addCriterion("pr_header_section is null");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionIsNotNull() {
            addCriterion("pr_header_section is not null");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionEqualTo(String value) {
            addCriterion("pr_header_section =", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionNotEqualTo(String value) {
            addCriterion("pr_header_section <>", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionGreaterThan(String value) {
            addCriterion("pr_header_section >", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pr_header_section >=", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionLessThan(String value) {
            addCriterion("pr_header_section <", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionLessThanOrEqualTo(String value) {
            addCriterion("pr_header_section <=", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionLike(String value) {
            addCriterion("pr_header_section like", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionNotLike(String value) {
            addCriterion("pr_header_section not like", value, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionIn(List<String> values) {
            addCriterion("pr_header_section in", values, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionNotIn(List<String> values) {
            addCriterion("pr_header_section not in", values, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionBetween(String value1, String value2) {
            addCriterion("pr_header_section between", value1, value2, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrHeaderSectionNotBetween(String value1, String value2) {
            addCriterion("pr_header_section not between", value1, value2, "prHeaderSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionIsNull() {
            addCriterion("pr_footer_section is null");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionIsNotNull() {
            addCriterion("pr_footer_section is not null");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionEqualTo(String value) {
            addCriterion("pr_footer_section =", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionNotEqualTo(String value) {
            addCriterion("pr_footer_section <>", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionGreaterThan(String value) {
            addCriterion("pr_footer_section >", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pr_footer_section >=", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionLessThan(String value) {
            addCriterion("pr_footer_section <", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionLessThanOrEqualTo(String value) {
            addCriterion("pr_footer_section <=", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionLike(String value) {
            addCriterion("pr_footer_section like", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionNotLike(String value) {
            addCriterion("pr_footer_section not like", value, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionIn(List<String> values) {
            addCriterion("pr_footer_section in", values, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionNotIn(List<String> values) {
            addCriterion("pr_footer_section not in", values, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionBetween(String value1, String value2) {
            addCriterion("pr_footer_section between", value1, value2, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrFooterSectionNotBetween(String value1, String value2) {
            addCriterion("pr_footer_section not between", value1, value2, "prFooterSection");
            return (Criteria) this;
        }

        public Criteria andPrCustom1IsNull() {
            addCriterion("pr_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom1IsNotNull() {
            addCriterion("pr_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom1EqualTo(String value) {
            addCriterion("pr_custom1 =", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotEqualTo(String value) {
            addCriterion("pr_custom1 <>", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1GreaterThan(String value) {
            addCriterion("pr_custom1 >", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom1 >=", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1LessThan(String value) {
            addCriterion("pr_custom1 <", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1LessThanOrEqualTo(String value) {
            addCriterion("pr_custom1 <=", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1Like(String value) {
            addCriterion("pr_custom1 like", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotLike(String value) {
            addCriterion("pr_custom1 not like", value, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1In(List<String> values) {
            addCriterion("pr_custom1 in", values, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotIn(List<String> values) {
            addCriterion("pr_custom1 not in", values, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1Between(String value1, String value2) {
            addCriterion("pr_custom1 between", value1, value2, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom1NotBetween(String value1, String value2) {
            addCriterion("pr_custom1 not between", value1, value2, "prCustom1");
            return (Criteria) this;
        }

        public Criteria andPrCustom2IsNull() {
            addCriterion("pr_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPrCustom2IsNotNull() {
            addCriterion("pr_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrCustom2EqualTo(String value) {
            addCriterion("pr_custom2 =", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotEqualTo(String value) {
            addCriterion("pr_custom2 <>", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2GreaterThan(String value) {
            addCriterion("pr_custom2 >", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pr_custom2 >=", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2LessThan(String value) {
            addCriterion("pr_custom2 <", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2LessThanOrEqualTo(String value) {
            addCriterion("pr_custom2 <=", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2Like(String value) {
            addCriterion("pr_custom2 like", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotLike(String value) {
            addCriterion("pr_custom2 not like", value, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2In(List<String> values) {
            addCriterion("pr_custom2 in", values, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotIn(List<String> values) {
            addCriterion("pr_custom2 not in", values, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2Between(String value1, String value2) {
            addCriterion("pr_custom2 between", value1, value2, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrCustom2NotBetween(String value1, String value2) {
            addCriterion("pr_custom2 not between", value1, value2, "prCustom2");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNull() {
            addCriterion("pr_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIsNotNull() {
            addCriterion("pr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrRemarkEqualTo(String value) {
            addCriterion("pr_remark =", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotEqualTo(String value) {
            addCriterion("pr_remark <>", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThan(String value) {
            addCriterion("pr_remark >", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pr_remark >=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThan(String value) {
            addCriterion("pr_remark <", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLessThanOrEqualTo(String value) {
            addCriterion("pr_remark <=", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkLike(String value) {
            addCriterion("pr_remark like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotLike(String value) {
            addCriterion("pr_remark not like", value, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkIn(List<String> values) {
            addCriterion("pr_remark in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotIn(List<String> values) {
            addCriterion("pr_remark not in", values, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkBetween(String value1, String value2) {
            addCriterion("pr_remark between", value1, value2, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrRemarkNotBetween(String value1, String value2) {
            addCriterion("pr_remark not between", value1, value2, "prRemark");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIsNull() {
            addCriterion("pr_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIsNotNull() {
            addCriterion("pr_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdEqualTo(Integer value) {
            addCriterion("pr_staff_id =", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotEqualTo(Integer value) {
            addCriterion("pr_staff_id <>", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdGreaterThan(Integer value) {
            addCriterion("pr_staff_id >", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_staff_id >=", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdLessThan(Integer value) {
            addCriterion("pr_staff_id <", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("pr_staff_id <=", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIn(List<Integer> values) {
            addCriterion("pr_staff_id in", values, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotIn(List<Integer> values) {
            addCriterion("pr_staff_id not in", values, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("pr_staff_id between", value1, value2, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_staff_id not between", value1, value2, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameIsNull() {
            addCriterion("pr_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameIsNotNull() {
            addCriterion("pr_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameEqualTo(String value) {
            addCriterion("pr_staff_name =", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameNotEqualTo(String value) {
            addCriterion("pr_staff_name <>", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameGreaterThan(String value) {
            addCriterion("pr_staff_name >", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("pr_staff_name >=", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameLessThan(String value) {
            addCriterion("pr_staff_name <", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameLessThanOrEqualTo(String value) {
            addCriterion("pr_staff_name <=", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameLike(String value) {
            addCriterion("pr_staff_name like", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameNotLike(String value) {
            addCriterion("pr_staff_name not like", value, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameIn(List<String> values) {
            addCriterion("pr_staff_name in", values, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameNotIn(List<String> values) {
            addCriterion("pr_staff_name not in", values, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameBetween(String value1, String value2) {
            addCriterion("pr_staff_name between", value1, value2, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrStaffNameNotBetween(String value1, String value2) {
            addCriterion("pr_staff_name not between", value1, value2, "prStaffName");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdIsNull() {
            addCriterion("pr_team_id is null");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdIsNotNull() {
            addCriterion("pr_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdEqualTo(String value) {
            addCriterion("pr_team_id =", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdNotEqualTo(String value) {
            addCriterion("pr_team_id <>", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdGreaterThan(String value) {
            addCriterion("pr_team_id >", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_team_id >=", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdLessThan(String value) {
            addCriterion("pr_team_id <", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdLessThanOrEqualTo(String value) {
            addCriterion("pr_team_id <=", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdLike(String value) {
            addCriterion("pr_team_id like", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdNotLike(String value) {
            addCriterion("pr_team_id not like", value, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdIn(List<String> values) {
            addCriterion("pr_team_id in", values, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdNotIn(List<String> values) {
            addCriterion("pr_team_id not in", values, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdBetween(String value1, String value2) {
            addCriterion("pr_team_id between", value1, value2, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrTeamIdNotBetween(String value1, String value2) {
            addCriterion("pr_team_id not between", value1, value2, "prTeamId");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameIsNull() {
            addCriterion("pr_depart_name is null");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameIsNotNull() {
            addCriterion("pr_depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameEqualTo(String value) {
            addCriterion("pr_depart_name =", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameNotEqualTo(String value) {
            addCriterion("pr_depart_name <>", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameGreaterThan(String value) {
            addCriterion("pr_depart_name >", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("pr_depart_name >=", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameLessThan(String value) {
            addCriterion("pr_depart_name <", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameLessThanOrEqualTo(String value) {
            addCriterion("pr_depart_name <=", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameLike(String value) {
            addCriterion("pr_depart_name like", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameNotLike(String value) {
            addCriterion("pr_depart_name not like", value, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameIn(List<String> values) {
            addCriterion("pr_depart_name in", values, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameNotIn(List<String> values) {
            addCriterion("pr_depart_name not in", values, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameBetween(String value1, String value2) {
            addCriterion("pr_depart_name between", value1, value2, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrDepartNameNotBetween(String value1, String value2) {
            addCriterion("pr_depart_name not between", value1, value2, "prDepartName");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIsNull() {
            addCriterion("pr_executor is null");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIsNotNull() {
            addCriterion("pr_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPrExecutorEqualTo(String value) {
            addCriterion("pr_executor =", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotEqualTo(String value) {
            addCriterion("pr_executor <>", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorGreaterThan(String value) {
            addCriterion("pr_executor >", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("pr_executor >=", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLessThan(String value) {
            addCriterion("pr_executor <", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLessThanOrEqualTo(String value) {
            addCriterion("pr_executor <=", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorLike(String value) {
            addCriterion("pr_executor like", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotLike(String value) {
            addCriterion("pr_executor not like", value, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorIn(List<String> values) {
            addCriterion("pr_executor in", values, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotIn(List<String> values) {
            addCriterion("pr_executor not in", values, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorBetween(String value1, String value2) {
            addCriterion("pr_executor between", value1, value2, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrExecutorNotBetween(String value1, String value2) {
            addCriterion("pr_executor not between", value1, value2, "prExecutor");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIsNull() {
            addCriterion("pr_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIsNotNull() {
            addCriterion("pr_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffEqualTo(String value) {
            addCriterion("pr_checkagain_staff =", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotEqualTo(String value) {
            addCriterion("pr_checkagain_staff <>", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffGreaterThan(String value) {
            addCriterion("pr_checkagain_staff >", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pr_checkagain_staff >=", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLessThan(String value) {
            addCriterion("pr_checkagain_staff <", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("pr_checkagain_staff <=", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffLike(String value) {
            addCriterion("pr_checkagain_staff like", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotLike(String value) {
            addCriterion("pr_checkagain_staff not like", value, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffIn(List<String> values) {
            addCriterion("pr_checkagain_staff in", values, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotIn(List<String> values) {
            addCriterion("pr_checkagain_staff not in", values, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffBetween(String value1, String value2) {
            addCriterion("pr_checkagain_staff between", value1, value2, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("pr_checkagain_staff not between", value1, value2, "prCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIsNull() {
            addCriterion("pr_audition is null");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIsNotNull() {
            addCriterion("pr_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPrAuditionEqualTo(Short value) {
            addCriterion("pr_audition =", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotEqualTo(Short value) {
            addCriterion("pr_audition <>", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionGreaterThan(Short value) {
            addCriterion("pr_audition >", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionGreaterThanOrEqualTo(Short value) {
            addCriterion("pr_audition >=", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionLessThan(Short value) {
            addCriterion("pr_audition <", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionLessThanOrEqualTo(Short value) {
            addCriterion("pr_audition <=", value, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionIn(List<Short> values) {
            addCriterion("pr_audition in", values, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotIn(List<Short> values) {
            addCriterion("pr_audition not in", values, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionBetween(Short value1, Short value2) {
            addCriterion("pr_audition between", value1, value2, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrAuditionNotBetween(Short value1, Short value2) {
            addCriterion("pr_audition not between", value1, value2, "prAudition");
            return (Criteria) this;
        }

        public Criteria andPrYnIsNull() {
            addCriterion("pr_yn is null");
            return (Criteria) this;
        }

        public Criteria andPrYnIsNotNull() {
            addCriterion("pr_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPrYnEqualTo(Short value) {
            addCriterion("pr_yn =", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotEqualTo(Short value) {
            addCriterion("pr_yn <>", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnGreaterThan(Short value) {
            addCriterion("pr_yn >", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnGreaterThanOrEqualTo(Short value) {
            addCriterion("pr_yn >=", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnLessThan(Short value) {
            addCriterion("pr_yn <", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnLessThanOrEqualTo(Short value) {
            addCriterion("pr_yn <=", value, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnIn(List<Short> values) {
            addCriterion("pr_yn in", values, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotIn(List<Short> values) {
            addCriterion("pr_yn not in", values, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnBetween(Short value1, Short value2) {
            addCriterion("pr_yn between", value1, value2, "prYn");
            return (Criteria) this;
        }

        public Criteria andPrYnNotBetween(Short value1, Short value2) {
            addCriterion("pr_yn not between", value1, value2, "prYn");
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