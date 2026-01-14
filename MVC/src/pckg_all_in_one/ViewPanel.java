package pckg_all_in_one;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane txtScrollPane;


    public ViewPanel() {
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        this.textArea = new JTextArea();
        this.txtScrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(txtScrollPane, BorderLayout.CENTER);
    }

    public void setProgrammerData(Programmer programmer) {
        textArea.setText(programmer.toString());
    }
}
