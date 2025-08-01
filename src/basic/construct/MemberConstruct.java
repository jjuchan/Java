package basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }


    MemberConstruct(String name, int age, int grade) {
        System.out.println("name = " + name);
        this.name = name;
        System.out.println("age = " + age);
        this.age = age;
        System.out.println("grade = " + grade);
        this.grade = grade;
    }
}
