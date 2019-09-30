package com.hy.dao.base;

import com.hy.model.Order;

import java.util.List;
/**
*  @author author
*/
public interface OrderBaseMapper {

    int insertOrder(Order object);

    int updateOrder(Order object);

    int update(Order.UpdateBuilder object);

    List<Order> queryOrder(Order object);

    Order queryOrderLimit1(Order object);

}