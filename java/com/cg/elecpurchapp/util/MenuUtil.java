package com.cg.elecpurchapp.util;

import java.util.Scanner;

import com.cg.elecpurchapp.model.ElectronicProductOrder;
import com.cg.elecpurchapp.service.ElectronicProductOrderService;
import com.cg.elecpurchapp.serviceimpl.ElectronicProductOrderServiceImpl;

public class MenuUtil {
private ElectronicProductOrderService electronicProductOrderService;
	
	public MenuUtil() {
		electronicProductOrderService = new ElectronicProductOrderServiceImpl();
	}

	public void start() {
		Scanner sc= new Scanner(System.in);
		String contiChoice;
		do {
			showMenu();
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the product order");
				ElectronicProductOrder productOrder = new ElectronicProductOrder();
				System.out.println("Enter the order Id");
				productOrder.setOrderId(sc.nextInt());
				System.out.println("Enter the total amount");
				productOrder.setTotalAmount(sc.nextDouble());
				System.out.println("Enter the order status");
				productOrder.setOrderStatus(sc.next());
				electronicProductOrderService.addElectronicProductOrder(productOrder);
				System.out.println("Success ! Product Order Added Successfully");
				
				break;
			case 2:
				System.out.println("List of Product orders");
				ElectronicProductOrder productOrder1 = new ElectronicProductOrder();
				System.out.println(productOrder1.getOrderId()+"  "+productOrder1.getOrderStatus());
				System.out.println("Enter the id to be removed");
				productOrder1.setOrderId(sc.nextInt());
				electronicProductOrderService.removeElectronicProductOrder(productOrder1.getOrderId());
				System.out.println("Product Order removed Successfully");
				break;
				
			case 3:
				System.out.println("List of Product orders");
				ElectronicProductOrder productOrder2 = new ElectronicProductOrder();
				System.out.println(productOrder2.getOrderId()+"  "+productOrder2.getOrderStatus());
				System.out.println("Enter the status  to be updated");
				productOrder2.setOrderStatus(sc.next());
				electronicProductOrderService.updateElectronicProductOrder(productOrder2);
				System.out.println("Product Order updated Successfully");
				break;
			case 4:
				System.out.println("List of Product orders");
				ElectronicProductOrder productOrder3 = new ElectronicProductOrder();
				System.out.println(productOrder3.getOrderId()+"  "+productOrder3.getOrderStatus());
				System.out.println("Enter the id to be viewed");
				productOrder3.setOrderId(sc.nextInt());
				electronicProductOrderService.viewElectronicProductOrder(productOrder3.getOrderId());
			default:
				System.out.println("---------Wrong Choice------------");
				break;
			}
		
			System.out.println("Do you want to continue");
			contiChoice =  sc.next();
		} while(contiChoice.equalsIgnoreCase("yes"));
		
		sc.close();
	}
//Show the menus in the application
	private void showMenu() {
		System.out.println("-----------Electronic Purchase Menu--------------");
		System.out.println("1. Create ProductOrder");
		System.out.println("2.Remove Product Order");
		System.out.println("3.Update Product Order");
		System.out.println("4.View Product Order by ProductId");
	}


}
