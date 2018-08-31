package top.catotaku.common.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityevaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityevaluationExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdIsNull() {
            addCriterion("buy_u_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyUIdIsNotNull() {
            addCriterion("buy_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUIdEqualTo(Integer value) {
            addCriterion("buy_u_id =", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdNotEqualTo(Integer value) {
            addCriterion("buy_u_id <>", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdGreaterThan(Integer value) {
            addCriterion("buy_u_id >", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_u_id >=", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdLessThan(Integer value) {
            addCriterion("buy_u_id <", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdLessThanOrEqualTo(Integer value) {
            addCriterion("buy_u_id <=", value, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdIn(List<Integer> values) {
            addCriterion("buy_u_id in", values, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdNotIn(List<Integer> values) {
            addCriterion("buy_u_id not in", values, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdBetween(Integer value1, Integer value2) {
            addCriterion("buy_u_id between", value1, value2, "buyUId");
            return (Criteria) this;
        }

        public Criteria andBuyUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_u_id not between", value1, value2, "buyUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdIsNull() {
            addCriterion("sell_u_id is null");
            return (Criteria) this;
        }

        public Criteria andSellUIdIsNotNull() {
            addCriterion("sell_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellUIdEqualTo(Integer value) {
            addCriterion("sell_u_id =", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdNotEqualTo(Integer value) {
            addCriterion("sell_u_id <>", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdGreaterThan(Integer value) {
            addCriterion("sell_u_id >", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_u_id >=", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdLessThan(Integer value) {
            addCriterion("sell_u_id <", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdLessThanOrEqualTo(Integer value) {
            addCriterion("sell_u_id <=", value, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdIn(List<Integer> values) {
            addCriterion("sell_u_id in", values, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdNotIn(List<Integer> values) {
            addCriterion("sell_u_id not in", values, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdBetween(Integer value1, Integer value2) {
            addCriterion("sell_u_id between", value1, value2, "sellUId");
            return (Criteria) this;
        }

        public Criteria andSellUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_u_id not between", value1, value2, "sellUId");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelIsNull() {
            addCriterion("buy_leavel is null");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelIsNotNull() {
            addCriterion("buy_leavel is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelEqualTo(Integer value) {
            addCriterion("buy_leavel =", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelNotEqualTo(Integer value) {
            addCriterion("buy_leavel <>", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelGreaterThan(Integer value) {
            addCriterion("buy_leavel >", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_leavel >=", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelLessThan(Integer value) {
            addCriterion("buy_leavel <", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelLessThanOrEqualTo(Integer value) {
            addCriterion("buy_leavel <=", value, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelIn(List<Integer> values) {
            addCriterion("buy_leavel in", values, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelNotIn(List<Integer> values) {
            addCriterion("buy_leavel not in", values, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelBetween(Integer value1, Integer value2) {
            addCriterion("buy_leavel between", value1, value2, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyLeavelNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_leavel not between", value1, value2, "buyLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelIsNull() {
            addCriterion("sell_leavel is null");
            return (Criteria) this;
        }

        public Criteria andSellLeavelIsNotNull() {
            addCriterion("sell_leavel is not null");
            return (Criteria) this;
        }

        public Criteria andSellLeavelEqualTo(Integer value) {
            addCriterion("sell_leavel =", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelNotEqualTo(Integer value) {
            addCriterion("sell_leavel <>", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelGreaterThan(Integer value) {
            addCriterion("sell_leavel >", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_leavel >=", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelLessThan(Integer value) {
            addCriterion("sell_leavel <", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelLessThanOrEqualTo(Integer value) {
            addCriterion("sell_leavel <=", value, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelIn(List<Integer> values) {
            addCriterion("sell_leavel in", values, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelNotIn(List<Integer> values) {
            addCriterion("sell_leavel not in", values, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelBetween(Integer value1, Integer value2) {
            addCriterion("sell_leavel between", value1, value2, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andSellLeavelNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_leavel not between", value1, value2, "sellLeavel");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIsNull() {
            addCriterion("buy_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIsNotNull() {
            addCriterion("buy_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMessageEqualTo(String value) {
            addCriterion("buy_message =", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotEqualTo(String value) {
            addCriterion("buy_message <>", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageGreaterThan(String value) {
            addCriterion("buy_message >", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buy_message >=", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLessThan(String value) {
            addCriterion("buy_message <", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLessThanOrEqualTo(String value) {
            addCriterion("buy_message <=", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageLike(String value) {
            addCriterion("buy_message like", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotLike(String value) {
            addCriterion("buy_message not like", value, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageIn(List<String> values) {
            addCriterion("buy_message in", values, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotIn(List<String> values) {
            addCriterion("buy_message not in", values, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageBetween(String value1, String value2) {
            addCriterion("buy_message between", value1, value2, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andBuyMessageNotBetween(String value1, String value2) {
            addCriterion("buy_message not between", value1, value2, "buyMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageIsNull() {
            addCriterion("sell_message is null");
            return (Criteria) this;
        }

        public Criteria andSellMessageIsNotNull() {
            addCriterion("sell_message is not null");
            return (Criteria) this;
        }

        public Criteria andSellMessageEqualTo(String value) {
            addCriterion("sell_message =", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageNotEqualTo(String value) {
            addCriterion("sell_message <>", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageGreaterThan(String value) {
            addCriterion("sell_message >", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageGreaterThanOrEqualTo(String value) {
            addCriterion("sell_message >=", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageLessThan(String value) {
            addCriterion("sell_message <", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageLessThanOrEqualTo(String value) {
            addCriterion("sell_message <=", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageLike(String value) {
            addCriterion("sell_message like", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageNotLike(String value) {
            addCriterion("sell_message not like", value, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageIn(List<String> values) {
            addCriterion("sell_message in", values, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageNotIn(List<String> values) {
            addCriterion("sell_message not in", values, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageBetween(String value1, String value2) {
            addCriterion("sell_message between", value1, value2, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andSellMessageNotBetween(String value1, String value2) {
            addCriterion("sell_message not between", value1, value2, "sellMessage");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNull() {
            addCriterion("pd_id is null");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNotNull() {
            addCriterion("pd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdIdEqualTo(Integer value) {
            addCriterion("pd_id =", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotEqualTo(Integer value) {
            addCriterion("pd_id <>", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThan(Integer value) {
            addCriterion("pd_id >", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pd_id >=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThan(Integer value) {
            addCriterion("pd_id <", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThanOrEqualTo(Integer value) {
            addCriterion("pd_id <=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdIn(List<Integer> values) {
            addCriterion("pd_id in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotIn(List<Integer> values) {
            addCriterion("pd_id not in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdBetween(Integer value1, Integer value2) {
            addCriterion("pd_id between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pd_id not between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityIsNull() {
            addCriterion("commodityConformity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityIsNotNull() {
            addCriterion("commodityConformity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityEqualTo(Integer value) {
            addCriterion("commodityConformity =", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityNotEqualTo(Integer value) {
            addCriterion("commodityConformity <>", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityGreaterThan(Integer value) {
            addCriterion("commodityConformity >", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityConformity >=", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityLessThan(Integer value) {
            addCriterion("commodityConformity <", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityLessThanOrEqualTo(Integer value) {
            addCriterion("commodityConformity <=", value, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityIn(List<Integer> values) {
            addCriterion("commodityConformity in", values, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityNotIn(List<Integer> values) {
            addCriterion("commodityConformity not in", values, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityBetween(Integer value1, Integer value2) {
            addCriterion("commodityConformity between", value1, value2, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andCommodityconformityNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityConformity not between", value1, value2, "commodityconformity");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeIsNull() {
            addCriterion("servuceAttitude is null");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeIsNotNull() {
            addCriterion("servuceAttitude is not null");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeEqualTo(Integer value) {
            addCriterion("servuceAttitude =", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeNotEqualTo(Integer value) {
            addCriterion("servuceAttitude <>", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeGreaterThan(Integer value) {
            addCriterion("servuceAttitude >", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("servuceAttitude >=", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeLessThan(Integer value) {
            addCriterion("servuceAttitude <", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeLessThanOrEqualTo(Integer value) {
            addCriterion("servuceAttitude <=", value, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeIn(List<Integer> values) {
            addCriterion("servuceAttitude in", values, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeNotIn(List<Integer> values) {
            addCriterion("servuceAttitude not in", values, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeBetween(Integer value1, Integer value2) {
            addCriterion("servuceAttitude between", value1, value2, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andServuceattitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("servuceAttitude not between", value1, value2, "servuceattitude");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedIsNull() {
            addCriterion("deliverySpeed is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedIsNotNull() {
            addCriterion("deliverySpeed is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedEqualTo(Integer value) {
            addCriterion("deliverySpeed =", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedNotEqualTo(Integer value) {
            addCriterion("deliverySpeed <>", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedGreaterThan(Integer value) {
            addCriterion("deliverySpeed >", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverySpeed >=", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedLessThan(Integer value) {
            addCriterion("deliverySpeed <", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedLessThanOrEqualTo(Integer value) {
            addCriterion("deliverySpeed <=", value, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedIn(List<Integer> values) {
            addCriterion("deliverySpeed in", values, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedNotIn(List<Integer> values) {
            addCriterion("deliverySpeed not in", values, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedBetween(Integer value1, Integer value2) {
            addCriterion("deliverySpeed between", value1, value2, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andDeliveryspeedNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverySpeed not between", value1, value2, "deliveryspeed");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateIsNull() {
            addCriterion("wvaluationDate is null");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateIsNotNull() {
            addCriterion("wvaluationDate is not null");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateEqualTo(Date value) {
            addCriterion("wvaluationDate =", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateNotEqualTo(Date value) {
            addCriterion("wvaluationDate <>", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateGreaterThan(Date value) {
            addCriterion("wvaluationDate >", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("wvaluationDate >=", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateLessThan(Date value) {
            addCriterion("wvaluationDate <", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateLessThanOrEqualTo(Date value) {
            addCriterion("wvaluationDate <=", value, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateIn(List<Date> values) {
            addCriterion("wvaluationDate in", values, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateNotIn(List<Date> values) {
            addCriterion("wvaluationDate not in", values, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateBetween(Date value1, Date value2) {
            addCriterion("wvaluationDate between", value1, value2, "wvaluationdate");
            return (Criteria) this;
        }

        public Criteria andWvaluationdateNotBetween(Date value1, Date value2) {
            addCriterion("wvaluationDate not between", value1, value2, "wvaluationdate");
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