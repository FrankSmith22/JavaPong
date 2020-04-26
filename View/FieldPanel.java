package View;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class FieldPanel extends JPanel {
    // Instance variable components here
    private FieldComponents fieldComponents;
    public FieldPanel(){
        setBackground(Color.BLACK);

        fieldComponents = new FieldComponents();
        fieldComponents.setPreferredSize(new Dimension(1000, 700));
        add(fieldComponents);
        fieldComponents.repaint();
        fieldComponents.revalidate();
    }

    public FieldComponents getFieldComponents(){
        return fieldComponents;
    }
}