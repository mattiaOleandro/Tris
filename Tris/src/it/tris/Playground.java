package it.tris;

public class Playground {

    private String table = "╔═══════════════════════╗\n║        T R I S        ║\n╠═══════╦═══════╦═══════╣\n║¹      ║²      ║³      ║\n╠═══════╬═══════╬═══════╣\n║⁴      ║⁵      ║⁶      ║\n╠═══════╬═══════╬═══════╣\n║⁷      ║⁸      ║⁹      ║\n╚═══════╩═══════╩═══════╝\n";

    private char[] played = table.toCharArray();

    public String getTable(){
        return this.table;
    }

    public void setTable(String table){
        this.table = table;
    }

    public char[] getPlayed() {
        return played;
    }

    public void setPlayed(char[] played) {
        this.played = played;
    }
}
