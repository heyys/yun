package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptExample() {
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

        public Criteria andPayNameIsNull() {
            addCriterion("payName is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("payName is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("payName =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("payName <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("payName >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("payName >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("payName <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("payName <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("payName like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("payName not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("payName in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("payName not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("payName between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("payName not between", value1, value2, "payName");
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

        public Criteria andWritten_offIsNull() {
            addCriterion("written_off is null");
            return (Criteria) this;
        }

        public Criteria andWritten_offIsNotNull() {
            addCriterion("written_off is not null");
            return (Criteria) this;
        }

        public Criteria andWritten_offEqualTo(Double value) {
            addCriterion("written_off =", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offNotEqualTo(Double value) {
            addCriterion("written_off <>", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offGreaterThan(Double value) {
            addCriterion("written_off >", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offGreaterThanOrEqualTo(Double value) {
            addCriterion("written_off >=", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offLessThan(Double value) {
            addCriterion("written_off <", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offLessThanOrEqualTo(Double value) {
            addCriterion("written_off <=", value, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offIn(List<Double> values) {
            addCriterion("written_off in", values, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offNotIn(List<Double> values) {
            addCriterion("written_off not in", values, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offBetween(Double value1, Double value2) {
            addCriterion("written_off between", value1, value2, "written_off");
            return (Criteria) this;
        }

        public Criteria andWritten_offNotBetween(Double value1, Double value2) {
            addCriterion("written_off not between", value1, value2, "written_off");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdIsNull() {
            addCriterion("incomeTypeId is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdIsNotNull() {
            addCriterion("incomeTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdEqualTo(Integer value) {
            addCriterion("incomeTypeId =", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdNotEqualTo(Integer value) {
            addCriterion("incomeTypeId <>", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdGreaterThan(Integer value) {
            addCriterion("incomeTypeId >", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("incomeTypeId >=", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdLessThan(Integer value) {
            addCriterion("incomeTypeId <", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("incomeTypeId <=", value, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdIn(List<Integer> values) {
            addCriterion("incomeTypeId in", values, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdNotIn(List<Integer> values) {
            addCriterion("incomeTypeId not in", values, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("incomeTypeId between", value1, value2, "incomeTypeId");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("incomeTypeId not between", value1, value2, "incomeTypeId");
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

        public Criteria andBillIdIsNull() {
            addCriterion("billId is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("billId is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("billId =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("billId <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("billId >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("billId >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("billId <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("billId <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("billId in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("billId not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("billId between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("billId not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNull() {
            addCriterion("auditName is null");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNotNull() {
            addCriterion("auditName is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNameEqualTo(String value) {
            addCriterion("auditName =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotEqualTo(String value) {
            addCriterion("auditName <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThan(String value) {
            addCriterion("auditName >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("auditName >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThan(String value) {
            addCriterion("auditName <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThanOrEqualTo(String value) {
            addCriterion("auditName <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLike(String value) {
            addCriterion("auditName like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotLike(String value) {
            addCriterion("auditName not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameIn(List<String> values) {
            addCriterion("auditName in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotIn(List<String> values) {
            addCriterion("auditName not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameBetween(String value1, String value2) {
            addCriterion("auditName between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotBetween(String value1, String value2) {
            addCriterion("auditName not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameIsNull() {
            addCriterion("prepareName is null");
            return (Criteria) this;
        }

        public Criteria andPrepareNameIsNotNull() {
            addCriterion("prepareName is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareNameEqualTo(String value) {
            addCriterion("prepareName =", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameNotEqualTo(String value) {
            addCriterion("prepareName <>", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameGreaterThan(String value) {
            addCriterion("prepareName >", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameGreaterThanOrEqualTo(String value) {
            addCriterion("prepareName >=", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameLessThan(String value) {
            addCriterion("prepareName <", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameLessThanOrEqualTo(String value) {
            addCriterion("prepareName <=", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameLike(String value) {
            addCriterion("prepareName like", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameNotLike(String value) {
            addCriterion("prepareName not like", value, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameIn(List<String> values) {
            addCriterion("prepareName in", values, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameNotIn(List<String> values) {
            addCriterion("prepareName not in", values, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameBetween(String value1, String value2) {
            addCriterion("prepareName between", value1, value2, "prepareName");
            return (Criteria) this;
        }

        public Criteria andPrepareNameNotBetween(String value1, String value2) {
            addCriterion("prepareName not between", value1, value2, "prepareName");
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

        public Criteria andCommitDateIsNull() {
            addCriterion("commitDate is null");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNotNull() {
            addCriterion("commitDate is not null");
            return (Criteria) this;
        }

        public Criteria andCommitDateEqualTo(Date value) {
            addCriterionForJDBCDate("commitDate =", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("commitDate <>", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("commitDate >", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commitDate >=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThan(Date value) {
            addCriterionForJDBCDate("commitDate <", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commitDate <=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateIn(List<Date> values) {
            addCriterionForJDBCDate("commitDate in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("commitDate not in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commitDate between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commitDate not between", value1, value2, "commitDate");
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