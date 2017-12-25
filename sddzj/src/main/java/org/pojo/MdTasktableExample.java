package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdTasktableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdTasktableExample() {
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

        public Criteria andDepidIsNull() {
            addCriterion("DepID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("DepID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("DepID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("DepID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("DepID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("DepID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("DepID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("DepID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("DepID like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("DepID not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("DepID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("DepID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("DepID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("DepID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andTwUuidIsNull() {
            addCriterion("tw_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTwUuidIsNotNull() {
            addCriterion("tw_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTwUuidEqualTo(String value) {
            addCriterion("tw_uuid =", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidNotEqualTo(String value) {
            addCriterion("tw_uuid <>", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidGreaterThan(String value) {
            addCriterion("tw_uuid >", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidGreaterThanOrEqualTo(String value) {
            addCriterion("tw_uuid >=", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidLessThan(String value) {
            addCriterion("tw_uuid <", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidLessThanOrEqualTo(String value) {
            addCriterion("tw_uuid <=", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidLike(String value) {
            addCriterion("tw_uuid like", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidNotLike(String value) {
            addCriterion("tw_uuid not like", value, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidIn(List<String> values) {
            addCriterion("tw_uuid in", values, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidNotIn(List<String> values) {
            addCriterion("tw_uuid not in", values, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidBetween(String value1, String value2) {
            addCriterion("tw_uuid between", value1, value2, "twUuid");
            return (Criteria) this;
        }

        public Criteria andTwUuidNotBetween(String value1, String value2) {
            addCriterion("tw_uuid not between", value1, value2, "twUuid");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNull() {
            addCriterion("applyname is null");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNotNull() {
            addCriterion("applyname is not null");
            return (Criteria) this;
        }

        public Criteria andApplynameEqualTo(String value) {
            addCriterion("applyname =", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotEqualTo(String value) {
            addCriterion("applyname <>", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThan(String value) {
            addCriterion("applyname >", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThanOrEqualTo(String value) {
            addCriterion("applyname >=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThan(String value) {
            addCriterion("applyname <", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThanOrEqualTo(String value) {
            addCriterion("applyname <=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLike(String value) {
            addCriterion("applyname like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotLike(String value) {
            addCriterion("applyname not like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameIn(List<String> values) {
            addCriterion("applyname in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotIn(List<String> values) {
            addCriterion("applyname not in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameBetween(String value1, String value2) {
            addCriterion("applyname between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotBetween(String value1, String value2) {
            addCriterion("applyname not between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("deadline like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("deadline not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andTwNameIsNull() {
            addCriterion("tw_name is null");
            return (Criteria) this;
        }

        public Criteria andTwNameIsNotNull() {
            addCriterion("tw_name is not null");
            return (Criteria) this;
        }

        public Criteria andTwNameEqualTo(String value) {
            addCriterion("tw_name =", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameNotEqualTo(String value) {
            addCriterion("tw_name <>", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameGreaterThan(String value) {
            addCriterion("tw_name >", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameGreaterThanOrEqualTo(String value) {
            addCriterion("tw_name >=", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameLessThan(String value) {
            addCriterion("tw_name <", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameLessThanOrEqualTo(String value) {
            addCriterion("tw_name <=", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameLike(String value) {
            addCriterion("tw_name like", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameNotLike(String value) {
            addCriterion("tw_name not like", value, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameIn(List<String> values) {
            addCriterion("tw_name in", values, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameNotIn(List<String> values) {
            addCriterion("tw_name not in", values, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameBetween(String value1, String value2) {
            addCriterion("tw_name between", value1, value2, "twName");
            return (Criteria) this;
        }

        public Criteria andTwNameNotBetween(String value1, String value2) {
            addCriterion("tw_name not between", value1, value2, "twName");
            return (Criteria) this;
        }

        public Criteria andTzStanameIsNull() {
            addCriterion("tz_staname is null");
            return (Criteria) this;
        }

        public Criteria andTzStanameIsNotNull() {
            addCriterion("tz_staname is not null");
            return (Criteria) this;
        }

        public Criteria andTzStanameEqualTo(String value) {
            addCriterion("tz_staname =", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameNotEqualTo(String value) {
            addCriterion("tz_staname <>", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameGreaterThan(String value) {
            addCriterion("tz_staname >", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameGreaterThanOrEqualTo(String value) {
            addCriterion("tz_staname >=", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameLessThan(String value) {
            addCriterion("tz_staname <", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameLessThanOrEqualTo(String value) {
            addCriterion("tz_staname <=", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameLike(String value) {
            addCriterion("tz_staname like", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameNotLike(String value) {
            addCriterion("tz_staname not like", value, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameIn(List<String> values) {
            addCriterion("tz_staname in", values, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameNotIn(List<String> values) {
            addCriterion("tz_staname not in", values, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameBetween(String value1, String value2) {
            addCriterion("tz_staname between", value1, value2, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStanameNotBetween(String value1, String value2) {
            addCriterion("tz_staname not between", value1, value2, "tzStaname");
            return (Criteria) this;
        }

        public Criteria andTzStypeIsNull() {
            addCriterion("tz_stype is null");
            return (Criteria) this;
        }

        public Criteria andTzStypeIsNotNull() {
            addCriterion("tz_stype is not null");
            return (Criteria) this;
        }

        public Criteria andTzStypeEqualTo(String value) {
            addCriterion("tz_stype =", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeNotEqualTo(String value) {
            addCriterion("tz_stype <>", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeGreaterThan(String value) {
            addCriterion("tz_stype >", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeGreaterThanOrEqualTo(String value) {
            addCriterion("tz_stype >=", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeLessThan(String value) {
            addCriterion("tz_stype <", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeLessThanOrEqualTo(String value) {
            addCriterion("tz_stype <=", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeLike(String value) {
            addCriterion("tz_stype like", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeNotLike(String value) {
            addCriterion("tz_stype not like", value, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeIn(List<String> values) {
            addCriterion("tz_stype in", values, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeNotIn(List<String> values) {
            addCriterion("tz_stype not in", values, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeBetween(String value1, String value2) {
            addCriterion("tz_stype between", value1, value2, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTzStypeNotBetween(String value1, String value2) {
            addCriterion("tz_stype not between", value1, value2, "tzStype");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeIsNull() {
            addCriterion("tw_starttime is null");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeIsNotNull() {
            addCriterion("tw_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeEqualTo(String value) {
            addCriterion("tw_starttime =", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeNotEqualTo(String value) {
            addCriterion("tw_starttime <>", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeGreaterThan(String value) {
            addCriterion("tw_starttime >", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("tw_starttime >=", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeLessThan(String value) {
            addCriterion("tw_starttime <", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeLessThanOrEqualTo(String value) {
            addCriterion("tw_starttime <=", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeLike(String value) {
            addCriterion("tw_starttime like", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeNotLike(String value) {
            addCriterion("tw_starttime not like", value, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeIn(List<String> values) {
            addCriterion("tw_starttime in", values, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeNotIn(List<String> values) {
            addCriterion("tw_starttime not in", values, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeBetween(String value1, String value2) {
            addCriterion("tw_starttime between", value1, value2, "twStarttime");
            return (Criteria) this;
        }

        public Criteria andTwStarttimeNotBetween(String value1, String value2) {
            addCriterion("tw_starttime not between", value1, value2, "twStarttime");
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

        public Criteria andReviewedIsNull() {
            addCriterion("reviewed is null");
            return (Criteria) this;
        }

        public Criteria andReviewedIsNotNull() {
            addCriterion("reviewed is not null");
            return (Criteria) this;
        }

        public Criteria andReviewedEqualTo(String value) {
            addCriterion("reviewed =", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotEqualTo(String value) {
            addCriterion("reviewed <>", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThan(String value) {
            addCriterion("reviewed >", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThanOrEqualTo(String value) {
            addCriterion("reviewed >=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThan(String value) {
            addCriterion("reviewed <", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThanOrEqualTo(String value) {
            addCriterion("reviewed <=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLike(String value) {
            addCriterion("reviewed like", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotLike(String value) {
            addCriterion("reviewed not like", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedIn(List<String> values) {
            addCriterion("reviewed in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotIn(List<String> values) {
            addCriterion("reviewed not in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedBetween(String value1, String value2) {
            addCriterion("reviewed between", value1, value2, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotBetween(String value1, String value2) {
            addCriterion("reviewed not between", value1, value2, "reviewed");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applytime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applytime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(String value) {
            addCriterion("applytime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(String value) {
            addCriterion("applytime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(String value) {
            addCriterion("applytime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("applytime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(String value) {
            addCriterion("applytime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(String value) {
            addCriterion("applytime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLike(String value) {
            addCriterion("applytime like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotLike(String value) {
            addCriterion("applytime not like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<String> values) {
            addCriterion("applytime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<String> values) {
            addCriterion("applytime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(String value1, String value2) {
            addCriterion("applytime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(String value1, String value2) {
            addCriterion("applytime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathIsNull() {
            addCriterion("allfilepath is null");
            return (Criteria) this;
        }

        public Criteria andAllfilepathIsNotNull() {
            addCriterion("allfilepath is not null");
            return (Criteria) this;
        }

        public Criteria andAllfilepathEqualTo(String value) {
            addCriterion("allfilepath =", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathNotEqualTo(String value) {
            addCriterion("allfilepath <>", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathGreaterThan(String value) {
            addCriterion("allfilepath >", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("allfilepath >=", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathLessThan(String value) {
            addCriterion("allfilepath <", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathLessThanOrEqualTo(String value) {
            addCriterion("allfilepath <=", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathLike(String value) {
            addCriterion("allfilepath like", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathNotLike(String value) {
            addCriterion("allfilepath not like", value, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathIn(List<String> values) {
            addCriterion("allfilepath in", values, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathNotIn(List<String> values) {
            addCriterion("allfilepath not in", values, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathBetween(String value1, String value2) {
            addCriterion("allfilepath between", value1, value2, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andAllfilepathNotBetween(String value1, String value2) {
            addCriterion("allfilepath not between", value1, value2, "allfilepath");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andDatasecIsNull() {
            addCriterion("datasec is null");
            return (Criteria) this;
        }

        public Criteria andDatasecIsNotNull() {
            addCriterion("datasec is not null");
            return (Criteria) this;
        }

        public Criteria andDatasecEqualTo(String value) {
            addCriterion("datasec =", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotEqualTo(String value) {
            addCriterion("datasec <>", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecGreaterThan(String value) {
            addCriterion("datasec >", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecGreaterThanOrEqualTo(String value) {
            addCriterion("datasec >=", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecLessThan(String value) {
            addCriterion("datasec <", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecLessThanOrEqualTo(String value) {
            addCriterion("datasec <=", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecLike(String value) {
            addCriterion("datasec like", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotLike(String value) {
            addCriterion("datasec not like", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecIn(List<String> values) {
            addCriterion("datasec in", values, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotIn(List<String> values) {
            addCriterion("datasec not in", values, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecBetween(String value1, String value2) {
            addCriterion("datasec between", value1, value2, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotBetween(String value1, String value2) {
            addCriterion("datasec not between", value1, value2, "datasec");
            return (Criteria) this;
        }

        public Criteria andTaizhenIsNull() {
            addCriterion("taizhen is null");
            return (Criteria) this;
        }

        public Criteria andTaizhenIsNotNull() {
            addCriterion("taizhen is not null");
            return (Criteria) this;
        }

        public Criteria andTaizhenEqualTo(String value) {
            addCriterion("taizhen =", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotEqualTo(String value) {
            addCriterion("taizhen <>", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenGreaterThan(String value) {
            addCriterion("taizhen >", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenGreaterThanOrEqualTo(String value) {
            addCriterion("taizhen >=", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenLessThan(String value) {
            addCriterion("taizhen <", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenLessThanOrEqualTo(String value) {
            addCriterion("taizhen <=", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenLike(String value) {
            addCriterion("taizhen like", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotLike(String value) {
            addCriterion("taizhen not like", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenIn(List<String> values) {
            addCriterion("taizhen in", values, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotIn(List<String> values) {
            addCriterion("taizhen not in", values, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenBetween(String value1, String value2) {
            addCriterion("taizhen between", value1, value2, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotBetween(String value1, String value2) {
            addCriterion("taizhen not between", value1, value2, "taizhen");
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