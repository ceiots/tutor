package ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.entity.JsonToWeb;
import ssm.entity.Orders;
import ssm.entity.PersonalCenter;
import ssm.service.OrdersService;
import ssm.service.PersonalCenterService;

@Controller
public class OrdersController {

	@Resource
	private OrdersService ordersService;

	@RequestMapping(value = "/getOrdersService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getOrdersService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {

		List<Orders> ordersList = ordersService.findOrders();
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", response.getStatus(), true, ordersList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

}
