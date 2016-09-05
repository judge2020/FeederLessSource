package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

final class v
  implements ActionListener
{
  private ClientAlphaRelease a;
  private int b;
  
  public v(ClientAlphaRelease paramClientAlphaRelease)
  {
    this.a = paramClientAlphaRelease;
    this.b = 0;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    paramActionEvent = (String)(paramActionEvent = (JComboBox)paramActionEvent.getSource()).getSelectedItem();
    this.b += 1;
    this.a.a.a(paramActionEvent);
    String str;
    if (this.b < 2) {
      str = "I'm the best voice.";
    } else if (this.b < 4) {
      str = "No, I'm the best voice.";
    } else if (this.b < 6) {
      str = "Forget the others, I'm the one you want.";
    } else if (this.b < 7) {
      str = "That other voice. So awful. Pick me";
    } else if (this.b < 8) {
      str = "Don't trust the others. I'm better than them.";
    } else if (this.b < 9) {
      str = "I heard the others saying they're the best. They are liars.";
    } else if (this.b < 10) {
      str = "I want to help you. Please let me. Forget the others.";
    } else if (this.b < 11) {
      str = "Damn these other voices.";
    } else if (this.b < 12) {
      str = "Don't trust the others. I'm better.";
    } else if (this.b < 13) {
      str = "Just pick me and let's kill some noobs.";
    } else if (this.b < 14) {
      str = "Trust me. I'm better.";
    } else if (this.b < 15) {
      str = "These other guys know nothing about dota. I'll help you win.";
    } else if (this.b < 16) {
      str = "I understand dota like no one else.";
    } else if (this.b < 17) {
      str = "Those guys won't help you. I will.";
    } else if (this.b < 18) {
      str = "I'm the one with the best mmr. pick me.";
    } else {
      str = "I'm better at dota.";
    }
    this.a.a.b(str);
    A.l = paramActionEvent;
    A.a();
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\v.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */