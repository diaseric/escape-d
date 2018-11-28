
import java.util.Scanner;

public class Main {

    //Foyer
    public static boolean chestOpen = false;
    public static boolean matchLit = false;
    public static boolean candleLit = false;
    public static boolean inLibrary = false;

    //library
    public static boolean scrollRead = false;
    public static boolean penInHand = false;
    public static boolean nameOnScroll = false;
    public static boolean inConservatory = false;

    //Conservatory
    public static boolean sheetRead = false;
    public static boolean trumpetPlayed = false;
    public static boolean pianoPlayed = false;
    public static boolean drumPlayed = false;

    //

    public static int turnsLeft = 30;







    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.println("You are in a large foyer.\nThere is a locked door to the north.\nThere is a bench, a chest, an unlit candle, and a note in this room.\nYou have 30 turns to escape.");

        System.out.println("Commands in this room:\nread note\nlight match\nopen chest\nlight candle\ngo north");


        String[] input = new String[30];



        for(int i = 0; i<30; i++) {
            input[i] = sc.nextLine();
            switch(input[i]) {
                case "open chest":
                    chestOpen = true;
                    turnsLeft = turnsLeft - 1;
                    System.out.println("Inside the chest you see a box of matches\nyou have " + turnsLeft + " moves left");
                    break;
                case "light match":
                    if (chestOpen == true) {
                        matchLit = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("Once you light the match, you see an unlit candle on a table next to the chest\nyou have" + turnsLeft + "moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }

                    break;

                case "light candle":
                    if (matchLit == true) {
                        candleLit = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("The door to the north opens\nyou have " + turnsLeft + " moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }

                    break;
                case "go north":
                    if (candleLit == true) {
                        inLibrary = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("You are now in a library\nin front of you is a desk with a scroll and a pen\ncommands in this room are read scroll, pick up pen, write name on scroll, go north to next room\nyou have" + turnsLeft + " moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;
                case "read scroll":
                    if (inLibrary == true) {
                        scrollRead = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("The scroll says: 'Share your story' \nyou have " + turnsLeft + " turnsLeft");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;
                case "pick up pen":
                    if (scrollRead == true) {
                        penInHand = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("You have the pen in you hand\nyou have " + turnsLeft + " turnsLeft");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;

                case "write name on scroll":
                    if (penInHand == true) {
                        nameOnScroll = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("the door to the north opens\nyou have " + turnsLeft + " turnsLeft");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;
                case "go north to next room":
                    if (nameOnScroll == true) {
                        inConservatory = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("You find yourself in a conservatory with a trumpet, a piano, a drum, and a piece of sheet music on a stand\ncommands in this room: read sheet, play piano, play trumpet, play drum, exit room \nyou have " + turnsLeft + " turnsLeft");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;

                case "read sheet":
                    if (inConservatory == true) {
                        sheetRead = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("the sheet says 'Timbre, Tone, Time' \nyou have " + turnsLeft + " turns Left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;

                case "play trumpet":
                    if (sheetRead == true) {
                        trumpetPlayed = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("you play the trumpet. " + turnsLeft + " moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;

                case "play piano":
                    if (trumpetPlayed == true) {
                        pianoPlayed = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("you play the piano. " + turnsLeft + " moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;
                case "play drum":
                    if (pianoPlayed == true) {
                        drumPlayed = true;
                        turnsLeft = turnsLeft - 1;
                        System.out.println("you play the drum and the room leading out opens. " + turnsLeft + " moves left");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;
                case "exit room":
                    if (drumPlayed == true) {

                        turnsLeft = turnsLeft - 1;
                        System.out.println("Congratulations! You have successfully completed the escape room with  " + turnsLeft + " moves to spare!");
                    } else {
                        turnsLeft = turnsLeft - 1;
                        System.out.println("FAIL. " + turnsLeft + " moves left");
                    }
                    break;


                default:
                    turnsLeft = turnsLeft - 1;
                    System.out.println("FAIL. " + turnsLeft + " moves left");

                    break;
            }
        }

    }
}
