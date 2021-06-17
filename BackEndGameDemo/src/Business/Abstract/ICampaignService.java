package Business.Abstract;

import Entity.Concrete.Campaign;

public interface ICampaignService {
	
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);

}
