import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OnlyNumberTextFieldKeyAdapter extends KeyAdapter {
    String oldText;

    public void keyPressed(KeyEvent evt) {
        JTextField source = ((JTextField) evt.getSource());
        oldText = source.getText();
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        JTextField source = ((JTextField) evt.getSource());
        String currentText = oldText + evt.getKeyChar();
        try {
            Double.parseDouble(currentText);
        } catch (NumberFormatException e) {
            source.setText(oldText);
            evt.consume();
        }
    }
}