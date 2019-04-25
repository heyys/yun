package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSuNameIsNull() {
            addCriterion("suName is null");
            return (Criteria) this;
        }

        public Criteria andSuNameIsNotNull() {
            addCriterion("suName is not null");
            return (Criteria) this;
        }

        public Criteria andSuNameEqualTo(String value) {
            addCriterion("suName =", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotEqualTo(String value) {
            addCriterion("suName <>", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThan(String value) {
            addCriterion("suName >", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThanOrEqualTo(String value) {
            addCriterion("suName >=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThan(String value) {
            addCriterion("suName <", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThanOrEqualTo(String value) {
            addCriterion("suName <=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLike(String value) {
            addCriterion("suName like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotLike(String value) {
            addCriterion("suName not like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameIn(List<String> values) {
            addCriterion("suName in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotIn(List<String> values) {
            addCriterion("suName not in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameBetween(String value1, String value2) {
            addCriterion("suName between", value1, value2, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotBetween(String value1, String value2) {
            addCriterion("suName not between", value1, value2, "suName");
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

        public Criteria andSuContactIsNull() {
            addCriterion("suContact is null");
            return (Criteria) this;
        }

        public Criteria andSuContactIsNotNull() {
            addCriterion("suContact is not null");
            return (Criteria) this;
        }

        public Criteria andSuContactEqualTo(String value) {
            addCriterion("suContact =", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactNotEqualTo(String value) {
            addCriterion("suContact <>", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactGreaterThan(String value) {
            addCriterion("suContact >", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactGreaterThanOrEqualTo(String value) {
            addCriterion("suContact >=", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactLessThan(String value) {
            addCriterion("suContact <", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactLessThanOrEqualTo(String value) {
            addCriterion("suContact <=", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactLike(String value) {
            addCriterion("suContact like", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactNotLike(String value) {
            addCriterion("suContact not like", value, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactIn(List<String> values) {
            addCriterion("suContact in", values, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactNotIn(List<String> values) {
            addCriterion("suContact not in", values, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactBetween(String value1, String value2) {
            addCriterion("suContact between", value1, value2, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuContactNotBetween(String value1, String value2) {
            addCriterion("suContact not between", value1, value2, "suContact");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNull() {
            addCriterion("suMobile is null");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNotNull() {
            addCriterion("suMobile is not null");
            return (Criteria) this;
        }

        public Criteria andSuMobileEqualTo(String value) {
            addCriterion("suMobile =", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotEqualTo(String value) {
            addCriterion("suMobile <>", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThan(String value) {
            addCriterion("suMobile >", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("suMobile >=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThan(String value) {
            addCriterion("suMobile <", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThanOrEqualTo(String value) {
            addCriterion("suMobile <=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLike(String value) {
            addCriterion("suMobile like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotLike(String value) {
            addCriterion("suMobile not like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileIn(List<String> values) {
            addCriterion("suMobile in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotIn(List<String> values) {
            addCriterion("suMobile not in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileBetween(String value1, String value2) {
            addCriterion("suMobile between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotBetween(String value1, String value2) {
            addCriterion("suMobile not between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIsNull() {
            addCriterion("suPhone is null");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIsNotNull() {
            addCriterion("suPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSuPhoneEqualTo(String value) {
            addCriterion("suPhone =", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotEqualTo(String value) {
            addCriterion("suPhone <>", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneGreaterThan(String value) {
            addCriterion("suPhone >", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("suPhone >=", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLessThan(String value) {
            addCriterion("suPhone <", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLessThanOrEqualTo(String value) {
            addCriterion("suPhone <=", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneLike(String value) {
            addCriterion("suPhone like", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotLike(String value) {
            addCriterion("suPhone not like", value, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneIn(List<String> values) {
            addCriterion("suPhone in", values, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotIn(List<String> values) {
            addCriterion("suPhone not in", values, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneBetween(String value1, String value2) {
            addCriterion("suPhone between", value1, value2, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuPhoneNotBetween(String value1, String value2) {
            addCriterion("suPhone not between", value1, value2, "suPhone");
            return (Criteria) this;
        }

        public Criteria andSuAddressIsNull() {
            addCriterion("suAddress is null");
            return (Criteria) this;
        }

        public Criteria andSuAddressIsNotNull() {
            addCriterion("suAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSuAddressEqualTo(String value) {
            addCriterion("suAddress =", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotEqualTo(String value) {
            addCriterion("suAddress <>", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressGreaterThan(String value) {
            addCriterion("suAddress >", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("suAddress >=", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLessThan(String value) {
            addCriterion("suAddress <", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLessThanOrEqualTo(String value) {
            addCriterion("suAddress <=", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLike(String value) {
            addCriterion("suAddress like", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotLike(String value) {
            addCriterion("suAddress not like", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressIn(List<String> values) {
            addCriterion("suAddress in", values, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotIn(List<String> values) {
            addCriterion("suAddress not in", values, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressBetween(String value1, String value2) {
            addCriterion("suAddress between", value1, value2, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotBetween(String value1, String value2) {
            addCriterion("suAddress not between", value1, value2, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuRemarkIsNull() {
            addCriterion("suRemark is null");
            return (Criteria) this;
        }

        public Criteria andSuRemarkIsNotNull() {
            addCriterion("suRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSuRemarkEqualTo(String value) {
            addCriterion("suRemark =", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkNotEqualTo(String value) {
            addCriterion("suRemark <>", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkGreaterThan(String value) {
            addCriterion("suRemark >", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("suRemark >=", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkLessThan(String value) {
            addCriterion("suRemark <", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkLessThanOrEqualTo(String value) {
            addCriterion("suRemark <=", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkLike(String value) {
            addCriterion("suRemark like", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkNotLike(String value) {
            addCriterion("suRemark not like", value, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkIn(List<String> values) {
            addCriterion("suRemark in", values, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkNotIn(List<String> values) {
            addCriterion("suRemark not in", values, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkBetween(String value1, String value2) {
            addCriterion("suRemark between", value1, value2, "suRemark");
            return (Criteria) this;
        }

        public Criteria andSuRemarkNotBetween(String value1, String value2) {
            addCriterion("suRemark not between", value1, value2, "suRemark");
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