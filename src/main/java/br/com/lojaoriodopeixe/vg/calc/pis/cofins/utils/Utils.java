package br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vagner
 */
public class Utils {

    public Utils() {
    }

    public boolean caracterCheck(String value) {
        if (value == null) {
            return false;
        }
        for (char character : value.toCharArray()) {
            if (character == ',') {
                return false;
            }
        }
        return true;
    }

    public void centerWindow(Component frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();

        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }

        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }

        frame.setLocation((screenSize.width - frameSize.width) >> 1, (screenSize.height - frameSize.height) >> 1);

    }

    public void nextFieldWithEnter(JFrame frame) {
        // Colocando enter para pular de campo
        HashSet conj = new HashSet(frame.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        frame.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

}
