package b;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.InetSocketAddress;

public final class c
  extends Thread
{
  public boolean a;
  public boolean b;
  public Object c;
  public b d;
  private HttpServer e;
  private PrintWriter f;
  
  /* Error */
  public c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 103	java/lang/Thread:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 54	b/c:a	Z
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 55	b/c:b	Z
    //   14: aload_0
    //   15: new 35	java/lang/Object
    //   18: dup
    //   19: invokespecial 90	java/lang/Object:<init>	()V
    //   22: putfield 56	b/c:c	Ljava/lang/Object;
    //   25: ldc 18
    //   27: astore_1
    //   28: ldc 1
    //   30: ldc 15
    //   32: ldc 16
    //   34: invokestatic 66	b/j:a	(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_1
    //   38: goto +35 -> 73
    //   41: dup
    //   42: astore_2
    //   43: invokevirtual 88	java/lang/Exception:printStackTrace	()V
    //   46: getstatic 53	Client/w:e	LClient/w;
    //   49: iconst_m1
    //   50: new 37	java/lang/StringBuilder
    //   53: dup
    //   54: ldc 10
    //   56: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   59: aload_2
    //   60: invokevirtual 87	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   63: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: iconst_0
    //   70: invokevirtual 63	Client/w:a	(ILjava/lang/String;Z)V
    //   73: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   76: aload_1
    //   77: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   80: new 29	java/io/File
    //   83: dup
    //   84: new 37	java/lang/StringBuilder
    //   87: dup
    //   88: aload_1
    //   89: invokestatic 95	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: ldc 5
    //   97: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   106: astore_2
    //   107: new 47	java/util/ArrayList
    //   110: dup
    //   111: invokespecial 108	java/util/ArrayList:<init>	()V
    //   114: dup
    //   115: astore_3
    //   116: aload_1
    //   117: invokevirtual 109	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   120: pop
    //   121: aconst_null
    //   122: astore_1
    //   123: new 28	java/io/BufferedReader
    //   126: dup
    //   127: new 30	java/io/FileReader
    //   130: dup
    //   131: aload_2
    //   132: invokespecial 82	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   135: invokespecial 72	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   138: astore_1
    //   139: goto +123 -> 262
    //   142: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   145: aload_2
    //   146: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   149: aload_2
    //   150: aload_2
    //   151: ldc 3
    //   153: invokevirtual 92	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   156: iconst_1
    //   157: iadd
    //   158: invokevirtual 93	java/lang/String:substring	(I)Ljava/lang/String;
    //   161: dup
    //   162: astore 4
    //   164: iconst_0
    //   165: aload 4
    //   167: ldc 3
    //   169: invokevirtual 92	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   172: invokevirtual 94	java/lang/String:substring	(II)Ljava/lang/String;
    //   175: astore_2
    //   176: aload 4
    //   178: aload 4
    //   180: ldc 3
    //   182: invokevirtual 92	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   185: iconst_1
    //   186: iadd
    //   187: invokevirtual 93	java/lang/String:substring	(I)Ljava/lang/String;
    //   190: dup
    //   191: astore 5
    //   193: aload 5
    //   195: ldc 3
    //   197: invokevirtual 92	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   200: iconst_1
    //   201: iadd
    //   202: invokevirtual 93	java/lang/String:substring	(I)Ljava/lang/String;
    //   205: dup
    //   206: astore 5
    //   208: iconst_0
    //   209: aload 5
    //   211: ldc 3
    //   213: invokevirtual 92	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   216: invokevirtual 94	java/lang/String:substring	(II)Ljava/lang/String;
    //   219: astore 5
    //   221: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   224: new 37	java/lang/StringBuilder
    //   227: dup
    //   228: aload_2
    //   229: invokestatic 95	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   232: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   235: ldc 2
    //   237: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: aload 5
    //   242: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   248: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   251: aload_3
    //   252: aload 5
    //   254: invokevirtual 109	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   257: pop
    //   258: goto +4 -> 262
    //   261: pop
    //   262: aload_1
    //   263: invokevirtual 74	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   266: dup
    //   267: astore_2
    //   268: ifnonnull -126 -> 142
    //   271: goto +46 -> 317
    //   274: dup
    //   275: astore_2
    //   276: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   279: aload_1
    //   280: ifnull +49 -> 329
    //   283: aload_1
    //   284: invokevirtual 73	java/io/BufferedReader:close	()V
    //   287: goto +42 -> 329
    //   290: dup
    //   291: astore_1
    //   292: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   295: goto +34 -> 329
    //   298: astore_2
    //   299: aload_1
    //   300: ifnull +15 -> 315
    //   303: aload_1
    //   304: invokevirtual 73	java/io/BufferedReader:close	()V
    //   307: goto +8 -> 315
    //   310: dup
    //   311: astore_1
    //   312: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   315: aload_2
    //   316: athrow
    //   317: aload_1
    //   318: invokevirtual 73	java/io/BufferedReader:close	()V
    //   321: goto +8 -> 329
    //   324: dup
    //   325: astore_1
    //   326: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   329: aload_3
    //   330: invokevirtual 110	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   333: astore 4
    //   335: goto +288 -> 623
    //   338: aload 4
    //   340: invokeinterface 112 1 0
    //   345: checkcast 36	java/lang/String
    //   348: astore_2
    //   349: new 29	java/io/File
    //   352: dup
    //   353: new 37	java/lang/StringBuilder
    //   356: dup
    //   357: aload_2
    //   358: invokestatic 95	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   361: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   364: ldc 17
    //   366: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   372: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   375: astore_2
    //   376: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   379: aload_2
    //   380: invokevirtual 85	java/io/PrintStream:println	(Ljava/lang/Object;)V
    //   383: aload_2
    //   384: invokevirtual 79	java/io/File:listFiles	()[Ljava/io/File;
    //   387: dup
    //   388: astore 5
    //   390: ifnull +233 -> 623
    //   393: aload 5
    //   395: dup
    //   396: astore 5
    //   398: arraylength
    //   399: istore_3
    //   400: iconst_0
    //   401: istore_1
    //   402: goto +216 -> 618
    //   405: aload 5
    //   407: iload_1
    //   408: aaload
    //   409: dup
    //   410: astore_2
    //   411: invokevirtual 78	java/io/File:getName	()Ljava/lang/String;
    //   414: ldc 19
    //   416: invokevirtual 91	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   419: ifeq +196 -> 615
    //   422: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   425: new 37	java/lang/StringBuilder
    //   428: dup
    //   429: ldc 14
    //   431: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   434: aload_2
    //   435: invokevirtual 77	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   438: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   447: new 29	java/io/File
    //   450: dup
    //   451: new 37	java/lang/StringBuilder
    //   454: dup
    //   455: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   458: aload_2
    //   459: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   462: ldc 6
    //   464: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   473: dup
    //   474: astore_2
    //   475: invokevirtual 76	java/io/File:exists	()Z
    //   478: ifne +8 -> 486
    //   481: aload_2
    //   482: invokevirtual 80	java/io/File:mkdir	()Z
    //   485: pop
    //   486: new 29	java/io/File
    //   489: dup
    //   490: new 37	java/lang/StringBuilder
    //   493: dup
    //   494: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   497: aload_2
    //   498: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   501: ldc 7
    //   503: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   512: dup
    //   513: astore_2
    //   514: invokevirtual 76	java/io/File:exists	()Z
    //   517: ifne +85 -> 602
    //   520: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   523: ldc 12
    //   525: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   528: new 29	java/io/File
    //   531: dup
    //   532: ldc 20
    //   534: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   537: invokevirtual 81	java/io/File:toURI	()Ljava/net/URI;
    //   540: invokestatic 107	java/nio/file/Paths:get	(Ljava/net/URI;)Ljava/nio/file/Path;
    //   543: aload_2
    //   544: invokevirtual 81	java/io/File:toURI	()Ljava/net/URI;
    //   547: invokestatic 107	java/nio/file/Paths:get	(Ljava/net/URI;)Ljava/nio/file/Path;
    //   550: iconst_1
    //   551: anewarray 43	java/nio/file/CopyOption
    //   554: dup
    //   555: iconst_0
    //   556: getstatic 62	java/nio/file/StandardCopyOption:REPLACE_EXISTING	Ljava/nio/file/StandardCopyOption;
    //   559: aastore
    //   560: invokestatic 106	java/nio/file/Files:copy	(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    //   563: pop
    //   564: goto +51 -> 615
    //   567: dup
    //   568: astore_2
    //   569: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   572: getstatic 53	Client/w:e	LClient/w;
    //   575: iconst_m1
    //   576: new 37	java/lang/StringBuilder
    //   579: dup
    //   580: ldc 13
    //   582: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   585: aload_2
    //   586: invokevirtual 83	java/io/IOException:getMessage	()Ljava/lang/String;
    //   589: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   595: iconst_0
    //   596: invokevirtual 63	Client/w:a	(ILjava/lang/String;Z)V
    //   599: goto +16 -> 615
    //   602: aload_0
    //   603: iconst_1
    //   604: putfield 55	b/c:b	Z
    //   607: goto +8 -> 615
    //   610: dup
    //   611: astore_2
    //   612: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   615: iinc 1 1
    //   618: iload_1
    //   619: iload_3
    //   620: if_icmplt -215 -> 405
    //   623: aload 4
    //   625: invokeinterface 111 1 0
    //   630: ifne -292 -> 338
    //   633: aload_0
    //   634: invokestatic 64	b/c:c	()Lcom/sun/net/httpserver/HttpServer;
    //   637: putfield 58	b/c:e	Lcom/sun/net/httpserver/HttpServer;
    //   640: aload_0
    //   641: getfield 58	b/c:e	Lcom/sun/net/httpserver/HttpServer;
    //   644: ifnonnull +31 -> 675
    //   647: getstatic 61	java/lang/System:out	Ljava/io/PrintStream;
    //   650: ldc 11
    //   652: invokevirtual 86	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   655: getstatic 53	Client/w:e	LClient/w;
    //   658: iconst_m1
    //   659: ldc 9
    //   661: iconst_0
    //   662: invokevirtual 63	Client/w:a	(ILjava/lang/String;Z)V
    //   665: ldc2_w 49
    //   668: invokestatic 104	java/lang/Thread:sleep	(J)V
    //   671: iconst_0
    //   672: invokestatic 102	java/lang/System:exit	(I)V
    //   675: aload_0
    //   676: getfield 58	b/c:e	Lcom/sun/net/httpserver/HttpServer;
    //   679: ldc 4
    //   681: new 25	b/d
    //   684: dup
    //   685: aload_0
    //   686: aload_0
    //   687: getfield 59	b/c:f	Ljava/io/PrintWriter;
    //   690: invokespecial 65	b/d:<init>	(Lb/c;Ljava/io/PrintWriter;)V
    //   693: invokevirtual 68	com/sun/net/httpserver/HttpServer:createContext	(Ljava/lang/String;Lcom/sun/net/httpserver/HttpHandler;)Lcom/sun/net/httpserver/HttpContext;
    //   696: pop
    //   697: aload_0
    //   698: getfield 58	b/c:e	Lcom/sun/net/httpserver/HttpServer;
    //   701: aconst_null
    //   702: invokevirtual 69	com/sun/net/httpserver/HttpServer:setExecutor	(Ljava/util/concurrent/Executor;)V
    //   705: aload_0
    //   706: getfield 58	b/c:e	Lcom/sun/net/httpserver/HttpServer;
    //   709: invokevirtual 70	com/sun/net/httpserver/HttpServer:start	()V
    //   712: return
    //   713: dup
    //   714: astore_2
    //   715: invokevirtual 88	java/lang/Exception:printStackTrace	()V
    //   718: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	719	0	this	c
    //   0	719	1	paramString	String
    //   42	234	2	localObject1	Object
    //   298	18	2	localObject2	Object
    //   348	367	2	localObject3	Object
    //   115	215	3	localArrayList	java.util.ArrayList
    //   399	222	3	str	String
    //   162	462	4	localObject4	Object
    //   191	215	5	localObject5	Object
    //   41	1	9	localException1	Exception
    //   261	1	10	localException2	Exception
    //   274	1	11	localIOException1	IOException
    //   290	1	12	localIOException2	IOException
    //   310	1	13	localIOException3	IOException
    //   324	1	14	localIOException4	IOException
    //   567	1	15	localIOException5	IOException
    //   610	1	16	localIOException6	IOException
    //   713	1	17	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   28	38	41	java/lang/Exception
    //   149	258	261	java/lang/Exception
    //   123	271	274	java/io/IOException
    //   279	287	290	java/io/IOException
    //   123	279	298	finally
    //   299	307	310	java/io/IOException
    //   317	321	324	java/io/IOException
    //   520	564	567	java/io/IOException
    //   422	607	610	java/io/IOException
    //   633	712	713	java/lang/Exception
  }
  
  private static HttpServer c()
  {
    long l = System.currentTimeMillis();
    do
    {
      Object localObject;
      try
      {
        return localObject = HttpServer.create(new InetSocketAddress("localhost", 4000), 0);
      }
      catch (BindException localBindException)
      {
        System.err.println("Already running22.");
      }
      catch (IOException localIOException)
      {
        (localObject = localIOException).printStackTrace();
      }
      try
      {
        Thread.sleep(2000L);
      }
      catch (InterruptedException localInterruptedException)
      {
        (localObject = localInterruptedException).printStackTrace();
      }
    } while (System.currentTimeMillis() - l <= 20000L);
    return null;
  }
  
  public final b a()
  {
    synchronized (this.c)
    {
      b localb = this.d;
      this.d = null;
      return localb;
    }
  }
  
  public final void b()
  {
    this.e.stop(10);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */