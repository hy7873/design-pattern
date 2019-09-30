package com.hy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hy.model.AdGroupDirIntegral;
/**
*  @author 
*/
public interface AdGroupDirIntegralBaseMapper {

    int insertAdGroupDirIntegral(AdGroupDirIntegral object);

    int updateAdGroupDirIntegral(AdGroupDirIntegral object);

    int update(AdGroupDirIntegral.UpdateBuilder object);

    List<AdGroupDirIntegral> queryAdGroupDirIntegral(AdGroupDirIntegral object);

    AdGroupDirIntegral queryAdGroupDirIntegralLimit1(AdGroupDirIntegral object);

}