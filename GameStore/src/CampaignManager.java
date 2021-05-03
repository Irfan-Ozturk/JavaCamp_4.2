
public  class CampaignManager implements Utils{

	
		
	

	@Override
	public void save(Campaign campaign) {
	System.out.println(campaign.campaignName+" eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+" silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+" bilgileri güncenlendi");
		
	}

	@Override
	public void save(GameDeveloper gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GameDeveloper gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameDeveloper gamer) {
		// TODO Auto-generated method stub
		
	}

}
