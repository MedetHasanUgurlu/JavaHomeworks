package Business.Abstract;

import Entity.Concrete.Campaign;
import Entity.Concrete.Game;
import Entity.Concrete.User;

public interface IGameService {
	void Buy(User user,Game game);
	void Buy(User user,Game game,Campaign campaign);
	void Refund(User user,Game game);
	
	

}
