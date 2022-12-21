import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzle = 2.60;
        double talkingDoll = 3;
        double fluffyBear = 4.10;
        double minion = 8.20;
        double track = 2;

        double priceOfTrip = Double.parseDouble(scanner.nextLine());
        int countOfPuzzles = Integer.parseInt(scanner.nextLine());
        int countOfTalkingDoll = Integer.parseInt(scanner.nextLine());
        int countOfFluffyBear = Integer.parseInt(scanner.nextLine());
        int countOfMinion = Integer.parseInt(scanner.nextLine());
        int countOfTracks = Integer.parseInt(scanner.nextLine());

        int countOfToys = countOfPuzzles + countOfTalkingDoll + countOfFluffyBear + countOfMinion + countOfTracks;
        double totalMoney = countOfPuzzles * puzzle
                + countOfTalkingDoll * talkingDoll
                + countOfFluffyBear * fluffyBear
                + countOfMinion * minion
                + countOfTracks * track;

        if (countOfToys >= 50){
            totalMoney = totalMoney - totalMoney * 0.25;
        }

        totalMoney = totalMoney - totalMoney * 0.10;
        double leftMoney;
        if (totalMoney >= priceOfTrip){
            leftMoney = totalMoney - priceOfTrip;
            System.out.println(String.format("Yes! %.2f lv left.", leftMoney));
        } else {
            leftMoney = priceOfTrip - totalMoney;
            System.out.println(String.format("Not enough money! %.2f lv needed.", leftMoney));
        }
    }
}