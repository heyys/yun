package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class StandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandExample() {
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

        public Criteria andStImgIsNull() {
            addCriterion("stImg is null");
            return (Criteria) this;
        }

        public Criteria andStImgIsNotNull() {
            addCriterion("stImg is not null");
            return (Criteria) this;
        }

        public Criteria andStImgEqualTo(String value) {
            addCriterion("stImg =", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgNotEqualTo(String value) {
            addCriterion("stImg <>", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgGreaterThan(String value) {
            addCriterion("stImg >", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgGreaterThanOrEqualTo(String value) {
            addCriterion("stImg >=", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgLessThan(String value) {
            addCriterion("stImg <", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgLessThanOrEqualTo(String value) {
            addCriterion("stImg <=", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgLike(String value) {
            addCriterion("stImg like", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgNotLike(String value) {
            addCriterion("stImg not like", value, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgIn(List<String> values) {
            addCriterion("stImg in", values, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgNotIn(List<String> values) {
            addCriterion("stImg not in", values, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgBetween(String value1, String value2) {
            addCriterion("stImg between", value1, value2, "stImg");
            return (Criteria) this;
        }

        public Criteria andStImgNotBetween(String value1, String value2) {
            addCriterion("stImg not between", value1, value2, "stImg");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("stName is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("stName is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("stName =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("stName <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("stName >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("stName >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("stName <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("stName <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("stName like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("stName not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("stName in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("stName not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("stName between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("stName not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNumberIsNull() {
            addCriterion("stNumber is null");
            return (Criteria) this;
        }

        public Criteria andStNumberIsNotNull() {
            addCriterion("stNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStNumberEqualTo(String value) {
            addCriterion("stNumber =", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotEqualTo(String value) {
            addCriterion("stNumber <>", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberGreaterThan(String value) {
            addCriterion("stNumber >", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stNumber >=", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberLessThan(String value) {
            addCriterion("stNumber <", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberLessThanOrEqualTo(String value) {
            addCriterion("stNumber <=", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberLike(String value) {
            addCriterion("stNumber like", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotLike(String value) {
            addCriterion("stNumber not like", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberIn(List<String> values) {
            addCriterion("stNumber in", values, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotIn(List<String> values) {
            addCriterion("stNumber not in", values, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberBetween(String value1, String value2) {
            addCriterion("stNumber between", value1, value2, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotBetween(String value1, String value2) {
            addCriterion("stNumber not between", value1, value2, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStRetailIsNull() {
            addCriterion("stRetail is null");
            return (Criteria) this;
        }

        public Criteria andStRetailIsNotNull() {
            addCriterion("stRetail is not null");
            return (Criteria) this;
        }

        public Criteria andStRetailEqualTo(Double value) {
            addCriterion("stRetail =", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailNotEqualTo(Double value) {
            addCriterion("stRetail <>", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailGreaterThan(Double value) {
            addCriterion("stRetail >", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailGreaterThanOrEqualTo(Double value) {
            addCriterion("stRetail >=", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailLessThan(Double value) {
            addCriterion("stRetail <", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailLessThanOrEqualTo(Double value) {
            addCriterion("stRetail <=", value, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailIn(List<Double> values) {
            addCriterion("stRetail in", values, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailNotIn(List<Double> values) {
            addCriterion("stRetail not in", values, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailBetween(Double value1, Double value2) {
            addCriterion("stRetail between", value1, value2, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStRetailNotBetween(Double value1, Double value2) {
            addCriterion("stRetail not between", value1, value2, "stRetail");
            return (Criteria) this;
        }

        public Criteria andStSellIsNull() {
            addCriterion("stSell is null");
            return (Criteria) this;
        }

        public Criteria andStSellIsNotNull() {
            addCriterion("stSell is not null");
            return (Criteria) this;
        }

        public Criteria andStSellEqualTo(Double value) {
            addCriterion("stSell =", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellNotEqualTo(Double value) {
            addCriterion("stSell <>", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellGreaterThan(Double value) {
            addCriterion("stSell >", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellGreaterThanOrEqualTo(Double value) {
            addCriterion("stSell >=", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellLessThan(Double value) {
            addCriterion("stSell <", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellLessThanOrEqualTo(Double value) {
            addCriterion("stSell <=", value, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellIn(List<Double> values) {
            addCriterion("stSell in", values, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellNotIn(List<Double> values) {
            addCriterion("stSell not in", values, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellBetween(Double value1, Double value2) {
            addCriterion("stSell between", value1, value2, "stSell");
            return (Criteria) this;
        }

        public Criteria andStSellNotBetween(Double value1, Double value2) {
            addCriterion("stSell not between", value1, value2, "stSell");
            return (Criteria) this;
        }

        public Criteria andStCodeIsNull() {
            addCriterion("stCode is null");
            return (Criteria) this;
        }

        public Criteria andStCodeIsNotNull() {
            addCriterion("stCode is not null");
            return (Criteria) this;
        }

        public Criteria andStCodeEqualTo(String value) {
            addCriterion("stCode =", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotEqualTo(String value) {
            addCriterion("stCode <>", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeGreaterThan(String value) {
            addCriterion("stCode >", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stCode >=", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLessThan(String value) {
            addCriterion("stCode <", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLessThanOrEqualTo(String value) {
            addCriterion("stCode <=", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeLike(String value) {
            addCriterion("stCode like", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotLike(String value) {
            addCriterion("stCode not like", value, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeIn(List<String> values) {
            addCriterion("stCode in", values, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotIn(List<String> values) {
            addCriterion("stCode not in", values, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeBetween(String value1, String value2) {
            addCriterion("stCode between", value1, value2, "stCode");
            return (Criteria) this;
        }

        public Criteria andStCodeNotBetween(String value1, String value2) {
            addCriterion("stCode not between", value1, value2, "stCode");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNull() {
            addCriterion("startNumber is null");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNotNull() {
            addCriterion("startNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumberEqualTo(Integer value) {
            addCriterion("startNumber =", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotEqualTo(Integer value) {
            addCriterion("startNumber <>", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThan(Integer value) {
            addCriterion("startNumber >", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("startNumber >=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThan(Integer value) {
            addCriterion("startNumber <", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("startNumber <=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberIn(List<Integer> values) {
            addCriterion("startNumber in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotIn(List<Integer> values) {
            addCriterion("startNumber not in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberBetween(Integer value1, Integer value2) {
            addCriterion("startNumber between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("startNumber not between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNull() {
            addCriterion("endNumber is null");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNotNull() {
            addCriterion("endNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEndNumberEqualTo(Integer value) {
            addCriterion("endNumber =", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotEqualTo(Integer value) {
            addCriterion("endNumber <>", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThan(Integer value) {
            addCriterion("endNumber >", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("endNumber >=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThan(Integer value) {
            addCriterion("endNumber <", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThanOrEqualTo(Integer value) {
            addCriterion("endNumber <=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIn(List<Integer> values) {
            addCriterion("endNumber in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotIn(List<Integer> values) {
            addCriterion("endNumber not in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberBetween(Integer value1, Integer value2) {
            addCriterion("endNumber between", value1, value2, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("endNumber not between", value1, value2, "endNumber");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
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