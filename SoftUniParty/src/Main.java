import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests = new HashSet<String>();
        Set<String> regularGuests = new HashSet<String>();

        String guest = scanner.nextLine();

        while(!guest.contains("PARTY") && !guest.contains("END")) {
            Character firstLetter = guest.charAt(0);
            if (Character.isDigit(firstLetter)) {
                vipGuests.add(guest);
            } else if(Character.isLetter(firstLetter)) {
                regularGuests.add(guest);
            }

            guest = scanner.nextLine();
        }

        if (guest.contains("PARTY")) {
            guest = scanner.nextLine();
            while(!guest.contains("END")) {
                if (vipGuests.contains(guest)){
                    vipGuests.remove(guest);
                } else if (regularGuests.contains(guest)) {
                    regularGuests.remove(guest);
                }
                guest = scanner.nextLine();

            }
        }

        if (guest.contains("END")){
            int allMissedGuest = vipGuests.size() + regularGuests.size();
            System.out.println(allMissedGuest);
            for (String gue: vipGuests) {
                System.out.println(gue);
            }

            for (String guy: regularGuests) {
                System.out.println(guy);
            }

        }

        scanner.close();

    }
}