abstract class Person {
    //TODO 1: declare Person attributes name and age here
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getDetails() {
        //TODO 2: print name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}