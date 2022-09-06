package dal;

import java.util.List;

import bo.Cours;

public interface CoursDAO {
	void insert(Cours cours);
	void update(Cours cours);
	void delete(Cours cours);
	void delete(int id);
	List<Cours> selectAll();
	Cours findById(int id);
}
