public class TestAnimals {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.sound(); //เรียกใช้เมธอด sound()
        Cat myCat = new Cat("Porfor");
        myCat.sound();
        Bird myBird = new Bird("Summer");
        myBird.sound();
    }
}
