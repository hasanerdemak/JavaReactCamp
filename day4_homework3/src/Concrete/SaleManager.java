package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		gamer.getTakenGames().add(game.getName());
		System.out.println(game.getName() + " oyunu, " + game.getPrice() + " TL fiyatýyla, " + gamer.getFirstName() + " tarafýndan satýn alýndý.");
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		gamer.getTakenGames().add(game.getName());
		int newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100);
		System.out.println(game.getName() + " oyunu, %" + campaign.getDiscountRate() + " indirimle birlikte "+ newPrice + " TL fiyatýyla, " + gamer.getFirstName() + " tarafýndan satýn alýndý.");
	}

}
