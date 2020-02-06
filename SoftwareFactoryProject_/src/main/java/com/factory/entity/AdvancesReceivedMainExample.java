package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdvancesReceivedMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvancesReceivedMainExample() {
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

        public Criteria andPayablesIdIsNull() {
            addCriterion("payables_id is null");
            return (Criteria) this;
        }

        public Criteria andPayablesIdIsNotNull() {
            addCriterion("payables_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesIdEqualTo(String value) {
            addCriterion("payables_id =", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotEqualTo(String value) {
            addCriterion("payables_id <>", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdGreaterThan(String value) {
            addCriterion("payables_id >", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdGreaterThanOrEqualTo(String value) {
            addCriterion("payables_id >=", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLessThan(String value) {
            addCriterion("payables_id <", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLessThanOrEqualTo(String value) {
            addCriterion("payables_id <=", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdLike(String value) {
            addCriterion("payables_id like", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotLike(String value) {
            addCriterion("payables_id not like", value, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdIn(List<String> values) {
            addCriterion("payables_id in", values, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotIn(List<String> values) {
            addCriterion("payables_id not in", values, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdBetween(String value1, String value2) {
            addCriterion("payables_id between", value1, value2, "payablesId");
            return (Criteria) this;
        }

        public Criteria andPayablesIdNotBetween(String value1, String value2) {
            addCriterion("payables_id not between", value1, value2, "payablesId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameIsNull() {
            addCriterion("payables_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameIsNotNull() {
            addCriterion("payables_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameEqualTo(String value) {
            addCriterion("payables_customer_name =", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameNotEqualTo(String value) {
            addCriterion("payables_customer_name <>", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameGreaterThan(String value) {
            addCriterion("payables_customer_name >", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("payables_customer_name >=", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameLessThan(String value) {
            addCriterion("payables_customer_name <", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("payables_customer_name <=", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameLike(String value) {
            addCriterion("payables_customer_name like", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameNotLike(String value) {
            addCriterion("payables_customer_name not like", value, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameIn(List<String> values) {
            addCriterion("payables_customer_name in", values, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameNotIn(List<String> values) {
            addCriterion("payables_customer_name not in", values, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameBetween(String value1, String value2) {
            addCriterion("payables_customer_name between", value1, value2, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andPayablesCustomerNameNotBetween(String value1, String value2) {
            addCriterion("payables_customer_name not between", value1, value2, "payablesCustomerName");
            return (Criteria) this;
        }

        public Criteria andScsIdIsNull() {
            addCriterion("scs_id is null");
            return (Criteria) this;
        }

        public Criteria andScsIdIsNotNull() {
            addCriterion("scs_id is not null");
            return (Criteria) this;
        }

        public Criteria andScsIdEqualTo(Integer value) {
            addCriterion("scs_id =", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotEqualTo(Integer value) {
            addCriterion("scs_id <>", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdGreaterThan(Integer value) {
            addCriterion("scs_id >", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scs_id >=", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdLessThan(Integer value) {
            addCriterion("scs_id <", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdLessThanOrEqualTo(Integer value) {
            addCriterion("scs_id <=", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdIn(List<Integer> values) {
            addCriterion("scs_id in", values, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotIn(List<Integer> values) {
            addCriterion("scs_id not in", values, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdBetween(Integer value1, Integer value2) {
            addCriterion("scs_id between", value1, value2, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scs_id not between", value1, value2, "scsId");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1IsNull() {
            addCriterion("payables_sat_name1 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1IsNotNull() {
            addCriterion("payables_sat_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1EqualTo(Integer value) {
            addCriterion("payables_sat_name1 =", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1NotEqualTo(Integer value) {
            addCriterion("payables_sat_name1 <>", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1GreaterThan(Integer value) {
            addCriterion("payables_sat_name1 >", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1GreaterThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name1 >=", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1LessThan(Integer value) {
            addCriterion("payables_sat_name1 <", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1LessThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name1 <=", value, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1In(List<Integer> values) {
            addCriterion("payables_sat_name1 in", values, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1NotIn(List<Integer> values) {
            addCriterion("payables_sat_name1 not in", values, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1Between(Integer value1, Integer value2) {
            addCriterion("payables_sat_name1 between", value1, value2, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName1NotBetween(Integer value1, Integer value2) {
            addCriterion("payables_sat_name1 not between", value1, value2, "payablesSatName1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1IsNull() {
            addCriterion("payables_Price1 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1IsNotNull() {
            addCriterion("payables_Price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1EqualTo(Float value) {
            addCriterion("payables_Price1 =", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1NotEqualTo(Float value) {
            addCriterion("payables_Price1 <>", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1GreaterThan(Float value) {
            addCriterion("payables_Price1 >", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1GreaterThanOrEqualTo(Float value) {
            addCriterion("payables_Price1 >=", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1LessThan(Float value) {
            addCriterion("payables_Price1 <", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1LessThanOrEqualTo(Float value) {
            addCriterion("payables_Price1 <=", value, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1In(List<Float> values) {
            addCriterion("payables_Price1 in", values, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1NotIn(List<Float> values) {
            addCriterion("payables_Price1 not in", values, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1Between(Float value1, Float value2) {
            addCriterion("payables_Price1 between", value1, value2, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice1NotBetween(Float value1, Float value2) {
            addCriterion("payables_Price1 not between", value1, value2, "payablesPrice1");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2IsNull() {
            addCriterion("payables_sat_name2 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2IsNotNull() {
            addCriterion("payables_sat_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2EqualTo(Integer value) {
            addCriterion("payables_sat_name2 =", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2NotEqualTo(Integer value) {
            addCriterion("payables_sat_name2 <>", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2GreaterThan(Integer value) {
            addCriterion("payables_sat_name2 >", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2GreaterThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name2 >=", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2LessThan(Integer value) {
            addCriterion("payables_sat_name2 <", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2LessThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name2 <=", value, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2In(List<Integer> values) {
            addCriterion("payables_sat_name2 in", values, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2NotIn(List<Integer> values) {
            addCriterion("payables_sat_name2 not in", values, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2Between(Integer value1, Integer value2) {
            addCriterion("payables_sat_name2 between", value1, value2, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName2NotBetween(Integer value1, Integer value2) {
            addCriterion("payables_sat_name2 not between", value1, value2, "payablesSatName2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2IsNull() {
            addCriterion("payables_Price2 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2IsNotNull() {
            addCriterion("payables_Price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2EqualTo(Float value) {
            addCriterion("payables_Price2 =", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2NotEqualTo(Float value) {
            addCriterion("payables_Price2 <>", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2GreaterThan(Float value) {
            addCriterion("payables_Price2 >", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2GreaterThanOrEqualTo(Float value) {
            addCriterion("payables_Price2 >=", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2LessThan(Float value) {
            addCriterion("payables_Price2 <", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2LessThanOrEqualTo(Float value) {
            addCriterion("payables_Price2 <=", value, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2In(List<Float> values) {
            addCriterion("payables_Price2 in", values, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2NotIn(List<Float> values) {
            addCriterion("payables_Price2 not in", values, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2Between(Float value1, Float value2) {
            addCriterion("payables_Price2 between", value1, value2, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice2NotBetween(Float value1, Float value2) {
            addCriterion("payables_Price2 not between", value1, value2, "payablesPrice2");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3IsNull() {
            addCriterion("payables_sat_name3 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3IsNotNull() {
            addCriterion("payables_sat_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3EqualTo(Integer value) {
            addCriterion("payables_sat_name3 =", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3NotEqualTo(Integer value) {
            addCriterion("payables_sat_name3 <>", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3GreaterThan(Integer value) {
            addCriterion("payables_sat_name3 >", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3GreaterThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name3 >=", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3LessThan(Integer value) {
            addCriterion("payables_sat_name3 <", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3LessThanOrEqualTo(Integer value) {
            addCriterion("payables_sat_name3 <=", value, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3In(List<Integer> values) {
            addCriterion("payables_sat_name3 in", values, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3NotIn(List<Integer> values) {
            addCriterion("payables_sat_name3 not in", values, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3Between(Integer value1, Integer value2) {
            addCriterion("payables_sat_name3 between", value1, value2, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesSatName3NotBetween(Integer value1, Integer value2) {
            addCriterion("payables_sat_name3 not between", value1, value2, "payablesSatName3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3IsNull() {
            addCriterion("payables_Price3 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3IsNotNull() {
            addCriterion("payables_Price3 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3EqualTo(Float value) {
            addCriterion("payables_Price3 =", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3NotEqualTo(Float value) {
            addCriterion("payables_Price3 <>", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3GreaterThan(Float value) {
            addCriterion("payables_Price3 >", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3GreaterThanOrEqualTo(Float value) {
            addCriterion("payables_Price3 >=", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3LessThan(Float value) {
            addCriterion("payables_Price3 <", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3LessThanOrEqualTo(Float value) {
            addCriterion("payables_Price3 <=", value, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3In(List<Float> values) {
            addCriterion("payables_Price3 in", values, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3NotIn(List<Float> values) {
            addCriterion("payables_Price3 not in", values, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3Between(Float value1, Float value2) {
            addCriterion("payables_Price3 between", value1, value2, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesPrice3NotBetween(Float value1, Float value2) {
            addCriterion("payables_Price3 not between", value1, value2, "payablesPrice3");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouIsNull() {
            addCriterion("payables_zhekou is null");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouIsNotNull() {
            addCriterion("payables_zhekou is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouEqualTo(Integer value) {
            addCriterion("payables_zhekou =", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouNotEqualTo(Integer value) {
            addCriterion("payables_zhekou <>", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouGreaterThan(Integer value) {
            addCriterion("payables_zhekou >", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouGreaterThanOrEqualTo(Integer value) {
            addCriterion("payables_zhekou >=", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouLessThan(Integer value) {
            addCriterion("payables_zhekou <", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouLessThanOrEqualTo(Integer value) {
            addCriterion("payables_zhekou <=", value, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouIn(List<Integer> values) {
            addCriterion("payables_zhekou in", values, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouNotIn(List<Integer> values) {
            addCriterion("payables_zhekou not in", values, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouBetween(Integer value1, Integer value2) {
            addCriterion("payables_zhekou between", value1, value2, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesZhekouNotBetween(Integer value1, Integer value2) {
            addCriterion("payables_zhekou not between", value1, value2, "payablesZhekou");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeIsNull() {
            addCriterion("payables_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeIsNotNull() {
            addCriterion("payables_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("payables_endtime =", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("payables_endtime <>", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("payables_endtime >", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payables_endtime >=", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("payables_endtime <", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payables_endtime <=", value, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("payables_endtime in", values, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("payables_endtime not in", values, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payables_endtime between", value1, value2, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payables_endtime not between", value1, value2, "payablesEndtime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeIsNull() {
            addCriterion("payables_payablestime is null");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeIsNotNull() {
            addCriterion("payables_payablestime is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeEqualTo(Date value) {
            addCriterion("payables_payablestime =", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeNotEqualTo(Date value) {
            addCriterion("payables_payablestime <>", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeGreaterThan(Date value) {
            addCriterion("payables_payablestime >", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payables_payablestime >=", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeLessThan(Date value) {
            addCriterion("payables_payablestime <", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeLessThanOrEqualTo(Date value) {
            addCriterion("payables_payablestime <=", value, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeIn(List<Date> values) {
            addCriterion("payables_payablestime in", values, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeNotIn(List<Date> values) {
            addCriterion("payables_payablestime not in", values, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeBetween(Date value1, Date value2) {
            addCriterion("payables_payablestime between", value1, value2, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesPayablestimeNotBetween(Date value1, Date value2) {
            addCriterion("payables_payablestime not between", value1, value2, "payablesPayablestime");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameIsNull() {
            addCriterion("payables_currency_name is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameIsNotNull() {
            addCriterion("payables_currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameEqualTo(String value) {
            addCriterion("payables_currency_name =", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameNotEqualTo(String value) {
            addCriterion("payables_currency_name <>", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameGreaterThan(String value) {
            addCriterion("payables_currency_name >", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("payables_currency_name >=", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameLessThan(String value) {
            addCriterion("payables_currency_name <", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("payables_currency_name <=", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameLike(String value) {
            addCriterion("payables_currency_name like", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameNotLike(String value) {
            addCriterion("payables_currency_name not like", value, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameIn(List<String> values) {
            addCriterion("payables_currency_name in", values, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameNotIn(List<String> values) {
            addCriterion("payables_currency_name not in", values, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameBetween(String value1, String value2) {
            addCriterion("payables_currency_name between", value1, value2, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("payables_currency_name not between", value1, value2, "payablesCurrencyName");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeIsNull() {
            addCriterion("payables_currency_inexchange is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeIsNotNull() {
            addCriterion("payables_currency_inexchange is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeEqualTo(String value) {
            addCriterion("payables_currency_inexchange =", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeNotEqualTo(String value) {
            addCriterion("payables_currency_inexchange <>", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeGreaterThan(String value) {
            addCriterion("payables_currency_inexchange >", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeGreaterThanOrEqualTo(String value) {
            addCriterion("payables_currency_inexchange >=", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeLessThan(String value) {
            addCriterion("payables_currency_inexchange <", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeLessThanOrEqualTo(String value) {
            addCriterion("payables_currency_inexchange <=", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeLike(String value) {
            addCriterion("payables_currency_inexchange like", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeNotLike(String value) {
            addCriterion("payables_currency_inexchange not like", value, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeIn(List<String> values) {
            addCriterion("payables_currency_inexchange in", values, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeNotIn(List<String> values) {
            addCriterion("payables_currency_inexchange not in", values, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeBetween(String value1, String value2) {
            addCriterion("payables_currency_inexchange between", value1, value2, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesCurrencyInexchangeNotBetween(String value1, String value2) {
            addCriterion("payables_currency_inexchange not between", value1, value2, "payablesCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateIsNull() {
            addCriterion("payables_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateIsNotNull() {
            addCriterion("payables_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateEqualTo(Float value) {
            addCriterion("payables_exchange_rate =", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateNotEqualTo(Float value) {
            addCriterion("payables_exchange_rate <>", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateGreaterThan(Float value) {
            addCriterion("payables_exchange_rate >", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("payables_exchange_rate >=", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateLessThan(Float value) {
            addCriterion("payables_exchange_rate <", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("payables_exchange_rate <=", value, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateIn(List<Float> values) {
            addCriterion("payables_exchange_rate in", values, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateNotIn(List<Float> values) {
            addCriterion("payables_exchange_rate not in", values, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateBetween(Float value1, Float value2) {
            addCriterion("payables_exchange_rate between", value1, value2, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("payables_exchange_rate not between", value1, value2, "payablesExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeIsNull() {
            addCriterion("payables_type is null");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeIsNotNull() {
            addCriterion("payables_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeEqualTo(String value) {
            addCriterion("payables_type =", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeNotEqualTo(String value) {
            addCriterion("payables_type <>", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeGreaterThan(String value) {
            addCriterion("payables_type >", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payables_type >=", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeLessThan(String value) {
            addCriterion("payables_type <", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeLessThanOrEqualTo(String value) {
            addCriterion("payables_type <=", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeLike(String value) {
            addCriterion("payables_type like", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeNotLike(String value) {
            addCriterion("payables_type not like", value, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeIn(List<String> values) {
            addCriterion("payables_type in", values, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeNotIn(List<String> values) {
            addCriterion("payables_type not in", values, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeBetween(String value1, String value2) {
            addCriterion("payables_type between", value1, value2, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesTypeNotBetween(String value1, String value2) {
            addCriterion("payables_type not between", value1, value2, "payablesType");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoIsNull() {
            addCriterion("payables_voucherNo is null");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoIsNotNull() {
            addCriterion("payables_voucherNo is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoEqualTo(String value) {
            addCriterion("payables_voucherNo =", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoNotEqualTo(String value) {
            addCriterion("payables_voucherNo <>", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoGreaterThan(String value) {
            addCriterion("payables_voucherNo >", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("payables_voucherNo >=", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoLessThan(String value) {
            addCriterion("payables_voucherNo <", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoLessThanOrEqualTo(String value) {
            addCriterion("payables_voucherNo <=", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoLike(String value) {
            addCriterion("payables_voucherNo like", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoNotLike(String value) {
            addCriterion("payables_voucherNo not like", value, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoIn(List<String> values) {
            addCriterion("payables_voucherNo in", values, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoNotIn(List<String> values) {
            addCriterion("payables_voucherNo not in", values, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoBetween(String value1, String value2) {
            addCriterion("payables_voucherNo between", value1, value2, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesVouchernoNotBetween(String value1, String value2) {
            addCriterion("payables_voucherNo not between", value1, value2, "payablesVoucherno");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksIsNull() {
            addCriterion("payables_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksIsNotNull() {
            addCriterion("payables_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksEqualTo(String value) {
            addCriterion("payables_remarks =", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksNotEqualTo(String value) {
            addCriterion("payables_remarks <>", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksGreaterThan(String value) {
            addCriterion("payables_remarks >", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("payables_remarks >=", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksLessThan(String value) {
            addCriterion("payables_remarks <", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksLessThanOrEqualTo(String value) {
            addCriterion("payables_remarks <=", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksLike(String value) {
            addCriterion("payables_remarks like", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksNotLike(String value) {
            addCriterion("payables_remarks not like", value, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksIn(List<String> values) {
            addCriterion("payables_remarks in", values, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksNotIn(List<String> values) {
            addCriterion("payables_remarks not in", values, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksBetween(String value1, String value2) {
            addCriterion("payables_remarks between", value1, value2, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andPayablesRemarksNotBetween(String value1, String value2) {
            addCriterion("payables_remarks not between", value1, value2, "payablesRemarks");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameIsNull() {
            addCriterion("payables_team_name is null");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameIsNotNull() {
            addCriterion("payables_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameEqualTo(String value) {
            addCriterion("payables_team_name =", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameNotEqualTo(String value) {
            addCriterion("payables_team_name <>", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameGreaterThan(String value) {
            addCriterion("payables_team_name >", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("payables_team_name >=", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameLessThan(String value) {
            addCriterion("payables_team_name <", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameLessThanOrEqualTo(String value) {
            addCriterion("payables_team_name <=", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameLike(String value) {
            addCriterion("payables_team_name like", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameNotLike(String value) {
            addCriterion("payables_team_name not like", value, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameIn(List<String> values) {
            addCriterion("payables_team_name in", values, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameNotIn(List<String> values) {
            addCriterion("payables_team_name not in", values, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameBetween(String value1, String value2) {
            addCriterion("payables_team_name between", value1, value2, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andPayablesTeamNameNotBetween(String value1, String value2) {
            addCriterion("payables_team_name not between", value1, value2, "payablesTeamName");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameIsNull() {
            addCriterion("payables_project_name is null");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameIsNotNull() {
            addCriterion("payables_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameEqualTo(String value) {
            addCriterion("payables_project_name =", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameNotEqualTo(String value) {
            addCriterion("payables_project_name <>", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameGreaterThan(String value) {
            addCriterion("payables_project_name >", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("payables_project_name >=", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameLessThan(String value) {
            addCriterion("payables_project_name <", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameLessThanOrEqualTo(String value) {
            addCriterion("payables_project_name <=", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameLike(String value) {
            addCriterion("payables_project_name like", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameNotLike(String value) {
            addCriterion("payables_project_name not like", value, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameIn(List<String> values) {
            addCriterion("payables_project_name in", values, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameNotIn(List<String> values) {
            addCriterion("payables_project_name not in", values, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameBetween(String value1, String value2) {
            addCriterion("payables_project_name between", value1, value2, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesProjectNameNotBetween(String value1, String value2) {
            addCriterion("payables_project_name not between", value1, value2, "payablesProjectName");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelIsNull() {
            addCriterion("payables_billpersonnel is null");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelIsNotNull() {
            addCriterion("payables_billpersonnel is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelEqualTo(String value) {
            addCriterion("payables_billpersonnel =", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelNotEqualTo(String value) {
            addCriterion("payables_billpersonnel <>", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelGreaterThan(String value) {
            addCriterion("payables_billpersonnel >", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("payables_billpersonnel >=", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelLessThan(String value) {
            addCriterion("payables_billpersonnel <", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelLessThanOrEqualTo(String value) {
            addCriterion("payables_billpersonnel <=", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelLike(String value) {
            addCriterion("payables_billpersonnel like", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelNotLike(String value) {
            addCriterion("payables_billpersonnel not like", value, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelIn(List<String> values) {
            addCriterion("payables_billpersonnel in", values, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelNotIn(List<String> values) {
            addCriterion("payables_billpersonnel not in", values, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelBetween(String value1, String value2) {
            addCriterion("payables_billpersonnel between", value1, value2, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesBillpersonnelNotBetween(String value1, String value2) {
            addCriterion("payables_billpersonnel not between", value1, value2, "payablesBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersIsNull() {
            addCriterion("payables_reviewers is null");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersIsNotNull() {
            addCriterion("payables_reviewers is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersEqualTo(String value) {
            addCriterion("payables_reviewers =", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersNotEqualTo(String value) {
            addCriterion("payables_reviewers <>", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersGreaterThan(String value) {
            addCriterion("payables_reviewers >", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersGreaterThanOrEqualTo(String value) {
            addCriterion("payables_reviewers >=", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersLessThan(String value) {
            addCriterion("payables_reviewers <", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersLessThanOrEqualTo(String value) {
            addCriterion("payables_reviewers <=", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersLike(String value) {
            addCriterion("payables_reviewers like", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersNotLike(String value) {
            addCriterion("payables_reviewers not like", value, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersIn(List<String> values) {
            addCriterion("payables_reviewers in", values, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersNotIn(List<String> values) {
            addCriterion("payables_reviewers not in", values, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersBetween(String value1, String value2) {
            addCriterion("payables_reviewers between", value1, value2, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesReviewersNotBetween(String value1, String value2) {
            addCriterion("payables_reviewers not between", value1, value2, "payablesReviewers");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusIsNull() {
            addCriterion("payables_auditstatus is null");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusIsNotNull() {
            addCriterion("payables_auditstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusEqualTo(Integer value) {
            addCriterion("payables_auditstatus =", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusNotEqualTo(Integer value) {
            addCriterion("payables_auditstatus <>", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusGreaterThan(Integer value) {
            addCriterion("payables_auditstatus >", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payables_auditstatus >=", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusLessThan(Integer value) {
            addCriterion("payables_auditstatus <", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("payables_auditstatus <=", value, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusIn(List<Integer> values) {
            addCriterion("payables_auditstatus in", values, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusNotIn(List<Integer> values) {
            addCriterion("payables_auditstatus not in", values, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("payables_auditstatus between", value1, value2, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payables_auditstatus not between", value1, value2, "payablesAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingIsNull() {
            addCriterion("payables_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingIsNotNull() {
            addCriterion("payables_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingEqualTo(String value) {
            addCriterion("payables_Auditing =", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingNotEqualTo(String value) {
            addCriterion("payables_Auditing <>", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingGreaterThan(String value) {
            addCriterion("payables_Auditing >", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("payables_Auditing >=", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingLessThan(String value) {
            addCriterion("payables_Auditing <", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingLessThanOrEqualTo(String value) {
            addCriterion("payables_Auditing <=", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingLike(String value) {
            addCriterion("payables_Auditing like", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingNotLike(String value) {
            addCriterion("payables_Auditing not like", value, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingIn(List<String> values) {
            addCriterion("payables_Auditing in", values, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingNotIn(List<String> values) {
            addCriterion("payables_Auditing not in", values, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingBetween(String value1, String value2) {
            addCriterion("payables_Auditing between", value1, value2, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesAuditingNotBetween(String value1, String value2) {
            addCriterion("payables_Auditing not between", value1, value2, "payablesAuditing");
            return (Criteria) this;
        }

        public Criteria andPayablesYnIsNull() {
            addCriterion("payables_yn is null");
            return (Criteria) this;
        }

        public Criteria andPayablesYnIsNotNull() {
            addCriterion("payables_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesYnEqualTo(String value) {
            addCriterion("payables_yn =", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnNotEqualTo(String value) {
            addCriterion("payables_yn <>", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnGreaterThan(String value) {
            addCriterion("payables_yn >", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnGreaterThanOrEqualTo(String value) {
            addCriterion("payables_yn >=", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnLessThan(String value) {
            addCriterion("payables_yn <", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnLessThanOrEqualTo(String value) {
            addCriterion("payables_yn <=", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnLike(String value) {
            addCriterion("payables_yn like", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnNotLike(String value) {
            addCriterion("payables_yn not like", value, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnIn(List<String> values) {
            addCriterion("payables_yn in", values, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnNotIn(List<String> values) {
            addCriterion("payables_yn not in", values, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnBetween(String value1, String value2) {
            addCriterion("payables_yn between", value1, value2, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesYnNotBetween(String value1, String value2) {
            addCriterion("payables_yn not between", value1, value2, "payablesYn");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1IsNull() {
            addCriterion("payables_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1IsNotNull() {
            addCriterion("payables_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1EqualTo(String value) {
            addCriterion("payables_custom1 =", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1NotEqualTo(String value) {
            addCriterion("payables_custom1 <>", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1GreaterThan(String value) {
            addCriterion("payables_custom1 >", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("payables_custom1 >=", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1LessThan(String value) {
            addCriterion("payables_custom1 <", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1LessThanOrEqualTo(String value) {
            addCriterion("payables_custom1 <=", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1Like(String value) {
            addCriterion("payables_custom1 like", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1NotLike(String value) {
            addCriterion("payables_custom1 not like", value, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1In(List<String> values) {
            addCriterion("payables_custom1 in", values, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1NotIn(List<String> values) {
            addCriterion("payables_custom1 not in", values, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1Between(String value1, String value2) {
            addCriterion("payables_custom1 between", value1, value2, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom1NotBetween(String value1, String value2) {
            addCriterion("payables_custom1 not between", value1, value2, "payablesCustom1");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2IsNull() {
            addCriterion("payables_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2IsNotNull() {
            addCriterion("payables_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2EqualTo(String value) {
            addCriterion("payables_custom2 =", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2NotEqualTo(String value) {
            addCriterion("payables_custom2 <>", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2GreaterThan(String value) {
            addCriterion("payables_custom2 >", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("payables_custom2 >=", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2LessThan(String value) {
            addCriterion("payables_custom2 <", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2LessThanOrEqualTo(String value) {
            addCriterion("payables_custom2 <=", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2Like(String value) {
            addCriterion("payables_custom2 like", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2NotLike(String value) {
            addCriterion("payables_custom2 not like", value, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2In(List<String> values) {
            addCriterion("payables_custom2 in", values, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2NotIn(List<String> values) {
            addCriterion("payables_custom2 not in", values, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2Between(String value1, String value2) {
            addCriterion("payables_custom2 between", value1, value2, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom2NotBetween(String value1, String value2) {
            addCriterion("payables_custom2 not between", value1, value2, "payablesCustom2");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3IsNull() {
            addCriterion("payables_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3IsNotNull() {
            addCriterion("payables_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3EqualTo(String value) {
            addCriterion("payables_custom3 =", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3NotEqualTo(String value) {
            addCriterion("payables_custom3 <>", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3GreaterThan(String value) {
            addCriterion("payables_custom3 >", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("payables_custom3 >=", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3LessThan(String value) {
            addCriterion("payables_custom3 <", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3LessThanOrEqualTo(String value) {
            addCriterion("payables_custom3 <=", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3Like(String value) {
            addCriterion("payables_custom3 like", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3NotLike(String value) {
            addCriterion("payables_custom3 not like", value, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3In(List<String> values) {
            addCriterion("payables_custom3 in", values, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3NotIn(List<String> values) {
            addCriterion("payables_custom3 not in", values, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3Between(String value1, String value2) {
            addCriterion("payables_custom3 between", value1, value2, "payablesCustom3");
            return (Criteria) this;
        }

        public Criteria andPayablesCustom3NotBetween(String value1, String value2) {
            addCriterion("payables_custom3 not between", value1, value2, "payablesCustom3");
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