package org.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdMonitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdMonitorExample() {
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

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCpuUsageIsNull() {
            addCriterion("cpu_usage is null");
            return (Criteria) this;
        }

        public Criteria andCpuUsageIsNotNull() {
            addCriterion("cpu_usage is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUsageEqualTo(String value) {
            addCriterion("cpu_usage =", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageNotEqualTo(String value) {
            addCriterion("cpu_usage <>", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageGreaterThan(String value) {
            addCriterion("cpu_usage >", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_usage >=", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageLessThan(String value) {
            addCriterion("cpu_usage <", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageLessThanOrEqualTo(String value) {
            addCriterion("cpu_usage <=", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageLike(String value) {
            addCriterion("cpu_usage like", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageNotLike(String value) {
            addCriterion("cpu_usage not like", value, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageIn(List<String> values) {
            addCriterion("cpu_usage in", values, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageNotIn(List<String> values) {
            addCriterion("cpu_usage not in", values, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageBetween(String value1, String value2) {
            addCriterion("cpu_usage between", value1, value2, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andCpuUsageNotBetween(String value1, String value2) {
            addCriterion("cpu_usage not between", value1, value2, "cpuUsage");
            return (Criteria) this;
        }

        public Criteria andMemTotalIsNull() {
            addCriterion("mem_total is null");
            return (Criteria) this;
        }

        public Criteria andMemTotalIsNotNull() {
            addCriterion("mem_total is not null");
            return (Criteria) this;
        }

        public Criteria andMemTotalEqualTo(Float value) {
            addCriterion("mem_total =", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotEqualTo(Float value) {
            addCriterion("mem_total <>", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalGreaterThan(Float value) {
            addCriterion("mem_total >", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("mem_total >=", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalLessThan(Float value) {
            addCriterion("mem_total <", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalLessThanOrEqualTo(Float value) {
            addCriterion("mem_total <=", value, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalIn(List<Float> values) {
            addCriterion("mem_total in", values, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotIn(List<Float> values) {
            addCriterion("mem_total not in", values, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalBetween(Float value1, Float value2) {
            addCriterion("mem_total between", value1, value2, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemTotalNotBetween(Float value1, Float value2) {
            addCriterion("mem_total not between", value1, value2, "memTotal");
            return (Criteria) this;
        }

        public Criteria andMemUsedIsNull() {
            addCriterion("mem_used is null");
            return (Criteria) this;
        }

        public Criteria andMemUsedIsNotNull() {
            addCriterion("mem_used is not null");
            return (Criteria) this;
        }

        public Criteria andMemUsedEqualTo(Float value) {
            addCriterion("mem_used =", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotEqualTo(Float value) {
            addCriterion("mem_used <>", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedGreaterThan(Float value) {
            addCriterion("mem_used >", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedGreaterThanOrEqualTo(Float value) {
            addCriterion("mem_used >=", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedLessThan(Float value) {
            addCriterion("mem_used <", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedLessThanOrEqualTo(Float value) {
            addCriterion("mem_used <=", value, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedIn(List<Float> values) {
            addCriterion("mem_used in", values, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotIn(List<Float> values) {
            addCriterion("mem_used not in", values, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedBetween(Float value1, Float value2) {
            addCriterion("mem_used between", value1, value2, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsedNotBetween(Float value1, Float value2) {
            addCriterion("mem_used not between", value1, value2, "memUsed");
            return (Criteria) this;
        }

        public Criteria andMemUsageIsNull() {
            addCriterion("mem_usage is null");
            return (Criteria) this;
        }

        public Criteria andMemUsageIsNotNull() {
            addCriterion("mem_usage is not null");
            return (Criteria) this;
        }

        public Criteria andMemUsageEqualTo(String value) {
            addCriterion("mem_usage =", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageNotEqualTo(String value) {
            addCriterion("mem_usage <>", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageGreaterThan(String value) {
            addCriterion("mem_usage >", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageGreaterThanOrEqualTo(String value) {
            addCriterion("mem_usage >=", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageLessThan(String value) {
            addCriterion("mem_usage <", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageLessThanOrEqualTo(String value) {
            addCriterion("mem_usage <=", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageLike(String value) {
            addCriterion("mem_usage like", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageNotLike(String value) {
            addCriterion("mem_usage not like", value, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageIn(List<String> values) {
            addCriterion("mem_usage in", values, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageNotIn(List<String> values) {
            addCriterion("mem_usage not in", values, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageBetween(String value1, String value2) {
            addCriterion("mem_usage between", value1, value2, "memUsage");
            return (Criteria) this;
        }

        public Criteria andMemUsageNotBetween(String value1, String value2) {
            addCriterion("mem_usage not between", value1, value2, "memUsage");
            return (Criteria) this;
        }

        public Criteria andDiskTotalIsNull() {
            addCriterion("disk_total is null");
            return (Criteria) this;
        }

        public Criteria andDiskTotalIsNotNull() {
            addCriterion("disk_total is not null");
            return (Criteria) this;
        }

        public Criteria andDiskTotalEqualTo(Float value) {
            addCriterion("disk_total =", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotEqualTo(Float value) {
            addCriterion("disk_total <>", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalGreaterThan(Float value) {
            addCriterion("disk_total >", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("disk_total >=", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalLessThan(Float value) {
            addCriterion("disk_total <", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalLessThanOrEqualTo(Float value) {
            addCriterion("disk_total <=", value, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalIn(List<Float> values) {
            addCriterion("disk_total in", values, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotIn(List<Float> values) {
            addCriterion("disk_total not in", values, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalBetween(Float value1, Float value2) {
            addCriterion("disk_total between", value1, value2, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskTotalNotBetween(Float value1, Float value2) {
            addCriterion("disk_total not between", value1, value2, "diskTotal");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNull() {
            addCriterion("disk_used is null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIsNotNull() {
            addCriterion("disk_used is not null");
            return (Criteria) this;
        }

        public Criteria andDiskUsedEqualTo(Float value) {
            addCriterion("disk_used =", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotEqualTo(Float value) {
            addCriterion("disk_used <>", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThan(Float value) {
            addCriterion("disk_used >", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedGreaterThanOrEqualTo(Float value) {
            addCriterion("disk_used >=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThan(Float value) {
            addCriterion("disk_used <", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedLessThanOrEqualTo(Float value) {
            addCriterion("disk_used <=", value, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedIn(List<Float> values) {
            addCriterion("disk_used in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotIn(List<Float> values) {
            addCriterion("disk_used not in", values, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedBetween(Float value1, Float value2) {
            addCriterion("disk_used between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsedNotBetween(Float value1, Float value2) {
            addCriterion("disk_used not between", value1, value2, "diskUsed");
            return (Criteria) this;
        }

        public Criteria andDiskUsageIsNull() {
            addCriterion("disk_usage is null");
            return (Criteria) this;
        }

        public Criteria andDiskUsageIsNotNull() {
            addCriterion("disk_usage is not null");
            return (Criteria) this;
        }

        public Criteria andDiskUsageEqualTo(String value) {
            addCriterion("disk_usage =", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageNotEqualTo(String value) {
            addCriterion("disk_usage <>", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageGreaterThan(String value) {
            addCriterion("disk_usage >", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageGreaterThanOrEqualTo(String value) {
            addCriterion("disk_usage >=", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageLessThan(String value) {
            addCriterion("disk_usage <", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageLessThanOrEqualTo(String value) {
            addCriterion("disk_usage <=", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageLike(String value) {
            addCriterion("disk_usage like", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageNotLike(String value) {
            addCriterion("disk_usage not like", value, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageIn(List<String> values) {
            addCriterion("disk_usage in", values, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageNotIn(List<String> values) {
            addCriterion("disk_usage not in", values, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageBetween(String value1, String value2) {
            addCriterion("disk_usage between", value1, value2, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andDiskUsageNotBetween(String value1, String value2) {
            addCriterion("disk_usage not between", value1, value2, "diskUsage");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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