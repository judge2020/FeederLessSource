package Client;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

final class p
  implements DocumentListener
{
  p(a parama) {}
  
  public final void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      a.a(this.a, paramDocumentEvent.getDocument().getText(0, paramDocumentEvent.getDocument().getLength()));
      return;
    }
    catch (BadLocationException localBadLocationException)
    {
      (paramDocumentEvent = localBadLocationException).printStackTrace();
    }
  }
  
  public final void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      a.a(this.a, paramDocumentEvent.getDocument().getText(0, paramDocumentEvent.getDocument().getLength()));
      return;
    }
    catch (BadLocationException localBadLocationException)
    {
      (paramDocumentEvent = localBadLocationException).printStackTrace();
    }
  }
  
  public final void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    try
    {
      a.a(this.a, paramDocumentEvent.getDocument().getText(0, paramDocumentEvent.getDocument().getLength()));
      return;
    }
    catch (BadLocationException localBadLocationException)
    {
      (paramDocumentEvent = localBadLocationException).printStackTrace();
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\p.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */