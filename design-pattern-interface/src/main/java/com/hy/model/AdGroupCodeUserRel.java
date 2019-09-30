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
public class AdGroupCodeUserRel implements Serializable {

    private static final long serialVersionUID = 1569833984565L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * ad_group_code_rel的id
    * isNullAble:0,defaultVal:0
    */
    private Integer groupCodeId;

    /**
    * 用户id
    * isNullAble:0,defaultVal:0
    */
    private Integer userId;

    /**
    * 备注
    * isNullAble:1
    */
    private String remark;

    /**
    * 绑定时间
    * isNullAble:1
    */
    private java.time.LocalDateTime bindTime;

    /**
    * 是否删除(0,正常,1,删除)
    * isNullAble:1,defaultVal:0
    */
    private Integer delFlag;

    /**
    * 创建时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createDate;

    /**
    * 更新时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime updateDate;

    /**
    * 创建人
    * isNullAble:1
    */
    private String createBy;

    /**
    * 修改人
    * isNullAble:1
    */
    private String updateBy;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setGroupCodeId(Integer groupCodeId){this.groupCodeId = groupCodeId;}

    public Integer getGroupCodeId(){return this.groupCodeId;}

    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setBindTime(java.time.LocalDateTime bindTime){this.bindTime = bindTime;}

    public java.time.LocalDateTime getBindTime(){return this.bindTime;}

    public void setDelFlag(Integer delFlag){this.delFlag = delFlag;}

    public Integer getDelFlag(){return this.delFlag;}

    public void setCreateDate(java.time.LocalDateTime createDate){this.createDate = createDate;}

    public java.time.LocalDateTime getCreateDate(){return this.createDate;}

    public void setUpdateDate(java.time.LocalDateTime updateDate){this.updateDate = updateDate;}

    public java.time.LocalDateTime getUpdateDate(){return this.updateDate;}

    public void setCreateBy(String createBy){this.createBy = createBy;}

    public String getCreateBy(){return this.createBy;}

    public void setUpdateBy(String updateBy){this.updateBy = updateBy;}

