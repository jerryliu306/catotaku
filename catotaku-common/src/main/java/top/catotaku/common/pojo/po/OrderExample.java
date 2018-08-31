package top.catotaku.common.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andMakedateIsNull() {
            addCriterion("makeDate is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("makeDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterion("makeDate =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterion("makeDate <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterion("makeDate >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterion("makeDate >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterion("makeDate <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterion("makeDate <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterion("makeDate in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterion("makeDate not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterion("makeDate between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterion("makeDate not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNull() {
            addCriterion("paymentDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNotNull() {
            addCriterion("paymentDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateEqualTo(Date value) {
            addCriterion("paymentDate =", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotEqualTo(Date value) {
            addCriterion("paymentDate <>", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThan(Date value) {
            addCriterion("paymentDate >", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentDate >=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThan(Date value) {
            addCriterion("paymentDate <", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("paymentDate <=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIn(List<Date> values) {
            addCriterion("paymentDate in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotIn(List<Date> values) {
            addCriterion("paymentDate not in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateBetween(Date value1, Date value2) {
            addCriterion("paymentDate between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("paymentDate not between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateIsNull() {
            addCriterion("dekuverDate is null");
            return (Criteria) this;
        }

        public Criteria andDekuverdateIsNotNull() {
            addCriterion("dekuverDate is not null");
            return (Criteria) this;
        }

        public Criteria andDekuverdateEqualTo(Date value) {
            addCriterion("dekuverDate =", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateNotEqualTo(Date value) {
            addCriterion("dekuverDate <>", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateGreaterThan(Date value) {
            addCriterion("dekuverDate >", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dekuverDate >=", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateLessThan(Date value) {
            addCriterion("dekuverDate <", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateLessThanOrEqualTo(Date value) {
            addCriterion("dekuverDate <=", value, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateIn(List<Date> values) {
            addCriterion("dekuverDate in", values, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateNotIn(List<Date> values) {
            addCriterion("dekuverDate not in", values, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateBetween(Date value1, Date value2) {
            addCriterion("dekuverDate between", value1, value2, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andDekuverdateNotBetween(Date value1, Date value2) {
            addCriterion("dekuverDate not between", value1, value2, "dekuverdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberIsNull() {
            addCriterion("logisticsNumber is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberIsNotNull() {
            addCriterion("logisticsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberEqualTo(Integer value) {
            addCriterion("logisticsNumber =", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberNotEqualTo(Integer value) {
            addCriterion("logisticsNumber <>", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberGreaterThan(Integer value) {
            addCriterion("logisticsNumber >", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticsNumber >=", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberLessThan(Integer value) {
            addCriterion("logisticsNumber <", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("logisticsNumber <=", value, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberIn(List<Integer> values) {
            addCriterion("logisticsNumber in", values, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberNotIn(List<Integer> values) {
            addCriterion("logisticsNumber not in", values, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberBetween(Integer value1, Integer value2) {
            addCriterion("logisticsNumber between", value1, value2, "logisticsnumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticsNumber not between", value1, value2, "logisticsnumber");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNull() {
            addCriterion("discounts is null");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNotNull() {
            addCriterion("discounts is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountsEqualTo(Double value) {
            addCriterion("discounts =", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotEqualTo(Double value) {
            addCriterion("discounts <>", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThan(Double value) {
            addCriterion("discounts >", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThanOrEqualTo(Double value) {
            addCriterion("discounts >=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThan(Double value) {
            addCriterion("discounts <", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThanOrEqualTo(Double value) {
            addCriterion("discounts <=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsIn(List<Double> values) {
            addCriterion("discounts in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotIn(List<Double> values) {
            addCriterion("discounts not in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsBetween(Double value1, Double value2) {
            addCriterion("discounts between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotBetween(Double value1, Double value2) {
            addCriterion("discounts not between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIsNull() {
            addCriterion("shopVolume is null");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIsNotNull() {
            addCriterion("shopVolume is not null");
            return (Criteria) this;
        }

        public Criteria andShopvolumeEqualTo(Double value) {
            addCriterion("shopVolume =", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotEqualTo(Double value) {
            addCriterion("shopVolume <>", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeGreaterThan(Double value) {
            addCriterion("shopVolume >", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("shopVolume >=", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeLessThan(Double value) {
            addCriterion("shopVolume <", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeLessThanOrEqualTo(Double value) {
            addCriterion("shopVolume <=", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIn(List<Double> values) {
            addCriterion("shopVolume in", values, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotIn(List<Double> values) {
            addCriterion("shopVolume not in", values, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeBetween(Double value1, Double value2) {
            addCriterion("shopVolume between", value1, value2, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotBetween(Double value1, Double value2) {
            addCriterion("shopVolume not between", value1, value2, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andFireightIsNull() {
            addCriterion("fireight is null");
            return (Criteria) this;
        }

        public Criteria andFireightIsNotNull() {
            addCriterion("fireight is not null");
            return (Criteria) this;
        }

        public Criteria andFireightEqualTo(Double value) {
            addCriterion("fireight =", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightNotEqualTo(Double value) {
            addCriterion("fireight <>", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightGreaterThan(Double value) {
            addCriterion("fireight >", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightGreaterThanOrEqualTo(Double value) {
            addCriterion("fireight >=", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightLessThan(Double value) {
            addCriterion("fireight <", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightLessThanOrEqualTo(Double value) {
            addCriterion("fireight <=", value, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightIn(List<Double> values) {
            addCriterion("fireight in", values, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightNotIn(List<Double> values) {
            addCriterion("fireight not in", values, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightBetween(Double value1, Double value2) {
            addCriterion("fireight between", value1, value2, "fireight");
            return (Criteria) this;
        }

        public Criteria andFireightNotBetween(Double value1, Double value2) {
            addCriterion("fireight not between", value1, value2, "fireight");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUaIdIsNull() {
            addCriterion("ua_id is null");
            return (Criteria) this;
        }

        public Criteria andUaIdIsNotNull() {
            addCriterion("ua_id is not null");
            return (Criteria) this;
        }

        public Criteria andUaIdEqualTo(Integer value) {
            addCriterion("ua_id =", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotEqualTo(Integer value) {
            addCriterion("ua_id <>", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdGreaterThan(Integer value) {
            addCriterion("ua_id >", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ua_id >=", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdLessThan(Integer value) {
            addCriterion("ua_id <", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ua_id <=", value, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdIn(List<Integer> values) {
            addCriterion("ua_id in", values, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotIn(List<Integer> values) {
            addCriterion("ua_id not in", values, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdBetween(Integer value1, Integer value2) {
            addCriterion("ua_id between", value1, value2, "uaId");
            return (Criteria) this;
        }

        public Criteria andUaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ua_id not between", value1, value2, "uaId");
            return (Criteria) this;
        }

        public Criteria andXxIdIsNull() {
            addCriterion("xx_id is null");
            return (Criteria) this;
        }

        public Criteria andXxIdIsNotNull() {
            addCriterion("xx_id is not null");
            return (Criteria) this;
        }

        public Criteria andXxIdEqualTo(Integer value) {
            addCriterion("xx_id =", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdNotEqualTo(Integer value) {
            addCriterion("xx_id <>", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdGreaterThan(Integer value) {
            addCriterion("xx_id >", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xx_id >=", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdLessThan(Integer value) {
            addCriterion("xx_id <", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdLessThanOrEqualTo(Integer value) {
            addCriterion("xx_id <=", value, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdIn(List<Integer> values) {
            addCriterion("xx_id in", values, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdNotIn(List<Integer> values) {
            addCriterion("xx_id not in", values, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdBetween(Integer value1, Integer value2) {
            addCriterion("xx_id between", value1, value2, "xxId");
            return (Criteria) this;
        }

        public Criteria andXxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xx_id not between", value1, value2, "xxId");
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