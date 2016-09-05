package Client;

import d.b;
import d.c;
import d.d;
import d.e;
import d.f;
import d.g;
import d.h;
import d.i;
import d.j;
import d.l;
import d.n;
import d.o;
import d.p;
import d.q;
import d.r;
import d.s;
import d.t;
import d.u;
import d.v;
import d.x;
import java.awt.Dimension;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class w
  extends Thread
{
  private Socket f;
  private DataInputStream g;
  private DataOutputStream h;
  private int i;
  public ArrayList a;
  public ArrayList b;
  private long j;
  private String k;
  private int l;
  private a m;
  private long n;
  boolean c;
  private long o;
  int d;
  public static w e;
  
  public w(String paramString, int paramInt, a parama)
  {
    this.k = paramString;
    this.l = 2222;
    this.m = parama;
    this.c = false;
    this.o = System.currentTimeMillis();
    e = this;
  }
  
  public final void run()
  {
    for (;;)
    {
      Object localObject1 = this;
      if (System.currentTimeMillis() - ((w)localObject1).o > 1000L)
      {
        System.out.println("Time between socket loop " + (System.currentTimeMillis() - ((w)localObject1).o));
        ((w)localObject1).a(-1, "Socket loop between:" + (System.currentTimeMillis() - ((w)localObject1).o), true);
      }
      ((w)localObject1).o = System.currentTimeMillis();
      if (!((w)localObject1).c) {
        ((w)localObject1).c();
      }
      if ((((w)localObject1).j + 15000L < System.currentTimeMillis()) && (((w)localObject1).j != -1L))
      {
        ((w)localObject1).j = -1L;
        System.out.println("Disconnecting, ping timeout. " + System.currentTimeMillis());
        ((w)localObject1).b();
      }
      if ((((w)localObject1).f != null) && (!((w)localObject1).f.isClosed()) && (((w)localObject1).f.isConnected()))
      {
        Object localObject2;
        do
        {
          if ((localObject2 = ((w)localObject1).d()) != null)
          {
            if ((localObject2 instanceof n))
            {
              o localo = new o();
              ((w)localObject1).b.add(localo);
              ((w)localObject1).j = System.currentTimeMillis();
            }
            ((w)localObject1).a.add(localObject2);
          }
        } while (localObject2 != null);
        while (((w)localObject1).b.size() != 0) {
          ((w)localObject1).a(((w)localObject1).b.remove(0));
        }
      }
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
  
  public final void a()
  {
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.j = System.currentTimeMillis();
    this.f = new Socket();
    try
    {
      this.f.connect(new InetSocketAddress(this.k, this.l), 10000);
      this.f.setTcpNoDelay(true);
      this.c = true;
      System.out.println("Opening new socket.");
      this.g = new DataInputStream(this.f.getInputStream());
      this.h = new DataOutputStream(this.f.getOutputStream());
    }
    catch (IOException localIOException)
    {
      (localObject = localIOException).printStackTrace();
    }
    this.i = -1;
    (localObject = new g()).a = this.m.a.c;
    ((g)localObject).b = this.m.a.f;
    a(localObject);
    this.d = 0;
    Object localObject = new s(this.m.a.e.width, this.m.a.e.height, this.d);
    this.b.add(localObject);
    System.out.println("Sending ssp");
  }
  
  private void b()
  {
    this.c = false;
    try
    {
      this.f.close();
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    this.f = null;
  }
  
  private void c()
  {
    if (this.n + 10000L < System.currentTimeMillis())
    {
      this.n = System.currentTimeMillis();
      System.out.println("reconecting." + System.currentTimeMillis());
      try
      {
        b();
        this.j = System.currentTimeMillis();
        a();
        this.c = true;
        return;
      }
      catch (Exception localException2)
      {
        Exception localException1;
        (localException1 = localException2).printStackTrace();
      }
    }
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean)
  {
    paramInt = new d.w(paramInt, paramString);
    System.out.println(paramInt.toString());
    if (paramBoolean) {
      try
      {
        a(paramInt);
        return;
      }
      catch (Exception localException)
      {
        (paramInt = localException).printStackTrace();
        return;
      }
    }
    this.b.add(paramInt);
  }
  
  public final synchronized void a(Object paramObject)
  {
    try
    {
      Object localObject = (localObject = paramObject.toString()).getBytes();
      System.out.println(paramObject.toString());
      this.h.writeInt(localObject.length);
      this.h.write((byte[])localObject);
      return;
    }
    catch (IOException localIOException)
    {
      this.c = false;
      localIOException.printStackTrace();
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
      a(-1, "Exception,  send_packet " + localException1.getMessage(), false);
    }
  }
  
  private Object d()
  {
    try
    {
      if (this.i == -1)
      {
        if (this.g.available() >= 4) {
          this.i = this.g.readInt();
        }
      }
      else if (this.g.available() >= this.i)
      {
        localObject1 = new byte[this.i];
        this.g.readFully((byte[])localObject1);
        this.i = -1;
        String str;
        Object localObject2;
        if ((str = ((String)localObject2).equals("Friend_Code") ? new e(str) : ((String)localObject2).equals("Enter_Raffel") ? new d(str) : ((String)localObject2).equals("Email_Register") ? new c(str) : ((String)localObject2).equals("Raffel_Update") ? new p(str) : ((String)localObject2).equals("Tracking") ? new d.w(str) : ((String)localObject2).equals("Donators") ? new v(str) : ((String)localObject2).equals("Restart") ? new r((byte)0) : ((String)localObject2).equals("SessionState") ? new s(str) : ((String)localObject2).equals("HeroPick") ? new i(str) : ((String)localObject2).equals("Stats_Window") ? new u(str) : ((String)localObject2).equals("RateGame") ? new q(str) : ((String)localObject2).equals("Pong") ? new o((byte)0) : ((String)localObject2).equals("Ping") ? new n((byte)0) : ((String)localObject2).equals("GameOver") ? new f(str) : ((String)localObject2).equals("Account") ? new d.a(str) : ((String)localObject2).equals("Hello") ? new g(str) : ((String)localObject2).equals("Option") ? new l(str) : ((String)localObject2).equals("ActionEvent") ? new b(str) : ((String)localObject2).equals("MapInfo") ? new j(str) : ((String)localObject2).equals("Speech") ? new t(str) : ((String)localObject2).equals("Update") ? new x(str) : (localObject2 = (localObject2 = (localObject2 = A.b(str = localObject1 = new String((byte[])localObject1))).getDocumentElement()).getElementsByTagName("PacketType").item(0).getTextContent()).equals("HeroList") ? new h(str) : null) == null)
        {
          System.out.println("Client, failure to create packet from xml:" + (String)localObject1);
          a(-1, "Client, failure to create packet from xml:" + ((String)localObject1).replaceAll("<", "(").replaceAll(">", ")"), false);
        }
        return str;
      }
    }
    catch (IOException localIOException)
    {
      (localObject1 = localIOException).printStackTrace();
    }
    catch (Exception localException)
    {
      Object localObject1;
      (localObject1 = localException).printStackTrace();
      a(-1, "Error reading" + ((Exception)localObject1).getMessage(), true);
    }
    return null;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\w.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */