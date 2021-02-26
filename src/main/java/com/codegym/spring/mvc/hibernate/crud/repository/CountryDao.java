package com.codegym.spring.mvc.hibernate.crud.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codegym.spring.mvc.hibernate.crud.entity.Country;

@Repository
@Transactional
public class CountryDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Country getCountry(final int id) {
		@SuppressWarnings("unchecked")
		TypedQuery<Country> q = sessionFactory.getCurrentSession().createQuery("from Country t where t.id = :id")
				.setParameter("id", id);

		return q.getSingleResult();
	}

	public List<Country> getCountrys() {
		@SuppressWarnings("unchecked")
		TypedQuery<Country> q = sessionFactory.getCurrentSession().createQuery("from Country");

		return q.getResultList();
	}

	public void addCountry(final Country country) {
		sessionFactory.getCurrentSession().save(country);
	}

	public void updateCountry(final Country country) {
		sessionFactory.getCurrentSession().saveOrUpdate(country);
	}

	public void deleteCountry(final int id) {
		sessionFactory.getCurrentSession().createQuery("delete from Country t where t.id = :id").setParameter("id", id)
				.executeUpdate();
	}

}
