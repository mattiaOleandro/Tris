package it.tris;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Match match = new Match();
        Scanner scanner = new Scanner(System.in);
        String mode;

        System.out.println("╔══════════════════════════════════╗\n║          T   R   I   S           ║\n╚══════════════════════════════════╝");
        System.out.print("Single player -S- or Multiplayer -M-\nSelect mode: ");


        while (true){
            mode = scanner.nextLine();

            if (mode.equalsIgnoreCase("S")){
                System.out.println(" ");
                match.SinglePlayerMatch();
                break;
            }else if (mode.equalsIgnoreCase("M")){
                System.out.println(" ");
                match.MultiPlayerMatch();
                break;
            }else {
                System.out.print("Please select the correct mode: ");
            }
        }
    }
}
