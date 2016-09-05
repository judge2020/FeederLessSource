package Client;

import java.awt.Color;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public final class ad
  extends JFrame
{
  private static JPanel c;
  private JButton d;
  private JButton e;
  JTextArea a;
  JSlider b;
  private JButton f;
  private JButton g;
  private boolean h = false;
  private a i;
  
  public ad(a parama)
  {
    setDefaultCloseOperation(2);
    setBounds(100, 100, 450, 210);
    setResizable(false);
    this.i = parama;
    parama = this;
    (c = new JPanel()).setBounds(0, 0, 450, 210);
    c.setToolTipText("This is important for us so we can keep improving Feedless. Sorry for the inconvenience.");
    c.setBackground(new Color(26, 26, 26));
    parama.setContentPane(c);
    c.setLayout(null);
    JLabel localJLabel;
    (localJLabel = new JLabel("Please take a second to rate Feedless in this match.")).setForeground(new Color(255, 255, 255));
    localJLabel.setHorizontalAlignment(0);
    localJLabel.setBounds(0, 5, 450, 20);
    c.add(localJLabel);
    parama.d = new JButton("");
    parama.d.setForeground(new Color(255, 255, 255));
    parama.d.setBackground(new Color(128, 128, 128));
    parama.d.setBounds(0, 110, 450, 29);
    parama.d.setEnabled(false);
    parama.d.setText("Move the slider to pick a rating");
    parama.d.setBorderPainted(false);
    parama.d.setFocusPainted(false);
    c.add(parama.d);
    parama.d.getModel().addChangeListener(new aj(parama.d));
    parama.b = new JSlider(0, 1, 10, 10);
    parama.b.setValue(7);
    parama.b.setMajorTickSpacing(1);
    parama.b.setBackground(new Color(26, 26, 26));
    parama.b.setForeground(new Color(255, 255, 255));
    parama.b.setBounds(40, 25, 370, 20);
    parama.b.addChangeListener(new af(parama.d));
    parama.b.setPaintTicks(true);
    c.add(parama.b);
    parama.a = new JTextArea();
    parama.a.setBounds(40, 55, 370, 50);
    parama.a.setForeground(Color.WHITE);
    parama.a.setBackground(Color.GRAY);
    parama.a.setText("Tell us any thoughts, suggestions or problems that you may have. You can also email us at eblur.ai@gmail.com");
    parama.a.setEditable(true);
    parama.a.setLineWrap(true);
    parama.a.setWrapStyleWord(true);
    c.add(parama.a);
    parama.a.addMouseListener(new ae(parama));
    parama.d.addActionListener(new ag(parama.i, parama));
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\ad.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */