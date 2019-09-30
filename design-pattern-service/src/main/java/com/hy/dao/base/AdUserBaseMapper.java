package com.hy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hy.model.AdUser;
/**
*  @author 
*/
public interface AdUserBaseMapper {

    int insertAdUser(AdUser object);

    int updateAdUser(AdUser object);

    int update(AdUser.UpdateBuilder object);

    List<AdUser> queryAdUser(AdUser object);

    AdUser queryAdUserLimit1(AdUser object);

}