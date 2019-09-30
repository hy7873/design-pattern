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
public class AdGroupDirIntegral implements Serializable {

    private static final long serialVersionUID = 1569834223749L;


    /**
    * 主键
    * 主键ID
    * isNullAble:0
    */
    private Long id;

    /**
    * 企业ID(0:  兜礼系统)
    * isNullAble:0
    */
    private Long adGroupId;

    /**
    * 企业名称
    * isNullAble:0
    */
    private String groupName;

    /**
    * 积分名称
    * isNullAble:0
    */
    private String integralName;

    /**
    * 备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 批次号
    * isNullAble:0,defaultVal:0
    */
    private String batchNo;

    /**
    * 开始有效时间
    * isNullAble:0
    */
    private java.time.LocalDateTime beginDate;

    /**
    * 结束有效时间
    * isNullAble:0
    */
    private java.time.LocalDateTime endDate;

    /**
    * 总积分
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal dirIntegral;

    /**
    * 未分配积分
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal availIntegral;

    /**
    * 充值类型 1预充值 2授信
    * isNullAble:0,defaultVal:1
    */
    private Integer rechargeType;

    /**
    * 积分类型, 0:(默认)定向积分, 1: 通用积分
    * isNullAble:0,defaultVal:0
    */
    private Integer type;

    /**
    * 默认0：未过期，1: 过期, 2:已回收
    * isNullAble:0,defaultVal:0
    */
    private Integer status;

    /**
    * 创建者
    * isNullAble:0
    */
    private String createBy;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createDate;

    /**
    * 更新者
    * isNullAble:0
    */
    private String updateBy;

    /**
    * 更新时间
    * isNullAble:0
    */
    private java.time.LocalDateTime updateDate;

    /**
    * 删除标记 0：正常，1：删除
    * isNullAble:0,defaultVal:0
    */
    private String delFlag;

    /**
    * 扣除优先级：消费通用积分时，值大的优先扣
    * isNullAble:1,defaultVal:0
    */
    private Integer takeOutPriority;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setAdGroupId(Long adGroupId){this.adGroupId = adGroupId;}

    public Long getAdGroupId(){return this.adGroupId;}

    public void setGroupName(String groupName){this.groupName = groupName;}

    public String getGroupName(){return this.groupName;}

    public void setIntegralName(String integralName){this.integralName = integralName;}

