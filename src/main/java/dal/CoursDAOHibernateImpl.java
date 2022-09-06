package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.Cours;

@Repository("hibernate")
public class CoursDAOHibernateImpl implements CoursDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Cours> selectAll() {
		return em.createQuery("FROM Cours", Cours.class).getResultList();
	}

	@Override
	@Transactional
	public void insert(Cours cours) {
		em.persist(cours);
	}

	@Override
	@Transactional
	public void update(Cours cours) {
		em.merge(cours);
	}

	@Override
	@Transactional
	public void delete(Cours cours) {
		em.remove(cours);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Cours cours = findById(id);
		if (cours != null) {
			em.remove(cours);
		}
	}

	@Override
	public Cours findById(int id) {
		return em.find(Cours.class, id);
	}
}
