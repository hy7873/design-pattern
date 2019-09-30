package com.hy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hy.model.AdGroupCodeRel;
/**
*  @author 
*/
public interface AdGroupCodeRelBaseMapper {

    int insertAdGroupCodeRel(AdGroupCodeRel object);

    int updateAdGroupCodeRel(AdGroupCodeRel object);

    int update(AdGroupCodeRel.UpdateBuilder object);

    List<AdGroupCodeRel> queryAdGroupCodeRel(AdGroupCodeRel object);

    AdGroupCodeRel queryAdGroupCodeRelLimit1(AdGroupCodeRel object);

}