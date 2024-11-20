package hmi.graphicslibrary;

import javax.swing.*;
import java.awt.*;

public class TransparentPanel extends JPanel {

    public TransparentPanel() {
        setOpaque(false);
    }

    public TransparentPanel(LayoutManager layoutManager) {
        super(layoutManager);
        setOpaque(false);
    }
}
