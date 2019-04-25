package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProNumberIsNull() {
            addCriterion("proNumber is null");
            return (Criteria) this;
        }

        public Criteria andProNumberIsNotNull() {
            addCriterion("proNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProNumberEqualTo(String value) {
            addCriterion("proNumber =", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotEqualTo(String value) {
            addCriterion("proNumber <>", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThan(String value) {
            addCriterion("proNumber >", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberGreaterThanOrEqualTo(String value) {
            addCriterion("proNumber >=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThan(String value) {
            addCriterion("proNumber <", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLessThanOrEqualTo(String value) {
            addCriterion("proNumber <=", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberLike(String value) {
            addCriterion("proNumber like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotLike(String value) {
            addCriterion("proNumber not like", value, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberIn(List<String> values) {
            addCriterion("proNumber in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotIn(List<String> values) {
            addCriterion("proNumber not in", values, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberBetween(String value1, String value2) {
            addCriterion("proNumber between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNumberNotBetween(String value1, String value2) {
            addCriterion("proNumber not between", value1, value2, "proNumber");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("proName =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("proName >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("proName <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("proName like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("proName not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("proName in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cateId is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cateId is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("cateId =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("cateId <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("cateId >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cateId >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("cateId <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cateId <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("cateId in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("cateId not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cateId between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cateId not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("proStatus is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("proStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(Integer value) {
            addCriterion("proStatus =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(Integer value) {
            addCriterion("proStatus <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(Integer value) {
            addCriterion("proStatus >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("proStatus >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(Integer value) {
            addCriterion("proStatus <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(Integer value) {
            addCriterion("proStatus <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<Integer> values) {
            addCriterion("proStatus in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<Integer> values) {
            addCriterion("proStatus not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(Integer value1, Integer value2) {
            addCriterion("proStatus between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("proStatus not between", value1, value2, "proStatus");
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

        public Criteria andUnIdIsNull() {
            addCriterion("unId is null");
            return (Criteria) this;
        }

        public Criteria andUnIdIsNotNull() {
            addCriterion("unId is not null");
            return (Criteria) this;
        }

        public Criteria andUnIdEqualTo(Integer value) {
            addCriterion("unId =", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdNotEqualTo(Integer value) {
            addCriterion("unId <>", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdGreaterThan(Integer value) {
            addCriterion("unId >", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unId >=", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdLessThan(Integer value) {
            addCriterion("unId <", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdLessThanOrEqualTo(Integer value) {
            addCriterion("unId <=", value, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdIn(List<Integer> values) {
            addCriterion("unId in", values, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdNotIn(List<Integer> values) {
            addCriterion("unId not in", values, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdBetween(Integer value1, Integer value2) {
            addCriterion("unId between", value1, value2, "unId");
            return (Criteria) this;
        }

        public Criteria andUnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unId not between", value1, value2, "unId");
            return (Criteria) this;
        }

        public Criteria andUsableStockIsNull() {
            addCriterion("usableStock is null");
            return (Criteria) this;
        }

        public Criteria andUsableStockIsNotNull() {
            addCriterion("usableStock is not null");
            return (Criteria) this;
        }

        public Criteria andUsableStockEqualTo(Integer value) {
            addCriterion("usableStock =", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockNotEqualTo(Integer value) {
            addCriterion("usableStock <>", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockGreaterThan(Integer value) {
            addCriterion("usableStock >", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("usableStock >=", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockLessThan(Integer value) {
            addCriterion("usableStock <", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockLessThanOrEqualTo(Integer value) {
            addCriterion("usableStock <=", value, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockIn(List<Integer> values) {
            addCriterion("usableStock in", values, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockNotIn(List<Integer> values) {
            addCriterion("usableStock not in", values, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockBetween(Integer value1, Integer value2) {
            addCriterion("usableStock between", value1, value2, "usableStock");
            return (Criteria) this;
        }

        public Criteria andUsableStockNotBetween(Integer value1, Integer value2) {
            addCriterion("usableStock not between", value1, value2, "usableStock");
            return (Criteria) this;
        }

        public Criteria andSysStockIsNull() {
            addCriterion("sysStock is null");
            return (Criteria) this;
        }

        public Criteria andSysStockIsNotNull() {
            addCriterion("sysStock is not null");
            return (Criteria) this;
        }

        public Criteria andSysStockEqualTo(Integer value) {
            addCriterion("sysStock =", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockNotEqualTo(Integer value) {
            addCriterion("sysStock <>", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockGreaterThan(Integer value) {
            addCriterion("sysStock >", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysStock >=", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockLessThan(Integer value) {
            addCriterion("sysStock <", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockLessThanOrEqualTo(Integer value) {
            addCriterion("sysStock <=", value, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockIn(List<Integer> values) {
            addCriterion("sysStock in", values, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockNotIn(List<Integer> values) {
            addCriterion("sysStock not in", values, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockBetween(Integer value1, Integer value2) {
            addCriterion("sysStock between", value1, value2, "sysStock");
            return (Criteria) this;
        }

        public Criteria andSysStockNotBetween(Integer value1, Integer value2) {
            addCriterion("sysStock not between", value1, value2, "sysStock");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNull() {
            addCriterion("keyWord is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNotNull() {
            addCriterion("keyWord is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordEqualTo(String value) {
            addCriterion("keyWord =", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotEqualTo(String value) {
            addCriterion("keyWord <>", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThan(String value) {
            addCriterion("keyWord >", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("keyWord >=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThan(String value) {
            addCriterion("keyWord <", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThanOrEqualTo(String value) {
            addCriterion("keyWord <=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLike(String value) {
            addCriterion("keyWord like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotLike(String value) {
            addCriterion("keyWord not like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordIn(List<String> values) {
            addCriterion("keyWord in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotIn(List<String> values) {
            addCriterion("keyWord not in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordBetween(String value1, String value2) {
            addCriterion("keyWord between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotBetween(String value1, String value2) {
            addCriterion("keyWord not between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andSolePriceIsNull() {
            addCriterion("solePrice is null");
            return (Criteria) this;
        }

        public Criteria andSolePriceIsNotNull() {
            addCriterion("solePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSolePriceEqualTo(Double value) {
            addCriterion("solePrice =", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceNotEqualTo(Double value) {
            addCriterion("solePrice <>", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceGreaterThan(Double value) {
            addCriterion("solePrice >", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("solePrice >=", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceLessThan(Double value) {
            addCriterion("solePrice <", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceLessThanOrEqualTo(Double value) {
            addCriterion("solePrice <=", value, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceIn(List<Double> values) {
            addCriterion("solePrice in", values, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceNotIn(List<Double> values) {
            addCriterion("solePrice not in", values, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceBetween(Double value1, Double value2) {
            addCriterion("solePrice between", value1, value2, "solePrice");
            return (Criteria) this;
        }

        public Criteria andSolePriceNotBetween(Double value1, Double value2) {
            addCriterion("solePrice not between", value1, value2, "solePrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("totalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("totalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("totalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("totalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("totalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("totalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("totalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("totalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("totalPrice not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNull() {
            addCriterion("imgId is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("imgId is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("imgId =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("imgId <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("imgId >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("imgId >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("imgId <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("imgId <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("imgId in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("imgId not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("imgId between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("imgId not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNull() {
            addCriterion("suId is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("suId is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Integer value) {
            addCriterion("suId =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Integer value) {
            addCriterion("suId <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Integer value) {
            addCriterion("suId >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("suId >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Integer value) {
            addCriterion("suId <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Integer value) {
            addCriterion("suId <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Integer> values) {
            addCriterion("suId in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Integer> values) {
            addCriterion("suId not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Integer value1, Integer value2) {
            addCriterion("suId between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("suId not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brandId =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brandId <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brandId >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandId >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brandId <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brandId <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brandId in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brandId not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brandId between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brandId not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andLaIdIsNull() {
            addCriterion("laId is null");
            return (Criteria) this;
        }

        public Criteria andLaIdIsNotNull() {
            addCriterion("laId is not null");
            return (Criteria) this;
        }

        public Criteria andLaIdEqualTo(Integer value) {
            addCriterion("laId =", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdNotEqualTo(Integer value) {
            addCriterion("laId <>", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdGreaterThan(Integer value) {
            addCriterion("laId >", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("laId >=", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdLessThan(Integer value) {
            addCriterion("laId <", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdLessThanOrEqualTo(Integer value) {
            addCriterion("laId <=", value, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdIn(List<Integer> values) {
            addCriterion("laId in", values, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdNotIn(List<Integer> values) {
            addCriterion("laId not in", values, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdBetween(Integer value1, Integer value2) {
            addCriterion("laId between", value1, value2, "laId");
            return (Criteria) this;
        }

        public Criteria andLaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("laId not between", value1, value2, "laId");
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