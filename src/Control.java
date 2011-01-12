import twitter4j.*;

public class Control implements StatusListener {
 
private String _findText;
private Table t;
private int rows; //csv
private MainPageContainer _mainPageContainer;
public int tweetCount = 0;


	      public Control(MainPageContainer mainPageContainer) {
	    	  _mainPageContainer = mainPageContainer;
	      }

		/**Call this method to strt reading tweets*/

	      public void readTweets() {

	            /* Create the TweetStream reader thread */

	            TwitterStream mTwitterStream = new TwitterStreamFactory(this).getInstance("mahateam","mahateam1");

	            /* Start reading the Twitter Stream */

	            mTwitterStream.sample();
	      }

	      @Override /*Method from  Statuslistener not used in this example*/

	      public void onDeletionNotice(StatusDeletionNotice arg0) {
	      }

	 

	      @Override /*Method from  Statuslistener not used in this example*/

	      public void onException(Exception arg0) {
	      }

	 

	      @Override /* method called when new tweet is read*/
	      
	    /*Here or in a special method in this class the logic for saving displaying result is called*/
	      public void onStatus(Status arg0) {
	            String tweet = arg0.getText();
	            String userName = arg0.getUser().getName();	
		            if (checkTweet(tweet)){
		                  _mainPageContainer.ShowTweet(userName + "" + tweet);
		                  /*counts the number of tweets for the chosen celeb and displays them*/
		                  tweetCount++;
		                  _mainPageContainer.count.setText(Integer.toString(tweetCount) + " number of tweets");
	
		            }
	      }

	      @Override /**Method from  Statuslistener not used in this example*/

	      public void onTrackLimitationNotice(int arg0) {   
	      }

	      /*/
	       * Checks if tweet is according to our demands
	       * checks the csv file for synonyms of the chosen celeb and filters through the tweetstream to display only the tweets that have the synonym words in them
	      /*/
	      private boolean checkTweet(String _tweet){
			  boolean found = false;
			  t = new Table( "name.csv" );
			  int rIndex = t.getStringRowIndex(_findText);
			  if (rIndex != -1) {
			  for (int j = 4; j < 7; j++) {
	    		if (_tweet.contains(t.getString(rIndex,j))){

	    		  found = true;
	    		}
			  }
			  
			  }
	          return found;
	       }

		public void setFind(String find) {
			this._findText = find;
		}

		public String getFind() {
			return _findText;
		}
	      
	}

	         


