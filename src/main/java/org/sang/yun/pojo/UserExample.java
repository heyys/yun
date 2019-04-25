package org.sang.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAdCompanyNameIsNull() {
            addCriterion("adCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameIsNotNull() {
            addCriterion("adCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameEqualTo(String value) {
            addCriterion("adCompanyName =", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameNotEqualTo(String value) {
            addCriterion("adCompanyName <>", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameGreaterThan(String value) {
            addCriterion("adCompanyName >", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("adCompanyName >=", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameLessThan(String value) {
            addCriterion("adCompanyName <", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("adCompanyName <=", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameLike(String value) {
            addCriterion("adCompanyName like", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameNotLike(String value) {
            addCriterion("adCompanyName not like", value, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameIn(List<String> values) {
            addCriterion("adCompanyName in", values, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameNotIn(List<String> values) {
            addCriterion("adCompanyName not in", values, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameBetween(String value1, String value2) {
            addCriterion("adCompanyName between", value1, value2, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andAdCompanyNameNotBetween(String value1, String value2) {
            addCriterion("adCompanyName not between", value1, value2, "adCompanyName");
            return (Criteria) this;
        }

        public Criteria andClNameIsNull() {
            addCriterion("clName is null");
            return (Criteria) this;
        }

        public Criteria andClNameIsNotNull() {
            addCriterion("clName is not null");
            return (Criteria) this;
        }

        public Criteria andClNameEqualTo(String value) {
            addCriterion("clName =", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotEqualTo(String value) {
            addCriterion("clName <>", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameGreaterThan(String value) {
            addCriterion("clName >", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameGreaterThanOrEqualTo(String value) {
            addCriterion("clName >=", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLessThan(String value) {
            addCriterion("clName <", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLessThanOrEqualTo(String value) {
            addCriterion("clName <=", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameLike(String value) {
            addCriterion("clName like", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotLike(String value) {
            addCriterion("clName not like", value, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameIn(List<String> values) {
            addCriterion("clName in", values, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotIn(List<String> values) {
            addCriterion("clName not in", values, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameBetween(String value1, String value2) {
            addCriterion("clName between", value1, value2, "clName");
            return (Criteria) this;
        }

        public Criteria andClNameNotBetween(String value1, String value2) {
            addCriterion("clName not between", value1, value2, "clName");
            return (Criteria) this;
        }

        public Criteria andClPhoneIsNull() {
            addCriterion("clPhone is null");
            return (Criteria) this;
        }

        public Criteria andClPhoneIsNotNull() {
            addCriterion("clPhone is not null");
            return (Criteria) this;
        }

        public Criteria andClPhoneEqualTo(String value) {
            addCriterion("clPhone =", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneNotEqualTo(String value) {
            addCriterion("clPhone <>", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneGreaterThan(String value) {
            addCriterion("clPhone >", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("clPhone >=", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneLessThan(String value) {
            addCriterion("clPhone <", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneLessThanOrEqualTo(String value) {
            addCriterion("clPhone <=", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneLike(String value) {
            addCriterion("clPhone like", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneNotLike(String value) {
            addCriterion("clPhone not like", value, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneIn(List<String> values) {
            addCriterion("clPhone in", values, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneNotIn(List<String> values) {
            addCriterion("clPhone not in", values, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneBetween(String value1, String value2) {
            addCriterion("clPhone between", value1, value2, "clPhone");
            return (Criteria) this;
        }

        public Criteria andClPhoneNotBetween(String value1, String value2) {
            addCriterion("clPhone not between", value1, value2, "clPhone");
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

        public Criteria andClNumberIsNull() {
            addCriterion("clNumber is null");
            return (Criteria) this;
        }

        public Criteria andClNumberIsNotNull() {
            addCriterion("clNumber is not null");
            return (Criteria) this;
        }

        public Criteria andClNumberEqualTo(Integer value) {
            addCriterion("clNumber =", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberNotEqualTo(Integer value) {
            addCriterion("clNumber <>", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberGreaterThan(Integer value) {
            addCriterion("clNumber >", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("clNumber >=", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberLessThan(Integer value) {
            addCriterion("clNumber <", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberLessThanOrEqualTo(Integer value) {
            addCriterion("clNumber <=", value, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberIn(List<Integer> values) {
            addCriterion("clNumber in", values, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberNotIn(List<Integer> values) {
            addCriterion("clNumber not in", values, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberBetween(Integer value1, Integer value2) {
            addCriterion("clNumber between", value1, value2, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("clNumber not between", value1, value2, "clNumber");
            return (Criteria) this;
        }

        public Criteria andClWareHouseIsNull() {
            addCriterion("clWareHouse is null");
            return (Criteria) this;
        }

        public Criteria andClWareHouseIsNotNull() {
            addCriterion("clWareHouse is not null");
            return (Criteria) this;
        }

        public Criteria andClWareHouseEqualTo(String value) {
            addCriterion("clWareHouse =", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseNotEqualTo(String value) {
            addCriterion("clWareHouse <>", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseGreaterThan(String value) {
            addCriterion("clWareHouse >", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseGreaterThanOrEqualTo(String value) {
            addCriterion("clWareHouse >=", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseLessThan(String value) {
            addCriterion("clWareHouse <", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseLessThanOrEqualTo(String value) {
            addCriterion("clWareHouse <=", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseLike(String value) {
            addCriterion("clWareHouse like", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseNotLike(String value) {
            addCriterion("clWareHouse not like", value, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseIn(List<String> values) {
            addCriterion("clWareHouse in", values, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseNotIn(List<String> values) {
            addCriterion("clWareHouse not in", values, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseBetween(String value1, String value2) {
            addCriterion("clWareHouse between", value1, value2, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClWareHouseNotBetween(String value1, String value2) {
            addCriterion("clWareHouse not between", value1, value2, "clWareHouse");
            return (Criteria) this;
        }

        public Criteria andClArealIsNull() {
            addCriterion("clAreal is null");
            return (Criteria) this;
        }

        public Criteria andClArealIsNotNull() {
            addCriterion("clAreal is not null");
            return (Criteria) this;
        }

        public Criteria andClArealEqualTo(Integer value) {
            addCriterion("clAreal =", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealNotEqualTo(Integer value) {
            addCriterion("clAreal <>", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealGreaterThan(Integer value) {
            addCriterion("clAreal >", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealGreaterThanOrEqualTo(Integer value) {
            addCriterion("clAreal >=", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealLessThan(Integer value) {
            addCriterion("clAreal <", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealLessThanOrEqualTo(Integer value) {
            addCriterion("clAreal <=", value, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealIn(List<Integer> values) {
            addCriterion("clAreal in", values, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealNotIn(List<Integer> values) {
            addCriterion("clAreal not in", values, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealBetween(Integer value1, Integer value2) {
            addCriterion("clAreal between", value1, value2, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClArealNotBetween(Integer value1, Integer value2) {
            addCriterion("clAreal not between", value1, value2, "clAreal");
            return (Criteria) this;
        }

        public Criteria andClRegionIsNull() {
            addCriterion("clRegion is null");
            return (Criteria) this;
        }

        public Criteria andClRegionIsNotNull() {
            addCriterion("clRegion is not null");
            return (Criteria) this;
        }

        public Criteria andClRegionEqualTo(String value) {
            addCriterion("clRegion =", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionNotEqualTo(String value) {
            addCriterion("clRegion <>", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionGreaterThan(String value) {
            addCriterion("clRegion >", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionGreaterThanOrEqualTo(String value) {
            addCriterion("clRegion >=", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionLessThan(String value) {
            addCriterion("clRegion <", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionLessThanOrEqualTo(String value) {
            addCriterion("clRegion <=", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionLike(String value) {
            addCriterion("clRegion like", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionNotLike(String value) {
            addCriterion("clRegion not like", value, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionIn(List<String> values) {
            addCriterion("clRegion in", values, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionNotIn(List<String> values) {
            addCriterion("clRegion not in", values, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionBetween(String value1, String value2) {
            addCriterion("clRegion between", value1, value2, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClRegionNotBetween(String value1, String value2) {
            addCriterion("clRegion not between", value1, value2, "clRegion");
            return (Criteria) this;
        }

        public Criteria andClAddressIsNull() {
            addCriterion("clAddress is null");
            return (Criteria) this;
        }

        public Criteria andClAddressIsNotNull() {
            addCriterion("clAddress is not null");
            return (Criteria) this;
        }

        public Criteria andClAddressEqualTo(String value) {
            addCriterion("clAddress =", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressNotEqualTo(String value) {
            addCriterion("clAddress <>", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressGreaterThan(String value) {
            addCriterion("clAddress >", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressGreaterThanOrEqualTo(String value) {
            addCriterion("clAddress >=", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressLessThan(String value) {
            addCriterion("clAddress <", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressLessThanOrEqualTo(String value) {
            addCriterion("clAddress <=", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressLike(String value) {
            addCriterion("clAddress like", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressNotLike(String value) {
            addCriterion("clAddress not like", value, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressIn(List<String> values) {
            addCriterion("clAddress in", values, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressNotIn(List<String> values) {
            addCriterion("clAddress not in", values, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressBetween(String value1, String value2) {
            addCriterion("clAddress between", value1, value2, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClAddressNotBetween(String value1, String value2) {
            addCriterion("clAddress not between", value1, value2, "clAddress");
            return (Criteria) this;
        }

        public Criteria andClPostCodeIsNull() {
            addCriterion("clPostCode is null");
            return (Criteria) this;
        }

        public Criteria andClPostCodeIsNotNull() {
            addCriterion("clPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andClPostCodeEqualTo(Integer value) {
            addCriterion("clPostCode =", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeNotEqualTo(Integer value) {
            addCriterion("clPostCode <>", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeGreaterThan(Integer value) {
            addCriterion("clPostCode >", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clPostCode >=", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeLessThan(Integer value) {
            addCriterion("clPostCode <", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeLessThanOrEqualTo(Integer value) {
            addCriterion("clPostCode <=", value, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeIn(List<Integer> values) {
            addCriterion("clPostCode in", values, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeNotIn(List<Integer> values) {
            addCriterion("clPostCode not in", values, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeBetween(Integer value1, Integer value2) {
            addCriterion("clPostCode between", value1, value2, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClPostCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("clPostCode not between", value1, value2, "clPostCode");
            return (Criteria) this;
        }

        public Criteria andClAdIdIsNull() {
            addCriterion("clAdId is null");
            return (Criteria) this;
        }

        public Criteria andClAdIdIsNotNull() {
            addCriterion("clAdId is not null");
            return (Criteria) this;
        }

        public Criteria andClAdIdEqualTo(Integer value) {
            addCriterion("clAdId =", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdNotEqualTo(Integer value) {
            addCriterion("clAdId <>", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdGreaterThan(Integer value) {
            addCriterion("clAdId >", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clAdId >=", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdLessThan(Integer value) {
            addCriterion("clAdId <", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("clAdId <=", value, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdIn(List<Integer> values) {
            addCriterion("clAdId in", values, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdNotIn(List<Integer> values) {
            addCriterion("clAdId not in", values, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdBetween(Integer value1, Integer value2) {
            addCriterion("clAdId between", value1, value2, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clAdId not between", value1, value2, "clAdId");
            return (Criteria) this;
        }

        public Criteria andClMassageqIsNull() {
            addCriterion("clMassageq is null");
            return (Criteria) this;
        }

        public Criteria andClMassageqIsNotNull() {
            addCriterion("clMassageq is not null");
            return (Criteria) this;
        }

        public Criteria andClMassageqEqualTo(String value) {
            addCriterion("clMassageq =", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqNotEqualTo(String value) {
            addCriterion("clMassageq <>", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqGreaterThan(String value) {
            addCriterion("clMassageq >", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqGreaterThanOrEqualTo(String value) {
            addCriterion("clMassageq >=", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqLessThan(String value) {
            addCriterion("clMassageq <", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqLessThanOrEqualTo(String value) {
            addCriterion("clMassageq <=", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqLike(String value) {
            addCriterion("clMassageq like", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqNotLike(String value) {
            addCriterion("clMassageq not like", value, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqIn(List<String> values) {
            addCriterion("clMassageq in", values, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqNotIn(List<String> values) {
            addCriterion("clMassageq not in", values, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqBetween(String value1, String value2) {
            addCriterion("clMassageq between", value1, value2, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClMassageqNotBetween(String value1, String value2) {
            addCriterion("clMassageq not between", value1, value2, "clMassageq");
            return (Criteria) this;
        }

        public Criteria andClFileIsNull() {
            addCriterion("clFile is null");
            return (Criteria) this;
        }

        public Criteria andClFileIsNotNull() {
            addCriterion("clFile is not null");
            return (Criteria) this;
        }

        public Criteria andClFileEqualTo(String value) {
            addCriterion("clFile =", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileNotEqualTo(String value) {
            addCriterion("clFile <>", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileGreaterThan(String value) {
            addCriterion("clFile >", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileGreaterThanOrEqualTo(String value) {
            addCriterion("clFile >=", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileLessThan(String value) {
            addCriterion("clFile <", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileLessThanOrEqualTo(String value) {
            addCriterion("clFile <=", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileLike(String value) {
            addCriterion("clFile like", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileNotLike(String value) {
            addCriterion("clFile not like", value, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileIn(List<String> values) {
            addCriterion("clFile in", values, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileNotIn(List<String> values) {
            addCriterion("clFile not in", values, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileBetween(String value1, String value2) {
            addCriterion("clFile between", value1, value2, "clFile");
            return (Criteria) this;
        }

        public Criteria andClFileNotBetween(String value1, String value2) {
            addCriterion("clFile not between", value1, value2, "clFile");
            return (Criteria) this;
        }

        public Criteria andClContactsIsNull() {
            addCriterion("clContacts is null");
            return (Criteria) this;
        }

        public Criteria andClContactsIsNotNull() {
            addCriterion("clContacts is not null");
            return (Criteria) this;
        }

        public Criteria andClContactsEqualTo(String value) {
            addCriterion("clContacts =", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsNotEqualTo(String value) {
            addCriterion("clContacts <>", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsGreaterThan(String value) {
            addCriterion("clContacts >", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsGreaterThanOrEqualTo(String value) {
            addCriterion("clContacts >=", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsLessThan(String value) {
            addCriterion("clContacts <", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsLessThanOrEqualTo(String value) {
            addCriterion("clContacts <=", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsLike(String value) {
            addCriterion("clContacts like", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsNotLike(String value) {
            addCriterion("clContacts not like", value, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsIn(List<String> values) {
            addCriterion("clContacts in", values, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsNotIn(List<String> values) {
            addCriterion("clContacts not in", values, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsBetween(String value1, String value2) {
            addCriterion("clContacts between", value1, value2, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClContactsNotBetween(String value1, String value2) {
            addCriterion("clContacts not between", value1, value2, "clContacts");
            return (Criteria) this;
        }

        public Criteria andClPositionIsNull() {
            addCriterion("clPosition is null");
            return (Criteria) this;
        }

        public Criteria andClPositionIsNotNull() {
            addCriterion("clPosition is not null");
            return (Criteria) this;
        }

        public Criteria andClPositionEqualTo(String value) {
            addCriterion("clPosition =", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionNotEqualTo(String value) {
            addCriterion("clPosition <>", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionGreaterThan(String value) {
            addCriterion("clPosition >", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionGreaterThanOrEqualTo(String value) {
            addCriterion("clPosition >=", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionLessThan(String value) {
            addCriterion("clPosition <", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionLessThanOrEqualTo(String value) {
            addCriterion("clPosition <=", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionLike(String value) {
            addCriterion("clPosition like", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionNotLike(String value) {
            addCriterion("clPosition not like", value, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionIn(List<String> values) {
            addCriterion("clPosition in", values, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionNotIn(List<String> values) {
            addCriterion("clPosition not in", values, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionBetween(String value1, String value2) {
            addCriterion("clPosition between", value1, value2, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClPositionNotBetween(String value1, String value2) {
            addCriterion("clPosition not between", value1, value2, "clPosition");
            return (Criteria) this;
        }

        public Criteria andClTelephoneIsNull() {
            addCriterion("clTelephone is null");
            return (Criteria) this;
        }

        public Criteria andClTelephoneIsNotNull() {
            addCriterion("clTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andClTelephoneEqualTo(String value) {
            addCriterion("clTelephone =", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneNotEqualTo(String value) {
            addCriterion("clTelephone <>", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneGreaterThan(String value) {
            addCriterion("clTelephone >", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("clTelephone >=", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneLessThan(String value) {
            addCriterion("clTelephone <", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneLessThanOrEqualTo(String value) {
            addCriterion("clTelephone <=", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneLike(String value) {
            addCriterion("clTelephone like", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneNotLike(String value) {
            addCriterion("clTelephone not like", value, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneIn(List<String> values) {
            addCriterion("clTelephone in", values, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneNotIn(List<String> values) {
            addCriterion("clTelephone not in", values, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneBetween(String value1, String value2) {
            addCriterion("clTelephone between", value1, value2, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClTelephoneNotBetween(String value1, String value2) {
            addCriterion("clTelephone not between", value1, value2, "clTelephone");
            return (Criteria) this;
        }

        public Criteria andClEmailIsNull() {
            addCriterion("clEmail is null");
            return (Criteria) this;
        }

        public Criteria andClEmailIsNotNull() {
            addCriterion("clEmail is not null");
            return (Criteria) this;
        }

        public Criteria andClEmailEqualTo(String value) {
            addCriterion("clEmail =", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailNotEqualTo(String value) {
            addCriterion("clEmail <>", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailGreaterThan(String value) {
            addCriterion("clEmail >", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailGreaterThanOrEqualTo(String value) {
            addCriterion("clEmail >=", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailLessThan(String value) {
            addCriterion("clEmail <", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailLessThanOrEqualTo(String value) {
            addCriterion("clEmail <=", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailLike(String value) {
            addCriterion("clEmail like", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailNotLike(String value) {
            addCriterion("clEmail not like", value, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailIn(List<String> values) {
            addCriterion("clEmail in", values, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailNotIn(List<String> values) {
            addCriterion("clEmail not in", values, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailBetween(String value1, String value2) {
            addCriterion("clEmail between", value1, value2, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClEmailNotBetween(String value1, String value2) {
            addCriterion("clEmail not between", value1, value2, "clEmail");
            return (Criteria) this;
        }

        public Criteria andClQQIsNull() {
            addCriterion("clQQ is null");
            return (Criteria) this;
        }

        public Criteria andClQQIsNotNull() {
            addCriterion("clQQ is not null");
            return (Criteria) this;
        }

        public Criteria andClQQEqualTo(String value) {
            addCriterion("clQQ =", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQNotEqualTo(String value) {
            addCriterion("clQQ <>", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQGreaterThan(String value) {
            addCriterion("clQQ >", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQGreaterThanOrEqualTo(String value) {
            addCriterion("clQQ >=", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQLessThan(String value) {
            addCriterion("clQQ <", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQLessThanOrEqualTo(String value) {
            addCriterion("clQQ <=", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQLike(String value) {
            addCriterion("clQQ like", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQNotLike(String value) {
            addCriterion("clQQ not like", value, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQIn(List<String> values) {
            addCriterion("clQQ in", values, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQNotIn(List<String> values) {
            addCriterion("clQQ not in", values, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQBetween(String value1, String value2) {
            addCriterion("clQQ between", value1, value2, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClQQNotBetween(String value1, String value2) {
            addCriterion("clQQ not between", value1, value2, "clQQ");
            return (Criteria) this;
        }

        public Criteria andClStatusIsNull() {
            addCriterion("clStatus is null");
            return (Criteria) this;
        }

        public Criteria andClStatusIsNotNull() {
            addCriterion("clStatus is not null");
            return (Criteria) this;
        }

        public Criteria andClStatusEqualTo(Integer value) {
            addCriterion("clStatus =", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotEqualTo(Integer value) {
            addCriterion("clStatus <>", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusGreaterThan(Integer value) {
            addCriterion("clStatus >", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("clStatus >=", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusLessThan(Integer value) {
            addCriterion("clStatus <", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusLessThanOrEqualTo(Integer value) {
            addCriterion("clStatus <=", value, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusIn(List<Integer> values) {
            addCriterion("clStatus in", values, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotIn(List<Integer> values) {
            addCriterion("clStatus not in", values, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusBetween(Integer value1, Integer value2) {
            addCriterion("clStatus between", value1, value2, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("clStatus not between", value1, value2, "clStatus");
            return (Criteria) this;
        }

        public Criteria andClPassWordIsNull() {
            addCriterion("clPassWord is null");
            return (Criteria) this;
        }

        public Criteria andClPassWordIsNotNull() {
            addCriterion("clPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andClPassWordEqualTo(String value) {
            addCriterion("clPassWord =", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordNotEqualTo(String value) {
            addCriterion("clPassWord <>", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordGreaterThan(String value) {
            addCriterion("clPassWord >", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("clPassWord >=", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordLessThan(String value) {
            addCriterion("clPassWord <", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordLessThanOrEqualTo(String value) {
            addCriterion("clPassWord <=", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordLike(String value) {
            addCriterion("clPassWord like", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordNotLike(String value) {
            addCriterion("clPassWord not like", value, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordIn(List<String> values) {
            addCriterion("clPassWord in", values, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordNotIn(List<String> values) {
            addCriterion("clPassWord not in", values, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordBetween(String value1, String value2) {
            addCriterion("clPassWord between", value1, value2, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClPassWordNotBetween(String value1, String value2) {
            addCriterion("clPassWord not between", value1, value2, "clPassWord");
            return (Criteria) this;
        }

        public Criteria andClTypeIsNull() {
            addCriterion("clType is null");
            return (Criteria) this;
        }

        public Criteria andClTypeIsNotNull() {
            addCriterion("clType is not null");
            return (Criteria) this;
        }

        public Criteria andClTypeEqualTo(Integer value) {
            addCriterion("clType =", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotEqualTo(Integer value) {
            addCriterion("clType <>", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeGreaterThan(Integer value) {
            addCriterion("clType >", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clType >=", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeLessThan(Integer value) {
            addCriterion("clType <", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeLessThanOrEqualTo(Integer value) {
            addCriterion("clType <=", value, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeIn(List<Integer> values) {
            addCriterion("clType in", values, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotIn(List<Integer> values) {
            addCriterion("clType not in", values, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeBetween(Integer value1, Integer value2) {
            addCriterion("clType between", value1, value2, "clType");
            return (Criteria) this;
        }

        public Criteria andClTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("clType not between", value1, value2, "clType");
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