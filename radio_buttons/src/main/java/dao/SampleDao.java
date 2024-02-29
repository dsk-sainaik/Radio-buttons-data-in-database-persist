package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Sample;

@Component
public class SampleDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public Sample insert(Sample sample)
	{
		entityTransaction.begin();
		entityManager.persist(sample);
		entityTransaction.commit();
		return sample;
		
	}

}
