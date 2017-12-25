package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class TTaskResultSparkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTaskResultSparkExample() {
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

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(Integer value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(Integer value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(Integer value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(Integer value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<Integer> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<Integer> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(Integer value1, Integer value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultPathIsNull() {
            addCriterion("result_path is null");
            return (Criteria) this;
        }

        public Criteria andResultPathIsNotNull() {
            addCriterion("result_path is not null");
            return (Criteria) this;
        }

        public Criteria andResultPathEqualTo(String value) {
            addCriterion("result_path =", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathNotEqualTo(String value) {
            addCriterion("result_path <>", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathGreaterThan(String value) {
            addCriterion("result_path >", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathGreaterThanOrEqualTo(String value) {
            addCriterion("result_path >=", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathLessThan(String value) {
            addCriterion("result_path <", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathLessThanOrEqualTo(String value) {
            addCriterion("result_path <=", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathLike(String value) {
            addCriterion("result_path like", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathNotLike(String value) {
            addCriterion("result_path not like", value, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathIn(List<String> values) {
            addCriterion("result_path in", values, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathNotIn(List<String> values) {
            addCriterion("result_path not in", values, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathBetween(String value1, String value2) {
            addCriterion("result_path between", value1, value2, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultPathNotBetween(String value1, String value2) {
            addCriterion("result_path not between", value1, value2, "resultPath");
            return (Criteria) this;
        }

        public Criteria andResultLengthIsNull() {
            addCriterion("result_length is null");
            return (Criteria) this;
        }

        public Criteria andResultLengthIsNotNull() {
            addCriterion("result_length is not null");
            return (Criteria) this;
        }

        public Criteria andResultLengthEqualTo(String value) {
            addCriterion("result_length =", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthNotEqualTo(String value) {
            addCriterion("result_length <>", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthGreaterThan(String value) {
            addCriterion("result_length >", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthGreaterThanOrEqualTo(String value) {
            addCriterion("result_length >=", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthLessThan(String value) {
            addCriterion("result_length <", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthLessThanOrEqualTo(String value) {
            addCriterion("result_length <=", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthLike(String value) {
            addCriterion("result_length like", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthNotLike(String value) {
            addCriterion("result_length not like", value, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthIn(List<String> values) {
            addCriterion("result_length in", values, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthNotIn(List<String> values) {
            addCriterion("result_length not in", values, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthBetween(String value1, String value2) {
            addCriterion("result_length between", value1, value2, "resultLength");
            return (Criteria) this;
        }

        public Criteria andResultLengthNotBetween(String value1, String value2) {
            addCriterion("result_length not between", value1, value2, "resultLength");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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