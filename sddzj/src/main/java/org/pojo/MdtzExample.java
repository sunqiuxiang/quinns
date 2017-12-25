package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdtzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdtzExample() {
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

        public Criteria andStaidIsNull() {
            addCriterion("staid is null");
            return (Criteria) this;
        }

        public Criteria andStaidIsNotNull() {
            addCriterion("staid is not null");
            return (Criteria) this;
        }

        public Criteria andStaidEqualTo(Integer value) {
            addCriterion("staid =", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotEqualTo(Integer value) {
            addCriterion("staid <>", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThan(Integer value) {
            addCriterion("staid >", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staid >=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThan(Integer value) {
            addCriterion("staid <", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThanOrEqualTo(Integer value) {
            addCriterion("staid <=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidIn(List<Integer> values) {
            addCriterion("staid in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotIn(List<Integer> values) {
            addCriterion("staid not in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidBetween(Integer value1, Integer value2) {
            addCriterion("staid between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotBetween(Integer value1, Integer value2) {
            addCriterion("staid not between", value1, value2, "staid");
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

        public Criteria andDalenIsNull() {
            addCriterion("DAlen is null");
            return (Criteria) this;
        }

        public Criteria andDalenIsNotNull() {
            addCriterion("DAlen is not null");
            return (Criteria) this;
        }

        public Criteria andDalenEqualTo(Integer value) {
            addCriterion("DAlen =", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenNotEqualTo(Integer value) {
            addCriterion("DAlen <>", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenGreaterThan(Integer value) {
            addCriterion("DAlen >", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAlen >=", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenLessThan(Integer value) {
            addCriterion("DAlen <", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenLessThanOrEqualTo(Integer value) {
            addCriterion("DAlen <=", value, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenIn(List<Integer> values) {
            addCriterion("DAlen in", values, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenNotIn(List<Integer> values) {
            addCriterion("DAlen not in", values, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenBetween(Integer value1, Integer value2) {
            addCriterion("DAlen between", value1, value2, "dalen");
            return (Criteria) this;
        }

        public Criteria andDalenNotBetween(Integer value1, Integer value2) {
            addCriterion("DAlen not between", value1, value2, "dalen");
            return (Criteria) this;
        }

        public Criteria andVIsNull() {
            addCriterion("v is null");
            return (Criteria) this;
        }

        public Criteria andVIsNotNull() {
            addCriterion("v is not null");
            return (Criteria) this;
        }

        public Criteria andVEqualTo(Float value) {
            addCriterion("v =", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotEqualTo(Float value) {
            addCriterion("v <>", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThan(Float value) {
            addCriterion("v >", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThanOrEqualTo(Float value) {
            addCriterion("v >=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThan(Float value) {
            addCriterion("v <", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThanOrEqualTo(Float value) {
            addCriterion("v <=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVIn(List<Float> values) {
            addCriterion("v in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVNotIn(List<Float> values) {
            addCriterion("v not in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVBetween(Float value1, Float value2) {
            addCriterion("v between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVNotBetween(Float value1, Float value2) {
            addCriterion("v not between", value1, value2, "v");
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

        public Criteria andStacomIsNull() {
            addCriterion("stacom is null");
            return (Criteria) this;
        }

        public Criteria andStacomIsNotNull() {
            addCriterion("stacom is not null");
            return (Criteria) this;
        }

        public Criteria andStacomEqualTo(Integer value) {
            addCriterion("stacom =", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomNotEqualTo(Integer value) {
            addCriterion("stacom <>", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomGreaterThan(Integer value) {
            addCriterion("stacom >", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomGreaterThanOrEqualTo(Integer value) {
            addCriterion("stacom >=", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomLessThan(Integer value) {
            addCriterion("stacom <", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomLessThanOrEqualTo(Integer value) {
            addCriterion("stacom <=", value, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomIn(List<Integer> values) {
            addCriterion("stacom in", values, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomNotIn(List<Integer> values) {
            addCriterion("stacom not in", values, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomBetween(Integer value1, Integer value2) {
            addCriterion("stacom between", value1, value2, "stacom");
            return (Criteria) this;
        }

        public Criteria andStacomNotBetween(Integer value1, Integer value2) {
            addCriterion("stacom not between", value1, value2, "stacom");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("bc is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("bc is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Integer value) {
            addCriterion("bc =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Integer value) {
            addCriterion("bc <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Integer value) {
            addCriterion("bc >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Integer value) {
            addCriterion("bc <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Integer value) {
            addCriterion("bc <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Integer> values) {
            addCriterion("bc in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Integer> values) {
            addCriterion("bc not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Integer value1, Integer value2) {
            addCriterion("bc between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Integer value1, Integer value2) {
            addCriterion("bc not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("tp is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("tp is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(String value) {
            addCriterion("tp =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(String value) {
            addCriterion("tp <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(String value) {
            addCriterion("tp >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(String value) {
            addCriterion("tp >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(String value) {
            addCriterion("tp <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(String value) {
            addCriterion("tp <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLike(String value) {
            addCriterion("tp like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotLike(String value) {
            addCriterion("tp not like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<String> values) {
            addCriterion("tp in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<String> values) {
            addCriterion("tp not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(String value1, String value2) {
            addCriterion("tp between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(String value1, String value2) {
            addCriterion("tp not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Integer value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Integer value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Integer value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Integer value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Integer value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Integer> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Integer> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Integer value1, Integer value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Integer value1, Integer value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andTimetypeIsNull() {
            addCriterion("timetype is null");
            return (Criteria) this;
        }

        public Criteria andTimetypeIsNotNull() {
            addCriterion("timetype is not null");
            return (Criteria) this;
        }

        public Criteria andTimetypeEqualTo(String value) {
            addCriterion("timetype =", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotEqualTo(String value) {
            addCriterion("timetype <>", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThan(String value) {
            addCriterion("timetype >", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThanOrEqualTo(String value) {
            addCriterion("timetype >=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThan(String value) {
            addCriterion("timetype <", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThanOrEqualTo(String value) {
            addCriterion("timetype <=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLike(String value) {
            addCriterion("timetype like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotLike(String value) {
            addCriterion("timetype not like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeIn(List<String> values) {
            addCriterion("timetype in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotIn(List<String> values) {
            addCriterion("timetype not in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeBetween(String value1, String value2) {
            addCriterion("timetype between", value1, value2, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotBetween(String value1, String value2) {
            addCriterion("timetype not between", value1, value2, "timetype");
            return (Criteria) this;
        }

        public Criteria andSubtimeIsNull() {
            addCriterion("subtime is null");
            return (Criteria) this;
        }

        public Criteria andSubtimeIsNotNull() {
            addCriterion("subtime is not null");
            return (Criteria) this;
        }

        public Criteria andSubtimeEqualTo(Float value) {
            addCriterion("subtime =", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotEqualTo(Float value) {
            addCriterion("subtime <>", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeGreaterThan(Float value) {
            addCriterion("subtime >", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeGreaterThanOrEqualTo(Float value) {
            addCriterion("subtime >=", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeLessThan(Float value) {
            addCriterion("subtime <", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeLessThanOrEqualTo(Float value) {
            addCriterion("subtime <=", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeIn(List<Float> values) {
            addCriterion("subtime in", values, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotIn(List<Float> values) {
            addCriterion("subtime not in", values, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeBetween(Float value1, Float value2) {
            addCriterion("subtime between", value1, value2, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotBetween(Float value1, Float value2) {
            addCriterion("subtime not between", value1, value2, "subtime");
            return (Criteria) this;
        }

        public Criteria andStalatIsNull() {
            addCriterion("stalat is null");
            return (Criteria) this;
        }

        public Criteria andStalatIsNotNull() {
            addCriterion("stalat is not null");
            return (Criteria) this;
        }

        public Criteria andStalatEqualTo(Float value) {
            addCriterion("stalat =", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatNotEqualTo(Float value) {
            addCriterion("stalat <>", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatGreaterThan(Float value) {
            addCriterion("stalat >", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatGreaterThanOrEqualTo(Float value) {
            addCriterion("stalat >=", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatLessThan(Float value) {
            addCriterion("stalat <", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatLessThanOrEqualTo(Float value) {
            addCriterion("stalat <=", value, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatIn(List<Float> values) {
            addCriterion("stalat in", values, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatNotIn(List<Float> values) {
            addCriterion("stalat not in", values, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatBetween(Float value1, Float value2) {
            addCriterion("stalat between", value1, value2, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalatNotBetween(Float value1, Float value2) {
            addCriterion("stalat not between", value1, value2, "stalat");
            return (Criteria) this;
        }

        public Criteria andStalonIsNull() {
            addCriterion("stalon is null");
            return (Criteria) this;
        }

        public Criteria andStalonIsNotNull() {
            addCriterion("stalon is not null");
            return (Criteria) this;
        }

        public Criteria andStalonEqualTo(Float value) {
            addCriterion("stalon =", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonNotEqualTo(Float value) {
            addCriterion("stalon <>", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonGreaterThan(Float value) {
            addCriterion("stalon >", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonGreaterThanOrEqualTo(Float value) {
            addCriterion("stalon >=", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonLessThan(Float value) {
            addCriterion("stalon <", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonLessThanOrEqualTo(Float value) {
            addCriterion("stalon <=", value, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonIn(List<Float> values) {
            addCriterion("stalon in", values, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonNotIn(List<Float> values) {
            addCriterion("stalon not in", values, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonBetween(Float value1, Float value2) {
            addCriterion("stalon between", value1, value2, "stalon");
            return (Criteria) this;
        }

        public Criteria andStalonNotBetween(Float value1, Float value2) {
            addCriterion("stalon not between", value1, value2, "stalon");
            return (Criteria) this;
        }

        public Criteria andSheiIsNull() {
            addCriterion("shei is null");
            return (Criteria) this;
        }

        public Criteria andSheiIsNotNull() {
            addCriterion("shei is not null");
            return (Criteria) this;
        }

        public Criteria andSheiEqualTo(Float value) {
            addCriterion("shei =", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiNotEqualTo(Float value) {
            addCriterion("shei <>", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiGreaterThan(Float value) {
            addCriterion("shei >", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiGreaterThanOrEqualTo(Float value) {
            addCriterion("shei >=", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiLessThan(Float value) {
            addCriterion("shei <", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiLessThanOrEqualTo(Float value) {
            addCriterion("shei <=", value, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiIn(List<Float> values) {
            addCriterion("shei in", values, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiNotIn(List<Float> values) {
            addCriterion("shei not in", values, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiBetween(Float value1, Float value2) {
            addCriterion("shei between", value1, value2, "shei");
            return (Criteria) this;
        }

        public Criteria andSheiNotBetween(Float value1, Float value2) {
            addCriterion("shei not between", value1, value2, "shei");
            return (Criteria) this;
        }

        public Criteria andSweiIsNull() {
            addCriterion("swei is null");
            return (Criteria) this;
        }

        public Criteria andSweiIsNotNull() {
            addCriterion("swei is not null");
            return (Criteria) this;
        }

        public Criteria andSweiEqualTo(Integer value) {
            addCriterion("swei =", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiNotEqualTo(Integer value) {
            addCriterion("swei <>", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiGreaterThan(Integer value) {
            addCriterion("swei >", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("swei >=", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiLessThan(Integer value) {
            addCriterion("swei <", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiLessThanOrEqualTo(Integer value) {
            addCriterion("swei <=", value, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiIn(List<Integer> values) {
            addCriterion("swei in", values, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiNotIn(List<Integer> values) {
            addCriterion("swei not in", values, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiBetween(Integer value1, Integer value2) {
            addCriterion("swei between", value1, value2, "swei");
            return (Criteria) this;
        }

        public Criteria andSweiNotBetween(Integer value1, Integer value2) {
            addCriterion("swei not between", value1, value2, "swei");
            return (Criteria) this;
        }

        public Criteria andVmolIsNull() {
            addCriterion("vmol is null");
            return (Criteria) this;
        }

        public Criteria andVmolIsNotNull() {
            addCriterion("vmol is not null");
            return (Criteria) this;
        }

        public Criteria andVmolEqualTo(Integer value) {
            addCriterion("vmol =", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolNotEqualTo(Integer value) {
            addCriterion("vmol <>", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolGreaterThan(Integer value) {
            addCriterion("vmol >", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolGreaterThanOrEqualTo(Integer value) {
            addCriterion("vmol >=", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolLessThan(Integer value) {
            addCriterion("vmol <", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolLessThanOrEqualTo(Integer value) {
            addCriterion("vmol <=", value, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolIn(List<Integer> values) {
            addCriterion("vmol in", values, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolNotIn(List<Integer> values) {
            addCriterion("vmol not in", values, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolBetween(Integer value1, Integer value2) {
            addCriterion("vmol between", value1, value2, "vmol");
            return (Criteria) this;
        }

        public Criteria andVmolNotBetween(Integer value1, Integer value2) {
            addCriterion("vmol not between", value1, value2, "vmol");
            return (Criteria) this;
        }

        public Criteria andDmolIsNull() {
            addCriterion("dmol is null");
            return (Criteria) this;
        }

        public Criteria andDmolIsNotNull() {
            addCriterion("dmol is not null");
            return (Criteria) this;
        }

        public Criteria andDmolEqualTo(Integer value) {
            addCriterion("dmol =", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolNotEqualTo(Integer value) {
            addCriterion("dmol <>", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolGreaterThan(Integer value) {
            addCriterion("dmol >", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolGreaterThanOrEqualTo(Integer value) {
            addCriterion("dmol >=", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolLessThan(Integer value) {
            addCriterion("dmol <", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolLessThanOrEqualTo(Integer value) {
            addCriterion("dmol <=", value, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolIn(List<Integer> values) {
            addCriterion("dmol in", values, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolNotIn(List<Integer> values) {
            addCriterion("dmol not in", values, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolBetween(Integer value1, Integer value2) {
            addCriterion("dmol between", value1, value2, "dmol");
            return (Criteria) this;
        }

        public Criteria andDmolNotBetween(Integer value1, Integer value2) {
            addCriterion("dmol not between", value1, value2, "dmol");
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

        public Criteria andGfactoreIsNull() {
            addCriterion("gfactore is null");
            return (Criteria) this;
        }

        public Criteria andGfactoreIsNotNull() {
            addCriterion("gfactore is not null");
            return (Criteria) this;
        }

        public Criteria andGfactoreEqualTo(Float value) {
            addCriterion("gfactore =", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreNotEqualTo(Float value) {
            addCriterion("gfactore <>", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreGreaterThan(Float value) {
            addCriterion("gfactore >", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreGreaterThanOrEqualTo(Float value) {
            addCriterion("gfactore >=", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreLessThan(Float value) {
            addCriterion("gfactore <", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreLessThanOrEqualTo(Float value) {
            addCriterion("gfactore <=", value, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreIn(List<Float> values) {
            addCriterion("gfactore in", values, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreNotIn(List<Float> values) {
            addCriterion("gfactore not in", values, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreBetween(Float value1, Float value2) {
            addCriterion("gfactore between", value1, value2, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactoreNotBetween(Float value1, Float value2) {
            addCriterion("gfactore not between", value1, value2, "gfactore");
            return (Criteria) this;
        }

        public Criteria andGfactornIsNull() {
            addCriterion("gfactorn is null");
            return (Criteria) this;
        }

        public Criteria andGfactornIsNotNull() {
            addCriterion("gfactorn is not null");
            return (Criteria) this;
        }

        public Criteria andGfactornEqualTo(Float value) {
            addCriterion("gfactorn =", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornNotEqualTo(Float value) {
            addCriterion("gfactorn <>", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornGreaterThan(Float value) {
            addCriterion("gfactorn >", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornGreaterThanOrEqualTo(Float value) {
            addCriterion("gfactorn >=", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornLessThan(Float value) {
            addCriterion("gfactorn <", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornLessThanOrEqualTo(Float value) {
            addCriterion("gfactorn <=", value, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornIn(List<Float> values) {
            addCriterion("gfactorn in", values, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornNotIn(List<Float> values) {
            addCriterion("gfactorn not in", values, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornBetween(Float value1, Float value2) {
            addCriterion("gfactorn between", value1, value2, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactornNotBetween(Float value1, Float value2) {
            addCriterion("gfactorn not between", value1, value2, "gfactorn");
            return (Criteria) this;
        }

        public Criteria andGfactorzIsNull() {
            addCriterion("gfactorz is null");
            return (Criteria) this;
        }

        public Criteria andGfactorzIsNotNull() {
            addCriterion("gfactorz is not null");
            return (Criteria) this;
        }

        public Criteria andGfactorzEqualTo(Float value) {
            addCriterion("gfactorz =", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzNotEqualTo(Float value) {
            addCriterion("gfactorz <>", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzGreaterThan(Float value) {
            addCriterion("gfactorz >", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzGreaterThanOrEqualTo(Float value) {
            addCriterion("gfactorz >=", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzLessThan(Float value) {
            addCriterion("gfactorz <", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzLessThanOrEqualTo(Float value) {
            addCriterion("gfactorz <=", value, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzIn(List<Float> values) {
            addCriterion("gfactorz in", values, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzNotIn(List<Float> values) {
            addCriterion("gfactorz not in", values, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzBetween(Float value1, Float value2) {
            addCriterion("gfactorz between", value1, value2, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andGfactorzNotBetween(Float value1, Float value2) {
            addCriterion("gfactorz not between", value1, value2, "gfactorz");
            return (Criteria) this;
        }

        public Criteria andDgreeeIsNull() {
            addCriterion("dgreee is null");
            return (Criteria) this;
        }

        public Criteria andDgreeeIsNotNull() {
            addCriterion("dgreee is not null");
            return (Criteria) this;
        }

        public Criteria andDgreeeEqualTo(Integer value) {
            addCriterion("dgreee =", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeNotEqualTo(Integer value) {
            addCriterion("dgreee <>", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeGreaterThan(Integer value) {
            addCriterion("dgreee >", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dgreee >=", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeLessThan(Integer value) {
            addCriterion("dgreee <", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeLessThanOrEqualTo(Integer value) {
            addCriterion("dgreee <=", value, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeIn(List<Integer> values) {
            addCriterion("dgreee in", values, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeNotIn(List<Integer> values) {
            addCriterion("dgreee not in", values, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeBetween(Integer value1, Integer value2) {
            addCriterion("dgreee between", value1, value2, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreeeNotBetween(Integer value1, Integer value2) {
            addCriterion("dgreee not between", value1, value2, "dgreee");
            return (Criteria) this;
        }

        public Criteria andDgreenIsNull() {
            addCriterion("dgreen is null");
            return (Criteria) this;
        }

        public Criteria andDgreenIsNotNull() {
            addCriterion("dgreen is not null");
            return (Criteria) this;
        }

        public Criteria andDgreenEqualTo(Integer value) {
            addCriterion("dgreen =", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenNotEqualTo(Integer value) {
            addCriterion("dgreen <>", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenGreaterThan(Integer value) {
            addCriterion("dgreen >", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("dgreen >=", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenLessThan(Integer value) {
            addCriterion("dgreen <", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenLessThanOrEqualTo(Integer value) {
            addCriterion("dgreen <=", value, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenIn(List<Integer> values) {
            addCriterion("dgreen in", values, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenNotIn(List<Integer> values) {
            addCriterion("dgreen not in", values, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenBetween(Integer value1, Integer value2) {
            addCriterion("dgreen between", value1, value2, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreenNotBetween(Integer value1, Integer value2) {
            addCriterion("dgreen not between", value1, value2, "dgreen");
            return (Criteria) this;
        }

        public Criteria andDgreezIsNull() {
            addCriterion("dgreez is null");
            return (Criteria) this;
        }

        public Criteria andDgreezIsNotNull() {
            addCriterion("dgreez is not null");
            return (Criteria) this;
        }

        public Criteria andDgreezEqualTo(Integer value) {
            addCriterion("dgreez =", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezNotEqualTo(Integer value) {
            addCriterion("dgreez <>", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezGreaterThan(Integer value) {
            addCriterion("dgreez >", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezGreaterThanOrEqualTo(Integer value) {
            addCriterion("dgreez >=", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezLessThan(Integer value) {
            addCriterion("dgreez <", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezLessThanOrEqualTo(Integer value) {
            addCriterion("dgreez <=", value, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezIn(List<Integer> values) {
            addCriterion("dgreez in", values, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezNotIn(List<Integer> values) {
            addCriterion("dgreez not in", values, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezBetween(Integer value1, Integer value2) {
            addCriterion("dgreez between", value1, value2, "dgreez");
            return (Criteria) this;
        }

        public Criteria andDgreezNotBetween(Integer value1, Integer value2) {
            addCriterion("dgreez not between", value1, value2, "dgreez");
            return (Criteria) this;
        }

        public Criteria andNcidIsNull() {
            addCriterion("ncid is null");
            return (Criteria) this;
        }

        public Criteria andNcidIsNotNull() {
            addCriterion("ncid is not null");
            return (Criteria) this;
        }

        public Criteria andNcidEqualTo(Integer value) {
            addCriterion("ncid =", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotEqualTo(Integer value) {
            addCriterion("ncid <>", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThan(Integer value) {
            addCriterion("ncid >", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncid >=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThan(Integer value) {
            addCriterion("ncid <", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThanOrEqualTo(Integer value) {
            addCriterion("ncid <=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidIn(List<Integer> values) {
            addCriterion("ncid in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotIn(List<Integer> values) {
            addCriterion("ncid not in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidBetween(Integer value1, Integer value2) {
            addCriterion("ncid between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ncid not between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andEcidIsNull() {
            addCriterion("ecid is null");
            return (Criteria) this;
        }

        public Criteria andEcidIsNotNull() {
            addCriterion("ecid is not null");
            return (Criteria) this;
        }

        public Criteria andEcidEqualTo(Integer value) {
            addCriterion("ecid =", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidNotEqualTo(Integer value) {
            addCriterion("ecid <>", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidGreaterThan(Integer value) {
            addCriterion("ecid >", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecid >=", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidLessThan(Integer value) {
            addCriterion("ecid <", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidLessThanOrEqualTo(Integer value) {
            addCriterion("ecid <=", value, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidIn(List<Integer> values) {
            addCriterion("ecid in", values, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidNotIn(List<Integer> values) {
            addCriterion("ecid not in", values, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidBetween(Integer value1, Integer value2) {
            addCriterion("ecid between", value1, value2, "ecid");
            return (Criteria) this;
        }

        public Criteria andEcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ecid not between", value1, value2, "ecid");
            return (Criteria) this;
        }

        public Criteria andUcidIsNull() {
            addCriterion("ucid is null");
            return (Criteria) this;
        }

        public Criteria andUcidIsNotNull() {
            addCriterion("ucid is not null");
            return (Criteria) this;
        }

        public Criteria andUcidEqualTo(Integer value) {
            addCriterion("ucid =", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidNotEqualTo(Integer value) {
            addCriterion("ucid <>", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidGreaterThan(Integer value) {
            addCriterion("ucid >", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ucid >=", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidLessThan(Integer value) {
            addCriterion("ucid <", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidLessThanOrEqualTo(Integer value) {
            addCriterion("ucid <=", value, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidIn(List<Integer> values) {
            addCriterion("ucid in", values, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidNotIn(List<Integer> values) {
            addCriterion("ucid not in", values, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidBetween(Integer value1, Integer value2) {
            addCriterion("ucid between", value1, value2, "ucid");
            return (Criteria) this;
        }

        public Criteria andUcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ucid not between", value1, value2, "ucid");
            return (Criteria) this;
        }

        public Criteria andNcnameIsNull() {
            addCriterion("ncname is null");
            return (Criteria) this;
        }

        public Criteria andNcnameIsNotNull() {
            addCriterion("ncname is not null");
            return (Criteria) this;
        }

        public Criteria andNcnameEqualTo(String value) {
            addCriterion("ncname =", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameNotEqualTo(String value) {
            addCriterion("ncname <>", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameGreaterThan(String value) {
            addCriterion("ncname >", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameGreaterThanOrEqualTo(String value) {
            addCriterion("ncname >=", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameLessThan(String value) {
            addCriterion("ncname <", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameLessThanOrEqualTo(String value) {
            addCriterion("ncname <=", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameLike(String value) {
            addCriterion("ncname like", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameNotLike(String value) {
            addCriterion("ncname not like", value, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameIn(List<String> values) {
            addCriterion("ncname in", values, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameNotIn(List<String> values) {
            addCriterion("ncname not in", values, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameBetween(String value1, String value2) {
            addCriterion("ncname between", value1, value2, "ncname");
            return (Criteria) this;
        }

        public Criteria andNcnameNotBetween(String value1, String value2) {
            addCriterion("ncname not between", value1, value2, "ncname");
            return (Criteria) this;
        }

        public Criteria andEcnameIsNull() {
            addCriterion("ecname is null");
            return (Criteria) this;
        }

        public Criteria andEcnameIsNotNull() {
            addCriterion("ecname is not null");
            return (Criteria) this;
        }

        public Criteria andEcnameEqualTo(String value) {
            addCriterion("ecname =", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameNotEqualTo(String value) {
            addCriterion("ecname <>", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameGreaterThan(String value) {
            addCriterion("ecname >", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameGreaterThanOrEqualTo(String value) {
            addCriterion("ecname >=", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameLessThan(String value) {
            addCriterion("ecname <", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameLessThanOrEqualTo(String value) {
            addCriterion("ecname <=", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameLike(String value) {
            addCriterion("ecname like", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameNotLike(String value) {
            addCriterion("ecname not like", value, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameIn(List<String> values) {
            addCriterion("ecname in", values, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameNotIn(List<String> values) {
            addCriterion("ecname not in", values, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameBetween(String value1, String value2) {
            addCriterion("ecname between", value1, value2, "ecname");
            return (Criteria) this;
        }

        public Criteria andEcnameNotBetween(String value1, String value2) {
            addCriterion("ecname not between", value1, value2, "ecname");
            return (Criteria) this;
        }

        public Criteria andUcnameIsNull() {
            addCriterion("ucname is null");
            return (Criteria) this;
        }

        public Criteria andUcnameIsNotNull() {
            addCriterion("ucname is not null");
            return (Criteria) this;
        }

        public Criteria andUcnameEqualTo(String value) {
            addCriterion("ucname =", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameNotEqualTo(String value) {
            addCriterion("ucname <>", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameGreaterThan(String value) {
            addCriterion("ucname >", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameGreaterThanOrEqualTo(String value) {
            addCriterion("ucname >=", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameLessThan(String value) {
            addCriterion("ucname <", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameLessThanOrEqualTo(String value) {
            addCriterion("ucname <=", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameLike(String value) {
            addCriterion("ucname like", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameNotLike(String value) {
            addCriterion("ucname not like", value, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameIn(List<String> values) {
            addCriterion("ucname in", values, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameNotIn(List<String> values) {
            addCriterion("ucname not in", values, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameBetween(String value1, String value2) {
            addCriterion("ucname between", value1, value2, "ucname");
            return (Criteria) this;
        }

        public Criteria andUcnameNotBetween(String value1, String value2) {
            addCriterion("ucname not between", value1, value2, "ucname");
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