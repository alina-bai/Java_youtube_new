package org.example;

public class StaticKeyword {
    public static void main (String[] args){

        Friend friend1 = new Friend("Silina");
        Friend friend2 = new Friend("Olesya");
        Friend friend3 = new Friend("Samara");
        Friend friend4 = new Friend("Sandy");
         Friend.displayFriends();

        //System.out.println(Friend.numberOffFriends);
    }

}
