package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class MdFilepathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdFilepathExample() {
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

        public Criteria andTzUuidIsNull() {
            addCriterion("tz_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTzUuidIsNotNull() {
            addCriterion("tz_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTzUuidEqualTo(String value) {
            addCriterion("tz_uuid =", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidNotEqualTo(String value) {
            addCriterion("tz_uuid <>", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidGreaterThan(String value) {
            addCriterion("tz_uuid >", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidGreaterThanOrEqualTo(String value) {
            addCriterion("tz_uuid >=", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidLessThan(String value) {
            addCriterion("tz_uuid <", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidLessThanOrEqualTo(String value) {
            addCriterion("tz_uuid <=", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidLike(String value) {
            addCriterion("tz_uuid like", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidNotLike(String value) {
            addCriterion("tz_uuid not like", value, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidIn(List<String> values) {
            addCriterion("tz_uuid in", values, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidNotIn(List<String> values) {
            addCriterion("tz_uuid not in", values, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidBetween(String value1, String value2) {
            addCriterion("tz_uuid between", value1, value2, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andTzUuidNotBetween(String value1, String value2) {
            addCriterion("tz_uuid not between", value1, value2, "tzUuid");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("filetype is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("filetype is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("filetype =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("filetype <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("filetype >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("filetype >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("filetype <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("filetype <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("filetype like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("filetype not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("filetype in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("filetype not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("filetype between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("filetype not between", value1, value2, "filetype");
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