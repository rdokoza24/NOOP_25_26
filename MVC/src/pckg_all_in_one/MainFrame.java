package pckg_all_in_one;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;

    public MainFrame() {

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("MVC Example");

        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void initComponents() {
        this.viewPanel = new ViewPanel();
        this.formPanel = new FormPanel();

    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
           @Override
           public void formEventOccurred(Programmer programmer) {
                viewPanel.setProgrammerData(programmer);
           }
        });
    }
}
