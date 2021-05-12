package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws Exception {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi: "+ gamer.getFirstName());
		}
		else {
			throw new Exception("Geçersiz kiþi");	
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: "+ gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi: \n"+ gamer.toString());
	}

}
