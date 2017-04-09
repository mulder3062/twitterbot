package com.github.mulder3062;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.Date;

public class TwitterBot {
    public static void main(String args[]) throws Exception {
        try {
            /*
                주의) twitter4j.properties가 root classpath에 존재해야 동작한다.
                참고) http://twitter4j.org/en/configuration.html
             */
            Twitter twitter = TwitterFactory.getSingleton();
            Status status = twitter.updateStatus("Hello " + new Date());
            System.out.println("Successfully updated the status to [" + status.getText() + "].");
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }
    }
}