package dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bo.Bidon;

@Repository
public class BidonDAOBouchonImpl implements BidonDAO {
	private List<Bidon> bidons;
	
	public BidonDAOBouchonImpl() {
		bidons = new ArrayList<>();
		bidons.add(new Bidon(1, "Francois", 45f));
		bidons.add(new Bidon(2, "Antoine", 15f));
		bidons.add(new Bidon(3, "Maxime", 42.42f));
	}

	@Override
	public List<Bidon> selectAll() {
		return bidons;
	}
}
