package Abstract;

import Entities.Gamer;

public interface GamerService {
	void add(Gamer gamer) throws Exception;
	void delete(Gamer gamer) throws Exception;
	void update(Gamer gamer) throws Exception;
}
