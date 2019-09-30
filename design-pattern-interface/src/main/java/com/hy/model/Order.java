package com.hy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Order implements Serializable {

    private static final long serialVersionUID = 1569832511964L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户id
    * isNullAble:1,defaultVal:0
    */
    private Integer userid;

    /**
    * 用户id
    * isNullAble:1
    */
    private Integer orderUserId;

    /**
    * 商家id
    * isNullAble:1
    */
    private String bussinessId;

    /**
    * 商家门店或设备编号
    * isNullAble:1
    */
    private String storesId;

    /**
    * 支付密码
    * isNullAble:1
    */
    private String payPassword;

    /**
    * 用户的短信验证码或优惠券码
    * isNullAble:1
    */
    private String verificationCode;

    /**
    * 实付金额
    * isNullAble:1
    */
    private java.math.BigDecimal amount;

    /**
    * 实付总金额
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal totalAmount;

    /**
    * 应付金额
订单金额（折扣前的金额）
订单金额（折扣前的金额）
订单金额（折扣前的金额）
订单金额（折扣前的金额）
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal price;

    /**
    * 应付总金额
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal totalPrice;

    /**
    * 0:宝钢积分 非积分部分需明确具体支付方式，1:非积分（商家无法区分） 2：现金 3：微信支付 4：银行卡[借记卡、信用卡]、5：商家积分 6：支付宝支付 7：京东支付 8：唯品支付 9：其它 12:工银e支付 13 银联支付 15 建行龙卡支付
    * isNullAble:1
    */
    private Integer payType;

    /**
    * 商家订单号
    * isNullAble:1
    */
    private String orderNumber;

    /**
    * 商家交易流水号
    * isNullAble:1
    */
    private String serialNumber;

    /**
    * 订单发生时间(0000-00-00 00:00:00)
    * isNullAble:1
    */
    private java.time.LocalDateTime orderDate;

    /**
    * 换货订单号关联对应的源销售订单号
    * isNullAble:1
    */
    private String originOrderNumber;

    /**
    * 订单完成状态:0:未完成 1:已完成
    * isNullAble:1,defaultVal:0
    */
    private Integer state;

    /**
    * 交易类型 0:收入 1:支出 2:兜礼收银台
    * isNullAble:1
    */
    private Integer orderType;

    /**
    * 交易阶段（0：短信验证码确认        1：完成订单    2:积分支付阶段     3:平台充值     4:返利     5:退货返积分     6：交易被取消     7:商家下单未支付    8:商家下单未支付订单被取消(0元订单作废) 9:券码核销订单 10:反核销订单）11:审核不通过(针对商家平台退货申请)
    * isNullAble:1
    */
    private Integer type;

    /**
    * 订单来源   0:机票个人      1：机票分销商       2：合作商家     3：睿渠平台    
    * isNullAble:1,defaultVal:0
    */
    private Integer source;

    /**
    * 需要支付密码 0:不需要 1:需要
    * isNullAble:1
    */
    private Integer isPayPassword;

    /**
    * 订单明细原始数据
    * isNullAble:1
    */
    private String orderDetail;

    /**
    * 是否返利   0：尚进行      1：已经返佣       2:已经返利   
    * isNullAble:0,defaultVal:0
    */
    private Integer isRebate;

    /**
    * 预积分商家返佣数量
    * isNullAble:0,defaultVal:0.0000000000
    */
    private java.math.BigDecimal BusinessRebate;

    /**
    * 会员返利数量
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal UserRebate;

    /**
    * 创建时间
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createDateTime;

    /**
    * 对账状态（0:未对账，1:已对账）
    * isNullAble:1,defaultVal:0
    */
    private Integer checkState;

    /**
    * 收银机编号
    * isNullAble:1
    */
    private String cashNumber;

    /**
    * 大订单编号
    * isNullAble:1,defaultVal:0
    */
    private String bigOrderNumber;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUserid(Integer userid){this.userid = userid;}

    public Integer getUserid(){return this.userid;}

    public void setOrderUserId(Integer orderUserId){this.orderUserId = orderUserId;}

    public Integer getOrderUserId(){return this.orderUserId;}

    public void setBussinessId(String bussinessId){this.bussinessId = bussinessId;}

    public String getBussinessId(){return this.bussinessId;}

    public void setStoresId(String storesId){this.storesId = storesId;}

    public String getStoresId(){return this.storesId;}

    public void setPayPassword(String payPassword){this.payPassword = payPassword;}

    public String getPayPassword(){return this.payPassword;}

    public void setVerificationCode(String verificationCode){this.verificationCode = verificationCode;}

    public String getVerificationCode(){return this.verificationCode;}

    public void setAmount(java.math.BigDecimal amount){this.amount = amount;}

    public java.math.BigDecimal getAmount(){return this.amount;}

    public void setTotalAmount(java.math.BigDecimal totalAmount){this.totalAmount = totalAmount;}

    public java.math.BigDecimal getTotalAmount(){return this.totalAmount;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setTotalPrice(java.math.BigDecimal totalPrice){this.totalPrice = totalPrice;}

    public java.math.BigDecimal getTotalPrice(){return this.totalPrice;}

    public void setPayType(Integer payType){this.payType = payType;}

    public Integer getPayType(){return this.payType;}

    public void setOrderNumber(String orderNumber){this.orderNumber = orderNumber;}

    public String getOrderNumber(){return this.orderNumber;}

    public void setSerialNumber(String serialNumber){this.serialNumber = serialNumber;}

    public String getSerialNumber(){return this.serialNumber;}

    public void setOrderDate(java.time.LocalDateTime orderDate){this.orderDate = orderDate;}

    public java.time.LocalDateTime getOrderDate(){return this.orderDate;}

    public void setOriginOrderNumber(String originOrderNumber){this.originOrderNumber = originOrderNumber;}

    public String getOriginOrderNumber(){return this.originOrderNumber;}

    public void setState(Integer state){this.state = state;}

    public Integer getState(){return this.state;}

    public void setOrderType(Integer orderType){this.orderType = orderType;}

    public Integer getOrderType(){return this.orderType;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setSource(Integer source){this.source = source;}

    public Integer getSource(){return this.source;}

    public void setIsPayPassword(Integer isPayPassword){this.isPayPassword = isPayPassword;}

    public Integer getIsPayPassword(){return this.isPayPassword;}

    public void setOrderDetail(String orderDetail){this.orderDetail = orderDetail;}

    public String getOrderDetail(){return this.orderDetail;}

    public void setIsRebate(Integer isRebate){this.isRebate = isRebate;}

    public Integer getIsRebate(){return this.isRebate;}

    public void setBusinessRebate(java.math.BigDecimal BusinessRebate){this.BusinessRebate = BusinessRebate;}

    public java.math.BigDecimal getBusinessRebate(){return this.BusinessRebate;}

    public void setUserRebate(java.math.BigDecimal UserRebate){this.UserRebate = UserRebate;}

    public java.math.BigDecimal getUserRebate(){return this.UserRebate;}

    public void setCreateDateTime(java.time.LocalDateTime createDateTime){this.createDateTime = createDateTime;}

    public java.time.LocalDateTime getCreateDateTime(){return this.createDateTime;}

    public void setCheckState(Integer checkState){this.checkState = checkState;}

    public Integer getCheckState(){return this.checkState;}

    public void setCashNumber(String cashNumber){this.cashNumber = cashNumber;}

    public String getCashNumber(){return this.cashNumber;}

    public void setBigOrderNumber(String bigOrderNumber){this.bigOrderNumber = bigOrderNumber;}

    public String getBigOrderNumber(){return this.bigOrderNumber;}
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                "userid='" + userid + '\'' +
                "orderUserId='" + orderUserId + '\'' +
                "bussinessId='" + bussinessId + '\'' +
                "storesId='" + storesId + '\'' +
                "payPassword='" + payPassword + '\'' +
                "verificationCode='" + verificationCode + '\'' +
                "amount='" + amount + '\'' +
                "totalAmount='" + totalAmount + '\'' +
                "price='" + price + '\'' +
                "totalPrice='" + totalPrice + '\'' +
                "payType='" + payType + '\'' +
                "orderNumber='" + orderNumber + '\'' +
                "serialNumber='" + serialNumber + '\'' +
                "orderDate='" + orderDate + '\'' +
                "originOrderNumber='" + originOrderNumber + '\'' +
                "state='" + state + '\'' +
                "orderType='" + orderType + '\'' +
                "type='" + type + '\'' +
                "source='" + source + '\'' +
                "isPayPassword='" + isPayPassword + '\'' +
                "orderDetail='" + orderDetail + '\'' +
                "isRebate='" + isRebate + '\'' +
                "BusinessRebate='" + BusinessRebate + '\'' +
                "UserRebate='" + UserRebate + '\'' +
                "createDateTime='" + createDateTime + '\'' +
                "checkState='" + checkState + '\'' +
                "cashNumber='" + cashNumber + '\'' +
                "bigOrderNumber='" + bigOrderNumber + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Order set;

        private ConditionBuilder where;

        public UpdateBuilder set(Order set){
            this.set = set;
            return this;
        }

        public Order getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Order{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<Integer> orderUserIdList;

        public List<Integer> getOrderUserIdList(){return this.orderUserIdList;}

        private Integer orderUserIdSt;

        private Integer orderUserIdEd;

        public Integer getOrderUserIdSt(){return this.orderUserIdSt;}

        public Integer getOrderUserIdEd(){return this.orderUserIdEd;}

        private List<String> bussinessIdList;

        public List<String> getBussinessIdList(){return this.bussinessIdList;}


        private List<String> fuzzyBussinessId;

        public List<String> getFuzzyBussinessId(){return this.fuzzyBussinessId;}

        private List<String> rightFuzzyBussinessId;

        public List<String> getRightFuzzyBussinessId(){return this.rightFuzzyBussinessId;}
        private List<String> storesIdList;

        public List<String> getStoresIdList(){return this.storesIdList;}


        private List<String> fuzzyStoresId;

        public List<String> getFuzzyStoresId(){return this.fuzzyStoresId;}

        private List<String> rightFuzzyStoresId;

        public List<String> getRightFuzzyStoresId(){return this.rightFuzzyStoresId;}
        private List<String> payPasswordList;

        public List<String> getPayPasswordList(){return this.payPasswordList;}


        private List<String> fuzzyPayPassword;

        public List<String> getFuzzyPayPassword(){return this.fuzzyPayPassword;}

        private List<String> rightFuzzyPayPassword;

        public List<String> getRightFuzzyPayPassword(){return this.rightFuzzyPayPassword;}
        private List<String> verificationCodeList;

        public List<String> getVerificationCodeList(){return this.verificationCodeList;}


        private List<String> fuzzyVerificationCode;

        public List<String> getFuzzyVerificationCode(){return this.fuzzyVerificationCode;}

        private List<String> rightFuzzyVerificationCode;

        public List<String> getRightFuzzyVerificationCode(){return this.rightFuzzyVerificationCode;}
        private List<java.math.BigDecimal> amountList;

        public List<java.math.BigDecimal> getAmountList(){return this.amountList;}

        private java.math.BigDecimal amountSt;

        private java.math.BigDecimal amountEd;

        public java.math.BigDecimal getAmountSt(){return this.amountSt;}

        public java.math.BigDecimal getAmountEd(){return this.amountEd;}

        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.math.BigDecimal> totalPriceList;

        public List<java.math.BigDecimal> getTotalPriceList(){return this.totalPriceList;}

        private java.math.BigDecimal totalPriceSt;

        private java.math.BigDecimal totalPriceEd;

        public java.math.BigDecimal getTotalPriceSt(){return this.totalPriceSt;}

        public java.math.BigDecimal getTotalPriceEd(){return this.totalPriceEd;}

        private List<Integer> payTypeList;

        public List<Integer> getPayTypeList(){return this.payTypeList;}

        private Integer payTypeSt;

        private Integer payTypeEd;

        public Integer getPayTypeSt(){return this.payTypeSt;}

        public Integer getPayTypeEd(){return this.payTypeEd;}

        private List<String> orderNumberList;

        public List<String> getOrderNumberList(){return this.orderNumberList;}


        private List<String> fuzzyOrderNumber;

        public List<String> getFuzzyOrderNumber(){return this.fuzzyOrderNumber;}

        private List<String> rightFuzzyOrderNumber;

        public List<String> getRightFuzzyOrderNumber(){return this.rightFuzzyOrderNumber;}
        private List<String> serialNumberList;

        public List<String> getSerialNumberList(){return this.serialNumberList;}


        private List<String> fuzzySerialNumber;

        public List<String> getFuzzySerialNumber(){return this.fuzzySerialNumber;}

        private List<String> rightFuzzySerialNumber;

        public List<String> getRightFuzzySerialNumber(){return this.rightFuzzySerialNumber;}
        private List<java.time.LocalDateTime> orderDateList;

        public List<java.time.LocalDateTime> getOrderDateList(){return this.orderDateList;}

        private java.time.LocalDateTime orderDateSt;

        private java.time.LocalDateTime orderDateEd;

        public java.time.LocalDateTime getOrderDateSt(){return this.orderDateSt;}

        public java.time.LocalDateTime getOrderDateEd(){return this.orderDateEd;}

        private List<String> originOrderNumberList;

        public List<String> getOriginOrderNumberList(){return this.originOrderNumberList;}


        private List<String> fuzzyOriginOrderNumber;

        public List<String> getFuzzyOriginOrderNumber(){return this.fuzzyOriginOrderNumber;}

        private List<String> rightFuzzyOriginOrderNumber;

        public List<String> getRightFuzzyOriginOrderNumber(){return this.rightFuzzyOriginOrderNumber;}
        private List<Integer> stateList;

        public List<Integer> getStateList(){return this.stateList;}

        private Integer stateSt;

        private Integer stateEd;

        public Integer getStateSt(){return this.stateSt;}

        public Integer getStateEd(){return this.stateEd;}

        private List<Integer> orderTypeList;

        public List<Integer> getOrderTypeList(){return this.orderTypeList;}

        private Integer orderTypeSt;

        private Integer orderTypeEd;

        public Integer getOrderTypeSt(){return this.orderTypeSt;}

        public Integer getOrderTypeEd(){return this.orderTypeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> sourceList;

        public List<Integer> getSourceList(){return this.sourceList;}

        private Integer sourceSt;

        private Integer sourceEd;

        public Integer getSourceSt(){return this.sourceSt;}

        public Integer getSourceEd(){return this.sourceEd;}

        private List<Integer> isPayPasswordList;

        public List<Integer> getIsPayPasswordList(){return this.isPayPasswordList;}

        private Integer isPayPasswordSt;

        private Integer isPayPasswordEd;

        public Integer getIsPayPasswordSt(){return this.isPayPasswordSt;}

        public Integer getIsPayPasswordEd(){return this.isPayPasswordEd;}

        private List<String> orderDetailList;

        public List<String> getOrderDetailList(){return this.orderDetailList;}


        private List<String> fuzzyOrderDetail;

        public List<String> getFuzzyOrderDetail(){return this.fuzzyOrderDetail;}

        private List<String> rightFuzzyOrderDetail;

        public List<String> getRightFuzzyOrderDetail(){return this.rightFuzzyOrderDetail;}
        private List<Integer> isRebateList;

        public List<Integer> getIsRebateList(){return this.isRebateList;}

        private Integer isRebateSt;

        private Integer isRebateEd;

        public Integer getIsRebateSt(){return this.isRebateSt;}

        public Integer getIsRebateEd(){return this.isRebateEd;}

        private List<java.math.BigDecimal> BusinessRebateList;

        public List<java.math.BigDecimal> getBusinessRebateList(){return this.BusinessRebateList;}

        private java.math.BigDecimal BusinessRebateSt;

        private java.math.BigDecimal BusinessRebateEd;

        public java.math.BigDecimal getBusinessRebateSt(){return this.BusinessRebateSt;}

        public java.math.BigDecimal getBusinessRebateEd(){return this.BusinessRebateEd;}

        private List<java.math.BigDecimal> UserRebateList;

        public List<java.math.BigDecimal> getUserRebateList(){return this.UserRebateList;}

        private java.math.BigDecimal UserRebateSt;

        private java.math.BigDecimal UserRebateEd;

        public java.math.BigDecimal getUserRebateSt(){return this.UserRebateSt;}

        public java.math.BigDecimal getUserRebateEd(){return this.UserRebateEd;}

        private List<java.time.LocalDateTime> createDateTimeList;

        public List<java.time.LocalDateTime> getCreateDateTimeList(){return this.createDateTimeList;}

        private java.time.LocalDateTime createDateTimeSt;

        private java.time.LocalDateTime createDateTimeEd;

        public java.time.LocalDateTime getCreateDateTimeSt(){return this.createDateTimeSt;}

        public java.time.LocalDateTime getCreateDateTimeEd(){return this.createDateTimeEd;}

        private List<Integer> checkStateList;

        public List<Integer> getCheckStateList(){return this.checkStateList;}

        private Integer checkStateSt;

        private Integer checkStateEd;

        public Integer getCheckStateSt(){return this.checkStateSt;}

        public Integer getCheckStateEd(){return this.checkStateEd;}

        private List<String> cashNumberList;

        public List<String> getCashNumberList(){return this.cashNumberList;}


        private List<String> fuzzyCashNumber;

        public List<String> getFuzzyCashNumber(){return this.fuzzyCashNumber;}

        private List<String> rightFuzzyCashNumber;

        public List<String> getRightFuzzyCashNumber(){return this.rightFuzzyCashNumber;}
        private List<String> bigOrderNumberList;

        public List<String> getBigOrderNumberList(){return this.bigOrderNumberList;}


        private List<String> fuzzyBigOrderNumber;

        public List<String> getFuzzyBigOrderNumber(){return this.fuzzyBigOrderNumber;}

        private List<String> rightFuzzyBigOrderNumber;

        public List<String> getRightFuzzyBigOrderNumber(){return this.rightFuzzyBigOrderNumber;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder useridBetWeen(Integer useridSt,Integer useridEd){
            this.useridSt = useridSt;
            this.useridEd = useridEd;
            return this;
        }

        public QueryBuilder useridGreaterEqThan(Integer useridSt){
            this.useridSt = useridSt;
            return this;
        }
        public QueryBuilder useridLessEqThan(Integer useridEd){
            this.useridEd = useridEd;
            return this;
        }


        public QueryBuilder userid(Integer userid){
            setUserid(userid);
            return this;
        }

        public QueryBuilder useridList(Integer ... userid){
            this.useridList = solveNullList(userid);
            return this;
        }

        public QueryBuilder useridList(List<Integer> userid){
            this.useridList = userid;
            return this;
        }

        public QueryBuilder fetchUserid(){
            setFetchFields("fetchFields","userid");
            return this;
        }

        public QueryBuilder excludeUserid(){
            setFetchFields("excludeFields","userid");
            return this;
        }

        public QueryBuilder orderUserIdBetWeen(Integer orderUserIdSt,Integer orderUserIdEd){
            this.orderUserIdSt = orderUserIdSt;
            this.orderUserIdEd = orderUserIdEd;
            return this;
        }

        public QueryBuilder orderUserIdGreaterEqThan(Integer orderUserIdSt){
            this.orderUserIdSt = orderUserIdSt;
            return this;
        }
        public QueryBuilder orderUserIdLessEqThan(Integer orderUserIdEd){
            this.orderUserIdEd = orderUserIdEd;
            return this;
        }


        public QueryBuilder orderUserId(Integer orderUserId){
            setOrderUserId(orderUserId);
            return this;
        }

        public QueryBuilder orderUserIdList(Integer ... orderUserId){
            this.orderUserIdList = solveNullList(orderUserId);
            return this;
        }

        public QueryBuilder orderUserIdList(List<Integer> orderUserId){
            this.orderUserIdList = orderUserId;
            return this;
        }

        public QueryBuilder fetchOrderUserId(){
            setFetchFields("fetchFields","orderUserId");
            return this;
        }

        public QueryBuilder excludeOrderUserId(){
            setFetchFields("excludeFields","orderUserId");
            return this;
        }

        public QueryBuilder fuzzyBussinessId (List<String> fuzzyBussinessId){
            this.fuzzyBussinessId = fuzzyBussinessId;
            return this;
        }

        public QueryBuilder fuzzyBussinessId (String ... fuzzyBussinessId){
            this.fuzzyBussinessId = solveNullList(fuzzyBussinessId);
            return this;
        }

        public QueryBuilder rightFuzzyBussinessId (List<String> rightFuzzyBussinessId){
            this.rightFuzzyBussinessId = rightFuzzyBussinessId;
            return this;
        }

        public QueryBuilder rightFuzzyBussinessId (String ... rightFuzzyBussinessId){
            this.rightFuzzyBussinessId = solveNullList(rightFuzzyBussinessId);
            return this;
        }

        public QueryBuilder bussinessId(String bussinessId){
            setBussinessId(bussinessId);
            return this;
        }

        public QueryBuilder bussinessIdList(String ... bussinessId){
            this.bussinessIdList = solveNullList(bussinessId);
            return this;
        }

        public QueryBuilder bussinessIdList(List<String> bussinessId){
            this.bussinessIdList = bussinessId;
            return this;
        }

        public QueryBuilder fetchBussinessId(){
            setFetchFields("fetchFields","bussinessId");
            return this;
        }

        public QueryBuilder excludeBussinessId(){
            setFetchFields("excludeFields","bussinessId");
            return this;
        }

        public QueryBuilder fuzzyStoresId (List<String> fuzzyStoresId){
            this.fuzzyStoresId = fuzzyStoresId;
            return this;
        }

        public QueryBuilder fuzzyStoresId (String ... fuzzyStoresId){
            this.fuzzyStoresId = solveNullList(fuzzyStoresId);
            return this;
        }

        public QueryBuilder rightFuzzyStoresId (List<String> rightFuzzyStoresId){
            this.rightFuzzyStoresId = rightFuzzyStoresId;
            return this;
        }

        public QueryBuilder rightFuzzyStoresId (String ... rightFuzzyStoresId){
            this.rightFuzzyStoresId = solveNullList(rightFuzzyStoresId);
            return this;
        }

        public QueryBuilder storesId(String storesId){
            setStoresId(storesId);
            return this;
        }

        public QueryBuilder storesIdList(String ... storesId){
            this.storesIdList = solveNullList(storesId);
            return this;
        }

        public QueryBuilder storesIdList(List<String> storesId){
            this.storesIdList = storesId;
            return this;
        }

        public QueryBuilder fetchStoresId(){
            setFetchFields("fetchFields","storesId");
            return this;
        }

        public QueryBuilder excludeStoresId(){
            setFetchFields("excludeFields","storesId");
            return this;
        }

        public QueryBuilder fuzzyPayPassword (List<String> fuzzyPayPassword){
            this.fuzzyPayPassword = fuzzyPayPassword;
            return this;
        }

        public QueryBuilder fuzzyPayPassword (String ... fuzzyPayPassword){
            this.fuzzyPayPassword = solveNullList(fuzzyPayPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPayPassword (List<String> rightFuzzyPayPassword){
            this.rightFuzzyPayPassword = rightFuzzyPayPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPayPassword (String ... rightFuzzyPayPassword){
            this.rightFuzzyPayPassword = solveNullList(rightFuzzyPayPassword);
            return this;
        }

        public QueryBuilder payPassword(String payPassword){
            setPayPassword(payPassword);
            return this;
        }

        public QueryBuilder payPasswordList(String ... payPassword){
            this.payPasswordList = solveNullList(payPassword);
            return this;
        }

        public QueryBuilder payPasswordList(List<String> payPassword){
            this.payPasswordList = payPassword;
            return this;
        }

        public QueryBuilder fetchPayPassword(){
            setFetchFields("fetchFields","payPassword");
            return this;
        }

        public QueryBuilder excludePayPassword(){
            setFetchFields("excludeFields","payPassword");
            return this;
        }

        public QueryBuilder fuzzyVerificationCode (List<String> fuzzyVerificationCode){
            this.fuzzyVerificationCode = fuzzyVerificationCode;
            return this;
        }

        public QueryBuilder fuzzyVerificationCode (String ... fuzzyVerificationCode){
            this.fuzzyVerificationCode = solveNullList(fuzzyVerificationCode);
            return this;
        }

        public QueryBuilder rightFuzzyVerificationCode (List<String> rightFuzzyVerificationCode){
            this.rightFuzzyVerificationCode = rightFuzzyVerificationCode;
            return this;
        }

        public QueryBuilder rightFuzzyVerificationCode (String ... rightFuzzyVerificationCode){
            this.rightFuzzyVerificationCode = solveNullList(rightFuzzyVerificationCode);
            return this;
        }

        public QueryBuilder verificationCode(String verificationCode){
            setVerificationCode(verificationCode);
            return this;
        }

        public QueryBuilder verificationCodeList(String ... verificationCode){
            this.verificationCodeList = solveNullList(verificationCode);
            return this;
        }

        public QueryBuilder verificationCodeList(List<String> verificationCode){
            this.verificationCodeList = verificationCode;
            return this;
        }

        public QueryBuilder fetchVerificationCode(){
            setFetchFields("fetchFields","verificationCode");
            return this;
        }

        public QueryBuilder excludeVerificationCode(){
            setFetchFields("excludeFields","verificationCode");
            return this;
        }

        public QueryBuilder amountBetWeen(java.math.BigDecimal amountSt,java.math.BigDecimal amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public QueryBuilder amountGreaterEqThan(java.math.BigDecimal amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public QueryBuilder amountLessEqThan(java.math.BigDecimal amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public QueryBuilder amount(java.math.BigDecimal amount){
            setAmount(amount);
            return this;
        }

        public QueryBuilder amountList(java.math.BigDecimal ... amount){
            this.amountList = solveNullList(amount);
            return this;
        }

        public QueryBuilder amountList(List<java.math.BigDecimal> amount){
            this.amountList = amount;
            return this;
        }

        public QueryBuilder fetchAmount(){
            setFetchFields("fetchFields","amount");
            return this;
        }

        public QueryBuilder excludeAmount(){
            setFetchFields("excludeFields","amount");
            return this;
        }

        public QueryBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public QueryBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public QueryBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public QueryBuilder totalAmount(java.math.BigDecimal totalAmount){
            setTotalAmount(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public QueryBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public QueryBuilder fetchTotalAmount(){
            setFetchFields("fetchFields","totalAmount");
            return this;
        }

        public QueryBuilder excludeTotalAmount(){
            setFetchFields("excludeFields","totalAmount");
            return this;
        }

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
            return this;
        }

        public QueryBuilder totalPriceBetWeen(java.math.BigDecimal totalPriceSt,java.math.BigDecimal totalPriceEd){
            this.totalPriceSt = totalPriceSt;
            this.totalPriceEd = totalPriceEd;
            return this;
        }

        public QueryBuilder totalPriceGreaterEqThan(java.math.BigDecimal totalPriceSt){
            this.totalPriceSt = totalPriceSt;
            return this;
        }
        public QueryBuilder totalPriceLessEqThan(java.math.BigDecimal totalPriceEd){
            this.totalPriceEd = totalPriceEd;
            return this;
        }


        public QueryBuilder totalPrice(java.math.BigDecimal totalPrice){
            setTotalPrice(totalPrice);
            return this;
        }

        public QueryBuilder totalPriceList(java.math.BigDecimal ... totalPrice){
            this.totalPriceList = solveNullList(totalPrice);
            return this;
        }

        public QueryBuilder totalPriceList(List<java.math.BigDecimal> totalPrice){
            this.totalPriceList = totalPrice;
            return this;
        }

        public QueryBuilder fetchTotalPrice(){
            setFetchFields("fetchFields","totalPrice");
            return this;
        }

        public QueryBuilder excludeTotalPrice(){
            setFetchFields("excludeFields","totalPrice");
            return this;
        }

        public QueryBuilder payTypeBetWeen(Integer payTypeSt,Integer payTypeEd){
            this.payTypeSt = payTypeSt;
            this.payTypeEd = payTypeEd;
            return this;
        }

        public QueryBuilder payTypeGreaterEqThan(Integer payTypeSt){
            this.payTypeSt = payTypeSt;
            return this;
        }
        public QueryBuilder payTypeLessEqThan(Integer payTypeEd){
            this.payTypeEd = payTypeEd;
            return this;
        }


        public QueryBuilder payType(Integer payType){
            setPayType(payType);
            return this;
        }

        public QueryBuilder payTypeList(Integer ... payType){
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public QueryBuilder payTypeList(List<Integer> payType){
            this.payTypeList = payType;
            return this;
        }

        public QueryBuilder fetchPayType(){
            setFetchFields("fetchFields","payType");
            return this;
        }

        public QueryBuilder excludePayType(){
            setFetchFields("excludeFields","payType");
            return this;
        }

        public QueryBuilder fuzzyOrderNumber (List<String> fuzzyOrderNumber){
            this.fuzzyOrderNumber = fuzzyOrderNumber;
            return this;
        }

        public QueryBuilder fuzzyOrderNumber (String ... fuzzyOrderNumber){
            this.fuzzyOrderNumber = solveNullList(fuzzyOrderNumber);
            return this;
        }

        public QueryBuilder rightFuzzyOrderNumber (List<String> rightFuzzyOrderNumber){
            this.rightFuzzyOrderNumber = rightFuzzyOrderNumber;
            return this;
        }

        public QueryBuilder rightFuzzyOrderNumber (String ... rightFuzzyOrderNumber){
            this.rightFuzzyOrderNumber = solveNullList(rightFuzzyOrderNumber);
            return this;
        }

        public QueryBuilder orderNumber(String orderNumber){
            setOrderNumber(orderNumber);
            return this;
        }

        public QueryBuilder orderNumberList(String ... orderNumber){
            this.orderNumberList = solveNullList(orderNumber);
            return this;
        }

        public QueryBuilder orderNumberList(List<String> orderNumber){
            this.orderNumberList = orderNumber;
            return this;
        }

        public QueryBuilder fetchOrderNumber(){
            setFetchFields("fetchFields","orderNumber");
            return this;
        }

        public QueryBuilder excludeOrderNumber(){
            setFetchFields("excludeFields","orderNumber");
            return this;
        }

        public QueryBuilder fuzzySerialNumber (List<String> fuzzySerialNumber){
            this.fuzzySerialNumber = fuzzySerialNumber;
            return this;
        }

        public QueryBuilder fuzzySerialNumber (String ... fuzzySerialNumber){
            this.fuzzySerialNumber = solveNullList(fuzzySerialNumber);
            return this;
        }

        public QueryBuilder rightFuzzySerialNumber (List<String> rightFuzzySerialNumber){
            this.rightFuzzySerialNumber = rightFuzzySerialNumber;
            return this;
        }

        public QueryBuilder rightFuzzySerialNumber (String ... rightFuzzySerialNumber){
            this.rightFuzzySerialNumber = solveNullList(rightFuzzySerialNumber);
            return this;
        }

        public QueryBuilder serialNumber(String serialNumber){
            setSerialNumber(serialNumber);
            return this;
        }

        public QueryBuilder serialNumberList(String ... serialNumber){
            this.serialNumberList = solveNullList(serialNumber);
            return this;
        }

        public QueryBuilder serialNumberList(List<String> serialNumber){
            this.serialNumberList = serialNumber;
            return this;
        }

        public QueryBuilder fetchSerialNumber(){
            setFetchFields("fetchFields","serialNumber");
            return this;
        }

        public QueryBuilder excludeSerialNumber(){
            setFetchFields("excludeFields","serialNumber");
            return this;
        }

        public QueryBuilder orderDateBetWeen(java.time.LocalDateTime orderDateSt,java.time.LocalDateTime orderDateEd){
            this.orderDateSt = orderDateSt;
            this.orderDateEd = orderDateEd;
            return this;
        }

        public QueryBuilder orderDateGreaterEqThan(java.time.LocalDateTime orderDateSt){
            this.orderDateSt = orderDateSt;
            return this;
        }
        public QueryBuilder orderDateLessEqThan(java.time.LocalDateTime orderDateEd){
            this.orderDateEd = orderDateEd;
            return this;
        }


        public QueryBuilder orderDate(java.time.LocalDateTime orderDate){
            setOrderDate(orderDate);
            return this;
        }

        public QueryBuilder orderDateList(java.time.LocalDateTime ... orderDate){
            this.orderDateList = solveNullList(orderDate);
            return this;
        }

        public QueryBuilder orderDateList(List<java.time.LocalDateTime> orderDate){
            this.orderDateList = orderDate;
            return this;
        }

        public QueryBuilder fetchOrderDate(){
            setFetchFields("fetchFields","orderDate");
            return this;
        }

        public QueryBuilder excludeOrderDate(){
            setFetchFields("excludeFields","orderDate");
            return this;
        }

        public QueryBuilder fuzzyOriginOrderNumber (List<String> fuzzyOriginOrderNumber){
            this.fuzzyOriginOrderNumber = fuzzyOriginOrderNumber;
            return this;
        }

        public QueryBuilder fuzzyOriginOrderNumber (String ... fuzzyOriginOrderNumber){
            this.fuzzyOriginOrderNumber = solveNullList(fuzzyOriginOrderNumber);
            return this;
        }

        public QueryBuilder rightFuzzyOriginOrderNumber (List<String> rightFuzzyOriginOrderNumber){
            this.rightFuzzyOriginOrderNumber = rightFuzzyOriginOrderNumber;
            return this;
        }

        public QueryBuilder rightFuzzyOriginOrderNumber (String ... rightFuzzyOriginOrderNumber){
            this.rightFuzzyOriginOrderNumber = solveNullList(rightFuzzyOriginOrderNumber);
            return this;
        }

        public QueryBuilder originOrderNumber(String originOrderNumber){
            setOriginOrderNumber(originOrderNumber);
            return this;
        }

        public QueryBuilder originOrderNumberList(String ... originOrderNumber){
            this.originOrderNumberList = solveNullList(originOrderNumber);
            return this;
        }

        public QueryBuilder originOrderNumberList(List<String> originOrderNumber){
            this.originOrderNumberList = originOrderNumber;
            return this;
        }

        public QueryBuilder fetchOriginOrderNumber(){
            setFetchFields("fetchFields","originOrderNumber");
            return this;
        }

        public QueryBuilder excludeOriginOrderNumber(){
            setFetchFields("excludeFields","originOrderNumber");
            return this;
        }

        public QueryBuilder stateBetWeen(Integer stateSt,Integer stateEd){
            this.stateSt = stateSt;
            this.stateEd = stateEd;
            return this;
        }

        public QueryBuilder stateGreaterEqThan(Integer stateSt){
            this.stateSt = stateSt;
            return this;
        }
        public QueryBuilder stateLessEqThan(Integer stateEd){
            this.stateEd = stateEd;
            return this;
        }


        public QueryBuilder state(Integer state){
            setState(state);
            return this;
        }

        public QueryBuilder stateList(Integer ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public QueryBuilder stateList(List<Integer> state){
            this.stateList = state;
            return this;
        }

        public QueryBuilder fetchState(){
            setFetchFields("fetchFields","state");
            return this;
        }

        public QueryBuilder excludeState(){
            setFetchFields("excludeFields","state");
            return this;
        }

        public QueryBuilder orderTypeBetWeen(Integer orderTypeSt,Integer orderTypeEd){
            this.orderTypeSt = orderTypeSt;
            this.orderTypeEd = orderTypeEd;
            return this;
        }

        public QueryBuilder orderTypeGreaterEqThan(Integer orderTypeSt){
            this.orderTypeSt = orderTypeSt;
            return this;
        }
        public QueryBuilder orderTypeLessEqThan(Integer orderTypeEd){
            this.orderTypeEd = orderTypeEd;
            return this;
        }


        public QueryBuilder orderType(Integer orderType){
            setOrderType(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(Integer ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public QueryBuilder orderTypeList(List<Integer> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public QueryBuilder fetchOrderType(){
            setFetchFields("fetchFields","orderType");
            return this;
        }

        public QueryBuilder excludeOrderType(){
            setFetchFields("excludeFields","orderType");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder sourceBetWeen(Integer sourceSt,Integer sourceEd){
            this.sourceSt = sourceSt;
            this.sourceEd = sourceEd;
            return this;
        }

        public QueryBuilder sourceGreaterEqThan(Integer sourceSt){
            this.sourceSt = sourceSt;
            return this;
        }
        public QueryBuilder sourceLessEqThan(Integer sourceEd){
            this.sourceEd = sourceEd;
            return this;
        }


        public QueryBuilder source(Integer source){
            setSource(source);
            return this;
        }

        public QueryBuilder sourceList(Integer ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public QueryBuilder sourceList(List<Integer> source){
            this.sourceList = source;
            return this;
        }

        public QueryBuilder fetchSource(){
            setFetchFields("fetchFields","source");
            return this;
        }

        public QueryBuilder excludeSource(){
            setFetchFields("excludeFields","source");
            return this;
        }

        public QueryBuilder isPayPasswordBetWeen(Integer isPayPasswordSt,Integer isPayPasswordEd){
            this.isPayPasswordSt = isPayPasswordSt;
            this.isPayPasswordEd = isPayPasswordEd;
            return this;
        }

        public QueryBuilder isPayPasswordGreaterEqThan(Integer isPayPasswordSt){
            this.isPayPasswordSt = isPayPasswordSt;
            return this;
        }
        public QueryBuilder isPayPasswordLessEqThan(Integer isPayPasswordEd){
            this.isPayPasswordEd = isPayPasswordEd;
            return this;
        }


        public QueryBuilder isPayPassword(Integer isPayPassword){
            setIsPayPassword(isPayPassword);
            return this;
        }

        public QueryBuilder isPayPasswordList(Integer ... isPayPassword){
            this.isPayPasswordList = solveNullList(isPayPassword);
            return this;
        }

        public QueryBuilder isPayPasswordList(List<Integer> isPayPassword){
            this.isPayPasswordList = isPayPassword;
            return this;
        }

        public QueryBuilder fetchIsPayPassword(){
            setFetchFields("fetchFields","isPayPassword");
            return this;
        }

        public QueryBuilder excludeIsPayPassword(){
            setFetchFields("excludeFields","isPayPassword");
            return this;
        }

        public QueryBuilder fuzzyOrderDetail (List<String> fuzzyOrderDetail){
            this.fuzzyOrderDetail = fuzzyOrderDetail;
            return this;
        }

        public QueryBuilder fuzzyOrderDetail (String ... fuzzyOrderDetail){
            this.fuzzyOrderDetail = solveNullList(fuzzyOrderDetail);
            return this;
        }

        public QueryBuilder rightFuzzyOrderDetail (List<String> rightFuzzyOrderDetail){
            this.rightFuzzyOrderDetail = rightFuzzyOrderDetail;
            return this;
        }

        public QueryBuilder rightFuzzyOrderDetail (String ... rightFuzzyOrderDetail){
            this.rightFuzzyOrderDetail = solveNullList(rightFuzzyOrderDetail);
            return this;
        }

        public QueryBuilder orderDetail(String orderDetail){
            setOrderDetail(orderDetail);
            return this;
        }

        public QueryBuilder orderDetailList(String ... orderDetail){
            this.orderDetailList = solveNullList(orderDetail);
            return this;
        }

        public QueryBuilder orderDetailList(List<String> orderDetail){
            this.orderDetailList = orderDetail;
            return this;
        }

        public QueryBuilder fetchOrderDetail(){
            setFetchFields("fetchFields","orderDetail");
            return this;
        }

        public QueryBuilder excludeOrderDetail(){
            setFetchFields("excludeFields","orderDetail");
            return this;
        }

        public QueryBuilder isRebateBetWeen(Integer isRebateSt,Integer isRebateEd){
            this.isRebateSt = isRebateSt;
            this.isRebateEd = isRebateEd;
            return this;
        }

        public QueryBuilder isRebateGreaterEqThan(Integer isRebateSt){
            this.isRebateSt = isRebateSt;
            return this;
        }
        public QueryBuilder isRebateLessEqThan(Integer isRebateEd){
            this.isRebateEd = isRebateEd;
            return this;
        }


        public QueryBuilder isRebate(Integer isRebate){
            setIsRebate(isRebate);
            return this;
        }

        public QueryBuilder isRebateList(Integer ... isRebate){
            this.isRebateList = solveNullList(isRebate);
            return this;
        }

        public QueryBuilder isRebateList(List<Integer> isRebate){
            this.isRebateList = isRebate;
            return this;
        }

        public QueryBuilder fetchIsRebate(){
            setFetchFields("fetchFields","isRebate");
            return this;
        }

        public QueryBuilder excludeIsRebate(){
            setFetchFields("excludeFields","isRebate");
            return this;
        }

        public QueryBuilder BusinessRebateBetWeen(java.math.BigDecimal BusinessRebateSt,java.math.BigDecimal BusinessRebateEd){
            this.BusinessRebateSt = BusinessRebateSt;
            this.BusinessRebateEd = BusinessRebateEd;
            return this;
        }

        public QueryBuilder BusinessRebateGreaterEqThan(java.math.BigDecimal BusinessRebateSt){
            this.BusinessRebateSt = BusinessRebateSt;
            return this;
        }
        public QueryBuilder BusinessRebateLessEqThan(java.math.BigDecimal BusinessRebateEd){
            this.BusinessRebateEd = BusinessRebateEd;
            return this;
        }


        public QueryBuilder BusinessRebate(java.math.BigDecimal BusinessRebate){
            setBusinessRebate(BusinessRebate);
            return this;
        }

        public QueryBuilder BusinessRebateList(java.math.BigDecimal ... BusinessRebate){
            this.BusinessRebateList = solveNullList(BusinessRebate);
            return this;
        }

        public QueryBuilder BusinessRebateList(List<java.math.BigDecimal> BusinessRebate){
            this.BusinessRebateList = BusinessRebate;
            return this;
        }

        public QueryBuilder fetchBusinessRebate(){
            setFetchFields("fetchFields","BusinessRebate");
            return this;
        }

        public QueryBuilder excludeBusinessRebate(){
            setFetchFields("excludeFields","BusinessRebate");
            return this;
        }

        public QueryBuilder UserRebateBetWeen(java.math.BigDecimal UserRebateSt,java.math.BigDecimal UserRebateEd){
            this.UserRebateSt = UserRebateSt;
            this.UserRebateEd = UserRebateEd;
            return this;
        }

        public QueryBuilder UserRebateGreaterEqThan(java.math.BigDecimal UserRebateSt){
            this.UserRebateSt = UserRebateSt;
            return this;
        }
        public QueryBuilder UserRebateLessEqThan(java.math.BigDecimal UserRebateEd){
            this.UserRebateEd = UserRebateEd;
            return this;
        }


        public QueryBuilder UserRebate(java.math.BigDecimal UserRebate){
            setUserRebate(UserRebate);
            return this;
        }

        public QueryBuilder UserRebateList(java.math.BigDecimal ... UserRebate){
            this.UserRebateList = solveNullList(UserRebate);
            return this;
        }

        public QueryBuilder UserRebateList(List<java.math.BigDecimal> UserRebate){
            this.UserRebateList = UserRebate;
            return this;
        }

        public QueryBuilder fetchUserRebate(){
            setFetchFields("fetchFields","UserRebate");
            return this;
        }

        public QueryBuilder excludeUserRebate(){
            setFetchFields("excludeFields","UserRebate");
            return this;
        }

        public QueryBuilder createDateTimeBetWeen(java.time.LocalDateTime createDateTimeSt,java.time.LocalDateTime createDateTimeEd){
            this.createDateTimeSt = createDateTimeSt;
            this.createDateTimeEd = createDateTimeEd;
            return this;
        }

        public QueryBuilder createDateTimeGreaterEqThan(java.time.LocalDateTime createDateTimeSt){
            this.createDateTimeSt = createDateTimeSt;
            return this;
        }
        public QueryBuilder createDateTimeLessEqThan(java.time.LocalDateTime createDateTimeEd){
            this.createDateTimeEd = createDateTimeEd;
            return this;
        }


        public QueryBuilder createDateTime(java.time.LocalDateTime createDateTime){
            setCreateDateTime(createDateTime);
            return this;
        }

        public QueryBuilder createDateTimeList(java.time.LocalDateTime ... createDateTime){
            this.createDateTimeList = solveNullList(createDateTime);
            return this;
        }

        public QueryBuilder createDateTimeList(List<java.time.LocalDateTime> createDateTime){
            this.createDateTimeList = createDateTime;
            return this;
        }

        public QueryBuilder fetchCreateDateTime(){
            setFetchFields("fetchFields","createDateTime");
            return this;
        }

        public QueryBuilder excludeCreateDateTime(){
            setFetchFields("excludeFields","createDateTime");
            return this;
        }

        public QueryBuilder checkStateBetWeen(Integer checkStateSt,Integer checkStateEd){
            this.checkStateSt = checkStateSt;
            this.checkStateEd = checkStateEd;
            return this;
        }

        public QueryBuilder checkStateGreaterEqThan(Integer checkStateSt){
            this.checkStateSt = checkStateSt;
            return this;
        }
        public QueryBuilder checkStateLessEqThan(Integer checkStateEd){
            this.checkStateEd = checkStateEd;
            return this;
        }


        public QueryBuilder checkState(Integer checkState){
            setCheckState(checkState);
            return this;
        }

        public QueryBuilder checkStateList(Integer ... checkState){
            this.checkStateList = solveNullList(checkState);
            return this;
        }

        public QueryBuilder checkStateList(List<Integer> checkState){
            this.checkStateList = checkState;
            return this;
        }

        public QueryBuilder fetchCheckState(){
            setFetchFields("fetchFields","checkState");
            return this;
        }

        public QueryBuilder excludeCheckState(){
            setFetchFields("excludeFields","checkState");
            return this;
        }

        public QueryBuilder fuzzyCashNumber (List<String> fuzzyCashNumber){
            this.fuzzyCashNumber = fuzzyCashNumber;
            return this;
        }

        public QueryBuilder fuzzyCashNumber (String ... fuzzyCashNumber){
            this.fuzzyCashNumber = solveNullList(fuzzyCashNumber);
            return this;
        }

        public QueryBuilder rightFuzzyCashNumber (List<String> rightFuzzyCashNumber){
            this.rightFuzzyCashNumber = rightFuzzyCashNumber;
            return this;
        }

        public QueryBuilder rightFuzzyCashNumber (String ... rightFuzzyCashNumber){
            this.rightFuzzyCashNumber = solveNullList(rightFuzzyCashNumber);
            return this;
        }

        public QueryBuilder cashNumber(String cashNumber){
            setCashNumber(cashNumber);
            return this;
        }

        public QueryBuilder cashNumberList(String ... cashNumber){
            this.cashNumberList = solveNullList(cashNumber);
            return this;
        }

        public QueryBuilder cashNumberList(List<String> cashNumber){
            this.cashNumberList = cashNumber;
            return this;
        }

        public QueryBuilder fetchCashNumber(){
            setFetchFields("fetchFields","cashNumber");
            return this;
        }

        public QueryBuilder excludeCashNumber(){
            setFetchFields("excludeFields","cashNumber");
            return this;
        }

        public QueryBuilder fuzzyBigOrderNumber (List<String> fuzzyBigOrderNumber){
            this.fuzzyBigOrderNumber = fuzzyBigOrderNumber;
            return this;
        }

        public QueryBuilder fuzzyBigOrderNumber (String ... fuzzyBigOrderNumber){
            this.fuzzyBigOrderNumber = solveNullList(fuzzyBigOrderNumber);
            return this;
        }

        public QueryBuilder rightFuzzyBigOrderNumber (List<String> rightFuzzyBigOrderNumber){
            this.rightFuzzyBigOrderNumber = rightFuzzyBigOrderNumber;
            return this;
        }

        public QueryBuilder rightFuzzyBigOrderNumber (String ... rightFuzzyBigOrderNumber){
            this.rightFuzzyBigOrderNumber = solveNullList(rightFuzzyBigOrderNumber);
            return this;
        }

        public QueryBuilder bigOrderNumber(String bigOrderNumber){
            setBigOrderNumber(bigOrderNumber);
            return this;
        }

        public QueryBuilder bigOrderNumberList(String ... bigOrderNumber){
            this.bigOrderNumberList = solveNullList(bigOrderNumber);
            return this;
        }

        public QueryBuilder bigOrderNumberList(List<String> bigOrderNumber){
            this.bigOrderNumberList = bigOrderNumber;
            return this;
        }

        public QueryBuilder fetchBigOrderNumber(){
            setFetchFields("fetchFields","bigOrderNumber");
            return this;
        }

        public QueryBuilder excludeBigOrderNumber(){
            setFetchFields("excludeFields","bigOrderNumber");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Order build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> useridList;

        public List<Integer> getUseridList(){return this.useridList;}

        private Integer useridSt;

        private Integer useridEd;

        public Integer getUseridSt(){return this.useridSt;}

        public Integer getUseridEd(){return this.useridEd;}

        private List<Integer> orderUserIdList;

        public List<Integer> getOrderUserIdList(){return this.orderUserIdList;}

        private Integer orderUserIdSt;

        private Integer orderUserIdEd;

        public Integer getOrderUserIdSt(){return this.orderUserIdSt;}

        public Integer getOrderUserIdEd(){return this.orderUserIdEd;}

        private List<String> bussinessIdList;

        public List<String> getBussinessIdList(){return this.bussinessIdList;}


        private List<String> fuzzyBussinessId;

        public List<String> getFuzzyBussinessId(){return this.fuzzyBussinessId;}

        private List<String> rightFuzzyBussinessId;

        public List<String> getRightFuzzyBussinessId(){return this.rightFuzzyBussinessId;}
        private List<String> storesIdList;

        public List<String> getStoresIdList(){return this.storesIdList;}


        private List<String> fuzzyStoresId;

        public List<String> getFuzzyStoresId(){return this.fuzzyStoresId;}

        private List<String> rightFuzzyStoresId;

        public List<String> getRightFuzzyStoresId(){return this.rightFuzzyStoresId;}
        private List<String> payPasswordList;

        public List<String> getPayPasswordList(){return this.payPasswordList;}


        private List<String> fuzzyPayPassword;

        public List<String> getFuzzyPayPassword(){return this.fuzzyPayPassword;}

        private List<String> rightFuzzyPayPassword;

        public List<String> getRightFuzzyPayPassword(){return this.rightFuzzyPayPassword;}
        private List<String> verificationCodeList;

        public List<String> getVerificationCodeList(){return this.verificationCodeList;}


        private List<String> fuzzyVerificationCode;

        public List<String> getFuzzyVerificationCode(){return this.fuzzyVerificationCode;}

        private List<String> rightFuzzyVerificationCode;

        public List<String> getRightFuzzyVerificationCode(){return this.rightFuzzyVerificationCode;}
        private List<java.math.BigDecimal> amountList;

        public List<java.math.BigDecimal> getAmountList(){return this.amountList;}

        private java.math.BigDecimal amountSt;

        private java.math.BigDecimal amountEd;

        public java.math.BigDecimal getAmountSt(){return this.amountSt;}

        public java.math.BigDecimal getAmountEd(){return this.amountEd;}

        private List<java.math.BigDecimal> totalAmountList;

        public List<java.math.BigDecimal> getTotalAmountList(){return this.totalAmountList;}

        private java.math.BigDecimal totalAmountSt;

        private java.math.BigDecimal totalAmountEd;

        public java.math.BigDecimal getTotalAmountSt(){return this.totalAmountSt;}

        public java.math.BigDecimal getTotalAmountEd(){return this.totalAmountEd;}

        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.math.BigDecimal> totalPriceList;

        public List<java.math.BigDecimal> getTotalPriceList(){return this.totalPriceList;}

        private java.math.BigDecimal totalPriceSt;

        private java.math.BigDecimal totalPriceEd;

        public java.math.BigDecimal getTotalPriceSt(){return this.totalPriceSt;}

        public java.math.BigDecimal getTotalPriceEd(){return this.totalPriceEd;}

        private List<Integer> payTypeList;

        public List<Integer> getPayTypeList(){return this.payTypeList;}

        private Integer payTypeSt;

        private Integer payTypeEd;

        public Integer getPayTypeSt(){return this.payTypeSt;}

        public Integer getPayTypeEd(){return this.payTypeEd;}

        private List<String> orderNumberList;

        public List<String> getOrderNumberList(){return this.orderNumberList;}


        private List<String> fuzzyOrderNumber;

        public List<String> getFuzzyOrderNumber(){return this.fuzzyOrderNumber;}

        private List<String> rightFuzzyOrderNumber;

        public List<String> getRightFuzzyOrderNumber(){return this.rightFuzzyOrderNumber;}
        private List<String> serialNumberList;

        public List<String> getSerialNumberList(){return this.serialNumberList;}


        private List<String> fuzzySerialNumber;

        public List<String> getFuzzySerialNumber(){return this.fuzzySerialNumber;}

        private List<String> rightFuzzySerialNumber;

        public List<String> getRightFuzzySerialNumber(){return this.rightFuzzySerialNumber;}
        private List<java.time.LocalDateTime> orderDateList;

        public List<java.time.LocalDateTime> getOrderDateList(){return this.orderDateList;}

        private java.time.LocalDateTime orderDateSt;

        private java.time.LocalDateTime orderDateEd;

        public java.time.LocalDateTime getOrderDateSt(){return this.orderDateSt;}

        public java.time.LocalDateTime getOrderDateEd(){return this.orderDateEd;}

        private List<String> originOrderNumberList;

        public List<String> getOriginOrderNumberList(){return this.originOrderNumberList;}


        private List<String> fuzzyOriginOrderNumber;

        public List<String> getFuzzyOriginOrderNumber(){return this.fuzzyOriginOrderNumber;}

        private List<String> rightFuzzyOriginOrderNumber;

        public List<String> getRightFuzzyOriginOrderNumber(){return this.rightFuzzyOriginOrderNumber;}
        private List<Integer> stateList;

        public List<Integer> getStateList(){return this.stateList;}

        private Integer stateSt;

        private Integer stateEd;

        public Integer getStateSt(){return this.stateSt;}

        public Integer getStateEd(){return this.stateEd;}

        private List<Integer> orderTypeList;

        public List<Integer> getOrderTypeList(){return this.orderTypeList;}

        private Integer orderTypeSt;

        private Integer orderTypeEd;

        public Integer getOrderTypeSt(){return this.orderTypeSt;}

        public Integer getOrderTypeEd(){return this.orderTypeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> sourceList;

        public List<Integer> getSourceList(){return this.sourceList;}

        private Integer sourceSt;

        private Integer sourceEd;

        public Integer getSourceSt(){return this.sourceSt;}

        public Integer getSourceEd(){return this.sourceEd;}

        private List<Integer> isPayPasswordList;

        public List<Integer> getIsPayPasswordList(){return this.isPayPasswordList;}

        private Integer isPayPasswordSt;

        private Integer isPayPasswordEd;

        public Integer getIsPayPasswordSt(){return this.isPayPasswordSt;}

        public Integer getIsPayPasswordEd(){return this.isPayPasswordEd;}

        private List<String> orderDetailList;

        public List<String> getOrderDetailList(){return this.orderDetailList;}


        private List<String> fuzzyOrderDetail;

        public List<String> getFuzzyOrderDetail(){return this.fuzzyOrderDetail;}

        private List<String> rightFuzzyOrderDetail;

        public List<String> getRightFuzzyOrderDetail(){return this.rightFuzzyOrderDetail;}
        private List<Integer> isRebateList;

        public List<Integer> getIsRebateList(){return this.isRebateList;}

        private Integer isRebateSt;

        private Integer isRebateEd;

        public Integer getIsRebateSt(){return this.isRebateSt;}

        public Integer getIsRebateEd(){return this.isRebateEd;}

        private List<java.math.BigDecimal> BusinessRebateList;

        public List<java.math.BigDecimal> getBusinessRebateList(){return this.BusinessRebateList;}

        private java.math.BigDecimal BusinessRebateSt;

        private java.math.BigDecimal BusinessRebateEd;

        public java.math.BigDecimal getBusinessRebateSt(){return this.BusinessRebateSt;}

        public java.math.BigDecimal getBusinessRebateEd(){return this.BusinessRebateEd;}

        private List<java.math.BigDecimal> UserRebateList;

        public List<java.math.BigDecimal> getUserRebateList(){return this.UserRebateList;}

        private java.math.BigDecimal UserRebateSt;

        private java.math.BigDecimal UserRebateEd;

        public java.math.BigDecimal getUserRebateSt(){return this.UserRebateSt;}

        public java.math.BigDecimal getUserRebateEd(){return this.UserRebateEd;}

        private List<java.time.LocalDateTime> createDateTimeList;

        public List<java.time.LocalDateTime> getCreateDateTimeList(){return this.createDateTimeList;}

        private java.time.LocalDateTime createDateTimeSt;

        private java.time.LocalDateTime createDateTimeEd;

        public java.time.LocalDateTime getCreateDateTimeSt(){return this.createDateTimeSt;}

        public java.time.LocalDateTime getCreateDateTimeEd(){return this.createDateTimeEd;}

        private List<Integer> checkStateList;

        public List<Integer> getCheckStateList(){return this.checkStateList;}

        private Integer checkStateSt;

        private Integer checkStateEd;

        public Integer getCheckStateSt(){return this.checkStateSt;}

        public Integer getCheckStateEd(){return this.checkStateEd;}

        private List<String> cashNumberList;

        public List<String> getCashNumberList(){return this.cashNumberList;}


        private List<String> fuzzyCashNumber;

        public List<String> getFuzzyCashNumber(){return this.fuzzyCashNumber;}

        private List<String> rightFuzzyCashNumber;

        public List<String> getRightFuzzyCashNumber(){return this.rightFuzzyCashNumber;}
        private List<String> bigOrderNumberList;

        public List<String> getBigOrderNumberList(){return this.bigOrderNumberList;}


        private List<String> fuzzyBigOrderNumber;

        public List<String> getFuzzyBigOrderNumber(){return this.fuzzyBigOrderNumber;}

        private List<String> rightFuzzyBigOrderNumber;

        public List<String> getRightFuzzyBigOrderNumber(){return this.rightFuzzyBigOrderNumber;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder useridBetWeen(Integer useridSt,Integer useridEd){
            this.useridSt = useridSt;
            this.useridEd = useridEd;
            return this;
        }

        public ConditionBuilder useridGreaterEqThan(Integer useridSt){
            this.useridSt = useridSt;
            return this;
        }
        public ConditionBuilder useridLessEqThan(Integer useridEd){
            this.useridEd = useridEd;
            return this;
        }


        public ConditionBuilder useridList(Integer ... userid){
            this.useridList = solveNullList(userid);
            return this;
        }

        public ConditionBuilder useridList(List<Integer> userid){
            this.useridList = userid;
            return this;
        }

        public ConditionBuilder orderUserIdBetWeen(Integer orderUserIdSt,Integer orderUserIdEd){
            this.orderUserIdSt = orderUserIdSt;
            this.orderUserIdEd = orderUserIdEd;
            return this;
        }

        public ConditionBuilder orderUserIdGreaterEqThan(Integer orderUserIdSt){
            this.orderUserIdSt = orderUserIdSt;
            return this;
        }
        public ConditionBuilder orderUserIdLessEqThan(Integer orderUserIdEd){
            this.orderUserIdEd = orderUserIdEd;
            return this;
        }


        public ConditionBuilder orderUserIdList(Integer ... orderUserId){
            this.orderUserIdList = solveNullList(orderUserId);
            return this;
        }

        public ConditionBuilder orderUserIdList(List<Integer> orderUserId){
            this.orderUserIdList = orderUserId;
            return this;
        }

        public ConditionBuilder fuzzyBussinessId (List<String> fuzzyBussinessId){
            this.fuzzyBussinessId = fuzzyBussinessId;
            return this;
        }

        public ConditionBuilder fuzzyBussinessId (String ... fuzzyBussinessId){
            this.fuzzyBussinessId = solveNullList(fuzzyBussinessId);
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessId (List<String> rightFuzzyBussinessId){
            this.rightFuzzyBussinessId = rightFuzzyBussinessId;
            return this;
        }

        public ConditionBuilder rightFuzzyBussinessId (String ... rightFuzzyBussinessId){
            this.rightFuzzyBussinessId = solveNullList(rightFuzzyBussinessId);
            return this;
        }

        public ConditionBuilder bussinessIdList(String ... bussinessId){
            this.bussinessIdList = solveNullList(bussinessId);
            return this;
        }

        public ConditionBuilder bussinessIdList(List<String> bussinessId){
            this.bussinessIdList = bussinessId;
            return this;
        }

        public ConditionBuilder fuzzyStoresId (List<String> fuzzyStoresId){
            this.fuzzyStoresId = fuzzyStoresId;
            return this;
        }

        public ConditionBuilder fuzzyStoresId (String ... fuzzyStoresId){
            this.fuzzyStoresId = solveNullList(fuzzyStoresId);
            return this;
        }

        public ConditionBuilder rightFuzzyStoresId (List<String> rightFuzzyStoresId){
            this.rightFuzzyStoresId = rightFuzzyStoresId;
            return this;
        }

        public ConditionBuilder rightFuzzyStoresId (String ... rightFuzzyStoresId){
            this.rightFuzzyStoresId = solveNullList(rightFuzzyStoresId);
            return this;
        }

        public ConditionBuilder storesIdList(String ... storesId){
            this.storesIdList = solveNullList(storesId);
            return this;
        }

        public ConditionBuilder storesIdList(List<String> storesId){
            this.storesIdList = storesId;
            return this;
        }

        public ConditionBuilder fuzzyPayPassword (List<String> fuzzyPayPassword){
            this.fuzzyPayPassword = fuzzyPayPassword;
            return this;
        }

        public ConditionBuilder fuzzyPayPassword (String ... fuzzyPayPassword){
            this.fuzzyPayPassword = solveNullList(fuzzyPayPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPayPassword (List<String> rightFuzzyPayPassword){
            this.rightFuzzyPayPassword = rightFuzzyPayPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPayPassword (String ... rightFuzzyPayPassword){
            this.rightFuzzyPayPassword = solveNullList(rightFuzzyPayPassword);
            return this;
        }

        public ConditionBuilder payPasswordList(String ... payPassword){
            this.payPasswordList = solveNullList(payPassword);
            return this;
        }

        public ConditionBuilder payPasswordList(List<String> payPassword){
            this.payPasswordList = payPassword;
            return this;
        }

        public ConditionBuilder fuzzyVerificationCode (List<String> fuzzyVerificationCode){
            this.fuzzyVerificationCode = fuzzyVerificationCode;
            return this;
        }

        public ConditionBuilder fuzzyVerificationCode (String ... fuzzyVerificationCode){
            this.fuzzyVerificationCode = solveNullList(fuzzyVerificationCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVerificationCode (List<String> rightFuzzyVerificationCode){
            this.rightFuzzyVerificationCode = rightFuzzyVerificationCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVerificationCode (String ... rightFuzzyVerificationCode){
            this.rightFuzzyVerificationCode = solveNullList(rightFuzzyVerificationCode);
            return this;
        }

        public ConditionBuilder verificationCodeList(String ... verificationCode){
            this.verificationCodeList = solveNullList(verificationCode);
            return this;
        }

        public ConditionBuilder verificationCodeList(List<String> verificationCode){
            this.verificationCodeList = verificationCode;
            return this;
        }

        public ConditionBuilder amountBetWeen(java.math.BigDecimal amountSt,java.math.BigDecimal amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public ConditionBuilder amountGreaterEqThan(java.math.BigDecimal amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public ConditionBuilder amountLessEqThan(java.math.BigDecimal amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public ConditionBuilder amountList(java.math.BigDecimal ... amount){
            this.amountList = solveNullList(amount);
            return this;
        }

        public ConditionBuilder amountList(List<java.math.BigDecimal> amount){
            this.amountList = amount;
            return this;
        }

        public ConditionBuilder totalAmountBetWeen(java.math.BigDecimal totalAmountSt,java.math.BigDecimal totalAmountEd){
            this.totalAmountSt = totalAmountSt;
            this.totalAmountEd = totalAmountEd;
            return this;
        }

        public ConditionBuilder totalAmountGreaterEqThan(java.math.BigDecimal totalAmountSt){
            this.totalAmountSt = totalAmountSt;
            return this;
        }
        public ConditionBuilder totalAmountLessEqThan(java.math.BigDecimal totalAmountEd){
            this.totalAmountEd = totalAmountEd;
            return this;
        }


        public ConditionBuilder totalAmountList(java.math.BigDecimal ... totalAmount){
            this.totalAmountList = solveNullList(totalAmount);
            return this;
        }

        public ConditionBuilder totalAmountList(List<java.math.BigDecimal> totalAmount){
            this.totalAmountList = totalAmount;
            return this;
        }

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder totalPriceBetWeen(java.math.BigDecimal totalPriceSt,java.math.BigDecimal totalPriceEd){
            this.totalPriceSt = totalPriceSt;
            this.totalPriceEd = totalPriceEd;
            return this;
        }

        public ConditionBuilder totalPriceGreaterEqThan(java.math.BigDecimal totalPriceSt){
            this.totalPriceSt = totalPriceSt;
            return this;
        }
        public ConditionBuilder totalPriceLessEqThan(java.math.BigDecimal totalPriceEd){
            this.totalPriceEd = totalPriceEd;
            return this;
        }


        public ConditionBuilder totalPriceList(java.math.BigDecimal ... totalPrice){
            this.totalPriceList = solveNullList(totalPrice);
            return this;
        }

        public ConditionBuilder totalPriceList(List<java.math.BigDecimal> totalPrice){
            this.totalPriceList = totalPrice;
            return this;
        }

        public ConditionBuilder payTypeBetWeen(Integer payTypeSt,Integer payTypeEd){
            this.payTypeSt = payTypeSt;
            this.payTypeEd = payTypeEd;
            return this;
        }

        public ConditionBuilder payTypeGreaterEqThan(Integer payTypeSt){
            this.payTypeSt = payTypeSt;
            return this;
        }
        public ConditionBuilder payTypeLessEqThan(Integer payTypeEd){
            this.payTypeEd = payTypeEd;
            return this;
        }


        public ConditionBuilder payTypeList(Integer ... payType){
            this.payTypeList = solveNullList(payType);
            return this;
        }

        public ConditionBuilder payTypeList(List<Integer> payType){
            this.payTypeList = payType;
            return this;
        }

        public ConditionBuilder fuzzyOrderNumber (List<String> fuzzyOrderNumber){
            this.fuzzyOrderNumber = fuzzyOrderNumber;
            return this;
        }

        public ConditionBuilder fuzzyOrderNumber (String ... fuzzyOrderNumber){
            this.fuzzyOrderNumber = solveNullList(fuzzyOrderNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNumber (List<String> rightFuzzyOrderNumber){
            this.rightFuzzyOrderNumber = rightFuzzyOrderNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderNumber (String ... rightFuzzyOrderNumber){
            this.rightFuzzyOrderNumber = solveNullList(rightFuzzyOrderNumber);
            return this;
        }

        public ConditionBuilder orderNumberList(String ... orderNumber){
            this.orderNumberList = solveNullList(orderNumber);
            return this;
        }

        public ConditionBuilder orderNumberList(List<String> orderNumber){
            this.orderNumberList = orderNumber;
            return this;
        }

        public ConditionBuilder fuzzySerialNumber (List<String> fuzzySerialNumber){
            this.fuzzySerialNumber = fuzzySerialNumber;
            return this;
        }

        public ConditionBuilder fuzzySerialNumber (String ... fuzzySerialNumber){
            this.fuzzySerialNumber = solveNullList(fuzzySerialNumber);
            return this;
        }

        public ConditionBuilder rightFuzzySerialNumber (List<String> rightFuzzySerialNumber){
            this.rightFuzzySerialNumber = rightFuzzySerialNumber;
            return this;
        }

        public ConditionBuilder rightFuzzySerialNumber (String ... rightFuzzySerialNumber){
            this.rightFuzzySerialNumber = solveNullList(rightFuzzySerialNumber);
            return this;
        }

        public ConditionBuilder serialNumberList(String ... serialNumber){
            this.serialNumberList = solveNullList(serialNumber);
            return this;
        }

        public ConditionBuilder serialNumberList(List<String> serialNumber){
            this.serialNumberList = serialNumber;
            return this;
        }

        public ConditionBuilder orderDateBetWeen(java.time.LocalDateTime orderDateSt,java.time.LocalDateTime orderDateEd){
            this.orderDateSt = orderDateSt;
            this.orderDateEd = orderDateEd;
            return this;
        }

        public ConditionBuilder orderDateGreaterEqThan(java.time.LocalDateTime orderDateSt){
            this.orderDateSt = orderDateSt;
            return this;
        }
        public ConditionBuilder orderDateLessEqThan(java.time.LocalDateTime orderDateEd){
            this.orderDateEd = orderDateEd;
            return this;
        }


        public ConditionBuilder orderDateList(java.time.LocalDateTime ... orderDate){
            this.orderDateList = solveNullList(orderDate);
            return this;
        }

        public ConditionBuilder orderDateList(List<java.time.LocalDateTime> orderDate){
            this.orderDateList = orderDate;
            return this;
        }

        public ConditionBuilder fuzzyOriginOrderNumber (List<String> fuzzyOriginOrderNumber){
            this.fuzzyOriginOrderNumber = fuzzyOriginOrderNumber;
            return this;
        }

        public ConditionBuilder fuzzyOriginOrderNumber (String ... fuzzyOriginOrderNumber){
            this.fuzzyOriginOrderNumber = solveNullList(fuzzyOriginOrderNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyOriginOrderNumber (List<String> rightFuzzyOriginOrderNumber){
            this.rightFuzzyOriginOrderNumber = rightFuzzyOriginOrderNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyOriginOrderNumber (String ... rightFuzzyOriginOrderNumber){
            this.rightFuzzyOriginOrderNumber = solveNullList(rightFuzzyOriginOrderNumber);
            return this;
        }

        public ConditionBuilder originOrderNumberList(String ... originOrderNumber){
            this.originOrderNumberList = solveNullList(originOrderNumber);
            return this;
        }

        public ConditionBuilder originOrderNumberList(List<String> originOrderNumber){
            this.originOrderNumberList = originOrderNumber;
            return this;
        }

        public ConditionBuilder stateBetWeen(Integer stateSt,Integer stateEd){
            this.stateSt = stateSt;
            this.stateEd = stateEd;
            return this;
        }

        public ConditionBuilder stateGreaterEqThan(Integer stateSt){
            this.stateSt = stateSt;
            return this;
        }
        public ConditionBuilder stateLessEqThan(Integer stateEd){
            this.stateEd = stateEd;
            return this;
        }


        public ConditionBuilder stateList(Integer ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public ConditionBuilder stateList(List<Integer> state){
            this.stateList = state;
            return this;
        }

        public ConditionBuilder orderTypeBetWeen(Integer orderTypeSt,Integer orderTypeEd){
            this.orderTypeSt = orderTypeSt;
            this.orderTypeEd = orderTypeEd;
            return this;
        }

        public ConditionBuilder orderTypeGreaterEqThan(Integer orderTypeSt){
            this.orderTypeSt = orderTypeSt;
            return this;
        }
        public ConditionBuilder orderTypeLessEqThan(Integer orderTypeEd){
            this.orderTypeEd = orderTypeEd;
            return this;
        }


        public ConditionBuilder orderTypeList(Integer ... orderType){
            this.orderTypeList = solveNullList(orderType);
            return this;
        }

        public ConditionBuilder orderTypeList(List<Integer> orderType){
            this.orderTypeList = orderType;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder sourceBetWeen(Integer sourceSt,Integer sourceEd){
            this.sourceSt = sourceSt;
            this.sourceEd = sourceEd;
            return this;
        }

        public ConditionBuilder sourceGreaterEqThan(Integer sourceSt){
            this.sourceSt = sourceSt;
            return this;
        }
        public ConditionBuilder sourceLessEqThan(Integer sourceEd){
            this.sourceEd = sourceEd;
            return this;
        }


        public ConditionBuilder sourceList(Integer ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public ConditionBuilder sourceList(List<Integer> source){
            this.sourceList = source;
            return this;
        }

        public ConditionBuilder isPayPasswordBetWeen(Integer isPayPasswordSt,Integer isPayPasswordEd){
            this.isPayPasswordSt = isPayPasswordSt;
            this.isPayPasswordEd = isPayPasswordEd;
            return this;
        }

        public ConditionBuilder isPayPasswordGreaterEqThan(Integer isPayPasswordSt){
            this.isPayPasswordSt = isPayPasswordSt;
            return this;
        }
        public ConditionBuilder isPayPasswordLessEqThan(Integer isPayPasswordEd){
            this.isPayPasswordEd = isPayPasswordEd;
            return this;
        }


        public ConditionBuilder isPayPasswordList(Integer ... isPayPassword){
            this.isPayPasswordList = solveNullList(isPayPassword);
            return this;
        }

        public ConditionBuilder isPayPasswordList(List<Integer> isPayPassword){
            this.isPayPasswordList = isPayPassword;
            return this;
        }

        public ConditionBuilder fuzzyOrderDetail (List<String> fuzzyOrderDetail){
            this.fuzzyOrderDetail = fuzzyOrderDetail;
            return this;
        }

        public ConditionBuilder fuzzyOrderDetail (String ... fuzzyOrderDetail){
            this.fuzzyOrderDetail = solveNullList(fuzzyOrderDetail);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderDetail (List<String> rightFuzzyOrderDetail){
            this.rightFuzzyOrderDetail = rightFuzzyOrderDetail;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderDetail (String ... rightFuzzyOrderDetail){
            this.rightFuzzyOrderDetail = solveNullList(rightFuzzyOrderDetail);
            return this;
        }

        public ConditionBuilder orderDetailList(String ... orderDetail){
            this.orderDetailList = solveNullList(orderDetail);
            return this;
        }

        public ConditionBuilder orderDetailList(List<String> orderDetail){
            this.orderDetailList = orderDetail;
            return this;
        }

        public ConditionBuilder isRebateBetWeen(Integer isRebateSt,Integer isRebateEd){
            this.isRebateSt = isRebateSt;
            this.isRebateEd = isRebateEd;
            return this;
        }

        public ConditionBuilder isRebateGreaterEqThan(Integer isRebateSt){
            this.isRebateSt = isRebateSt;
            return this;
        }
        public ConditionBuilder isRebateLessEqThan(Integer isRebateEd){
            this.isRebateEd = isRebateEd;
            return this;
        }


        public ConditionBuilder isRebateList(Integer ... isRebate){
            this.isRebateList = solveNullList(isRebate);
            return this;
        }

        public ConditionBuilder isRebateList(List<Integer> isRebate){
            this.isRebateList = isRebate;
            return this;
        }

        public ConditionBuilder BusinessRebateBetWeen(java.math.BigDecimal BusinessRebateSt,java.math.BigDecimal BusinessRebateEd){
            this.BusinessRebateSt = BusinessRebateSt;
            this.BusinessRebateEd = BusinessRebateEd;
            return this;
        }

        public ConditionBuilder BusinessRebateGreaterEqThan(java.math.BigDecimal BusinessRebateSt){
            this.BusinessRebateSt = BusinessRebateSt;
            return this;
        }
        public ConditionBuilder BusinessRebateLessEqThan(java.math.BigDecimal BusinessRebateEd){
            this.BusinessRebateEd = BusinessRebateEd;
            return this;
        }


        public ConditionBuilder BusinessRebateList(java.math.BigDecimal ... BusinessRebate){
            this.BusinessRebateList = solveNullList(BusinessRebate);
            return this;
        }

        public ConditionBuilder BusinessRebateList(List<java.math.BigDecimal> BusinessRebate){
            this.BusinessRebateList = BusinessRebate;
            return this;
        }

        public ConditionBuilder UserRebateBetWeen(java.math.BigDecimal UserRebateSt,java.math.BigDecimal UserRebateEd){
            this.UserRebateSt = UserRebateSt;
            this.UserRebateEd = UserRebateEd;
            return this;
        }

        public ConditionBuilder UserRebateGreaterEqThan(java.math.BigDecimal UserRebateSt){
            this.UserRebateSt = UserRebateSt;
            return this;
        }
        public ConditionBuilder UserRebateLessEqThan(java.math.BigDecimal UserRebateEd){
            this.UserRebateEd = UserRebateEd;
            return this;
        }


        public ConditionBuilder UserRebateList(java.math.BigDecimal ... UserRebate){
            this.UserRebateList = solveNullList(UserRebate);
            return this;
        }

        public ConditionBuilder UserRebateList(List<java.math.BigDecimal> UserRebate){
            this.UserRebateList = UserRebate;
            return this;
        }

        public ConditionBuilder createDateTimeBetWeen(java.time.LocalDateTime createDateTimeSt,java.time.LocalDateTime createDateTimeEd){
            this.createDateTimeSt = createDateTimeSt;
            this.createDateTimeEd = createDateTimeEd;
            return this;
        }

        public ConditionBuilder createDateTimeGreaterEqThan(java.time.LocalDateTime createDateTimeSt){
            this.createDateTimeSt = createDateTimeSt;
            return this;
        }
        public ConditionBuilder createDateTimeLessEqThan(java.time.LocalDateTime createDateTimeEd){
            this.createDateTimeEd = createDateTimeEd;
            return this;
        }


        public ConditionBuilder createDateTimeList(java.time.LocalDateTime ... createDateTime){
            this.createDateTimeList = solveNullList(createDateTime);
            return this;
        }

        public ConditionBuilder createDateTimeList(List<java.time.LocalDateTime> createDateTime){
            this.createDateTimeList = createDateTime;
            return this;
        }

        public ConditionBuilder checkStateBetWeen(Integer checkStateSt,Integer checkStateEd){
            this.checkStateSt = checkStateSt;
            this.checkStateEd = checkStateEd;
            return this;
        }

        public ConditionBuilder checkStateGreaterEqThan(Integer checkStateSt){
            this.checkStateSt = checkStateSt;
            return this;
        }
        public ConditionBuilder checkStateLessEqThan(Integer checkStateEd){
            this.checkStateEd = checkStateEd;
            return this;
        }


        public ConditionBuilder checkStateList(Integer ... checkState){
            this.checkStateList = solveNullList(checkState);
            return this;
        }

        public ConditionBuilder checkStateList(List<Integer> checkState){
            this.checkStateList = checkState;
            return this;
        }

        public ConditionBuilder fuzzyCashNumber (List<String> fuzzyCashNumber){
            this.fuzzyCashNumber = fuzzyCashNumber;
            return this;
        }

        public ConditionBuilder fuzzyCashNumber (String ... fuzzyCashNumber){
            this.fuzzyCashNumber = solveNullList(fuzzyCashNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyCashNumber (List<String> rightFuzzyCashNumber){
            this.rightFuzzyCashNumber = rightFuzzyCashNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyCashNumber (String ... rightFuzzyCashNumber){
            this.rightFuzzyCashNumber = solveNullList(rightFuzzyCashNumber);
            return this;
        }

        public ConditionBuilder cashNumberList(String ... cashNumber){
            this.cashNumberList = solveNullList(cashNumber);
            return this;
        }

        public ConditionBuilder cashNumberList(List<String> cashNumber){
            this.cashNumberList = cashNumber;
            return this;
        }

        public ConditionBuilder fuzzyBigOrderNumber (List<String> fuzzyBigOrderNumber){
            this.fuzzyBigOrderNumber = fuzzyBigOrderNumber;
            return this;
        }

        public ConditionBuilder fuzzyBigOrderNumber (String ... fuzzyBigOrderNumber){
            this.fuzzyBigOrderNumber = solveNullList(fuzzyBigOrderNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyBigOrderNumber (List<String> rightFuzzyBigOrderNumber){
            this.rightFuzzyBigOrderNumber = rightFuzzyBigOrderNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyBigOrderNumber (String ... rightFuzzyBigOrderNumber){
            this.rightFuzzyBigOrderNumber = solveNullList(rightFuzzyBigOrderNumber);
            return this;
        }

        public ConditionBuilder bigOrderNumberList(String ... bigOrderNumber){
            this.bigOrderNumberList = solveNullList(bigOrderNumber);
            return this;
        }

        public ConditionBuilder bigOrderNumberList(List<String> bigOrderNumber){
            this.bigOrderNumberList = bigOrderNumber;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Order obj;

        public Builder(){
            this.obj = new Order();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder userid(Integer userid){
            this.obj.setUserid(userid);
            return this;
        }
        public Builder orderUserId(Integer orderUserId){
            this.obj.setOrderUserId(orderUserId);
            return this;
        }
        public Builder bussinessId(String bussinessId){
            this.obj.setBussinessId(bussinessId);
            return this;
        }
        public Builder storesId(String storesId){
            this.obj.setStoresId(storesId);
            return this;
        }
        public Builder payPassword(String payPassword){
            this.obj.setPayPassword(payPassword);
            return this;
        }
        public Builder verificationCode(String verificationCode){
            this.obj.setVerificationCode(verificationCode);
            return this;
        }
        public Builder amount(java.math.BigDecimal amount){
            this.obj.setAmount(amount);
            return this;
        }
        public Builder totalAmount(java.math.BigDecimal totalAmount){
            this.obj.setTotalAmount(totalAmount);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder totalPrice(java.math.BigDecimal totalPrice){
            this.obj.setTotalPrice(totalPrice);
            return this;
        }
        public Builder payType(Integer payType){
            this.obj.setPayType(payType);
            return this;
        }
        public Builder orderNumber(String orderNumber){
            this.obj.setOrderNumber(orderNumber);
            return this;
        }
        public Builder serialNumber(String serialNumber){
            this.obj.setSerialNumber(serialNumber);
            return this;
        }
        public Builder orderDate(java.time.LocalDateTime orderDate){
            this.obj.setOrderDate(orderDate);
            return this;
        }
        public Builder originOrderNumber(String originOrderNumber){
            this.obj.setOriginOrderNumber(originOrderNumber);
            return this;
        }
        public Builder state(Integer state){
            this.obj.setState(state);
            return this;
        }
        public Builder orderType(Integer orderType){
            this.obj.setOrderType(orderType);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder source(Integer source){
            this.obj.setSource(source);
            return this;
        }
        public Builder isPayPassword(Integer isPayPassword){
            this.obj.setIsPayPassword(isPayPassword);
            return this;
        }
        public Builder orderDetail(String orderDetail){
            this.obj.setOrderDetail(orderDetail);
            return this;
        }
        public Builder isRebate(Integer isRebate){
            this.obj.setIsRebate(isRebate);
            return this;
        }
        public Builder BusinessRebate(java.math.BigDecimal BusinessRebate){
            this.obj.setBusinessRebate(BusinessRebate);
            return this;
        }
        public Builder UserRebate(java.math.BigDecimal UserRebate){
            this.obj.setUserRebate(UserRebate);
            return this;
        }
        public Builder createDateTime(java.time.LocalDateTime createDateTime){
            this.obj.setCreateDateTime(createDateTime);
            return this;
        }
        public Builder checkState(Integer checkState){
            this.obj.setCheckState(checkState);
            return this;
        }
        public Builder cashNumber(String cashNumber){
            this.obj.setCashNumber(cashNumber);
            return this;
        }
        public Builder bigOrderNumber(String bigOrderNumber){
            this.obj.setBigOrderNumber(bigOrderNumber);
            return this;
        }
        public Order build(){return obj;}
    }

}
