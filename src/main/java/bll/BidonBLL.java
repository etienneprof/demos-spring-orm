package bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.Bidon;
import dal.BidonDAO;

@Service
public class BidonBLL {
	@Autowired
	private BidonDAO dao;
	
	public List<Bidon> selectAll() {
		return dao.selectAll();
	}
}
