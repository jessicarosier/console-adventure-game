public class Story {

    public String name;
    public String description;

    public Story(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void getDescription() {
        System.out.println(description);
    }
}
