package Client;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import javax.sound.sampled.AudioInputStream;
import marytts.LocalMaryInterface;
import marytts.MaryInterface;
import marytts.util.data.audio.AudioPlayer;

public final class ak
  extends Thread
{
  private Vector a = new Vector();
  private MaryInterface b;
  private HashMap c;
  
  public ak(ClientAlphaRelease paramClientAlphaRelease)
  {
    try
    {
      this.b = new LocalMaryInterface();
      Iterator localIterator = (paramClientAlphaRelease = this.b.getAvailableVoices()).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        System.out.println(str);
      }
      this.b.setVoice((String)paramClientAlphaRelease.iterator().next());
    }
    catch (Exception localException)
    {
      (paramClientAlphaRelease = localException).printStackTrace();
    }
    paramClientAlphaRelease = this;
    this.c = new HashMap();
    paramClientAlphaRelease.c.put("Neutral male", "dfki-obadiah-hsmm");
    paramClientAlphaRelease.c.put("Slow Neutral male", "cmu-rms-hsmm");
    paramClientAlphaRelease.c.put("Squicky British girl", "dfki-poppy-hsmm");
    paramClientAlphaRelease.c.put("Enthusiastic male", "cmu-bdl-hsmm");
    paramClientAlphaRelease.c.put("Smooth male", "dfki-spike-hsmm");
    paramClientAlphaRelease.c.put("Slightly less british girl", "dfki-prudence-hsmm");
    paramClientAlphaRelease.c.put("Trusted Mary", "cmu-slt-hsmm");
    System.out.println("DONE");
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.b.setVoice((String)this.c.get(paramString));
      return;
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
  }
  
  public final void b(String paramString)
  {
    this.a.add(paramString);
  }
  
  public final void a()
  {
    this.a.clear();
  }
  
  public final void run()
  {
    for (;;)
    {
      Object localObject1 = (String)this.a.remove(0);
      try
      {
        System.out.println("speaking: " + (String)localObject1);
        this.b.setAudioEffects("Volume(Amount=" + A.k + ")");
        localObject2 = this.b.generateAudio((String)localObject1);
        (localObject2 = new AudioPlayer((AudioInputStream)localObject2)).start();
        ((AudioPlayer)localObject2).join();
      }
      catch (Exception localException)
      {
        Object localObject2;
        (localObject2 = localException).printStackTrace();
        w.e.a(-1, "Mary could not say |" + (String)localObject1 + "|", false);
      }
      while (this.a.size() == 0) {
        try
        {
          Thread.sleep(10L);
        }
        catch (InterruptedException localInterruptedException)
        {
          (localObject1 = localInterruptedException).printStackTrace();
        }
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\ak.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */