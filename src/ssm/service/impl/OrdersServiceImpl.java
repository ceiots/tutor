package ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.dao.OrdersDao;
import ssm.entity.Orders;
import ssm.service.OrdersService;

@Service("OrdersService")
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersDao ordersDao;

	@Override
	public List<Orders> findOrders() {
		return ordersDao.findOrders();
	}

	/*@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}*/

}