    public String getUpdateBy(){return this.updateBy;}
    @Override
    public String toString() {
        return "AdGroupCodeUserRel{" +
                "id='" + id + '\'' +
                "groupCodeId='" + groupCodeId + '\'' +
                "userId='" + userId + '\'' +
                "remark='" + remark + '\'' +
                "bindTime='" + bindTime + '\'' +
                "delFlag='" + delFlag + '\'' +
                "createDate='" + createDate + '\'' +
                "updateDate='" + updateDate + '\'' +
                "createBy='" + createBy + '\'' +
                "updateBy='" + updateBy + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private AdGroupCodeUserRel set;

        private ConditionBuilder where;

        public UpdateBuilder set(AdGroupCodeUserRel set){
            this.set = set;
            return this;
        }

        public AdGroupCodeUserRel getSet(){
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

    public static class QueryBuilder extends AdGroupCodeUserRel{
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

        private List<Integer> groupCodeIdList;

        public List<Integer> getGroupCodeIdList(){return this.groupCodeIdList;}

        private Integer groupCodeIdSt;

        private Integer groupCodeIdEd;

        public Integer getGroupCodeIdSt(){return this.groupCodeIdSt;}

        public Integer getGroupCodeIdEd(){return this.groupCodeIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<java.time.LocalDateTime> bindTimeList;

        public List<java.time.LocalDateTime> getBindTimeList(){return this.bindTimeList;}

        private java.time.LocalDateTime bindTimeSt;

        private java.time.LocalDateTime bindTimeEd;

        public java.time.LocalDateTime getBindTimeSt(){return this.bindTimeSt;}

        public java.time.LocalDateTime getBindTimeEd(){return this.bindTimeEd;}

        private List<Integer> delFlagList;

        public List<Integer> getDelFlagList(){return this.delFlagList;}

        private Integer delFlagSt;

        private Integer delFlagEd;

        public Integer getDelFlagSt(){return this.delFlagSt;}

        public Integer getDelFlagEd(){return this.delFlagEd;}

        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}
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

        public QueryBuilder groupCodeIdBetWeen(Integer groupCodeIdSt,Integer groupCodeIdEd){
            this.groupCodeIdSt = groupCodeIdSt;
            this.groupCodeIdEd = groupCodeIdEd;
            return this;
        }

        public QueryBuilder groupCodeIdGreaterEqThan(Integer groupCodeIdSt){
            this.groupCodeIdSt = groupCodeIdSt;
            return this;
        }
        public QueryBuilder groupCodeIdLessEqThan(Integer groupCodeIdEd){
            this.groupCodeIdEd = groupCodeIdEd;
            return this;
        }


        public QueryBuilder groupCodeId(Integer groupCodeId){
            setGroupCodeId(groupCodeId);
            return this;
        }

        public QueryBuilder groupCodeIdList(Integer ... groupCodeId){
            this.groupCodeIdList = solveNullList(groupCodeId);
            return this;
        }

        public QueryBuilder groupCodeIdList(List<Integer> groupCodeId){
            this.groupCodeIdList = groupCodeId;
            return this;
        }

        public QueryBuilder fetchGroupCodeId(){
            setFetchFields("fetchFields","groupCodeId");
            return this;
        }

        public QueryBuilder excludeGroupCodeId(){
            setFetchFields("excludeFields","groupCodeId");
            return this;
        }

        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
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

        public QueryBuilder bindTimeBetWeen(java.time.LocalDateTime bindTimeSt,java.time.LocalDateTime bindTimeEd){
            this.bindTimeSt = bindTimeSt;
            this.bindTimeEd = bindTimeEd;
            return this;
        }

        public QueryBuilder bindTimeGreaterEqThan(java.time.LocalDateTime bindTimeSt){
            this.bindTimeSt = bindTimeSt;
            return this;
        }
        public QueryBuilder bindTimeLessEqThan(java.time.LocalDateTime bindTimeEd){
            this.bindTimeEd = bindTimeEd;
            return this;
        }


        public QueryBuilder bindTime(java.time.LocalDateTime bindTime){
            setBindTime(bindTime);
            return this;
        }

        public QueryBuilder bindTimeList(java.time.LocalDateTime ... bindTime){
            this.bindTimeList = solveNullList(bindTime);
            return this;
        }

        public QueryBuilder bindTimeList(List<java.time.LocalDateTime> bindTime){
            this.bindTimeList = bindTime;
            return this;
        }

        public QueryBuilder fetchBindTime(){
            setFetchFields("fetchFields","bindTime");
            return this;
        }

        public QueryBuilder excludeBindTime(){
            setFetchFields("excludeFields","bindTime");
            return this;
        }

        public QueryBuilder delFlagBetWeen(Integer delFlagSt,Integer delFlagEd){
            this.delFlagSt = delFlagSt;
            this.delFlagEd = delFlagEd;
            return this;
        }

        public QueryBuilder delFlagGreaterEqThan(Integer delFlagSt){
            this.delFlagSt = delFlagSt;
            return this;
        }
        public QueryBuilder delFlagLessEqThan(Integer delFlagEd){
            this.delFlagEd = delFlagEd;
            return this;
        }


        public QueryBuilder delFlag(Integer delFlag){
            setDelFlag(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(Integer ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public QueryBuilder delFlagList(List<Integer> delFlag){
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

        public AdGroupCodeUserRel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> groupCodeIdList;

        public List<Integer> getGroupCodeIdList(){return this.groupCodeIdList;}

        private Integer groupCodeIdSt;

        private Integer groupCodeIdEd;

        public Integer getGroupCodeIdSt(){return this.groupCodeIdSt;}

        public Integer getGroupCodeIdEd(){return this.groupCodeIdEd;}

        private List<Integer> userIdList;

        public List<Integer> getUserIdList(){return this.userIdList;}

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){return this.userIdSt;}

        public Integer getUserIdEd(){return this.userIdEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<java.time.LocalDateTime> bindTimeList;

        public List<java.time.LocalDateTime> getBindTimeList(){return this.bindTimeList;}

        private java.time.LocalDateTime bindTimeSt;

        private java.time.LocalDateTime bindTimeEd;

        public java.time.LocalDateTime getBindTimeSt(){return this.bindTimeSt;}

        public java.time.LocalDateTime getBindTimeEd(){return this.bindTimeEd;}

        private List<Integer> delFlagList;

        public List<Integer> getDelFlagList(){return this.delFlagList;}

        private Integer delFlagSt;

        private Integer delFlagEd;

        public Integer getDelFlagSt(){return this.delFlagSt;}

        public Integer getDelFlagEd(){return this.delFlagEd;}

        private List<java.time.LocalDateTime> createDateList;

        public List<java.time.LocalDateTime> getCreateDateList(){return this.createDateList;}

        private java.time.LocalDateTime createDateSt;

        private java.time.LocalDateTime createDateEd;

        public java.time.LocalDateTime getCreateDateSt(){return this.createDateSt;}

        public java.time.LocalDateTime getCreateDateEd(){return this.createDateEd;}

        private List<java.time.LocalDateTime> updateDateList;

        public List<java.time.LocalDateTime> getUpdateDateList(){return this.updateDateList;}

        private java.time.LocalDateTime updateDateSt;

        private java.time.LocalDateTime updateDateEd;

        public java.time.LocalDateTime getUpdateDateSt(){return this.updateDateSt;}

        public java.time.LocalDateTime getUpdateDateEd(){return this.updateDateEd;}

        private List<String> createByList;

        public List<String> getCreateByList(){return this.createByList;}


        private List<String> fuzzyCreateBy;

        public List<String> getFuzzyCreateBy(){return this.fuzzyCreateBy;}

        private List<String> rightFuzzyCreateBy;

        public List<String> getRightFuzzyCreateBy(){return this.rightFuzzyCreateBy;}
        private List<String> updateByList;

        public List<String> getUpdateByList(){return this.updateByList;}


        private List<String> fuzzyUpdateBy;

        public List<String> getFuzzyUpdateBy(){return this.fuzzyUpdateBy;}

        private List<String> rightFuzzyUpdateBy;

        public List<String> getRightFuzzyUpdateBy(){return this.rightFuzzyUpdateBy;}

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

        public ConditionBuilder groupCodeIdBetWeen(Integer groupCodeIdSt,Integer groupCodeIdEd){
            this.groupCodeIdSt = groupCodeIdSt;
            this.groupCodeIdEd = groupCodeIdEd;
            return this;
        }

        public ConditionBuilder groupCodeIdGreaterEqThan(Integer groupCodeIdSt){
            this.groupCodeIdSt = groupCodeIdSt;
            return this;
        }
        public ConditionBuilder groupCodeIdLessEqThan(Integer groupCodeIdEd){
            this.groupCodeIdEd = groupCodeIdEd;
            return this;
        }


        public ConditionBuilder groupCodeIdList(Integer ... groupCodeId){
            this.groupCodeIdList = solveNullList(groupCodeId);
            return this;
        }

        public ConditionBuilder groupCodeIdList(List<Integer> groupCodeId){
            this.groupCodeIdList = groupCodeId;
            return this;
        }

        public ConditionBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Integer ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
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

        public ConditionBuilder bindTimeBetWeen(java.time.LocalDateTime bindTimeSt,java.time.LocalDateTime bindTimeEd){
            this.bindTimeSt = bindTimeSt;
            this.bindTimeEd = bindTimeEd;
            return this;
        }

        public ConditionBuilder bindTimeGreaterEqThan(java.time.LocalDateTime bindTimeSt){
            this.bindTimeSt = bindTimeSt;
            return this;
        }
        public ConditionBuilder bindTimeLessEqThan(java.time.LocalDateTime bindTimeEd){
            this.bindTimeEd = bindTimeEd;
            return this;
        }


        public ConditionBuilder bindTimeList(java.time.LocalDateTime ... bindTime){
            this.bindTimeList = solveNullList(bindTime);
            return this;
        }

        public ConditionBuilder bindTimeList(List<java.time.LocalDateTime> bindTime){
            this.bindTimeList = bindTime;
            return this;
        }

        public ConditionBuilder delFlagBetWeen(Integer delFlagSt,Integer delFlagEd){
            this.delFlagSt = delFlagSt;
            this.delFlagEd = delFlagEd;
            return this;
        }

        public ConditionBuilder delFlagGreaterEqThan(Integer delFlagSt){
            this.delFlagSt = delFlagSt;
            return this;
        }
        public ConditionBuilder delFlagLessEqThan(Integer delFlagEd){
            this.delFlagEd = delFlagEd;
            return this;
        }


        public ConditionBuilder delFlagList(Integer ... delFlag){
            this.delFlagList = solveNullList(delFlag);
            return this;
        }

        public ConditionBuilder delFlagList(List<Integer> delFlag){
            this.delFlagList = delFlag;
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

        private AdGroupCodeUserRel obj;

        public Builder(){
            this.obj = new AdGroupCodeUserRel();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder groupCodeId(Integer groupCodeId){
            this.obj.setGroupCodeId(groupCodeId);
            return this;
        }
        public Builder userId(Integer userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder bindTime(java.time.LocalDateTime bindTime){
            this.obj.setBindTime(bindTime);
            return this;
        }
        public Builder delFlag(Integer delFlag){
            this.obj.setDelFlag(delFlag);
            return this;
        }
        public Builder createDate(java.time.LocalDateTime createDate){
            this.obj.setCreateDate(createDate);
            return this;
        }
        public Builder updateDate(java.time.LocalDateTime updateDate){
            this.obj.setUpdateDate(updateDate);
            return this;
        }
        public Builder createBy(String createBy){
            this.obj.setCreateBy(createBy);
            return this;
        }
        public Builder updateBy(String updateBy){
            this.obj.setUpdateBy(updateBy);
            return this;
        }
        public AdGroupCodeUserRel build(){return obj;}
    }

}
