
package Entity;

public class Client {
    private int id;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String target;

    public Client() {
    }

    public Client(int id, String name, int age, double height, double weight, String target) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.target = target;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", target=" + target + '}';
    } 
}
