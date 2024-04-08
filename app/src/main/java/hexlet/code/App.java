package hexlet.code;

public class App {

    public static void main(String[] args) {
        String[] gameList = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        for (int i = 0; i < gameList.length; i++) {
            System.out.println(i + " - " + gameList[i]);
        }
        Engine.playGames();
    }
}
