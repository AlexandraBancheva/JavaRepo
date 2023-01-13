public class Citizen implements Identifiable{
    private String id;
    private Integer age;
    private String name;

    public Citizen(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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
