package ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.entity.Orders;
import ssm.pojo.JsonToWeb;
import ssm.service.OrdersService;

@Controller
public class OrdersController {

	@Resource
	private OrdersService ordersService;

	@RequestMapping(value = "/getOrdersService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getOrdersService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {

		List<Orders> ordersList = ordersService.findOrders();
		String result = "success";
		if(200!=response.getStatus()){
			result = "false";
		}
		JsonToWeb jsonToWeb = new JsonToWeb(result, "", response.getStatus(), true, ordersList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

}
