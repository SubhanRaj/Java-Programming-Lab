// Java program that illustrate the multi level inheritance 
package multilevelInheritance;

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    public void weep() {
        System.out.println("Weeping...");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.eat();
        d.bark();
        d.weep();
    }
}
