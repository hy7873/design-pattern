package com.hy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author 
*/
public class AdUser implements Serializable {

    private static final long serialVersionUID = 1569854407299L;


    /**
    * 主键
    * 编号
    * isNullAble:0
    */
    private Long id;

    /**
    * 所属企业
    * isNullAble:0,defaultVal:2
    */
    private Long groupNum;

    /**
    * 账号使用范围 1：测试账号 2：生产账号
    * isNullAble:1,defaultVal:2
    */
    private Integer cardRange;

    /**
    * 姓名
    * isNullAble:1
    */
    private String name;

    /**
    * 性别
    * isNullAble:1,defaultVal:0
    */
    private String sex;

    /**
    * 手机号
    * isNullAble:1
    */
    private String telephone;

    /**
    * 邮箱
    * isNullAble:1
    */
    private String mailbox;

    /**
    * 身份证号
    * isNullAble:1
    */
    private String identityCard;

    /**
    * 会员卡号
    * isNullAble:0
    */
    private String cardNumber;

    /**
    * 登录密码
    * isNullAble:0
    */
    private String password;

    /**
    * 支付密码
    * isNullAble:1
    */
    private String payPassword;

    /**
    * 可用积分账户
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal integral;

    /**
    * 初始积分
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal startIntegral;

    /**
    * 预积分账户
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal expectIntegral;

    /**
    * 支付额度
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal lineCredit;

    /**
    * 激活时间
    * isNullAble:1
    */
    private java.time.LocalDateTime activeDate;

    /**
    * 账户状态  1 未激活 2 激活 3冻结 4注销
    * isNullAble:0,defaultVal:1
    */
    private String isActive;

    /**
    * 保存加入黑名单前账户状态
    * isNullAble:1
    */
    private String lastIsActive;

    /**
    * 支付密码开关,1:短信验证码 2：支付密码
    * isNullAble:0,defaultVal:1
    */
    private String isPayPassword;

    /**
    * 会员类型  0:员工 1:家属 (2019-04-11废弃 2:退休 3:离职  4:社会会员  5:不接受推送)
    * isNullAble:0,defaultVal:0
    */
    private Integer type;

    /**
    * 是否向第三方同步数据 0：不同步    1：同步
    * isNullAble:1,defaultVal:0
    */
    private String dataSyn;

    /**
    * 创建者
    * isNullAble:0,defaultVal:1
    */
    private String createBy;

    /**
    * 删除标记
    * isNullAble:0,defaultVal:0
    */
    private String delFlag;

    /**
    * 0：普通会员     1：机票代理会员
    * isNullAble:1,defaultVal:0
    */
    private Integer state;

    /**
    * 车牌号
    * isNullAble:1
    */
    private String licenseNumber;

    /**
    * 备注信息
    * isNullAble:1
    */
    private String remarks;

    /**
    * 推荐来源    0：独立会员，无推荐  
    * isNullAble:1,defaultVal:0
    */
    private String sourceCardNumber;

    /**
    * 更新时间
    * isNullAble:0
    */
    private java.time.LocalDateTime updateDate;

    /**
    * 更新者
    * isNullAble:0,defaultVal:1
    */
    private String updateBy;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createDate;

    /**
    * 财富值
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal wealth;

    /**
    * 工作状态 1：在职 2：退休 3：离职 4：家属无
    * isNullAble:1,defaultVal:1
    */
    private Integer jobStatus;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setGroupNum(Long groupNum){this.groupNum = groupNum;}

    public Long getGroupNum(){return this.groupNum;}

    public void setCardRange(Integer cardRange){this.cardRange = cardRange;}

