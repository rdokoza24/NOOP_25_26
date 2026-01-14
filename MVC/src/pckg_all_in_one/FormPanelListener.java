package pckg_all_in_one;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {
    void formEventOccurred(Programmer programmer);
}
