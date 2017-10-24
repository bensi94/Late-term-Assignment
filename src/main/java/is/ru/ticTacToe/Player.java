package is.ru.ticTacToe;

public class Player {
    
    private char icon;
    private int won, lost, tied, games;

    public Player(char icon) {
        this.setIcon(icon);
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        this.games = won + lost + tied;
    }
    
    public double getWinPercentage() {
        return won / games * 100;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }
    public char getIcon() {
        return this.icon;
    }

    public int getWins() {
        return this.won;
    }
    public void wins() {
        this.won++;
    }

    public int getLosses() {
        return this.lost;
    }
    public void loses() {
        this.lost++;
    }

    public int getTies() {
        return this.tied;
    }
    public void ties() {
        this.tied++;
    }
}
