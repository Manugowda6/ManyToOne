package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToSave {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("killing");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setName("office products");
		amazonOrder.setStatus("packing");
		amazonOrder.setLocation("yelahanka");
		
		
		Items items1=new Items();
		items1.setCost(234.8);
		items1.setItemName("laptop");
		items1.setAmazonOrder(amazonOrder);
		
		
		Items items2=new Items();
		items2.setCost(3534567.8);
		items2.setItemName("company");
		items2.setAmazonOrder(amazonOrder);
		
		
		
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityManager.persist(items1);
		entityManager.persist(items2);
		entityTransaction.commit();
	}

}
