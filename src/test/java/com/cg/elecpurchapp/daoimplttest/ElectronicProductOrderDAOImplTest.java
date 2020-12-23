package com.cg.elecpurchapp.daoimplttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.elecpurchapp.dao.ElectronicProductOrderDAO;
import com.cg.elecpurchapp.daoimpl.ElectronicProductOrderDAOImpl;
import com.cg.elecpurchapp.model.ElectronicProductOrder;

public class ElectronicProductOrderDAOImplTest {
	@Test
	public void test_add_GivenElectronicProductOrder_ShouldReturnElectronicProductOrer_Pass() {
		ElectronicProductOrderDAO productOrderDao=new ElectronicProductOrderDAOImpl();
		ElectronicProductOrder po=new ElectronicProductOrder(); 
		po.setTotalAmount(5000);
		po.setOrderStatus("shipped");
		ElectronicProductOrder prodOrder=productOrderDao.addElectronicProductOrder(po);
		assertEquals("shipped",prodOrder.getOrderStatus());		
}
	@Test
	public void test_removeProductOrder_ShouldReturnProductOrderId_Pass()
	{
		ElectronicProductOrderDAO productOrderDao=new ElectronicProductOrderDAOImpl();
		ElectronicProductOrder po=new ElectronicProductOrder();
		po.setOrderId(1);
		int orderId=1;
		ElectronicProductOrder prodOrder1=productOrderDao.removeElectronicProductOrder(orderId);
	}
	@Test
	public void test_updateProductOrder_ShouldReturnProductOrder_Pass()
	{
		ElectronicProductOrderDAO productOrderDao=new ElectronicProductOrderDAOImpl();
		ElectronicProductOrder po=new ElectronicProductOrder();
		po.setOrderStatus("delivered");
		ElectronicProductOrder prodOrder=productOrderDao.updateElectronicProductOrder(po);
		assertEquals("delivered",prodOrder.getOrderStatus());
	}
	@Test
	public void test_viewProductOrder_ShouldReturnProductOrder_Pass()
	{
		ElectronicProductOrderDAO productOrderDao=new ElectronicProductOrderDAOImpl();
		ElectronicProductOrder po=new ElectronicProductOrder();
		po.setOrderId(1);
		int orderId=1;
		ElectronicProductOrder prodOrder=productOrderDao.viewElectronicProductOrder(orderId);
	}
//	@Test
//	public void test_showAllProductOrders_ShouldReturnListOfOrders()
//	{
//		ElectronicProductOrderDAO productOrderDao=new ElectronicProductOrderDAOImpl();
//		ElectronicProductOrder po=new ElectronicProductOrder();
//		List<ElectronicProductOrder> orders=productOrderDao.findAll(po);
//	}
}
