public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("k", "z");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(2,3);
        System.out.println(integerScale.getHeavier());
    }
}