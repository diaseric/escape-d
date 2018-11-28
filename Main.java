import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a large foyer.\nThere is a locked door to the north.\nThere is a bench, a chest, an unlit candle, and a note in this room.\nYou have 30 turns to escape.");

        System.out.println("Commands in this room:\nread note\nlight match\nopen chest\nlight candle\ngo north and into the next room");

        int turnsLeft = 30;

        String one = sc.nextLine();

        boolean chestOpen = false;

        if(one.equals("open chest")){
            chestOpen = true;
        }

        turnsLeft = turnsLeft - 1;

        if(chestOpen == true) {
            System.out.println("Inside the chest you see a box of matches\nyou have " + turnsLeft + " moves left");
        }


        String two = sc.nextLine();

        boolean matchLit = false;

        if(two.equals("light match")){
            matchLit = true;
        }

        turnsLeft = turnsLeft - 1;

        if(matchLit == true){
            System.out.println("Once you light the match, you see an unlit candle on a table next to the chest\nyou have " + turnsLeft + " moves left");

        }

        String three = sc.nextLine();

        boolean candleLit = false;

        if(three.equals("light candle")){
            candleLit = true;
        }

        turnsLeft = turnsLeft - 1;

        if(candleLit == true){
            System.out.println("The door to the north opens\nyou have " + turnsLeft + " moves left");
        }

        String four = sc.nextLine();

        boolean inLibrary = false;

        if(four.equals("go north and into the next room")){
            inLibrary = true;
        }

        turnsLeft = turnsLeft - 1;

        if(inLibrary == true){
            System.out.println("You are now in a library\nin front of you is a desk with a scroll and a pen\ncommands in this room are read scroll, pick up pen, write name on scroll, go to next room\nyou have" + turnsLeft + " moves left");

        }

        String five = sc.nextLine();

        boolean scrollRead = false;

        if(five.equals("read scroll")){
            scrollRead = true;
        }

        turnsLeft = turnsLeft - 1;

        if(scrollRead == true){
            System.out.println("The scroll says: 'Share your story' \nyou have " + turnsLeft + " turnsLeft" );
        }

        String six = sc.nextLine();

        boolean penInHand = false;

        if(six.equals("pick up pen")){
            penInHand = true;
        }

        turnsLeft = turnsLeft - 1;

        if(penInHand == true){
            System.out.println("You have the pen in you hand\nyou have " + turnsLeft + " turnsLeft" );
        }



        String seven = sc.nextLine();

        boolean nameOnScroll = false;

        if(seven.equals("write name on scroll")){
            nameOnScroll = true;
        }

        turnsLeft = turnsLeft - 1;

        if(nameOnScroll == true){
            System.out.println("the door to the north opens\nyou have " + turnsLeft + " turnsLeft" );
        }


        String eight = sc.nextLine();

        boolean inConservatory = false;

        if(eight.equals("go to next room")){
            inConservatory = true;
        }

        turnsLeft = turnsLeft - 1;

        if(inConservatory == true){
            System.out.println("You find yourself in a conservatory with a trumpet, a piano, a drum, and a piece of sheet music on a stand\ncommands in this room: read sheet, play piano, play trumpet, play drum, exit room \nyou have " + turnsLeft + " turnsLeft" );
        }


        String nine = sc.nextLine();

        boolean sheetRead = false;

        if(nine.equals("read sheet")){
            sheetRead = true;
        }

        turnsLeft = turnsLeft - 1;

        if(sheetRead == true){
            System.out.println("the sheet says 'Timbre, Tone, Time' \nyou have " + turnsLeft + " turnsLeft" );
        }

        String ten = sc.nextLine();

        boolean trumpetPlayed = false;

        if(ten.equals("play trumpet")){
            trumpetPlayed = true;
        }

        turnsLeft = turnsLeft - 1;

        if(trumpetPlayed == true){
            System.out.println("You play the trumpet \nyou have " + turnsLeft + " turnsLeft" );
        }

        String eleven = sc.nextLine();

        boolean pianoPlayed = false;

        if(eleven.equals("play piano")){
            pianoPlayed = true;
        }

        turnsLeft = turnsLeft - 1;

        if(pianoPlayed == true){
            System.out.println("You play the piano \nyou have " + turnsLeft + " turnsLeft" );
        }

        String twelve = sc.nextLine();

        boolean drumPlayed = false;

        if(twelve.equals("play drum")){
            drumPlayed = true;
        }



        if(drumPlayed == true){
            System.out.println("You play the drum and the door leading out opens.\nCongratulations! You have completed the escape room!" );
        }





    }

}
