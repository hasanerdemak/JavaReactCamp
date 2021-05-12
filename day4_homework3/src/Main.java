import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		Gamer gamer = new Gamer(1, "Hasan Erdem", "AK", new Date(2000,1,1), "12345678910");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game1 = new Game(1, "Battlefield 2", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Game game2 = new Game(2, "Age Of Empires 2", 50);
		gameManager.add(game2);
		
		Campaign campaign = new Campaign(1, 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game1, gamer);
		saleManager.saleWithCampaign(game2, gamer, campaign);
		
		System.out.println(gamer.toString());

	}

}
