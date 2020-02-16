package com.factory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameIsNull() {
            addCriterion("staff_english_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameIsNotNull() {
            addCriterion("staff_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameEqualTo(String value) {
            addCriterion("staff_english_name =", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameNotEqualTo(String value) {
            addCriterion("staff_english_name <>", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameGreaterThan(String value) {
            addCriterion("staff_english_name >", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_english_name >=", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameLessThan(String value) {
            addCriterion("staff_english_name <", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("staff_english_name <=", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameLike(String value) {
            addCriterion("staff_english_name like", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameNotLike(String value) {
            addCriterion("staff_english_name not like", value, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameIn(List<String> values) {
            addCriterion("staff_english_name in", values, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameNotIn(List<String> values) {
            addCriterion("staff_english_name not in", values, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameBetween(String value1, String value2) {
            addCriterion("staff_english_name between", value1, value2, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishNameNotBetween(String value1, String value2) {
            addCriterion("staff_english_name not between", value1, value2, "staffEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNull() {
            addCriterion("staff_gender is null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNotNull() {
            addCriterion("staff_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderEqualTo(Boolean value) {
            addCriterion("staff_gender =", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotEqualTo(Boolean value) {
            addCriterion("staff_gender <>", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThan(Boolean value) {
            addCriterion("staff_gender >", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("staff_gender >=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThan(Boolean value) {
            addCriterion("staff_gender <", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("staff_gender <=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIn(List<Boolean> values) {
            addCriterion("staff_gender in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotIn(List<Boolean> values) {
            addCriterion("staff_gender not in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("staff_gender between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("staff_gender not between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberIsNull() {
            addCriterion("staff_idnumber is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberIsNotNull() {
            addCriterion("staff_idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberEqualTo(String value) {
            addCriterion("staff_idnumber =", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberNotEqualTo(String value) {
            addCriterion("staff_idnumber <>", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberGreaterThan(String value) {
            addCriterion("staff_idnumber >", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("staff_idnumber >=", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberLessThan(String value) {
            addCriterion("staff_idnumber <", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberLessThanOrEqualTo(String value) {
            addCriterion("staff_idnumber <=", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberLike(String value) {
            addCriterion("staff_idnumber like", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberNotLike(String value) {
            addCriterion("staff_idnumber not like", value, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberIn(List<String> values) {
            addCriterion("staff_idnumber in", values, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberNotIn(List<String> values) {
            addCriterion("staff_idnumber not in", values, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberBetween(String value1, String value2) {
            addCriterion("staff_idnumber between", value1, value2, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andStaffIdnumberNotBetween(String value1, String value2) {
            addCriterion("staff_idnumber not between", value1, value2, "staffIdnumber");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNull() {
            addCriterion("staff_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNotNull() {
            addCriterion("staff_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("staff_birthday =", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_birthday <>", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_birthday >", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_birthday >=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("staff_birthday <", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_birthday <=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("staff_birthday in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_birthday not in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_birthday between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_birthday not between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusIsNull() {
            addCriterion("staff_maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusIsNotNull() {
            addCriterion("staff_maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusEqualTo(Integer value) {
            addCriterion("staff_maritalstatus =", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusNotEqualTo(Integer value) {
            addCriterion("staff_maritalstatus <>", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusGreaterThan(Integer value) {
            addCriterion("staff_maritalstatus >", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_maritalstatus >=", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusLessThan(Integer value) {
            addCriterion("staff_maritalstatus <", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusLessThanOrEqualTo(Integer value) {
            addCriterion("staff_maritalstatus <=", value, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusIn(List<Integer> values) {
            addCriterion("staff_maritalstatus in", values, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusNotIn(List<Integer> values) {
            addCriterion("staff_maritalstatus not in", values, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusBetween(Integer value1, Integer value2) {
            addCriterion("staff_maritalstatus between", value1, value2, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffMaritalstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_maritalstatus not between", value1, value2, "staffMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIsNull() {
            addCriterion("staff_native_place is null");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIsNotNull() {
            addCriterion("staff_native_place is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceEqualTo(Integer value) {
            addCriterion("staff_native_place =", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotEqualTo(Integer value) {
            addCriterion("staff_native_place <>", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceGreaterThan(Integer value) {
            addCriterion("staff_native_place >", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_native_place >=", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceLessThan(Integer value) {
            addCriterion("staff_native_place <", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceLessThanOrEqualTo(Integer value) {
            addCriterion("staff_native_place <=", value, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceIn(List<Integer> values) {
            addCriterion("staff_native_place in", values, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotIn(List<Integer> values) {
            addCriterion("staff_native_place not in", values, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceBetween(Integer value1, Integer value2) {
            addCriterion("staff_native_place between", value1, value2, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativePlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_native_place not between", value1, value2, "staffNativePlace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceIsNull() {
            addCriterion("staff_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceIsNotNull() {
            addCriterion("staff_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceEqualTo(String value) {
            addCriterion("staff_nativeplace =", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceNotEqualTo(String value) {
            addCriterion("staff_nativeplace <>", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceGreaterThan(String value) {
            addCriterion("staff_nativeplace >", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("staff_nativeplace >=", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceLessThan(String value) {
            addCriterion("staff_nativeplace <", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("staff_nativeplace <=", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceLike(String value) {
            addCriterion("staff_nativeplace like", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceNotLike(String value) {
            addCriterion("staff_nativeplace not like", value, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceIn(List<String> values) {
            addCriterion("staff_nativeplace in", values, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceNotIn(List<String> values) {
            addCriterion("staff_nativeplace not in", values, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceBetween(String value1, String value2) {
            addCriterion("staff_nativeplace between", value1, value2, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNativeplaceNotBetween(String value1, String value2) {
            addCriterion("staff_nativeplace not between", value1, value2, "staffNativeplace");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityIsNull() {
            addCriterion("staff_nationality is null");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityIsNotNull() {
            addCriterion("staff_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityEqualTo(String value) {
            addCriterion("staff_nationality =", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityNotEqualTo(String value) {
            addCriterion("staff_nationality <>", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityGreaterThan(String value) {
            addCriterion("staff_nationality >", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("staff_nationality >=", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityLessThan(String value) {
            addCriterion("staff_nationality <", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityLessThanOrEqualTo(String value) {
            addCriterion("staff_nationality <=", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityLike(String value) {
            addCriterion("staff_nationality like", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityNotLike(String value) {
            addCriterion("staff_nationality not like", value, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityIn(List<String> values) {
            addCriterion("staff_nationality in", values, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityNotIn(List<String> values) {
            addCriterion("staff_nationality not in", values, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityBetween(String value1, String value2) {
            addCriterion("staff_nationality between", value1, value2, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationalityNotBetween(String value1, String value2) {
            addCriterion("staff_nationality not between", value1, value2, "staffNationality");
            return (Criteria) this;
        }

        public Criteria andStaffNationIsNull() {
            addCriterion("staff_nation is null");
            return (Criteria) this;
        }

        public Criteria andStaffNationIsNotNull() {
            addCriterion("staff_nation is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNationEqualTo(String value) {
            addCriterion("staff_nation =", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationNotEqualTo(String value) {
            addCriterion("staff_nation <>", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationGreaterThan(String value) {
            addCriterion("staff_nation >", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationGreaterThanOrEqualTo(String value) {
            addCriterion("staff_nation >=", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationLessThan(String value) {
            addCriterion("staff_nation <", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationLessThanOrEqualTo(String value) {
            addCriterion("staff_nation <=", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationLike(String value) {
            addCriterion("staff_nation like", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationNotLike(String value) {
            addCriterion("staff_nation not like", value, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationIn(List<String> values) {
            addCriterion("staff_nation in", values, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationNotIn(List<String> values) {
            addCriterion("staff_nation not in", values, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationBetween(String value1, String value2) {
            addCriterion("staff_nation between", value1, value2, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffNationNotBetween(String value1, String value2) {
            addCriterion("staff_nation not between", value1, value2, "staffNation");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionIsNull() {
            addCriterion("staff_chineseposition is null");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionIsNotNull() {
            addCriterion("staff_chineseposition is not null");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionEqualTo(String value) {
            addCriterion("staff_chineseposition =", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionNotEqualTo(String value) {
            addCriterion("staff_chineseposition <>", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionGreaterThan(String value) {
            addCriterion("staff_chineseposition >", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionGreaterThanOrEqualTo(String value) {
            addCriterion("staff_chineseposition >=", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionLessThan(String value) {
            addCriterion("staff_chineseposition <", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionLessThanOrEqualTo(String value) {
            addCriterion("staff_chineseposition <=", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionLike(String value) {
            addCriterion("staff_chineseposition like", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionNotLike(String value) {
            addCriterion("staff_chineseposition not like", value, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionIn(List<String> values) {
            addCriterion("staff_chineseposition in", values, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionNotIn(List<String> values) {
            addCriterion("staff_chineseposition not in", values, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionBetween(String value1, String value2) {
            addCriterion("staff_chineseposition between", value1, value2, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffChinesepositionNotBetween(String value1, String value2) {
            addCriterion("staff_chineseposition not between", value1, value2, "staffChineseposition");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeIsNull() {
            addCriterion("staff_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeIsNotNull() {
            addCriterion("staff_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeEqualTo(String value) {
            addCriterion("staff_zipcode =", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeNotEqualTo(String value) {
            addCriterion("staff_zipcode <>", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeGreaterThan(String value) {
            addCriterion("staff_zipcode >", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_zipcode >=", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeLessThan(String value) {
            addCriterion("staff_zipcode <", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeLessThanOrEqualTo(String value) {
            addCriterion("staff_zipcode <=", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeLike(String value) {
            addCriterion("staff_zipcode like", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeNotLike(String value) {
            addCriterion("staff_zipcode not like", value, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeIn(List<String> values) {
            addCriterion("staff_zipcode in", values, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeNotIn(List<String> values) {
            addCriterion("staff_zipcode not in", values, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeBetween(String value1, String value2) {
            addCriterion("staff_zipcode between", value1, value2, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffZipcodeNotBetween(String value1, String value2) {
            addCriterion("staff_zipcode not between", value1, value2, "staffZipcode");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneIsNull() {
            addCriterion("staff_Mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneIsNotNull() {
            addCriterion("staff_Mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneEqualTo(String value) {
            addCriterion("staff_Mobilephone =", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneNotEqualTo(String value) {
            addCriterion("staff_Mobilephone <>", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneGreaterThan(String value) {
            addCriterion("staff_Mobilephone >", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_Mobilephone >=", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneLessThan(String value) {
            addCriterion("staff_Mobilephone <", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("staff_Mobilephone <=", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneLike(String value) {
            addCriterion("staff_Mobilephone like", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneNotLike(String value) {
            addCriterion("staff_Mobilephone not like", value, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneIn(List<String> values) {
            addCriterion("staff_Mobilephone in", values, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneNotIn(List<String> values) {
            addCriterion("staff_Mobilephone not in", values, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneBetween(String value1, String value2) {
            addCriterion("staff_Mobilephone between", value1, value2, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffMobilephoneNotBetween(String value1, String value2) {
            addCriterion("staff_Mobilephone not between", value1, value2, "staffMobilephone");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusIsNull() {
            addCriterion("staff_politicalstatus is null");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusIsNotNull() {
            addCriterion("staff_politicalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusEqualTo(String value) {
            addCriterion("staff_politicalstatus =", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusNotEqualTo(String value) {
            addCriterion("staff_politicalstatus <>", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusGreaterThan(String value) {
            addCriterion("staff_politicalstatus >", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("staff_politicalstatus >=", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusLessThan(String value) {
            addCriterion("staff_politicalstatus <", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusLessThanOrEqualTo(String value) {
            addCriterion("staff_politicalstatus <=", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusLike(String value) {
            addCriterion("staff_politicalstatus like", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusNotLike(String value) {
            addCriterion("staff_politicalstatus not like", value, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusIn(List<String> values) {
            addCriterion("staff_politicalstatus in", values, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusNotIn(List<String> values) {
            addCriterion("staff_politicalstatus not in", values, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusBetween(String value1, String value2) {
            addCriterion("staff_politicalstatus between", value1, value2, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffPoliticalstatusNotBetween(String value1, String value2) {
            addCriterion("staff_politicalstatus not between", value1, value2, "staffPoliticalstatus");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateIsNull() {
            addCriterion("staff_entrydate is null");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateIsNotNull() {
            addCriterion("staff_entrydate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entrydate =", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entrydate <>", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_entrydate >", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entrydate >=", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateLessThan(Date value) {
            addCriterionForJDBCDate("staff_entrydate <", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entrydate <=", value, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_entrydate in", values, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_entrydate not in", values, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_entrydate between", value1, value2, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntrydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_entrydate not between", value1, value2, "staffEntrydate");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerIsNull() {
            addCriterion("\"staff_becomea regularworker\" is null");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerIsNotNull() {
            addCriterion("\"staff_becomea regularworker\" is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" =", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerNotEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" <>", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerGreaterThan(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" >", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" >=", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerLessThan(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" <", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" <=", value, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerIn(List<Date> values) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" in", values, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerNotIn(List<Date> values) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" not in", values, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" between", value1, value2, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffBecomeaRegularworkerNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"staff_becomea regularworker\" not between", value1, value2, "staffBecomeaRegularworker");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodIsNull() {
            addCriterion("staff_probationperiod is null");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodIsNotNull() {
            addCriterion("staff_probationperiod is not null");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodEqualTo(String value) {
            addCriterion("staff_probationperiod =", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodNotEqualTo(String value) {
            addCriterion("staff_probationperiod <>", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodGreaterThan(String value) {
            addCriterion("staff_probationperiod >", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodGreaterThanOrEqualTo(String value) {
            addCriterion("staff_probationperiod >=", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodLessThan(String value) {
            addCriterion("staff_probationperiod <", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodLessThanOrEqualTo(String value) {
            addCriterion("staff_probationperiod <=", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodLike(String value) {
            addCriterion("staff_probationperiod like", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodNotLike(String value) {
            addCriterion("staff_probationperiod not like", value, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodIn(List<String> values) {
            addCriterion("staff_probationperiod in", values, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodNotIn(List<String> values) {
            addCriterion("staff_probationperiod not in", values, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodBetween(String value1, String value2) {
            addCriterion("staff_probationperiod between", value1, value2, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffProbationperiodNotBetween(String value1, String value2) {
            addCriterion("staff_probationperiod not between", value1, value2, "staffProbationperiod");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateIsNull() {
            addCriterion("staff_dimissiondate is null");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateIsNotNull() {
            addCriterion("staff_dimissiondate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate =", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate <>", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate >", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate >=", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateLessThan(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate <", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_dimissiondate <=", value, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_dimissiondate in", values, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_dimissiondate not in", values, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_dimissiondate between", value1, value2, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffDimissiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_dimissiondate not between", value1, value2, "staffDimissiondate");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleIsNull() {
            addCriterion("staff_technicaltitle is null");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleIsNotNull() {
            addCriterion("staff_technicaltitle is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleEqualTo(String value) {
            addCriterion("staff_technicaltitle =", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleNotEqualTo(String value) {
            addCriterion("staff_technicaltitle <>", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleGreaterThan(String value) {
            addCriterion("staff_technicaltitle >", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleGreaterThanOrEqualTo(String value) {
            addCriterion("staff_technicaltitle >=", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleLessThan(String value) {
            addCriterion("staff_technicaltitle <", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleLessThanOrEqualTo(String value) {
            addCriterion("staff_technicaltitle <=", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleLike(String value) {
            addCriterion("staff_technicaltitle like", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleNotLike(String value) {
            addCriterion("staff_technicaltitle not like", value, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleIn(List<String> values) {
            addCriterion("staff_technicaltitle in", values, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleNotIn(List<String> values) {
            addCriterion("staff_technicaltitle not in", values, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleBetween(String value1, String value2) {
            addCriterion("staff_technicaltitle between", value1, value2, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffTechnicaltitleNotBetween(String value1, String value2) {
            addCriterion("staff_technicaltitle not between", value1, value2, "staffTechnicaltitle");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionIsNull() {
            addCriterion("staff_englishposition is null");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionIsNotNull() {
            addCriterion("staff_englishposition is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionEqualTo(String value) {
            addCriterion("staff_englishposition =", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionNotEqualTo(String value) {
            addCriterion("staff_englishposition <>", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionGreaterThan(String value) {
            addCriterion("staff_englishposition >", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionGreaterThanOrEqualTo(String value) {
            addCriterion("staff_englishposition >=", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionLessThan(String value) {
            addCriterion("staff_englishposition <", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionLessThanOrEqualTo(String value) {
            addCriterion("staff_englishposition <=", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionLike(String value) {
            addCriterion("staff_englishposition like", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionNotLike(String value) {
            addCriterion("staff_englishposition not like", value, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionIn(List<String> values) {
            addCriterion("staff_englishposition in", values, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionNotIn(List<String> values) {
            addCriterion("staff_englishposition not in", values, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionBetween(String value1, String value2) {
            addCriterion("staff_englishposition between", value1, value2, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffEnglishpositionNotBetween(String value1, String value2) {
            addCriterion("staff_englishposition not between", value1, value2, "staffEnglishposition");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNull() {
            addCriterion("staff_address is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNotNull() {
            addCriterion("staff_address is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressEqualTo(String value) {
            addCriterion("staff_address =", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotEqualTo(String value) {
            addCriterion("staff_address <>", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThan(String value) {
            addCriterion("staff_address >", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_address >=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThan(String value) {
            addCriterion("staff_address <", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThanOrEqualTo(String value) {
            addCriterion("staff_address <=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLike(String value) {
            addCriterion("staff_address like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotLike(String value) {
            addCriterion("staff_address not like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIn(List<String> values) {
            addCriterion("staff_address in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotIn(List<String> values) {
            addCriterion("staff_address not in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressBetween(String value1, String value2) {
            addCriterion("staff_address between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotBetween(String value1, String value2) {
            addCriterion("staff_address not between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationIsNull() {
            addCriterion("staff_highesteducation is null");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationIsNotNull() {
            addCriterion("staff_highesteducation is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationEqualTo(String value) {
            addCriterion("staff_highesteducation =", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationNotEqualTo(String value) {
            addCriterion("staff_highesteducation <>", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationGreaterThan(String value) {
            addCriterion("staff_highesteducation >", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationGreaterThanOrEqualTo(String value) {
            addCriterion("staff_highesteducation >=", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationLessThan(String value) {
            addCriterion("staff_highesteducation <", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationLessThanOrEqualTo(String value) {
            addCriterion("staff_highesteducation <=", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationLike(String value) {
            addCriterion("staff_highesteducation like", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationNotLike(String value) {
            addCriterion("staff_highesteducation not like", value, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationIn(List<String> values) {
            addCriterion("staff_highesteducation in", values, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationNotIn(List<String> values) {
            addCriterion("staff_highesteducation not in", values, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationBetween(String value1, String value2) {
            addCriterion("staff_highesteducation between", value1, value2, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffHighesteducationNotBetween(String value1, String value2) {
            addCriterion("staff_highesteducation not between", value1, value2, "staffHighesteducation");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeIsNull() {
            addCriterion("staff_degree is null");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeIsNotNull() {
            addCriterion("staff_degree is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeEqualTo(String value) {
            addCriterion("staff_degree =", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeNotEqualTo(String value) {
            addCriterion("staff_degree <>", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeGreaterThan(String value) {
            addCriterion("staff_degree >", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_degree >=", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeLessThan(String value) {
            addCriterion("staff_degree <", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeLessThanOrEqualTo(String value) {
            addCriterion("staff_degree <=", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeLike(String value) {
            addCriterion("staff_degree like", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeNotLike(String value) {
            addCriterion("staff_degree not like", value, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeIn(List<String> values) {
            addCriterion("staff_degree in", values, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeNotIn(List<String> values) {
            addCriterion("staff_degree not in", values, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeBetween(String value1, String value2) {
            addCriterion("staff_degree between", value1, value2, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffDegreeNotBetween(String value1, String value2) {
            addCriterion("staff_degree not between", value1, value2, "staffDegree");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolIsNull() {
            addCriterion("staff_graduateschool is null");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolIsNotNull() {
            addCriterion("staff_graduateschool is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolEqualTo(String value) {
            addCriterion("staff_graduateschool =", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolNotEqualTo(String value) {
            addCriterion("staff_graduateschool <>", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolGreaterThan(String value) {
            addCriterion("staff_graduateschool >", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("staff_graduateschool >=", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolLessThan(String value) {
            addCriterion("staff_graduateschool <", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("staff_graduateschool <=", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolLike(String value) {
            addCriterion("staff_graduateschool like", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolNotLike(String value) {
            addCriterion("staff_graduateschool not like", value, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolIn(List<String> values) {
            addCriterion("staff_graduateschool in", values, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolNotIn(List<String> values) {
            addCriterion("staff_graduateschool not in", values, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolBetween(String value1, String value2) {
            addCriterion("staff_graduateschool between", value1, value2, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("staff_graduateschool not between", value1, value2, "staffGraduateschool");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIsNull() {
            addCriterion("staff_major is null");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIsNotNull() {
            addCriterion("staff_major is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMajorEqualTo(String value) {
            addCriterion("staff_major =", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotEqualTo(String value) {
            addCriterion("staff_major <>", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorGreaterThan(String value) {
            addCriterion("staff_major >", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorGreaterThanOrEqualTo(String value) {
            addCriterion("staff_major >=", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLessThan(String value) {
            addCriterion("staff_major <", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLessThanOrEqualTo(String value) {
            addCriterion("staff_major <=", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLike(String value) {
            addCriterion("staff_major like", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotLike(String value) {
            addCriterion("staff_major not like", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIn(List<String> values) {
            addCriterion("staff_major in", values, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotIn(List<String> values) {
            addCriterion("staff_major not in", values, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorBetween(String value1, String value2) {
            addCriterion("staff_major between", value1, value2, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotBetween(String value1, String value2) {
            addCriterion("staff_major not between", value1, value2, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelIsNull() {
            addCriterion("staff_foreignlanguagelevel is null");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelIsNotNull() {
            addCriterion("staff_foreignlanguagelevel is not null");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelEqualTo(String value) {
            addCriterion("staff_foreignlanguagelevel =", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelNotEqualTo(String value) {
            addCriterion("staff_foreignlanguagelevel <>", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelGreaterThan(String value) {
            addCriterion("staff_foreignlanguagelevel >", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_foreignlanguagelevel >=", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelLessThan(String value) {
            addCriterion("staff_foreignlanguagelevel <", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelLessThanOrEqualTo(String value) {
            addCriterion("staff_foreignlanguagelevel <=", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelLike(String value) {
            addCriterion("staff_foreignlanguagelevel like", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelNotLike(String value) {
            addCriterion("staff_foreignlanguagelevel not like", value, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelIn(List<String> values) {
            addCriterion("staff_foreignlanguagelevel in", values, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelNotIn(List<String> values) {
            addCriterion("staff_foreignlanguagelevel not in", values, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelBetween(String value1, String value2) {
            addCriterion("staff_foreignlanguagelevel between", value1, value2, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffForeignlanguagelevelNotBetween(String value1, String value2) {
            addCriterion("staff_foreignlanguagelevel not between", value1, value2, "staffForeignlanguagelevel");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateIsNull() {
            addCriterion("\"staff_physical examinationdate\" is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateIsNotNull() {
            addCriterion("\"staff_physical examinationdate\" is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" =", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" <>", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" >", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" >=", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateLessThan(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" <", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" <=", value, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateIn(List<Date> values) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" in", values, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" not in", values, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" between", value1, value2, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffPhysicalExaminationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"staff_physical examinationdate\" not between", value1, value2, "staffPhysicalExaminationdate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateIsNull() {
            addCriterion("staff_atmaturitydate is null");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateIsNotNull() {
            addCriterion("staff_atmaturitydate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate =", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate <>", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate >", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate >=", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateLessThan(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate <", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_atmaturitydate <=", value, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_atmaturitydate in", values, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_atmaturitydate not in", values, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_atmaturitydate between", value1, value2, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffAtmaturitydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_atmaturitydate not between", value1, value2, "staffAtmaturitydate");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryIsNull() {
            addCriterion("staff_entercountry is null");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryIsNotNull() {
            addCriterion("staff_entercountry is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entercountry =", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entercountry <>", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_entercountry >", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entercountry >=", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryLessThan(Date value) {
            addCriterionForJDBCDate("staff_entercountry <", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_entercountry <=", value, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryIn(List<Date> values) {
            addCriterionForJDBCDate("staff_entercountry in", values, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_entercountry not in", values, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_entercountry between", value1, value2, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffEntercountryNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_entercountry not between", value1, value2, "staffEntercountry");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberIsNull() {
            addCriterion("staff_passport_number is null");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberIsNotNull() {
            addCriterion("staff_passport_number is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberEqualTo(String value) {
            addCriterion("staff_passport_number =", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberNotEqualTo(String value) {
            addCriterion("staff_passport_number <>", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberGreaterThan(String value) {
            addCriterion("staff_passport_number >", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("staff_passport_number >=", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberLessThan(String value) {
            addCriterion("staff_passport_number <", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberLessThanOrEqualTo(String value) {
            addCriterion("staff_passport_number <=", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberLike(String value) {
            addCriterion("staff_passport_number like", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberNotLike(String value) {
            addCriterion("staff_passport_number not like", value, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberIn(List<String> values) {
            addCriterion("staff_passport_number in", values, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberNotIn(List<String> values) {
            addCriterion("staff_passport_number not in", values, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberBetween(String value1, String value2) {
            addCriterion("staff_passport_number between", value1, value2, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPassportNumberNotBetween(String value1, String value2) {
            addCriterion("staff_passport_number not between", value1, value2, "staffPassportNumber");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateIsNull() {
            addCriterion("staff_contractstartdate is null");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateIsNotNull() {
            addCriterion("staff_contractstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate =", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate <>", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate >", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate >=", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateLessThan(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate <", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractstartdate <=", value, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_contractstartdate in", values, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_contractstartdate not in", values, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_contractstartdate between", value1, value2, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_contractstartdate not between", value1, value2, "staffContractstartdate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateIsNull() {
            addCriterion("staff_contractenddate is null");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateIsNotNull() {
            addCriterion("staff_contractenddate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractenddate =", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractenddate <>", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_contractenddate >", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractenddate >=", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateLessThan(Date value) {
            addCriterionForJDBCDate("staff_contractenddate <", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_contractenddate <=", value, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_contractenddate in", values, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_contractenddate not in", values, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_contractenddate between", value1, value2, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_contractenddate not between", value1, value2, "staffContractenddate");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationIsNull() {
            addCriterion("staff_contractduration is null");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationIsNotNull() {
            addCriterion("staff_contractduration is not null");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationEqualTo(String value) {
            addCriterion("staff_contractduration =", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationNotEqualTo(String value) {
            addCriterion("staff_contractduration <>", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationGreaterThan(String value) {
            addCriterion("staff_contractduration >", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationGreaterThanOrEqualTo(String value) {
            addCriterion("staff_contractduration >=", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationLessThan(String value) {
            addCriterion("staff_contractduration <", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationLessThanOrEqualTo(String value) {
            addCriterion("staff_contractduration <=", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationLike(String value) {
            addCriterion("staff_contractduration like", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationNotLike(String value) {
            addCriterion("staff_contractduration not like", value, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationIn(List<String> values) {
            addCriterion("staff_contractduration in", values, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationNotIn(List<String> values) {
            addCriterion("staff_contractduration not in", values, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationBetween(String value1, String value2) {
            addCriterion("staff_contractduration between", value1, value2, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffContractdurationNotBetween(String value1, String value2) {
            addCriterion("staff_contractduration not between", value1, value2, "staffContractduration");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNull() {
            addCriterion("staff_email is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNotNull() {
            addCriterion("staff_email is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailEqualTo(String value) {
            addCriterion("staff_email =", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotEqualTo(String value) {
            addCriterion("staff_email <>", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThan(String value) {
            addCriterion("staff_email >", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThanOrEqualTo(String value) {
            addCriterion("staff_email >=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThan(String value) {
            addCriterion("staff_email <", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThanOrEqualTo(String value) {
            addCriterion("staff_email <=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLike(String value) {
            addCriterion("staff_email like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotLike(String value) {
            addCriterion("staff_email not like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIn(List<String> values) {
            addCriterion("staff_email in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotIn(List<String> values) {
            addCriterion("staff_email not in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailBetween(String value1, String value2) {
            addCriterion("staff_email between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotBetween(String value1, String value2) {
            addCriterion("staff_email not between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberIsNull() {
            addCriterion("staff_censusregisternumber is null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberIsNotNull() {
            addCriterion("staff_censusregisternumber is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberEqualTo(String value) {
            addCriterion("staff_censusregisternumber =", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberNotEqualTo(String value) {
            addCriterion("staff_censusregisternumber <>", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberGreaterThan(String value) {
            addCriterion("staff_censusregisternumber >", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberGreaterThanOrEqualTo(String value) {
            addCriterion("staff_censusregisternumber >=", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberLessThan(String value) {
            addCriterion("staff_censusregisternumber <", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberLessThanOrEqualTo(String value) {
            addCriterion("staff_censusregisternumber <=", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberLike(String value) {
            addCriterion("staff_censusregisternumber like", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberNotLike(String value) {
            addCriterion("staff_censusregisternumber not like", value, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberIn(List<String> values) {
            addCriterion("staff_censusregisternumber in", values, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberNotIn(List<String> values) {
            addCriterion("staff_censusregisternumber not in", values, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberBetween(String value1, String value2) {
            addCriterion("staff_censusregisternumber between", value1, value2, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisternumberNotBetween(String value1, String value2) {
            addCriterion("staff_censusregisternumber not between", value1, value2, "staffCensusregisternumber");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeIsNull() {
            addCriterion("staff_censusregistezipcode is null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeIsNotNull() {
            addCriterion("staff_censusregistezipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeEqualTo(String value) {
            addCriterion("staff_censusregistezipcode =", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeNotEqualTo(String value) {
            addCriterion("staff_censusregistezipcode <>", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeGreaterThan(String value) {
            addCriterion("staff_censusregistezipcode >", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_censusregistezipcode >=", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeLessThan(String value) {
            addCriterion("staff_censusregistezipcode <", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeLessThanOrEqualTo(String value) {
            addCriterion("staff_censusregistezipcode <=", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeLike(String value) {
            addCriterion("staff_censusregistezipcode like", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeNotLike(String value) {
            addCriterion("staff_censusregistezipcode not like", value, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeIn(List<String> values) {
            addCriterion("staff_censusregistezipcode in", values, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeNotIn(List<String> values) {
            addCriterion("staff_censusregistezipcode not in", values, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeBetween(String value1, String value2) {
            addCriterion("staff_censusregistezipcode between", value1, value2, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregistezipcodeNotBetween(String value1, String value2) {
            addCriterion("staff_censusregistezipcode not between", value1, value2, "staffCensusregistezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressIsNull() {
            addCriterion("staff_censusregisteraddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressIsNotNull() {
            addCriterion("staff_censusregisteraddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressEqualTo(String value) {
            addCriterion("staff_censusregisteraddress =", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressNotEqualTo(String value) {
            addCriterion("staff_censusregisteraddress <>", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressGreaterThan(String value) {
            addCriterion("staff_censusregisteraddress >", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_censusregisteraddress >=", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressLessThan(String value) {
            addCriterion("staff_censusregisteraddress <", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressLessThanOrEqualTo(String value) {
            addCriterion("staff_censusregisteraddress <=", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressLike(String value) {
            addCriterion("staff_censusregisteraddress like", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressNotLike(String value) {
            addCriterion("staff_censusregisteraddress not like", value, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressIn(List<String> values) {
            addCriterion("staff_censusregisteraddress in", values, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressNotIn(List<String> values) {
            addCriterion("staff_censusregisteraddress not in", values, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressBetween(String value1, String value2) {
            addCriterion("staff_censusregisteraddress between", value1, value2, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffCensusregisteraddressNotBetween(String value1, String value2) {
            addCriterion("staff_censusregisteraddress not between", value1, value2, "staffCensusregisteraddress");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneIsNull() {
            addCriterion("staff_hometelephone is null");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneIsNotNull() {
            addCriterion("staff_hometelephone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneEqualTo(String value) {
            addCriterion("staff_hometelephone =", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneNotEqualTo(String value) {
            addCriterion("staff_hometelephone <>", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneGreaterThan(String value) {
            addCriterion("staff_hometelephone >", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_hometelephone >=", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneLessThan(String value) {
            addCriterion("staff_hometelephone <", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneLessThanOrEqualTo(String value) {
            addCriterion("staff_hometelephone <=", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneLike(String value) {
            addCriterion("staff_hometelephone like", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneNotLike(String value) {
            addCriterion("staff_hometelephone not like", value, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneIn(List<String> values) {
            addCriterion("staff_hometelephone in", values, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneNotIn(List<String> values) {
            addCriterion("staff_hometelephone not in", values, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneBetween(String value1, String value2) {
            addCriterion("staff_hometelephone between", value1, value2, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHometelephoneNotBetween(String value1, String value2) {
            addCriterion("staff_hometelephone not between", value1, value2, "staffHometelephone");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeIsNull() {
            addCriterion("staff_homezipcode is null");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeIsNotNull() {
            addCriterion("staff_homezipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeEqualTo(String value) {
            addCriterion("staff_homezipcode =", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeNotEqualTo(String value) {
            addCriterion("staff_homezipcode <>", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeGreaterThan(String value) {
            addCriterion("staff_homezipcode >", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_homezipcode >=", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeLessThan(String value) {
            addCriterion("staff_homezipcode <", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeLessThanOrEqualTo(String value) {
            addCriterion("staff_homezipcode <=", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeLike(String value) {
            addCriterion("staff_homezipcode like", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeNotLike(String value) {
            addCriterion("staff_homezipcode not like", value, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeIn(List<String> values) {
            addCriterion("staff_homezipcode in", values, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeNotIn(List<String> values) {
            addCriterion("staff_homezipcode not in", values, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeBetween(String value1, String value2) {
            addCriterion("staff_homezipcode between", value1, value2, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomezipcodeNotBetween(String value1, String value2) {
            addCriterion("staff_homezipcode not between", value1, value2, "staffHomezipcode");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressIsNull() {
            addCriterion("staff_homeaddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressIsNotNull() {
            addCriterion("staff_homeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressEqualTo(String value) {
            addCriterion("staff_homeaddress =", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressNotEqualTo(String value) {
            addCriterion("staff_homeaddress <>", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressGreaterThan(String value) {
            addCriterion("staff_homeaddress >", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_homeaddress >=", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressLessThan(String value) {
            addCriterion("staff_homeaddress <", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("staff_homeaddress <=", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressLike(String value) {
            addCriterion("staff_homeaddress like", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressNotLike(String value) {
            addCriterion("staff_homeaddress not like", value, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressIn(List<String> values) {
            addCriterion("staff_homeaddress in", values, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressNotIn(List<String> values) {
            addCriterion("staff_homeaddress not in", values, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressBetween(String value1, String value2) {
            addCriterion("staff_homeaddress between", value1, value2, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffHomeaddressNotBetween(String value1, String value2) {
            addCriterion("staff_homeaddress not between", value1, value2, "staffHomeaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneIsNull() {
            addCriterion("staff_newphone is null");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneIsNotNull() {
            addCriterion("staff_newphone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneEqualTo(String value) {
            addCriterion("staff_newphone =", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneNotEqualTo(String value) {
            addCriterion("staff_newphone <>", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneGreaterThan(String value) {
            addCriterion("staff_newphone >", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_newphone >=", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneLessThan(String value) {
            addCriterion("staff_newphone <", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneLessThanOrEqualTo(String value) {
            addCriterion("staff_newphone <=", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneLike(String value) {
            addCriterion("staff_newphone like", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneNotLike(String value) {
            addCriterion("staff_newphone not like", value, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneIn(List<String> values) {
            addCriterion("staff_newphone in", values, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneNotIn(List<String> values) {
            addCriterion("staff_newphone not in", values, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneBetween(String value1, String value2) {
            addCriterion("staff_newphone between", value1, value2, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewphoneNotBetween(String value1, String value2) {
            addCriterion("staff_newphone not between", value1, value2, "staffNewphone");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeIsNull() {
            addCriterion("staff_newzipcode is null");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeIsNotNull() {
            addCriterion("staff_newzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeEqualTo(String value) {
            addCriterion("staff_newzipcode =", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeNotEqualTo(String value) {
            addCriterion("staff_newzipcode <>", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeGreaterThan(String value) {
            addCriterion("staff_newzipcode >", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_newzipcode >=", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeLessThan(String value) {
            addCriterion("staff_newzipcode <", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeLessThanOrEqualTo(String value) {
            addCriterion("staff_newzipcode <=", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeLike(String value) {
            addCriterion("staff_newzipcode like", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeNotLike(String value) {
            addCriterion("staff_newzipcode not like", value, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeIn(List<String> values) {
            addCriterion("staff_newzipcode in", values, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeNotIn(List<String> values) {
            addCriterion("staff_newzipcode not in", values, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeBetween(String value1, String value2) {
            addCriterion("staff_newzipcode between", value1, value2, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewzipcodeNotBetween(String value1, String value2) {
            addCriterion("staff_newzipcode not between", value1, value2, "staffNewzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressIsNull() {
            addCriterion("staff_newaddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressIsNotNull() {
            addCriterion("staff_newaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressEqualTo(String value) {
            addCriterion("staff_newaddress =", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressNotEqualTo(String value) {
            addCriterion("staff_newaddress <>", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressGreaterThan(String value) {
            addCriterion("staff_newaddress >", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_newaddress >=", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressLessThan(String value) {
            addCriterion("staff_newaddress <", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressLessThanOrEqualTo(String value) {
            addCriterion("staff_newaddress <=", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressLike(String value) {
            addCriterion("staff_newaddress like", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressNotLike(String value) {
            addCriterion("staff_newaddress not like", value, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressIn(List<String> values) {
            addCriterion("staff_newaddress in", values, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressNotIn(List<String> values) {
            addCriterion("staff_newaddress not in", values, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressBetween(String value1, String value2) {
            addCriterion("staff_newaddress between", value1, value2, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffNewaddressNotBetween(String value1, String value2) {
            addCriterion("staff_newaddress not between", value1, value2, "staffNewaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactIsNull() {
            addCriterion("staff_emergencycontact is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactIsNotNull() {
            addCriterion("staff_emergencycontact is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactEqualTo(String value) {
            addCriterion("staff_emergencycontact =", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactNotEqualTo(String value) {
            addCriterion("staff_emergencycontact <>", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactGreaterThan(String value) {
            addCriterion("staff_emergencycontact >", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontact >=", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactLessThan(String value) {
            addCriterion("staff_emergencycontact <", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontact <=", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactLike(String value) {
            addCriterion("staff_emergencycontact like", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactNotLike(String value) {
            addCriterion("staff_emergencycontact not like", value, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactIn(List<String> values) {
            addCriterion("staff_emergencycontact in", values, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactNotIn(List<String> values) {
            addCriterion("staff_emergencycontact not in", values, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactBetween(String value1, String value2) {
            addCriterion("staff_emergencycontact between", value1, value2, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("staff_emergencycontact not between", value1, value2, "staffEmergencycontact");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeIsNull() {
            addCriterion("staff_urgentcontactzipcode is null");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeIsNotNull() {
            addCriterion("staff_urgentcontactzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeEqualTo(String value) {
            addCriterion("staff_urgentcontactzipcode =", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeNotEqualTo(String value) {
            addCriterion("staff_urgentcontactzipcode <>", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeGreaterThan(String value) {
            addCriterion("staff_urgentcontactzipcode >", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_urgentcontactzipcode >=", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeLessThan(String value) {
            addCriterion("staff_urgentcontactzipcode <", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeLessThanOrEqualTo(String value) {
            addCriterion("staff_urgentcontactzipcode <=", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeLike(String value) {
            addCriterion("staff_urgentcontactzipcode like", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeNotLike(String value) {
            addCriterion("staff_urgentcontactzipcode not like", value, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeIn(List<String> values) {
            addCriterion("staff_urgentcontactzipcode in", values, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeNotIn(List<String> values) {
            addCriterion("staff_urgentcontactzipcode not in", values, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeBetween(String value1, String value2) {
            addCriterion("staff_urgentcontactzipcode between", value1, value2, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffUrgentcontactzipcodeNotBetween(String value1, String value2) {
            addCriterion("staff_urgentcontactzipcode not between", value1, value2, "staffUrgentcontactzipcode");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberIsNull() {
            addCriterion("staff_emergencycontactnumber is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberIsNotNull() {
            addCriterion("staff_emergencycontactnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberEqualTo(String value) {
            addCriterion("staff_emergencycontactnumber =", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberNotEqualTo(String value) {
            addCriterion("staff_emergencycontactnumber <>", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberGreaterThan(String value) {
            addCriterion("staff_emergencycontactnumber >", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontactnumber >=", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberLessThan(String value) {
            addCriterion("staff_emergencycontactnumber <", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberLessThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontactnumber <=", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberLike(String value) {
            addCriterion("staff_emergencycontactnumber like", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberNotLike(String value) {
            addCriterion("staff_emergencycontactnumber not like", value, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberIn(List<String> values) {
            addCriterion("staff_emergencycontactnumber in", values, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberNotIn(List<String> values) {
            addCriterion("staff_emergencycontactnumber not in", values, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberBetween(String value1, String value2) {
            addCriterion("staff_emergencycontactnumber between", value1, value2, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactnumberNotBetween(String value1, String value2) {
            addCriterion("staff_emergencycontactnumber not between", value1, value2, "staffEmergencycontactnumber");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressIsNull() {
            addCriterion("staff_emergencycontactaddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressIsNotNull() {
            addCriterion("staff_emergencycontactaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressEqualTo(String value) {
            addCriterion("staff_emergencycontactaddress =", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressNotEqualTo(String value) {
            addCriterion("staff_emergencycontactaddress <>", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressGreaterThan(String value) {
            addCriterion("staff_emergencycontactaddress >", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontactaddress >=", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressLessThan(String value) {
            addCriterion("staff_emergencycontactaddress <", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressLessThanOrEqualTo(String value) {
            addCriterion("staff_emergencycontactaddress <=", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressLike(String value) {
            addCriterion("staff_emergencycontactaddress like", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressNotLike(String value) {
            addCriterion("staff_emergencycontactaddress not like", value, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressIn(List<String> values) {
            addCriterion("staff_emergencycontactaddress in", values, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressNotIn(List<String> values) {
            addCriterion("staff_emergencycontactaddress not in", values, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressBetween(String value1, String value2) {
            addCriterion("staff_emergencycontactaddress between", value1, value2, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffEmergencycontactaddressNotBetween(String value1, String value2) {
            addCriterion("staff_emergencycontactaddress not between", value1, value2, "staffEmergencycontactaddress");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNull() {
            addCriterion("staff_remark is null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNotNull() {
            addCriterion("staff_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkEqualTo(String value) {
            addCriterion("staff_remark =", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotEqualTo(String value) {
            addCriterion("staff_remark <>", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThan(String value) {
            addCriterion("staff_remark >", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("staff_remark >=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThan(String value) {
            addCriterion("staff_remark <", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThanOrEqualTo(String value) {
            addCriterion("staff_remark <=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLike(String value) {
            addCriterion("staff_remark like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotLike(String value) {
            addCriterion("staff_remark not like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIn(List<String> values) {
            addCriterion("staff_remark in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotIn(List<String> values) {
            addCriterion("staff_remark not in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkBetween(String value1, String value2) {
            addCriterion("staff_remark between", value1, value2, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotBetween(String value1, String value2) {
            addCriterion("staff_remark not between", value1, value2, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingIsNull() {
            addCriterion("staff_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingIsNotNull() {
            addCriterion("staff_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingEqualTo(String value) {
            addCriterion("staff_Auditing =", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingNotEqualTo(String value) {
            addCriterion("staff_Auditing <>", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingGreaterThan(String value) {
            addCriterion("staff_Auditing >", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("staff_Auditing >=", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingLessThan(String value) {
            addCriterion("staff_Auditing <", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingLessThanOrEqualTo(String value) {
            addCriterion("staff_Auditing <=", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingLike(String value) {
            addCriterion("staff_Auditing like", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingNotLike(String value) {
            addCriterion("staff_Auditing not like", value, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingIn(List<String> values) {
            addCriterion("staff_Auditing in", values, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingNotIn(List<String> values) {
            addCriterion("staff_Auditing not in", values, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingBetween(String value1, String value2) {
            addCriterion("staff_Auditing between", value1, value2, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffAuditingNotBetween(String value1, String value2) {
            addCriterion("staff_Auditing not between", value1, value2, "staffAuditing");
            return (Criteria) this;
        }

        public Criteria andStaffYnIsNull() {
            addCriterion("staff_yn is null");
            return (Criteria) this;
        }

        public Criteria andStaffYnIsNotNull() {
            addCriterion("staff_yn is not null");
            return (Criteria) this;
        }

        public Criteria andStaffYnEqualTo(String value) {
            addCriterion("staff_yn =", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnNotEqualTo(String value) {
            addCriterion("staff_yn <>", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnGreaterThan(String value) {
            addCriterion("staff_yn >", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnGreaterThanOrEqualTo(String value) {
            addCriterion("staff_yn >=", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnLessThan(String value) {
            addCriterion("staff_yn <", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnLessThanOrEqualTo(String value) {
            addCriterion("staff_yn <=", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnLike(String value) {
            addCriterion("staff_yn like", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnNotLike(String value) {
            addCriterion("staff_yn not like", value, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnIn(List<String> values) {
            addCriterion("staff_yn in", values, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnNotIn(List<String> values) {
            addCriterion("staff_yn not in", values, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnBetween(String value1, String value2) {
            addCriterion("staff_yn between", value1, value2, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffYnNotBetween(String value1, String value2) {
            addCriterion("staff_yn not between", value1, value2, "staffYn");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1IsNull() {
            addCriterion("staff_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1IsNotNull() {
            addCriterion("staff_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1EqualTo(String value) {
            addCriterion("staff_custom1 =", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1NotEqualTo(String value) {
            addCriterion("staff_custom1 <>", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1GreaterThan(String value) {
            addCriterion("staff_custom1 >", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("staff_custom1 >=", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1LessThan(String value) {
            addCriterion("staff_custom1 <", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1LessThanOrEqualTo(String value) {
            addCriterion("staff_custom1 <=", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1Like(String value) {
            addCriterion("staff_custom1 like", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1NotLike(String value) {
            addCriterion("staff_custom1 not like", value, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1In(List<String> values) {
            addCriterion("staff_custom1 in", values, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1NotIn(List<String> values) {
            addCriterion("staff_custom1 not in", values, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1Between(String value1, String value2) {
            addCriterion("staff_custom1 between", value1, value2, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom1NotBetween(String value1, String value2) {
            addCriterion("staff_custom1 not between", value1, value2, "staffCustom1");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2IsNull() {
            addCriterion("staff_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2IsNotNull() {
            addCriterion("staff_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2EqualTo(String value) {
            addCriterion("staff_custom2 =", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2NotEqualTo(String value) {
            addCriterion("staff_custom2 <>", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2GreaterThan(String value) {
            addCriterion("staff_custom2 >", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("staff_custom2 >=", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2LessThan(String value) {
            addCriterion("staff_custom2 <", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2LessThanOrEqualTo(String value) {
            addCriterion("staff_custom2 <=", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2Like(String value) {
            addCriterion("staff_custom2 like", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2NotLike(String value) {
            addCriterion("staff_custom2 not like", value, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2In(List<String> values) {
            addCriterion("staff_custom2 in", values, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2NotIn(List<String> values) {
            addCriterion("staff_custom2 not in", values, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2Between(String value1, String value2) {
            addCriterion("staff_custom2 between", value1, value2, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom2NotBetween(String value1, String value2) {
            addCriterion("staff_custom2 not between", value1, value2, "staffCustom2");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3IsNull() {
            addCriterion("staff_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3IsNotNull() {
            addCriterion("staff_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3EqualTo(String value) {
            addCriterion("staff_custom3 =", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3NotEqualTo(String value) {
            addCriterion("staff_custom3 <>", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3GreaterThan(String value) {
            addCriterion("staff_custom3 >", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("staff_custom3 >=", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3LessThan(String value) {
            addCriterion("staff_custom3 <", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3LessThanOrEqualTo(String value) {
            addCriterion("staff_custom3 <=", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3Like(String value) {
            addCriterion("staff_custom3 like", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3NotLike(String value) {
            addCriterion("staff_custom3 not like", value, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3In(List<String> values) {
            addCriterion("staff_custom3 in", values, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3NotIn(List<String> values) {
            addCriterion("staff_custom3 not in", values, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3Between(String value1, String value2) {
            addCriterion("staff_custom3 between", value1, value2, "staffCustom3");
            return (Criteria) this;
        }

        public Criteria andStaffCustom3NotBetween(String value1, String value2) {
            addCriterion("staff_custom3 not between", value1, value2, "staffCustom3");
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