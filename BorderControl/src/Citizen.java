public class Citizen implements Identifiable{
    private String id;
    private Integer age;
    private String name;

    public Citizen(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
