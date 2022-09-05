package dal;

import java.util.List;

import bo.Cours;

public interface CoursDAO {
	void insert(Cours cours);
	List<Cours> selectAll();
}
