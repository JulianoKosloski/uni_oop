public class Animals {

    protected int age;
    protected String name;
    protected String size;

    public Animals(int age, String name, String size) {
        this.age = age;
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

}
