package it.tris;

import java.util.Random;
import java.util.Scanner;

public class Match extends Playground {

    ParticipantMove participantMove = new ParticipantMove();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] participant;
    String firstParticipant;
    String input;


    private String firstMove(){

        this.participant = new String[]{participantMove.getParticipant1(), participantMove.getParticipant2()};
        return this.participant[random.nextInt(2)];
    }

    private void choice(){

        boolean close = true;
        while (close){
            input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("X") && !participantMove.getParticipant1().equals(firstParticipant)){
                participantMove.setParticipant2(participantMove.getParticipant1());
                participantMove.setParticipant1(firstParticipant);
                close = false;
            }else if(input.equalsIgnoreCase("X") && participantMove.getParticipant1().equals(firstParticipant)){
                participantMove.setParticipant1(firstParticipant);
                close = false;
            }else if(input.equalsIgnoreCase("O") && !participantMove.getParticipant2().equals(firstParticipant)){
                participantMove.setParticipant1(participantMove.getParticipant2());
                participantMove.setParticipant2(firstParticipant);
                close = false;
            }else if(input.equalsIgnoreCase("O") && participantMove.getParticipant2().equals(firstParticipant)){
                participantMove.setParticipant2(firstParticipant);
                close = false;
            }else{
                System.out.print("Please select X or O: ");
            }
        }
    }

    public void MultiPlayerMatch(){
        System.out.print("Please enter the name of the first participant: ");
        participantMove.setParticipant1(scanner.nextLine());
        System.out.print("Please enter the name of the second participant: ");
        participantMove.setParticipant2(scanner.nextLine());
        firstParticipant = firstMove();
        System.out.print("\nStart playing: " + firstParticipant + "\nChoose between X or O: ");
        choice();


        boolean close = true;
        do {
            System.out.println(getTable());
            boolean exit = true;
            if (input.equalsIgnoreCase("X")){
                do {
                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveX();
                    }

                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveO();
                    }
                }while (exit);
            }else{
                do {
                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveO();
                    }

                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveX();
                    }
                }while (exit);
            }

            if (participantMove.trisX()){
                System.out.println("The player " + participantMove.getParticipant1() + " win!");
            }else if(participantMove.trisO()){
                System.out.println("The player " + participantMove.getParticipant2() + " win!");
            }else if(participantMove.tie()){
                System.out.println("There is no winner! :(");
            }

            System.out.println("\nContinue -Y- or exit -N-");
            System.out.print("New match? ");
            exit = true;
            do {
                String scanner = this.scanner.nextLine();
                if (scanner.equalsIgnoreCase("N")){
                    close = false;
                    exit = false;
                    System.out.println("Bye bye...");
                }else if (scanner.equalsIgnoreCase("Y")){
                    participantMove.setTable("╔═══════════════════════╗\n║        T R I S        ║\n╠═══════╦═══════╦═══════╣\n║¹      ║²      ║³      ║\n╠═══════╬═══════╬═══════╣\n║⁴      ║⁵      ║⁶      ║\n╠═══════╬═══════╬═══════╣\n║⁷      ║⁸      ║⁹      ║\n╚═══════╩═══════╩═══════╝\n");
                    participantMove.setPlayed(participantMove.getTable().toCharArray());
                    exit = false;
                }else{
                    System.out.print("\nI didn't understand try again: ");
                }
            }while (exit);
        }while (close);
        scanner.close();
    }

    public void SinglePlayerMatch(){
        System.out.print("Please enter the name of the first participant: ");
        participantMove.setParticipant1(scanner.nextLine());
        participantMove.setParticipant2("Computer");

        firstParticipant = firstMove();

        boolean close = true;
        do {
            System.out.println(getTable());
            boolean exit = true;
            if (firstParticipant.equalsIgnoreCase(participantMove.getParticipant1())){
                do {
                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveX();
                    }

                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveRandom();
                    }
                }while (exit);
            }else{
                do {
                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveRandom();
                    }

                    if (participantMove.getTris() || participantMove.tie()){
                        exit = false;
                    }else{
                        participantMove.participantMoveX();
                    }
                }while (exit);
            }

            if (participantMove.trisX()){
                System.out.println("The player " + participantMove.getParticipant1() + " win!");
            }else if(participantMove.trisO()){
                System.out.println("The player " + participantMove.getParticipant2() + " win!");
            }else if(participantMove.tie()){
                System.out.println("There is no winner! :(");
            }

            System.out.println("\nContinue -Y- or exit -N-");
            System.out.print("New match? ");
            exit = true;
            do {
                String scanner = this.scanner.nextLine();
                if (scanner.equalsIgnoreCase("N")){
                    close = false;
                    exit = false;
                    System.out.println("Bye bye...");
                }else if (scanner.equalsIgnoreCase("Y")){
                    participantMove.setTable("\n╔═══════════════════════╗\n║        T R I S        ║\n╠═══════╦═══════╦═══════╣\n║¹      ║²      ║³      ║\n╠═══════╬═══════╬═══════╣\n║⁴      ║⁵      ║⁶      ║\n╠═══════╬═══════╬═══════╣\n║⁷      ║⁸      ║⁹      ║\n╚═══════╩═══════╩═══════╝\n");
                    participantMove.setPlayed(participantMove.getTable().toCharArray());
                    exit = false;
                }else{
                    System.out.print("\nI didn't understand try again: ");
                }
            }while (exit);
        }while (close);
        scanner.close();
    }
}
