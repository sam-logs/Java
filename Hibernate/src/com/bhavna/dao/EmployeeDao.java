package com.bhavna.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bhavna.entity.EmployeeEntity;

public class EmployeeDao {
	public static void addData() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
		EntityManager em = entityManagerFactory.createEntityManager();
		System.out.println("connceted");
		em.getTransaction().begin();

		
		EmployeeEntity e1 = new EmployeeEntity(101,"Ram",40000);
		EmployeeEntity e2 = new EmployeeEntity(104,"Tam",50000);
		EmployeeEntity e3 = new EmployeeEntity(103,"Jam",60000);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);

		em.getTransaction().commit();
		System.out.println("Inserted");
		entityManagerFactory.close();
		em.close();
	}
	
	public static void updateData() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();
		EmployeeEntity emp = new EmployeeEntity(102,"Cam",70000);
		em.merge(emp);
		em.getTransaction().commit();
		System.out.println("Record Updated");
		em.close();
		entityManagerFactory.close();
	}
	
	public static void deleteData() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();
		EmployeeEntity emp = em.find(EmployeeEntity.class, 102);
		if(emp != null) {
			em.remove(emp);
			System.out.println("Deleted");
		}else {
			System.out.println("Record Not Found");
		}
		em.getTransaction().commit();
	}

}
