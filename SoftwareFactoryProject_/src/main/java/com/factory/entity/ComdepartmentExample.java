package com.factory.entity;

import java.util.ArrayList;
import java.util.List;

public class ComdepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComdepartmentExample() {
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

        public Criteria andDepartidIsNull() {
            addCriterion("DepartID is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("DepartID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(String value) {
            addCriterion("DepartID =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(String value) {
            addCriterion("DepartID <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(String value) {
            addCriterion("DepartID >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartID >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(String value) {
            addCriterion("DepartID <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(String value) {
            addCriterion("DepartID <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLike(String value) {
            addCriterion("DepartID like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotLike(String value) {
            addCriterion("DepartID not like", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<String> values) {
            addCriterion("DepartID in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<String> values) {
            addCriterion("DepartID not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(String value1, String value2) {
            addCriterion("DepartID between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(String value1, String value2) {
            addCriterion("DepartID not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("DepartName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("DepartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("DepartName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("DepartName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("DepartName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("DepartName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("DepartName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("DepartName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("DepartName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("DepartName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("DepartName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("DepartName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("DepartName not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("EngName is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("EngName is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("EngName =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("EngName <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("EngName >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("EngName >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("EngName <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("EngName <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("EngName like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("EngName not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("EngName in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("EngName not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("EngName between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("EngName not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andFemaleIsNull() {
            addCriterion("Female is null");
            return (Criteria) this;
        }

        public Criteria andFemaleIsNotNull() {
            addCriterion("Female is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleEqualTo(Short value) {
            addCriterion("Female =", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleNotEqualTo(Short value) {
            addCriterion("Female <>", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleGreaterThan(Short value) {
            addCriterion("Female >", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleGreaterThanOrEqualTo(Short value) {
            addCriterion("Female >=", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleLessThan(Short value) {
            addCriterion("Female <", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleLessThanOrEqualTo(Short value) {
            addCriterion("Female <=", value, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleIn(List<Short> values) {
            addCriterion("Female in", values, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleNotIn(List<Short> values) {
            addCriterion("Female not in", values, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleBetween(Short value1, Short value2) {
            addCriterion("Female between", value1, value2, "female");
            return (Criteria) this;
        }

        public Criteria andFemaleNotBetween(Short value1, Short value2) {
            addCriterion("Female not between", value1, value2, "female");
            return (Criteria) this;
        }

        public Criteria andMaleIsNull() {
            addCriterion("Male is null");
            return (Criteria) this;
        }

        public Criteria andMaleIsNotNull() {
            addCriterion("Male is not null");
            return (Criteria) this;
        }

        public Criteria andMaleEqualTo(Short value) {
            addCriterion("Male =", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotEqualTo(Short value) {
            addCriterion("Male <>", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleGreaterThan(Short value) {
            addCriterion("Male >", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleGreaterThanOrEqualTo(Short value) {
            addCriterion("Male >=", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleLessThan(Short value) {
            addCriterion("Male <", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleLessThanOrEqualTo(Short value) {
            addCriterion("Male <=", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleIn(List<Short> values) {
            addCriterion("Male in", values, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotIn(List<Short> values) {
            addCriterion("Male not in", values, "male");
            return (Criteria) this;
        }

        public Criteria andMaleBetween(Short value1, Short value2) {
            addCriterion("Male between", value1, value2, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotBetween(Short value1, Short value2) {
            addCriterion("Male not between", value1, value2, "male");
            return (Criteria) this;
        }

        public Criteria andJobschIsNull() {
            addCriterion("JobSch is null");
            return (Criteria) this;
        }

        public Criteria andJobschIsNotNull() {
            addCriterion("JobSch is not null");
            return (Criteria) this;
        }

        public Criteria andJobschEqualTo(String value) {
            addCriterion("JobSch =", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschNotEqualTo(String value) {
            addCriterion("JobSch <>", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschGreaterThan(String value) {
            addCriterion("JobSch >", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschGreaterThanOrEqualTo(String value) {
            addCriterion("JobSch >=", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschLessThan(String value) {
            addCriterion("JobSch <", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschLessThanOrEqualTo(String value) {
            addCriterion("JobSch <=", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschLike(String value) {
            addCriterion("JobSch like", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschNotLike(String value) {
            addCriterion("JobSch not like", value, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschIn(List<String> values) {
            addCriterion("JobSch in", values, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschNotIn(List<String> values) {
            addCriterion("JobSch not in", values, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschBetween(String value1, String value2) {
            addCriterion("JobSch between", value1, value2, "jobsch");
            return (Criteria) this;
        }

        public Criteria andJobschNotBetween(String value1, String value2) {
            addCriterion("JobSch not between", value1, value2, "jobsch");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIsNull() {
            addCriterion("MergeOutState is null");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIsNotNull() {
            addCriterion("MergeOutState is not null");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateEqualTo(Short value) {
            addCriterion("MergeOutState =", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotEqualTo(Short value) {
            addCriterion("MergeOutState <>", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateGreaterThan(Short value) {
            addCriterion("MergeOutState >", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateGreaterThanOrEqualTo(Short value) {
            addCriterion("MergeOutState >=", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateLessThan(Short value) {
            addCriterion("MergeOutState <", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateLessThanOrEqualTo(Short value) {
            addCriterion("MergeOutState <=", value, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateIn(List<Short> values) {
            addCriterion("MergeOutState in", values, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotIn(List<Short> values) {
            addCriterion("MergeOutState not in", values, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateBetween(Short value1, Short value2) {
            addCriterion("MergeOutState between", value1, value2, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andMergeoutstateNotBetween(Short value1, Short value2) {
            addCriterion("MergeOutState not between", value1, value2, "mergeoutstate");
            return (Criteria) this;
        }

        public Criteria andCalidIsNull() {
            addCriterion("CalID is null");
            return (Criteria) this;
        }

        public Criteria andCalidIsNotNull() {
            addCriterion("CalID is not null");
            return (Criteria) this;
        }

        public Criteria andCalidEqualTo(String value) {
            addCriterion("CalID =", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidNotEqualTo(String value) {
            addCriterion("CalID <>", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidGreaterThan(String value) {
            addCriterion("CalID >", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidGreaterThanOrEqualTo(String value) {
            addCriterion("CalID >=", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidLessThan(String value) {
            addCriterion("CalID <", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidLessThanOrEqualTo(String value) {
            addCriterion("CalID <=", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidLike(String value) {
            addCriterion("CalID like", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidNotLike(String value) {
            addCriterion("CalID not like", value, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidIn(List<String> values) {
            addCriterion("CalID in", values, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidNotIn(List<String> values) {
            addCriterion("CalID not in", values, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidBetween(String value1, String value2) {
            addCriterion("CalID between", value1, value2, "calid");
            return (Criteria) this;
        }

        public Criteria andCalidNotBetween(String value1, String value2) {
            addCriterion("CalID not between", value1, value2, "calid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidIsNull() {
            addCriterion("SalaryTypeID is null");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidIsNotNull() {
            addCriterion("SalaryTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidEqualTo(String value) {
            addCriterion("SalaryTypeID =", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidNotEqualTo(String value) {
            addCriterion("SalaryTypeID <>", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidGreaterThan(String value) {
            addCriterion("SalaryTypeID >", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidGreaterThanOrEqualTo(String value) {
            addCriterion("SalaryTypeID >=", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidLessThan(String value) {
            addCriterion("SalaryTypeID <", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidLessThanOrEqualTo(String value) {
            addCriterion("SalaryTypeID <=", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidLike(String value) {
            addCriterion("SalaryTypeID like", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidNotLike(String value) {
            addCriterion("SalaryTypeID not like", value, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidIn(List<String> values) {
            addCriterion("SalaryTypeID in", values, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidNotIn(List<String> values) {
            addCriterion("SalaryTypeID not in", values, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidBetween(String value1, String value2) {
            addCriterion("SalaryTypeID between", value1, value2, "salarytypeid");
            return (Criteria) this;
        }

        public Criteria andSalarytypeidNotBetween(String value1, String value2) {
            addCriterion("SalaryTypeID not between", value1, value2, "salarytypeid");
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