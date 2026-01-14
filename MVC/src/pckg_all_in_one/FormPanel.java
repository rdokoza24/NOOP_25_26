package pckg_all_in_one;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormPanel extends JPanel {

    private JTextField usernameField;
    private JTextField emailField;
    private JComboBox<ProgammingLangEnum> progLangCombo;
    private JList<String> levelList;
    private JRadioButton fullTimeRadio;
    private JRadioButton partTimeRadio;
    private ButtonGroup rButtonGroup;
    private JCheckBox newsletterCheck;
    private JCheckBox emailUpdate;
    private JButton submitButton;
    private JScrollPane levelListScrollPane;

    private FormPanelListener formPanelListener;



    public FormPanel() {

        Dimension dims = getMaximumSize();
        dims.height = 250;
        setPreferredSize(dims);
        Border title = BorderFactory.createTitledBorder("User Form");
        Border inner = BorderFactory.createEmptyBorder(5,5,5,5);
        Border formBorder = BorderFactory.createCompoundBorder(title, inner);
        setBorder(formBorder);


        initComponents();
        layoutComponents();
        activateFormPanel();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void initComponents() {
        this.emailField = new JTextField(10);
        this.usernameField = new JTextField(10);
        this.progLangCombo = new JComboBox<>(ProgammingLangEnum.values());
        this.progLangCombo.setSelectedIndex(-1);
        DefaultListModel<String> progLangModel = new DefaultListModel<>();
        progLangModel.addElement("Beginner");
        progLangModel.addElement("Intermediate");
        progLangModel.addElement("Advanced");
        progLangModel.addElement("Expert");
        levelList = new JList<>(progLangModel);
        levelList.setVisibleRowCount(3);
        levelListScrollPane = new JScrollPane(levelList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        fullTimeRadio = new JRadioButton("Full-Time");
        partTimeRadio = new JRadioButton("Part-Time");
        rButtonGroup = new ButtonGroup();
        rButtonGroup.add(fullTimeRadio);
        rButtonGroup.add(partTimeRadio);
        fullTimeRadio.setSelected(true);
        newsletterCheck = new JCheckBox("Subscribe to Newsletter");
        emailUpdate = new JCheckBox("Receive Email Updates");
        submitButton = new JButton("Submit");
    }

    private void layoutComponents() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Username: "), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(usernameField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Email: "), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(emailField, gbc);
        gbc.gridy = 0;
        gbc.gridx++;
        add(Box.createHorizontalStrut(15), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Programming Language: "), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(progLangCombo, gbc);
        gbc.gridx++;
        add(Box.createHorizontalStrut(15), gbc);
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Level: "), gbc);
        gbc.gridy++;
        add(levelListScrollPane, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;

        add(fullTimeRadio, gbc);
        gbc.gridy++;
        add(partTimeRadio, gbc);
        gbc.gridy--;
        gbc.gridx+=2;
        add(newsletterCheck, gbc);
        gbc.gridy++;
        add(emailUpdate, gbc);

        gbc.gridy+=2;
        gbc.gridx = 10;
        add(submitButton, gbc);




    }

    private void activateFormPanel() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (formPanelListener != null) {
                    String username = usernameField.getText();
                    String email = emailField.getText();
                    ProgammingLangEnum lang = (ProgammingLangEnum) progLangCombo.getSelectedItem();
                    String level = levelList.getSelectedValue();
                    String workingTime = fullTimeRadio.isSelected() ? "Full-Time" : "Part-Time";
                    List<String> additionalInfo = new ArrayList<>();
                    if (newsletterCheck.isSelected()) {
                        additionalInfo.add("Subscribed to Newsletter");
                    } else {
                        additionalInfo.add("Not Subscribed to Newsletter");
                    }
                    if (emailUpdate.isSelected()) {
                        additionalInfo.add("Wants Email Updates");
                    } else {
                        additionalInfo.add("Doesn't Want Email Updates");
                    }

                    Programmer programmer = new Programmer(username, email, lang, level, workingTime, additionalInfo);
                    formPanelListener.formEventOccurred(programmer);
                }

            }
        });
    }
}
