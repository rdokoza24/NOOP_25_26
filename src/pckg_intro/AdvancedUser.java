package pckg_intro;

public class AdvancedUser extends SimpleUser {

    public AdvancedUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("Performing something in a more advanced way!!");
    }
}
