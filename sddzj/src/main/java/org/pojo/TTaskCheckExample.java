package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class TTaskCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTaskCheckExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNull() {
            addCriterion("monitor is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNotNull() {
            addCriterion("monitor is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorEqualTo(String value) {
            addCriterion("monitor =", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotEqualTo(String value) {
            addCriterion("monitor <>", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThan(String value) {
            addCriterion("monitor >", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThanOrEqualTo(String value) {
            addCriterion("monitor >=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThan(String value) {
            addCriterion("monitor <", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThanOrEqualTo(String value) {
            addCriterion("monitor <=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLike(String value) {
            addCriterion("monitor like", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotLike(String value) {
            addCriterion("monitor not like", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorIn(List<String> values) {
            addCriterion("monitor in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotIn(List<String> values) {
            addCriterion("monitor not in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorBetween(String value1, String value2) {
            addCriterion("monitor between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotBetween(String value1, String value2) {
            addCriterion("monitor not between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("time_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(String value) {
            addCriterion("time_start =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(String value) {
            addCriterion("time_start <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(String value) {
            addCriterion("time_start >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("time_start >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(String value) {
            addCriterion("time_start <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(String value) {
            addCriterion("time_start <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLike(String value) {
            addCriterion("time_start like", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotLike(String value) {
            addCriterion("time_start not like", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<String> values) {
            addCriterion("time_start in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<String> values) {
            addCriterion("time_start not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(String value1, String value2) {
            addCriterion("time_start between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(String value1, String value2) {
            addCriterion("time_start not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNull() {
            addCriterion("time_end is null");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNotNull() {
            addCriterion("time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEndEqualTo(String value) {
            addCriterion("time_end =", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotEqualTo(String value) {
            addCriterion("time_end <>", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThan(String value) {
            addCriterion("time_end >", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("time_end >=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThan(String value) {
            addCriterion("time_end <", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThanOrEqualTo(String value) {
            addCriterion("time_end <=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLike(String value) {
            addCriterion("time_end like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotLike(String value) {
            addCriterion("time_end not like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndIn(List<String> values) {
            addCriterion("time_end in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotIn(List<String> values) {
            addCriterion("time_end not in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndBetween(String value1, String value2) {
            addCriterion("time_end between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotBetween(String value1, String value2) {
            addCriterion("time_end not between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("task_status like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("task_status not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIsNull() {
            addCriterion("task_time_start is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIsNotNull() {
            addCriterion("task_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartEqualTo(String value) {
            addCriterion("task_time_start =", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotEqualTo(String value) {
            addCriterion("task_time_start <>", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartGreaterThan(String value) {
            addCriterion("task_time_start >", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("task_time_start >=", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartLessThan(String value) {
            addCriterion("task_time_start <", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartLessThanOrEqualTo(String value) {
            addCriterion("task_time_start <=", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartLike(String value) {
            addCriterion("task_time_start like", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotLike(String value) {
            addCriterion("task_time_start not like", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIn(List<String> values) {
            addCriterion("task_time_start in", values, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotIn(List<String> values) {
            addCriterion("task_time_start not in", values, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartBetween(String value1, String value2) {
            addCriterion("task_time_start between", value1, value2, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotBetween(String value1, String value2) {
            addCriterion("task_time_start not between", value1, value2, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIsNull() {
            addCriterion("task_time_end is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIsNotNull() {
            addCriterion("task_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndEqualTo(String value) {
            addCriterion("task_time_end =", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotEqualTo(String value) {
            addCriterion("task_time_end <>", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndGreaterThan(String value) {
            addCriterion("task_time_end >", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("task_time_end >=", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndLessThan(String value) {
            addCriterion("task_time_end <", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndLessThanOrEqualTo(String value) {
            addCriterion("task_time_end <=", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndLike(String value) {
            addCriterion("task_time_end like", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotLike(String value) {
            addCriterion("task_time_end not like", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIn(List<String> values) {
            addCriterion("task_time_end in", values, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotIn(List<String> values) {
            addCriterion("task_time_end not in", values, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndBetween(String value1, String value2) {
            addCriterion("task_time_end between", value1, value2, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotBetween(String value1, String value2) {
            addCriterion("task_time_end not between", value1, value2, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkIsNull() {
            addCriterion("task_status_spark is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkIsNotNull() {
            addCriterion("task_status_spark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkEqualTo(String value) {
            addCriterion("task_status_spark =", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkNotEqualTo(String value) {
            addCriterion("task_status_spark <>", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkGreaterThan(String value) {
            addCriterion("task_status_spark >", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkGreaterThanOrEqualTo(String value) {
            addCriterion("task_status_spark >=", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkLessThan(String value) {
            addCriterion("task_status_spark <", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkLessThanOrEqualTo(String value) {
            addCriterion("task_status_spark <=", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkLike(String value) {
            addCriterion("task_status_spark like", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkNotLike(String value) {
            addCriterion("task_status_spark not like", value, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkIn(List<String> values) {
            addCriterion("task_status_spark in", values, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkNotIn(List<String> values) {
            addCriterion("task_status_spark not in", values, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkBetween(String value1, String value2) {
            addCriterion("task_status_spark between", value1, value2, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskStatusSparkNotBetween(String value1, String value2) {
            addCriterion("task_status_spark not between", value1, value2, "taskStatusSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkIsNull() {
            addCriterion("task_time_start_spark is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkIsNotNull() {
            addCriterion("task_time_start_spark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkEqualTo(String value) {
            addCriterion("task_time_start_spark =", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkNotEqualTo(String value) {
            addCriterion("task_time_start_spark <>", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkGreaterThan(String value) {
            addCriterion("task_time_start_spark >", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkGreaterThanOrEqualTo(String value) {
            addCriterion("task_time_start_spark >=", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkLessThan(String value) {
            addCriterion("task_time_start_spark <", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkLessThanOrEqualTo(String value) {
            addCriterion("task_time_start_spark <=", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkLike(String value) {
            addCriterion("task_time_start_spark like", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkNotLike(String value) {
            addCriterion("task_time_start_spark not like", value, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkIn(List<String> values) {
            addCriterion("task_time_start_spark in", values, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkNotIn(List<String> values) {
            addCriterion("task_time_start_spark not in", values, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkBetween(String value1, String value2) {
            addCriterion("task_time_start_spark between", value1, value2, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartSparkNotBetween(String value1, String value2) {
            addCriterion("task_time_start_spark not between", value1, value2, "taskTimeStartSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkIsNull() {
            addCriterion("task_time_end_spark is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkIsNotNull() {
            addCriterion("task_time_end_spark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkEqualTo(String value) {
            addCriterion("task_time_end_spark =", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkNotEqualTo(String value) {
            addCriterion("task_time_end_spark <>", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkGreaterThan(String value) {
            addCriterion("task_time_end_spark >", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkGreaterThanOrEqualTo(String value) {
            addCriterion("task_time_end_spark >=", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkLessThan(String value) {
            addCriterion("task_time_end_spark <", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkLessThanOrEqualTo(String value) {
            addCriterion("task_time_end_spark <=", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkLike(String value) {
            addCriterion("task_time_end_spark like", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkNotLike(String value) {
            addCriterion("task_time_end_spark not like", value, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkIn(List<String> values) {
            addCriterion("task_time_end_spark in", values, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkNotIn(List<String> values) {
            addCriterion("task_time_end_spark not in", values, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkBetween(String value1, String value2) {
            addCriterion("task_time_end_spark between", value1, value2, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndSparkNotBetween(String value1, String value2) {
            addCriterion("task_time_end_spark not between", value1, value2, "taskTimeEndSpark");
            return (Criteria) this;
        }

        public Criteria andMubanPathIsNull() {
            addCriterion("muban_path is null");
            return (Criteria) this;
        }

        public Criteria andMubanPathIsNotNull() {
            addCriterion("muban_path is not null");
            return (Criteria) this;
        }

        public Criteria andMubanPathEqualTo(String value) {
            addCriterion("muban_path =", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathNotEqualTo(String value) {
            addCriterion("muban_path <>", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathGreaterThan(String value) {
            addCriterion("muban_path >", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathGreaterThanOrEqualTo(String value) {
            addCriterion("muban_path >=", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathLessThan(String value) {
            addCriterion("muban_path <", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathLessThanOrEqualTo(String value) {
            addCriterion("muban_path <=", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathLike(String value) {
            addCriterion("muban_path like", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathNotLike(String value) {
            addCriterion("muban_path not like", value, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathIn(List<String> values) {
            addCriterion("muban_path in", values, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathNotIn(List<String> values) {
            addCriterion("muban_path not in", values, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathBetween(String value1, String value2) {
            addCriterion("muban_path between", value1, value2, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andMubanPathNotBetween(String value1, String value2) {
            addCriterion("muban_path not between", value1, value2, "mubanPath");
            return (Criteria) this;
        }

        public Criteria andJarPathIsNull() {
            addCriterion("jar_path is null");
            return (Criteria) this;
        }

        public Criteria andJarPathIsNotNull() {
            addCriterion("jar_path is not null");
            return (Criteria) this;
        }

        public Criteria andJarPathEqualTo(String value) {
            addCriterion("jar_path =", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathNotEqualTo(String value) {
            addCriterion("jar_path <>", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathGreaterThan(String value) {
            addCriterion("jar_path >", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathGreaterThanOrEqualTo(String value) {
            addCriterion("jar_path >=", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathLessThan(String value) {
            addCriterion("jar_path <", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathLessThanOrEqualTo(String value) {
            addCriterion("jar_path <=", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathLike(String value) {
            addCriterion("jar_path like", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathNotLike(String value) {
            addCriterion("jar_path not like", value, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathIn(List<String> values) {
            addCriterion("jar_path in", values, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathNotIn(List<String> values) {
            addCriterion("jar_path not in", values, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathBetween(String value1, String value2) {
            addCriterion("jar_path between", value1, value2, "jarPath");
            return (Criteria) this;
        }

        public Criteria andJarPathNotBetween(String value1, String value2) {
            addCriterion("jar_path not between", value1, value2, "jarPath");
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

        public Criteria andReviewedEqualTo(Integer value) {
            addCriterion("reviewed =", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotEqualTo(Integer value) {
            addCriterion("reviewed <>", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThan(Integer value) {
            addCriterion("reviewed >", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewed >=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThan(Integer value) {
            addCriterion("reviewed <", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedLessThanOrEqualTo(Integer value) {
            addCriterion("reviewed <=", value, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedIn(List<Integer> values) {
            addCriterion("reviewed in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotIn(List<Integer> values) {
            addCriterion("reviewed not in", values, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedBetween(Integer value1, Integer value2) {
            addCriterion("reviewed between", value1, value2, "reviewed");
            return (Criteria) this;
        }

        public Criteria andReviewedNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewed not between", value1, value2, "reviewed");
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

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(Integer value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(Integer value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(Integer value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(Integer value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(Integer value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<Integer> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<Integer> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(Integer value1, Integer value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice not between", value1, value2, "notice");
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

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("checktime like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("checktime not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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