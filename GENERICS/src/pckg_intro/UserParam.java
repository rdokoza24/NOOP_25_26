package pckg_intro;

public class UserParam<T extends SimpleUser> {

    private T user;

    public UserParam(T user) {
        this.user = user;
    }

    public void processUser() {
        user.performSomething();
    }
}
