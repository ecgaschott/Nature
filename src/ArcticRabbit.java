

public class ArcticRabbit
{
	private String furColor;
	private String season;
	private int weight;
	private int fluffiness;
	private int runningSpeed;
	
	public ArcticRabbit()
	{
		furColor = "white";
		season = "winter";
	}
	
	public void changeSeason(String newSeason)
	{
		if (season.equals("winter"))
		{
			fluffiness *= 10;
			furColor = "white";
		}
		if (season.equals("summer"))
		{
			fluffiness /= 10;
			furColor = "brown";
		}
	}
}