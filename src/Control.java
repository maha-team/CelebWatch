import twitter4j.*;

	public class Control implements StatusListener {

//String[] stringsToLookFor;	 
private String _findText;


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
	            //System.out.println(tweet);
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
	            //System.out.println("lookingFor; "+_findText);
	            if (_findText!= null){
	            	
		            if (_tweet.contains(rows[1][2] || rows[1][3] || rows[1][4]) && _findText == "The Hives"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[2][2] || rows[2][3] || rows[2][4]) && _findText == "Stellan Skarsgïrd"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[3][2] || rows[3][3] || rows[3][4]) && _findText == "Alexander Skarsgïrd"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[4][2] || rows[4][3] || rows[4][4]) && _findText == "Noomi Rapace"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[5][2] || rows[5][3] || rows[5][4]) && _findText == "ABBA"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[6][2] || rows[6][3] || rows[6][4]) && _findText == "Malin Åkerman"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[7][2] || rows[7][3] || rows[7][4]) && _findText == "Roxette"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[8][2] || rows[8][3] || rows[8][4]) && _findText == "The Cardigans"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[9][2] || rows[9][3] || rows[9][4]) && _findText == "Greta Garbo"){
		            	System.out.println("found: "+_tweet);//här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[9][2] || rows[9][3] || rows[9][4]) && _findText == "Greta Garbo"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[10][2] || rows[10][3] || rows[10][4]) && _findText == "Ingrid Bergman"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[11][2] || rows[11][3] || rows[11][4]) && _findText == "Peter Stormare"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[13][2] || rows[13][3] || rows[13][4]) && _findText == "Zlatan Ibrahimovic"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[14][2] || rows[14][3] || rows[14][4]) && _findText == "Henrik Zetterberg"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[15][2] || rows[15][3] || rows[15][4]) && _findText == "Peter Forsberg"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[16][2] || rows[16][3] || rows[16][4]) && _findText == "Sven-G_ran Eriksson"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[17][2] || rows[17][3] || rows[17][4]) && _findText == "Bj_rn Borg"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[18][2] || rows[18][3] || rows[18][4]) && _findText == "Annika S_renstam"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[19][2] || rows[19][3] || rows[19][4]) && _findText == "Therese Alshammar"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[20][2] || rows[20][3] || rows[20][4]) && _findText == "Fredrik Ljungberg"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
		            }
		            if (_tweet.contains(rows[21][2] || rows[21][3] || rows[21][4]) && _findText == "Paolo Roberto"){
		            	System.out.println("found: "+_tweet); //här ska _tweet skickas till ui istället för konsollen
		            	found=true;
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

	         


