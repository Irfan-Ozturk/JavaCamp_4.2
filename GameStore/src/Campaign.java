
public class Campaign extends Objects {
	
public String campaignName;
 public String campaignDetail;
public Campaign(int id, String campaignName, String campaignDetail) {
	super(id);
	this.campaignName = campaignName;
	this.campaignDetail = campaignDetail;
}
public String getCampaignName() {
	return campaignName;
}
public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}
public String getCampaignDetail() {
	return campaignDetail;
}
public void setCampaignDetail(String campaignDetail) {
	this.campaignDetail = campaignDetail;
} 
 
}