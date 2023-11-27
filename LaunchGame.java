import java.util.Scanner;
import java.io.*;

class Guesser {
    int guessNum;

    public int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number: ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int pguessNum;

    public int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number: ");
        pguessNum = scan.nextInt();
        return pguessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser G = new Guesser();
        numFromGuesser = G.guessNumber();
    }

    public void collectNumFromPlayer() {
        Player p1 = new Player();
        numFromPlayer1 = p1.guessNumber();

        Player p2 = new Player();
        numFromPlayer2 = p2.guessNumber();

        Player p3 = new Player();
        numFromPlayer3 = p3.guessNumber();
    }

    public void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All players guess the right answer, All the players won the Game.");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player1 and Player2 guess the right number, Player1 and Player2 won the Game.");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player1 and Player3 guess the right number, Player1 and Player3 won the Game.");
            } else {
                System.out.println("Player1 guess the right number, Player1 won the Game.");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 and Player3 won the Game.");
            } else {
                System.out.println("Player2 won the Game.");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 won the Game.");
        } else {
            System.out.println("All the players lost the game.");
        }
    }
}

class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game started.");
        Umpire U = new Umpire();
        U.collectNumFromGuesser();
        U.collectNumFromPlayer();
        U.compare();
    }
}
