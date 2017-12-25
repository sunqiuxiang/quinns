package org.pojo;

import java.util.ArrayList;
import java.util.List;

public class DzjFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DzjFunctionExample() {
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

        public Criteria andFuncnameIsNull() {
            addCriterion("funcname is null");
            return (Criteria) this;
        }

        public Criteria andFuncnameIsNotNull() {
            addCriterion("funcname is not null");
            return (Criteria) this;
        }

        public Criteria andFuncnameEqualTo(String value) {
            addCriterion("funcname =", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotEqualTo(String value) {
            addCriterion("funcname <>", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameGreaterThan(String value) {
            addCriterion("funcname >", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameGreaterThanOrEqualTo(String value) {
            addCriterion("funcname >=", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLessThan(String value) {
            addCriterion("funcname <", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLessThanOrEqualTo(String value) {
            addCriterion("funcname <=", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameLike(String value) {
            addCriterion("funcname like", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotLike(String value) {
            addCriterion("funcname not like", value, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameIn(List<String> values) {
            addCriterion("funcname in", values, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotIn(List<String> values) {
            addCriterion("funcname not in", values, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameBetween(String value1, String value2) {
            addCriterion("funcname between", value1, value2, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncnameNotBetween(String value1, String value2) {
            addCriterion("funcname not between", value1, value2, "funcname");
            return (Criteria) this;
        }

        public Criteria andFuncpowerIsNull() {
            addCriterion("funcpower is null");
            return (Criteria) this;
        }

        public Criteria andFuncpowerIsNotNull() {
            addCriterion("funcpower is not null");
            return (Criteria) this;
        }

        public Criteria andFuncpowerEqualTo(Integer value) {
            addCriterion("funcpower =", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerNotEqualTo(Integer value) {
            addCriterion("funcpower <>", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerGreaterThan(Integer value) {
            addCriterion("funcpower >", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("funcpower >=", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerLessThan(Integer value) {
            addCriterion("funcpower <", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerLessThanOrEqualTo(Integer value) {
            addCriterion("funcpower <=", value, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerIn(List<Integer> values) {
            addCriterion("funcpower in", values, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerNotIn(List<Integer> values) {
            addCriterion("funcpower not in", values, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerBetween(Integer value1, Integer value2) {
            addCriterion("funcpower between", value1, value2, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("funcpower not between", value1, value2, "funcpower");
            return (Criteria) this;
        }

        public Criteria andFuncchildIsNull() {
            addCriterion("funcchild is null");
            return (Criteria) this;
        }

        public Criteria andFuncchildIsNotNull() {
            addCriterion("funcchild is not null");
            return (Criteria) this;
        }

        public Criteria andFuncchildEqualTo(String value) {
            addCriterion("funcchild =", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildNotEqualTo(String value) {
            addCriterion("funcchild <>", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildGreaterThan(String value) {
            addCriterion("funcchild >", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildGreaterThanOrEqualTo(String value) {
            addCriterion("funcchild >=", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildLessThan(String value) {
            addCriterion("funcchild <", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildLessThanOrEqualTo(String value) {
            addCriterion("funcchild <=", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildLike(String value) {
            addCriterion("funcchild like", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildNotLike(String value) {
            addCriterion("funcchild not like", value, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildIn(List<String> values) {
            addCriterion("funcchild in", values, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildNotIn(List<String> values) {
            addCriterion("funcchild not in", values, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildBetween(String value1, String value2) {
            addCriterion("funcchild between", value1, value2, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncchildNotBetween(String value1, String value2) {
            addCriterion("funcchild not between", value1, value2, "funcchild");
            return (Criteria) this;
        }

        public Criteria andFuncpathIsNull() {
            addCriterion("funcpath is null");
            return (Criteria) this;
        }

        public Criteria andFuncpathIsNotNull() {
            addCriterion("funcpath is not null");
            return (Criteria) this;
        }

        public Criteria andFuncpathEqualTo(String value) {
            addCriterion("funcpath =", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathNotEqualTo(String value) {
            addCriterion("funcpath <>", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathGreaterThan(String value) {
            addCriterion("funcpath >", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathGreaterThanOrEqualTo(String value) {
            addCriterion("funcpath >=", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathLessThan(String value) {
            addCriterion("funcpath <", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathLessThanOrEqualTo(String value) {
            addCriterion("funcpath <=", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathLike(String value) {
            addCriterion("funcpath like", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathNotLike(String value) {
            addCriterion("funcpath not like", value, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathIn(List<String> values) {
            addCriterion("funcpath in", values, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathNotIn(List<String> values) {
            addCriterion("funcpath not in", values, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathBetween(String value1, String value2) {
            addCriterion("funcpath between", value1, value2, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFuncpathNotBetween(String value1, String value2) {
            addCriterion("funcpath not between", value1, value2, "funcpath");
            return (Criteria) this;
        }

        public Criteria andFunciconIsNull() {
            addCriterion("funcicon is null");
            return (Criteria) this;
        }

        public Criteria andFunciconIsNotNull() {
            addCriterion("funcicon is not null");
            return (Criteria) this;
        }

        public Criteria andFunciconEqualTo(String value) {
            addCriterion("funcicon =", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconNotEqualTo(String value) {
            addCriterion("funcicon <>", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconGreaterThan(String value) {
            addCriterion("funcicon >", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconGreaterThanOrEqualTo(String value) {
            addCriterion("funcicon >=", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconLessThan(String value) {
            addCriterion("funcicon <", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconLessThanOrEqualTo(String value) {
            addCriterion("funcicon <=", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconLike(String value) {
            addCriterion("funcicon like", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconNotLike(String value) {
            addCriterion("funcicon not like", value, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconIn(List<String> values) {
            addCriterion("funcicon in", values, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconNotIn(List<String> values) {
            addCriterion("funcicon not in", values, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconBetween(String value1, String value2) {
            addCriterion("funcicon between", value1, value2, "funcicon");
            return (Criteria) this;
        }

        public Criteria andFunciconNotBetween(String value1, String value2) {
            addCriterion("funcicon not between", value1, value2, "funcicon");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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