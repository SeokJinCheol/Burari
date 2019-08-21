package com.project.burari.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class JpaCRUDRepository<T> {
	
	@PersistenceContext
	EntityManager em;
	
	public void save(T vo) {
		em.persist(vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(String sql){
		Query query = em.createQuery(sql);
		return (List<T>) query.getResultList();
	}
	
	public void delete(T vo){
		em.remove(vo);
	}
	
	public void update(T vo){
		em.merge(vo);
	}

}
