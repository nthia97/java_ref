public abstract class Animal {
    public int age;
    public Animal(int age){
        System.out.println("An animal has been created!");
    }
    public void sleep(){
        System.out.println("An animal is sleeping");
    }
    public abstract void eat();
}
