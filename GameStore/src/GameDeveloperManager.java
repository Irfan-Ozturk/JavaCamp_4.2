
public  class GameDeveloperManager implements Utils,CheckService{
	
	@Override
	public void check(GameDeveloper gamer) {
		System.out.println(gamer.getFirstName()+" kiþisi doðrulandý");
		
	}
	@Override
	public void save(GameDeveloper gamer) {
		System.out.println(gamer.getFirstName()+" eklendi");
		
	}

	@Override
	public void delete(GameDeveloper gamer) {
		System.out.println(gamer.getFirstName()+" Silindi");
		
	}

	@Override
	public void update(GameDeveloper gamer) {
		System.out.println(gamer.getFirstName()+" Bilgileri Güncenlendi");
		
	}

	@Override
	public void save(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	
	
		
	
	

}
