import twitter4j.*;

	public class Control implements StatusListener {

//String[] stringsToLookFor;	 
private String _findText;
private Table t;
private int rows; //csv
private MainPageContainer _mainPageContainer;


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
		                  _mainPageContainer.ShowTweet(tweet);
		                  //Here or in a special method in this class the logic for saving displaying result is called*/
	
		            }
	      }

	      @Override /**Method from  Statuslistener not used in this example*/

	      public void onTrackLimitationNotice(int arg0) {

	            // TODO Auto-generated method stub     
	      }

	      /**Checks if tweet is according to our demands*/

	      private boolean checkTweet(String _tweet){
	    	  //System.out.println(_tweet);
			  boolean found = false;
			  t = new Table( "names.csv" );
			  int rIndex = t.getStringRowIndex(_findText);
			  if (rIndex != -1) {
			  for (int j = 4; j < 7; j++) {
				  //System.out.println(t.getString(rIndex,j));
	    		if (_tweet.contains(t.getString(rIndex,j))){
				  //if (_tweet.contains("a")){
	    		  System.out.println(t.getString(rIndex,j));
	    		  
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

	         


