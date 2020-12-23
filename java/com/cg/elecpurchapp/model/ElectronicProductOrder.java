package com.cg.elecpurchapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="ProductOrders")
	public class ElectronicProductOrder {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int orderId;
		//private LocalDate orderDate;
		//private Customer customer;
		//private Map<ElectronicProduct, Integer> productList;
		//private Address ShippingAddress;
		//private Address billingAddress;
		private double totalAmount;	
		private String orderStatus;
		//Generate getters and setters
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

	}


