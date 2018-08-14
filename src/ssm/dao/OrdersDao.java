package ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ssm.entity.Orders;
import ssm.entity.PersonalCenter;

@Repository
public interface OrdersDao {

    public List<Orders> findOrders();
}
