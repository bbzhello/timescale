package com.bbz.timescale.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KLineExample() {
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

        public Criteria andKTimeIsNull() {
            addCriterion("k_time is null");
            return (Criteria) this;
        }

        public Criteria andKTimeIsNotNull() {
            addCriterion("k_time is not null");
            return (Criteria) this;
        }

        public Criteria andKTimeEqualTo(Date value) {
            addCriterion("k_time =", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeNotEqualTo(Date value) {
            addCriterion("k_time <>", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeGreaterThan(Date value) {
            addCriterion("k_time >", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("k_time >=", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeLessThan(Date value) {
            addCriterion("k_time <", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeLessThanOrEqualTo(Date value) {
            addCriterion("k_time <=", value, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeIn(List<Date> values) {
            addCriterion("k_time in", values, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeNotIn(List<Date> values) {
            addCriterion("k_time not in", values, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeBetween(Date value1, Date value2) {
            addCriterion("k_time between", value1, value2, "kTime");
            return (Criteria) this;
        }

        public Criteria andKTimeNotBetween(Date value1, Date value2) {
            addCriterion("k_time not between", value1, value2, "kTime");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNull() {
            addCriterion("resolution is null");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNotNull() {
            addCriterion("resolution is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionEqualTo(Long value) {
            addCriterion("resolution =", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotEqualTo(Long value) {
            addCriterion("resolution <>", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThan(Long value) {
            addCriterion("resolution >", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThanOrEqualTo(Long value) {
            addCriterion("resolution >=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThan(Long value) {
            addCriterion("resolution <", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThanOrEqualTo(Long value) {
            addCriterion("resolution <=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionIn(List<Long> values) {
            addCriterion("resolution in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotIn(List<Long> values) {
            addCriterion("resolution not in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionBetween(Long value1, Long value2) {
            addCriterion("resolution between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotBetween(Long value1, Long value2) {
            addCriterion("resolution not between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(String value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(String value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(String value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(String value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(String value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLike(String value) {
            addCriterion("exchange_id like", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotLike(String value) {
            addCriterion("exchange_id not like", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<String> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<String> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(String value1, String value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(String value1, String value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andOIsNull() {
            addCriterion("o is null");
            return (Criteria) this;
        }

        public Criteria andOIsNotNull() {
            addCriterion("o is not null");
            return (Criteria) this;
        }

        public Criteria andOEqualTo(Long value) {
            addCriterion("o =", value, "o");
            return (Criteria) this;
        }

        public Criteria andONotEqualTo(Long value) {
            addCriterion("o <>", value, "o");
            return (Criteria) this;
        }

        public Criteria andOGreaterThan(Long value) {
            addCriterion("o >", value, "o");
            return (Criteria) this;
        }

        public Criteria andOGreaterThanOrEqualTo(Long value) {
            addCriterion("o >=", value, "o");
            return (Criteria) this;
        }

        public Criteria andOLessThan(Long value) {
            addCriterion("o <", value, "o");
            return (Criteria) this;
        }

        public Criteria andOLessThanOrEqualTo(Long value) {
            addCriterion("o <=", value, "o");
            return (Criteria) this;
        }

        public Criteria andOIn(List<Long> values) {
            addCriterion("o in", values, "o");
            return (Criteria) this;
        }

        public Criteria andONotIn(List<Long> values) {
            addCriterion("o not in", values, "o");
            return (Criteria) this;
        }

        public Criteria andOBetween(Long value1, Long value2) {
            addCriterion("o between", value1, value2, "o");
            return (Criteria) this;
        }

        public Criteria andONotBetween(Long value1, Long value2) {
            addCriterion("o not between", value1, value2, "o");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("h is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("h is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(Long value) {
            addCriterion("h =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(Long value) {
            addCriterion("h <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(Long value) {
            addCriterion("h >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(Long value) {
            addCriterion("h >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(Long value) {
            addCriterion("h <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(Long value) {
            addCriterion("h <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<Long> values) {
            addCriterion("h in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<Long> values) {
            addCriterion("h not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(Long value1, Long value2) {
            addCriterion("h between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(Long value1, Long value2) {
            addCriterion("h not between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andLIsNull() {
            addCriterion("l is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("l is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(Long value) {
            addCriterion("l =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(Long value) {
            addCriterion("l <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(Long value) {
            addCriterion("l >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(Long value) {
            addCriterion("l >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(Long value) {
            addCriterion("l <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(Long value) {
            addCriterion("l <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<Long> values) {
            addCriterion("l in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<Long> values) {
            addCriterion("l not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(Long value1, Long value2) {
            addCriterion("l between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(Long value1, Long value2) {
            addCriterion("l not between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("c is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("c is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(Long value) {
            addCriterion("c =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(Long value) {
            addCriterion("c <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(Long value) {
            addCriterion("c >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(Long value) {
            addCriterion("c >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(Long value) {
            addCriterion("c <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(Long value) {
            addCriterion("c <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<Long> values) {
            addCriterion("c in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<Long> values) {
            addCriterion("c not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(Long value1, Long value2) {
            addCriterion("c between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(Long value1, Long value2) {
            addCriterion("c not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Long value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Long value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Long value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Long value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Long value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Long> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Long> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Long value1, Long value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Long value1, Long value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andUrnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andUrnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andUrnoverEqualTo(Long value) {
            addCriterion("turnover =", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverNotEqualTo(Long value) {
            addCriterion("turnover <>", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverGreaterThan(Long value) {
            addCriterion("turnover >", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverGreaterThanOrEqualTo(Long value) {
            addCriterion("turnover >=", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverLessThan(Long value) {
            addCriterion("turnover <", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverLessThanOrEqualTo(Long value) {
            addCriterion("turnover <=", value, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverIn(List<Long> values) {
            addCriterion("turnover in", values, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverNotIn(List<Long> values) {
            addCriterion("turnover not in", values, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverBetween(Long value1, Long value2) {
            addCriterion("turnover between", value1, value2, "urnover");
            return (Criteria) this;
        }

        public Criteria andUrnoverNotBetween(Long value1, Long value2) {
            addCriterion("turnover not between", value1, value2, "urnover");
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