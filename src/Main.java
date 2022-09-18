import java.util.Random;

public class Main {
    //ввести ім'я першої команди
    //ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
    //ввести ім'я другої команди
    //ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
    //підрахувати середнє арифметичне балів кожної команди
    //порівняти результати команд та визначити переможця
    //вивести у консоль:
    //"Перемогла команда" + teamName + "набрала" + result + "очків"
    public static void main(String[] args) {

        String teamNavi = "NaVi";

        int naviPlayer1 = 5;
        int naviPlayer2 = 12;
        int naviPlayer3 = 8;
        int naviPlayer4 = 18;
        int naviPlayer5 = 35;

        String teamTSM = "Team Solo Mid";
        int tsmPlayer1 = 6;
        int tsmPlayer2 = 8;
        int tsmPlayer3 = 21;
        int tsmPlayer4 = 19;
        int tsmPlayer5 = 21;

        int totalPlayer = 5;

        int averageKillsTeamNavi = (naviPlayer1 + naviPlayer2 + naviPlayer3 + naviPlayer4 + naviPlayer5) / totalPlayer;
        int averageKillsTeamTSM = (tsmPlayer1 + tsmPlayer2 + tsmPlayer3 + tsmPlayer4 + tsmPlayer5) / totalPlayer;

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