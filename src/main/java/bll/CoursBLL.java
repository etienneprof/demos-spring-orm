package bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bo.Cours;
import dal.CoursDAO;

@Service
public class CoursBLL {
	@Autowired
	@Qualifier("bouchon")
	private CoursDAO dao;
	
	public List<Cours> selectAll() {
		return dao.selectAll();
	}
	
	public void insert(Cours cours) {
		dao.insert(cours);
	}
}
