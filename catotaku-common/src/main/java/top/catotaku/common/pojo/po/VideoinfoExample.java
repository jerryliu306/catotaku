package top.catotaku.common.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoinfoExample() {
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

        public Criteria andVdIdIsNull() {
            addCriterion("vd_id is null");
            return (Criteria) this;
        }

        public Criteria andVdIdIsNotNull() {
            addCriterion("vd_id is not null");
            return (Criteria) this;
        }

        public Criteria andVdIdEqualTo(Integer value) {
            addCriterion("vd_id =", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotEqualTo(Integer value) {
            addCriterion("vd_id <>", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThan(Integer value) {
            addCriterion("vd_id >", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vd_id >=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThan(Integer value) {
            addCriterion("vd_id <", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThanOrEqualTo(Integer value) {
            addCriterion("vd_id <=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdIn(List<Integer> values) {
            addCriterion("vd_id in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotIn(List<Integer> values) {
            addCriterion("vd_id not in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdBetween(Integer value1, Integer value2) {
            addCriterion("vd_id between", value1, value2, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vd_id not between", value1, value2, "vdId");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterion("releaseTime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterion("releaseTime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterion("releaseTime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("releaseTime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterion("releaseTime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("releaseTime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterion("releaseTime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterion("releaseTime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterion("releaseTime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("releaseTime not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNull() {
            addCriterion("playCount is null");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNotNull() {
            addCriterion("playCount is not null");
            return (Criteria) this;
        }

        public Criteria andPlaycountEqualTo(Integer value) {
            addCriterion("playCount =", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotEqualTo(Integer value) {
            addCriterion("playCount <>", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThan(Integer value) {
            addCriterion("playCount >", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("playCount >=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThan(Integer value) {
            addCriterion("playCount <", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThanOrEqualTo(Integer value) {
            addCriterion("playCount <=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountIn(List<Integer> values) {
            addCriterion("playCount in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotIn(List<Integer> values) {
            addCriterion("playCount not in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountBetween(Integer value1, Integer value2) {
            addCriterion("playCount between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("playCount not between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNull() {
            addCriterion("collectCount is null");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNotNull() {
            addCriterion("collectCount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectcountEqualTo(Integer value) {
            addCriterion("collectCount =", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotEqualTo(Integer value) {
            addCriterion("collectCount <>", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThan(Integer value) {
            addCriterion("collectCount >", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectCount >=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThan(Integer value) {
            addCriterion("collectCount <", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThanOrEqualTo(Integer value) {
            addCriterion("collectCount <=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountIn(List<Integer> values) {
            addCriterion("collectCount in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotIn(List<Integer> values) {
            addCriterion("collectCount not in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountBetween(Integer value1, Integer value2) {
            addCriterion("collectCount between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotBetween(Integer value1, Integer value2) {
            addCriterion("collectCount not between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andSharecountIsNull() {
            addCriterion("shareCount is null");
            return (Criteria) this;
        }

        public Criteria andSharecountIsNotNull() {
            addCriterion("shareCount is not null");
            return (Criteria) this;
        }

        public Criteria andSharecountEqualTo(Integer value) {
            addCriterion("shareCount =", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotEqualTo(Integer value) {
            addCriterion("shareCount <>", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountGreaterThan(Integer value) {
            addCriterion("shareCount >", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shareCount >=", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountLessThan(Integer value) {
            addCriterion("shareCount <", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountLessThanOrEqualTo(Integer value) {
            addCriterion("shareCount <=", value, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountIn(List<Integer> values) {
            addCriterion("shareCount in", values, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotIn(List<Integer> values) {
            addCriterion("shareCount not in", values, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountBetween(Integer value1, Integer value2) {
            addCriterion("shareCount between", value1, value2, "sharecount");
            return (Criteria) this;
        }

        public Criteria andSharecountNotBetween(Integer value1, Integer value2) {
            addCriterion("shareCount not between", value1, value2, "sharecount");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNull() {
            addCriterion("likeCount is null");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNotNull() {
            addCriterion("likeCount is not null");
            return (Criteria) this;
        }

        public Criteria andLikecountEqualTo(Integer value) {
            addCriterion("likeCount =", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotEqualTo(Integer value) {
            addCriterion("likeCount <>", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThan(Integer value) {
            addCriterion("likeCount >", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeCount >=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThan(Integer value) {
            addCriterion("likeCount <", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThanOrEqualTo(Integer value) {
            addCriterion("likeCount <=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountIn(List<Integer> values) {
            addCriterion("likeCount in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotIn(List<Integer> values) {
            addCriterion("likeCount not in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountBetween(Integer value1, Integer value2) {
            addCriterion("likeCount between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotBetween(Integer value1, Integer value2) {
            addCriterion("likeCount not between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andCoincountIsNull() {
            addCriterion("coinCount is null");
            return (Criteria) this;
        }

        public Criteria andCoincountIsNotNull() {
            addCriterion("coinCount is not null");
            return (Criteria) this;
        }

        public Criteria andCoincountEqualTo(Integer value) {
            addCriterion("coinCount =", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountNotEqualTo(Integer value) {
            addCriterion("coinCount <>", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountGreaterThan(Integer value) {
            addCriterion("coinCount >", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coinCount >=", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountLessThan(Integer value) {
            addCriterion("coinCount <", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountLessThanOrEqualTo(Integer value) {
            addCriterion("coinCount <=", value, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountIn(List<Integer> values) {
            addCriterion("coinCount in", values, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountNotIn(List<Integer> values) {
            addCriterion("coinCount not in", values, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountBetween(Integer value1, Integer value2) {
            addCriterion("coinCount between", value1, value2, "coincount");
            return (Criteria) this;
        }

        public Criteria andCoincountNotBetween(Integer value1, Integer value2) {
            addCriterion("coinCount not between", value1, value2, "coincount");
            return (Criteria) this;
        }

        public Criteria andVcIdIsNull() {
            addCriterion("vc_id is null");
            return (Criteria) this;
        }

        public Criteria andVcIdIsNotNull() {
            addCriterion("vc_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdEqualTo(Integer value) {
            addCriterion("vc_id =", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotEqualTo(Integer value) {
            addCriterion("vc_id <>", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdGreaterThan(Integer value) {
            addCriterion("vc_id >", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_id >=", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdLessThan(Integer value) {
            addCriterion("vc_id <", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdLessThanOrEqualTo(Integer value) {
            addCriterion("vc_id <=", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdIn(List<Integer> values) {
            addCriterion("vc_id in", values, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotIn(List<Integer> values) {
            addCriterion("vc_id not in", values, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdBetween(Integer value1, Integer value2) {
            addCriterion("vc_id between", value1, value2, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_id not between", value1, value2, "vcId");
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