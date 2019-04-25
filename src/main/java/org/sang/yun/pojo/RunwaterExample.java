package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RunwaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RunwaterExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRun_numberIsNull() {
            addCriterion("run_number is null");
            return (Criteria) this;
        }

        public Criteria andRun_numberIsNotNull() {
            addCriterion("run_number is not null");
            return (Criteria) this;
        }

        public Criteria andRun_numberEqualTo(Integer value) {
            addCriterion("run_number =", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberNotEqualTo(Integer value) {
            addCriterion("run_number <>", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberGreaterThan(Integer value) {
            addCriterion("run_number >", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_number >=", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberLessThan(Integer value) {
            addCriterion("run_number <", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberLessThanOrEqualTo(Integer value) {
            addCriterion("run_number <=", value, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberIn(List<Integer> values) {
            addCriterion("run_number in", values, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberNotIn(List<Integer> values) {
            addCriterion("run_number not in", values, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberBetween(Integer value1, Integer value2) {
            addCriterion("run_number between", value1, value2, "run_number");
            return (Criteria) this;
        }

        public Criteria andRun_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("run_number not between", value1, value2, "run_number");
            return (Criteria) this;
        }

        public Criteria andReNumberIsNull() {
            addCriterion("reNumber is null");
            return (Criteria) this;
        }

        public Criteria andReNumberIsNotNull() {
            addCriterion("reNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReNumberEqualTo(String value) {
            addCriterion("reNumber =", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberNotEqualTo(String value) {
            addCriterion("reNumber <>", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberGreaterThan(String value) {
            addCriterion("reNumber >", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reNumber >=", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberLessThan(String value) {
            addCriterion("reNumber <", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberLessThanOrEqualTo(String value) {
            addCriterion("reNumber <=", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberLike(String value) {
            addCriterion("reNumber like", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberNotLike(String value) {
            addCriterion("reNumber not like", value, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberIn(List<String> values) {
            addCriterion("reNumber in", values, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberNotIn(List<String> values) {
            addCriterion("reNumber not in", values, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberBetween(String value1, String value2) {
            addCriterion("reNumber between", value1, value2, "reNumber");
            return (Criteria) this;
        }

        public Criteria andReNumberNotBetween(String value1, String value2) {
            addCriterion("reNumber not between", value1, value2, "reNumber");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("incomeType is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("incomeType is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(String value) {
            addCriterion("incomeType =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(String value) {
            addCriterion("incomeType <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(String value) {
            addCriterion("incomeType >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("incomeType >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(String value) {
            addCriterion("incomeType <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(String value) {
            addCriterion("incomeType <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLike(String value) {
            addCriterion("incomeType like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotLike(String value) {
            addCriterion("incomeType not like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<String> values) {
            addCriterion("incomeType in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<String> values) {
            addCriterion("incomeType not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(String value1, String value2) {
            addCriterion("incomeType between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(String value1, String value2) {
            addCriterion("incomeType not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andRePriceIsNull() {
            addCriterion("rePrice is null");
            return (Criteria) this;
        }

        public Criteria andRePriceIsNotNull() {
            addCriterion("rePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRePriceEqualTo(Double value) {
            addCriterion("rePrice =", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceNotEqualTo(Double value) {
            addCriterion("rePrice <>", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceGreaterThan(Double value) {
            addCriterion("rePrice >", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("rePrice >=", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceLessThan(Double value) {
            addCriterion("rePrice <", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceLessThanOrEqualTo(Double value) {
            addCriterion("rePrice <=", value, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceIn(List<Double> values) {
            addCriterion("rePrice in", values, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceNotIn(List<Double> values) {
            addCriterion("rePrice not in", values, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceBetween(Double value1, Double value2) {
            addCriterion("rePrice between", value1, value2, "rePrice");
            return (Criteria) this;
        }

        public Criteria andRePriceNotBetween(Double value1, Double value2) {
            addCriterion("rePrice not between", value1, value2, "rePrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("payType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("payType >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("payType <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("payType like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("payType not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("payType in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andReDateIsNull() {
            addCriterion("reDate is null");
            return (Criteria) this;
        }

        public Criteria andReDateIsNotNull() {
            addCriterion("reDate is not null");
            return (Criteria) this;
        }

        public Criteria andReDateEqualTo(Date value) {
            addCriterionForJDBCDate("reDate =", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reDate <>", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reDate >", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reDate >=", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateLessThan(Date value) {
            addCriterionForJDBCDate("reDate <", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reDate <=", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateIn(List<Date> values) {
            addCriterionForJDBCDate("reDate in", values, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reDate not in", values, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reDate between", value1, value2, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reDate not between", value1, value2, "reDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("creatDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("creatDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(Date value) {
            addCriterionForJDBCDate("creatDate =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creatDate <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Date value) {
            addCriterionForJDBCDate("creatDate >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creatDate >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Date value) {
            addCriterionForJDBCDate("creatDate <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creatDate <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Date> values) {
            addCriterionForJDBCDate("creatDate in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creatDate not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creatDate between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creatDate not between", value1, value2, "creatDate");
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