    public Integer getCardRange(){return this.cardRange;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setSex(String sex){this.sex = sex;}

    public String getSex(){return this.sex;}

    public void setTelephone(String telephone){this.telephone = telephone;}

    public String getTelephone(){return this.telephone;}

    public void setMailbox(String mailbox){this.mailbox = mailbox;}

    public String getMailbox(){return this.mailbox;}

    public void setIdentityCard(String identityCard){this.identityCard = identityCard;}

    public String getIdentityCard(){return this.identityCard;}

    public void setCardNumber(String cardNumber){this.cardNumber = cardNumber;}

    public String getCardNumber(){return this.cardNumber;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setPayPassword(String payPassword){this.payPassword = payPassword;}

    public String getPayPassword(){return this.payPassword;}

    public void setIntegral(java.math.BigDecimal integral){this.integral = integral;}

    public java.math.BigDecimal getIntegral(){return this.integral;}

    public void setStartIntegral(java.math.BigDecimal startIntegral){this.startIntegral = startIntegral;}

    public java.math.BigDecimal getStartIntegral(){return this.startIntegral;}

    public void setExpectIntegral(java.math.BigDecimal expectIntegral){this.expectIntegral = expectIntegral;}

    public java.math.BigDecimal getExpectIntegral(){return this.expectIntegral;}

    public void setLineCredit(java.math.BigDecimal lineCredit){this.lineCredit = lineCredit;}

    public java.math.BigDecimal getLineCredit(){return this.lineCredit;}

    public void setActiveDate(java.time.LocalDateTime activeDate){this.activeDate = activeDate;}

    public java.time.LocalDateTime getActiveDate(){return this.activeDate;}

    public void setIsActive(String isActive){this.isActive = isActive;}

    public String getIsActive(){return this.isActive;}

    public void setLastIsActive(String lastIsActive){this.lastIsActive = lastIsActive;}

    public String getLastIsActive(){return this.lastIsActive;}

    public void setIsPayPassword(String isPayPassword){this.isPayPassword = isPayPassword;}

    public String getIsPayPassword(){return this.isPayPassword;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setDataSyn(String dataSyn){this.dataSyn = dataSyn;}

    public String getDataSyn(){return this.dataSyn;}

    public void setCreateBy(String createBy){this.createBy = createBy;}

    public String getCreateBy(){return this.createBy;}

    public void setDelFlag(String delFlag){this.delFlag = delFlag;}

    public String getDelFlag(){return this.delFlag;}

    public void setState(Integer state){this.state = state;}

    public Integer getState(){return this.state;}

    public void setLicenseNumber(String licenseNumber){this.licenseNumber = licenseNumber;}

    public String getLicenseNumber(){return this.licenseNumber;}

    public void setRemarks(String remarks){this.remarks = remarks;}

    public String getRemarks(){return this.remarks;}

    public void setSourceCardNumber(String sourceCardNumber){this.sourceCardNumber = sourceCardNumber;}

    public String getSourceCardNumber(){return this.sourceCardNumber;}

    public void setUpdateDate(java.time.LocalDateTime updateDate){this.updateDate = updateDate;}

    public java.time.LocalDateTime getUpdateDate(){return this.updateDate;}

    public void setUpdateBy(String updateBy){this.updateBy = updateBy;}

    public String getUpdateBy(){return this.updateBy;}

    public void setCreateDate(java.time.LocalDateTime createDate){this.createDate = createDate;}

    public java.time.LocalDateTime getCreateDate(){return this.createDate;}

    public void setWealth(java.math.BigDecimal wealth){this.wealth = wealth;}

    public java.math.BigDecimal getWealth(){return this.wealth;}

    public void setJobStatus(Integer jobStatus){this.jobStatus = jobStatus;}

    public Integer getJobStatus(){return this.jobStatus;}
    @Override
    public String toString() {
        return "AdUser{" +
                "id='" + id + '\'' +
                "groupNum='" + groupNum + '\'' +
                "cardRange='" + cardRange + '\'' +
                "name='" + name + '\'' +
                "sex='" + sex + '\'' +
                "telephone='" + telephone + '\'' +
                "mailbox='" + mailbox + '\'' +
                "identityCard='" + identityCard + '\'' +
                "cardNumber='" + cardNumber + '\'' +
                "password='" + password + '\'' +
                "payPassword='" + payPassword + '\'' +
                "integral='" + integral + '\'' +
                "startIntegral='" + startIntegral + '\'' +
                "expectIntegral='" + expectIntegral + '\'' +
                "lineCredit='" + lineCredit + '\'' +
                "activeDate='" + activeDate + '\'' +
                "isActive='" + isActive + '\'' +
                "lastIsActive='" + lastIsActive + '\'' +
                "isPayPassword='" + isPayPassword + '\'' +
                "type='" + type + '\'' +
                "dataSyn='" + dataSyn + '\'' +
                "createBy='" + createBy + '\'' +
                "delFlag='" + delFlag + '\'' +
                "state='" + state + '\'' +
                "licenseNumber='" + licenseNumber + '\'' +
                "remarks='" + remarks + '\'' +
                "sourceCardNumber='" + sourceCardNumber + '\'' +
                "updateDate='" + updateDate + '\'' +
                "updateBy='" + updateBy + '\'' +
                "createDate='" + createDate + '\'' +
                "wealth='" + wealth + '\'' +
                "jobStatus='" + jobStatus + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private AdUser set;

        private ConditionBuilder where;

        public UpdateBuilder set(AdUser set){
            this.set = set;
            return this;
        }

        public AdUser getSet(){
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

    public static class QueryBuilder extends AdUser{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> groupNumList;

        public List<Long> getGroupNumList(){return this.groupNumList;}

        private Long groupNumSt;

        private Long groupNumEd;

        public Long getGroupNumSt(){return this.groupNumSt;}

        public Long getGroupNumEd(){return this.groupNumEd;}

        private List<Integer> cardRangeList;

        public List<Integer> getCardRangeList(){return this.cardRangeList;}

        private Integer cardRangeSt;

        private Integer cardRangeEd;

        public Integer getCardRangeSt(){return this.cardRangeSt;}

        public Integer getCardRangeEd(){return this.cardRangeEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> sexList;

        public List<String> getSexList(){return this.sexList;}


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){return this.fuzzySex;}

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){return this.rightFuzzySex;}
        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<String> mailboxList;

        public List<String> getMailboxList(){return this.mailboxList;}


        private List<String> fuzzyMailbox;

        public List<String> getFuzzyMailbox(){return this.fuzzyMailbox;}

        private List<String> rightFuzzyMailbox;

        public List<String> getRightFuzzyMailbox(){return this.rightFuzzyMailbox;}
        private List<String> identityCardList;

        public List<String> getIdentityCardList(){return this.identityCardList;}


        private List<String> fuzzyIdentityCard;

        public List<String> getFuzzyIdentityCard(){return this.fuzzyIdentityCard;}

        private List<String> rightFuzzyIdentityCard;

        public List<String> getRightFuzzyIdentityCard(){return this.rightFuzzyIdentityCard;}
        private List<String> cardNumberList;

        public List<String> getCardNumberList(){return this.cardNumberList;}


        private List<String> fuzzyCardNumber;

        public List<String> getFuzzyCardNumber(){return this.fuzzyCardNumber;}

        private List<String> rightFuzzyCardNumber;

        public List<String> getRightFuzzyCardNumber(){return this.rightFuzzyCardNumber;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> payPasswordList;

        public List<String> getPayPasswordList(){return this.payPasswordList;}


        private List<String> fuzzyPayPassword;

        public List<String> getFuzzyPayPassword(){return this.fuzzyPayPassword;}

        private List<String> rightFuzzyPayPassword;

        public List<String> getRightFuzzyPayPassword(){return this.rightFuzzyPayPassword;}
        private List<java.math.BigDecimal> integralList;

        public List<java.math.BigDecimal> getIntegralList(){return this.integralList;}

        private java.math.BigDecimal integralSt;

        private java.math.BigDecimal integralEd;

        public java.math.BigDecimal getIntegralSt(){return this.integralSt;}

        public java.math.BigDecimal getIntegralEd(){return this.integralEd;}

        private List<java.math.BigDecimal> startIntegralList;

        public List<java.math.BigDecimal> getStartIntegralList(){return this.startIntegralList;}

        private java.math.BigDecimal startIntegralSt;

        private java.math.BigDecimal startIntegralEd;

        public java.math.BigDecimal getStartIntegralSt(){return this.startIntegralSt;}

        public java.math.BigDecimal getStartIntegralEd(){return this.startIntegralEd;}

        private List<java.math.BigDecimal> expectIntegralList;

        public List<java.math.BigDecimal> getExpectIntegralList(){return this.expectIntegralList;}

        private java.math.BigDecimal expectIntegralSt;

        private java.math.BigDecimal expectIntegralEd;

        public java.math.BigDecimal getExpectIntegralSt(){return this.expectIntegralSt;}

        public java.math.BigDecimal getExpectIntegralEd(){return this.expectIntegralEd;}

        private List<java.math.BigDecimal> lineCreditList;

        public List<java.math.BigDecimal> getLineCreditList(){return this.lineCreditList;}

        private java.math.BigDecimal lineCreditSt;

        private java.math.BigDecimal lineCreditEd;

        public java.math.BigDecimal getLineCreditSt(){return this.lineCreditSt;}

        public java.math.BigDecimal getLineCreditEd(){return this.lineCreditEd;}

        private List<java.time.LocalDateTime> activeDateList;

        public List<java.time.LocalDateTime> getActiveDateList(){return this.activeDateList;}

        private java.time.LocalDateTime activeDateSt;

        private java.time.LocalDateTime activeDateEd;

        public java.time.LocalDateTime getActiveDateSt(){return this.activeDateSt;}

        public java.time.LocalDateTime getActiveDateEd(){return this.activeDateEd;}

        private List<String> isActiveList;

        public List<String> getIsActiveList(){return this.isActiveList;}


        private List<String> fuzzyIsActive;

        public List<String> getFuzzyIsActive(){return this.fuzzyIsActive;}

        private List<String> rightFuzzyIsActive;

        public List<String> getRightFuzzyIsActive(){return this.rightFuzzyIsActive;}
        private List<String> lastIsActiveList;

        public List<String> getLastIsActiveList(){return this.lastIsActiveList;}


        private List<String> fuzzyLastIsActive;

        public List<String> getFuzzyLastIsActive(){return this.fuzzyLastIsActive;}

        private List<String> rightFuzzyLastIsActive;

        public List<String> getRightFuzzyLastIsActive(){return this.rightFuzzyLastIsActive;}
        private List<String> isPayPasswordList;

        public List<String> getIsPayPasswordList(){return this.isPayPasswordList;}


        private List<String> fuzzyIsPayPassword;

        public List<String> getFuzzyIsPayPassword(){return this.fuzzyIsPayPassword;}

        private List<String> rightFuzzyIsPayPassword;

        public List<String> getRightFuzzyIsPayPassword(){return this.rightFuzzyIsPayPassword;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> dataSynList;

        public List<String> getDataSynList(){return this.dataSynList;}


        private List<String> fuzzyDataSyn;

        public List<String> getFuzzyDataSyn(){return this.fuzzyDataSyn;}

        private List<String> rightFuzzyDataSyn;

        public List<String> getRightFuzzyDataSyn(){return this.rightFuzzyDataSyn;}
        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<String> delFlagList;

        public List<String> getDelFlagList(){return this.delFlagList;}


        private List<String> fuzzyDelFlag;

        public List<String> getFuzzyDelFlag(){return this.fuzzyDelFlag;}

        private List<String> rightFuzzyDelFlag;

        public List<String> getRightFuzzyDelFlag(){return this.rightFuzzyDelFlag;}
        private List<Integer> stateList;

        public List<Integer> getStateList(){return this.stateList;}

        private Integer stateSt;

        private Integer stateEd;

        public Integer getStateSt(){return this.stateSt;}

        public Integer getStateEd(){return this.stateEd;}

        private List<String> licenseNumberList;

        public List<String> getLicenseNumberList(){return this.licenseNumberList;}


        private List<String> fuzzyLicenseNumber;

        public List<String> getFuzzyLicenseNumber(){return this.fuzzyLicenseNumber;}

        private List<String> rightFuzzyLicenseNumber;

        public List<String> getRightFuzzyLicenseNumber(){return this.rightFuzzyLicenseNumber;}
        private List<String> remarksList;

        public List<String> getRemarksList(){return this.remarksList;}


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){return this.fuzzyRemarks;}

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){return this.rightFuzzyRemarks;}
        private List<String> sourceCardNumberList;

        public List<String> getSourceCardNumberList(){return this.sourceCardNumberList;}


        private List<String> fuzzySourceCardNumber;

        public List<String> getFuzzySourceCardNumber(){return this.fuzzySourceCardNumber;}

        private List<String> rightFuzzySourceCardNumber;

        public List<String> getRightFuzzySourceCardNumber(){return this.rightFuzzySourceCardNumber;}
        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.math.BigDecimal> wealthList;

        public List<java.math.BigDecimal> getWealthList(){return this.wealthList;}

        private java.math.BigDecimal wealthSt;

        private java.math.BigDecimal wealthEd;

        public java.math.BigDecimal getWealthSt(){return this.wealthSt;}

        public java.math.BigDecimal getWealthEd(){return this.wealthEd;}

        private List<Integer> jobStatusList;

        public List<Integer> getJobStatusList(){return this.jobStatusList;}

        private Integer jobStatusSt;

        private Integer jobStatusEd;

        public Integer getJobStatusSt(){return this.jobStatusSt;}

        public Integer getJobStatusEd(){return this.jobStatusEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
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

        public QueryBuilder groupNumBetWeen(Long groupNumSt,Long groupNumEd){
            this.groupNumSt = groupNumSt;
            this.groupNumEd = groupNumEd;
            return this;
        }

        public QueryBuilder groupNumGreaterEqThan(Long groupNumSt){
            this.groupNumSt = groupNumSt;
            return this;
        }
        public QueryBuilder groupNumLessEqThan(Long groupNumEd){
            this.groupNumEd = groupNumEd;
            return this;
        }


        public QueryBuilder groupNum(Long groupNum){
            setGroupNum(groupNum);
            return this;
        }

        public QueryBuilder groupNumList(Long ... groupNum){
            this.groupNumList = solveNullList(groupNum);
            return this;
        }

        public QueryBuilder groupNumList(List<Long> groupNum){
            this.groupNumList = groupNum;
            return this;
        }

        public QueryBuilder fetchGroupNum(){
            setFetchFields("fetchFields","groupNum");
            return this;
        }

        public QueryBuilder excludeGroupNum(){
            setFetchFields("excludeFields","groupNum");
            return this;
        }

        public QueryBuilder cardRangeBetWeen(Integer cardRangeSt,Integer cardRangeEd){
            this.cardRangeSt = cardRangeSt;
            this.cardRangeEd = cardRangeEd;
            return this;
        }

        public QueryBuilder cardRangeGreaterEqThan(Integer cardRangeSt){
            this.cardRangeSt = cardRangeSt;
            return this;
        }
        public QueryBuilder cardRangeLessEqThan(Integer cardRangeEd){
            this.cardRangeEd = cardRangeEd;
            return this;
        }


        public QueryBuilder cardRange(Integer cardRange){
            setCardRange(cardRange);
            return this;
        }

        public QueryBuilder cardRangeList(Integer ... cardRange){
            this.cardRangeList = solveNullList(cardRange);
            return this;
        }

        public QueryBuilder cardRangeList(List<Integer> cardRange){
            this.cardRangeList = cardRange;
            return this;
        }

        public QueryBuilder fetchCardRange(){
            setFetchFields("fetchFields","cardRange");
            return this;
        }

        public QueryBuilder excludeCardRange(){
            setFetchFields("excludeFields","cardRange");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public QueryBuilder fuzzySex (String ... fuzzySex){
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public QueryBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public QueryBuilder rightFuzzySex (String ... rightFuzzySex){
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public QueryBuilder sex(String sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(String ... sex){
            this.sexList = solveNullList(sex);
            return this;
        }

        public QueryBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex(){
            setFetchFields("fetchFields","sex");
            return this;
        }

        public QueryBuilder excludeSex(){
            setFetchFields("excludeFields","sex");
            return this;
        }

        public QueryBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public QueryBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public QueryBuilder telephone(String telephone){
            setTelephone(telephone);
            return this;
        }

        public QueryBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public QueryBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public QueryBuilder fetchTelephone(){
            setFetchFields("fetchFields","telephone");
            return this;
        }

        public QueryBuilder excludeTelephone(){
            setFetchFields("excludeFields","telephone");
            return this;
        }

        public QueryBuilder fuzzyMailbox (List<String> fuzzyMailbox){
            this.fuzzyMailbox = fuzzyMailbox;
            return this;
        }

        public QueryBuilder fuzzyMailbox (String ... fuzzyMailbox){
            this.fuzzyMailbox = solveNullList(fuzzyMailbox);
            return this;
        }

        public QueryBuilder rightFuzzyMailbox (List<String> rightFuzzyMailbox){
            this.rightFuzzyMailbox = rightFuzzyMailbox;
            return this;
        }

        public QueryBuilder rightFuzzyMailbox (String ... rightFuzzyMailbox){
            this.rightFuzzyMailbox = solveNullList(rightFuzzyMailbox);
            return this;
        }

        public QueryBuilder mailbox(String mailbox){
            setMailbox(mailbox);
            return this;
        }

        public QueryBuilder mailboxList(String ... mailbox){
            this.mailboxList = solveNullList(mailbox);
            return this;
        }

        public QueryBuilder mailboxList(List<String> mailbox){
            this.mailboxList = mailbox;
            return this;
        }

        public QueryBuilder fetchMailbox(){
            setFetchFields("fetchFields","mailbox");
            return this;
        }

        public QueryBuilder excludeMailbox(){
            setFetchFields("excludeFields","mailbox");
            return this;
        }

        public QueryBuilder fuzzyIdentityCard (List<String> fuzzyIdentityCard){
            this.fuzzyIdentityCard = fuzzyIdentityCard;
            return this;
        }

        public QueryBuilder fuzzyIdentityCard (String ... fuzzyIdentityCard){
            this.fuzzyIdentityCard = solveNullList(fuzzyIdentityCard);
            return this;
        }

        public QueryBuilder rightFuzzyIdentityCard (List<String> rightFuzzyIdentityCard){
            this.rightFuzzyIdentityCard = rightFuzzyIdentityCard;
            return this;
        }

        public QueryBuilder rightFuzzyIdentityCard (String ... rightFuzzyIdentityCard){
            this.rightFuzzyIdentityCard = solveNullList(rightFuzzyIdentityCard);
            return this;
        }

        public QueryBuilder identityCard(String identityCard){
            setIdentityCard(identityCard);
            return this;
        }

        public QueryBuilder identityCardList(String ... identityCard){
            this.identityCardList = solveNullList(identityCard);
            return this;
        }

        public QueryBuilder identityCardList(List<String> identityCard){
            this.identityCardList = identityCard;
            return this;
        }

        public QueryBuilder fetchIdentityCard(){
            setFetchFields("fetchFields","identityCard");
            return this;
        }

        public QueryBuilder excludeIdentityCard(){
            setFetchFields("excludeFields","identityCard");
            return this;
        }

        public QueryBuilder fuzzyCardNumber (List<String> fuzzyCardNumber){
            this.fuzzyCardNumber = fuzzyCardNumber;
            return this;
        }

        public QueryBuilder fuzzyCardNumber (String ... fuzzyCardNumber){
            this.fuzzyCardNumber = solveNullList(fuzzyCardNumber);
            return this;
        }

        public QueryBuilder rightFuzzyCardNumber (List<String> rightFuzzyCardNumber){
            this.rightFuzzyCardNumber = rightFuzzyCardNumber;
            return this;
        }

        public QueryBuilder rightFuzzyCardNumber (String ... rightFuzzyCardNumber){
            this.rightFuzzyCardNumber = solveNullList(rightFuzzyCardNumber);
            return this;
        }

        public QueryBuilder cardNumber(String cardNumber){
            setCardNumber(cardNumber);
            return this;
        }

        public QueryBuilder cardNumberList(String ... cardNumber){
            this.cardNumberList = solveNullList(cardNumber);
            return this;
        }

        public QueryBuilder cardNumberList(List<String> cardNumber){
            this.cardNumberList = cardNumber;
            return this;
        }

        public QueryBuilder fetchCardNumber(){
            setFetchFields("fetchFields","cardNumber");
            return this;
        }

        public QueryBuilder excludeCardNumber(){
            setFetchFields("excludeFields","cardNumber");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
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

        public QueryBuilder integralBetWeen(java.math.BigDecimal integralSt,java.math.BigDecimal integralEd){
            this.integralSt = integralSt;
            this.integralEd = integralEd;
            return this;
        }

        public QueryBuilder integralGreaterEqThan(java.math.BigDecimal integralSt){
            this.integralSt = integralSt;
            return this;
        }
        public QueryBuilder integralLessEqThan(java.math.BigDecimal integralEd){
            this.integralEd = integralEd;
            return this;
        }


        public QueryBuilder integral(java.math.BigDecimal integral){
            setIntegral(integral);
            return this;
        }

        public QueryBuilder integralList(java.math.BigDecimal ... integral){
            this.integralList = solveNullList(integral);
            return this;
        }

        public QueryBuilder integralList(List<java.math.BigDecimal> integral){
            this.integralList = integral;
            return this;
        }

        public QueryBuilder fetchIntegral(){
            setFetchFields("fetchFields","integral");
            return this;
        }

        public QueryBuilder excludeIntegral(){
            setFetchFields("excludeFields","integral");
            return this;
        }

        public QueryBuilder startIntegralBetWeen(java.math.BigDecimal startIntegralSt,java.math.BigDecimal startIntegralEd){
            this.startIntegralSt = startIntegralSt;
            this.startIntegralEd = startIntegralEd;
            return this;
        }

        public QueryBuilder startIntegralGreaterEqThan(java.math.BigDecimal startIntegralSt){
            this.startIntegralSt = startIntegralSt;
            return this;
        }
        public QueryBuilder startIntegralLessEqThan(java.math.BigDecimal startIntegralEd){
            this.startIntegralEd = startIntegralEd;
            return this;
        }


        public QueryBuilder startIntegral(java.math.BigDecimal startIntegral){
            setStartIntegral(startIntegral);
            return this;
        }

        public QueryBuilder startIntegralList(java.math.BigDecimal ... startIntegral){
            this.startIntegralList = solveNullList(startIntegral);
            return this;
        }

        public QueryBuilder startIntegralList(List<java.math.BigDecimal> startIntegral){
            this.startIntegralList = startIntegral;
            return this;
        }

        public QueryBuilder fetchStartIntegral(){
            setFetchFields("fetchFields","startIntegral");
            return this;
        }

        public QueryBuilder excludeStartIntegral(){
            setFetchFields("excludeFields","startIntegral");
            return this;
        }

        public QueryBuilder expectIntegralBetWeen(java.math.BigDecimal expectIntegralSt,java.math.BigDecimal expectIntegralEd){
            this.expectIntegralSt = expectIntegralSt;
            this.expectIntegralEd = expectIntegralEd;
            return this;
        }

        public QueryBuilder expectIntegralGreaterEqThan(java.math.BigDecimal expectIntegralSt){
            this.expectIntegralSt = expectIntegralSt;
            return this;
        }
        public QueryBuilder expectIntegralLessEqThan(java.math.BigDecimal expectIntegralEd){
            this.expectIntegralEd = expectIntegralEd;
            return this;
        }


        public QueryBuilder expectIntegral(java.math.BigDecimal expectIntegral){
            setExpectIntegral(expectIntegral);
            return this;
        }

        public QueryBuilder expectIntegralList(java.math.BigDecimal ... expectIntegral){
            this.expectIntegralList = solveNullList(expectIntegral);
            return this;
        }

        public QueryBuilder expectIntegralList(List<java.math.BigDecimal> expectIntegral){
            this.expectIntegralList = expectIntegral;
            return this;
        }

        public QueryBuilder fetchExpectIntegral(){
            setFetchFields("fetchFields","expectIntegral");
            return this;
        }

        public QueryBuilder excludeExpectIntegral(){
            setFetchFields("excludeFields","expectIntegral");
            return this;
        }

        public QueryBuilder lineCreditBetWeen(java.math.BigDecimal lineCreditSt,java.math.BigDecimal lineCreditEd){
            this.lineCreditSt = lineCreditSt;
            this.lineCreditEd = lineCreditEd;
            return this;
        }

        public QueryBuilder lineCreditGreaterEqThan(java.math.BigDecimal lineCreditSt){
            this.lineCreditSt = lineCreditSt;
            return this;
        }
        public QueryBuilder lineCreditLessEqThan(java.math.BigDecimal lineCreditEd){
            this.lineCreditEd = lineCreditEd;
            return this;
        }


        public QueryBuilder lineCredit(java.math.BigDecimal lineCredit){
            setLineCredit(lineCredit);
            return this;
        }

        public QueryBuilder lineCreditList(java.math.BigDecimal ... lineCredit){
            this.lineCreditList = solveNullList(lineCredit);
            return this;
        }

        public QueryBuilder lineCreditList(List<java.math.BigDecimal> lineCredit){
            this.lineCreditList = lineCredit;
            return this;
        }

        public QueryBuilder fetchLineCredit(){
            setFetchFields("fetchFields","lineCredit");
            return this;
        }

        public QueryBuilder excludeLineCredit(){
            setFetchFields("excludeFields","lineCredit");
            return this;
        }

        public QueryBuilder activeDateBetWeen(java.time.LocalDateTime activeDateSt,java.time.LocalDateTime activeDateEd){
            this.activeDateSt = activeDateSt;
            this.activeDateEd = activeDateEd;
            return this;
        }

        public QueryBuilder activeDateGreaterEqThan(java.time.LocalDateTime activeDateSt){
            this.activeDateSt = activeDateSt;
            return this;
        }
        public QueryBuilder activeDateLessEqThan(java.time.LocalDateTime activeDateEd){
            this.activeDateEd = activeDateEd;
            return this;
        }


        public QueryBuilder activeDate(java.time.LocalDateTime activeDate){
            setActiveDate(activeDate);
            return this;
        }

        public QueryBuilder activeDateList(java.time.LocalDateTime ... activeDate){
            this.activeDateList = solveNullList(activeDate);
            return this;
        }

        public QueryBuilder activeDateList(List<java.time.LocalDateTime> activeDate){
            this.activeDateList = activeDate;
            return this;
        }

        public QueryBuilder fetchActiveDate(){
            setFetchFields("fetchFields","activeDate");
            return this;
        }

        public QueryBuilder excludeActiveDate(){
            setFetchFields("excludeFields","activeDate");
            return this;
        }

        public QueryBuilder fuzzyIsActive (List<String> fuzzyIsActive){
            this.fuzzyIsActive = fuzzyIsActive;
            return this;
        }

        public QueryBuilder fuzzyIsActive (String ... fuzzyIsActive){
            this.fuzzyIsActive = solveNullList(fuzzyIsActive);
            return this;
        }

        public QueryBuilder rightFuzzyIsActive (List<String> rightFuzzyIsActive){
            this.rightFuzzyIsActive = rightFuzzyIsActive;
            return this;
        }

        public QueryBuilder rightFuzzyIsActive (String ... rightFuzzyIsActive){
            this.rightFuzzyIsActive = solveNullList(rightFuzzyIsActive);
            return this;
        }

        public QueryBuilder isActive(String isActive){
            setIsActive(isActive);
            return this;
        }

        public QueryBuilder isActiveList(String ... isActive){
            this.isActiveList = solveNullList(isActive);
            return this;
        }

        public QueryBuilder isActiveList(List<String> isActive){
            this.isActiveList = isActive;
            return this;
        }

        public QueryBuilder fetchIsActive(){
            setFetchFields("fetchFields","isActive");
            return this;
        }

        public QueryBuilder excludeIsActive(){
            setFetchFields("excludeFields","isActive");
            return this;
        }

        public QueryBuilder fuzzyLastIsActive (List<String> fuzzyLastIsActive){
            this.fuzzyLastIsActive = fuzzyLastIsActive;
            return this;
        }

        public QueryBuilder fuzzyLastIsActive (String ... fuzzyLastIsActive){
            this.fuzzyLastIsActive = solveNullList(fuzzyLastIsActive);
            return this;
        }

        public QueryBuilder rightFuzzyLastIsActive (List<String> rightFuzzyLastIsActive){
            this.rightFuzzyLastIsActive = rightFuzzyLastIsActive;
            return this;
        }

        public QueryBuilder rightFuzzyLastIsActive (String ... rightFuzzyLastIsActive){
            this.rightFuzzyLastIsActive = solveNullList(rightFuzzyLastIsActive);
            return this;
        }

        public QueryBuilder lastIsActive(String lastIsActive){
            setLastIsActive(lastIsActive);
            return this;
        }

        public QueryBuilder lastIsActiveList(String ... lastIsActive){
            this.lastIsActiveList = solveNullList(lastIsActive);
            return this;
        }

        public QueryBuilder lastIsActiveList(List<String> lastIsActive){
            this.lastIsActiveList = lastIsActive;
            return this;
        }

        public QueryBuilder fetchLastIsActive(){
            setFetchFields("fetchFields","lastIsActive");
            return this;
        }

        public QueryBuilder excludeLastIsActive(){
            setFetchFields("excludeFields","lastIsActive");
            return this;
        }

        public QueryBuilder fuzzyIsPayPassword (List<String> fuzzyIsPayPassword){
            this.fuzzyIsPayPassword = fuzzyIsPayPassword;
            return this;
        }

        public QueryBuilder fuzzyIsPayPassword (String ... fuzzyIsPayPassword){
            this.fuzzyIsPayPassword = solveNullList(fuzzyIsPayPassword);
            return this;
        }

        public QueryBuilder rightFuzzyIsPayPassword (List<String> rightFuzzyIsPayPassword){
            this.rightFuzzyIsPayPassword = rightFuzzyIsPayPassword;
            return this;
        }

        public QueryBuilder rightFuzzyIsPayPassword (String ... rightFuzzyIsPayPassword){
            this.rightFuzzyIsPayPassword = solveNullList(rightFuzzyIsPayPassword);
            return this;
        }

        public QueryBuilder isPayPassword(String isPayPassword){
            setIsPayPassword(isPayPassword);
            return this;
        }

        public QueryBuilder isPayPasswordList(String ... isPayPassword){
            this.isPayPasswordList = solveNullList(isPayPassword);
            return this;
        }

        public QueryBuilder isPayPasswordList(List<String> isPayPassword){
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

        public QueryBuilder fuzzyDataSyn (List<String> fuzzyDataSyn){
            this.fuzzyDataSyn = fuzzyDataSyn;
            return this;
        }

        public QueryBuilder fuzzyDataSyn (String ... fuzzyDataSyn){
            this.fuzzyDataSyn = solveNullList(fuzzyDataSyn);
            return this;
        }

        public QueryBuilder rightFuzzyDataSyn (List<String> rightFuzzyDataSyn){
            this.rightFuzzyDataSyn = rightFuzzyDataSyn;
            return this;
        }

        public QueryBuilder rightFuzzyDataSyn (String ... rightFuzzyDataSyn){
            this.rightFuzzyDataSyn = solveNullList(rightFuzzyDataSyn);
            return this;
        }

        public QueryBuilder dataSyn(String dataSyn){
            setDataSyn(dataSyn);
            return this;
        }

        public QueryBuilder dataSynList(String ... dataSyn){
            this.dataSynList = solveNullList(dataSyn);
            return this;
        }

        public QueryBuilder dataSynList(List<String> dataSyn){
            this.dataSynList = dataSyn;
            return this;
        }

        public QueryBuilder fetchDataSyn(){
            setFetchFields("fetchFields","dataSyn");
            return this;
        }

        public QueryBuilder excludeDataSyn(){
            setFetchFields("excludeFields","dataSyn");
            return this;
        }

        public QueryBuilder fuzzyCreateBy (List<String> fuzzyCreateBy){
            this.fuzzyCreateBy = fuzzyCreateBy;
            return this;
        }

        public QueryBuilder fuzzyCreateBy (String ... fuzzyCreateBy){
            this.fuzzyCreateBy = solveNullList(fuzzyCreateBy);
            return this;
        }

        public QueryBuilder rightFuzzyCreateBy (List<String> rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = rightFuzzyCreateBy;
            return this;
        }

        public QueryBuilder rightFuzzyCreateBy (String ... rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = solveNullList(rightFuzzyCreateBy);
            return this;
        }

        public QueryBuilder createBy(String createBy){
            setCreateBy(createBy);
            return this;
        }

        public QueryBuilder createByList(String ... createBy){
            this.createByList = solveNullList(createBy);
            return this;
        }

        public QueryBuilder createByList(List<String> createBy){
            this.createByList = createBy;
            return this;
        }

        public QueryBuilder fetchCreateBy(){
            setFetchFields("fetchFields","createBy");
            return this;
        }

        public QueryBuilder excludeCreateBy(){
            setFetchFields("excludeFields","createBy");
            return this;
        }

        public QueryBuilder fuzzyDelFlag (List<String> fuzzyDelFlag){
            this.fuzzyDelFlag = fuzzyDelFlag;
            return this;
        }

        public QueryBuilder fuzzyDelFlag (String ... fuzzyDelFlag){
            this.fuzzyDelFlag = solveNullList(fuzzyDelFlag);
            return this;
        }

        public QueryBuilder rightFuzzyDelFlag (List<String> rightFuzzyDelFlag){
            this.rightFuzzyDelFlag = rightFuzzyDelFlag;
            return this;
        }

        public QueryBuilder rightFuzzyDelFlag (String ... rightFuzzyDelFlag){
            this.rightFuzzyDelFlag = solveNullList(rightFuzzyDelFlag);
            return this;
        }

        public QueryBuilder delFlag(String delFlag){
            setDelFlag(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(String ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(List<String> delFlag){
            this.delFlagList = delFlag;
            return this;
        }

        public QueryBuilder fetchDelFlag(){
            setFetchFields("fetchFields","delFlag");
            return this;
        }

        public QueryBuilder excludeDelFlag(){
            setFetchFields("excludeFields","delFlag");
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

        public QueryBuilder fuzzyLicenseNumber (List<String> fuzzyLicenseNumber){
            this.fuzzyLicenseNumber = fuzzyLicenseNumber;
            return this;
        }

        public QueryBuilder fuzzyLicenseNumber (String ... fuzzyLicenseNumber){
            this.fuzzyLicenseNumber = solveNullList(fuzzyLicenseNumber);
            return this;
        }

        public QueryBuilder rightFuzzyLicenseNumber (List<String> rightFuzzyLicenseNumber){
            this.rightFuzzyLicenseNumber = rightFuzzyLicenseNumber;
            return this;
        }

        public QueryBuilder rightFuzzyLicenseNumber (String ... rightFuzzyLicenseNumber){
            this.rightFuzzyLicenseNumber = solveNullList(rightFuzzyLicenseNumber);
            return this;
        }

        public QueryBuilder licenseNumber(String licenseNumber){
            setLicenseNumber(licenseNumber);
            return this;
        }

        public QueryBuilder licenseNumberList(String ... licenseNumber){
            this.licenseNumberList = solveNullList(licenseNumber);
            return this;
        }

        public QueryBuilder licenseNumberList(List<String> licenseNumber){
            this.licenseNumberList = licenseNumber;
            return this;
        }

        public QueryBuilder fetchLicenseNumber(){
            setFetchFields("fetchFields","licenseNumber");
            return this;
        }

        public QueryBuilder excludeLicenseNumber(){
            setFetchFields("excludeFields","licenseNumber");
            return this;
        }

        public QueryBuilder fuzzyRemarks (List<String> fuzzyRemarks){
            this.fuzzyRemarks = fuzzyRemarks;
            return this;
        }

        public QueryBuilder fuzzyRemarks (String ... fuzzyRemarks){
            this.fuzzyRemarks = solveNullList(fuzzyRemarks);
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (List<String> rightFuzzyRemarks){
            this.rightFuzzyRemarks = rightFuzzyRemarks;
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (String ... rightFuzzyRemarks){
            this.rightFuzzyRemarks = solveNullList(rightFuzzyRemarks);
            return this;
        }

        public QueryBuilder remarks(String remarks){
            setRemarks(remarks);
            return this;
        }

        public QueryBuilder remarksList(String ... remarks){
            this.remarksList = solveNullList(remarks);
            return this;
        }

        public QueryBuilder remarksList(List<String> remarks){
            this.remarksList = remarks;
            return this;
        }

        public QueryBuilder fetchRemarks(){
            setFetchFields("fetchFields","remarks");
            return this;
        }

        public QueryBuilder excludeRemarks(){
            setFetchFields("excludeFields","remarks");
            return this;
        }

        public QueryBuilder fuzzySourceCardNumber (List<String> fuzzySourceCardNumber){
            this.fuzzySourceCardNumber = fuzzySourceCardNumber;
            return this;
        }

        public QueryBuilder fuzzySourceCardNumber (String ... fuzzySourceCardNumber){
            this.fuzzySourceCardNumber = solveNullList(fuzzySourceCardNumber);
            return this;
        }

        public QueryBuilder rightFuzzySourceCardNumber (List<String> rightFuzzySourceCardNumber){
            this.rightFuzzySourceCardNumber = rightFuzzySourceCardNumber;
            return this;
        }

        public QueryBuilder rightFuzzySourceCardNumber (String ... rightFuzzySourceCardNumber){
            this.rightFuzzySourceCardNumber = solveNullList(rightFuzzySourceCardNumber);
            return this;
        }

        public QueryBuilder sourceCardNumber(String sourceCardNumber){
            setSourceCardNumber(sourceCardNumber);
            return this;
        }

        public QueryBuilder sourceCardNumberList(String ... sourceCardNumber){
            this.sourceCardNumberList = solveNullList(sourceCardNumber);
            return this;
        }

        public QueryBuilder sourceCardNumberList(List<String> sourceCardNumber){
            this.sourceCardNumberList = sourceCardNumber;
            return this;
        }

        public QueryBuilder fetchSourceCardNumber(){
            setFetchFields("fetchFields","sourceCardNumber");
            return this;
        }

        public QueryBuilder excludeSourceCardNumber(){
            setFetchFields("excludeFields","sourceCardNumber");
            return this;
        }

        public QueryBuilder updateDateBetWeen(java.time.LocalDateTime updateDateSt,java.time.LocalDateTime updateDateEd){
            this.updateDateSt = updateDateSt;
            this.updateDateEd = updateDateEd;
            return this;
        }

        public QueryBuilder updateDateGreaterEqThan(java.time.LocalDateTime updateDateSt){
            this.updateDateSt = updateDateSt;
            return this;
        }
        public QueryBuilder updateDateLessEqThan(java.time.LocalDateTime updateDateEd){
            this.updateDateEd = updateDateEd;
            return this;
        }


        public QueryBuilder updateDate(java.time.LocalDateTime updateDate){
            setUpdateDate(updateDate);
            return this;
        }

        public QueryBuilder updateDateList(java.time.LocalDateTime ... updateDate){
            this.updateDateList = solveNullList(updateDate);
            return this;
        }

        public QueryBuilder updateDateList(List<java.time.LocalDateTime> updateDate){
            this.updateDateList = updateDate;
            return this;
        }

        public QueryBuilder fetchUpdateDate(){
            setFetchFields("fetchFields","updateDate");
            return this;
        }

        public QueryBuilder excludeUpdateDate(){
            setFetchFields("excludeFields","updateDate");
            return this;
        }

        public QueryBuilder fuzzyUpdateBy (List<String> fuzzyUpdateBy){
            this.fuzzyUpdateBy = fuzzyUpdateBy;
            return this;
        }

        public QueryBuilder fuzzyUpdateBy (String ... fuzzyUpdateBy){
            this.fuzzyUpdateBy = solveNullList(fuzzyUpdateBy);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateBy (List<String> rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = rightFuzzyUpdateBy;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateBy (String ... rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = solveNullList(rightFuzzyUpdateBy);
            return this;
        }

        public QueryBuilder updateBy(String updateBy){
            setUpdateBy(updateBy);
            return this;
        }

        public QueryBuilder updateByList(String ... updateBy){
            this.updateByList = solveNullList(updateBy);
            return this;
        }

        public QueryBuilder updateByList(List<String> updateBy){
            this.updateByList = updateBy;
            return this;
        }

        public QueryBuilder fetchUpdateBy(){
            setFetchFields("fetchFields","updateBy");
            return this;
        }

        public QueryBuilder excludeUpdateBy(){
            setFetchFields("excludeFields","updateBy");
            return this;
        }

        public QueryBuilder createDateBetWeen(java.time.LocalDateTime createDateSt,java.time.LocalDateTime createDateEd){
            this.createDateSt = createDateSt;
            this.createDateEd = createDateEd;
            return this;
        }

        public QueryBuilder createDateGreaterEqThan(java.time.LocalDateTime createDateSt){
            this.createDateSt = createDateSt;
            return this;
        }
        public QueryBuilder createDateLessEqThan(java.time.LocalDateTime createDateEd){
            this.createDateEd = createDateEd;
            return this;
        }


        public QueryBuilder createDate(java.time.LocalDateTime createDate){
            setCreateDate(createDate);
            return this;
        }

        public QueryBuilder createDateList(java.time.LocalDateTime ... createDate){
            this.createDateList = solveNullList(createDate);
            return this;
        }

        public QueryBuilder createDateList(List<java.time.LocalDateTime> createDate){
            this.createDateList = createDate;
            return this;
        }

        public QueryBuilder fetchCreateDate(){
            setFetchFields("fetchFields","createDate");
            return this;
        }

        public QueryBuilder excludeCreateDate(){
            setFetchFields("excludeFields","createDate");
            return this;
        }

        public QueryBuilder wealthBetWeen(java.math.BigDecimal wealthSt,java.math.BigDecimal wealthEd){
            this.wealthSt = wealthSt;
            this.wealthEd = wealthEd;
            return this;
        }

        public QueryBuilder wealthGreaterEqThan(java.math.BigDecimal wealthSt){
            this.wealthSt = wealthSt;
            return this;
        }
        public QueryBuilder wealthLessEqThan(java.math.BigDecimal wealthEd){
            this.wealthEd = wealthEd;
            return this;
        }


        public QueryBuilder wealth(java.math.BigDecimal wealth){
            setWealth(wealth);
            return this;
        }

        public QueryBuilder wealthList(java.math.BigDecimal ... wealth){
            this.wealthList = solveNullList(wealth);
            return this;
        }

        public QueryBuilder wealthList(List<java.math.BigDecimal> wealth){
            this.wealthList = wealth;
            return this;
        }

        public QueryBuilder fetchWealth(){
            setFetchFields("fetchFields","wealth");
            return this;
        }

        public QueryBuilder excludeWealth(){
            setFetchFields("excludeFields","wealth");
            return this;
        }

        public QueryBuilder jobStatusBetWeen(Integer jobStatusSt,Integer jobStatusEd){
            this.jobStatusSt = jobStatusSt;
            this.jobStatusEd = jobStatusEd;
            return this;
        }

        public QueryBuilder jobStatusGreaterEqThan(Integer jobStatusSt){
            this.jobStatusSt = jobStatusSt;
            return this;
        }
        public QueryBuilder jobStatusLessEqThan(Integer jobStatusEd){
            this.jobStatusEd = jobStatusEd;
            return this;
        }


        public QueryBuilder jobStatus(Integer jobStatus){
            setJobStatus(jobStatus);
            return this;
        }

        public QueryBuilder jobStatusList(Integer ... jobStatus){
            this.jobStatusList = solveNullList(jobStatus);
            return this;
        }

        public QueryBuilder jobStatusList(List<Integer> jobStatus){
            this.jobStatusList = jobStatus;
            return this;
        }

        public QueryBuilder fetchJobStatus(){
            setFetchFields("fetchFields","jobStatus");
            return this;
        }

        public QueryBuilder excludeJobStatus(){
            setFetchFields("excludeFields","jobStatus");
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

        public AdUser build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> groupNumList;

        public List<Long> getGroupNumList(){return this.groupNumList;}

        private Long groupNumSt;

        private Long groupNumEd;

        public Long getGroupNumSt(){return this.groupNumSt;}

        public Long getGroupNumEd(){return this.groupNumEd;}

        private List<Integer> cardRangeList;

        public List<Integer> getCardRangeList(){return this.cardRangeList;}

        private Integer cardRangeSt;

        private Integer cardRangeEd;

        public Integer getCardRangeSt(){return this.cardRangeSt;}

        public Integer getCardRangeEd(){return this.cardRangeEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> sexList;

        public List<String> getSexList(){return this.sexList;}


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){return this.fuzzySex;}

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){return this.rightFuzzySex;}
        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<String> mailboxList;

        public List<String> getMailboxList(){return this.mailboxList;}


        private List<String> fuzzyMailbox;

        public List<String> getFuzzyMailbox(){return this.fuzzyMailbox;}

        private List<String> rightFuzzyMailbox;

        public List<String> getRightFuzzyMailbox(){return this.rightFuzzyMailbox;}
        private List<String> identityCardList;

        public List<String> getIdentityCardList(){return this.identityCardList;}


        private List<String> fuzzyIdentityCard;

        public List<String> getFuzzyIdentityCard(){return this.fuzzyIdentityCard;}

        private List<String> rightFuzzyIdentityCard;

        public List<String> getRightFuzzyIdentityCard(){return this.rightFuzzyIdentityCard;}
        private List<String> cardNumberList;

        public List<String> getCardNumberList(){return this.cardNumberList;}


        private List<String> fuzzyCardNumber;

        public List<String> getFuzzyCardNumber(){return this.fuzzyCardNumber;}

        private List<String> rightFuzzyCardNumber;

        public List<String> getRightFuzzyCardNumber(){return this.rightFuzzyCardNumber;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> payPasswordList;

        public List<String> getPayPasswordList(){return this.payPasswordList;}


        private List<String> fuzzyPayPassword;

        public List<String> getFuzzyPayPassword(){return this.fuzzyPayPassword;}

        private List<String> rightFuzzyPayPassword;

        public List<String> getRightFuzzyPayPassword(){return this.rightFuzzyPayPassword;}
        private List<java.math.BigDecimal> integralList;

        public List<java.math.BigDecimal> getIntegralList(){return this.integralList;}

        private java.math.BigDecimal integralSt;

        private java.math.BigDecimal integralEd;

        public java.math.BigDecimal getIntegralSt(){return this.integralSt;}

        public java.math.BigDecimal getIntegralEd(){return this.integralEd;}

        private List<java.math.BigDecimal> startIntegralList;

        public List<java.math.BigDecimal> getStartIntegralList(){return this.startIntegralList;}

        private java.math.BigDecimal startIntegralSt;

        private java.math.BigDecimal startIntegralEd;

        public java.math.BigDecimal getStartIntegralSt(){return this.startIntegralSt;}

        public java.math.BigDecimal getStartIntegralEd(){return this.startIntegralEd;}

        private List<java.math.BigDecimal> expectIntegralList;

        public List<java.math.BigDecimal> getExpectIntegralList(){return this.expectIntegralList;}

        private java.math.BigDecimal expectIntegralSt;

        private java.math.BigDecimal expectIntegralEd;

        public java.math.BigDecimal getExpectIntegralSt(){return this.expectIntegralSt;}

        public java.math.BigDecimal getExpectIntegralEd(){return this.expectIntegralEd;}

        private List<java.math.BigDecimal> lineCreditList;

        public List<java.math.BigDecimal> getLineCreditList(){return this.lineCreditList;}

        private java.math.BigDecimal lineCreditSt;

        private java.math.BigDecimal lineCreditEd;

        public java.math.BigDecimal getLineCreditSt(){return this.lineCreditSt;}

        public java.math.BigDecimal getLineCreditEd(){return this.lineCreditEd;}

        private List<java.time.LocalDateTime> activeDateList;

        public List<java.time.LocalDateTime> getActiveDateList(){return this.activeDateList;}

        private java.time.LocalDateTime activeDateSt;

        private java.time.LocalDateTime activeDateEd;

        public java.time.LocalDateTime getActiveDateSt(){return this.activeDateSt;}

        public java.time.LocalDateTime getActiveDateEd(){return this.activeDateEd;}

        private List<String> isActiveList;

        public List<String> getIsActiveList(){return this.isActiveList;}


        private List<String> fuzzyIsActive;

        public List<String> getFuzzyIsActive(){return this.fuzzyIsActive;}

        private List<String> rightFuzzyIsActive;

        public List<String> getRightFuzzyIsActive(){return this.rightFuzzyIsActive;}
        private List<String> lastIsActiveList;

        public List<String> getLastIsActiveList(){return this.lastIsActiveList;}


        private List<String> fuzzyLastIsActive;

        public List<String> getFuzzyLastIsActive(){return this.fuzzyLastIsActive;}

        private List<String> rightFuzzyLastIsActive;

        public List<String> getRightFuzzyLastIsActive(){return this.rightFuzzyLastIsActive;}
        private List<String> isPayPasswordList;

        public List<String> getIsPayPasswordList(){return this.isPayPasswordList;}


        private List<String> fuzzyIsPayPassword;

        public List<String> getFuzzyIsPayPassword(){return this.fuzzyIsPayPassword;}

        private List<String> rightFuzzyIsPayPassword;

        public List<String> getRightFuzzyIsPayPassword(){return this.rightFuzzyIsPayPassword;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> dataSynList;

        public List<String> getDataSynList(){return this.dataSynList;}


        private List<String> fuzzyDataSyn;

        public List<String> getFuzzyDataSyn(){return this.fuzzyDataSyn;}

        private List<String> rightFuzzyDataSyn;

        public List<String> getRightFuzzyDataSyn(){return this.rightFuzzyDataSyn;}
        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<String> delFlagList;

        public List<String> getDelFlagList(){return this.delFlagList;}


        private List<String> fuzzyDelFlag;

        public List<String> getFuzzyDelFlag(){return this.fuzzyDelFlag;}

        private List<String> rightFuzzyDelFlag;

        public List<String> getRightFuzzyDelFlag(){return this.rightFuzzyDelFlag;}
        private List<Integer> stateList;

        public List<Integer> getStateList(){return this.stateList;}

        private Integer stateSt;

        private Integer stateEd;

        public Integer getStateSt(){return this.stateSt;}

        public Integer getStateEd(){return this.stateEd;}

        private List<String> licenseNumberList;

        public List<String> getLicenseNumberList(){return this.licenseNumberList;}


        private List<String> fuzzyLicenseNumber;

        public List<String> getFuzzyLicenseNumber(){return this.fuzzyLicenseNumber;}

        private List<String> rightFuzzyLicenseNumber;

        public List<String> getRightFuzzyLicenseNumber(){return this.rightFuzzyLicenseNumber;}
        private List<String> remarksList;

        public List<String> getRemarksList(){return this.remarksList;}


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){return this.fuzzyRemarks;}

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){return this.rightFuzzyRemarks;}
        private List<String> sourceCardNumberList;

        public List<String> getSourceCardNumberList(){return this.sourceCardNumberList;}


        private List<String> fuzzySourceCardNumber;

        public List<String> getFuzzySourceCardNumber(){return this.fuzzySourceCardNumber;}

        private List<String> rightFuzzySourceCardNumber;

        public List<String> getRightFuzzySourceCardNumber(){return this.rightFuzzySourceCardNumber;}
        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.math.BigDecimal> wealthList;

        public List<java.math.BigDecimal> getWealthList(){return this.wealthList;}

        private java.math.BigDecimal wealthSt;

        private java.math.BigDecimal wealthEd;

        public java.math.BigDecimal getWealthSt(){return this.wealthSt;}

        public java.math.BigDecimal getWealthEd(){return this.wealthEd;}

        private List<Integer> jobStatusList;

        public List<Integer> getJobStatusList(){return this.jobStatusList;}

        private Integer jobStatusSt;

        private Integer jobStatusEd;

        public Integer getJobStatusSt(){return this.jobStatusSt;}

        public Integer getJobStatusEd(){return this.jobStatusEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder groupNumBetWeen(Long groupNumSt,Long groupNumEd){
            this.groupNumSt = groupNumSt;
            this.groupNumEd = groupNumEd;
            return this;
        }

        public ConditionBuilder groupNumGreaterEqThan(Long groupNumSt){
            this.groupNumSt = groupNumSt;
            return this;
        }
        public ConditionBuilder groupNumLessEqThan(Long groupNumEd){
            this.groupNumEd = groupNumEd;
            return this;
        }


        public ConditionBuilder groupNumList(Long ... groupNum){
            this.groupNumList = solveNullList(groupNum);
            return this;
        }

        public ConditionBuilder groupNumList(List<Long> groupNum){
            this.groupNumList = groupNum;
            return this;
        }

        public ConditionBuilder cardRangeBetWeen(Integer cardRangeSt,Integer cardRangeEd){
            this.cardRangeSt = cardRangeSt;
            this.cardRangeEd = cardRangeEd;
            return this;
        }

        public ConditionBuilder cardRangeGreaterEqThan(Integer cardRangeSt){
            this.cardRangeSt = cardRangeSt;
            return this;
        }
        public ConditionBuilder cardRangeLessEqThan(Integer cardRangeEd){
            this.cardRangeEd = cardRangeEd;
            return this;
        }


        public ConditionBuilder cardRangeList(Integer ... cardRange){
            this.cardRangeList = solveNullList(cardRange);
            return this;
        }

        public ConditionBuilder cardRangeList(List<Integer> cardRange){
            this.cardRangeList = cardRange;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public ConditionBuilder fuzzySex (String ... fuzzySex){
            this.fuzzySex = solveNullList(fuzzySex);
            return this;
        }

        public ConditionBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public ConditionBuilder rightFuzzySex (String ... rightFuzzySex){
            this.rightFuzzySex = solveNullList(rightFuzzySex);
            return this;
        }

        public ConditionBuilder sexList(String ... sex){
            this.sexList = solveNullList(sex);
            return this;
        }

        public ConditionBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public ConditionBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public ConditionBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public ConditionBuilder fuzzyMailbox (List<String> fuzzyMailbox){
            this.fuzzyMailbox = fuzzyMailbox;
            return this;
        }

        public ConditionBuilder fuzzyMailbox (String ... fuzzyMailbox){
            this.fuzzyMailbox = solveNullList(fuzzyMailbox);
            return this;
        }

        public ConditionBuilder rightFuzzyMailbox (List<String> rightFuzzyMailbox){
            this.rightFuzzyMailbox = rightFuzzyMailbox;
            return this;
        }

        public ConditionBuilder rightFuzzyMailbox (String ... rightFuzzyMailbox){
            this.rightFuzzyMailbox = solveNullList(rightFuzzyMailbox);
            return this;
        }

        public ConditionBuilder mailboxList(String ... mailbox){
            this.mailboxList = solveNullList(mailbox);
            return this;
        }

        public ConditionBuilder mailboxList(List<String> mailbox){
            this.mailboxList = mailbox;
            return this;
        }

        public ConditionBuilder fuzzyIdentityCard (List<String> fuzzyIdentityCard){
            this.fuzzyIdentityCard = fuzzyIdentityCard;
            return this;
        }

        public ConditionBuilder fuzzyIdentityCard (String ... fuzzyIdentityCard){
            this.fuzzyIdentityCard = solveNullList(fuzzyIdentityCard);
            return this;
        }

        public ConditionBuilder rightFuzzyIdentityCard (List<String> rightFuzzyIdentityCard){
            this.rightFuzzyIdentityCard = rightFuzzyIdentityCard;
            return this;
        }

        public ConditionBuilder rightFuzzyIdentityCard (String ... rightFuzzyIdentityCard){
            this.rightFuzzyIdentityCard = solveNullList(rightFuzzyIdentityCard);
            return this;
        }

        public ConditionBuilder identityCardList(String ... identityCard){
            this.identityCardList = solveNullList(identityCard);
            return this;
        }

        public ConditionBuilder identityCardList(List<String> identityCard){
            this.identityCardList = identityCard;
            return this;
        }

        public ConditionBuilder fuzzyCardNumber (List<String> fuzzyCardNumber){
            this.fuzzyCardNumber = fuzzyCardNumber;
            return this;
        }

        public ConditionBuilder fuzzyCardNumber (String ... fuzzyCardNumber){
            this.fuzzyCardNumber = solveNullList(fuzzyCardNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyCardNumber (List<String> rightFuzzyCardNumber){
            this.rightFuzzyCardNumber = rightFuzzyCardNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyCardNumber (String ... rightFuzzyCardNumber){
            this.rightFuzzyCardNumber = solveNullList(rightFuzzyCardNumber);
            return this;
        }

        public ConditionBuilder cardNumberList(String ... cardNumber){
            this.cardNumberList = solveNullList(cardNumber);
            return this;
        }

        public ConditionBuilder cardNumberList(List<String> cardNumber){
            this.cardNumberList = cardNumber;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
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

        public ConditionBuilder integralBetWeen(java.math.BigDecimal integralSt,java.math.BigDecimal integralEd){
            this.integralSt = integralSt;
            this.integralEd = integralEd;
            return this;
        }

        public ConditionBuilder integralGreaterEqThan(java.math.BigDecimal integralSt){
            this.integralSt = integralSt;
            return this;
        }
        public ConditionBuilder integralLessEqThan(java.math.BigDecimal integralEd){
            this.integralEd = integralEd;
            return this;
        }


        public ConditionBuilder integralList(java.math.BigDecimal ... integral){
            this.integralList = solveNullList(integral);
            return this;
        }

        public ConditionBuilder integralList(List<java.math.BigDecimal> integral){
            this.integralList = integral;
            return this;
        }

        public ConditionBuilder startIntegralBetWeen(java.math.BigDecimal startIntegralSt,java.math.BigDecimal startIntegralEd){
            this.startIntegralSt = startIntegralSt;
            this.startIntegralEd = startIntegralEd;
            return this;
        }

        public ConditionBuilder startIntegralGreaterEqThan(java.math.BigDecimal startIntegralSt){
            this.startIntegralSt = startIntegralSt;
            return this;
        }
        public ConditionBuilder startIntegralLessEqThan(java.math.BigDecimal startIntegralEd){
            this.startIntegralEd = startIntegralEd;
            return this;
        }


        public ConditionBuilder startIntegralList(java.math.BigDecimal ... startIntegral){
            this.startIntegralList = solveNullList(startIntegral);
            return this;
        }

        public ConditionBuilder startIntegralList(List<java.math.BigDecimal> startIntegral){
            this.startIntegralList = startIntegral;
            return this;
        }

        public ConditionBuilder expectIntegralBetWeen(java.math.BigDecimal expectIntegralSt,java.math.BigDecimal expectIntegralEd){
            this.expectIntegralSt = expectIntegralSt;
            this.expectIntegralEd = expectIntegralEd;
            return this;
        }

        public ConditionBuilder expectIntegralGreaterEqThan(java.math.BigDecimal expectIntegralSt){
            this.expectIntegralSt = expectIntegralSt;
            return this;
        }
        public ConditionBuilder expectIntegralLessEqThan(java.math.BigDecimal expectIntegralEd){
            this.expectIntegralEd = expectIntegralEd;
            return this;
        }


        public ConditionBuilder expectIntegralList(java.math.BigDecimal ... expectIntegral){
            this.expectIntegralList = solveNullList(expectIntegral);
            return this;
        }

        public ConditionBuilder expectIntegralList(List<java.math.BigDecimal> expectIntegral){
            this.expectIntegralList = expectIntegral;
            return this;
        }

        public ConditionBuilder lineCreditBetWeen(java.math.BigDecimal lineCreditSt,java.math.BigDecimal lineCreditEd){
            this.lineCreditSt = lineCreditSt;
            this.lineCreditEd = lineCreditEd;
            return this;
        }

        public ConditionBuilder lineCreditGreaterEqThan(java.math.BigDecimal lineCreditSt){
            this.lineCreditSt = lineCreditSt;
            return this;
        }
        public ConditionBuilder lineCreditLessEqThan(java.math.BigDecimal lineCreditEd){
            this.lineCreditEd = lineCreditEd;
            return this;
        }


        public ConditionBuilder lineCreditList(java.math.BigDecimal ... lineCredit){
            this.lineCreditList = solveNullList(lineCredit);
            return this;
        }

        public ConditionBuilder lineCreditList(List<java.math.BigDecimal> lineCredit){
            this.lineCreditList = lineCredit;
            return this;
        }

        public ConditionBuilder activeDateBetWeen(java.time.LocalDateTime activeDateSt,java.time.LocalDateTime activeDateEd){
            this.activeDateSt = activeDateSt;
            this.activeDateEd = activeDateEd;
            return this;
        }

        public ConditionBuilder activeDateGreaterEqThan(java.time.LocalDateTime activeDateSt){
            this.activeDateSt = activeDateSt;
            return this;
        }
        public ConditionBuilder activeDateLessEqThan(java.time.LocalDateTime activeDateEd){
            this.activeDateEd = activeDateEd;
            return this;
        }


        public ConditionBuilder activeDateList(java.time.LocalDateTime ... activeDate){
            this.activeDateList = solveNullList(activeDate);
            return this;
        }

        public ConditionBuilder activeDateList(List<java.time.LocalDateTime> activeDate){
            this.activeDateList = activeDate;
            return this;
        }

        public ConditionBuilder fuzzyIsActive (List<String> fuzzyIsActive){
            this.fuzzyIsActive = fuzzyIsActive;
            return this;
        }

        public ConditionBuilder fuzzyIsActive (String ... fuzzyIsActive){
            this.fuzzyIsActive = solveNullList(fuzzyIsActive);
            return this;
        }

        public ConditionBuilder rightFuzzyIsActive (List<String> rightFuzzyIsActive){
            this.rightFuzzyIsActive = rightFuzzyIsActive;
            return this;
        }

        public ConditionBuilder rightFuzzyIsActive (String ... rightFuzzyIsActive){
            this.rightFuzzyIsActive = solveNullList(rightFuzzyIsActive);
            return this;
        }

        public ConditionBuilder isActiveList(String ... isActive){
            this.isActiveList = solveNullList(isActive);
            return this;
        }

        public ConditionBuilder isActiveList(List<String> isActive){
            this.isActiveList = isActive;
            return this;
        }

        public ConditionBuilder fuzzyLastIsActive (List<String> fuzzyLastIsActive){
            this.fuzzyLastIsActive = fuzzyLastIsActive;
            return this;
        }

        public ConditionBuilder fuzzyLastIsActive (String ... fuzzyLastIsActive){
            this.fuzzyLastIsActive = solveNullList(fuzzyLastIsActive);
            return this;
        }

        public ConditionBuilder rightFuzzyLastIsActive (List<String> rightFuzzyLastIsActive){
            this.rightFuzzyLastIsActive = rightFuzzyLastIsActive;
            return this;
        }

        public ConditionBuilder rightFuzzyLastIsActive (String ... rightFuzzyLastIsActive){
            this.rightFuzzyLastIsActive = solveNullList(rightFuzzyLastIsActive);
            return this;
        }

        public ConditionBuilder lastIsActiveList(String ... lastIsActive){
            this.lastIsActiveList = solveNullList(lastIsActive);
            return this;
        }

        public ConditionBuilder lastIsActiveList(List<String> lastIsActive){
            this.lastIsActiveList = lastIsActive;
            return this;
        }

        public ConditionBuilder fuzzyIsPayPassword (List<String> fuzzyIsPayPassword){
            this.fuzzyIsPayPassword = fuzzyIsPayPassword;
            return this;
        }

        public ConditionBuilder fuzzyIsPayPassword (String ... fuzzyIsPayPassword){
            this.fuzzyIsPayPassword = solveNullList(fuzzyIsPayPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyIsPayPassword (List<String> rightFuzzyIsPayPassword){
            this.rightFuzzyIsPayPassword = rightFuzzyIsPayPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyIsPayPassword (String ... rightFuzzyIsPayPassword){
            this.rightFuzzyIsPayPassword = solveNullList(rightFuzzyIsPayPassword);
            return this;
        }

        public ConditionBuilder isPayPasswordList(String ... isPayPassword){
            this.isPayPasswordList = solveNullList(isPayPassword);
            return this;
        }

        public ConditionBuilder isPayPasswordList(List<String> isPayPassword){
            this.isPayPasswordList = isPayPassword;
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

        public ConditionBuilder fuzzyDataSyn (List<String> fuzzyDataSyn){
            this.fuzzyDataSyn = fuzzyDataSyn;
            return this;
        }

        public ConditionBuilder fuzzyDataSyn (String ... fuzzyDataSyn){
            this.fuzzyDataSyn = solveNullList(fuzzyDataSyn);
            return this;
        }

        public ConditionBuilder rightFuzzyDataSyn (List<String> rightFuzzyDataSyn){
            this.rightFuzzyDataSyn = rightFuzzyDataSyn;
            return this;
        }

        public ConditionBuilder rightFuzzyDataSyn (String ... rightFuzzyDataSyn){
            this.rightFuzzyDataSyn = solveNullList(rightFuzzyDataSyn);
            return this;
        }

        public ConditionBuilder dataSynList(String ... dataSyn){
            this.dataSynList = solveNullList(dataSyn);
            return this;
        }

        public ConditionBuilder dataSynList(List<String> dataSyn){
            this.dataSynList = dataSyn;
            return this;
        }

        public ConditionBuilder fuzzyCreateBy (List<String> fuzzyCreateBy){
            this.fuzzyCreateBy = fuzzyCreateBy;
            return this;
        }

        public ConditionBuilder fuzzyCreateBy (String ... fuzzyCreateBy){
            this.fuzzyCreateBy = solveNullList(fuzzyCreateBy);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateBy (List<String> rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = rightFuzzyCreateBy;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateBy (String ... rightFuzzyCreateBy){
            this.rightFuzzyCreateBy = solveNullList(rightFuzzyCreateBy);
            return this;
        }

        public ConditionBuilder createByList(String ... createBy){
            this.createByList = solveNullList(createBy);
            return this;
        }

        public ConditionBuilder createByList(List<String> createBy){
            this.createByList = createBy;
            return this;
        }

        public ConditionBuilder fuzzyDelFlag (List<String> fuzzyDelFlag){
            this.fuzzyDelFlag = fuzzyDelFlag;
            return this;
        }

        public ConditionBuilder fuzzyDelFlag (String ... fuzzyDelFlag){
            this.fuzzyDelFlag = solveNullList(fuzzyDelFlag);
            return this;
        }

        public ConditionBuilder rightFuzzyDelFlag (List<String> rightFuzzyDelFlag){
            this.rightFuzzyDelFlag = rightFuzzyDelFlag;
            return this;
        }

        public ConditionBuilder rightFuzzyDelFlag (String ... rightFuzzyDelFlag){
            this.rightFuzzyDelFlag = solveNullList(rightFuzzyDelFlag);
            return this;
        }

        public ConditionBuilder delFlagList(String ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public ConditionBuilder delFlagList(List<String> delFlag){
            this.delFlagList = delFlag;
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

        public ConditionBuilder fuzzyLicenseNumber (List<String> fuzzyLicenseNumber){
            this.fuzzyLicenseNumber = fuzzyLicenseNumber;
            return this;
        }

        public ConditionBuilder fuzzyLicenseNumber (String ... fuzzyLicenseNumber){
            this.fuzzyLicenseNumber = solveNullList(fuzzyLicenseNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyLicenseNumber (List<String> rightFuzzyLicenseNumber){
            this.rightFuzzyLicenseNumber = rightFuzzyLicenseNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyLicenseNumber (String ... rightFuzzyLicenseNumber){
            this.rightFuzzyLicenseNumber = solveNullList(rightFuzzyLicenseNumber);
            return this;
        }

        public ConditionBuilder licenseNumberList(String ... licenseNumber){
            this.licenseNumberList = solveNullList(licenseNumber);
            return this;
        }

        public ConditionBuilder licenseNumberList(List<String> licenseNumber){
            this.licenseNumberList = licenseNumber;
            return this;
        }

        public ConditionBuilder fuzzyRemarks (List<String> fuzzyRemarks){
            this.fuzzyRemarks = fuzzyRemarks;
            return this;
        }

        public ConditionBuilder fuzzyRemarks (String ... fuzzyRemarks){
            this.fuzzyRemarks = solveNullList(fuzzyRemarks);
            return this;
        }

        public ConditionBuilder rightFuzzyRemarks (List<String> rightFuzzyRemarks){
            this.rightFuzzyRemarks = rightFuzzyRemarks;
            return this;
        }

        public ConditionBuilder rightFuzzyRemarks (String ... rightFuzzyRemarks){
            this.rightFuzzyRemarks = solveNullList(rightFuzzyRemarks);
            return this;
        }

        public ConditionBuilder remarksList(String ... remarks){
            this.remarksList = solveNullList(remarks);
            return this;
        }

        public ConditionBuilder remarksList(List<String> remarks){
            this.remarksList = remarks;
            return this;
        }

        public ConditionBuilder fuzzySourceCardNumber (List<String> fuzzySourceCardNumber){
            this.fuzzySourceCardNumber = fuzzySourceCardNumber;
            return this;
        }

        public ConditionBuilder fuzzySourceCardNumber (String ... fuzzySourceCardNumber){
            this.fuzzySourceCardNumber = solveNullList(fuzzySourceCardNumber);
            return this;
        }

        public ConditionBuilder rightFuzzySourceCardNumber (List<String> rightFuzzySourceCardNumber){
            this.rightFuzzySourceCardNumber = rightFuzzySourceCardNumber;
            return this;
        }

        public ConditionBuilder rightFuzzySourceCardNumber (String ... rightFuzzySourceCardNumber){
            this.rightFuzzySourceCardNumber = solveNullList(rightFuzzySourceCardNumber);
            return this;
        }

        public ConditionBuilder sourceCardNumberList(String ... sourceCardNumber){
            this.sourceCardNumberList = solveNullList(sourceCardNumber);
            return this;
        }

        public ConditionBuilder sourceCardNumberList(List<String> sourceCardNumber){
            this.sourceCardNumberList = sourceCardNumber;
            return this;
        }

        public ConditionBuilder updateDateBetWeen(java.time.LocalDateTime updateDateSt,java.time.LocalDateTime updateDateEd){
            this.updateDateSt = updateDateSt;
            this.updateDateEd = updateDateEd;
            return this;
        }

        public ConditionBuilder updateDateGreaterEqThan(java.time.LocalDateTime updateDateSt){
            this.updateDateSt = updateDateSt;
            return this;
        }
        public ConditionBuilder updateDateLessEqThan(java.time.LocalDateTime updateDateEd){
            this.updateDateEd = updateDateEd;
            return this;
        }


        public ConditionBuilder updateDateList(java.time.LocalDateTime ... updateDate){
            this.updateDateList = solveNullList(updateDate);
            return this;
        }

        public ConditionBuilder updateDateList(List<java.time.LocalDateTime> updateDate){
            this.updateDateList = updateDate;
            return this;
        }

        public ConditionBuilder fuzzyUpdateBy (List<String> fuzzyUpdateBy){
            this.fuzzyUpdateBy = fuzzyUpdateBy;
            return this;
        }

        public ConditionBuilder fuzzyUpdateBy (String ... fuzzyUpdateBy){
            this.fuzzyUpdateBy = solveNullList(fuzzyUpdateBy);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateBy (List<String> rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = rightFuzzyUpdateBy;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateBy (String ... rightFuzzyUpdateBy){
            this.rightFuzzyUpdateBy = solveNullList(rightFuzzyUpdateBy);
            return this;
        }

        public ConditionBuilder updateByList(String ... updateBy){
            this.updateByList = solveNullList(updateBy);
            return this;
        }

        public ConditionBuilder updateByList(List<String> updateBy){
            this.updateByList = updateBy;
            return this;
        }

        public ConditionBuilder createDateBetWeen(java.time.LocalDateTime createDateSt,java.time.LocalDateTime createDateEd){
            this.createDateSt = createDateSt;
            this.createDateEd = createDateEd;
            return this;
        }

        public ConditionBuilder createDateGreaterEqThan(java.time.LocalDateTime createDateSt){
            this.createDateSt = createDateSt;
            return this;
        }
        public ConditionBuilder createDateLessEqThan(java.time.LocalDateTime createDateEd){
            this.createDateEd = createDateEd;
            return this;
        }


        public ConditionBuilder createDateList(java.time.LocalDateTime ... createDate){
            this.createDateList = solveNullList(createDate);
            return this;
        }

        public ConditionBuilder createDateList(List<java.time.LocalDateTime> createDate){
            this.createDateList = createDate;
            return this;
        }

        public ConditionBuilder wealthBetWeen(java.math.BigDecimal wealthSt,java.math.BigDecimal wealthEd){
            this.wealthSt = wealthSt;
            this.wealthEd = wealthEd;
            return this;
        }

        public ConditionBuilder wealthGreaterEqThan(java.math.BigDecimal wealthSt){
            this.wealthSt = wealthSt;
            return this;
        }
        public ConditionBuilder wealthLessEqThan(java.math.BigDecimal wealthEd){
            this.wealthEd = wealthEd;
            return this;
        }


        public ConditionBuilder wealthList(java.math.BigDecimal ... wealth){
            this.wealthList = solveNullList(wealth);
            return this;
        }

        public ConditionBuilder wealthList(List<java.math.BigDecimal> wealth){
            this.wealthList = wealth;
            return this;
        }

        public ConditionBuilder jobStatusBetWeen(Integer jobStatusSt,Integer jobStatusEd){
            this.jobStatusSt = jobStatusSt;
            this.jobStatusEd = jobStatusEd;
            return this;
        }

        public ConditionBuilder jobStatusGreaterEqThan(Integer jobStatusSt){
            this.jobStatusSt = jobStatusSt;
            return this;
        }
        public ConditionBuilder jobStatusLessEqThan(Integer jobStatusEd){
            this.jobStatusEd = jobStatusEd;
            return this;
        }


        public ConditionBuilder jobStatusList(Integer ... jobStatus){
            this.jobStatusList = solveNullList(jobStatus);
            return this;
        }

        public ConditionBuilder jobStatusList(List<Integer> jobStatus){
            this.jobStatusList = jobStatus;
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

        private AdUser obj;

        public Builder(){
            this.obj = new AdUser();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder groupNum(Long groupNum){
            this.obj.setGroupNum(groupNum);
            return this;
        }
        public Builder cardRange(Integer cardRange){
            this.obj.setCardRange(cardRange);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder sex(String sex){
            this.obj.setSex(sex);
            return this;
        }
        public Builder telephone(String telephone){
            this.obj.setTelephone(telephone);
            return this;
        }
        public Builder mailbox(String mailbox){
            this.obj.setMailbox(mailbox);
            return this;
        }
        public Builder identityCard(String identityCard){
            this.obj.setIdentityCard(identityCard);
            return this;
        }
        public Builder cardNumber(String cardNumber){
            this.obj.setCardNumber(cardNumber);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder payPassword(String payPassword){
            this.obj.setPayPassword(payPassword);
            return this;
        }
        public Builder integral(java.math.BigDecimal integral){
            this.obj.setIntegral(integral);
            return this;
        }
        public Builder startIntegral(java.math.BigDecimal startIntegral){
            this.obj.setStartIntegral(startIntegral);
            return this;
        }
        public Builder expectIntegral(java.math.BigDecimal expectIntegral){
            this.obj.setExpectIntegral(expectIntegral);
            return this;
        }
        public Builder lineCredit(java.math.BigDecimal lineCredit){
            this.obj.setLineCredit(lineCredit);
            return this;
        }
        public Builder activeDate(java.time.LocalDateTime activeDate){
            this.obj.setActiveDate(activeDate);
            return this;
        }
        public Builder isActive(String isActive){
            this.obj.setIsActive(isActive);
            return this;
        }
        public Builder lastIsActive(String lastIsActive){
            this.obj.setLastIsActive(lastIsActive);
            return this;
        }
        public Builder isPayPassword(String isPayPassword){
            this.obj.setIsPayPassword(isPayPassword);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder dataSyn(String dataSyn){
            this.obj.setDataSyn(dataSyn);
            return this;
        }
        public Builder createBy(String createBy){
            this.obj.setCreateBy(createBy);
            return this;
        }
        public Builder delFlag(String delFlag){
            this.obj.setDelFlag(delFlag);
            return this;
        }
        public Builder state(Integer state){
            this.obj.setState(state);
            return this;
        }
        public Builder licenseNumber(String licenseNumber){
            this.obj.setLicenseNumber(licenseNumber);
            return this;
        }
        public Builder remarks(String remarks){
            this.obj.setRemarks(remarks);
            return this;
        }
        public Builder sourceCardNumber(String sourceCardNumber){
            this.obj.setSourceCardNumber(sourceCardNumber);
            return this;
        }
        public Builder updateDate(java.time.LocalDateTime updateDate){
            this.obj.setUpdateDate(updateDate);
            return this;
        }
        public Builder updateBy(String updateBy){
            this.obj.setUpdateBy(updateBy);
            return this;
        }
        public Builder createDate(java.time.LocalDateTime createDate){
            this.obj.setCreateDate(createDate);
            return this;
        }
        public Builder wealth(java.math.BigDecimal wealth){
            this.obj.setWealth(wealth);
            return this;
        }
        public Builder jobStatus(Integer jobStatus){
            this.obj.setJobStatus(jobStatus);
            return this;
        }
        public AdUser build(){return obj;}
    }

}
