package org.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TztwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TztwExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNamevIsNull() {
            addCriterion("namev is null");
            return (Criteria) this;
        }

        public Criteria andNamevIsNotNull() {
            addCriterion("namev is not null");
            return (Criteria) this;
        }

        public Criteria andNamevEqualTo(String value) {
            addCriterion("namev =", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevNotEqualTo(String value) {
            addCriterion("namev <>", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevGreaterThan(String value) {
            addCriterion("namev >", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevGreaterThanOrEqualTo(String value) {
            addCriterion("namev >=", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevLessThan(String value) {
            addCriterion("namev <", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevLessThanOrEqualTo(String value) {
            addCriterion("namev <=", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevLike(String value) {
            addCriterion("namev like", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevNotLike(String value) {
            addCriterion("namev not like", value, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevIn(List<String> values) {
            addCriterion("namev in", values, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevNotIn(List<String> values) {
            addCriterion("namev not in", values, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevBetween(String value1, String value2) {
            addCriterion("namev between", value1, value2, "namev");
            return (Criteria) this;
        }

        public Criteria andNamevNotBetween(String value1, String value2) {
            addCriterion("namev not between", value1, value2, "namev");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNull() {
            addCriterion("uploadpath is null");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNotNull() {
            addCriterion("uploadpath is not null");
            return (Criteria) this;
        }

        public Criteria andUploadpathEqualTo(String value) {
            addCriterion("uploadpath =", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotEqualTo(String value) {
            addCriterion("uploadpath <>", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThan(String value) {
            addCriterion("uploadpath >", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("uploadpath >=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThan(String value) {
            addCriterion("uploadpath <", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThanOrEqualTo(String value) {
            addCriterion("uploadpath <=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLike(String value) {
            addCriterion("uploadpath like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotLike(String value) {
            addCriterion("uploadpath not like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathIn(List<String> values) {
            addCriterion("uploadpath in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotIn(List<String> values) {
            addCriterion("uploadpath not in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathBetween(String value1, String value2) {
            addCriterion("uploadpath between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotBetween(String value1, String value2) {
            addCriterion("uploadpath not between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andStanameIsNull() {
            addCriterion("staname is null");
            return (Criteria) this;
        }

        public Criteria andStanameIsNotNull() {
            addCriterion("staname is not null");
            return (Criteria) this;
        }

        public Criteria andStanameEqualTo(String value) {
            addCriterion("staname =", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotEqualTo(String value) {
            addCriterion("staname <>", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThan(String value) {
            addCriterion("staname >", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThanOrEqualTo(String value) {
            addCriterion("staname >=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThan(String value) {
            addCriterion("staname <", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThanOrEqualTo(String value) {
            addCriterion("staname <=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLike(String value) {
            addCriterion("staname like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotLike(String value) {
            addCriterion("staname not like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameIn(List<String> values) {
            addCriterion("staname in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotIn(List<String> values) {
            addCriterion("staname not in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameBetween(String value1, String value2) {
            addCriterion("staname between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotBetween(String value1, String value2) {
            addCriterion("staname not between", value1, value2, "staname");
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

        public Criteria andTaizhenEqualTo(Integer value) {
            addCriterion("taizhen =", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotEqualTo(Integer value) {
            addCriterion("taizhen <>", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenGreaterThan(Integer value) {
            addCriterion("taizhen >", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenGreaterThanOrEqualTo(Integer value) {
            addCriterion("taizhen >=", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenLessThan(Integer value) {
            addCriterion("taizhen <", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenLessThanOrEqualTo(Integer value) {
            addCriterion("taizhen <=", value, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenIn(List<Integer> values) {
            addCriterion("taizhen in", values, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotIn(List<Integer> values) {
            addCriterion("taizhen not in", values, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenBetween(Integer value1, Integer value2) {
            addCriterion("taizhen between", value1, value2, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTaizhenNotBetween(Integer value1, Integer value2) {
            addCriterion("taizhen not between", value1, value2, "taizhen");
            return (Criteria) this;
        }

        public Criteria andTwnameIsNull() {
            addCriterion("twname is null");
            return (Criteria) this;
        }

        public Criteria andTwnameIsNotNull() {
            addCriterion("twname is not null");
            return (Criteria) this;
        }

        public Criteria andTwnameEqualTo(String value) {
            addCriterion("twname =", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameNotEqualTo(String value) {
            addCriterion("twname <>", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameGreaterThan(String value) {
            addCriterion("twname >", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameGreaterThanOrEqualTo(String value) {
            addCriterion("twname >=", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameLessThan(String value) {
            addCriterion("twname <", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameLessThanOrEqualTo(String value) {
            addCriterion("twname <=", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameLike(String value) {
            addCriterion("twname like", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameNotLike(String value) {
            addCriterion("twname not like", value, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameIn(List<String> values) {
            addCriterion("twname in", values, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameNotIn(List<String> values) {
            addCriterion("twname not in", values, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameBetween(String value1, String value2) {
            addCriterion("twname between", value1, value2, "twname");
            return (Criteria) this;
        }

        public Criteria andTwnameNotBetween(String value1, String value2) {
            addCriterion("twname not between", value1, value2, "twname");
            return (Criteria) this;
        }

        public Criteria andDatypeIsNull() {
            addCriterion("DAtype is null");
            return (Criteria) this;
        }

        public Criteria andDatypeIsNotNull() {
            addCriterion("DAtype is not null");
            return (Criteria) this;
        }

        public Criteria andDatypeEqualTo(String value) {
            addCriterion("DAtype =", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeNotEqualTo(String value) {
            addCriterion("DAtype <>", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeGreaterThan(String value) {
            addCriterion("DAtype >", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DAtype >=", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeLessThan(String value) {
            addCriterion("DAtype <", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeLessThanOrEqualTo(String value) {
            addCriterion("DAtype <=", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeLike(String value) {
            addCriterion("DAtype like", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeNotLike(String value) {
            addCriterion("DAtype not like", value, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeIn(List<String> values) {
            addCriterion("DAtype in", values, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeNotIn(List<String> values) {
            addCriterion("DAtype not in", values, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeBetween(String value1, String value2) {
            addCriterion("DAtype between", value1, value2, "datype");
            return (Criteria) this;
        }

        public Criteria andDatypeNotBetween(String value1, String value2) {
            addCriterion("DAtype not between", value1, value2, "datype");
            return (Criteria) this;
        }

        public Criteria andSampIsNull() {
            addCriterion("samp is null");
            return (Criteria) this;
        }

        public Criteria andSampIsNotNull() {
            addCriterion("samp is not null");
            return (Criteria) this;
        }

        public Criteria andSampEqualTo(Integer value) {
            addCriterion("samp =", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampNotEqualTo(Integer value) {
            addCriterion("samp <>", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampGreaterThan(Integer value) {
            addCriterion("samp >", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampGreaterThanOrEqualTo(Integer value) {
            addCriterion("samp >=", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampLessThan(Integer value) {
            addCriterion("samp <", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampLessThanOrEqualTo(Integer value) {
            addCriterion("samp <=", value, "samp");
            return (Criteria) this;
        }

        public Criteria andSampIn(List<Integer> values) {
            addCriterion("samp in", values, "samp");
            return (Criteria) this;
        }

        public Criteria andSampNotIn(List<Integer> values) {
            addCriterion("samp not in", values, "samp");
            return (Criteria) this;
        }

        public Criteria andSampBetween(Integer value1, Integer value2) {
            addCriterion("samp between", value1, value2, "samp");
            return (Criteria) this;
        }

        public Criteria andSampNotBetween(Integer value1, Integer value2) {
            addCriterion("samp not between", value1, value2, "samp");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("stype like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("stype not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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

        public Criteria andDatasecEqualTo(Integer value) {
            addCriterion("datasec =", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotEqualTo(Integer value) {
            addCriterion("datasec <>", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecGreaterThan(Integer value) {
            addCriterion("datasec >", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecGreaterThanOrEqualTo(Integer value) {
            addCriterion("datasec >=", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecLessThan(Integer value) {
            addCriterion("datasec <", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecLessThanOrEqualTo(Integer value) {
            addCriterion("datasec <=", value, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecIn(List<Integer> values) {
            addCriterion("datasec in", values, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotIn(List<Integer> values) {
            addCriterion("datasec not in", values, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecBetween(Integer value1, Integer value2) {
            addCriterion("datasec between", value1, value2, "datasec");
            return (Criteria) this;
        }

        public Criteria andDatasecNotBetween(Integer value1, Integer value2) {
            addCriterion("datasec not between", value1, value2, "datasec");
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