package Client;

import d.k;
import d.l;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.JCheckBox;

final class s
  implements ActionListener
{
  s(a parama) {}
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.k.show(this.a.f, "1");
    if ((paramActionEvent = this.a).a != null)
    {
      Object localObject = paramActionEvent;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < ((a)localObject).m.size(); i++)
      {
        int j = 0;
        if (((JCheckBox)((a)localObject).m.get(i)).isSelected()) {
          j = 1;
        }
        localArrayList.add(new k(((Integer)((a)localObject).n.get(i)).intValue(), "", j));
      }
      l locall = new l(localArrayList);
      System.out.println("Sending options packet with " + locall.a.size() + " options.");
      localObject = locall;
      paramActionEvent.a.b.b.add(localObject);
    }
    a.c(this.a);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\s.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */