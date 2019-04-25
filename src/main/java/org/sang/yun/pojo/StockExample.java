package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockNumberIsNull() {
            addCriterion("stockNumber is null");
            return (Criteria) this;
        }

        public Criteria andStockNumberIsNotNull() {
            addCriterion("stockNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumberEqualTo(String value) {
            addCriterion("stockNumber =", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotEqualTo(String value) {
            addCriterion("stockNumber <>", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberGreaterThan(String value) {
            addCriterion("stockNumber >", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stockNumber >=", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLessThan(String value) {
            addCriterion("stockNumber <", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLessThanOrEqualTo(String value) {
            addCriterion("stockNumber <=", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLike(String value) {
            addCriterion("stockNumber like", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotLike(String value) {
            addCriterion("stockNumber not like", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberIn(List<String> values) {
            addCriterion("stockNumber in", values, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotIn(List<String> values) {
            addCriterion("stockNumber not in", values, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberBetween(String value1, String value2) {
            addCriterion("stockNumber between", value1, value2, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotBetween(String value1, String value2) {
            addCriterion("stockNumber not between", value1, value2, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andClIdIsNull() {
            addCriterion("clId is null");
            return (Criteria) this;
        }

        public Criteria andClIdIsNotNull() {
            addCriterion("clId is not null");
            return (Criteria) this;
        }

        public Criteria andClIdEqualTo(Integer value) {
            addCriterion("clId =", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotEqualTo(Integer value) {
            addCriterion("clId <>", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThan(Integer value) {
            addCriterion("clId >", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clId >=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThan(Integer value) {
            addCriterion("clId <", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThanOrEqualTo(Integer value) {
            addCriterion("clId <=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdIn(List<Integer> values) {
            addCriterion("clId in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotIn(List<Integer> values) {
            addCriterion("clId not in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdBetween(Integer value1, Integer value2) {
            addCriterion("clId between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clId not between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIsNull() {
            addCriterion("stockTypeId is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIsNotNull() {
            addCriterion("stockTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdEqualTo(Integer value) {
            addCriterion("stockTypeId =", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotEqualTo(Integer value) {
            addCriterion("stockTypeId <>", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdGreaterThan(Integer value) {
            addCriterion("stockTypeId >", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockTypeId >=", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdLessThan(Integer value) {
            addCriterion("stockTypeId <", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("stockTypeId <=", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIn(List<Integer> values) {
            addCriterion("stockTypeId in", values, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotIn(List<Integer> values) {
            addCriterion("stockTypeId not in", values, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("stockTypeId between", value1, value2, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stockTypeId not between", value1, value2, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andWaIdIsNull() {
            addCriterion("waId is null");
            return (Criteria) this;
        }

        public Criteria andWaIdIsNotNull() {
            addCriterion("waId is not null");
            return (Criteria) this;
        }

        public Criteria andWaIdEqualTo(Integer value) {
            addCriterion("waId =", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdNotEqualTo(Integer value) {
            addCriterion("waId <>", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdGreaterThan(Integer value) {
            addCriterion("waId >", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waId >=", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdLessThan(Integer value) {
            addCriterion("waId <", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdLessThanOrEqualTo(Integer value) {
            addCriterion("waId <=", value, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdIn(List<Integer> values) {
            addCriterion("waId in", values, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdNotIn(List<Integer> values) {
            addCriterion("waId not in", values, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdBetween(Integer value1, Integer value2) {
            addCriterion("waId between", value1, value2, "waId");
            return (Criteria) this;
        }

        public Criteria andWaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waId not between", value1, value2, "waId");
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

        public Criteria andPlanDateIsNull() {
            addCriterion("planDate is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("planDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("planDate =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("planDate <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("planDate >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planDate >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("planDate <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planDate <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("planDate in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("planDate not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planDate between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planDate not between", value1, value2, "planDate");
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

        public Criteria andAuditDateIsNull() {
            addCriterion("auditDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("auditDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterionForJDBCDate("auditDate =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("auditDate <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterionForJDBCDate("auditDate >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("auditDate >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterionForJDBCDate("auditDate <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("auditDate <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterionForJDBCDate("auditDate in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("auditDate not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("auditDate between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("auditDate not between", value1, value2, "auditDate");
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

        public Criteria andOutOrInIsNull() {
            addCriterion("outOrIn is null");
            return (Criteria) this;
        }

        public Criteria andOutOrInIsNotNull() {
            addCriterion("outOrIn is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrInEqualTo(Integer value) {
            addCriterion("outOrIn =", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotEqualTo(Integer value) {
            addCriterion("outOrIn <>", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInGreaterThan(Integer value) {
            addCriterion("outOrIn >", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInGreaterThanOrEqualTo(Integer value) {
            addCriterion("outOrIn >=", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInLessThan(Integer value) {
            addCriterion("outOrIn <", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInLessThanOrEqualTo(Integer value) {
            addCriterion("outOrIn <=", value, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInIn(List<Integer> values) {
            addCriterion("outOrIn in", values, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotIn(List<Integer> values) {
            addCriterion("outOrIn not in", values, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInBetween(Integer value1, Integer value2) {
            addCriterion("outOrIn between", value1, value2, "outOrIn");
            return (Criteria) this;
        }

        public Criteria andOutOrInNotBetween(Integer value1, Integer value2) {
            addCriterion("outOrIn not between", value1, value2, "outOrIn");
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