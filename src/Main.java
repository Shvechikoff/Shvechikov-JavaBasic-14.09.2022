public class Main {
    public static void main(String[] args) {

        int liWarrior = 13;
        int liArcher = 24;
        int liRider = 46;

        int minWarrior = 9;
        int minArcher = 35;
        int minRider = 12;

        int liPeople = 860;
        double minPeople = liPeople * 1.5;


        int liTotalDamage = liWarrior * liPeople + liArcher * liPeople + liRider * liPeople;
        int minTotalDamage = (int) (minWarrior * minPeople + minArcher * minPeople + minRider * minPeople);

        System.out.println("Li total damage: " + liTotalDamage + "\n" + "Min total damage: " + minTotalDamage);
    }
}