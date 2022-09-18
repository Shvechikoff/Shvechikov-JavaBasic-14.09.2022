import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String teamNavi = "NaVi";

        int naviPlayer1 = new Random().nextInt(30);
        int naviPlayer2 = new Random().nextInt(30);
        int naviPlayer3 = new Random().nextInt(30);
        int naviPlayer4 = new Random().nextInt(30);
        int naviPlayer5 = new Random().nextInt(30);

        String teamTSM = "Team Solo Mid";
        int tsmPlayer1 = new Random().nextInt(30);
        int tsmPlayer2 = new Random().nextInt(30);
        int tsmPlayer3 = new Random().nextInt(30);
        int tsmPlayer4 = new Random().nextInt(30);
        int tsmPlayer5 = new Random().nextInt(30);

        int totalPlayer = 5;

        int averageKillsTeamNavi = (naviPlayer1 + naviPlayer2 + naviPlayer3 +
                naviPlayer4 + naviPlayer5) / totalPlayer;
        int averageKillsTeamTSM = (tsmPlayer1 + tsmPlayer2 + tsmPlayer3 +
                tsmPlayer4 + tsmPlayer5) / totalPlayer;

        if (averageKillsTeamNavi == averageKillsTeamTSM) {
            System.out.println("Победила дружба GGWP");
        }
        if (averageKillsTeamNavi > averageKillsTeamTSM) {
            System.out.println("Перемогла команда: " + teamNavi + "\n" +
                    "Hабрала: " + averageKillsTeamNavi + " очків");
        }
        if (averageKillsTeamNavi < averageKillsTeamTSM) {
            System.out.println("Перемогла команда: " + teamTSM + "\n" +
                    "Hабрала: " + averageKillsTeamTSM + " очків");
        }
    }
}