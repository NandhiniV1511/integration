package com.cg.elecpurchapp.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.elecpurchapp.dao.ElectronicProductOrderDAO;
import com.cg.elecpurchapp.model.ElectronicProductOrder;
import com.cg.elecpurchapp.util.JPAUtil;



public class ElectronicProductOrderDAOImpl extends JPAUtil implements ElectronicProductOrderDAO {
//Add the product order in the database
	@Override
	public ElectronicProductOrder addElectronicProductOrder(ElectronicProductOrder po) {
		// TODO Auto-generated method stub
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(po);
		em.getTransaction().commit();
		em.close();
		
		//ElectronicProductOrder retProductType = getSavedElectronicProductOrder(po);
		return po;
		
	}
//Remove the product order by given order id
	@Override
	public ElectronicProductOrder removeElectronicProductOrder(int orderId)
	{
		// TODO Auto-generated method stub
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
       ElectronicProductOrder epo=em.find(ElectronicProductOrder.class, orderId);
        em.remove(epo);
		em.getTransaction().commit();
		em.close();
		return epo;
	}
//Update the order details
	@Override
	public ElectronicProductOrder updateElectronicProductOrder(ElectronicProductOrder po) {
		// TODO Auto-generated method stub
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		ElectronicProductOrder epo=em.find(ElectronicProductOrder.class, 4);
		epo.setOrderStatus("delivered");
		em.persist(epo);
		em.getTransaction().commit();
		em.close();
		return epo;
		
	}
//View the product order details by given order id
	@Override
	public ElectronicProductOrder viewElectronicProductOrder(int orderId) {
		// TODO Auto-generated method stub
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		ElectronicProductOrder epo=em.find(ElectronicProductOrder.class, orderId);
		em.getTransaction().commit();
		em.close();
		return epo;
	}

	
	
	

}