    public String getIntegralName(){return this.integralName;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setBatchNo(String batchNo){this.batchNo = batchNo;}

    public String getBatchNo(){return this.batchNo;}

    public void setBeginDate(java.time.LocalDateTime beginDate){this.beginDate = beginDate;}

    public java.time.LocalDateTime getBeginDate(){return this.beginDate;}

    public void setEndDate(java.time.LocalDateTime endDate){this.endDate = endDate;}

    public java.time.LocalDateTime getEndDate(){return this.endDate;}

    public void setDirIntegral(java.math.BigDecimal dirIntegral){this.dirIntegral = dirIntegral;}

    public java.math.BigDecimal getDirIntegral(){return this.dirIntegral;}

    public void setAvailIntegral(java.math.BigDecimal availIntegral){this.availIntegral = availIntegral;}

    public java.math.BigDecimal getAvailIntegral(){return this.availIntegral;}

    public void setRechargeType(Integer rechargeType){this.rechargeType = rechargeType;}

    public Integer getRechargeType(){return this.rechargeType;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setCreateBy(String createBy){this.createBy = createBy;}

    public String getCreateBy(){return this.createBy;}

    public void setCreateDate(java.time.LocalDateTime createDate){this.createDate = createDate;}

    public java.time.LocalDateTime getCreateDate(){return this.createDate;}

    public void setUpdateBy(String updateBy){this.updateBy = updateBy;}

    public String getUpdateBy(){return this.updateBy;}

    public void setUpdateDate(java.time.LocalDateTime updateDate){this.updateDate = updateDate;}

    public java.time.LocalDateTime getUpdateDate(){return this.updateDate;}

    public void setDelFlag(String delFlag){this.delFlag = delFlag;}

    public String getDelFlag(){return this.delFlag;}

    public void setTakeOutPriority(Integer takeOutPriority){this.takeOutPriority = takeOutPriority;}

    public Integer getTakeOutPriority(){return this.takeOutPriority;}
    @Override
    public String toString() {
        return "AdGroupDirIntegral{" +
                "id='" + id + '\'' +
                "adGroupId='" + adGroupId + '\'' +
                "groupName='" + groupName + '\'' +
                "integralName='" + integralName + '\'' +
                "remark='" + remark + '\'' +
                "batchNo='" + batchNo + '\'' +
                "beginDate='" + beginDate + '\'' +
                "endDate='" + endDate + '\'' +
                "dirIntegral='" + dirIntegral + '\'' +
                "availIntegral='" + availIntegral + '\'' +
                "rechargeType='" + rechargeType + '\'' +
                "type='" + type + '\'' +
                "status='" + status + '\'' +
                "createBy='" + createBy + '\'' +
                "createDate='" + createDate + '\'' +
                "updateBy='" + updateBy + '\'' +
                "updateDate='" + updateDate + '\'' +
                "delFlag='" + delFlag + '\'' +
                "takeOutPriority='" + takeOutPriority + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private AdGroupDirIntegral set;

        private ConditionBuilder where;

        public UpdateBuilder set(AdGroupDirIntegral set){
            this.set = set;
            return this;
        }

        public AdGroupDirIntegral getSet(){
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

    public static class QueryBuilder extends AdGroupDirIntegral{
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

        private List<Long> adGroupIdList;

        public List<Long> getAdGroupIdList(){return this.adGroupIdList;}

        private Long adGroupIdSt;

        private Long adGroupIdEd;

        public Long getAdGroupIdSt(){return this.adGroupIdSt;}

        public Long getAdGroupIdEd(){return this.adGroupIdEd;}

        private List<String> groupNameList;

        public List<String> getGroupNameList(){return this.groupNameList;}


        private List<String> fuzzyGroupName;

        public List<String> getFuzzyGroupName(){return this.fuzzyGroupName;}

        private List<String> rightFuzzyGroupName;

        public List<String> getRightFuzzyGroupName(){return this.rightFuzzyGroupName;}
        private List<String> integralNameList;

        public List<String> getIntegralNameList(){return this.integralNameList;}


        private List<String> fuzzyIntegralName;

        public List<String> getFuzzyIntegralName(){return this.fuzzyIntegralName;}

        private List<String> rightFuzzyIntegralName;

        public List<String> getRightFuzzyIntegralName(){return this.rightFuzzyIntegralName;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> batchNoList;

        public List<String> getBatchNoList(){return this.batchNoList;}


        private List<String> fuzzyBatchNo;

        public List<String> getFuzzyBatchNo(){return this.fuzzyBatchNo;}

        private List<String> rightFuzzyBatchNo;

        public List<String> getRightFuzzyBatchNo(){return this.rightFuzzyBatchNo;}
        private List<java.time.LocalDateTime> beginDateList;

        public List<java.time.LocalDateTime> getBeginDateList(){return this.beginDateList;}

        private java.time.LocalDateTime beginDateSt;

        private java.time.LocalDateTime beginDateEd;

        public java.time.LocalDateTime getBeginDateSt(){return this.beginDateSt;}

        public java.time.LocalDateTime getBeginDateEd(){return this.beginDateEd;}

        private List<java.time.LocalDateTime> endDateList;

        public List<java.time.LocalDateTime> getEndDateList(){return this.endDateList;}

        private java.time.LocalDateTime endDateSt;

        private java.time.LocalDateTime endDateEd;

        public java.time.LocalDateTime getEndDateSt(){return this.endDateSt;}

        public java.time.LocalDateTime getEndDateEd(){return this.endDateEd;}

        private List<java.math.BigDecimal> dirIntegralList;

        public List<java.math.BigDecimal> getDirIntegralList(){return this.dirIntegralList;}

        private java.math.BigDecimal dirIntegralSt;

        private java.math.BigDecimal dirIntegralEd;

        public java.math.BigDecimal getDirIntegralSt(){return this.dirIntegralSt;}

        public java.math.BigDecimal getDirIntegralEd(){return this.dirIntegralEd;}

        private List<java.math.BigDecimal> availIntegralList;

        public List<java.math.BigDecimal> getAvailIntegralList(){return this.availIntegralList;}

        private java.math.BigDecimal availIntegralSt;

        private java.math.BigDecimal availIntegralEd;

        public java.math.BigDecimal getAvailIntegralSt(){return this.availIntegralSt;}

        public java.math.BigDecimal getAvailIntegralEd(){return this.availIntegralEd;}

        private List<Integer> rechargeTypeList;

        public List<Integer> getRechargeTypeList(){return this.rechargeTypeList;}

        private Integer rechargeTypeSt;

        private Integer rechargeTypeEd;

        public Integer getRechargeTypeSt(){return this.rechargeTypeSt;}

        public Integer getRechargeTypeEd(){return this.rechargeTypeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> delFlagList;

        public List<String> getDelFlagList(){return this.delFlagList;}


        private List<String> fuzzyDelFlag;

        public List<String> getFuzzyDelFlag(){return this.fuzzyDelFlag;}

        private List<String> rightFuzzyDelFlag;

        public List<String> getRightFuzzyDelFlag(){return this.rightFuzzyDelFlag;}
        private List<Integer> takeOutPriorityList;

        public List<Integer> getTakeOutPriorityList(){return this.takeOutPriorityList;}

        private Integer takeOutPrioritySt;

        private Integer takeOutPriorityEd;

        public Integer getTakeOutPrioritySt(){return this.takeOutPrioritySt;}

        public Integer getTakeOutPriorityEd(){return this.takeOutPriorityEd;}

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

        public QueryBuilder adGroupIdBetWeen(Long adGroupIdSt,Long adGroupIdEd){
            this.adGroupIdSt = adGroupIdSt;
            this.adGroupIdEd = adGroupIdEd;
            return this;
        }

        public QueryBuilder adGroupIdGreaterEqThan(Long adGroupIdSt){
            this.adGroupIdSt = adGroupIdSt;
            return this;
        }
        public QueryBuilder adGroupIdLessEqThan(Long adGroupIdEd){
            this.adGroupIdEd = adGroupIdEd;
            return this;
        }


        public QueryBuilder adGroupId(Long adGroupId){
            setAdGroupId(adGroupId);
            return this;
        }

        public QueryBuilder adGroupIdList(Long ... adGroupId){
            this.adGroupIdList = solveNullList(adGroupId);
            return this;
        }

        public QueryBuilder adGroupIdList(List<Long> adGroupId){
            this.adGroupIdList = adGroupId;
            return this;
        }

        public QueryBuilder fetchAdGroupId(){
            setFetchFields("fetchFields","adGroupId");
            return this;
        }

        public QueryBuilder excludeAdGroupId(){
            setFetchFields("excludeFields","adGroupId");
            return this;
        }

        public QueryBuilder fuzzyGroupName (List<String> fuzzyGroupName){
            this.fuzzyGroupName = fuzzyGroupName;
            return this;
        }

        public QueryBuilder fuzzyGroupName (String ... fuzzyGroupName){
            this.fuzzyGroupName = solveNullList(fuzzyGroupName);
            return this;
        }

        public QueryBuilder rightFuzzyGroupName (List<String> rightFuzzyGroupName){
            this.rightFuzzyGroupName = rightFuzzyGroupName;
            return this;
        }

        public QueryBuilder rightFuzzyGroupName (String ... rightFuzzyGroupName){
            this.rightFuzzyGroupName = solveNullList(rightFuzzyGroupName);
            return this;
        }

        public QueryBuilder groupName(String groupName){
            setGroupName(groupName);
            return this;
        }

        public QueryBuilder groupNameList(String ... groupName){
            this.groupNameList = solveNullList(groupName);
            return this;
        }

        public QueryBuilder groupNameList(List<String> groupName){
            this.groupNameList = groupName;
            return this;
        }

        public QueryBuilder fetchGroupName(){
            setFetchFields("fetchFields","groupName");
            return this;
        }

        public QueryBuilder excludeGroupName(){
            setFetchFields("excludeFields","groupName");
            return this;
        }

        public QueryBuilder fuzzyIntegralName (List<String> fuzzyIntegralName){
            this.fuzzyIntegralName = fuzzyIntegralName;
            return this;
        }

        public QueryBuilder fuzzyIntegralName (String ... fuzzyIntegralName){
            this.fuzzyIntegralName = solveNullList(fuzzyIntegralName);
            return this;
        }

        public QueryBuilder rightFuzzyIntegralName (List<String> rightFuzzyIntegralName){
            this.rightFuzzyIntegralName = rightFuzzyIntegralName;
            return this;
        }

        public QueryBuilder rightFuzzyIntegralName (String ... rightFuzzyIntegralName){
            this.rightFuzzyIntegralName = solveNullList(rightFuzzyIntegralName);
            return this;
        }

        public QueryBuilder integralName(String integralName){
            setIntegralName(integralName);
            return this;
        }

        public QueryBuilder integralNameList(String ... integralName){
            this.integralNameList = solveNullList(integralName);
            return this;
        }

        public QueryBuilder integralNameList(List<String> integralName){
            this.integralNameList = integralName;
            return this;
        }

        public QueryBuilder fetchIntegralName(){
            setFetchFields("fetchFields","integralName");
            return this;
        }

        public QueryBuilder excludeIntegralName(){
            setFetchFields("excludeFields","integralName");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }

        public QueryBuilder fuzzyBatchNo (List<String> fuzzyBatchNo){
            this.fuzzyBatchNo = fuzzyBatchNo;
            return this;
        }

        public QueryBuilder fuzzyBatchNo (String ... fuzzyBatchNo){
            this.fuzzyBatchNo = solveNullList(fuzzyBatchNo);
            return this;
        }

        public QueryBuilder rightFuzzyBatchNo (List<String> rightFuzzyBatchNo){
            this.rightFuzzyBatchNo = rightFuzzyBatchNo;
            return this;
        }

        public QueryBuilder rightFuzzyBatchNo (String ... rightFuzzyBatchNo){
            this.rightFuzzyBatchNo = solveNullList(rightFuzzyBatchNo);
            return this;
        }

        public QueryBuilder batchNo(String batchNo){
            setBatchNo(batchNo);
            return this;
        }

        public QueryBuilder batchNoList(String ... batchNo){
            this.batchNoList = solveNullList(batchNo);
            return this;
        }

        public QueryBuilder batchNoList(List<String> batchNo){
            this.batchNoList = batchNo;
            return this;
        }

        public QueryBuilder fetchBatchNo(){
            setFetchFields("fetchFields","batchNo");
            return this;
        }

        public QueryBuilder excludeBatchNo(){
            setFetchFields("excludeFields","batchNo");
            return this;
        }

        public QueryBuilder beginDateBetWeen(java.time.LocalDateTime beginDateSt,java.time.LocalDateTime beginDateEd){
            this.beginDateSt = beginDateSt;
            this.beginDateEd = beginDateEd;
            return this;
        }

        public QueryBuilder beginDateGreaterEqThan(java.time.LocalDateTime beginDateSt){
            this.beginDateSt = beginDateSt;
            return this;
        }
        public QueryBuilder beginDateLessEqThan(java.time.LocalDateTime beginDateEd){
            this.beginDateEd = beginDateEd;
            return this;
        }


        public QueryBuilder beginDate(java.time.LocalDateTime beginDate){
            setBeginDate(beginDate);
            return this;
        }

        public QueryBuilder beginDateList(java.time.LocalDateTime ... beginDate){
            this.beginDateList = solveNullList(beginDate);
            return this;
        }

        public QueryBuilder beginDateList(List<java.time.LocalDateTime> beginDate){
            this.beginDateList = beginDate;
            return this;
        }

        public QueryBuilder fetchBeginDate(){
            setFetchFields("fetchFields","beginDate");
            return this;
        }

        public QueryBuilder excludeBeginDate(){
            setFetchFields("excludeFields","beginDate");
            return this;
        }

        public QueryBuilder endDateBetWeen(java.time.LocalDateTime endDateSt,java.time.LocalDateTime endDateEd){
            this.endDateSt = endDateSt;
            this.endDateEd = endDateEd;
            return this;
        }

        public QueryBuilder endDateGreaterEqThan(java.time.LocalDateTime endDateSt){
            this.endDateSt = endDateSt;
            return this;
        }
        public QueryBuilder endDateLessEqThan(java.time.LocalDateTime endDateEd){
            this.endDateEd = endDateEd;
            return this;
        }


        public QueryBuilder endDate(java.time.LocalDateTime endDate){
            setEndDate(endDate);
            return this;
        }

        public QueryBuilder endDateList(java.time.LocalDateTime ... endDate){
            this.endDateList = solveNullList(endDate);
            return this;
        }

        public QueryBuilder endDateList(List<java.time.LocalDateTime> endDate){
            this.endDateList = endDate;
            return this;
        }

        public QueryBuilder fetchEndDate(){
            setFetchFields("fetchFields","endDate");
            return this;
        }

        public QueryBuilder excludeEndDate(){
            setFetchFields("excludeFields","endDate");
            return this;
        }

        public QueryBuilder dirIntegralBetWeen(java.math.BigDecimal dirIntegralSt,java.math.BigDecimal dirIntegralEd){
            this.dirIntegralSt = dirIntegralSt;
            this.dirIntegralEd = dirIntegralEd;
            return this;
        }

        public QueryBuilder dirIntegralGreaterEqThan(java.math.BigDecimal dirIntegralSt){
            this.dirIntegralSt = dirIntegralSt;
            return this;
        }
        public QueryBuilder dirIntegralLessEqThan(java.math.BigDecimal dirIntegralEd){
            this.dirIntegralEd = dirIntegralEd;
            return this;
        }


        public QueryBuilder dirIntegral(java.math.BigDecimal dirIntegral){
            setDirIntegral(dirIntegral);
            return this;
        }

        public QueryBuilder dirIntegralList(java.math.BigDecimal ... dirIntegral){
            this.dirIntegralList = solveNullList(dirIntegral);
            return this;
        }

        public QueryBuilder dirIntegralList(List<java.math.BigDecimal> dirIntegral){
            this.dirIntegralList = dirIntegral;
            return this;
        }

        public QueryBuilder fetchDirIntegral(){
            setFetchFields("fetchFields","dirIntegral");
            return this;
        }

        public QueryBuilder excludeDirIntegral(){
            setFetchFields("excludeFields","dirIntegral");
            return this;
        }

        public QueryBuilder availIntegralBetWeen(java.math.BigDecimal availIntegralSt,java.math.BigDecimal availIntegralEd){
            this.availIntegralSt = availIntegralSt;
            this.availIntegralEd = availIntegralEd;
            return this;
        }

        public QueryBuilder availIntegralGreaterEqThan(java.math.BigDecimal availIntegralSt){
            this.availIntegralSt = availIntegralSt;
            return this;
        }
        public QueryBuilder availIntegralLessEqThan(java.math.BigDecimal availIntegralEd){
            this.availIntegralEd = availIntegralEd;
            return this;
        }


        public QueryBuilder availIntegral(java.math.BigDecimal availIntegral){
            setAvailIntegral(availIntegral);
            return this;
        }

        public QueryBuilder availIntegralList(java.math.BigDecimal ... availIntegral){
            this.availIntegralList = solveNullList(availIntegral);
            return this;
        }

        public QueryBuilder availIntegralList(List<java.math.BigDecimal> availIntegral){
            this.availIntegralList = availIntegral;
            return this;
        }

        public QueryBuilder fetchAvailIntegral(){
            setFetchFields("fetchFields","availIntegral");
            return this;
        }

        public QueryBuilder excludeAvailIntegral(){
            setFetchFields("excludeFields","availIntegral");
            return this;
        }

        public QueryBuilder rechargeTypeBetWeen(Integer rechargeTypeSt,Integer rechargeTypeEd){
            this.rechargeTypeSt = rechargeTypeSt;
            this.rechargeTypeEd = rechargeTypeEd;
            return this;
        }

        public QueryBuilder rechargeTypeGreaterEqThan(Integer rechargeTypeSt){
            this.rechargeTypeSt = rechargeTypeSt;
            return this;
        }
        public QueryBuilder rechargeTypeLessEqThan(Integer rechargeTypeEd){
            this.rechargeTypeEd = rechargeTypeEd;
            return this;
        }


        public QueryBuilder rechargeType(Integer rechargeType){
            setRechargeType(rechargeType);
            return this;
        }

        public QueryBuilder rechargeTypeList(Integer ... rechargeType){
            this.rechargeTypeList = solveNullList(rechargeType);
            return this;
        }

        public QueryBuilder rechargeTypeList(List<Integer> rechargeType){
            this.rechargeTypeList = rechargeType;
            return this;
        }

        public QueryBuilder fetchRechargeType(){
            setFetchFields("fetchFields","rechargeType");
            return this;
        }

        public QueryBuilder excludeRechargeType(){
            setFetchFields("excludeFields","rechargeType");
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

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
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

        public QueryBuilder takeOutPriorityBetWeen(Integer takeOutPrioritySt,Integer takeOutPriorityEd){
            this.takeOutPrioritySt = takeOutPrioritySt;
            this.takeOutPriorityEd = takeOutPriorityEd;
            return this;
        }

        public QueryBuilder takeOutPriorityGreaterEqThan(Integer takeOutPrioritySt){
            this.takeOutPrioritySt = takeOutPrioritySt;
            return this;
        }
        public QueryBuilder takeOutPriorityLessEqThan(Integer takeOutPriorityEd){
            this.takeOutPriorityEd = takeOutPriorityEd;
            return this;
        }


        public QueryBuilder takeOutPriority(Integer takeOutPriority){
            setTakeOutPriority(takeOutPriority);
            return this;
        }

        public QueryBuilder takeOutPriorityList(Integer ... takeOutPriority){
            this.takeOutPriorityList = solveNullList(takeOutPriority);
            return this;
        }

        public QueryBuilder takeOutPriorityList(List<Integer> takeOutPriority){
            this.takeOutPriorityList = takeOutPriority;
            return this;
        }

        public QueryBuilder fetchTakeOutPriority(){
            setFetchFields("fetchFields","takeOutPriority");
            return this;
        }

        public QueryBuilder excludeTakeOutPriority(){
            setFetchFields("excludeFields","takeOutPriority");
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

        public AdGroupDirIntegral build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> adGroupIdList;

        public List<Long> getAdGroupIdList(){return this.adGroupIdList;}

        private Long adGroupIdSt;

        private Long adGroupIdEd;

        public Long getAdGroupIdSt(){return this.adGroupIdSt;}

        public Long getAdGroupIdEd(){return this.adGroupIdEd;}

        private List<String> groupNameList;

        public List<String> getGroupNameList(){return this.groupNameList;}


        private List<String> fuzzyGroupName;

        public List<String> getFuzzyGroupName(){return this.fuzzyGroupName;}

        private List<String> rightFuzzyGroupName;

        public List<String> getRightFuzzyGroupName(){return this.rightFuzzyGroupName;}
        private List<String> integralNameList;

        public List<String> getIntegralNameList(){return this.integralNameList;}


        private List<String> fuzzyIntegralName;

        public List<String> getFuzzyIntegralName(){return this.fuzzyIntegralName;}

        private List<String> rightFuzzyIntegralName;

        public List<String> getRightFuzzyIntegralName(){return this.rightFuzzyIntegralName;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> batchNoList;

        public List<String> getBatchNoList(){return this.batchNoList;}


        private List<String> fuzzyBatchNo;

        public List<String> getFuzzyBatchNo(){return this.fuzzyBatchNo;}

        private List<String> rightFuzzyBatchNo;

        public List<String> getRightFuzzyBatchNo(){return this.rightFuzzyBatchNo;}
        private List<java.time.LocalDateTime> beginDateList;

        public List<java.time.LocalDateTime> getBeginDateList(){return this.beginDateList;}

        private java.time.LocalDateTime beginDateSt;

        private java.time.LocalDateTime beginDateEd;

        public java.time.LocalDateTime getBeginDateSt(){return this.beginDateSt;}

        public java.time.LocalDateTime getBeginDateEd(){return this.beginDateEd;}

        private List<java.time.LocalDateTime> endDateList;

        public List<java.time.LocalDateTime> getEndDateList(){return this.endDateList;}

        private java.time.LocalDateTime endDateSt;

        private java.time.LocalDateTime endDateEd;

        public java.time.LocalDateTime getEndDateSt(){return this.endDateSt;}

        public java.time.LocalDateTime getEndDateEd(){return this.endDateEd;}

        private List<java.math.BigDecimal> dirIntegralList;

        public List<java.math.BigDecimal> getDirIntegralList(){return this.dirIntegralList;}

        private java.math.BigDecimal dirIntegralSt;

        private java.math.BigDecimal dirIntegralEd;

        public java.math.BigDecimal getDirIntegralSt(){return this.dirIntegralSt;}

        public java.math.BigDecimal getDirIntegralEd(){return this.dirIntegralEd;}

        private List<java.math.BigDecimal> availIntegralList;

        public List<java.math.BigDecimal> getAvailIntegralList(){return this.availIntegralList;}

        private java.math.BigDecimal availIntegralSt;

        private java.math.BigDecimal availIntegralEd;

        public java.math.BigDecimal getAvailIntegralSt(){return this.availIntegralSt;}

        public java.math.BigDecimal getAvailIntegralEd(){return this.availIntegralEd;}

        private List<Integer> rechargeTypeList;

        public List<Integer> getRechargeTypeList(){return this.rechargeTypeList;}

        private Integer rechargeTypeSt;

        private Integer rechargeTypeEd;

        public Integer getRechargeTypeSt(){return this.rechargeTypeSt;}

        public Integer getRechargeTypeEd(){return this.rechargeTypeEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> delFlagList;

        public List<String> getDelFlagList(){return this.delFlagList;}


        private List<String> fuzzyDelFlag;

        public List<String> getFuzzyDelFlag(){return this.fuzzyDelFlag;}

        private List<String> rightFuzzyDelFlag;

        public List<String> getRightFuzzyDelFlag(){return this.rightFuzzyDelFlag;}
        private List<Integer> takeOutPriorityList;

        public List<Integer> getTakeOutPriorityList(){return this.takeOutPriorityList;}

        private Integer takeOutPrioritySt;

        private Integer takeOutPriorityEd;

        public Integer getTakeOutPrioritySt(){return this.takeOutPrioritySt;}

        public Integer getTakeOutPriorityEd(){return this.takeOutPriorityEd;}


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

        public ConditionBuilder adGroupIdBetWeen(Long adGroupIdSt,Long adGroupIdEd){
            this.adGroupIdSt = adGroupIdSt;
            this.adGroupIdEd = adGroupIdEd;
            return this;
        }

        public ConditionBuilder adGroupIdGreaterEqThan(Long adGroupIdSt){
            this.adGroupIdSt = adGroupIdSt;
            return this;
        }
        public ConditionBuilder adGroupIdLessEqThan(Long adGroupIdEd){
            this.adGroupIdEd = adGroupIdEd;
            return this;
        }


        public ConditionBuilder adGroupIdList(Long ... adGroupId){
            this.adGroupIdList = solveNullList(adGroupId);
            return this;
        }

        public ConditionBuilder adGroupIdList(List<Long> adGroupId){
            this.adGroupIdList = adGroupId;
            return this;
        }

        public ConditionBuilder fuzzyGroupName (List<String> fuzzyGroupName){
            this.fuzzyGroupName = fuzzyGroupName;
            return this;
        }

        public ConditionBuilder fuzzyGroupName (String ... fuzzyGroupName){
            this.fuzzyGroupName = solveNullList(fuzzyGroupName);
            return this;
        }

        public ConditionBuilder rightFuzzyGroupName (List<String> rightFuzzyGroupName){
            this.rightFuzzyGroupName = rightFuzzyGroupName;
            return this;
        }

        public ConditionBuilder rightFuzzyGroupName (String ... rightFuzzyGroupName){
            this.rightFuzzyGroupName = solveNullList(rightFuzzyGroupName);
            return this;
        }

        public ConditionBuilder groupNameList(String ... groupName){
            this.groupNameList = solveNullList(groupName);
            return this;
        }

        public ConditionBuilder groupNameList(List<String> groupName){
            this.groupNameList = groupName;
            return this;
        }

        public ConditionBuilder fuzzyIntegralName (List<String> fuzzyIntegralName){
            this.fuzzyIntegralName = fuzzyIntegralName;
            return this;
        }

        public ConditionBuilder fuzzyIntegralName (String ... fuzzyIntegralName){
            this.fuzzyIntegralName = solveNullList(fuzzyIntegralName);
            return this;
        }

        public ConditionBuilder rightFuzzyIntegralName (List<String> rightFuzzyIntegralName){
            this.rightFuzzyIntegralName = rightFuzzyIntegralName;
            return this;
        }

        public ConditionBuilder rightFuzzyIntegralName (String ... rightFuzzyIntegralName){
            this.rightFuzzyIntegralName = solveNullList(rightFuzzyIntegralName);
            return this;
        }

        public ConditionBuilder integralNameList(String ... integralName){
            this.integralNameList = solveNullList(integralName);
            return this;
        }

        public ConditionBuilder integralNameList(List<String> integralName){
            this.integralNameList = integralName;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder fuzzyBatchNo (List<String> fuzzyBatchNo){
            this.fuzzyBatchNo = fuzzyBatchNo;
            return this;
        }

        public ConditionBuilder fuzzyBatchNo (String ... fuzzyBatchNo){
            this.fuzzyBatchNo = solveNullList(fuzzyBatchNo);
            return this;
        }

        public ConditionBuilder rightFuzzyBatchNo (List<String> rightFuzzyBatchNo){
            this.rightFuzzyBatchNo = rightFuzzyBatchNo;
            return this;
        }

        public ConditionBuilder rightFuzzyBatchNo (String ... rightFuzzyBatchNo){
            this.rightFuzzyBatchNo = solveNullList(rightFuzzyBatchNo);
            return this;
        }

        public ConditionBuilder batchNoList(String ... batchNo){
            this.batchNoList = solveNullList(batchNo);
            return this;
        }

        public ConditionBuilder batchNoList(List<String> batchNo){
            this.batchNoList = batchNo;
            return this;
        }

        public ConditionBuilder beginDateBetWeen(java.time.LocalDateTime beginDateSt,java.time.LocalDateTime beginDateEd){
            this.beginDateSt = beginDateSt;
            this.beginDateEd = beginDateEd;
            return this;
        }

        public ConditionBuilder beginDateGreaterEqThan(java.time.LocalDateTime beginDateSt){
            this.beginDateSt = beginDateSt;
            return this;
        }
        public ConditionBuilder beginDateLessEqThan(java.time.LocalDateTime beginDateEd){
            this.beginDateEd = beginDateEd;
            return this;
        }


        public ConditionBuilder beginDateList(java.time.LocalDateTime ... beginDate){
            this.beginDateList = solveNullList(beginDate);
            return this;
        }

        public ConditionBuilder beginDateList(List<java.time.LocalDateTime> beginDate){
            this.beginDateList = beginDate;
            return this;
        }

        public ConditionBuilder endDateBetWeen(java.time.LocalDateTime endDateSt,java.time.LocalDateTime endDateEd){
            this.endDateSt = endDateSt;
            this.endDateEd = endDateEd;
            return this;
        }

        public ConditionBuilder endDateGreaterEqThan(java.time.LocalDateTime endDateSt){
            this.endDateSt = endDateSt;
            return this;
        }
        public ConditionBuilder endDateLessEqThan(java.time.LocalDateTime endDateEd){
            this.endDateEd = endDateEd;
            return this;
        }


        public ConditionBuilder endDateList(java.time.LocalDateTime ... endDate){
            this.endDateList = solveNullList(endDate);
            return this;
        }

        public ConditionBuilder endDateList(List<java.time.LocalDateTime> endDate){
            this.endDateList = endDate;
            return this;
        }

        public ConditionBuilder dirIntegralBetWeen(java.math.BigDecimal dirIntegralSt,java.math.BigDecimal dirIntegralEd){
            this.dirIntegralSt = dirIntegralSt;
            this.dirIntegralEd = dirIntegralEd;
            return this;
        }

        public ConditionBuilder dirIntegralGreaterEqThan(java.math.BigDecimal dirIntegralSt){
            this.dirIntegralSt = dirIntegralSt;
            return this;
        }
        public ConditionBuilder dirIntegralLessEqThan(java.math.BigDecimal dirIntegralEd){
            this.dirIntegralEd = dirIntegralEd;
            return this;
        }


        public ConditionBuilder dirIntegralList(java.math.BigDecimal ... dirIntegral){
            this.dirIntegralList = solveNullList(dirIntegral);
            return this;
        }

        public ConditionBuilder dirIntegralList(List<java.math.BigDecimal> dirIntegral){
            this.dirIntegralList = dirIntegral;
            return this;
        }

        public ConditionBuilder availIntegralBetWeen(java.math.BigDecimal availIntegralSt,java.math.BigDecimal availIntegralEd){
            this.availIntegralSt = availIntegralSt;
            this.availIntegralEd = availIntegralEd;
            return this;
        }

        public ConditionBuilder availIntegralGreaterEqThan(java.math.BigDecimal availIntegralSt){
            this.availIntegralSt = availIntegralSt;
            return this;
        }
        public ConditionBuilder availIntegralLessEqThan(java.math.BigDecimal availIntegralEd){
            this.availIntegralEd = availIntegralEd;
            return this;
        }


        public ConditionBuilder availIntegralList(java.math.BigDecimal ... availIntegral){
            this.availIntegralList = solveNullList(availIntegral);
            return this;
        }

        public ConditionBuilder availIntegralList(List<java.math.BigDecimal> availIntegral){
            this.availIntegralList = availIntegral;
            return this;
        }

        public ConditionBuilder rechargeTypeBetWeen(Integer rechargeTypeSt,Integer rechargeTypeEd){
            this.rechargeTypeSt = rechargeTypeSt;
            this.rechargeTypeEd = rechargeTypeEd;
            return this;
        }

        public ConditionBuilder rechargeTypeGreaterEqThan(Integer rechargeTypeSt){
            this.rechargeTypeSt = rechargeTypeSt;
            return this;
        }
        public ConditionBuilder rechargeTypeLessEqThan(Integer rechargeTypeEd){
            this.rechargeTypeEd = rechargeTypeEd;
            return this;
        }


        public ConditionBuilder rechargeTypeList(Integer ... rechargeType){
            this.rechargeTypeList = solveNullList(rechargeType);
            return this;
        }

        public ConditionBuilder rechargeTypeList(List<Integer> rechargeType){
            this.rechargeTypeList = rechargeType;
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

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
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

        public ConditionBuilder takeOutPriorityBetWeen(Integer takeOutPrioritySt,Integer takeOutPriorityEd){
            this.takeOutPrioritySt = takeOutPrioritySt;
            this.takeOutPriorityEd = takeOutPriorityEd;
            return this;
        }

        public ConditionBuilder takeOutPriorityGreaterEqThan(Integer takeOutPrioritySt){
            this.takeOutPrioritySt = takeOutPrioritySt;
            return this;
        }
        public ConditionBuilder takeOutPriorityLessEqThan(Integer takeOutPriorityEd){
            this.takeOutPriorityEd = takeOutPriorityEd;
            return this;
        }


        public ConditionBuilder takeOutPriorityList(Integer ... takeOutPriority){
            this.takeOutPriorityList = solveNullList(takeOutPriority);
            return this;
        }

        public ConditionBuilder takeOutPriorityList(List<Integer> takeOutPriority){
            this.takeOutPriorityList = takeOutPriority;
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

        private AdGroupDirIntegral obj;

        public Builder(){
            this.obj = new AdGroupDirIntegral();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder adGroupId(Long adGroupId){
            this.obj.setAdGroupId(adGroupId);
            return this;
        }
        public Builder groupName(String groupName){
            this.obj.setGroupName(groupName);
            return this;
        }
        public Builder integralName(String integralName){
            this.obj.setIntegralName(integralName);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder batchNo(String batchNo){
            this.obj.setBatchNo(batchNo);
            return this;
        }
        public Builder beginDate(java.time.LocalDateTime beginDate){
            this.obj.setBeginDate(beginDate);
            return this;
        }
        public Builder endDate(java.time.LocalDateTime endDate){
            this.obj.setEndDate(endDate);
            return this;
        }
        public Builder dirIntegral(java.math.BigDecimal dirIntegral){
            this.obj.setDirIntegral(dirIntegral);
            return this;
        }
        public Builder availIntegral(java.math.BigDecimal availIntegral){
            this.obj.setAvailIntegral(availIntegral);
            return this;
        }
        public Builder rechargeType(Integer rechargeType){
            this.obj.setRechargeType(rechargeType);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder createBy(String createBy){
            this.obj.setCreateBy(createBy);
            return this;
        }
        public Builder createDate(java.time.LocalDateTime createDate){
            this.obj.setCreateDate(createDate);
            return this;
        }
        public Builder updateBy(String updateBy){
            this.obj.setUpdateBy(updateBy);
            return this;
        }
        public Builder updateDate(java.time.LocalDateTime updateDate){
            this.obj.setUpdateDate(updateDate);
            return this;
        }
        public Builder delFlag(String delFlag){
            this.obj.setDelFlag(delFlag);
            return this;
        }
        public Builder takeOutPriority(Integer takeOutPriority){
            this.obj.setTakeOutPriority(takeOutPriority);
            return this;
        }
        public AdGroupDirIntegral build(){return obj;}
    }

}
