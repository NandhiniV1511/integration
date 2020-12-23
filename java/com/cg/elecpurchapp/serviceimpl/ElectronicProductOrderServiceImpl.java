package com.cg.elecpurchapp.serviceimpl;

import com.cg.elecpurchapp.dao.ElectronicProductOrderDAO;
import com.cg.elecpurchapp.daoimpl.ElectronicProductOrderDAOImpl;
import com.cg.elecpurchapp.model.ElectronicProductOrder;
import com.cg.elecpurchapp.service.ElectronicProductOrderService;

public class ElectronicProductOrderServiceImpl implements ElectronicProductOrderService {
	private ElectronicProductOrderDAO productOrderDao;
	public ElectronicProductOrderServiceImpl()
	{
		productOrderDao=new ElectronicProductOrderDAOImpl();
	}
	@Override
	public ElectronicProductOrder addElectronicProductOrder(ElectronicProductOrder productOrder) {
		// TODO Auto-generated method stub
		return productOrderDao.addElectronicProductOrder(productOrder);
	}

	@Override
	public ElectronicProductOrder updateElectronicProductOrder(ElectronicProductOrder productOrder2) {
		// TODO Auto-generated method stub
		return productOrderDao.updateElectronicProductOrder(productOrder2);
	}

	@Override
	public ElectronicProductOrder removeElectronicProductOrder(int i) {
		// TODO Auto-generated method stub
		return productOrderDao.removeElectronicProductOrder(i);
	}

	@Override
	
	public ElectronicProductOrder viewElectronicProductOrder(int orderId) {
		// TODO Auto-generated method stub
		return productOrderDao.viewElectronicProductOrder(orderId);
		
	}
}
