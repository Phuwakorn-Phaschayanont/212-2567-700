public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(super.getName() + " say: meow meow!" );
    }
}
