public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " say: Woof!");
    }
}
