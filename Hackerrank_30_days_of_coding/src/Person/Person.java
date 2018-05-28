package Person;

import static Person.HairColor.*;


public class Person {
    HairColor hairColor=BLACK;
    public Person(){

    }

    public static void main(String[] args) {
        Person peterparker=new Person();
        Person spiderMan=peterparker;

        peterparker.hairColor=PINK;

        System.out.println("Hair color of Peter Parker: "+peterparker.hairColor);
        System.out.println("Hair color of Spider man: "+spiderMan.hairColor);
    }
}
