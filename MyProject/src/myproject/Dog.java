package myproject;

public class Dog implements IntAnimal {
    //Git Test
    String name = "Rex";
    int age;

    public Dog() {
        super();
    }

    public String sayHowDoYouDo(String name) {
        return " woof " + name;
    }

    public static void main(String[] args) {
        //Cat cat = new Cat();
        //TODO create a Cat class
        Dog myDog = new Dog();
        for (int count = 0; count < 3; count++) {
            System.out.println(count + myDog.sayHowDoYouDo("Kate"));
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
