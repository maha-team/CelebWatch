import twitter4j.*;

	public class Control implements StatusListener {

	 

	      /**Call this method to strt reading tweets*/

	      public void readTweets() {

	            /* Create the TweetStream reader thread */

	            TwitterStream mTwitterStream = new TwitterStreamFactory(this).getInstance("TwitterUsername","TwitterPassword");

	            /* Start reading the Twitter Stream */

	            mTwitterStream.sample();

	 

	      }

	      @Override /*Method from  Statuslistener not used in this example*/

	      public void onDeletionNotice(StatusDeletionNotice arg0) {

	            // TODO Auto-generated method stub

	           

	      }

	 

	      @Override /*Method from  Statuslistener not used in this example*/

	      public void onException(Exception arg0) {

	            // TODO Auto-generated method stub

	           

	      }

	 

	      @Override /* method called when new tweet is read*/

	      public void onStatus(Status arg0) {

	            // TODO Auto-generated method stub

	            String tweet = arg0.getText();

	            String userName = arg0.getUser().getName();

	            if (checkTweet(tweet)){

	                  System.out.println(tweet);

	                  //Here or in a special method in this class the logic for saving displaying result is called*/

	            }

	      }

	 

	      @Override /**Method from  Statuslistener not used in this example*/

	      public void onTrackLimitationNotice(int arg0) {

	            // TODO Auto-generated method stub

	           

	      }

	     

	      /**Checks if tweet is according to our demands*/

	      private boolean checkTweet(String _tweet){

	            boolean found = false;

	            if (_tweet.contains("and")){

	                  found = true;

	            }

	            return found;

	      }

	     

	}
