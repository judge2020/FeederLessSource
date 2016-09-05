package Client;

import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.LineBorder;
import javax.swing.text.Document;

public final class a
  extends JFrame
{
  public ClientAlphaRelease a;
  public String b;
  JLabel c;
  JLabel d;
  String e;
  private JLabel o;
  private JLabel p;
  private JLabel q;
  private JLabel r;
  private JButton s;
  private JPanel t;
  private JPanel u;
  private JScrollPane v;
  public JPanel f;
  private JPanel w;
  private JPanel x;
  private JPanel y;
  JPanel g;
  JPanel h;
  private JPanel z;
  private JScrollPane A;
  private JPanel B;
  public T i;
  private JCheckBox C;
  private JTextField D;
  private JButton E;
  private JButton F;
  private JButton G;
  private JButton H;
  private JButton I;
  private JButton J;
  private JButton K;
  private JSlider L;
  private JComboBox M;
  private File N;
  ArrayList j;
  private JButton O;
  private JButton P;
  CardLayout k;
  private ad Q;
  PostGameAnalytics.c l;
  private TrayIcon R;
  private SystemTray S;
  public ArrayList m;
  public ArrayList n;
  private HashMap T;
  private ArrayList U;
  private ArrayList V;
  private ArrayList W;
  
  public a(ClientAlphaRelease paramClientAlphaRelease)
  {
    this.a = paramClientAlphaRelease;
    if (SystemTray.isSupported())
    {
      this.S = SystemTray.getSystemTray();
      paramClientAlphaRelease = new PopupMenu();
      (localObject = new MenuItem("Open")).addActionListener(new l(this));
      paramClientAlphaRelease.add((MenuItem)localObject);
      a locala = this;
      (localObject = new MenuItem("Exit")).addActionListener(new m(this, locala));
      paramClientAlphaRelease.add((MenuItem)localObject);
      Object localObject = (localObject = (localObject = new ImageIcon("logo.png")).getImage()).getScaledInstance(32, 32, 4);
      this.R = new TrayIcon((Image)localObject, "Feedless", paramClientAlphaRelease);
      this.R.setImageAutoSize(true);
    }
    else
    {
      System.out.println("system tray not supported");
    }
    try
    {
      this.S.add(this.R);
    }
    catch (AWTException localAWTException)
    {
      (paramClientAlphaRelease = localAWTException).printStackTrace();
    }
    setResizable(false);
    setDefaultCloseOperation(2);
    setTitle("Feedless");
    setBounds(200, 200, 300, 600);
    d();
  }
  
  private void d()
  {
    this.b = "Not connected!";
    this.e = "";
    this.w = new JPanel();
    this.w.setBackground(new Color(26, 26, 26));
    this.w.setBounds(0, 0, 300, 600);
    this.w.setLayout(null);
    this.i = new T(this);
    this.w.add(this.i);
    try
    {
      localObject1 = new ImageIcon("logo.png");
      setIconImage(((ImageIcon)localObject1).getImage());
    }
    catch (Exception localException)
    {
      (localObject1 = localException).printStackTrace();
    }
    this.w.setLayout(null);
    (localObject1 = new JLabel("")).setBounds(0, 5, 300, 50);
    ((JLabel)localObject1).setAlignmentX(0.5F);
    ((JLabel)localObject1).setHorizontalAlignment(0);
    ((JLabel)localObject1).setAlignmentY(0.0F);
    Object localObject2 = (localObject2 = (localObject2 = new ImageIcon("logo.png")).getImage()).getScaledInstance(50, 50, 4);
    localObject2 = new ImageIcon((Image)localObject2);
    ((JLabel)localObject1).setIcon((Icon)localObject2);
    this.w.add((Component)localObject1);
    this.c = new JLabel("Server Connection");
    this.c.setBounds(0, 380, 294, 20);
    this.c.setVerticalAlignment(1);
    this.c.setVerticalTextPosition(1);
    this.c.setAlignmentX(0.5F);
    this.c.setHorizontalTextPosition(0);
    this.c.setHorizontalAlignment(0);
    this.c.setForeground(Color.WHITE);
    this.c.setFont(this.c.getFont().deriveFont(this.c.getFont().getStyle() | 0x1));
    this.w.add(this.c);
    this.d = new JLabel(this.e);
    this.d.setBounds(0, 400, 294, 20);
    this.d.setHorizontalAlignment(0);
    this.d.setVerticalAlignment(3);
    this.d.setAlignmentY(1.0F);
    this.d.setAlignmentX(0.5F);
    this.d.setFont(this.d.getFont().deriveFont(this.d.getFont().getStyle() | 0x1));
    this.d.setForeground(Color.WHITE);
    this.d.setText("waiting");
    this.w.add(this.d);
    Object localObject1 = (localObject2 = (localObject1 = new ImageIcon("gear.png")).getImage()).getScaledInstance(25, 25, 4);
    localObject1 = new ImageIcon((Image)localObject1);
    this.G = new JButton("SETTINGS", (Icon)localObject1);
    this.G.setIconTextGap(7);
    this.G.setHorizontalAlignment(0);
    this.G.setBounds(0, 0, 110, 35);
    this.G.setBackground(new Color(153, 153, 153));
    this.G.setForeground(new Color(255, 255, 255));
    this.G.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    this.G.setFocusPainted(false);
    this.w.add(this.G);
    this.P = new JButton("INSTRUCTIONS");
    this.P.setHorizontalAlignment(0);
    this.P.setBounds(190, 0, 110, 35);
    this.P.setBackground(new Color(153, 153, 153));
    this.P.setForeground(new Color(255, 255, 255));
    this.P.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    this.P.setFocusPainted(false);
    this.w.add(this.P);
    this.h = new JPanel();
    this.h.setBounds(0, 430, 294, 170);
    this.h.setBackground(new Color(26, 26, 26));
    this.w.add(this.h);
    this.h.setLayout(null);
    this.O = new JButton("<HTML>  Click here if Feedless<BR>doesn't find your game</HTML>");
    this.O.setBounds(22, 45, 250, 50);
    this.O.setHorizontalAlignment(0);
    this.O.setBackground(new Color(153, 153, 153));
    this.O.setForeground(new Color(255, 255, 255));
    this.O.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    this.O.setFocusPainted(false);
    this.h.add(this.O);
    this.g = new JPanel();
    this.g.setBounds(0, 430, 294, 170);
    this.g.setBackground(new Color(26, 26, 26));
    this.g.setLayout(null);
    this.g.setVisible(false);
    this.w.add(this.g);
    this.o = new JLabel("Built by the guys at eBlur");
    this.g.add(this.o);
    this.o.setBounds(0, 90, 294, 20);
    this.o.setHorizontalAlignment(0);
    this.o.setHorizontalTextPosition(0);
    this.o.setForeground(new Color(153, 153, 153));
    this.q = new JLabel("<html><font>Help us get more users</font></html>");
    this.g.add(this.q);
    this.q.setBounds(0, 0, 294, 20);
    this.q.setHorizontalTextPosition(0);
    this.q.setHorizontalAlignment(0);
    this.q.setForeground(new Color(153, 153, 153));
    this.q = new JLabel("<html><font>so we can make Feedless better.</font></html>");
    this.g.add(this.q);
    this.q.setBounds(0, 18, 294, 20);
    this.q.setHorizontalTextPosition(0);
    this.q.setHorizontalAlignment(0);
    this.q.setForeground(new Color(153, 153, 153));
    this.p = new JLabel("Pls report any problems to eblur.ai@gmail.com");
    this.g.add(this.p);
    this.p.setBounds(0, 108, 294, 20);
    this.p.setHorizontalAlignment(0);
    this.p.setHorizontalTextPosition(0);
    this.p.setForeground(new Color(153, 153, 153));
    localObject1 = (localObject2 = (localObject1 = new ImageIcon("TwitterLogo_white.png")).getImage()).getScaledInstance(25, 25, 4);
    localObject1 = new ImageIcon((Image)localObject1);
    (localObject1 = new JButton("Tweet on ", (Icon)localObject1)).setBounds(27, 41, 120, 29);
    ((JButton)localObject1).setIconTextGap(5);
    ((JButton)localObject1).setHorizontalTextPosition(10);
    ((JButton)localObject1).setHorizontalAlignment(0);
    ((JButton)localObject1).setBackground(new Color(153, 153, 153));
    ((JButton)localObject1).setForeground(new Color(255, 255, 255));
    ((JButton)localObject1).setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    ((JButton)localObject1).setFocusPainted(false);
    ((JButton)localObject1).getModel().addChangeListener(new u((JButton)localObject1));
    ((JButton)localObject1).addActionListener(new t("https://twitter.com/home?status=www.eblur.co.uk"));
    this.g.add((Component)localObject1);
    localObject1 = (localObject2 = (localObject1 = new ImageIcon("facebook-512.png")).getImage()).getScaledInstance(20, 20, 4);
    localObject1 = new ImageIcon((Image)localObject1);
    (localObject1 = new JButton("Share on ", (Icon)localObject1)).setBounds(152, 41, 120, 29);
    ((JButton)localObject1).setIconTextGap(5);
    ((JButton)localObject1).setHorizontalTextPosition(10);
    ((JButton)localObject1).setHorizontalAlignment(0);
    ((JButton)localObject1).setBackground(new Color(153, 153, 153));
    ((JButton)localObject1).setForeground(new Color(255, 255, 255));
    ((JButton)localObject1).setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    ((JButton)localObject1).setFocusPainted(false);
    ((JButton)localObject1).getModel().addChangeListener(new u((JButton)localObject1));
    ((JButton)localObject1).addActionListener(new t("https://www.facebook.com/sharer/sharer.php?u=www.eblur.co.uk"));
    this.g.add((Component)localObject1);
    this.t = new JPanel();
    this.t.setBackground(new Color(26, 26, 26));
    this.t.setLayout(null);
    this.u = new JPanel();
    this.u.setBackground(new Color(26, 26, 26));
    this.u.setLayout(null);
    this.s = new JButton("Save and Back");
    this.s.setBackground(new Color(128, 128, 128));
    this.s.setForeground(new Color(255, 255, 255));
    this.s.setBorderPainted(false);
    this.s.setBounds(0, 535, 294, 29);
    this.s.setFocusPainted(false);
    this.t.add(this.s);
    this.r = new JLabel("General Settings");
    this.r.setHorizontalAlignment(0);
    this.r.setHorizontalTextPosition(0);
    this.r.setBounds(0, 20, 294, 22);
    this.r.setFont(new Font("Tahoma", 1, 18));
    this.r.setForeground(new Color(255, 255, 255));
    this.r.setBackground(new Color(255, 255, 255));
    this.u.add(this.r);
    this.H = new JButton("Favourite Heroes Selection");
    this.H.setForeground(Color.WHITE);
    this.H.setBorderPainted(false);
    this.H.setBackground(Color.GRAY);
    this.H.setBounds(0, 500, 294, 29);
    this.H.setFocusPainted(false);
    this.t.add(this.H);
    this.C = new JCheckBox("Start Feedless when Windows starts");
    this.C.setToolTipText("This makes Feedless start whenever you boot windows (Doesn't impact windows performance)");
    this.C.setSelected(A.m);
    this.C.setBounds(20, 55, 216, 29);
    this.C.setSize(294, 20);
    this.C.setForeground(new Color(255, 255, 255));
    this.C.setBackground(new Color(26, 26, 26));
    this.u.add(this.C);
    (localObject1 = new JLabel("Sound Volume", 0)).setAlignmentX(0.5F);
    ((JLabel)localObject1).setBackground(new Color(26, 26, 26));
    ((JLabel)localObject1).setForeground(new Color(255, 255, 255));
    ((JLabel)localObject1).setBounds(0, 85, 294, 20);
    this.u.add((Component)localObject1);
    this.L = new JSlider(0, 1, 10, 10);
    this.L.setValue((int)(A.k * 10.0D));
    this.L.setMajorTickSpacing(1);
    this.L.setBackground(new Color(26, 26, 26));
    this.L.setForeground(new Color(255, 255, 255));
    this.L.setBounds(47, 105, 200, 13);
    this.L.setPaintTicks(true);
    this.u.add(this.L);
    localObject1 = new String[] { "Neutral male", "Slow Neutral male", "Squicky British girl", "Enthusiastic male", "Smooth male", "Slightly less british girl", "Trusted Mary" };
    int i1 = 0;
    Object localObject3 = localObject1;
    JLabel localJLabel;
    for (int i2 = 0; i2 < 7; i2++)
    {
      if ((localJLabel = localObject3[i2]).equals(A.l)) {
        break;
      }
      i1++;
    }
    this.M = new JComboBox((Object[])localObject1);
    this.M.setSelectedIndex(i1);
    this.M.setBounds(47, 125, 200, 25);
    this.u.add(this.M);
    this.M.addActionListener(new v(this.a));
    this.K = new JButton("Debug Panel");
    this.K.setHorizontalAlignment(0);
    this.K.setBounds(47, 165, 200, 30);
    this.K.setBackground(new Color(153, 153, 153));
    this.K.setForeground(new Color(255, 255, 255));
    this.K.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
    this.K.setFocusPainted(false);
    this.u.add(this.K);
    (localJLabel = new JLabel("Advice Settings")).setHorizontalAlignment(0);
    localJLabel.setHorizontalTextPosition(0);
    localJLabel.setBounds(0, 210, 294, 22);
    localJLabel.setFont(new Font("Tahoma", 1, 18));
    localJLabel.setForeground(new Color(255, 255, 255));
    localJLabel.setBackground(new Color(255, 255, 255));
    this.u.add(localJLabel);
    this.v = new JScrollPane(this.u, 22, 31);
    this.v.setLayout(new ScrollPaneLayout());
    this.v.setBounds(0, 0, 294, 500);
    this.v.getVerticalScrollBar().setUnitIncrement(15);
    this.t.add(this.v);
    this.z = new JPanel();
    this.z.setBackground(new Color(26, 26, 26));
    this.z.setLayout(null);
    JPanel localJPanel;
    (localJPanel = new JPanel()).setBackground(new Color(26, 26, 26));
    localJPanel.setBounds(0, 0, 294, 108);
    this.z.add(localJPanel);
    localJPanel.setLayout(null);
    this.D = new JTextField();
    this.D.setBounds(10, 75, 269, 26);
    localJPanel.add(this.D);
    this.D.setForeground(Color.GRAY);
    this.D.setHorizontalAlignment(0);
    this.D.setText("Search");
    this.E = new JButton("Save and Back");
    this.E.setBounds(0, 5, 294, 29);
    localJPanel.add(this.E);
    this.E.setForeground(Color.WHITE);
    this.E.setBorderPainted(false);
    this.E.setBackground(Color.GRAY);
    this.E.setFocusPainted(false);
    this.F = new JButton("Unselect All");
    this.F.setBounds(0, 40, 294, 29);
    localJPanel.add(this.F);
    this.F.setForeground(Color.WHITE);
    this.F.setBorderPainted(false);
    this.F.setBackground(Color.GRAY);
    this.F.setFocusPainted(false);
    this.B = new JPanel();
    this.B.setBackground(new Color(26, 26, 26));
    this.B.setLayout(null);
    this.A = new JScrollPane(this.B, 22, 31);
    this.A.setLayout(new ScrollPaneLayout());
    this.A.setBounds(0, 109, 294, 443);
    this.A.getVerticalScrollBar().setUnitIncrement(15);
    this.z.add(this.A);
    this.x = new JPanel();
    this.x.setBackground(new Color(26, 26, 26));
    this.x.setLayout(null);
    this.I = new JButton("Back to main window");
    this.I.setBounds(0, 500, 294, 29);
    this.I.setForeground(Color.WHITE);
    this.I.setBorderPainted(false);
    this.I.setBackground(Color.GRAY);
    this.I.setFocusPainted(false);
    this.x.add(this.I);
    (localObject1 = new JLabel("<HTML>1 - Make sure you have restarted Dota after installing Feedless.<BR><BR>2 - If you restarted Dota and Feedless is still not finding your game your probably have Dota installed on a different directory and/or drive than Steam. Head to where you installed Feedless, copy the file called \"gamestate_integration_feedless.cfg\" and paste it inside \"...dota 2 beta\\game\\dota \\cfg\\gamestate_integration\\\". Restart Dota again.<BR><BR>3 - Make sure you don't have more than one installations of Dota on your computer. If you do, repeat step 2 on every one of them.<BR><BR>4 - Still got problems? email eblur.ai@gmail.com and we'll get back to you asap.</HTML>")).setHorizontalAlignment(2);
    ((JLabel)localObject1).setForeground(Color.WHITE);
    ((JLabel)localObject1).setBounds(15, 30, 264, 486);
    this.x.add((Component)localObject1);
    this.y = new JPanel();
    this.y.setBackground(new Color(26, 26, 26));
    this.y.setLayout(null);
    this.J = new JButton("I've read the instructions");
    this.J.setBounds(0, 500, 294, 29);
    this.J.setForeground(Color.WHITE);
    this.J.setBorderPainted(false);
    this.J.setBackground(Color.GRAY);
    this.J.setFocusPainted(false);
    this.y.add(this.J);
    (localObject3 = new JLabel("<HTML> First of all,<BR>You installed Feedless and for that, we want to thank you. You're awesome!<BR><BR>Now some instructions:<BR><BR>- RESTART Dota after installing Feedless.<BR><BR>- Dota must be on BORDERLESS-WINDOW MODE.<BR><BR>- Use the STANDARD Dota mini-map icons.<BR><BR>- The ICON SIZE should be at 100% or higher.<BR><BR>- Some features like the roshan/aegis tips and post game kills/deaths heat maps only work if you're using ENGLISH as they require Feedless to read the on screen log.<br><br>- Sometimes Windows ADAPTIVE BRIGHTNESS can mess up your screen's colors. Try disabling it if something's not working right. <br><br>- Feedless has a long way to go and is being improved every day. Please email us at eblur.ai@gmail.com with any suggestions, ideas or problems.</HTML>")).setHorizontalAlignment(2);
    ((JLabel)localObject3).setForeground(Color.WHITE);
    ((JLabel)localObject3).setBounds(10, 0, 280, 500);
    this.y.add((Component)localObject3);
    this.F.addActionListener(new n(this));
    this.E.addActionListener(new o(this));
    this.D.getDocument().addDocumentListener(new p(this));
    this.D.addMouseListener(new q(this));
    this.G.addActionListener(new r(this));
    this.s.addActionListener(new s(this));
    this.H.addActionListener(new b(this));
    this.R.addMouseListener(new c(this));
    this.O.addActionListener(new d(this));
    this.I.addActionListener(new e(this));
    this.J.addActionListener(new f(this));
    this.P.addActionListener(new g(this));
    this.L.addChangeListener(new h(this));
    this.K.addActionListener(new i(this));
    this.s.getModel().addChangeListener(new u(this.s));
    this.F.getModel().addChangeListener(new u(this.F));
    this.H.getModel().addChangeListener(new u(this.H));
    this.G.getModel().addChangeListener(new u(this.G));
    this.P.getModel().addChangeListener(new u(this.P));
    this.E.getModel().addChangeListener(new u(this.E));
    this.O.getModel().addChangeListener(new u(this.O));
    this.I.getModel().addChangeListener(new u(this.I));
    this.J.getModel().addChangeListener(new u(this.J));
    this.K.getModel().addChangeListener(new u(this.K));
    this.f = new JPanel();
    this.k = new CardLayout();
    this.f.setLayout(this.k);
    this.f.add(this.w, "1");
    this.f.add(this.t, "2");
    this.f.add(this.z, "3");
    this.f.add(this.x, "4");
    this.f.add(this.y, "5");
    this.k.show(this.f, "1");
    getContentPane().add(this.f);
    e();
    this.Q = new ad(this);
    this.Q.setVisible(false);
  }
  
  public final void a(ArrayList paramArrayList)
  {
    this.n = new ArrayList();
    this.m = new ArrayList();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      Object localObject = (localObject = ((d.k)paramArrayList.get(i1)).b).split(":");
      JCheckBox localJCheckBox;
      (localJCheckBox = new JCheckBox(localObject[0])).setVisible(true);
      localJCheckBox.setSize(294, 20);
      localJCheckBox.setHorizontalAlignment(2);
      if (localObject.length > 1) {
        localJCheckBox.setToolTipText(localObject[1]);
      }
      localJCheckBox.setForeground(new Color(255, 255, 255));
      localJCheckBox.setBackground(new Color(26, 26, 26));
      localJCheckBox.setSelected(((d.k)paramArrayList.get(i1)).c == 1);
      localJCheckBox.setLocation(20, 250 + i1 * 25);
      this.u.add(localJCheckBox);
      this.n.add(Integer.valueOf(((d.k)paramArrayList.get(i1)).a));
      this.m.add(localJCheckBox);
      (localObject = this.u.getPreferredSize()).height = (localJCheckBox.getLocation().y + 100);
      this.u.setPreferredSize((Dimension)localObject);
    }
    revalidate();
    repaint();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.Q.setVisible(paramBoolean);
  }
  
  public final void a()
  {
    this.c.setForeground(Color.RED);
    this.c.setText(this.b);
    repaint();
  }
  
  public final void a(String paramString)
  {
    if (!this.e.equals(paramString))
    {
      this.e = paramString;
      this.d.setText(this.e);
      repaint();
    }
  }
  
  private void e()
  {
    a.a.a();
    ArrayList localArrayList = a.a.b();
    HashMap localHashMap = new HashMap();
    this.U = new ArrayList();
    this.V = new ArrayList();
    this.W = new ArrayList();
    Object localObject2 = localArrayList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      localHashMap.put(((String)localObject1).toLowerCase().replaceAll("_", "").replaceAll("'", "").replaceAll(" ", "").replaceAll("-", ""), localObject1);
    }
    localObject2 = (localObject1 = new File("hero_thumbnails")).listFiles();
    this.T = new HashMap();
    Object localObject1 = null;
    Object localObject3;
    Object localObject4;
    try
    {
      for (int i1 = 0; i1 < localObject2.length; i1++)
      {
        localObject3 = localObject2[i1].getName().substring(0, localObject2[i1].getName().indexOf(".png")).replaceAll(" ", "").replaceAll("'", "").replaceAll("_", "");
        localObject4 = (String)localHashMap.get(localObject3);
        localObject3 = ImageIO.read(localObject2[i1]);
        this.T.put(localObject4, localObject3);
        this.W.add(localObject4);
        if (localObject1 == null) {
          localObject1 = new Dimension(((BufferedImage)localObject3).getWidth(), ((BufferedImage)localObject3).getHeight());
        }
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    this.j = new ArrayList();
    this.j = b();
    for (int i2 = 0; i2 < localArrayList.size(); i2++)
    {
      (localObject3 = new JLabel(new ImageIcon((Image)this.T.get(this.W.get(i2))))).setName((String)this.W.get(i2));
      ((JLabel)localObject3).setSize(((Dimension)localObject1).height, ((Dimension)localObject1).width);
      ((JLabel)localObject3).setVisible(true);
      (localObject4 = new JLabel(new ImageIcon("check.png"))).setName((String)this.W.get(i2));
      ((JLabel)localObject4).setSize(((Dimension)localObject1).height, ((Dimension)localObject1).width);
      ((JLabel)localObject4).setVisible(false);
      if (this.j.contains(this.W.get(i2))) {
        ((JLabel)localObject4).setVisible(true);
      }
      ((JLabel)localObject3).setBounds(78, i2 * 75, ((Dimension)localObject1).width, ((Dimension)localObject1).height);
      ((JLabel)localObject4).setBounds(78, i2 * 75, ((Dimension)localObject1).width, ((Dimension)localObject1).height);
      ((JLabel)localObject3).addMouseListener(new j(this));
      ((JLabel)localObject4).addMouseListener(new k(this));
      this.U.add(localObject3);
      this.V.add(localObject4);
      this.B.add((Component)localObject4);
      this.B.add((Component)localObject3);
      this.B.setPreferredSize(new Dimension(300, (int)(((JLabel)localObject3).getBounds().getMaxY() + 461.5D)));
    }
  }
  
  final void b(String paramString)
  {
    if (this.j.contains(paramString)) {
      this.j.remove(this.j.lastIndexOf(paramString));
    } else {
      this.j.add(paramString);
    }
    f();
    c();
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext())
    {
      paramString = (String)localIterator.next();
      System.out.println(paramString);
    }
  }
  
  public final ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    this.N = new File("favourite_heroes.txt");
    Object localObject1;
    if ((this.N.exists()) && (!this.N.isDirectory())) {
      try
      {
        localObject1 = new BufferedReader(new FileReader(this.N));
        while ((localObject2 = ((BufferedReader)localObject1).readLine()) != null) {
          localArrayList.add(localObject2);
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        (localObject2 = localException).printStackTrace();
      }
    } else {
      try
      {
        (localObject1 = new PrintWriter(this.N, "UTF-8")).println("");
        ((PrintWriter)localObject1).close();
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        (localObject1 = localFileNotFoundException).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        (localObject1 = localUnsupportedEncodingException).printStackTrace();
      }
    }
    return localArrayList;
  }
  
  private void f()
  {
    Iterator localIterator = this.V.iterator();
    while (localIterator.hasNext())
    {
      JLabel localJLabel;
      String str = (localJLabel = (JLabel)localIterator.next()).getName();
      if (this.j.contains(str)) {
        localJLabel.setVisible(true);
      } else {
        localJLabel.setVisible(false);
      }
    }
  }
  
  final void c()
  {
    this.N = new File("favourite_heroes.txt");
    Object localObject;
    if ((this.N.exists()) && (!this.N.isDirectory())) {
      try
      {
        (localObject = new PrintWriter(this.N)).print("");
        ((PrintWriter)localObject).close();
        localObject = new PrintWriter(this.N);
        Iterator localIterator = this.j.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((PrintWriter)localObject).print(str + System.getProperty("line.separator"));
        }
        ((PrintWriter)localObject).close();
        return;
      }
      catch (Exception localException)
      {
        (localObject = localException).printStackTrace();
        return;
      }
    }
    try
    {
      (localObject = new PrintWriter(this.N, "UTF-8")).println("");
      ((PrintWriter)localObject).close();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      (localObject = localFileNotFoundException).printStackTrace();
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      (localObject = localUnsupportedEncodingException).printStackTrace();
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */