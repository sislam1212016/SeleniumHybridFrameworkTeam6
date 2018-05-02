package facebookTests;

import facebookMain.Friends;
import org.testng.annotations.Test;

public class FriendsTest extends Friends {

    @Test
    public void lookForFriends(){
        findFriends();
    }
}
