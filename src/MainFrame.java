import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;

    public MainFrame(String title){
        super(title);

        //Set layout manager
        setLayout(new BorderLayout());

        //Create swing component
        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me");

        detailsPanel = new DetailsPanel();

        //Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
        c.add(detailsPanel, BorderLayout.WEST);

        });
    }

}
