package view.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoseTableListener implements ActionListener {
    JComboBox comboBox;
    Container container;

    public ChoseTableListener(JComboBox tableComboBox, Container container) {
        comboBox = tableComboBox;
        this.container = container;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tableName = String.valueOf(comboBox.getSelectedItem());
        container.setCurTable(tableName);
        container.redraw();
    }
}
