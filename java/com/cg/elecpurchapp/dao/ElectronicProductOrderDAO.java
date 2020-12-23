package com.cg.elecpurchapp.dao;


import com.cg.elecpurchapp.model.ElectronicProductOrder;

public interface ElectronicProductOrderDAO {

	ElectronicProductOrder addElectronicProductOrder(ElectronicProductOrder po);

	ElectronicProductOrder removeElectronicProductOrder(int orderId);

	ElectronicProductOrder updateElectronicProductOrder(ElectronicProductOrder po);

	ElectronicProductOrder viewElectronicProductOrder(int orderId);

	
}