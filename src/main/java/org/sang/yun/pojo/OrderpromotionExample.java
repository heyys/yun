package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderpromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderpromotionExample() {
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

        public Criteria andOpTimeIsNull() {
            addCriterion("opTime is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("opTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("opTime =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("opTime <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("opTime >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opTime >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterionForJDBCDate("opTime <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opTime <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("opTime in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("opTime not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opTime between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opTime not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTitleIsNull() {
            addCriterion("opTitle is null");
            return (Criteria) this;
        }

        public Criteria andOpTitleIsNotNull() {
            addCriterion("opTitle is not null");
            return (Criteria) this;
        }

        public Criteria andOpTitleEqualTo(String value) {
            addCriterion("opTitle =", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleNotEqualTo(String value) {
            addCriterion("opTitle <>", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleGreaterThan(String value) {
            addCriterion("opTitle >", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("opTitle >=", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleLessThan(String value) {
            addCriterion("opTitle <", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleLessThanOrEqualTo(String value) {
            addCriterion("opTitle <=", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleLike(String value) {
            addCriterion("opTitle like", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleNotLike(String value) {
            addCriterion("opTitle not like", value, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleIn(List<String> values) {
            addCriterion("opTitle in", values, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleNotIn(List<String> values) {
            addCriterion("opTitle not in", values, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleBetween(String value1, String value2) {
            addCriterion("opTitle between", value1, value2, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpTitleNotBetween(String value1, String value2) {
            addCriterion("opTitle not between", value1, value2, "opTitle");
            return (Criteria) this;
        }

        public Criteria andOpContentIsNull() {
            addCriterion("opContent is null");
            return (Criteria) this;
        }

        public Criteria andOpContentIsNotNull() {
            addCriterion("opContent is not null");
            return (Criteria) this;
        }

        public Criteria andOpContentEqualTo(String value) {
            addCriterion("opContent =", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotEqualTo(String value) {
            addCriterion("opContent <>", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentGreaterThan(String value) {
            addCriterion("opContent >", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentGreaterThanOrEqualTo(String value) {
            addCriterion("opContent >=", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLessThan(String value) {
            addCriterion("opContent <", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLessThanOrEqualTo(String value) {
            addCriterion("opContent <=", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLike(String value) {
            addCriterion("opContent like", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotLike(String value) {
            addCriterion("opContent not like", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentIn(List<String> values) {
            addCriterion("opContent in", values, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotIn(List<String> values) {
            addCriterion("opContent not in", values, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentBetween(String value1, String value2) {
            addCriterion("opContent between", value1, value2, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotBetween(String value1, String value2) {
            addCriterion("opContent not between", value1, value2, "opContent");
            return (Criteria) this;
        }

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(String value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(String value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(String value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(String value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(String value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(String value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLike(String value) {
            addCriterion("object like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotLike(String value) {
            addCriterion("object not like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<String> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<String> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(String value1, String value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(String value1, String value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNull() {
            addCriterion("prId is null");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNotNull() {
            addCriterion("prId is not null");
            return (Criteria) this;
        }

        public Criteria andPrIdEqualTo(Integer value) {
            addCriterion("prId =", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotEqualTo(Integer value) {
            addCriterion("prId <>", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThan(Integer value) {
            addCriterion("prId >", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prId >=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThan(Integer value) {
            addCriterion("prId <", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThanOrEqualTo(Integer value) {
            addCriterion("prId <=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdIn(List<Integer> values) {
            addCriterion("prId in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotIn(List<Integer> values) {
            addCriterion("prId not in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdBetween(Integer value1, Integer value2) {
            addCriterion("prId between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prId not between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("orderMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("orderMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Double value) {
            addCriterion("orderMoney =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Double value) {
            addCriterion("orderMoney <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Double value) {
            addCriterion("orderMoney >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("orderMoney >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Double value) {
            addCriterion("orderMoney <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("orderMoney <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Double> values) {
            addCriterion("orderMoney in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Double> values) {
            addCriterion("orderMoney not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("orderMoney between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("orderMoney not between", value1, value2, "orderMoney");
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

        public Criteria andProCountIsNull() {
            addCriterion("proCount is null");
            return (Criteria) this;
        }

        public Criteria andProCountIsNotNull() {
            addCriterion("proCount is not null");
            return (Criteria) this;
        }

        public Criteria andProCountEqualTo(Integer value) {
            addCriterion("proCount =", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotEqualTo(Integer value) {
            addCriterion("proCount <>", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountGreaterThan(Integer value) {
            addCriterion("proCount >", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("proCount >=", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountLessThan(Integer value) {
            addCriterion("proCount <", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountLessThanOrEqualTo(Integer value) {
            addCriterion("proCount <=", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountIn(List<Integer> values) {
            addCriterion("proCount in", values, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotIn(List<Integer> values) {
            addCriterion("proCount not in", values, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountBetween(Integer value1, Integer value2) {
            addCriterion("proCount between", value1, value2, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotBetween(Integer value1, Integer value2) {
            addCriterion("proCount not between", value1, value2, "proCount");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyIsNull() {
            addCriterion("reduceMoney is null");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyIsNotNull() {
            addCriterion("reduceMoney is not null");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyEqualTo(Double value) {
            addCriterion("reduceMoney =", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyNotEqualTo(Double value) {
            addCriterion("reduceMoney <>", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyGreaterThan(Double value) {
            addCriterion("reduceMoney >", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("reduceMoney >=", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyLessThan(Double value) {
            addCriterion("reduceMoney <", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyLessThanOrEqualTo(Double value) {
            addCriterion("reduceMoney <=", value, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyIn(List<Double> values) {
            addCriterion("reduceMoney in", values, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyNotIn(List<Double> values) {
            addCriterion("reduceMoney not in", values, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyBetween(Double value1, Double value2) {
            addCriterion("reduceMoney between", value1, value2, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andReduceMoneyNotBetween(Double value1, Double value2) {
            addCriterion("reduceMoney not between", value1, value2, "reduceMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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

        public Criteria andGiIdIsNull() {
            addCriterion("giId is null");
            return (Criteria) this;
        }

        public Criteria andGiIdIsNotNull() {
            addCriterion("giId is not null");
            return (Criteria) this;
        }

        public Criteria andGiIdEqualTo(Integer value) {
            addCriterion("giId =", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotEqualTo(Integer value) {
            addCriterion("giId <>", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdGreaterThan(Integer value) {
            addCriterion("giId >", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("giId >=", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdLessThan(Integer value) {
            addCriterion("giId <", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdLessThanOrEqualTo(Integer value) {
            addCriterion("giId <=", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdIn(List<Integer> values) {
            addCriterion("giId in", values, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotIn(List<Integer> values) {
            addCriterion("giId not in", values, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdBetween(Integer value1, Integer value2) {
            addCriterion("giId between", value1, value2, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("giId not between", value1, value2, "giId");
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