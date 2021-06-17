package Business.Concrete;

import Business.Abstract.IGameService;
import Entity.Concrete.Campaign;
import Entity.Concrete.Game;
import Entity.Concrete.User;

public class GameManager implements IGameService {

	@Override
	public void Buy(User user, Game game) {
		System.out.println(user.getFirstName()+" is buying"+game.getGameName()+ " cost: "+game.getPrice());
		
		
	}

	@Override
	public void Buy(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" is buying"+game.getGameName()+ "cost: "+(game.getPrice()-campaign.getDiscount()));
		
	}

	@Override
	public void Refund(User user, Game game) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" is refunding"+game.getGameName()+ " cost: "+game.getPrice());
	}

}
