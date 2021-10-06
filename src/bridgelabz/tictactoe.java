package bridgelabz;

public class tictactoe {
    public static char[] gameArray = new char[10];

    public static void ticTacToe() {
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = ' ';
        }
    }

    public static void main(String[] args) {
        ticTacToe();
    }
}
