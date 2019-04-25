package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeaccountExample() {
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

        public Criteria andEmpNameIsNull() {
            addCriterion("empName is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("empName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("empName =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("empName <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("empName >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("empName >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("empName <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("empName <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("empName like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("empName not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("empName in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("empName not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("empName between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("empName not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andClLoginIsNull() {
            addCriterion("clLogin is null");
            return (Criteria) this;
        }

        public Criteria andClLoginIsNotNull() {
            addCriterion("clLogin is not null");
            return (Criteria) this;
        }

        public Criteria andClLoginEqualTo(String value) {
            addCriterion("clLogin =", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginNotEqualTo(String value) {
            addCriterion("clLogin <>", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginGreaterThan(String value) {
            addCriterion("clLogin >", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginGreaterThanOrEqualTo(String value) {
            addCriterion("clLogin >=", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginLessThan(String value) {
            addCriterion("clLogin <", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginLessThanOrEqualTo(String value) {
            addCriterion("clLogin <=", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginLike(String value) {
            addCriterion("clLogin like", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginNotLike(String value) {
            addCriterion("clLogin not like", value, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginIn(List<String> values) {
            addCriterion("clLogin in", values, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginNotIn(List<String> values) {
            addCriterion("clLogin not in", values, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginBetween(String value1, String value2) {
            addCriterion("clLogin between", value1, value2, "clLogin");
            return (Criteria) this;
        }

        public Criteria andClLoginNotBetween(String value1, String value2) {
            addCriterion("clLogin not between", value1, value2, "clLogin");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNull() {
            addCriterion("empNumber is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNotNull() {
            addCriterion("empNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberEqualTo(String value) {
            addCriterion("empNumber =", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotEqualTo(String value) {
            addCriterion("empNumber <>", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThan(String value) {
            addCriterion("empNumber >", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("empNumber >=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThan(String value) {
            addCriterion("empNumber <", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("empNumber <=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLike(String value) {
            addCriterion("empNumber like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotLike(String value) {
            addCriterion("empNumber not like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIn(List<String> values) {
            addCriterion("empNumber in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotIn(List<String> values) {
            addCriterion("empNumber not in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberBetween(String value1, String value2) {
            addCriterion("empNumber between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotBetween(String value1, String value2) {
            addCriterion("empNumber not between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("departId is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("departId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(Integer value) {
            addCriterion("departId =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(Integer value) {
            addCriterion("departId <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(Integer value) {
            addCriterion("departId >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departId >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(Integer value) {
            addCriterion("departId <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("departId <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<Integer> values) {
            addCriterion("departId in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<Integer> values) {
            addCriterion("departId not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("departId between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departId not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNull() {
            addCriterion("empPosition is null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNotNull() {
            addCriterion("empPosition is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionEqualTo(String value) {
            addCriterion("empPosition =", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotEqualTo(String value) {
            addCriterion("empPosition <>", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThan(String value) {
            addCriterion("empPosition >", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThanOrEqualTo(String value) {
            addCriterion("empPosition >=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThan(String value) {
            addCriterion("empPosition <", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThanOrEqualTo(String value) {
            addCriterion("empPosition <=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLike(String value) {
            addCriterion("empPosition like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotLike(String value) {
            addCriterion("empPosition not like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIn(List<String> values) {
            addCriterion("empPosition in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotIn(List<String> values) {
            addCriterion("empPosition not in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionBetween(String value1, String value2) {
            addCriterion("empPosition between", value1, value2, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotBetween(String value1, String value2) {
            addCriterion("empPosition not between", value1, value2, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("empPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("empPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("empPhone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("empPhone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("empPhone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("empPhone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("empPhone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("empPhone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("empPhone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("empPhone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("empPhone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("empPhone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("empPhone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("empPhone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionIsNull() {
            addCriterion("empJulisdiction is null");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionIsNotNull() {
            addCriterion("empJulisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionEqualTo(String value) {
            addCriterion("empJulisdiction =", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionNotEqualTo(String value) {
            addCriterion("empJulisdiction <>", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionGreaterThan(String value) {
            addCriterion("empJulisdiction >", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("empJulisdiction >=", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionLessThan(String value) {
            addCriterion("empJulisdiction <", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionLessThanOrEqualTo(String value) {
            addCriterion("empJulisdiction <=", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionLike(String value) {
            addCriterion("empJulisdiction like", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionNotLike(String value) {
            addCriterion("empJulisdiction not like", value, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionIn(List<String> values) {
            addCriterion("empJulisdiction in", values, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionNotIn(List<String> values) {
            addCriterion("empJulisdiction not in", values, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionBetween(String value1, String value2) {
            addCriterion("empJulisdiction between", value1, value2, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andEmpJulisdictionNotBetween(String value1, String value2) {
            addCriterion("empJulisdiction not between", value1, value2, "empJulisdiction");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("roleId <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("empStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("empStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(Integer value) {
            addCriterion("empStatus =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(Integer value) {
            addCriterion("empStatus <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(Integer value) {
            addCriterion("empStatus >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("empStatus >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(Integer value) {
            addCriterion("empStatus <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("empStatus <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<Integer> values) {
            addCriterion("empStatus in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<Integer> values) {
            addCriterion("empStatus not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(Integer value1, Integer value2) {
            addCriterion("empStatus between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("empStatus not between", value1, value2, "empStatus");
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