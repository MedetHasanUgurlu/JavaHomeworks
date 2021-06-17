import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Entity.Concrete.Campaign;
import Entity.Concrete.Game;
import Entity.Concrete.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(15, "Medet", "Ugurlu", "1512", 255522522, 1996, "1212321");
			
		CampaignManager campaign = new CampaignManager(new Campaign(1, "Summer Sale", 75));
		
		Campaign campaign1 = new Campaign(1, "Summer Sale", 75);
		campaign.addCampaign(campaign1);
		
	
		Game Redaler2 = new Game(7785, "Red Alert2", 85, "Stragety");
		
		
		GameManager manager = new GameManager();
		manager.Buy(user1, Redaler2, campaign1);

	}

}
