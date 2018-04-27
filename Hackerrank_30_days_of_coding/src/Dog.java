public class Dog extends Animal {
    public Dog(){
        super(15);
        System.out.println("A dog  has been created");
    }
    public void eat(){
        System.out.println("A dog is eating");
    }

    public void ruff(){
        System.out.println("the dog says ruff");
    }
    public  void run(){
        System.out.println("The dog is running");
    }
    @Override
    public void sleep(){
        System.out.println("A dog is sleeping");
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.ruff();
        d.run();
        d.eat();
        d.sleep();

        //casting

        Object dog=new Dog();
        Dog realDog=(Dog) dog;
        realDog.sleep();

        System.out.println("\n\n");

        Object str="str";
        String word=(String)str;
        word.getBytes();

        System.out.println("\n\n");

        //What happens ...
        Dog doggy= new Dog();
        if(doggy instanceof Animal){
            Animal animal=(Animal)doggy;

            animal.sleep();
        }
        doggy.sleep();
    }

}
