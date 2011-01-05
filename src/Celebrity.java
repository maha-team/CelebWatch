import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

public class Celebrity implements StatusListener {
	Identifier id;
	Category cat;

	/* Twitter4j */

	public Celebrity(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Exception arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStatus(Status newStatusUpdate) {
		String tweettext = newStatusUpdate.getText();
		
		
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub

	}
	
	java.util.ArrayList<Celebrity> list = new java.util.ArrayList<Celebrity>();
	
	Celebrity c1 = new Celebrity("Celebrity1");
	Celebrity c2 = new Celebrity("Celebrity2");
	

	
}
