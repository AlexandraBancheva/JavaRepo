import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        System.out.println(CharacterMultiplier(input[0], input[1]));

        scanner.close();
    }

    public static long CharacterMultiplier(String first, String second){
        long sum = 0;
        long tempSum = 0;
        char[] firstWord = first.toCharArray();
        char[] secondWord = second.toCharArray();

        int shorterWord = Math.min(firstWord.length, secondWord.length);
        int longerWord = Math.max(firstWord.length, secondWord.length);

        for (int i = 0; i < shorterWord; i++) {
            tempSum += (int)firstWord[i] * (int)secondWord[i];
            sum += tempSum;
        }

        if (firstWord.length > secondWord.length) {
            for (int i = shorterWord; i <= longerWord - 1; i++)
            {
                sum += firstWord[i];
            }
        } else if (firstWord.length < secondWord.length) {
            for (int i = shorterWord; i <= longerWord - 1; i++)
            {
                sum += secondWord[i];
            }
        }

        return sum;
    }
}