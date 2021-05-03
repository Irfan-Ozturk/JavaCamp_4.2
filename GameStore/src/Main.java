import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		GameDeveloper gamer=new GameDeveloper(1, "Ýrfan", "Öztürk", LocalDate.of(1999,07,8),"1111111111","krgz.khan@gmail.com");
		GameDeveloperManager gameDeveloperManager=new GameDeveloperManager();
		Campaign campaign=new Campaign(2,"Bayram Ýndirimi","%45 Ýndirim");
		CampaignManager campaignManager=new CampaignManager();
			
		gameDeveloperManager.check(gamer);
		gameDeveloperManager.save(gamer);
		gameDeveloperManager.delete(gamer);
		gameDeveloperManager.update(gamer);
		campaignManager.save(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
	}

}
