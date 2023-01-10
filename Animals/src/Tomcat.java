public class Tomcat extends Cat{
    final static String TOMCAT_GENDER = "Male";
    public Tomcat(String name, int age, String gender) {
        super(name, age, TOMCAT_GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
