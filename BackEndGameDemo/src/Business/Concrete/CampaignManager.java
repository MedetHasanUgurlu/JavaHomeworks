package Business.Concrete;

import Business.Abstract.ICampaignService;
import Entity.Concrete.Campaign;

public class CampaignManager implements ICampaignService {
	
	Campaign _campaign;

	 public CampaignManager(Campaign campaign) {
		// TODO Auto-generated constructor stub
		 _campaign = campaign;
	}
	 public CampaignManager() {
			// TODO Auto-generated constructor stub
			
		}
	
	
	@Override
	public void addCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" Campaign is added");
		
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" Campaign is deleted");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" Campaign is updated");
	}

}
