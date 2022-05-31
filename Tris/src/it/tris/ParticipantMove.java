package it.tris;

import java.util.Random;
import java.util.Scanner;

public class ParticipantMove extends Playground {

    Scanner input = new Scanner(System.in);

    private String participant1, participant2;

    public String getParticipant1() {
        return this.participant1;
    }

    public void setParticipant1(String participant1) {
        this.participant1 = participant1;
    }

    public String getParticipant2() {
        return this.participant2;
    }

    public void setParticipant2(String participant2) {
        this.participant2 = participant2;
    }

    public void participantMoveX() {

        System.out.print("It's up to the player " + participant1 + ": ");

        while (true) {
            String input = this.input.nextLine();
            if ((input.equals("1")) && (getPlayed()[82] != 'X') && (getPlayed()[82] != 'O')) {
                getPlayed()[82] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("2")) && (getPlayed()[90] != 'X') && (getPlayed()[90] != 'O')) {
                getPlayed()[90] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("3")) && (getPlayed()[98] != 'X') && (getPlayed()[98] != 'O')) {
                getPlayed()[98] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("4")) && (getPlayed()[134] != 'X') && (getPlayed()[134] != 'O')) {
                getPlayed()[134] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("5")) && (getPlayed()[142] != 'X') && (getPlayed()[142] != 'O')) {
                getPlayed()[142] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("6")) && (getPlayed()[150] != 'X') && (getPlayed()[150] != 'O')) {
                getPlayed()[150] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("7")) && (getPlayed()[186] != 'X') && (getPlayed()[186] != 'O')) {
                getPlayed()[186] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("8")) && (getPlayed()[194] != 'X') && (getPlayed()[194] != 'O')) {
                getPlayed()[194] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("9")) && (getPlayed()[202] != 'X') && (getPlayed()[202] != 'O')) {
                getPlayed()[202] = 'X';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            System.out.print("Box already occupied, check another box: ");
        }
        System.out.println(getTable());
    }

    public void participantMoveO() {

        System.out.print("It's up to the player " + participant2 + ": ");

        while (true) {
            String input = this.input.nextLine();
            if ((input.equals("1")) && (getPlayed()[82] != 'X') && (getPlayed()[82] != 'O')) {
                getPlayed()[82] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("2")) && (getPlayed()[90] != 'X') && (getPlayed()[90] != 'O')) {
                getPlayed()[90] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("3")) && (getPlayed()[98] != 'X') && (getPlayed()[98] != 'O')) {
                getPlayed()[98] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("4")) && (getPlayed()[134] != 'X') && (getPlayed()[134] != 'O')) {
                getPlayed()[134] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("5")) && (getPlayed()[142] != 'X') && (getPlayed()[142] != 'O')) {
                getPlayed()[142] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("6")) && (getPlayed()[150] != 'X') && (getPlayed()[150] != 'O')) {
                getPlayed()[150] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("7")) && (getPlayed()[186] != 'X') && (getPlayed()[186] != 'O')) {
                getPlayed()[186] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("8")) && (getPlayed()[194] != 'X') && (getPlayed()[194] != 'O')) {
                getPlayed()[194] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            if ((input.equals("9")) && (getPlayed()[202] != 'X') && (getPlayed()[202] != 'O')) {
                getPlayed()[202] = 'O';
                setTable(String.valueOf(getPlayed()));
                break;
            }
            System.out.print("Box already occupied, check another box: ");
        }
        System.out.println(getTable());
    }

    public void participantMoveRandom() {

        String[] singlePlayer = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Random random = new Random();

        System.out.println("It's up to the player " + participant2 + ": ");
        while (true) {
            if (conditionMove()){
                smartMove();
                setTable(String.valueOf(getPlayed()));
                break;
            }else {
                String randomNumber = singlePlayer[random.nextInt(9)];
                if ((randomNumber.equals("1")) && (getPlayed()[82] != 'X') && (getPlayed()[82] != 'O')) {
                    getPlayed()[82] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("2")) && (getPlayed()[90] != 'X') && (getPlayed()[90] != 'O')) {
                    getPlayed()[90] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("3")) && (getPlayed()[98] != 'X') && (getPlayed()[98] != 'O')) {
                    getPlayed()[98] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("4")) && (getPlayed()[134] != 'X') && (getPlayed()[134] != 'O')) {
                    getPlayed()[134] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("5")) && (getPlayed()[142] != 'X') && (getPlayed()[142] != 'O')) {
                    getPlayed()[142] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("6")) && (getPlayed()[150] != 'X') && (getPlayed()[150] != 'O')) {
                    getPlayed()[150] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("7")) && (getPlayed()[186] != 'X') && (getPlayed()[186] != 'O')) {
                    getPlayed()[186] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("8")) && (getPlayed()[194] != 'X') && (getPlayed()[194] != 'O')) {
                    getPlayed()[194] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
                if ((randomNumber.equals("9")) && (getPlayed()[202] != 'X') && (getPlayed()[202] != 'O')) {
                    getPlayed()[202] = 'O';
                    setTable(String.valueOf(getPlayed()));
                    break;
                }
            }
        }
        System.out.println(getTable());
    }

    private void smartMove(){
        boolean exit = true;
        while (exit){

            if (getPlayed()[82] == 'O' && getPlayed()[90] == 'O' && getPlayed()[98] == ' ') {
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[82] == 'O' && getPlayed()[90] == ' ' && getPlayed()[98] == 'O'){
                getPlayed()[90] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[90] == 'O' && getPlayed()[98] == 'O'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[134] == 'O' && getPlayed()[142] == 'O' && getPlayed()[150] == ' '){
                getPlayed()[150] = 'O';
                break;
            }
            if (getPlayed()[134] == 'O' && getPlayed()[142] == ' ' && getPlayed()[150] == 'O'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[134] == ' ' && getPlayed()[142] == 'O' && getPlayed()[150] == 'O'){
                getPlayed()[134] = 'O';
                break;
            }
            if (getPlayed()[186] == 'O' && getPlayed()[194] == 'O' && getPlayed()[202] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            if (getPlayed()[186] == 'O' && getPlayed()[194] == ' ' && getPlayed()[202] == 'O'){
                getPlayed()[194] = 'O';
                break;
            }
            if (getPlayed()[186] == ' ' && getPlayed()[194] == 'O' && getPlayed()[202] == 'O'){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[134] == 'O' && getPlayed()[186] == 'O'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[82] == 'O' && getPlayed()[134] == ' ' && getPlayed()[186] == 'O'){
                getPlayed()[134] = 'O';
                break;
            }
            if (getPlayed()[82] == 'O' && getPlayed()[134] == 'O' && getPlayed()[186] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            if (getPlayed()[90] == ' ' && getPlayed()[142] == 'O' && getPlayed()[194] == 'O'){
                getPlayed()[90] = 'O';
                break;
            }
            if (getPlayed()[90] == 'O' && getPlayed()[142] == ' ' && getPlayed()[194] == 'O'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[90] == 'O' && getPlayed()[142] == 'O' && getPlayed()[194] == ' '){
                getPlayed()[194] = 'O';
                break;
            }
            if (getPlayed()[98] == ' ' && getPlayed()[150] == 'O' && getPlayed()[202] == 'O'){
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[98] == 'O' && getPlayed()[150] == ' ' && getPlayed()[202] == 'O'){
                getPlayed()[150] = 'O';
                break;
            }
            if (getPlayed()[98] == 'O' && getPlayed()[150] == 'O' && getPlayed()[202] == ' '){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[142] == 'O' && getPlayed()[202] == 'O'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[82] == 'O' && getPlayed()[142] == ' ' && getPlayed()[202] == 'O'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[82] == 'O' && getPlayed()[142] == 'O' && getPlayed()[202] == ' '){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[98] == ' ' && getPlayed()[142] == 'O' && getPlayed()[186] == 'O'){
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[98] == 'O' && getPlayed()[142] == ' ' && getPlayed()[186] == 'O'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[98] == 'O' && getPlayed()[142] == 'O' && getPlayed()[186] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[90] == 'X' && getPlayed()[98] == ' ') {
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[90] == ' ' && getPlayed()[98] == 'X'){
                getPlayed()[90] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[90] == 'X' && getPlayed()[98] == 'X'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[134] == 'X' && getPlayed()[142] == 'X' && getPlayed()[150] == ' '){
                getPlayed()[150] = 'O';
                break;
            }
            if (getPlayed()[134] == 'X' && getPlayed()[142] == ' ' && getPlayed()[150] == 'X'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[134] == ' ' && getPlayed()[142] == 'X' && getPlayed()[150] == 'X'){
                getPlayed()[134] = 'O';
                break;
            }
            if (getPlayed()[186] == 'X' && getPlayed()[194] == 'X' && getPlayed()[202] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            if (getPlayed()[186] == 'X' && getPlayed()[194] == ' ' && getPlayed()[202] == 'X'){
                getPlayed()[194] = 'O';
                break;
            }
            if (getPlayed()[186] == ' ' && getPlayed()[194] == 'X' && getPlayed()[202] == 'X'){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[134] == 'X' && getPlayed()[186] == 'X'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[134] == ' ' && getPlayed()[186] == 'X'){
                getPlayed()[134] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[134] == 'X' && getPlayed()[186] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            if (getPlayed()[90] == ' ' && getPlayed()[142] == 'X' && getPlayed()[194] == 'X'){
                getPlayed()[90] = 'O';
                break;
            }
            if (getPlayed()[90] == 'X' && getPlayed()[142] == ' ' && getPlayed()[194] == 'X'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[90] == 'X' && getPlayed()[142] == 'X' && getPlayed()[194] == ' '){
                getPlayed()[194] = 'O';
                break;
            }
            if (getPlayed()[98] == ' ' && getPlayed()[150] == 'X' && getPlayed()[202] == 'X'){
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[98] == 'X' && getPlayed()[150] == ' ' && getPlayed()[202] == 'X'){
                getPlayed()[150] = 'O';
                break;
            }
            if (getPlayed()[98] == 'X' && getPlayed()[150] == 'X' && getPlayed()[202] == ' '){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[82] == ' ' && getPlayed()[142] == 'X' && getPlayed()[202] == 'X'){
                getPlayed()[82] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[142] == ' ' && getPlayed()[202] == 'X'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[82] == 'X' && getPlayed()[142] == 'X' && getPlayed()[202] == ' '){
                getPlayed()[202] = 'O';
                break;
            }
            if (getPlayed()[98] == ' ' && getPlayed()[142] == 'X' && getPlayed()[186] == 'X'){
                getPlayed()[98] = 'O';
                break;
            }
            if (getPlayed()[98] == 'X' && getPlayed()[142] == ' ' && getPlayed()[186] == 'X'){
                getPlayed()[142] = 'O';
                break;
            }
            if (getPlayed()[98] == 'X' && getPlayed()[142] == 'X' && getPlayed()[186] == ' '){
                getPlayed()[186] = 'O';
                break;
            }
            exit = false;
        }
    }

    private boolean conditionMove(){
        return (getPlayed()[82] == 'X' && getPlayed()[90] == 'X' && getPlayed()[98] == ' ')
                ||(getPlayed()[82] == 'O' && getPlayed()[90] == 'O' && getPlayed()[98] == ' ')
                ||(getPlayed()[82] == 'X' && getPlayed()[90] == ' ' && getPlayed()[98] == 'X')
                ||(getPlayed()[82] == 'O' && getPlayed()[90] == ' ' && getPlayed()[98] == 'O')
                ||(getPlayed()[82] == ' ' && getPlayed()[90] == 'X' && getPlayed()[98] == 'X')
                ||(getPlayed()[82] == ' ' && getPlayed()[90] == 'O' && getPlayed()[98] == 'O')
                ||(getPlayed()[134] == 'X' && getPlayed()[142] == 'X' && getPlayed()[150] == ' ')
                ||(getPlayed()[134] == 'O' && getPlayed()[142] == 'O' && getPlayed()[150] == ' ')
                ||(getPlayed()[134] == 'X' && getPlayed()[142] == ' ' && getPlayed()[150] == 'X')
                ||(getPlayed()[134] == 'O' && getPlayed()[142] == ' ' && getPlayed()[150] == 'O')
                ||(getPlayed()[134] == ' ' && getPlayed()[142] == 'X' && getPlayed()[150] == 'X')
                ||(getPlayed()[134] == ' ' && getPlayed()[142] == 'O' && getPlayed()[150] == 'O')
                ||(getPlayed()[186] == 'X' && getPlayed()[194] == ' ' && getPlayed()[202] == 'X')
                ||(getPlayed()[186] == 'O' && getPlayed()[194] == ' ' && getPlayed()[202] == 'O')
                ||(getPlayed()[186] == ' ' && getPlayed()[194] == 'X' && getPlayed()[202] == 'X')
                ||(getPlayed()[186] == ' ' && getPlayed()[194] == 'O' && getPlayed()[202] == 'O')
                ||(getPlayed()[82] == ' ' && getPlayed()[134] == 'X' && getPlayed()[186] == 'X')
                ||(getPlayed()[82] == ' ' && getPlayed()[134] == 'O' && getPlayed()[186] == 'O')
                ||(getPlayed()[82] == 'X' && getPlayed()[134] == ' ' && getPlayed()[186] == 'X')
                ||(getPlayed()[82] == 'O' && getPlayed()[134] == ' ' && getPlayed()[186] == 'O')
                ||(getPlayed()[82] == 'X' && getPlayed()[134] == 'X' && getPlayed()[186] == ' ')
                ||(getPlayed()[82] == 'O' && getPlayed()[134] == 'O' && getPlayed()[186] == ' ')
                ||(getPlayed()[90] == ' ' && getPlayed()[142] == 'X' && getPlayed()[194] == 'X')
                ||(getPlayed()[90] == ' ' && getPlayed()[142] == 'O' && getPlayed()[194] == 'O')
                ||(getPlayed()[90] == 'X' && getPlayed()[142] == ' ' && getPlayed()[194] == 'X')
                ||(getPlayed()[90] == 'O' && getPlayed()[142] == ' ' && getPlayed()[194] == 'O')
                ||(getPlayed()[90] == 'X' && getPlayed()[142] == 'X' && getPlayed()[194] == ' ')
                ||(getPlayed()[90] == 'O' && getPlayed()[142] == 'O' && getPlayed()[194] == ' ')
                ||(getPlayed()[98] == ' ' && getPlayed()[150] == 'X' && getPlayed()[202] == 'X')
                ||(getPlayed()[98] == ' ' && getPlayed()[150] == 'O' && getPlayed()[202] == 'O')
                ||(getPlayed()[98] == 'X' && getPlayed()[150] == ' ' && getPlayed()[202] == 'X')
                ||(getPlayed()[98] == 'O' && getPlayed()[150] == ' ' && getPlayed()[202] == 'O')
                ||(getPlayed()[98] == 'X' && getPlayed()[150] == 'X' && getPlayed()[202] == ' ')
                ||(getPlayed()[98] == 'O' && getPlayed()[150] == 'O' && getPlayed()[202] == ' ')
                ||(getPlayed()[82] == ' ' && getPlayed()[142] == 'X' && getPlayed()[202] == 'X')
                ||(getPlayed()[82] == ' ' && getPlayed()[142] == 'O' && getPlayed()[202] == 'O')
                ||(getPlayed()[82] == 'X' && getPlayed()[142] == ' ' && getPlayed()[202] == 'X')
                ||(getPlayed()[82] == 'O' && getPlayed()[142] == ' ' && getPlayed()[202] == 'O')
                ||(getPlayed()[82] == 'X' && getPlayed()[142] == 'X' && getPlayed()[202] == ' ')
                ||(getPlayed()[82] == 'O' && getPlayed()[142] == 'O' && getPlayed()[202] == ' ')
                ||(getPlayed()[98] == ' ' && getPlayed()[142] == 'X' && getPlayed()[186] == 'X')
                ||(getPlayed()[98] == ' ' && getPlayed()[142] == 'O' && getPlayed()[186] == 'O')
                ||(getPlayed()[98] == 'X' && getPlayed()[142] == ' ' && getPlayed()[186] == 'X')
                ||(getPlayed()[98] == 'O' && getPlayed()[142] == ' ' && getPlayed()[186] == 'O')
                ||(getPlayed()[98] == 'X' && getPlayed()[142] == 'X' && getPlayed()[186] == ' ')
                ||(getPlayed()[98] == 'O' && getPlayed()[142] == 'O' && getPlayed()[186] == ' ');
    }

    public boolean getTris(){
        return this.trisX() || this.trisO();
    }

    public boolean trisX(){
        return (getPlayed()[82] == 'X') && (getPlayed()[90] == 'X') && (getPlayed()[98] == 'X')
                ||(getPlayed()[134] == 'X') && (getPlayed()[142] == 'X') && (getPlayed()[150] == 'X')
                ||(getPlayed()[186] == 'X') && (getPlayed()[194] == 'X') && (getPlayed()[202] == 'X')
                ||(getPlayed()[82] == 'X') && (getPlayed()[134] == 'X') && (getPlayed()[186] == 'X')
                ||(getPlayed()[90] == 'X') && (getPlayed()[142] == 'X') && (getPlayed()[194] == 'X')
                ||(getPlayed()[98] == 'X') && (getPlayed()[150] == 'X') && (getPlayed()[202] == 'X')
                ||(getPlayed()[82] == 'X') && (getPlayed()[142] == 'X') && (getPlayed()[202] == 'X')
                ||(getPlayed()[98] == 'X') && (getPlayed()[142] == 'X') && (getPlayed()[186] == 'X');
    }

    public boolean trisO(){
        return (getPlayed()[82] == 'O') && (getPlayed()[90] == 'O') && (getPlayed()[98] == 'O')
                ||(getPlayed()[134] == 'O') && (getPlayed()[142] == 'O') && (getPlayed()[150] == 'O')
                ||(getPlayed()[186] == 'O') && (getPlayed()[194] == 'O') && (getPlayed()[202] == 'O')
                ||(getPlayed()[82] == 'O') && (getPlayed()[134] == 'O') && (getPlayed()[186] == 'O')
                ||(getPlayed()[90] == 'O') && (getPlayed()[142] == 'O') && (getPlayed()[194] == 'O')
                ||(getPlayed()[98] == 'O') && (getPlayed()[150] == 'O') && (getPlayed()[202] == 'O')
                ||(getPlayed()[82] == 'O') && (getPlayed()[142] == 'O') && (getPlayed()[202] == 'O')
                ||(getPlayed()[98] == 'O') && (getPlayed()[142] == 'O') && (getPlayed()[186] == 'O');
    }

    public boolean tie(){
        return (getPlayed()[82] != ' ') && (getPlayed()[90] != ' ') && (getPlayed()[98] != ' ')
                &&(getPlayed()[134] != ' ') && (getPlayed()[142] != ' ') && (getPlayed()[150] != ' ')
                &&(getPlayed()[186] != ' ') && (getPlayed()[194] != ' ') && (getPlayed()[202] != ' ');
    }
}

