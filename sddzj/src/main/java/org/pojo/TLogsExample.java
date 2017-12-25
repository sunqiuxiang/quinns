package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class TLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLogsExample() {
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

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(String value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(String value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(String value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(String value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(String value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(String value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLike(String value) {
            addCriterion("log_time like", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotLike(String value) {
            addCriterion("log_time not like", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<String> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<String> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(String value1, String value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(String value1, String value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventProducerIsNull() {
            addCriterion("event_producer is null");
            return (Criteria) this;
        }

        public Criteria andEventProducerIsNotNull() {
            addCriterion("event_producer is not null");
            return (Criteria) this;
        }

        public Criteria andEventProducerEqualTo(String value) {
            addCriterion("event_producer =", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotEqualTo(String value) {
            addCriterion("event_producer <>", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerGreaterThan(String value) {
            addCriterion("event_producer >", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerGreaterThanOrEqualTo(String value) {
            addCriterion("event_producer >=", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLessThan(String value) {
            addCriterion("event_producer <", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLessThanOrEqualTo(String value) {
            addCriterion("event_producer <=", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerLike(String value) {
            addCriterion("event_producer like", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotLike(String value) {
            addCriterion("event_producer not like", value, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerIn(List<String> values) {
            addCriterion("event_producer in", values, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotIn(List<String> values) {
            addCriterion("event_producer not in", values, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerBetween(String value1, String value2) {
            addCriterion("event_producer between", value1, value2, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventProducerNotBetween(String value1, String value2) {
            addCriterion("event_producer not between", value1, value2, "eventProducer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerIsNull() {
            addCriterion("event_customer is null");
            return (Criteria) this;
        }

        public Criteria andEventCustomerIsNotNull() {
            addCriterion("event_customer is not null");
            return (Criteria) this;
        }

        public Criteria andEventCustomerEqualTo(String value) {
            addCriterion("event_customer =", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerNotEqualTo(String value) {
            addCriterion("event_customer <>", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerGreaterThan(String value) {
            addCriterion("event_customer >", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("event_customer >=", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerLessThan(String value) {
            addCriterion("event_customer <", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerLessThanOrEqualTo(String value) {
            addCriterion("event_customer <=", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerLike(String value) {
            addCriterion("event_customer like", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerNotLike(String value) {
            addCriterion("event_customer not like", value, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerIn(List<String> values) {
            addCriterion("event_customer in", values, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerNotIn(List<String> values) {
            addCriterion("event_customer not in", values, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerBetween(String value1, String value2) {
            addCriterion("event_customer between", value1, value2, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andEventCustomerNotBetween(String value1, String value2) {
            addCriterion("event_customer not between", value1, value2, "eventCustomer");
            return (Criteria) this;
        }

        public Criteria andRemark01IsNull() {
            addCriterion("remark01 is null");
            return (Criteria) this;
        }

        public Criteria andRemark01IsNotNull() {
            addCriterion("remark01 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark01EqualTo(Integer value) {
            addCriterion("remark01 =", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01NotEqualTo(Integer value) {
            addCriterion("remark01 <>", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01GreaterThan(Integer value) {
            addCriterion("remark01 >", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01GreaterThanOrEqualTo(Integer value) {
            addCriterion("remark01 >=", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01LessThan(Integer value) {
            addCriterion("remark01 <", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01LessThanOrEqualTo(Integer value) {
            addCriterion("remark01 <=", value, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01In(List<Integer> values) {
            addCriterion("remark01 in", values, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01NotIn(List<Integer> values) {
            addCriterion("remark01 not in", values, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01Between(Integer value1, Integer value2) {
            addCriterion("remark01 between", value1, value2, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark01NotBetween(Integer value1, Integer value2) {
            addCriterion("remark01 not between", value1, value2, "remark01");
            return (Criteria) this;
        }

        public Criteria andRemark02IsNull() {
            addCriterion("remark02 is null");
            return (Criteria) this;
        }

        public Criteria andRemark02IsNotNull() {
            addCriterion("remark02 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark02EqualTo(String value) {
            addCriterion("remark02 =", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02NotEqualTo(String value) {
            addCriterion("remark02 <>", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02GreaterThan(String value) {
            addCriterion("remark02 >", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02GreaterThanOrEqualTo(String value) {
            addCriterion("remark02 >=", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02LessThan(String value) {
            addCriterion("remark02 <", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02LessThanOrEqualTo(String value) {
            addCriterion("remark02 <=", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02Like(String value) {
            addCriterion("remark02 like", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02NotLike(String value) {
            addCriterion("remark02 not like", value, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02In(List<String> values) {
            addCriterion("remark02 in", values, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02NotIn(List<String> values) {
            addCriterion("remark02 not in", values, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02Between(String value1, String value2) {
            addCriterion("remark02 between", value1, value2, "remark02");
            return (Criteria) this;
        }

        public Criteria andRemark02NotBetween(String value1, String value2) {
            addCriterion("remark02 not between", value1, value2, "remark02");
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