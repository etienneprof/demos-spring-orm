package dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bo.Cours;

@Repository("bouchon")
public class CoursDAOBouchonImpl implements CoursDAO {
	private static List<Cours> listeCours;
	private static int idx;
	
	static {
		listeCours = new ArrayList<Cours>();
		idx = 1;
		listeCours.add(new Cours(idx++, "Java"));
		listeCours.add(new Cours(idx++, "JEE"));
		listeCours.add(new Cours(idx++, "HTML CSS"));
		listeCours.add(new Cours(idx++, "Angular"));
		listeCours.add(new Cours(idx++, "Spring"));
	}

	@Override
	public void insert(Cours cours) {
		cours.setId(idx++);
		listeCours.add(cours);
	}

	@Override
	public List<Cours> selectAll() {
		return listeCours;
	}
}
