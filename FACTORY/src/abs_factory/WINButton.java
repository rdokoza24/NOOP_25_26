package abs_factory;

import java.awt.event.ActionListener;

public class WINButton implements Button {

    @Override
    public void renderButton() {
        System.out.println("Rendering Windows Button");
    }

}
