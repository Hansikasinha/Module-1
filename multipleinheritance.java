public class multipleinheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.play();
        d.bark();
    }
}
interface Animal{
    void eat();
}
interface Pet{
    void play();
}
//child class implementing multiple inheritance
class Dog implements Animal,Pet{
    public void eat(){
        System.out.println("dog can eat");
    }
    public void play(){
        System.out.println("dog loves to play");
    }
    public void bark(){
        System.out.println("dog barks");

    }
    

}


    