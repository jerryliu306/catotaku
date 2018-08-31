package top.catotaku.common.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCcIdIsNull() {
            addCriterion("cc_id is null");
            return (Criteria) this;
        }

        public Criteria andCcIdIsNotNull() {
            addCriterion("cc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcIdEqualTo(Integer value) {
            addCriterion("cc_id =", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotEqualTo(Integer value) {
            addCriterion("cc_id <>", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThan(Integer value) {
            addCriterion("cc_id >", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_id >=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThan(Integer value) {
            addCriterion("cc_id <", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThanOrEqualTo(Integer value) {
            addCriterion("cc_id <=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdIn(List<Integer> values) {
            addCriterion("cc_id in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotIn(List<Integer> values) {
            addCriterion("cc_id not in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdBetween(Integer value1, Integer value2) {
            addCriterion("cc_id between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_id not between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("salesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("salesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(Double value) {
            addCriterion("salesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(Double value) {
            addCriterion("salesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(Double value) {
            addCriterion("salesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(Double value) {
            addCriterion("salesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(Double value) {
            addCriterion("salesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(Double value) {
            addCriterion("salesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<Double> values) {
            addCriterion("salesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<Double> values) {
            addCriterion("salesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(Double value1, Double value2) {
            addCriterion("salesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(Double value1, Double value2) {
            addCriterion("salesPrice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSccIdIsNull() {
            addCriterion("scc_id is null");
            return (Criteria) this;
        }

        public Criteria andSccIdIsNotNull() {
            addCriterion("scc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSccIdEqualTo(Integer value) {
            addCriterion("scc_id =", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdNotEqualTo(Integer value) {
            addCriterion("scc_id <>", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdGreaterThan(Integer value) {
            addCriterion("scc_id >", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scc_id >=", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdLessThan(Integer value) {
            addCriterion("scc_id <", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdLessThanOrEqualTo(Integer value) {
            addCriterion("scc_id <=", value, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdIn(List<Integer> values) {
            addCriterion("scc_id in", values, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdNotIn(List<Integer> values) {
            addCriterion("scc_id not in", values, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdBetween(Integer value1, Integer value2) {
            addCriterion("scc_id between", value1, value2, "sccId");
            return (Criteria) this;
        }

        public Criteria andSccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scc_id not between", value1, value2, "sccId");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateIsNull() {
            addCriterion("soldOutDate is null");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateIsNotNull() {
            addCriterion("soldOutDate is not null");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateEqualTo(Date value) {
            addCriterion("soldOutDate =", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateNotEqualTo(Date value) {
            addCriterion("soldOutDate <>", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateGreaterThan(Date value) {
            addCriterion("soldOutDate >", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("soldOutDate >=", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateLessThan(Date value) {
            addCriterion("soldOutDate <", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateLessThanOrEqualTo(Date value) {
            addCriterion("soldOutDate <=", value, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateIn(List<Date> values) {
            addCriterion("soldOutDate in", values, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateNotIn(List<Date> values) {
            addCriterion("soldOutDate not in", values, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateBetween(Date value1, Date value2) {
            addCriterion("soldOutDate between", value1, value2, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andSoldoutdateNotBetween(Date value1, Date value2) {
            addCriterion("soldOutDate not between", value1, value2, "soldoutdate");
            return (Criteria) this;
        }

        public Criteria andDeletedateIsNull() {
            addCriterion("deleteDate is null");
            return (Criteria) this;
        }

        public Criteria andDeletedateIsNotNull() {
            addCriterion("deleteDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedateEqualTo(Date value) {
            addCriterion("deleteDate =", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateNotEqualTo(Date value) {
            addCriterion("deleteDate <>", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateGreaterThan(Date value) {
            addCriterion("deleteDate >", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateGreaterThanOrEqualTo(Date value) {
            addCriterion("deleteDate >=", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateLessThan(Date value) {
            addCriterion("deleteDate <", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateLessThanOrEqualTo(Date value) {
            addCriterion("deleteDate <=", value, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateIn(List<Date> values) {
            addCriterion("deleteDate in", values, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateNotIn(List<Date> values) {
            addCriterion("deleteDate not in", values, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateBetween(Date value1, Date value2) {
            addCriterion("deleteDate between", value1, value2, "deletedate");
            return (Criteria) this;
        }

        public Criteria andDeletedateNotBetween(Date value1, Date value2) {
            addCriterion("deleteDate not between", value1, value2, "deletedate");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesIsNull() {
            addCriterion("monthlySales is null");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesIsNotNull() {
            addCriterion("monthlySales is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesEqualTo(Integer value) {
            addCriterion("monthlySales =", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesNotEqualTo(Integer value) {
            addCriterion("monthlySales <>", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesGreaterThan(Integer value) {
            addCriterion("monthlySales >", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthlySales >=", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesLessThan(Integer value) {
            addCriterion("monthlySales <", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesLessThanOrEqualTo(Integer value) {
            addCriterion("monthlySales <=", value, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesIn(List<Integer> values) {
            addCriterion("monthlySales in", values, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesNotIn(List<Integer> values) {
            addCriterion("monthlySales not in", values, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesBetween(Integer value1, Integer value2) {
            addCriterion("monthlySales between", value1, value2, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andMonthlysalesNotBetween(Integer value1, Integer value2) {
            addCriterion("monthlySales not between", value1, value2, "monthlysales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNull() {
            addCriterion("totalSales is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNotNull() {
            addCriterion("totalSales is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesEqualTo(Integer value) {
            addCriterion("totalSales =", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotEqualTo(Integer value) {
            addCriterion("totalSales <>", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThan(Integer value) {
            addCriterion("totalSales >", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalSales >=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThan(Integer value) {
            addCriterion("totalSales <", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThanOrEqualTo(Integer value) {
            addCriterion("totalSales <=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIn(List<Integer> values) {
            addCriterion("totalSales in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotIn(List<Integer> values) {
            addCriterion("totalSales not in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesBetween(Integer value1, Integer value2) {
            addCriterion("totalSales between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("totalSales not between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andCpcIdIsNull() {
            addCriterion("cpc_id is null");
            return (Criteria) this;
        }

        public Criteria andCpcIdIsNotNull() {
            addCriterion("cpc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpcIdEqualTo(Integer value) {
            addCriterion("cpc_id =", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdNotEqualTo(Integer value) {
            addCriterion("cpc_id <>", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdGreaterThan(Integer value) {
            addCriterion("cpc_id >", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpc_id >=", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdLessThan(Integer value) {
            addCriterion("cpc_id <", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdLessThanOrEqualTo(Integer value) {
            addCriterion("cpc_id <=", value, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdIn(List<Integer> values) {
            addCriterion("cpc_id in", values, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdNotIn(List<Integer> values) {
            addCriterion("cpc_id not in", values, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdBetween(Integer value1, Integer value2) {
            addCriterion("cpc_id between", value1, value2, "cpcId");
            return (Criteria) this;
        }

        public Criteria andCpcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cpc_id not between", value1, value2, "cpcId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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