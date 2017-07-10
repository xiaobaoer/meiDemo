package gaoshuai.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gaoshuai on 2017/6/29.
 */
   public class TradeShoppingCart {
        private Long id;

        private Long userId;

        private Byte status;

        private Long itemId;

        private Long skuId;

        private String itemName;

        private Boolean itemType;

        private Long kolId;

        private Long shopId;

        private Long businessId;

        private BigDecimal salesPrice;

        private BigDecimal marketPrice;

        private Integer quantity;

        private Long isCoupon;

        private Byte serialNumber;

        private Byte isDeleted;

        private String feature;

        private Date gmtCreate;

        private Date gmtDelete;

        private Date gmtModified;

        private String skuShowAttribute;

        private String skuPicUrl;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Byte getStatus() {
            return status;
        }

        public void setStatus(Byte status) {
            this.status = status;
        }

        public Long getItemId() {
            return itemId;
        }

        public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName == null ? null : itemName.trim();
        }

        public Boolean getItemType() {
            return itemType;
        }

        public void setItemType(Boolean itemType) {
            this.itemType = itemType;
        }

        public Long getKolId() {
            return kolId;
        }

        public void setKolId(Long kolId) {
            this.kolId = kolId;
        }

        public Long getShopId() {
            return shopId;
        }

        public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getBusinessId() {
            return businessId;
        }

        public void setBusinessId(Long businessId) {
            this.businessId = businessId;
        }

        public BigDecimal getSalesPrice() {
            return salesPrice;
        }

        public void setSalesPrice(BigDecimal salesPrice) {
            this.salesPrice = salesPrice;
        }

        public BigDecimal getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(BigDecimal marketPrice) {
            this.marketPrice = marketPrice;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Long getIsCoupon() {
            return isCoupon;
        }

        public void setIsCoupon(Long isCoupon) {
            this.isCoupon = isCoupon;
        }

        public Byte getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(Byte serialNumber) {
            this.serialNumber = serialNumber;
        }

        public Byte getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Byte isDeleted) {
            this.isDeleted = isDeleted;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature == null ? null : feature.trim();
        }

        public Date getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(Date gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public Date getGmtDelete() {
            return gmtDelete;
        }

        public void setGmtDelete(Date gmtDelete) {
            this.gmtDelete = gmtDelete;
        }

        public Date getGmtModified() {
            return gmtModified;
        }

        public void setGmtModified(Date gmtModified) {
            this.gmtModified = gmtModified;
        }

        public String getSkuShowAttribute() {
            return skuShowAttribute;
        }

        public void setSkuShowAttribute(String skuShowAttribute) {
            this.skuShowAttribute = skuShowAttribute == null ? null : skuShowAttribute.trim();
        }

        public String getSkuPicUrl() {
            return skuPicUrl;
        }

        public void setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl == null ? null : skuPicUrl.trim();
        }
    }


