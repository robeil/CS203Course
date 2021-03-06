package CS203Course.Quiizzes.Quize_1;

public class Pet {
    private String name;
    private int age;
    private float weight;

    public Pet(){
        this.name = "Mobi";
        this.age = 2;
        this.weight = 2;
    }
    public Pet(String name, int age, float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String printInfo(){
        return getName() + " " + getAge() + " " + getWeight();
    }

    public static class PetState {

    }
}
