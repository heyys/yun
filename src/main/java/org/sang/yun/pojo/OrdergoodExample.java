package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdergoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdergoodExample() {
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

        public Criteria andCl_typeIsNull() {
            addCriterion("cl_type is null");
            return (Criteria) this;
        }

        public Criteria andCl_typeIsNotNull() {
            addCriterion("cl_type is not null");
            return (Criteria) this;
        }

        public Criteria andCl_typeEqualTo(Integer value) {
            addCriterion("cl_type =", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeNotEqualTo(Integer value) {
            addCriterion("cl_type <>", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeGreaterThan(Integer value) {
            addCriterion("cl_type >", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_type >=", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeLessThan(Integer value) {
            addCriterion("cl_type <", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeLessThanOrEqualTo(Integer value) {
            addCriterion("cl_type <=", value, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeIn(List<Integer> values) {
            addCriterion("cl_type in", values, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeNotIn(List<Integer> values) {
            addCriterion("cl_type not in", values, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeBetween(Integer value1, Integer value2) {
            addCriterion("cl_type between", value1, value2, "cl_type");
            return (Criteria) this;
        }

        public Criteria andCl_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_type not between", value1, value2, "cl_type");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("orderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("orderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("orderPrice =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("orderPrice <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("orderPrice >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orderPrice >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("orderPrice <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("orderPrice <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("orderPrice in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("orderPrice not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("orderPrice between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("orderPrice not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceIsNull() {
            addCriterion("receivedPrice is null");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceIsNotNull() {
            addCriterion("receivedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceEqualTo(Double value) {
            addCriterion("receivedPrice =", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceNotEqualTo(Double value) {
            addCriterion("receivedPrice <>", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceGreaterThan(Double value) {
            addCriterion("receivedPrice >", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("receivedPrice >=", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceLessThan(Double value) {
            addCriterion("receivedPrice <", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceLessThanOrEqualTo(Double value) {
            addCriterion("receivedPrice <=", value, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceIn(List<Double> values) {
            addCriterion("receivedPrice in", values, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceNotIn(List<Double> values) {
            addCriterion("receivedPrice not in", values, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceBetween(Double value1, Double value2) {
            addCriterion("receivedPrice between", value1, value2, "receivedPrice");
            return (Criteria) this;
        }

        public Criteria andReceivedPriceNotBetween(Double value1, Double value2) {
            addCriterion("receivedPrice not between", value1, value2, "receivedPrice");
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

        public Criteria andFiIdIsNull() {
            addCriterion("fiId is null");
            return (Criteria) this;
        }

        public Criteria andFiIdIsNotNull() {
            addCriterion("fiId is not null");
            return (Criteria) this;
        }

        public Criteria andFiIdEqualTo(Integer value) {
            addCriterion("fiId =", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdNotEqualTo(Integer value) {
            addCriterion("fiId <>", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdGreaterThan(Integer value) {
            addCriterion("fiId >", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiId >=", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdLessThan(Integer value) {
            addCriterion("fiId <", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdLessThanOrEqualTo(Integer value) {
            addCriterion("fiId <=", value, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdIn(List<Integer> values) {
            addCriterion("fiId in", values, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdNotIn(List<Integer> values) {
            addCriterion("fiId not in", values, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdBetween(Integer value1, Integer value2) {
            addCriterion("fiId between", value1, value2, "fiId");
            return (Criteria) this;
        }

        public Criteria andFiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fiId not between", value1, value2, "fiId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("saleId is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("saleId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("saleId =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("saleId <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("saleId >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleId >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("saleId <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("saleId <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("saleId in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("saleId not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("saleId between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("saleId not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andOrRemarkIsNull() {
            addCriterion("orRemark is null");
            return (Criteria) this;
        }

        public Criteria andOrRemarkIsNotNull() {
            addCriterion("orRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOrRemarkEqualTo(String value) {
            addCriterion("orRemark =", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkNotEqualTo(String value) {
            addCriterion("orRemark <>", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkGreaterThan(String value) {
            addCriterion("orRemark >", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("orRemark >=", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkLessThan(String value) {
            addCriterion("orRemark <", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkLessThanOrEqualTo(String value) {
            addCriterion("orRemark <=", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkLike(String value) {
            addCriterion("orRemark like", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkNotLike(String value) {
            addCriterion("orRemark not like", value, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkIn(List<String> values) {
            addCriterion("orRemark in", values, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkNotIn(List<String> values) {
            addCriterion("orRemark not in", values, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkBetween(String value1, String value2) {
            addCriterion("orRemark between", value1, value2, "orRemark");
            return (Criteria) this;
        }

        public Criteria andOrRemarkNotBetween(String value1, String value2) {
            addCriterion("orRemark not between", value1, value2, "orRemark");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNull() {
            addCriterion("plId is null");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNotNull() {
            addCriterion("plId is not null");
            return (Criteria) this;
        }

        public Criteria andPlIdEqualTo(Integer value) {
            addCriterion("plId =", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotEqualTo(Integer value) {
            addCriterion("plId <>", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThan(Integer value) {
            addCriterion("plId >", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plId >=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThan(Integer value) {
            addCriterion("plId <", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThanOrEqualTo(Integer value) {
            addCriterion("plId <=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdIn(List<Integer> values) {
            addCriterion("plId in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotIn(List<Integer> values) {
            addCriterion("plId not in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdBetween(Integer value1, Integer value2) {
            addCriterion("plId between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plId not between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("commitTime is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("commitTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Date value) {
            addCriterionForJDBCDate("commitTime =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commitTime <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commitTime >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commitTime >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Date value) {
            addCriterionForJDBCDate("commitTime <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commitTime <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Date> values) {
            addCriterionForJDBCDate("commitTime in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commitTime not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commitTime between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commitTime not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterionForJDBCDate("finishTime =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("finishTime <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("finishTime >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finishTime >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterionForJDBCDate("finishTime <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finishTime <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterionForJDBCDate("finishTime in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("finishTime not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finishTime between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finishTime not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliverTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliverTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterionForJDBCDate("deliverTime =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("deliverTime <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("deliverTime >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliverTime >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterionForJDBCDate("deliverTime <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deliverTime <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterionForJDBCDate("deliverTime in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("deliverTime not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliverTime between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deliverTime not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterionForJDBCDate("cancelTime =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cancelTime <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cancelTime >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancelTime >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterionForJDBCDate("cancelTime <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancelTime <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterionForJDBCDate("cancelTime in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cancelTime not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancelTime between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancelTime not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("proId is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("proId is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("proId =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("proId <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("proId >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proId >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("proId <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("proId <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("proId in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("proId not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("proId between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proId not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andStIdIsNull() {
            addCriterion("stId is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("stId is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("stId =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("stId <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("stId >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stId >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("stId <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("stId <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("stId in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("stId not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("stId between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stId not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andArealIdIsNull() {
            addCriterion("arealId is null");
            return (Criteria) this;
        }

        public Criteria andArealIdIsNotNull() {
            addCriterion("arealId is not null");
            return (Criteria) this;
        }

        public Criteria andArealIdEqualTo(Integer value) {
            addCriterion("arealId =", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdNotEqualTo(Integer value) {
            addCriterion("arealId <>", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdGreaterThan(Integer value) {
            addCriterion("arealId >", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("arealId >=", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdLessThan(Integer value) {
            addCriterion("arealId <", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdLessThanOrEqualTo(Integer value) {
            addCriterion("arealId <=", value, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdIn(List<Integer> values) {
            addCriterion("arealId in", values, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdNotIn(List<Integer> values) {
            addCriterion("arealId not in", values, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdBetween(Integer value1, Integer value2) {
            addCriterion("arealId between", value1, value2, "arealId");
            return (Criteria) this;
        }

        public Criteria andArealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("arealId not between", value1, value2, "arealId");
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

        public Criteria andEmIdIsNull() {
            addCriterion("emId is null");
            return (Criteria) this;
        }

        public Criteria andEmIdIsNotNull() {
            addCriterion("emId is not null");
            return (Criteria) this;
        }

        public Criteria andEmIdEqualTo(Integer value) {
            addCriterion("emId =", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotEqualTo(Integer value) {
            addCriterion("emId <>", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThan(Integer value) {
            addCriterion("emId >", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emId >=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThan(Integer value) {
            addCriterion("emId <", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThanOrEqualTo(Integer value) {
            addCriterion("emId <=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdIn(List<Integer> values) {
            addCriterion("emId in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotIn(List<Integer> values) {
            addCriterion("emId not in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdBetween(Integer value1, Integer value2) {
            addCriterion("emId between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emId not between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andDistIdIsNull() {
            addCriterion("distId is null");
            return (Criteria) this;
        }

        public Criteria andDistIdIsNotNull() {
            addCriterion("distId is not null");
            return (Criteria) this;
        }

        public Criteria andDistIdEqualTo(Integer value) {
            addCriterion("distId =", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotEqualTo(Integer value) {
            addCriterion("distId <>", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThan(Integer value) {
            addCriterion("distId >", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distId >=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThan(Integer value) {
            addCriterion("distId <", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThanOrEqualTo(Integer value) {
            addCriterion("distId <=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdIn(List<Integer> values) {
            addCriterion("distId in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotIn(List<Integer> values) {
            addCriterion("distId not in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdBetween(Integer value1, Integer value2) {
            addCriterion("distId between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distId not between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("returnTime is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("returnTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("returnTime >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterionForJDBCDate("returnTime <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("returnTime in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("returnTime not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returnTime between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returnTime not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNull() {
            addCriterion("printCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNotNull() {
            addCriterion("printCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintCountEqualTo(Integer value) {
            addCriterion("printCount =", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotEqualTo(Integer value) {
            addCriterion("printCount <>", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThan(Integer value) {
            addCriterion("printCount >", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("printCount >=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThan(Integer value) {
            addCriterion("printCount <", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThanOrEqualTo(Integer value) {
            addCriterion("printCount <=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountIn(List<Integer> values) {
            addCriterion("printCount in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotIn(List<Integer> values) {
            addCriterion("printCount not in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountBetween(Integer value1, Integer value2) {
            addCriterion("printCount between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotBetween(Integer value1, Integer value2) {
            addCriterion("printCount not between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andOrStatusIsNull() {
            addCriterion("orStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrStatusIsNotNull() {
            addCriterion("orStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrStatusEqualTo(Integer value) {
            addCriterion("orStatus =", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusNotEqualTo(Integer value) {
            addCriterion("orStatus <>", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusGreaterThan(Integer value) {
            addCriterion("orStatus >", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orStatus >=", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusLessThan(Integer value) {
            addCriterion("orStatus <", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("orStatus <=", value, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusIn(List<Integer> values) {
            addCriterion("orStatus in", values, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusNotIn(List<Integer> values) {
            addCriterion("orStatus not in", values, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusBetween(Integer value1, Integer value2) {
            addCriterion("orStatus between", value1, value2, "orStatus");
            return (Criteria) this;
        }

        public Criteria andOrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orStatus not between", value1, value2, "orStatus");
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