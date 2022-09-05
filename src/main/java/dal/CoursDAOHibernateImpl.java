package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import bo.Cours;

@Repository("hibernate")
public class CoursDAOHibernateImpl implements CoursDAO {
	private EntityManagerFactory emf;
	
	public CoursDAOHibernateImpl() {
		emf = Persistence.createEntityManagerFactory("user");
	}

	@Override
	public List<Cours> selectAll() {
		EntityManager em = emf.createEntityManager();
		List<Cours> resultat = em.createQuery("FROM Cours", Cours.class).getResultList();
		em.close();
		return resultat;
	}

	@Override
	public void insert(Cours cours) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(cours);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
	}
}
