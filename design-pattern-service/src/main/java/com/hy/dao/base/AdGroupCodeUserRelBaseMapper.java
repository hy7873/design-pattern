package com.hy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hy.model.AdGroupCodeUserRel;
/**
*  @author 
*/
public interface AdGroupCodeUserRelBaseMapper {

    int insertAdGroupCodeUserRel(AdGroupCodeUserRel object);

    int updateAdGroupCodeUserRel(AdGroupCodeUserRel object);

    int update(AdGroupCodeUserRel.UpdateBuilder object);

    List<AdGroupCodeUserRel> queryAdGroupCodeUserRel(AdGroupCodeUserRel object);

    AdGroupCodeUserRel queryAdGroupCodeUserRelLimit1(AdGroupCodeUserRel object);

}