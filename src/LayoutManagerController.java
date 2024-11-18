import javax.swing.*;
import java.awt.*;

public class LayoutManagerController {
    private JPanel panel;

    public LayoutManagerController(JPanel panel) {
        this.panel = panel;
    }

    public void applyFlowLayout(int hgap, int vgap) {
        panel.setLayout(new FlowLayout());
    }

    public void applyGridLayout(int rows, int cols) {
        panel.setLayout(new GridLayout(rows, cols));
    }

    public void applyBorderLayout() {
        panel.setLayout(new BorderLayout());
    }

    public void applyPadding(int top, int left, int bottom, int right) {
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, top, left));
    }
}
