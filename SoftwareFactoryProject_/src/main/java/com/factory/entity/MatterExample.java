package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MatterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatterExample() {
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

        public Criteria andMatterNameIsNull() {
            addCriterion("matter_name is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNotNull() {
            addCriterion("matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameEqualTo(String value) {
            addCriterion("matter_name =", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotEqualTo(String value) {
            addCriterion("matter_name <>", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThan(String value) {
            addCriterion("matter_name >", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_name >=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThan(String value) {
            addCriterion("matter_name <", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThanOrEqualTo(String value) {
            addCriterion("matter_name <=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLike(String value) {
            addCriterion("matter_name like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotLike(String value) {
            addCriterion("matter_name not like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameIn(List<String> values) {
            addCriterion("matter_name in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotIn(List<String> values) {
            addCriterion("matter_name not in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameBetween(String value1, String value2) {
            addCriterion("matter_name between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotBetween(String value1, String value2) {
            addCriterion("matter_name not between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterSizeIsNull() {
            addCriterion("matter_size is null");
            return (Criteria) this;
        }

        public Criteria andMatterSizeIsNotNull() {
            addCriterion("matter_size is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSizeEqualTo(String value) {
            addCriterion("matter_size =", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeNotEqualTo(String value) {
            addCriterion("matter_size <>", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeGreaterThan(String value) {
            addCriterion("matter_size >", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeGreaterThanOrEqualTo(String value) {
            addCriterion("matter_size >=", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeLessThan(String value) {
            addCriterion("matter_size <", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeLessThanOrEqualTo(String value) {
            addCriterion("matter_size <=", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeLike(String value) {
            addCriterion("matter_size like", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeNotLike(String value) {
            addCriterion("matter_size not like", value, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeIn(List<String> values) {
            addCriterion("matter_size in", values, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeNotIn(List<String> values) {
            addCriterion("matter_size not in", values, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeBetween(String value1, String value2) {
            addCriterion("matter_size between", value1, value2, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterSizeNotBetween(String value1, String value2) {
            addCriterion("matter_size not between", value1, value2, "matterSize");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameIsNull() {
            addCriterion("matter_english_name is null");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameIsNotNull() {
            addCriterion("matter_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameEqualTo(String value) {
            addCriterion("matter_english_name =", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameNotEqualTo(String value) {
            addCriterion("matter_english_name <>", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameGreaterThan(String value) {
            addCriterion("matter_english_name >", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_english_name >=", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameLessThan(String value) {
            addCriterion("matter_english_name <", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("matter_english_name <=", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameLike(String value) {
            addCriterion("matter_english_name like", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameNotLike(String value) {
            addCriterion("matter_english_name not like", value, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameIn(List<String> values) {
            addCriterion("matter_english_name in", values, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameNotIn(List<String> values) {
            addCriterion("matter_english_name not in", values, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameBetween(String value1, String value2) {
            addCriterion("matter_english_name between", value1, value2, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andMatterEnglishNameNotBetween(String value1, String value2) {
            addCriterion("matter_english_name not between", value1, value2, "matterEnglishName");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("ClassID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("ClassID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("UnitID is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("UnitID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("UnitID =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("UnitID <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("UnitID >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("UnitID >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("UnitID <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("UnitID <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("UnitID like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("UnitID not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("UnitID in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("UnitID not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("UnitID between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("UnitID not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UnitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UnitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UnitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UnitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UnitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UnitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UnitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UnitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UnitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UnitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UnitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UnitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UnitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoIsNull() {
            addCriterion("matter_barno is null");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoIsNotNull() {
            addCriterion("matter_barno is not null");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoEqualTo(String value) {
            addCriterion("matter_barno =", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoNotEqualTo(String value) {
            addCriterion("matter_barno <>", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoGreaterThan(String value) {
            addCriterion("matter_barno >", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoGreaterThanOrEqualTo(String value) {
            addCriterion("matter_barno >=", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoLessThan(String value) {
            addCriterion("matter_barno <", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoLessThanOrEqualTo(String value) {
            addCriterion("matter_barno <=", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoLike(String value) {
            addCriterion("matter_barno like", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoNotLike(String value) {
            addCriterion("matter_barno not like", value, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoIn(List<String> values) {
            addCriterion("matter_barno in", values, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoNotIn(List<String> values) {
            addCriterion("matter_barno not in", values, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoBetween(String value1, String value2) {
            addCriterion("matter_barno between", value1, value2, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterBarnoNotBetween(String value1, String value2) {
            addCriterion("matter_barno not between", value1, value2, "matterBarno");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleIsNull() {
            addCriterion("matter_msale is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleIsNotNull() {
            addCriterion("matter_msale is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEqualTo(Float value) {
            addCriterion("matter_msale =", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleNotEqualTo(Float value) {
            addCriterion("matter_msale <>", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleGreaterThan(Float value) {
            addCriterion("matter_msale >", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale >=", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleLessThan(Float value) {
            addCriterion("matter_msale <", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleLessThanOrEqualTo(Float value) {
            addCriterion("matter_msale <=", value, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleIn(List<Float> values) {
            addCriterion("matter_msale in", values, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleNotIn(List<Float> values) {
            addCriterion("matter_msale not in", values, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBetween(Float value1, Float value2) {
            addCriterion("matter_msale between", value1, value2, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleNotBetween(Float value1, Float value2) {
            addCriterion("matter_msale not between", value1, value2, "matterMsale");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAIsNull() {
            addCriterion("matter_msale_a is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAIsNotNull() {
            addCriterion("matter_msale_a is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAEqualTo(Float value) {
            addCriterion("matter_msale_a =", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleANotEqualTo(Float value) {
            addCriterion("matter_msale_a <>", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAGreaterThan(Float value) {
            addCriterion("matter_msale_a >", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale_a >=", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleALessThan(Float value) {
            addCriterion("matter_msale_a <", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleALessThanOrEqualTo(Float value) {
            addCriterion("matter_msale_a <=", value, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleAIn(List<Float> values) {
            addCriterion("matter_msale_a in", values, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleANotIn(List<Float> values) {
            addCriterion("matter_msale_a not in", values, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleABetween(Float value1, Float value2) {
            addCriterion("matter_msale_a between", value1, value2, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleANotBetween(Float value1, Float value2) {
            addCriterion("matter_msale_a not between", value1, value2, "matterMsaleA");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBIsNull() {
            addCriterion("matter_msale_b is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBIsNotNull() {
            addCriterion("matter_msale_b is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBEqualTo(Float value) {
            addCriterion("matter_msale_b =", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBNotEqualTo(Float value) {
            addCriterion("matter_msale_b <>", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBGreaterThan(Float value) {
            addCriterion("matter_msale_b >", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale_b >=", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBLessThan(Float value) {
            addCriterion("matter_msale_b <", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBLessThanOrEqualTo(Float value) {
            addCriterion("matter_msale_b <=", value, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBIn(List<Float> values) {
            addCriterion("matter_msale_b in", values, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBNotIn(List<Float> values) {
            addCriterion("matter_msale_b not in", values, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBBetween(Float value1, Float value2) {
            addCriterion("matter_msale_b between", value1, value2, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleBNotBetween(Float value1, Float value2) {
            addCriterion("matter_msale_b not between", value1, value2, "matterMsaleB");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCIsNull() {
            addCriterion("matter_msale_c is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCIsNotNull() {
            addCriterion("matter_msale_c is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCEqualTo(Float value) {
            addCriterion("matter_msale_c =", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCNotEqualTo(Float value) {
            addCriterion("matter_msale_c <>", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCGreaterThan(Float value) {
            addCriterion("matter_msale_c >", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale_c >=", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCLessThan(Float value) {
            addCriterion("matter_msale_c <", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCLessThanOrEqualTo(Float value) {
            addCriterion("matter_msale_c <=", value, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCIn(List<Float> values) {
            addCriterion("matter_msale_c in", values, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCNotIn(List<Float> values) {
            addCriterion("matter_msale_c not in", values, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCBetween(Float value1, Float value2) {
            addCriterion("matter_msale_c between", value1, value2, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleCNotBetween(Float value1, Float value2) {
            addCriterion("matter_msale_c not between", value1, value2, "matterMsaleC");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDIsNull() {
            addCriterion("matter_msale_d is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDIsNotNull() {
            addCriterion("matter_msale_d is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDEqualTo(Float value) {
            addCriterion("matter_msale_d =", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDNotEqualTo(Float value) {
            addCriterion("matter_msale_d <>", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDGreaterThan(Float value) {
            addCriterion("matter_msale_d >", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale_d >=", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDLessThan(Float value) {
            addCriterion("matter_msale_d <", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDLessThanOrEqualTo(Float value) {
            addCriterion("matter_msale_d <=", value, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDIn(List<Float> values) {
            addCriterion("matter_msale_d in", values, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDNotIn(List<Float> values) {
            addCriterion("matter_msale_d not in", values, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDBetween(Float value1, Float value2) {
            addCriterion("matter_msale_d between", value1, value2, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleDNotBetween(Float value1, Float value2) {
            addCriterion("matter_msale_d not between", value1, value2, "matterMsaleD");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEIsNull() {
            addCriterion("matter_msale_e is null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEIsNotNull() {
            addCriterion("matter_msale_e is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEEqualTo(Float value) {
            addCriterion("matter_msale_e =", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleENotEqualTo(Float value) {
            addCriterion("matter_msale_e <>", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEGreaterThan(Float value) {
            addCriterion("matter_msale_e >", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_msale_e >=", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleELessThan(Float value) {
            addCriterion("matter_msale_e <", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleELessThanOrEqualTo(Float value) {
            addCriterion("matter_msale_e <=", value, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEIn(List<Float> values) {
            addCriterion("matter_msale_e in", values, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleENotIn(List<Float> values) {
            addCriterion("matter_msale_e not in", values, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleEBetween(Float value1, Float value2) {
            addCriterion("matter_msale_e between", value1, value2, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterMsaleENotBetween(Float value1, Float value2) {
            addCriterion("matter_msale_e not between", value1, value2, "matterMsaleE");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceIsNull() {
            addCriterion("matter_standard_price is null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceIsNotNull() {
            addCriterion("matter_standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceEqualTo(Float value) {
            addCriterion("matter_standard_price =", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceNotEqualTo(Float value) {
            addCriterion("matter_standard_price <>", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceGreaterThan(Float value) {
            addCriterion("matter_standard_price >", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_standard_price >=", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceLessThan(Float value) {
            addCriterion("matter_standard_price <", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceLessThanOrEqualTo(Float value) {
            addCriterion("matter_standard_price <=", value, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceIn(List<Float> values) {
            addCriterion("matter_standard_price in", values, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceNotIn(List<Float> values) {
            addCriterion("matter_standard_price not in", values, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceBetween(Float value1, Float value2) {
            addCriterion("matter_standard_price between", value1, value2, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andMatterStandardPriceNotBetween(Float value1, Float value2) {
            addCriterion("matter_standard_price not between", value1, value2, "matterStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNull() {
            addCriterion("CurrencyID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIsNotNull() {
            addCriterion("CurrencyID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyidEqualTo(String value) {
            addCriterion("CurrencyID =", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotEqualTo(String value) {
            addCriterion("CurrencyID <>", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThan(String value) {
            addCriterion("CurrencyID >", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencyID >=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThan(String value) {
            addCriterion("CurrencyID <", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLessThanOrEqualTo(String value) {
            addCriterion("CurrencyID <=", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidLike(String value) {
            addCriterion("CurrencyID like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotLike(String value) {
            addCriterion("CurrencyID not like", value, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidIn(List<String> values) {
            addCriterion("CurrencyID in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotIn(List<String> values) {
            addCriterion("CurrencyID not in", values, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidBetween(String value1, String value2) {
            addCriterion("CurrencyID between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencyidNotBetween(String value1, String value2) {
            addCriterion("CurrencyID not between", value1, value2, "currencyid");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIsNull() {
            addCriterion("CurrencyName is null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIsNotNull() {
            addCriterion("CurrencyName is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencynameEqualTo(String value) {
            addCriterion("CurrencyName =", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotEqualTo(String value) {
            addCriterion("CurrencyName <>", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThan(String value) {
            addCriterion("CurrencyName >", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencyName >=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThan(String value) {
            addCriterion("CurrencyName <", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLessThanOrEqualTo(String value) {
            addCriterion("CurrencyName <=", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameLike(String value) {
            addCriterion("CurrencyName like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotLike(String value) {
            addCriterion("CurrencyName not like", value, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameIn(List<String> values) {
            addCriterion("CurrencyName in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotIn(List<String> values) {
            addCriterion("CurrencyName not in", values, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameBetween(String value1, String value2) {
            addCriterion("CurrencyName between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andCurrencynameNotBetween(String value1, String value2) {
            addCriterion("CurrencyName not between", value1, value2, "currencyname");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeIsNull() {
            addCriterion("matter_material_type is null");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeIsNotNull() {
            addCriterion("matter_material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeEqualTo(String value) {
            addCriterion("matter_material_type =", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeNotEqualTo(String value) {
            addCriterion("matter_material_type <>", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeGreaterThan(String value) {
            addCriterion("matter_material_type >", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("matter_material_type >=", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeLessThan(String value) {
            addCriterion("matter_material_type <", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("matter_material_type <=", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeLike(String value) {
            addCriterion("matter_material_type like", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeNotLike(String value) {
            addCriterion("matter_material_type not like", value, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeIn(List<String> values) {
            addCriterion("matter_material_type in", values, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeNotIn(List<String> values) {
            addCriterion("matter_material_type not in", values, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeBetween(String value1, String value2) {
            addCriterion("matter_material_type between", value1, value2, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("matter_material_type not between", value1, value2, "matterMaterialType");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxIsNull() {
            addCriterion("matter_iftax is null");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxIsNotNull() {
            addCriterion("matter_iftax is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxEqualTo(String value) {
            addCriterion("matter_iftax =", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxNotEqualTo(String value) {
            addCriterion("matter_iftax <>", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxGreaterThan(String value) {
            addCriterion("matter_iftax >", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxGreaterThanOrEqualTo(String value) {
            addCriterion("matter_iftax >=", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxLessThan(String value) {
            addCriterion("matter_iftax <", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxLessThanOrEqualTo(String value) {
            addCriterion("matter_iftax <=", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxLike(String value) {
            addCriterion("matter_iftax like", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxNotLike(String value) {
            addCriterion("matter_iftax not like", value, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxIn(List<String> values) {
            addCriterion("matter_iftax in", values, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxNotIn(List<String> values) {
            addCriterion("matter_iftax not in", values, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxBetween(String value1, String value2) {
            addCriterion("matter_iftax between", value1, value2, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterIftaxNotBetween(String value1, String value2) {
            addCriterion("matter_iftax not between", value1, value2, "matterIftax");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoIsNull() {
            addCriterion("matter_taxno is null");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoIsNotNull() {
            addCriterion("matter_taxno is not null");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoEqualTo(Float value) {
            addCriterion("matter_taxno =", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoNotEqualTo(Float value) {
            addCriterion("matter_taxno <>", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoGreaterThan(Float value) {
            addCriterion("matter_taxno >", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_taxno >=", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoLessThan(Float value) {
            addCriterion("matter_taxno <", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoLessThanOrEqualTo(Float value) {
            addCriterion("matter_taxno <=", value, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoIn(List<Float> values) {
            addCriterion("matter_taxno in", values, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoNotIn(List<Float> values) {
            addCriterion("matter_taxno not in", values, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoBetween(Float value1, Float value2) {
            addCriterion("matter_taxno between", value1, value2, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxnoNotBetween(Float value1, Float value2) {
            addCriterion("matter_taxno not between", value1, value2, "matterTaxno");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointIsNull() {
            addCriterion("matter_taxpoint is null");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointIsNotNull() {
            addCriterion("matter_taxpoint is not null");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointEqualTo(Float value) {
            addCriterion("matter_taxpoint =", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointNotEqualTo(Float value) {
            addCriterion("matter_taxpoint <>", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointGreaterThan(Float value) {
            addCriterion("matter_taxpoint >", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_taxpoint >=", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointLessThan(Float value) {
            addCriterion("matter_taxpoint <", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointLessThanOrEqualTo(Float value) {
            addCriterion("matter_taxpoint <=", value, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointIn(List<Float> values) {
            addCriterion("matter_taxpoint in", values, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointNotIn(List<Float> values) {
            addCriterion("matter_taxpoint not in", values, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointBetween(Float value1, Float value2) {
            addCriterion("matter_taxpoint between", value1, value2, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterTaxpointNotBetween(Float value1, Float value2) {
            addCriterion("matter_taxpoint not between", value1, value2, "matterTaxpoint");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeIsNull() {
            addCriterion("matter_purchase_lead_time is null");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeIsNotNull() {
            addCriterion("matter_purchase_lead_time is not null");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeEqualTo(Float value) {
            addCriterion("matter_purchase_lead_time =", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeNotEqualTo(Float value) {
            addCriterion("matter_purchase_lead_time <>", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeGreaterThan(Float value) {
            addCriterion("matter_purchase_lead_time >", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_purchase_lead_time >=", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeLessThan(Float value) {
            addCriterion("matter_purchase_lead_time <", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeLessThanOrEqualTo(Float value) {
            addCriterion("matter_purchase_lead_time <=", value, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeIn(List<Float> values) {
            addCriterion("matter_purchase_lead_time in", values, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeNotIn(List<Float> values) {
            addCriterion("matter_purchase_lead_time not in", values, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeBetween(Float value1, Float value2) {
            addCriterion("matter_purchase_lead_time between", value1, value2, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andMatterPurchaseLeadTimeNotBetween(Float value1, Float value2) {
            addCriterion("matter_purchase_lead_time not between", value1, value2, "matterPurchaseLeadTime");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberIsNull() {
            addCriterion("matter_set_with_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberIsNotNull() {
            addCriterion("matter_set_with_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberEqualTo(Integer value) {
            addCriterion("matter_set_with_batch_number =", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberNotEqualTo(Integer value) {
            addCriterion("matter_set_with_batch_number <>", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberGreaterThan(Integer value) {
            addCriterion("matter_set_with_batch_number >", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_set_with_batch_number >=", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberLessThan(Integer value) {
            addCriterion("matter_set_with_batch_number <", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("matter_set_with_batch_number <=", value, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberIn(List<Integer> values) {
            addCriterion("matter_set_with_batch_number in", values, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberNotIn(List<Integer> values) {
            addCriterion("matter_set_with_batch_number not in", values, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberBetween(Integer value1, Integer value2) {
            addCriterion("matter_set_with_batch_number between", value1, value2, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSetWithBatchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_set_with_batch_number not between", value1, value2, "matterSetWithBatchNumber");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockIsNull() {
            addCriterion("matter_safestock is null");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockIsNotNull() {
            addCriterion("matter_safestock is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockEqualTo(Integer value) {
            addCriterion("matter_safestock =", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockNotEqualTo(Integer value) {
            addCriterion("matter_safestock <>", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockGreaterThan(Integer value) {
            addCriterion("matter_safestock >", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_safestock >=", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockLessThan(Integer value) {
            addCriterion("matter_safestock <", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockLessThanOrEqualTo(Integer value) {
            addCriterion("matter_safestock <=", value, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockIn(List<Integer> values) {
            addCriterion("matter_safestock in", values, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockNotIn(List<Integer> values) {
            addCriterion("matter_safestock not in", values, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockBetween(Integer value1, Integer value2) {
            addCriterion("matter_safestock between", value1, value2, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterSafestockNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_safestock not between", value1, value2, "matterSafestock");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountIsNull() {
            addCriterion("matter_daystartcount is null");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountIsNotNull() {
            addCriterion("matter_daystartcount is not null");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountEqualTo(Integer value) {
            addCriterion("matter_daystartcount =", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountNotEqualTo(Integer value) {
            addCriterion("matter_daystartcount <>", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountGreaterThan(Integer value) {
            addCriterion("matter_daystartcount >", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_daystartcount >=", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountLessThan(Integer value) {
            addCriterion("matter_daystartcount <", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountLessThanOrEqualTo(Integer value) {
            addCriterion("matter_daystartcount <=", value, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountIn(List<Integer> values) {
            addCriterion("matter_daystartcount in", values, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountNotIn(List<Integer> values) {
            addCriterion("matter_daystartcount not in", values, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountBetween(Integer value1, Integer value2) {
            addCriterion("matter_daystartcount between", value1, value2, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartcountNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_daystartcount not between", value1, value2, "matterDaystartcount");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostIsNull() {
            addCriterion("matter_avgcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostIsNotNull() {
            addCriterion("matter_avgcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostEqualTo(Float value) {
            addCriterion("matter_avgcost =", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostNotEqualTo(Float value) {
            addCriterion("matter_avgcost <>", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostGreaterThan(Float value) {
            addCriterion("matter_avgcost >", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_avgcost >=", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostLessThan(Float value) {
            addCriterion("matter_avgcost <", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_avgcost <=", value, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostIn(List<Float> values) {
            addCriterion("matter_avgcost in", values, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostNotIn(List<Float> values) {
            addCriterion("matter_avgcost not in", values, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostBetween(Float value1, Float value2) {
            addCriterion("matter_avgcost between", value1, value2, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterAvgcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_avgcost not between", value1, value2, "matterAvgcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostIsNull() {
            addCriterion("matter_standardcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostIsNotNull() {
            addCriterion("matter_standardcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostEqualTo(Float value) {
            addCriterion("matter_standardcost =", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostNotEqualTo(Float value) {
            addCriterion("matter_standardcost <>", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostGreaterThan(Float value) {
            addCriterion("matter_standardcost >", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_standardcost >=", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostLessThan(Float value) {
            addCriterion("matter_standardcost <", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_standardcost <=", value, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostIn(List<Float> values) {
            addCriterion("matter_standardcost in", values, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostNotIn(List<Float> values) {
            addCriterion("matter_standardcost not in", values, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostBetween(Float value1, Float value2) {
            addCriterion("matter_standardcost between", value1, value2, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_standardcost not between", value1, value2, "matterStandardcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostIsNull() {
            addCriterion("matter_daystartallcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostIsNotNull() {
            addCriterion("matter_daystartallcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostEqualTo(Float value) {
            addCriterion("matter_daystartallcost =", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostNotEqualTo(Float value) {
            addCriterion("matter_daystartallcost <>", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostGreaterThan(Float value) {
            addCriterion("matter_daystartallcost >", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_daystartallcost >=", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostLessThan(Float value) {
            addCriterion("matter_daystartallcost <", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_daystartallcost <=", value, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostIn(List<Float> values) {
            addCriterion("matter_daystartallcost in", values, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostNotIn(List<Float> values) {
            addCriterion("matter_daystartallcost not in", values, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostBetween(Float value1, Float value2) {
            addCriterion("matter_daystartallcost between", value1, value2, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterDaystartallcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_daystartallcost not between", value1, value2, "matterDaystartallcost");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockIsNull() {
            addCriterion("matter_lowsafestock is null");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockIsNotNull() {
            addCriterion("matter_lowsafestock is not null");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockEqualTo(Integer value) {
            addCriterion("matter_lowsafestock =", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockNotEqualTo(Integer value) {
            addCriterion("matter_lowsafestock <>", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockGreaterThan(Integer value) {
            addCriterion("matter_lowsafestock >", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_lowsafestock >=", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockLessThan(Integer value) {
            addCriterion("matter_lowsafestock <", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockLessThanOrEqualTo(Integer value) {
            addCriterion("matter_lowsafestock <=", value, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockIn(List<Integer> values) {
            addCriterion("matter_lowsafestock in", values, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockNotIn(List<Integer> values) {
            addCriterion("matter_lowsafestock not in", values, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockBetween(Integer value1, Integer value2) {
            addCriterion("matter_lowsafestock between", value1, value2, "matterLowsafestock");
            return (Criteria) this;
        }

        public Criteria andMatterLowsafestockNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_lowsafestock not between", value1, value2, "matterLowsafestock");
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

        public Criteria andMatterStandardallcostIsNull() {
            addCriterion("matter_standardallcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostIsNotNull() {
            addCriterion("matter_standardallcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostEqualTo(Float value) {
            addCriterion("matter_standardallcost =", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostNotEqualTo(Float value) {
            addCriterion("matter_standardallcost <>", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostGreaterThan(Float value) {
            addCriterion("matter_standardallcost >", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_standardallcost >=", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostLessThan(Float value) {
            addCriterion("matter_standardallcost <", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_standardallcost <=", value, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostIn(List<Float> values) {
            addCriterion("matter_standardallcost in", values, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostNotIn(List<Float> values) {
            addCriterion("matter_standardallcost not in", values, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostBetween(Float value1, Float value2) {
            addCriterion("matter_standardallcost between", value1, value2, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterStandardallcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_standardallcost not between", value1, value2, "matterStandardallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostIsNull() {
            addCriterion("matter_nowallcost is null");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostIsNotNull() {
            addCriterion("matter_nowallcost is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostEqualTo(Float value) {
            addCriterion("matter_nowallcost =", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostNotEqualTo(Float value) {
            addCriterion("matter_nowallcost <>", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostGreaterThan(Float value) {
            addCriterion("matter_nowallcost >", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostGreaterThanOrEqualTo(Float value) {
            addCriterion("matter_nowallcost >=", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostLessThan(Float value) {
            addCriterion("matter_nowallcost <", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostLessThanOrEqualTo(Float value) {
            addCriterion("matter_nowallcost <=", value, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostIn(List<Float> values) {
            addCriterion("matter_nowallcost in", values, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostNotIn(List<Float> values) {
            addCriterion("matter_nowallcost not in", values, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostBetween(Float value1, Float value2) {
            addCriterion("matter_nowallcost between", value1, value2, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterNowallcostNotBetween(Float value1, Float value2) {
            addCriterion("matter_nowallcost not between", value1, value2, "matterNowallcost");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinIsNull() {
            addCriterion("matter_firstin is null");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinIsNotNull() {
            addCriterion("matter_firstin is not null");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstin =", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinNotEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstin <>", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinGreaterThan(Date value) {
            addCriterionForJDBCDate("matter_firstin >", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstin >=", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinLessThan(Date value) {
            addCriterionForJDBCDate("matter_firstin <", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstin <=", value, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinIn(List<Date> values) {
            addCriterionForJDBCDate("matter_firstin in", values, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinNotIn(List<Date> values) {
            addCriterionForJDBCDate("matter_firstin not in", values, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_firstin between", value1, value2, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_firstin not between", value1, value2, "matterFirstin");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutIsNull() {
            addCriterion("matter_firstout is null");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutIsNotNull() {
            addCriterion("matter_firstout is not null");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstout =", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutNotEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstout <>", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutGreaterThan(Date value) {
            addCriterionForJDBCDate("matter_firstout >", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstout >=", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutLessThan(Date value) {
            addCriterionForJDBCDate("matter_firstout <", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_firstout <=", value, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutIn(List<Date> values) {
            addCriterionForJDBCDate("matter_firstout in", values, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutNotIn(List<Date> values) {
            addCriterionForJDBCDate("matter_firstout not in", values, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_firstout between", value1, value2, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterFirstoutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_firstout not between", value1, value2, "matterFirstout");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayIsNull() {
            addCriterion("matter_appearstartday is null");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayIsNotNull() {
            addCriterion("matter_appearstartday is not null");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayEqualTo(Integer value) {
            addCriterion("matter_appearstartday =", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayNotEqualTo(Integer value) {
            addCriterion("matter_appearstartday <>", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayGreaterThan(Integer value) {
            addCriterion("matter_appearstartday >", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("matter_appearstartday >=", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayLessThan(Integer value) {
            addCriterion("matter_appearstartday <", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayLessThanOrEqualTo(Integer value) {
            addCriterion("matter_appearstartday <=", value, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayIn(List<Integer> values) {
            addCriterion("matter_appearstartday in", values, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayNotIn(List<Integer> values) {
            addCriterion("matter_appearstartday not in", values, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayBetween(Integer value1, Integer value2) {
            addCriterion("matter_appearstartday between", value1, value2, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterAppearstartdayNotBetween(Integer value1, Integer value2) {
            addCriterion("matter_appearstartday not between", value1, value2, "matterAppearstartday");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutIsNull() {
            addCriterion("matter_recentout is null");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutIsNotNull() {
            addCriterion("matter_recentout is not null");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentout =", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutNotEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentout <>", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutGreaterThan(Date value) {
            addCriterionForJDBCDate("matter_recentout >", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentout >=", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutLessThan(Date value) {
            addCriterionForJDBCDate("matter_recentout <", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentout <=", value, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutIn(List<Date> values) {
            addCriterionForJDBCDate("matter_recentout in", values, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutNotIn(List<Date> values) {
            addCriterionForJDBCDate("matter_recentout not in", values, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_recentout between", value1, value2, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentoutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_recentout not between", value1, value2, "matterRecentout");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinIsNull() {
            addCriterion("matter_recentin is null");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinIsNotNull() {
            addCriterion("matter_recentin is not null");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentin =", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinNotEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentin <>", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinGreaterThan(Date value) {
            addCriterionForJDBCDate("matter_recentin >", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentin >=", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinLessThan(Date value) {
            addCriterionForJDBCDate("matter_recentin <", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_recentin <=", value, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinIn(List<Date> values) {
            addCriterionForJDBCDate("matter_recentin in", values, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinNotIn(List<Date> values) {
            addCriterionForJDBCDate("matter_recentin not in", values, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_recentin between", value1, value2, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterRecentinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_recentin not between", value1, value2, "matterRecentin");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateIsNull() {
            addCriterion("matter_stopdate is null");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateIsNotNull() {
            addCriterion("matter_stopdate is not null");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateEqualTo(Date value) {
            addCriterionForJDBCDate("matter_stopdate =", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("matter_stopdate <>", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateGreaterThan(Date value) {
            addCriterionForJDBCDate("matter_stopdate >", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_stopdate >=", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateLessThan(Date value) {
            addCriterionForJDBCDate("matter_stopdate <", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("matter_stopdate <=", value, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateIn(List<Date> values) {
            addCriterionForJDBCDate("matter_stopdate in", values, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("matter_stopdate not in", values, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_stopdate between", value1, value2, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterStopdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("matter_stopdate not between", value1, value2, "matterStopdate");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1IsNull() {
            addCriterion("matter_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1IsNotNull() {
            addCriterion("matter_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1EqualTo(String value) {
            addCriterion("matter_custom1 =", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1NotEqualTo(String value) {
            addCriterion("matter_custom1 <>", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1GreaterThan(String value) {
            addCriterion("matter_custom1 >", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("matter_custom1 >=", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1LessThan(String value) {
            addCriterion("matter_custom1 <", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1LessThanOrEqualTo(String value) {
            addCriterion("matter_custom1 <=", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1Like(String value) {
            addCriterion("matter_custom1 like", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1NotLike(String value) {
            addCriterion("matter_custom1 not like", value, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1In(List<String> values) {
            addCriterion("matter_custom1 in", values, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1NotIn(List<String> values) {
            addCriterion("matter_custom1 not in", values, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1Between(String value1, String value2) {
            addCriterion("matter_custom1 between", value1, value2, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom1NotBetween(String value1, String value2) {
            addCriterion("matter_custom1 not between", value1, value2, "matterCustom1");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2IsNull() {
            addCriterion("matter_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2IsNotNull() {
            addCriterion("matter_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2EqualTo(String value) {
            addCriterion("matter_custom2 =", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2NotEqualTo(String value) {
            addCriterion("matter_custom2 <>", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2GreaterThan(String value) {
            addCriterion("matter_custom2 >", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("matter_custom2 >=", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2LessThan(String value) {
            addCriterion("matter_custom2 <", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2LessThanOrEqualTo(String value) {
            addCriterion("matter_custom2 <=", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2Like(String value) {
            addCriterion("matter_custom2 like", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2NotLike(String value) {
            addCriterion("matter_custom2 not like", value, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2In(List<String> values) {
            addCriterion("matter_custom2 in", values, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2NotIn(List<String> values) {
            addCriterion("matter_custom2 not in", values, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2Between(String value1, String value2) {
            addCriterion("matter_custom2 between", value1, value2, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterCustom2NotBetween(String value1, String value2) {
            addCriterion("matter_custom2 not between", value1, value2, "matterCustom2");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationIsNull() {
            addCriterion("matter_mdecoration is null");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationIsNotNull() {
            addCriterion("matter_mdecoration is not null");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationEqualTo(String value) {
            addCriterion("matter_mdecoration =", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationNotEqualTo(String value) {
            addCriterion("matter_mdecoration <>", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationGreaterThan(String value) {
            addCriterion("matter_mdecoration >", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationGreaterThanOrEqualTo(String value) {
            addCriterion("matter_mdecoration >=", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationLessThan(String value) {
            addCriterion("matter_mdecoration <", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationLessThanOrEqualTo(String value) {
            addCriterion("matter_mdecoration <=", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationLike(String value) {
            addCriterion("matter_mdecoration like", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationNotLike(String value) {
            addCriterion("matter_mdecoration not like", value, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationIn(List<String> values) {
            addCriterion("matter_mdecoration in", values, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationNotIn(List<String> values) {
            addCriterion("matter_mdecoration not in", values, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationBetween(String value1, String value2) {
            addCriterion("matter_mdecoration between", value1, value2, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterMdecorationNotBetween(String value1, String value2) {
            addCriterion("matter_mdecoration not between", value1, value2, "matterMdecoration");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingIsNull() {
            addCriterion("matter_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingIsNotNull() {
            addCriterion("matter_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingEqualTo(String value) {
            addCriterion("matter_Auditing =", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingNotEqualTo(String value) {
            addCriterion("matter_Auditing <>", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingGreaterThan(String value) {
            addCriterion("matter_Auditing >", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("matter_Auditing >=", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingLessThan(String value) {
            addCriterion("matter_Auditing <", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingLessThanOrEqualTo(String value) {
            addCriterion("matter_Auditing <=", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingLike(String value) {
            addCriterion("matter_Auditing like", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingNotLike(String value) {
            addCriterion("matter_Auditing not like", value, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingIn(List<String> values) {
            addCriterion("matter_Auditing in", values, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingNotIn(List<String> values) {
            addCriterion("matter_Auditing not in", values, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingBetween(String value1, String value2) {
            addCriterion("matter_Auditing between", value1, value2, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterAuditingNotBetween(String value1, String value2) {
            addCriterion("matter_Auditing not between", value1, value2, "matterAuditing");
            return (Criteria) this;
        }

        public Criteria andMatterYnIsNull() {
            addCriterion("matter_yn is null");
            return (Criteria) this;
        }

        public Criteria andMatterYnIsNotNull() {
            addCriterion("matter_yn is not null");
            return (Criteria) this;
        }

        public Criteria andMatterYnEqualTo(String value) {
            addCriterion("matter_yn =", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnNotEqualTo(String value) {
            addCriterion("matter_yn <>", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnGreaterThan(String value) {
            addCriterion("matter_yn >", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnGreaterThanOrEqualTo(String value) {
            addCriterion("matter_yn >=", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnLessThan(String value) {
            addCriterion("matter_yn <", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnLessThanOrEqualTo(String value) {
            addCriterion("matter_yn <=", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnLike(String value) {
            addCriterion("matter_yn like", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnNotLike(String value) {
            addCriterion("matter_yn not like", value, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnIn(List<String> values) {
            addCriterion("matter_yn in", values, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnNotIn(List<String> values) {
            addCriterion("matter_yn not in", values, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnBetween(String value1, String value2) {
            addCriterion("matter_yn between", value1, value2, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterYnNotBetween(String value1, String value2) {
            addCriterion("matter_yn not between", value1, value2, "matterYn");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1IsNull() {
            addCriterion("matter_prepare1 is null");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1IsNotNull() {
            addCriterion("matter_prepare1 is not null");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1EqualTo(String value) {
            addCriterion("matter_prepare1 =", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1NotEqualTo(String value) {
            addCriterion("matter_prepare1 <>", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1GreaterThan(String value) {
            addCriterion("matter_prepare1 >", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1GreaterThanOrEqualTo(String value) {
            addCriterion("matter_prepare1 >=", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1LessThan(String value) {
            addCriterion("matter_prepare1 <", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1LessThanOrEqualTo(String value) {
            addCriterion("matter_prepare1 <=", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1Like(String value) {
            addCriterion("matter_prepare1 like", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1NotLike(String value) {
            addCriterion("matter_prepare1 not like", value, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1In(List<String> values) {
            addCriterion("matter_prepare1 in", values, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1NotIn(List<String> values) {
            addCriterion("matter_prepare1 not in", values, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1Between(String value1, String value2) {
            addCriterion("matter_prepare1 between", value1, value2, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare1NotBetween(String value1, String value2) {
            addCriterion("matter_prepare1 not between", value1, value2, "matterPrepare1");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2IsNull() {
            addCriterion("matter_prepare2 is null");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2IsNotNull() {
            addCriterion("matter_prepare2 is not null");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2EqualTo(String value) {
            addCriterion("matter_prepare2 =", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2NotEqualTo(String value) {
            addCriterion("matter_prepare2 <>", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2GreaterThan(String value) {
            addCriterion("matter_prepare2 >", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2GreaterThanOrEqualTo(String value) {
            addCriterion("matter_prepare2 >=", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2LessThan(String value) {
            addCriterion("matter_prepare2 <", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2LessThanOrEqualTo(String value) {
            addCriterion("matter_prepare2 <=", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2Like(String value) {
            addCriterion("matter_prepare2 like", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2NotLike(String value) {
            addCriterion("matter_prepare2 not like", value, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2In(List<String> values) {
            addCriterion("matter_prepare2 in", values, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2NotIn(List<String> values) {
            addCriterion("matter_prepare2 not in", values, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2Between(String value1, String value2) {
            addCriterion("matter_prepare2 between", value1, value2, "matterPrepare2");
            return (Criteria) this;
        }

        public Criteria andMatterPrepare2NotBetween(String value1, String value2) {
            addCriterion("matter_prepare2 not between", value1, value2, "matterPrepare2");
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