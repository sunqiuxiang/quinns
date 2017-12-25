package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdtwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdtwExample() {
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

        public Criteria andEvtflagIsNull() {
            addCriterion("evtflag is null");
            return (Criteria) this;
        }

        public Criteria andEvtflagIsNotNull() {
            addCriterion("evtflag is not null");
            return (Criteria) this;
        }

        public Criteria andEvtflagEqualTo(String value) {
            addCriterion("evtflag =", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagNotEqualTo(String value) {
            addCriterion("evtflag <>", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagGreaterThan(String value) {
            addCriterion("evtflag >", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagGreaterThanOrEqualTo(String value) {
            addCriterion("evtflag >=", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagLessThan(String value) {
            addCriterion("evtflag <", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagLessThanOrEqualTo(String value) {
            addCriterion("evtflag <=", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagLike(String value) {
            addCriterion("evtflag like", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagNotLike(String value) {
            addCriterion("evtflag not like", value, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagIn(List<String> values) {
            addCriterion("evtflag in", values, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagNotIn(List<String> values) {
            addCriterion("evtflag not in", values, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagBetween(String value1, String value2) {
            addCriterion("evtflag between", value1, value2, "evtflag");
            return (Criteria) this;
        }

        public Criteria andEvtflagNotBetween(String value1, String value2) {
            addCriterion("evtflag not between", value1, value2, "evtflag");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("doctype is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("doctype is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(Integer value) {
            addCriterion("doctype =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(Integer value) {
            addCriterion("doctype <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(Integer value) {
            addCriterion("doctype >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctype >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(Integer value) {
            addCriterion("doctype <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(Integer value) {
            addCriterion("doctype <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<Integer> values) {
            addCriterion("doctype in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<Integer> values) {
            addCriterion("doctype not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(Integer value1, Integer value2) {
            addCriterion("doctype between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(Integer value1, Integer value2) {
            addCriterion("doctype not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andStasumIsNull() {
            addCriterion("stasum is null");
            return (Criteria) this;
        }

        public Criteria andStasumIsNotNull() {
            addCriterion("stasum is not null");
            return (Criteria) this;
        }

        public Criteria andStasumEqualTo(Integer value) {
            addCriterion("stasum =", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumNotEqualTo(Integer value) {
            addCriterion("stasum <>", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumGreaterThan(Integer value) {
            addCriterion("stasum >", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stasum >=", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumLessThan(Integer value) {
            addCriterion("stasum <", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumLessThanOrEqualTo(Integer value) {
            addCriterion("stasum <=", value, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumIn(List<Integer> values) {
            addCriterion("stasum in", values, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumNotIn(List<Integer> values) {
            addCriterion("stasum not in", values, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumBetween(Integer value1, Integer value2) {
            addCriterion("stasum between", value1, value2, "stasum");
            return (Criteria) this;
        }

        public Criteria andStasumNotBetween(Integer value1, Integer value2) {
            addCriterion("stasum not between", value1, value2, "stasum");
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

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Float value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Float value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Float value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Float value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Float value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Float value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Float> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Float> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Float value1, Float value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Float value1, Float value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(Float value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(Float value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(Float value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(Float value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(Float value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(Float value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<Float> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<Float> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(Float value1, Float value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(Float value1, Float value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andHeiIsNull() {
            addCriterion("hei is null");
            return (Criteria) this;
        }

        public Criteria andHeiIsNotNull() {
            addCriterion("hei is not null");
            return (Criteria) this;
        }

        public Criteria andHeiEqualTo(Float value) {
            addCriterion("hei =", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiNotEqualTo(Float value) {
            addCriterion("hei <>", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiGreaterThan(Float value) {
            addCriterion("hei >", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiGreaterThanOrEqualTo(Float value) {
            addCriterion("hei >=", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiLessThan(Float value) {
            addCriterion("hei <", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiLessThanOrEqualTo(Float value) {
            addCriterion("hei <=", value, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiIn(List<Float> values) {
            addCriterion("hei in", values, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiNotIn(List<Float> values) {
            addCriterion("hei not in", values, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiBetween(Float value1, Float value2) {
            addCriterion("hei between", value1, value2, "hei");
            return (Criteria) this;
        }

        public Criteria andHeiNotBetween(Float value1, Float value2) {
            addCriterion("hei not between", value1, value2, "hei");
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

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeIsNull() {
            addCriterion("in_datetime is null");
            return (Criteria) this;
        }

        public Criteria andInDatetimeIsNotNull() {
            addCriterion("in_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andInDatetimeEqualTo(String value) {
            addCriterion("in_datetime =", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeNotEqualTo(String value) {
            addCriterion("in_datetime <>", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeGreaterThan(String value) {
            addCriterion("in_datetime >", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("in_datetime >=", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeLessThan(String value) {
            addCriterion("in_datetime <", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeLessThanOrEqualTo(String value) {
            addCriterion("in_datetime <=", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeLike(String value) {
            addCriterion("in_datetime like", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeNotLike(String value) {
            addCriterion("in_datetime not like", value, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeIn(List<String> values) {
            addCriterion("in_datetime in", values, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeNotIn(List<String> values) {
            addCriterion("in_datetime not in", values, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeBetween(String value1, String value2) {
            addCriterion("in_datetime between", value1, value2, "inDatetime");
            return (Criteria) this;
        }

        public Criteria andInDatetimeNotBetween(String value1, String value2) {
            addCriterion("in_datetime not between", value1, value2, "inDatetime");
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