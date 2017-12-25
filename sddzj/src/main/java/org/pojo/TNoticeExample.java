package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class TNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TNoticeExample() {
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

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("notice_content is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("notice_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("notice_content =", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("notice_content <>", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("notice_content >", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("notice_content >=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("notice_content <", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("notice_content <=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("notice_content like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("notice_content not like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("notice_content in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("notice_content not in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("notice_content between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("notice_content not between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIsNull() {
            addCriterion("notice_start_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIsNotNull() {
            addCriterion("notice_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeEqualTo(String value) {
            addCriterion("notice_start_time =", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotEqualTo(String value) {
            addCriterion("notice_start_time <>", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeGreaterThan(String value) {
            addCriterion("notice_start_time >", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_start_time >=", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLessThan(String value) {
            addCriterion("notice_start_time <", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLessThanOrEqualTo(String value) {
            addCriterion("notice_start_time <=", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeLike(String value) {
            addCriterion("notice_start_time like", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotLike(String value) {
            addCriterion("notice_start_time not like", value, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeIn(List<String> values) {
            addCriterion("notice_start_time in", values, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotIn(List<String> values) {
            addCriterion("notice_start_time not in", values, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeBetween(String value1, String value2) {
            addCriterion("notice_start_time between", value1, value2, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStartTimeNotBetween(String value1, String value2) {
            addCriterion("notice_start_time not between", value1, value2, "noticeStartTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIsNull() {
            addCriterion("notice_end_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIsNotNull() {
            addCriterion("notice_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeEqualTo(String value) {
            addCriterion("notice_end_time =", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotEqualTo(String value) {
            addCriterion("notice_end_time <>", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeGreaterThan(String value) {
            addCriterion("notice_end_time >", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_end_time >=", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLessThan(String value) {
            addCriterion("notice_end_time <", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLessThanOrEqualTo(String value) {
            addCriterion("notice_end_time <=", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeLike(String value) {
            addCriterion("notice_end_time like", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotLike(String value) {
            addCriterion("notice_end_time not like", value, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeIn(List<String> values) {
            addCriterion("notice_end_time in", values, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotIn(List<String> values) {
            addCriterion("notice_end_time not in", values, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeBetween(String value1, String value2) {
            addCriterion("notice_end_time between", value1, value2, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEndTimeNotBetween(String value1, String value2) {
            addCriterion("notice_end_time not between", value1, value2, "noticeEndTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("notice_status is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Integer value) {
            addCriterion("notice_status =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Integer value) {
            addCriterion("notice_status <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Integer value) {
            addCriterion("notice_status >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_status >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Integer value) {
            addCriterion("notice_status <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("notice_status <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Integer> values) {
            addCriterion("notice_status in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Integer> values) {
            addCriterion("notice_status not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Integer value1, Integer value2) {
            addCriterion("notice_status between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_status not between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterIsNull() {
            addCriterion("notice_creater is null");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterIsNotNull() {
            addCriterion("notice_creater is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterEqualTo(String value) {
            addCriterion("notice_creater =", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterNotEqualTo(String value) {
            addCriterion("notice_creater <>", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterGreaterThan(String value) {
            addCriterion("notice_creater >", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("notice_creater >=", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterLessThan(String value) {
            addCriterion("notice_creater <", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterLessThanOrEqualTo(String value) {
            addCriterion("notice_creater <=", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterLike(String value) {
            addCriterion("notice_creater like", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterNotLike(String value) {
            addCriterion("notice_creater not like", value, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterIn(List<String> values) {
            addCriterion("notice_creater in", values, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterNotIn(List<String> values) {
            addCriterion("notice_creater not in", values, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterBetween(String value1, String value2) {
            addCriterion("notice_creater between", value1, value2, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andNoticeCreaterNotBetween(String value1, String value2) {
            addCriterion("notice_creater not between", value1, value2, "noticeCreater");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdIsNull() {
            addCriterion("dzj_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdIsNotNull() {
            addCriterion("dzj_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdEqualTo(Integer value) {
            addCriterion("dzj_user_id =", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdNotEqualTo(Integer value) {
            addCriterion("dzj_user_id <>", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdGreaterThan(Integer value) {
            addCriterion("dzj_user_id >", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dzj_user_id >=", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdLessThan(Integer value) {
            addCriterion("dzj_user_id <", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("dzj_user_id <=", value, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdIn(List<Integer> values) {
            addCriterion("dzj_user_id in", values, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdNotIn(List<Integer> values) {
            addCriterion("dzj_user_id not in", values, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdBetween(Integer value1, Integer value2) {
            addCriterion("dzj_user_id between", value1, value2, "dzjUserId");
            return (Criteria) this;
        }

        public Criteria andDzjUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dzj_user_id not between", value1, value2, "dzjUserId");
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