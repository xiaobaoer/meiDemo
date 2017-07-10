package gaoshuai.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gaoshuai on 2017/6/29.
 */

public class TradeShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TradeShoppingCartExample() {
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

    public TradeShoppingCartExample(Integer limitStart, Integer limitEnd) {
        oredCriteria = new ArrayList<Criteria>();
        this.limitStart=limitStart;
        this.limitEnd=limitEnd;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userId");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("itemId =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("itemId <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("itemId >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("itemId >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("itemId <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("itemId <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("itemId in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("itemId not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("itemId between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("itemId not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("skuId is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("skuId is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("skuId =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("skuId <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("skuId >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("skuId >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("skuId <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("skuId <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("skuId in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("skuId not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("skuId between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("skuId not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("itemName =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("itemName <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("itemName like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("itemName not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("itemName in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("itemType is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("itemType is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Boolean value) {
            addCriterion("itemType =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Boolean value) {
            addCriterion("itemType <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Boolean value) {
            addCriterion("itemType >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("itemType >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Boolean value) {
            addCriterion("itemType <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("itemType <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Boolean> values) {
            addCriterion("itemType in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Boolean> values) {
            addCriterion("itemType not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("itemType between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("itemType not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andKolIdIsNull() {
            addCriterion("kolId is null");
            return (Criteria) this;
        }

        public Criteria andKolIdIsNotNull() {
            addCriterion("kolId is not null");
            return (Criteria) this;
        }

        public Criteria andKolIdEqualTo(Long value) {
            addCriterion("kolId =", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotEqualTo(Long value) {
            addCriterion("kolId <>", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThan(Long value) {
            addCriterion("kolId >", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("kolId >=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThan(Long value) {
            addCriterion("kolId <", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdLessThanOrEqualTo(Long value) {
            addCriterion("kolId <=", value, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdIn(List<Long> values) {
            addCriterion("kolId in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotIn(List<Long> values) {
            addCriterion("kolId not in", values, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdBetween(Long value1, Long value2) {
            addCriterion("kolId between", value1, value2, "kolId");
            return (Criteria) this;
        }

        public Criteria andKolIdNotBetween(Long value1, Long value2) {
            addCriterion("kolId not between", value1, value2, "kolId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shopId =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shopId <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shopId >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopId >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shopId <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shopId <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shopId in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shopId not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shopId between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shopId not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Long value) {
            addCriterion("businessId =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Long value) {
            addCriterion("businessId <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Long value) {
            addCriterion("businessId >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("businessId >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Long value) {
            addCriterion("businessId <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Long value) {
            addCriterion("businessId <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Long> values) {
            addCriterion("businessId in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Long> values) {
            addCriterion("businessId not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Long value1, Long value2) {
            addCriterion("businessId between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Long value1, Long value2) {
            addCriterion("businessId not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNull() {
            addCriterion("salesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("salesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(BigDecimal value) {
            addCriterion("salesPrice =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(BigDecimal value) {
            addCriterion("salesPrice <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(BigDecimal value) {
            addCriterion("salesPrice >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salesPrice >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(BigDecimal value) {
            addCriterion("salesPrice <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salesPrice <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<BigDecimal> values) {
            addCriterion("salesPrice in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<BigDecimal> values) {
            addCriterion("salesPrice not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salesPrice between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salesPrice not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("marketPrice =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("marketPrice <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("marketPrice >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("marketPrice <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("marketPrice in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("marketPrice not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andIsCouponIsNull() {
            addCriterion("isCoupon is null");
            return (Criteria) this;
        }

        public Criteria andIsCouponIsNotNull() {
            addCriterion("isCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andIsCouponEqualTo(Long value) {
            addCriterion("isCoupon =", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotEqualTo(Long value) {
            addCriterion("isCoupon <>", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponGreaterThan(Long value) {
            addCriterion("isCoupon >", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponGreaterThanOrEqualTo(Long value) {
            addCriterion("isCoupon >=", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponLessThan(Long value) {
            addCriterion("isCoupon <", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponLessThanOrEqualTo(Long value) {
            addCriterion("isCoupon <=", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponIn(List<Long> values) {
            addCriterion("isCoupon in", values, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotIn(List<Long> values) {
            addCriterion("isCoupon not in", values, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponBetween(Long value1, Long value2) {
            addCriterion("isCoupon between", value1, value2, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotBetween(Long value1, Long value2) {
            addCriterion("isCoupon not between", value1, value2, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serialNumber is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Byte value) {
            addCriterion("serialNumber =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Byte value) {
            addCriterion("serialNumber <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Byte value) {
            addCriterion("serialNumber >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("serialNumber >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Byte value) {
            addCriterion("serialNumber <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Byte value) {
            addCriterion("serialNumber <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Byte> values) {
            addCriterion("serialNumber in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Byte> values) {
            addCriterion("serialNumber not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Byte value1, Byte value2) {
            addCriterion("serialNumber between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("serialNumber not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("isDeleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("isDeleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("isDeleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDeleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("isDeleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("isDeleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("isDeleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("isDeleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmtCreate is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmtCreate is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmtCreate =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmtCreate <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmtCreate >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtCreate >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmtCreate <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmtCreate <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmtCreate in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmtCreate not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmtCreate between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmtCreate not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteIsNull() {
            addCriterion("gmtDelete is null");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteIsNotNull() {
            addCriterion("gmtDelete is not null");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteEqualTo(Date value) {
            addCriterion("gmtDelete =", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteNotEqualTo(Date value) {
            addCriterion("gmtDelete <>", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteGreaterThan(Date value) {
            addCriterion("gmtDelete >", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtDelete >=", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteLessThan(Date value) {
            addCriterion("gmtDelete <", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteLessThanOrEqualTo(Date value) {
            addCriterion("gmtDelete <=", value, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteIn(List<Date> values) {
            addCriterion("gmtDelete in", values, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteNotIn(List<Date> values) {
            addCriterion("gmtDelete not in", values, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteBetween(Date value1, Date value2) {
            addCriterion("gmtDelete between", value1, value2, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtDeleteNotBetween(Date value1, Date value2) {
            addCriterion("gmtDelete not between", value1, value2, "gmtDelete");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmtModified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmtModified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmtModified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmtModified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmtModified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtModified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmtModified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmtModified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmtModified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmtModified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmtModified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmtModified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeIsNull() {
            addCriterion("skuShowAttribute is null");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeIsNotNull() {
            addCriterion("skuShowAttribute is not null");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeEqualTo(String value) {
            addCriterion("skuShowAttribute =", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeNotEqualTo(String value) {
            addCriterion("skuShowAttribute <>", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeGreaterThan(String value) {
            addCriterion("skuShowAttribute >", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("skuShowAttribute >=", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeLessThan(String value) {
            addCriterion("skuShowAttribute <", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeLessThanOrEqualTo(String value) {
            addCriterion("skuShowAttribute <=", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeLike(String value) {
            addCriterion("skuShowAttribute like", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeNotLike(String value) {
            addCriterion("skuShowAttribute not like", value, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeIn(List<String> values) {
            addCriterion("skuShowAttribute in", values, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeNotIn(List<String> values) {
            addCriterion("skuShowAttribute not in", values, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeBetween(String value1, String value2) {
            addCriterion("skuShowAttribute between", value1, value2, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuShowAttributeNotBetween(String value1, String value2) {
            addCriterion("skuShowAttribute not between", value1, value2, "skuShowAttribute");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlIsNull() {
            addCriterion("skuPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlIsNotNull() {
            addCriterion("skuPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlEqualTo(String value) {
            addCriterion("skuPicUrl =", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlNotEqualTo(String value) {
            addCriterion("skuPicUrl <>", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlGreaterThan(String value) {
            addCriterion("skuPicUrl >", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("skuPicUrl >=", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlLessThan(String value) {
            addCriterion("skuPicUrl <", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlLessThanOrEqualTo(String value) {
            addCriterion("skuPicUrl <=", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlLike(String value) {
            addCriterion("skuPicUrl like", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlNotLike(String value) {
            addCriterion("skuPicUrl not like", value, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlIn(List<String> values) {
            addCriterion("skuPicUrl in", values, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlNotIn(List<String> values) {
            addCriterion("skuPicUrl not in", values, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlBetween(String value1, String value2) {
            addCriterion("skuPicUrl between", value1, value2, "skuPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuPicUrlNotBetween(String value1, String value2) {
            addCriterion("skuPicUrl not between", value1, value2, "skuPicUrl");
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
