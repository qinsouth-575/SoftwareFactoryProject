package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryledgerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryledgerExample() {
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

        public Criteria andIlidIsNull() {
            addCriterion("ilid is null");
            return (Criteria) this;
        }

        public Criteria andIlidIsNotNull() {
            addCriterion("ilid is not null");
            return (Criteria) this;
        }

        public Criteria andIlidEqualTo(Integer value) {
            addCriterion("ilid =", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidNotEqualTo(Integer value) {
            addCriterion("ilid <>", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidGreaterThan(Integer value) {
            addCriterion("ilid >", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ilid >=", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidLessThan(Integer value) {
            addCriterion("ilid <", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidLessThanOrEqualTo(Integer value) {
            addCriterion("ilid <=", value, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidIn(List<Integer> values) {
            addCriterion("ilid in", values, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidNotIn(List<Integer> values) {
            addCriterion("ilid not in", values, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidBetween(Integer value1, Integer value2) {
            addCriterion("ilid between", value1, value2, "ilid");
            return (Criteria) this;
        }

        public Criteria andIlidNotBetween(Integer value1, Integer value2) {
            addCriterion("ilid not between", value1, value2, "ilid");
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

        public Criteria andSourcebillnameIsNull() {
            addCriterion("sourceBillName is null");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameIsNotNull() {
            addCriterion("sourceBillName is not null");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameEqualTo(String value) {
            addCriterion("sourceBillName =", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameNotEqualTo(String value) {
            addCriterion("sourceBillName <>", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameGreaterThan(String value) {
            addCriterion("sourceBillName >", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameGreaterThanOrEqualTo(String value) {
            addCriterion("sourceBillName >=", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameLessThan(String value) {
            addCriterion("sourceBillName <", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameLessThanOrEqualTo(String value) {
            addCriterion("sourceBillName <=", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameLike(String value) {
            addCriterion("sourceBillName like", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameNotLike(String value) {
            addCriterion("sourceBillName not like", value, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameIn(List<String> values) {
            addCriterion("sourceBillName in", values, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameNotIn(List<String> values) {
            addCriterion("sourceBillName not in", values, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameBetween(String value1, String value2) {
            addCriterion("sourceBillName between", value1, value2, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcebillnameNotBetween(String value1, String value2) {
            addCriterion("sourceBillName not between", value1, value2, "sourcebillname");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNull() {
            addCriterion("sourceNo is null");
            return (Criteria) this;
        }

        public Criteria andSourcenoIsNotNull() {
            addCriterion("sourceNo is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenoEqualTo(String value) {
            addCriterion("sourceNo =", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotEqualTo(String value) {
            addCriterion("sourceNo <>", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThan(String value) {
            addCriterion("sourceNo >", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoGreaterThanOrEqualTo(String value) {
            addCriterion("sourceNo >=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThan(String value) {
            addCriterion("sourceNo <", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLessThanOrEqualTo(String value) {
            addCriterion("sourceNo <=", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoLike(String value) {
            addCriterion("sourceNo like", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotLike(String value) {
            addCriterion("sourceNo not like", value, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoIn(List<String> values) {
            addCriterion("sourceNo in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotIn(List<String> values) {
            addCriterion("sourceNo not in", values, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoBetween(String value1, String value2) {
            addCriterion("sourceNo between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andSourcenoNotBetween(String value1, String value2) {
            addCriterion("sourceNo not between", value1, value2, "sourceno");
            return (Criteria) this;
        }

        public Criteria andWhoroosIsNull() {
            addCriterion("whOrOos is null");
            return (Criteria) this;
        }

        public Criteria andWhoroosIsNotNull() {
            addCriterion("whOrOos is not null");
            return (Criteria) this;
        }

        public Criteria andWhoroosEqualTo(String value) {
            addCriterion("whOrOos =", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosNotEqualTo(String value) {
            addCriterion("whOrOos <>", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosGreaterThan(String value) {
            addCriterion("whOrOos >", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosGreaterThanOrEqualTo(String value) {
            addCriterion("whOrOos >=", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosLessThan(String value) {
            addCriterion("whOrOos <", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosLessThanOrEqualTo(String value) {
            addCriterion("whOrOos <=", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosLike(String value) {
            addCriterion("whOrOos like", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosNotLike(String value) {
            addCriterion("whOrOos not like", value, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosIn(List<String> values) {
            addCriterion("whOrOos in", values, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosNotIn(List<String> values) {
            addCriterion("whOrOos not in", values, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosBetween(String value1, String value2) {
            addCriterion("whOrOos between", value1, value2, "whoroos");
            return (Criteria) this;
        }

        public Criteria andWhoroosNotBetween(String value1, String value2) {
            addCriterion("whOrOos not between", value1, value2, "whoroos");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingIsNull() {
            addCriterion("fristWarehousing is null");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingIsNotNull() {
            addCriterion("fristWarehousing is not null");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingEqualTo(String value) {
            addCriterion("fristWarehousing =", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingNotEqualTo(String value) {
            addCriterion("fristWarehousing <>", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingGreaterThan(String value) {
            addCriterion("fristWarehousing >", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingGreaterThanOrEqualTo(String value) {
            addCriterion("fristWarehousing >=", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingLessThan(String value) {
            addCriterion("fristWarehousing <", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingLessThanOrEqualTo(String value) {
            addCriterion("fristWarehousing <=", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingLike(String value) {
            addCriterion("fristWarehousing like", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingNotLike(String value) {
            addCriterion("fristWarehousing not like", value, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingIn(List<String> values) {
            addCriterion("fristWarehousing in", values, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingNotIn(List<String> values) {
            addCriterion("fristWarehousing not in", values, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingBetween(String value1, String value2) {
            addCriterion("fristWarehousing between", value1, value2, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andFristwarehousingNotBetween(String value1, String value2) {
            addCriterion("fristWarehousing not between", value1, value2, "fristwarehousing");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNull() {
            addCriterion("recordDate is null");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNotNull() {
            addCriterion("recordDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecorddateEqualTo(Date value) {
            addCriterionForJDBCDate("recordDate =", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("recordDate <>", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThan(Date value) {
            addCriterionForJDBCDate("recordDate >", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recordDate >=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThan(Date value) {
            addCriterionForJDBCDate("recordDate <", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recordDate <=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateIn(List<Date> values) {
            addCriterionForJDBCDate("recordDate in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("recordDate not in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recordDate between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recordDate not between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNull() {
            addCriterion("standby1 is null");
            return (Criteria) this;
        }

        public Criteria andStandby1IsNotNull() {
            addCriterion("standby1 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby1EqualTo(String value) {
            addCriterion("standby1 =", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotEqualTo(String value) {
            addCriterion("standby1 <>", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThan(String value) {
            addCriterion("standby1 >", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1GreaterThanOrEqualTo(String value) {
            addCriterion("standby1 >=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThan(String value) {
            addCriterion("standby1 <", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1LessThanOrEqualTo(String value) {
            addCriterion("standby1 <=", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Like(String value) {
            addCriterion("standby1 like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotLike(String value) {
            addCriterion("standby1 not like", value, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1In(List<String> values) {
            addCriterion("standby1 in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotIn(List<String> values) {
            addCriterion("standby1 not in", values, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1Between(String value1, String value2) {
            addCriterion("standby1 between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby1NotBetween(String value1, String value2) {
            addCriterion("standby1 not between", value1, value2, "standby1");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNull() {
            addCriterion("standby2 is null");
            return (Criteria) this;
        }

        public Criteria andStandby2IsNotNull() {
            addCriterion("standby2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandby2EqualTo(String value) {
            addCriterion("standby2 =", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotEqualTo(String value) {
            addCriterion("standby2 <>", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThan(String value) {
            addCriterion("standby2 >", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2GreaterThanOrEqualTo(String value) {
            addCriterion("standby2 >=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThan(String value) {
            addCriterion("standby2 <", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2LessThanOrEqualTo(String value) {
            addCriterion("standby2 <=", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Like(String value) {
            addCriterion("standby2 like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotLike(String value) {
            addCriterion("standby2 not like", value, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2In(List<String> values) {
            addCriterion("standby2 in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotIn(List<String> values) {
            addCriterion("standby2 not in", values, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2Between(String value1, String value2) {
            addCriterion("standby2 between", value1, value2, "standby2");
            return (Criteria) this;
        }

        public Criteria andStandby2NotBetween(String value1, String value2) {
            addCriterion("standby2 not between", value1, value2, "standby2");
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