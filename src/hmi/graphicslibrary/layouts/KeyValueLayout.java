package hmi.graphicslibrary.layouts;

import java.awt.*;

public class KeyValueLayout implements LayoutManager {
    private int hgap = 5;
    private int vgap = 5;
    private int keyWidth = 100;

    public KeyValueLayout() {
    }

    public KeyValueLayout(int hgap, int vgap, int keyWidth) {
        this.hgap = hgap;
        this.vgap = vgap;
        this.keyWidth = keyWidth;
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // noop
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        // noop
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int totalHeight = 0;
        int totalWidth = 0;

        for (int i = 0; i < parent.getComponentCount(); i+=2) {
            Component key = parent.getComponent(i);
            Component value = parent.getComponent(i+1);

            Dimension keySize = key.getPreferredSize();
            Dimension valueSize = value.getPreferredSize();

            totalHeight += Math.max(keySize.height, valueSize.height) + vgap;
            totalWidth += Math.max(keySize.width, valueSize.width);
        }

        totalHeight -= vgap;
        Insets insets = parent.getInsets();
        return new Dimension(totalWidth + insets.left + insets.right,
                             totalHeight + insets.top + insets.bottom);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }

    @Override
    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();
        int x = insets.left;
        int y = insets.top;

        for (int i = 0; i < parent.getComponentCount(); i += 2) {
            Component key = parent.getComponent(i);
            Component value = parent.getComponent(i + 1);

            Dimension keySize = key.getPreferredSize();
            Dimension valueSize = value.getPreferredSize();

            int rowHeight = Math.max(keySize.height, valueSize.height);

            key.setBounds(x, y, keyWidth, rowHeight);
            value.setBounds(x + keyWidth + hgap, y, parent.getWidth() - (keyWidth + hgap + insets.left + insets.right), rowHeight);

            y += rowHeight + vgap;
        }
    }
}
