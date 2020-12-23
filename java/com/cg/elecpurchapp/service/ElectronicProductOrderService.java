package com.cg.elecpurchapp.service;

import com.cg.elecpurchapp.model.ElectronicProductOrder;

public interface ElectronicProductOrderService {
	ElectronicProductOrder addElectronicProductOrder(ElectronicProductOrder productOrder);

	ElectronicProductOrder removeElectronicProductOrder(int i);

	ElectronicProductOrder updateElectronicProductOrder(ElectronicProductOrder productOrder2);

	
	ElectronicProductOrder viewElectronicProductOrder(int orderId);
}
