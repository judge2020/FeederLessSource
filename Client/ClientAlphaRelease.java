package Client;

import b.b;
import b.g;
import b.h;
import d.f;
import d.i;
import d.p;
import d.q;
import d.r;
import d.s;
import d.t;
import d.v;
import d.x;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ClientAlphaRelease
  extends Thread
{
  private long i;
  private long j;
  private Robot k;
  private int l;
  private a m;
  private long n;
  private Dimension o;
  private long p;
  ak a;
  public w b;
  String c;
  private Boolean q;
  private File r;
  private long s;
  M d;
  private b.c t;
  private b u;
  private boolean v;
  private int w;
  private int x;
  private String[] y;
  private C z;
  private int A;
  private static boolean B = false;
  private String C;
  private String D;
  public Dimension e;
  private long E;
  private long F;
  private int G;
  private int H;
  private boolean I;
  private S J;
  public int f;
  private long K;
  private int L;
  private a.a M;
  public z g;
  public long h;
  
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new ClientAlphaRelease()).start();
  }
  
  /* Error */
  public ClientAlphaRelease()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 461	java/lang/Thread:<init>	()V
    //   4: aconst_null
    //   5: astore_1
    //   6: aload_0
    //   7: invokestatic 459	java/lang/System:currentTimeMillis	()J
    //   10: putfield 225	Client/ClientAlphaRelease:i	J
    //   13: aload_0
    //   14: invokestatic 459	java/lang/System:currentTimeMillis	()J
    //   17: putfield 226	Client/ClientAlphaRelease:j	J
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 212	Client/ClientAlphaRelease:I	Z
    //   25: aload_0
    //   26: ldc2_w 187
    //   29: putfield 214	Client/ClientAlphaRelease:K	J
    //   32: new 177	java/util/Properties
    //   35: dup
    //   36: invokespecial 470	java/util/Properties:<init>	()V
    //   39: astore_2
    //   40: aconst_null
    //   41: astore_3
    //   42: new 155	java/io/File
    //   45: dup
    //   46: ldc 85
    //   48: invokespecial 421	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: dup
    //   52: astore 4
    //   54: invokevirtual 422	java/io/File:exists	()Z
    //   57: ifeq +256 -> 313
    //   60: new 156	java/io/FileInputStream
    //   63: dup
    //   64: ldc 85
    //   66: invokespecial 424	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   69: astore_3
    //   70: aload_2
    //   71: aload_3
    //   72: invokevirtual 472	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   75: aload_2
    //   76: ldc 105
    //   78: invokevirtual 471	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic 437	java/lang/Double:parseDouble	(Ljava/lang/String;)D
    //   84: putstatic 199	Client/A:k	D
    //   87: aload_2
    //   88: ldc 103
    //   90: invokevirtual 471	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   93: putstatic 200	Client/A:l	Ljava/lang/String;
    //   96: aload_2
    //   97: ldc 100
    //   99: invokevirtual 471	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   102: invokestatic 435	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   105: putstatic 201	Client/A:m	Z
    //   108: aload_2
    //   109: ldc 89
    //   111: invokevirtual 471	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   114: invokestatic 435	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   117: putstatic 203	Client/A:o	Z
    //   120: aload_2
    //   121: ldc 107
    //   123: invokevirtual 471	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokestatic 435	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   129: putstatic 202	Client/A:n	Z
    //   132: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   135: new 171	java/lang/StringBuilder
    //   138: dup
    //   139: ldc 106
    //   141: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: getstatic 199	Client/A:k	D
    //   147: invokevirtual 453	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   150: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   156: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   159: new 171	java/lang/StringBuilder
    //   162: dup
    //   163: ldc 104
    //   165: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   168: getstatic 200	Client/A:l	Ljava/lang/String;
    //   171: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   180: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   183: new 171	java/lang/StringBuilder
    //   186: dup
    //   187: ldc 101
    //   189: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   192: getstatic 201	Client/A:m	Z
    //   195: invokevirtual 457	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   198: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   204: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   207: new 171	java/lang/StringBuilder
    //   210: dup
    //   211: ldc 90
    //   213: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: getstatic 203	Client/A:o	Z
    //   219: invokevirtual 457	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   222: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   228: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   231: new 171	java/lang/StringBuilder
    //   234: dup
    //   235: ldc 108
    //   237: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   240: getstatic 202	Client/A:n	Z
    //   243: invokevirtual 457	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   246: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   252: goto +46 -> 298
    //   255: dup
    //   256: astore_2
    //   257: invokevirtual 427	java/io/IOException:printStackTrace	()V
    //   260: aload_3
    //   261: ifnull +76 -> 337
    //   264: aload_3
    //   265: invokevirtual 428	java/io/InputStream:close	()V
    //   268: goto +69 -> 337
    //   271: dup
    //   272: astore_2
    //   273: invokevirtual 427	java/io/IOException:printStackTrace	()V
    //   276: goto +61 -> 337
    //   279: astore_1
    //   280: aload_3
    //   281: ifnull +15 -> 296
    //   284: aload_3
    //   285: invokevirtual 428	java/io/InputStream:close	()V
    //   288: goto +8 -> 296
    //   291: dup
    //   292: astore_2
    //   293: invokevirtual 427	java/io/IOException:printStackTrace	()V
    //   296: aload_1
    //   297: athrow
    //   298: aload_3
    //   299: invokevirtual 428	java/io/InputStream:close	()V
    //   302: goto +35 -> 337
    //   305: dup
    //   306: astore_2
    //   307: invokevirtual 427	java/io/IOException:printStackTrace	()V
    //   310: goto +27 -> 337
    //   313: dconst_1
    //   314: putstatic 199	Client/A:k	D
    //   317: ldc 77
    //   319: putstatic 200	Client/A:l	Ljava/lang/String;
    //   322: iconst_1
    //   323: putstatic 201	Client/A:m	Z
    //   326: iconst_0
    //   327: putstatic 202	Client/A:n	Z
    //   330: iconst_1
    //   331: putstatic 203	Client/A:o	Z
    //   334: invokestatic 350	Client/A:a	()V
    //   337: aload_0
    //   338: new 116	Client/a
    //   341: dup
    //   342: aload_0
    //   343: invokespecial 366	Client/a:<init>	(LClient/ClientAlphaRelease;)V
    //   346: putfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   349: aload_0
    //   350: new 114	Client/S
    //   353: dup
    //   354: aload_0
    //   355: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   358: invokespecial 362	Client/S:<init>	(LClient/a;)V
    //   361: putfield 213	Client/ClientAlphaRelease:J	LClient/S;
    //   364: aload_0
    //   365: getfield 213	Client/ClientAlphaRelease:J	LClient/S;
    //   368: getfield 250	Client/S:b	Z
    //   371: ifeq +15 -> 386
    //   374: getstatic 348	java/lang/System:out	Ljava/io/PrintStream;
    //   377: ldc 28
    //   379: invokevirtual 430	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   382: iconst_0
    //   383: invokestatic 460	java/lang/System:exit	(I)V
    //   386: aload_0
    //   387: getfield 213	Client/ClientAlphaRelease:J	LClient/S;
    //   390: invokevirtual 363	Client/S:start	()V
    //   393: getstatic 203	Client/A:o	Z
    //   396: ifne +25 -> 421
    //   399: aload_0
    //   400: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   403: getfield 290	Client/a:k	Ljava/awt/CardLayout;
    //   406: aload_0
    //   407: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   410: getfield 286	Client/a:f	Ljavax/swing/JPanel;
    //   413: ldc 24
    //   415: invokevirtual 403	java/awt/CardLayout:show	(Ljava/awt/Container;Ljava/lang/String;)V
    //   418: goto +22 -> 440
    //   421: aload_0
    //   422: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   425: getfield 290	Client/a:k	Ljava/awt/CardLayout;
    //   428: aload_0
    //   429: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   432: getfield 286	Client/a:f	Ljavax/swing/JPanel;
    //   435: ldc 25
    //   437: invokevirtual 403	java/awt/CardLayout:show	(Ljava/awt/Container;Ljava/lang/String;)V
    //   440: iconst_0
    //   441: putstatic 203	Client/A:o	Z
    //   444: invokestatic 350	Client/A:a	()V
    //   447: getstatic 202	Client/A:n	Z
    //   450: ifeq +28 -> 478
    //   453: aload_0
    //   454: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   457: getfield 287	Client/a:g	Ljavax/swing/JPanel;
    //   460: iconst_1
    //   461: invokevirtual 496	javax/swing/JPanel:setVisible	(Z)V
    //   464: aload_0
    //   465: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   468: getfield 288	Client/a:h	Ljavax/swing/JPanel;
    //   471: iconst_0
    //   472: invokevirtual 496	javax/swing/JPanel:setVisible	(Z)V
    //   475: goto +25 -> 500
    //   478: aload_0
    //   479: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   482: getfield 287	Client/a:g	Ljavax/swing/JPanel;
    //   485: iconst_0
    //   486: invokevirtual 496	javax/swing/JPanel:setVisible	(Z)V
    //   489: aload_0
    //   490: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   493: getfield 288	Client/a:h	Ljavax/swing/JPanel;
    //   496: iconst_1
    //   497: invokevirtual 496	javax/swing/JPanel:setVisible	(Z)V
    //   500: aload_0
    //   501: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   504: iconst_1
    //   505: invokevirtual 373	Client/a:setVisible	(Z)V
    //   508: new 154	java/io/BufferedReader
    //   511: dup
    //   512: new 157	java/io/FileReader
    //   515: dup
    //   516: ldc 102
    //   518: invokespecial 426	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   521: invokespecial 419	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   524: astore_2
    //   525: aload_0
    //   526: aload_2
    //   527: invokevirtual 420	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   530: invokestatic 441	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   533: putfield 222	Client/ClientAlphaRelease:f	I
    //   536: goto +8 -> 544
    //   539: dup
    //   540: astore_2
    //   541: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   544: aload_0
    //   545: new 151	java/awt/Robot
    //   548: dup
    //   549: invokespecial 412	java/awt/Robot:<init>	()V
    //   552: putfield 227	Client/ClientAlphaRelease:k	Ljava/awt/Robot;
    //   555: goto +8 -> 563
    //   558: dup
    //   559: astore_2
    //   560: invokevirtual 402	java/awt/AWTException:printStackTrace	()V
    //   563: aload_0
    //   564: new 155	java/io/File
    //   567: dup
    //   568: ldc 86
    //   570: invokespecial 421	java/io/File:<init>	(Ljava/lang/String;)V
    //   573: putfield 234	Client/ClientAlphaRelease:r	Ljava/io/File;
    //   576: aload_0
    //   577: getfield 234	Client/ClientAlphaRelease:r	Ljava/io/File;
    //   580: invokevirtual 422	java/io/File:exists	()Z
    //   583: ifeq +115 -> 698
    //   586: aload_0
    //   587: getfield 234	Client/ClientAlphaRelease:r	Ljava/io/File;
    //   590: invokevirtual 423	java/io/File:isDirectory	()Z
    //   593: ifne +105 -> 698
    //   596: aload_0
    //   597: ldc 23
    //   599: putfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   602: aload_0
    //   603: iconst_0
    //   604: invokestatic 436	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   607: putfield 233	Client/ClientAlphaRelease:q	Ljava/lang/Boolean;
    //   610: new 154	java/io/BufferedReader
    //   613: dup
    //   614: new 157	java/io/FileReader
    //   617: dup
    //   618: aload_0
    //   619: getfield 234	Client/ClientAlphaRelease:r	Ljava/io/File;
    //   622: invokespecial 425	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   625: invokespecial 419	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   628: astore_2
    //   629: aload_0
    //   630: aload_2
    //   631: invokevirtual 420	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   634: putfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   637: aload_0
    //   638: iconst_1
    //   639: invokestatic 436	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   642: putfield 233	Client/ClientAlphaRelease:q	Ljava/lang/Boolean;
    //   645: aload_0
    //   646: getfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   649: ifnull +15 -> 664
    //   652: aload_0
    //   653: getfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   656: ldc 2
    //   658: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   661: ifeq +25 -> 686
    //   664: aload_0
    //   665: ldc 23
    //   667: putfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   670: aload_0
    //   671: iconst_0
    //   672: invokestatic 436	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   675: putfield 233	Client/ClientAlphaRelease:q	Ljava/lang/Boolean;
    //   678: goto +8 -> 686
    //   681: dup
    //   682: astore_2
    //   683: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   686: aload_0
    //   687: getfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   690: ldc 99
    //   692: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   695: ifeq +17 -> 712
    //   698: aload_0
    //   699: ldc 23
    //   701: putfield 219	Client/ClientAlphaRelease:c	Ljava/lang/String;
    //   704: aload_0
    //   705: iconst_0
    //   706: invokestatic 436	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   709: putfield 233	Client/ClientAlphaRelease:q	Ljava/lang/Boolean;
    //   712: aload_0
    //   713: invokestatic 414	java/awt/Toolkit:getDefaultToolkit	()Ljava/awt/Toolkit;
    //   716: invokevirtual 415	java/awt/Toolkit:getScreenSize	()Ljava/awt/Dimension;
    //   719: putfield 231	Client/ClientAlphaRelease:o	Ljava/awt/Dimension;
    //   722: aload_0
    //   723: aload_0
    //   724: getfield 231	Client/ClientAlphaRelease:o	Ljava/awt/Dimension;
    //   727: putfield 221	Client/ClientAlphaRelease:e	Ljava/awt/Dimension;
    //   730: aload_0
    //   731: iconst_0
    //   732: putfield 238	Client/ClientAlphaRelease:v	Z
    //   735: aload_0
    //   736: iconst_3
    //   737: putfield 239	Client/ClientAlphaRelease:w	I
    //   740: goto +13 -> 753
    //   743: dup
    //   744: astore_2
    //   745: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   748: aload_2
    //   749: invokevirtual 438	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   752: astore_1
    //   753: aload_0
    //   754: new 119	Client/w
    //   757: dup
    //   758: getstatic 334	f/a:b	Ljava/lang/String;
    //   761: sipush 2222
    //   764: aload_0
    //   765: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   768: invokespecial 379	Client/w:<init>	(Ljava/lang/String;ILClient/a;)V
    //   771: putfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   774: aload_0
    //   775: getfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   778: invokevirtual 380	Client/w:a	()V
    //   781: aload_0
    //   782: getfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   785: invokevirtual 382	Client/w:start	()V
    //   788: aload_0
    //   789: getfield 229	Client/ClientAlphaRelease:m	LClient/a;
    //   792: invokevirtual 371	Client/a:repaint	()V
    //   795: goto +8 -> 803
    //   798: dup
    //   799: astore_2
    //   800: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   803: aload_1
    //   804: ifnull +28 -> 832
    //   807: aload_0
    //   808: getfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   811: iconst_m1
    //   812: new 171	java/lang/StringBuilder
    //   815: dup
    //   816: ldc 65
    //   818: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   821: aload_1
    //   822: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   828: iconst_1
    //   829: invokevirtual 381	Client/w:a	(ILjava/lang/String;Z)V
    //   832: new 129	c/b
    //   835: dup
    //   836: invokespecial 393	c/b:<init>	()V
    //   839: dup
    //   840: astore_2
    //   841: invokevirtual 394	c/b:start	()V
    //   844: aload_0
    //   845: new 126	b/c
    //   848: dup
    //   849: aconst_null
    //   850: invokespecial 389	b/c:<init>	(Ljava/lang/String;)V
    //   853: putfield 236	Client/ClientAlphaRelease:t	Lb/c;
    //   856: aload_0
    //   857: getfield 236	Client/ClientAlphaRelease:t	Lb/c;
    //   860: invokevirtual 392	b/c:start	()V
    //   863: aload_0
    //   864: iconst_0
    //   865: putfield 240	Client/ClientAlphaRelease:x	I
    //   868: aload_0
    //   869: new 117	Client/ak
    //   872: dup
    //   873: aload_0
    //   874: invokespecial 374	Client/ak:<init>	(LClient/ClientAlphaRelease;)V
    //   877: putfield 217	Client/ClientAlphaRelease:a	LClient/ak;
    //   880: aload_0
    //   881: getfield 217	Client/ClientAlphaRelease:a	LClient/ak;
    //   884: getstatic 200	Client/A:l	Ljava/lang/String;
    //   887: invokevirtual 376	Client/ak:a	(Ljava/lang/String;)V
    //   890: aload_0
    //   891: getfield 217	Client/ClientAlphaRelease:a	LClient/ak;
    //   894: invokevirtual 378	Client/ak:start	()V
    //   897: goto +36 -> 933
    //   900: dup
    //   901: astore_2
    //   902: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   905: aload_0
    //   906: getfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   909: iconst_m1
    //   910: new 171	java/lang/StringBuilder
    //   913: dup
    //   914: ldc 46
    //   916: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   919: aload_2
    //   920: invokevirtual 438	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   923: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   926: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   929: iconst_0
    //   930: invokevirtual 381	Client/w:a	(ILjava/lang/String;Z)V
    //   933: aload_0
    //   934: iconst_0
    //   935: putfield 239	Client/ClientAlphaRelease:w	I
    //   938: return
    //   939: dup
    //   940: astore_2
    //   941: invokevirtual 440	java/lang/Exception:printStackTrace	()V
    //   944: aload_0
    //   945: getfield 218	Client/ClientAlphaRelease:b	LClient/w;
    //   948: iconst_m1
    //   949: new 171	java/lang/StringBuilder
    //   952: dup
    //   953: ldc 33
    //   955: invokespecial 452	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   958: aload_2
    //   959: invokevirtual 438	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   962: invokevirtual 456	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   965: invokevirtual 458	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   968: iconst_1
    //   969: invokevirtual 381	Client/w:a	(ILjava/lang/String;Z)V
    //   972: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	973	0	this	ClientAlphaRelease
    //   5	1	1	localObject1	Object
    //   279	18	1	localObject2	Object
    //   752	70	1	str	String
    //   39	920	2	localObject3	Object
    //   41	258	3	localFileInputStream	java.io.FileInputStream
    //   52	1	4	localFile	File
    //   255	1	7	localIOException1	IOException
    //   271	1	8	localIOException2	IOException
    //   291	1	9	localIOException3	IOException
    //   305	1	10	localIOException4	IOException
    //   539	1	11	localException1	Exception
    //   558	1	12	localAWTException	java.awt.AWTException
    //   681	1	13	localException2	Exception
    //   743	1	14	localException3	Exception
    //   798	1	15	localException4	Exception
    //   900	1	16	localException5	Exception
    //   939	1	17	localException6	Exception
    // Exception table:
    //   from	to	target	type
    //   60	252	255	java/io/IOException
    //   264	268	271	java/io/IOException
    //   60	260	279	finally
    //   284	288	291	java/io/IOException
    //   298	302	305	java/io/IOException
    //   508	536	539	java/lang/Exception
    //   544	555	558	java/awt/AWTException
    //   610	678	681	java/lang/Exception
    //   6	740	743	java/lang/Exception
    //   753	795	798	java/lang/Exception
    //   868	897	900	java/lang/Exception
    //   6	938	939	java/lang/Exception
  }
  
  public final void a(int paramInt, String paramString)
  {
    System.out.println("client: " + paramInt);
    paramInt = new q(paramInt, paramString);
    this.b.b.add(paramInt);
  }
  
  public void run()
  {
    ArrayList localArrayList1 = new ArrayList();
    for (;;)
    {
      try
      {
        long l1 = System.currentTimeMillis();
        Object localObject3;
        Object localObject5;
        if ((this.K != -1L) && (this.K + 5000L < l1) && (this.w != 2) && (this.w != 1))
        {
          System.out.println("closing gsi");
          try
          {
            this.t.b();
          }
          catch (Exception localException3)
          {
            (localObject3 = localException3).printStackTrace();
          }
          try
          {
            System.out.println("closing pps");
            (localObject3 = this.J).c = false;
            try
            {
              ((S)localObject3).a.close();
            }
            catch (IOException localIOException2)
            {
              IOException localIOException1;
              (localIOException1 = localIOException2).printStackTrace();
            }
            try
            {
              System.out.println("Running launcher");
              Runtime.getRuntime().exec("FeedLessLauncher-Alpha.exe");
            }
            catch (Exception localException5)
            {
              (localObject3 = localException5).printStackTrace();
              try
              {
                if (this.b != null) {
                  this.b.a(-1, "Unable to re-run client:" + ((Exception)localObject3).getMessage(), true);
                }
              }
              catch (Exception localException6)
              {
                (localObject5 = localException6).printStackTrace();
              }
            }
          }
          catch (Exception localException4)
          {
            (localObject3 = localException4).printStackTrace();
          }
          System.out.println("Closing client as recieved a reconnect packet");
          System.exit(0);
        }
        if (this.n <= l1)
        {
          this.n = (System.currentTimeMillis() + 1000L);
          this.o = Toolkit.getDefaultToolkit().getScreenSize();
          this.e = this.o;
        }
        Object localObject7;
        Object localObject4;
        long l6;
        Object localObject12;
        Object localObject6;
        try
        {
          if ((localObject3 = this.t.a()) != null)
          {
            this.u = ((b)localObject3);
            if (this.b.d == 0)
            {
              this.b.d = 1;
              localObject5 = new s(this.e.width, this.e.height, this.b.d);
              this.b.b.add(localObject5);
            }
          }
          if (this.u != null)
          {
            if (this.u.a != null)
            {
              if (((this.D == null) && (this.u.a.c != null)) || ((this.D != null) && (!this.D.equals(this.u.a.c)))) {
                System.out.println("New gsi team win:" + this.u.a.c);
              }
              this.D = this.u.a.c;
            }
            if (this.u.b != null)
            {
              if (((this.C == null) && (this.u.b.a != null)) || ((this.C != null) && (!this.C.equals(this.u.b.a)))) {
                System.out.println("New gsi team:" + this.u.b.a);
              }
              this.C = this.u.b.a;
            }
          }
          if (!this.b.c)
          {
            this.w = 3;
            this.v = false;
            if (!this.m.b.equals("Not connected!"))
            {
              this.m.b = "Not connected!";
              this.m.a();
            }
          }
          else if (this.u == null)
          {
            this.w = 0;
            if (this.t.b) {
              this.m.a("Launch Dota and Play!");
            } else {
              this.m.a("Can't find the game.");
            }
          }
          else
          {
            if (!A.n)
            {
              A.n = true;
              A.a();
            }
            if (this.u.a != null)
            {
              if ((this.u.a.b.equals("DOTA_GAMERULES_STATE_GAME_IN_PROGRESS")) || (this.u.a.b.equals("DOTA_GAMERULES_STATE_PRE_GAME")))
              {
                if ((this.d != null) && (this.d.b)) {
                  this.m.a("Not finding Dota screen");
                } else {
                  this.m.a("In Game");
                }
                this.w = 2;
              }
              else if ((this.u.a.b.equals("DOTA_GAMERULES_STATE_HERO_SELECTION")) || (this.u.a.b.equals("DOTA_GAMERULES_STATE_STRATEGY_TIME")))
              {
                this.m.a("Pick Stage");
                this.w = 1;
              }
              else
              {
                this.m.a("GSI running. Loading Screen.");
                this.w = 0;
              }
            }
            else
            {
              this.m.a("Dota is Running, Waiting for match to start.");
              this.w = 0;
            }
          }
          if (this.w != 3) {
            if (!this.v)
            {
              if (!this.m.b.equals("Connected - Unverified"))
              {
                this.m.b = "Connected - Unverified";
                this.m.a();
              }
            }
            else if (!this.m.b.equals("Connected - Verified"))
            {
              this.m.b = "Connected - Verified";
              (localObject3 = this.m).c.setForeground(Color.GREEN);
              ((a)localObject3).c.setText(((a)localObject3).b);
              ((a)localObject3).d.setText(((a)localObject3).e);
              ((a)localObject3).repaint();
            }
          }
          if ((this.w == 0) && (this.x != 0) && (this.x != 3))
          {
            int i3 = 1;
            System.out.println("GSI_TEAM_WIN:" + this.D);
            System.out.println("GSI_WIN: " + this.C);
            if ((this.C != null) && (this.D != null) && (!this.D.equals("none"))) {
              if (this.C.equals(this.D)) {
                i3 = 3;
              } else {
                i3 = 2;
              }
            }
            this.b.b.add(new f(i3));
            a locala;
            if (((locala = this.m).l == null) || (locala.l.a)) {
              locala.l = new PostGameAnalytics.c(locala);
            }
            if ((locala.a != null) && (locala.a.d != null)) {
              locala.l.a(locala.a.d.e);
            }
            this.m.a(true);
            this.a.a();
          }
          if ((this.G != this.w) || (this.H != this.A))
          {
            this.G = this.w;
            this.H = this.A;
            System.out.println("State:" + this.w + " map:" + this.A);
          }
          if ((this.x != 2) && (this.w == 2))
          {
            this.d = new M(this.e.width, this.e.height);
            this.l = 0;
            this.A = 0;
            this.p = System.currentTimeMillis();
            System.out.println("Building new variables");
            this.C = null;
            this.D = null;
          }
          if ((this.w != 1) && ((this.w != 2) || (this.A != 0)) && (this.z != null))
          {
            System.out.println("Disposing screen " + this.w + " 1" + " " + this.w + " 2" + " " + this.A + " 0");
            this.z.dispose();
            this.z = null;
            if (this.y != null) {
              this.y = null;
            }
            this.I = false;
          }
          Object localObject11;
          Object localObject10;
          Object localObject8;
          if ((this.j + 1000L < l1) && ((this.w == 1) || ((this.w == 2) && (this.A == 0) && (this.I))))
          {
            this.j = l1;
            long l2 = System.currentTimeMillis();
            this.I = true;
            if (this.z == null) {
              this.z = new C(this.e, this.m);
            }
            int i5 = this.e.width;
            int i7 = this.e.height;
            this.M = new a.a(i5, i7);
            A.b(((Rectangle)this.M.m.get(0)).width, ((Rectangle)this.M.m.get(0)).height);
            localObject7 = new String[10];
            Object localObject9 = new Point((int)((this.o.width - this.M.b) / 2.0D), (int)((this.o.height - this.M.c) / 2.0D));
            localObject11 = this.k.createScreenCapture(new Rectangle(((Point)localObject9).x + this.M.l.x, ((Point)localObject9).y + this.M.l.y, this.M.l.width, this.M.l.height));
            i7 = 0;
            continue;
            String str1 = A.c(localObject9 = a.a.a((BufferedImage)localObject11, (Rectangle)this.M.m.get(i7)));
            localObject7[i7] = str1;
            i7++;
            if (i7 < 10) {
              continue;
            }
            i7 = 0;
            int i9;
            if (this.y == null)
            {
              i7 = 1;
            }
            else
            {
              i9 = 0;
              continue;
              if (!localObject7[i9].equals(this.y[i9])) {
                i7 = 1;
              }
              i9++;
              if (i9 < 10) {
                continue;
              }
            }
            if (i7 != 0)
            {
              i7 = 0;
              i9 = 0;
              continue;
              if (!localObject7[i9].equals("Blank_Thumbnail")) {
                i7 = 1;
              }
              i9++;
              if (i9 < 10) {
                continue;
              }
            }
            if ((i7 != 0) && (this.u.b != null) && (this.u.b.a != null))
            {
              localObject10 = new ArrayList();
              int i11 = 0;
              i7 = 5;
              if (this.u.b.a.equals("dire"))
              {
                i11 = 5;
                i7 = 0;
              }
              localObject11 = i11;
              continue;
              if (!localObject7[localObject11].equals("Blank_Thumbnail")) {
                ((ArrayList)localObject10).add(localObject7[localObject11]);
              }
              localObject11++;
              if (localObject11 < i11 + 5) {
                continue;
              }
              localObject11 = new ArrayList();
              i11 = i7;
              continue;
              if (!localObject7[i11].equals("Blank_Thumbnail")) {
                ((ArrayList)localObject11).add(localObject7[i11]);
              }
              i11++;
              if (i11 < i7 + 5) {
                continue;
              }
              ArrayList localArrayList2 = new ArrayList();
              localObject8 = new ArrayList();
              localObject8 = new i((ArrayList)localObject10, (ArrayList)localObject11, localArrayList2, (ArrayList)localObject8, null, null, new double[1], new double[1]);
              System.out.println(((i)localObject8).toString());
              this.b.b.add(localObject8);
              this.y = ((String[])localObject7);
            }
            this.E += System.currentTimeMillis() - l2;
            if (this.F + 1000L < System.currentTimeMillis())
            {
              this.E = 0L;
              this.F = System.currentTimeMillis();
            }
          }
          if ((this.m.i != null) && (this.m.i.m != null))
          {
            if ((localObject4 = this.m.i).n != null)
            {
              long l4 = (((T)localObject4).j.longValue() - System.currentTimeMillis()) / 1000L;
              int i4 = (int)TimeUnit.SECONDS.toDays(l4);
              long l5 = TimeUnit.SECONDS.toHours(l4) - i4 * 24;
              l6 = TimeUnit.SECONDS.toMinutes(l4) - TimeUnit.SECONDS.toHours(l4) * 60L;
              TimeUnit.SECONDS.toSeconds(l4);
              TimeUnit.SECONDS.toMinutes(l4);
              ((T)localObject4).m.setText((String)localObject12);
              ((T)localObject4).n = ((String)localObject12);
              ((T)localObject4).l.repaint();
              System.out.println("new count down time " + (String)localObject12);
            }
            (!(localObject12 = i4 + "d " + l5 + "h " + l6 + "m to giveaway").equals(((T)localObject4).n) ? 1 : 0);
          }
          if ((this.i + 1000L < l1) && (this.w == 2))
          {
            this.i = l1;
            this.l += 1;
            System.out.println("Doing main processing");
            localObject4 = this.d.a;
            localObject6 = new Point((int)((this.o.width - ((a.a)localObject4).b) / 2.0D), (int)((this.o.height - ((a.a)localObject4).c) / 2.0D));
            localObject7 = this.d.a.g;
            if ((this.A == 1) || ((this.A == 0) && (this.l % 2 == 1))) {
              localObject7 = ((a.a)localObject4).i;
            }
            localObject8 = A.d(this.k.createScreenCapture(new Rectangle(((Point)localObject6).x + ((Rectangle)localObject7).x, ((Point)localObject6).y + ((Rectangle)localObject7).y, ((Rectangle)localObject7).width, ((Rectangle)localObject7).height)));
            if ((this.A == 1) || ((this.A == 0) && (this.l % 2 == 1)))
            {
              (localObject7 = ((BufferedImage)localObject8).getGraphics()).setColor(Color.black);
              ((Graphics)localObject7).fillRect(((BufferedImage)localObject8).getWidth() - ((a.a)localObject4).j, 0, ((a.a)localObject4).j, ((BufferedImage)localObject8).getHeight());
              ((Graphics)localObject7).finalize();
            }
            localObject7 = A.d(this.k.createScreenCapture(new Rectangle(((Point)localObject6).x + ((a.a)localObject4).d.x, ((Point)localObject6).y + ((a.a)localObject4).d.y, ((a.a)localObject4).d.width, ((a.a)localObject4).d.height)));
            localObject10 = null;
            try
            {
              localObject10 = A.d(this.k.createScreenCapture(new Rectangle(((Point)localObject6).x + ((a.a)localObject4).k.x, ((Point)localObject6).y + ((a.a)localObject4).k.y, ((a.a)localObject4).k.width, ((a.a)localObject4).k.height)));
            }
            catch (Exception localException7)
            {
              (localObject11 = localException7).printStackTrace();
            }
            this.d.a((BufferedImage)localObject8, (BufferedImage)localObject7, (BufferedImage)localObject10, this.u.a.a, this.u);
            System.out.println("GSI Time: " + this.u.a.a);
            if ((this.g != null) && (this.g.isDisplayable())) {
              this.g.a(this.d);
            }
            if (this.A == 0)
            {
              int i10 = 0;
              i8 = 0;
              continue;
              if (this.d.c.c[i8].a) {
                i10 = 1;
              }
              i8++;
              if (i8 < this.d.c.c.length) {
                continue;
              }
              i8 = 0;
              continue;
              if (this.d.c.d[i8].a) {
                i10 = 1;
              }
              i8++;
              if (i8 < this.d.c.d.length) {
                continue;
              }
              System.out.println("Processing map as unknown " + this.A);
              if (i10 != 0) {
                if (this.l % 2 == 1) {
                  this.A = 1;
                } else {
                  this.A = 2;
                }
              }
            }
            if ((this.A != 0) && (this.b.d != 2))
            {
              this.b.d = 2;
              s locals = new s(this.e.width, this.e.height, this.b.d);
              this.b.b.add(locals);
            }
            System.out.println("map_side_state:" + this.A + " " + (this.l % 2 == 1));
            localArrayList1.addAll(this.d.a());
            this.h = (System.currentTimeMillis() - l1);
            System.out.println(this.h);
            if (this.h > 5000L) {
              this.L += 1;
            }
            if (this.L > 5)
            {
              this.L = 0;
              this.b.a(-1, "main loop took " + (System.currentTimeMillis() - l1) + " state:" + this.w, false);
              continue;
              if (((localObject4 = localArrayList1.remove(0)) instanceof x))
              {
                localObject6 = (x)localObject4;
                System.out.println("Sending time " + ((x)localObject6).g);
              }
              this.b.b.add(localObject4);
            }
          }
          if (localArrayList1.size() != 0) {
            continue;
          }
        }
        catch (Exception localException8)
        {
          (localObject4 = localException8).printStackTrace();
          localObject6 = "";
          localObject7 = ((Exception)localObject4).getStackTrace();
          int i8 = 0;
          continue;
          localObject6 = localObject6 + "," + localObject7[i8].toString();
          i8++;
          if (i8 < localObject7.length) {
            continue;
          }
          localObject6 = (localObject6 = ((String)localObject6).replaceAll("<", "(")).replaceAll(">", ")");
          this.b.a(-1, "Exception,  Image_Processing, " + ((Exception)localObject4).getMessage() + " " + (String)localObject6, false);
        }
        if (((localObject4 = this.b.a.remove(0)) instanceof t))
        {
          localObject6 = (t)localObject4;
          System.out.println(((t)localObject6).toString());
          this.a.b(((t)localObject6).a);
        }
        else if ((localObject4 instanceof d.a))
        {
          localObject6 = (d.a)localObject4;
          this.v = true;
          this.m.repaint();
          this.c = ((d.a)localObject6).c;
          this.s = (((d.a)localObject6).d + System.currentTimeMillis());
          System.out.println(this.s + " " + System.currentTimeMillis() + " (" + ((d.a)localObject6).d + ")");
          if (!this.q.booleanValue())
          {
            (localObject7 = new PrintWriter(this.r, "UTF-8")).println(this.c);
            ((PrintWriter)localObject7).close();
          }
          this.m.a(((d.a)localObject6).a);
        }
        else if ((localObject4 instanceof i))
        {
          localObject6 = (i)localObject4;
          if ((this.w == 1) || ((this.w == 2) && (this.A == 0) && (this.I)))
          {
            System.out.println("Recieved " + ((i)localObject6).toString());
            if (this.z != null) {
              this.z.a(((i)localObject6).a, ((i)localObject6).b, ((i)localObject6).c, ((i)localObject6).d, ((i)localObject6).e, ((i)localObject6).f);
            }
          }
        }
        else if ((localObject4 instanceof r))
        {
          System.out.println("Recieved reconnect packet");
          this.K = System.currentTimeMillis();
        }
        else if ((localObject4 instanceof v))
        {
          localObject6 = (v)localObject4;
          int i6 = 0;
          continue;
          System.out.println(((e.a)((v)localObject6).a.get(i6)).toString());
          i6++;
          if (i6 < ((v)localObject6).a.size()) {
            continue;
          }
        }
        else if ((localObject4 instanceof p))
        {
          localObject6 = (p)localObject4;
          System.out.println("Client: Entered " + ((p)localObject6).e + " expire:" + ((p)localObject6).a + " img:" + ((p)localObject6).d + " name:" + ((p)localObject6).b + " url:" + ((p)localObject6).c + " code:" + ((p)localObject6).h + " friends:" + ((p)localObject6).f + " email_submitted:" + ((p)localObject6).g);
          if (this.m.i.p)
          {
            if (this.m.i.k == ((p)localObject6).f) {
              JOptionPane.showMessageDialog(null, "Bad Friend Code", "InfoBox: Feedless", 1);
            } else {
              JOptionPane.showMessageDialog(null, "Friend Added!", "InfoBox: Feedless", 1);
            }
            this.m.i.p = false;
          }
          long l3 = System.currentTimeMillis();
          int i1 = ((p)localObject6).f;
          l6 = ((p)localObject6).a;
          String str4 = ((p)localObject6).h;
          boolean bool2 = ((p)localObject6).g;
          boolean bool1 = ((p)localObject6).e;
          String str3 = ((p)localObject6).d;
          String str2 = ((p)localObject6).c;
          (localObject4 = this.m.i).k = i1;
          ((T)localObject4).i = str4;
          ((T)localObject4).j = Long.valueOf(System.currentTimeMillis() + l6);
          (localObject1 = localObject4).q.setText("Want to win this item?");
          ((T)localObject1).q.setHorizontalAlignment(0);
          ((T)localObject1).q.setBackground(new Color(26, 26, 26));
          ((T)localObject1).q.setForeground(new Color(255, 255, 255));
          ((T)localObject1).q.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 2, 0, ((T)localObject1).getWidth(), 20);
          ((T)localObject1).g.setBounds(((T)localObject1).getWidth() / 2 - (((T)localObject1).getWidth() - 45) / 2, 25, ((T)localObject1).getWidth() - 45, 20);
          ((T)localObject1).g.setForeground(Color.WHITE);
          ((T)localObject1).g.setBackground(Color.GRAY);
          ((T)localObject1).g.setText("                      Enter you email here");
          ((T)localObject1).g.setAlignmentX(0.5F);
          ((T)localObject1).g.setEditable(true);
          ((T)localObject1).g.setLineWrap(true);
          ((T)localObject1).g.setWrapStyleWord(true);
          ((T)localObject1).g.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).r.setText("Submit email");
          ((T)localObject1).r.setBounds(22, 50, 250, 29);
          ((T)localObject1).r.setHorizontalAlignment(0);
          ((T)localObject1).r.setBackground(new Color(153, 153, 153));
          ((T)localObject1).r.setForeground(new Color(255, 255, 255));
          ((T)localObject1).r.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).r.setFocusPainted(false);
          (localObject1 = localObject4).s.setText("Enter raffle with " + ((T)localObject1).k + " tickets");
          ((T)localObject1).s.setBounds(22, 0, 250, 29);
          ((T)localObject1).s.setHorizontalAlignment(0);
          ((T)localObject1).s.setBackground(new Color(153, 153, 153));
          ((T)localObject1).s.setForeground(new Color(255, 255, 255));
          ((T)localObject1).s.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).s.setFocusPainted(false);
          ((T)localObject1).t.setText("Share your code and win more raffle tickets!");
          ((T)localObject1).t.setHorizontalAlignment(0);
          ((T)localObject1).t.setBackground(new Color(26, 26, 26));
          ((T)localObject1).t.setForeground(new Color(255, 255, 255));
          ((T)localObject1).t.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 2, 30, ((T)localObject1).getWidth(), 20);
          ((T)localObject1).u.setText("Share code: ");
          ((T)localObject1).u.setHorizontalAlignment(4);
          ((T)localObject1).u.setBackground(new Color(26, 26, 26));
          ((T)localObject1).u.setForeground(new Color(255, 255, 255));
          ((T)localObject1).u.setBounds(0, 50, ((T)localObject1).getWidth() / 3 + 10, 20);
          localObject12 = new Font("SansSerif", 1, 20);
          ((T)localObject1).v.setText(((T)localObject1).i);
          ((T)localObject1).v.setBackground(new Color(26, 26, 26));
          ((T)localObject1).v.setForeground(new Color(255, 255, 255));
          ((T)localObject1).v.setFont((Font)localObject12);
          ((T)localObject1).v.setBorder(new LineBorder(new Color(26, 26, 26), 0, false));
          ((T)localObject1).v.setEditable(false);
          ((T)localObject1).v.setHorizontalAlignment(0);
          ((T)localObject1).v.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 4 / 2, 50, ((T)localObject1).getWidth() / 4, 25);
          Image localImage1;
          Image localImage2 = (localImage1 = (localObject13 = new ImageIcon("question_mark.png")).getImage()).getScaledInstance(20, 20, 4);
          Object localObject13 = new ImageIcon(localImage2);
          ((T)localObject1).w.setText("help");
          ((T)localObject1).w.setIcon((Icon)localObject13);
          ((T)localObject1).w.setIconTextGap(5);
          ((T)localObject1).w.setHorizontalAlignment(0);
          ((T)localObject1).w.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 4 / 2 + ((T)localObject1).getWidth() / 4 + 19, 50, 70, 30);
          ((T)localObject1).w.setBackground(new Color(153, 153, 153));
          ((T)localObject1).w.setForeground(new Color(255, 255, 255));
          ((T)localObject1).w.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).w.setFocusPainted(false);
          long l7 = ((localObject1 = localObject4).j.longValue() - System.currentTimeMillis()) / 1000L;
          int i2 = (int)TimeUnit.SECONDS.toDays(l7);
          long l8 = TimeUnit.SECONDS.toHours(l7) - i2 * 24;
          long l9 = TimeUnit.SECONDS.toMinutes(l7) - TimeUnit.SECONDS.toHours(l7) * 60L;
          TimeUnit.SECONDS.toSeconds(l7);
          TimeUnit.SECONDS.toMinutes(l7);
          ((T)localObject1).n = (i2 + "d " + l8 + "h " + l9 + "m to giveaway");
          ((T)localObject1).m.setText(((T)localObject1).n);
          ((T)localObject1).m.setBounds(0, 0, 294, 20);
          ((T)localObject1).m.setHorizontalTextPosition(0);
          ((T)localObject1).m.setHorizontalAlignment(0);
          ((T)localObject1).m.setForeground(new Color(153, 153, 153));
          ((T)localObject1).x.setText("You entered the raffle with " + ((T)localObject1).k + " tickets");
          ((T)localObject1).x.setHorizontalAlignment(0);
          ((T)localObject1).x.setBackground(new Color(26, 26, 26));
          ((T)localObject1).x.setForeground(new Color(255, 255, 255));
          ((T)localObject1).x.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 2, 30, ((T)localObject1).getWidth(), 20);
          ((T)localObject1).y.setText("Share your code and win more raffle tickets!");
          ((T)localObject1).y.setHorizontalAlignment(0);
          ((T)localObject1).y.setBackground(new Color(26, 26, 26));
          ((T)localObject1).y.setForeground(new Color(255, 255, 255));
          ((T)localObject1).y.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 2, 50, ((T)localObject1).getWidth(), 20);
          ((T)localObject1).z.setText("  Share code: ");
          ((T)localObject1).z.setHorizontalAlignment(4);
          ((T)localObject1).z.setBackground(new Color(26, 26, 26));
          ((T)localObject1).z.setForeground(new Color(255, 255, 255));
          ((T)localObject1).z.setBounds(0, 70, ((T)localObject1).getWidth() / 3 + 10, 20);
          Object localObject2 = new Font("SansSerif", 1, 20);
          ((T)localObject1).A.setText(((T)localObject1).i);
          ((T)localObject1).A.setBackground(new Color(26, 26, 26));
          ((T)localObject1).A.setForeground(new Color(255, 255, 255));
          ((T)localObject1).A.setFont((Font)localObject2);
          ((T)localObject1).A.setBorder(new LineBorder(new Color(26, 26, 26), 0, false));
          ((T)localObject1).A.setEditable(false);
          ((T)localObject1).A.setHorizontalAlignment(0);
          ((T)localObject1).A.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 4 / 2, 70, ((T)localObject1).getWidth() / 4, 25);
          localObject2 = (localObject2 = (localObject2 = new ImageIcon("question_mark.png")).getImage()).getScaledInstance(20, 20, 4);
          localObject2 = new ImageIcon((Image)localObject2);
          ((T)localObject1).B.setText("help");
          ((T)localObject1).B.setIcon((Icon)localObject2);
          ((T)localObject1).B.setIconTextGap(5);
          ((T)localObject1).B.setHorizontalAlignment(0);
          ((T)localObject1).B.setBounds(((T)localObject1).getWidth() / 2 - ((T)localObject1).getWidth() / 4 / 2 + ((T)localObject1).getWidth() / 4 + 19, 70, 70, 30);
          ((T)localObject1).B.setBackground(new Color(153, 153, 153));
          ((T)localObject1).B.setForeground(new Color(255, 255, 255));
          ((T)localObject1).B.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).B.setFocusPainted(false);
          (localObject1 = localObject4).h.setText("Paste your friend's code here");
          ((T)localObject1).h.setEditable(true);
          ((T)localObject1).h.setBounds(((T)localObject1).getWidth() / 2 - (((T)localObject1).getWidth() - 45) / 2, 0, ((T)localObject1).getWidth() - 45, 20);
          ((T)localObject1).h.setForeground(Color.BLACK);
          ((T)localObject1).h.setBackground(Color.WHITE);
          ((T)localObject1).h.setHorizontalAlignment(0);
          ((T)localObject1).h.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).D.setText("Submit friend code");
          ((T)localObject1).D.setBounds(22, 25, 250, 29);
          ((T)localObject1).D.setHorizontalAlignment(0);
          ((T)localObject1).D.setBackground(new Color(153, 153, 153));
          ((T)localObject1).D.setForeground(new Color(255, 255, 255));
          ((T)localObject1).D.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).D.setFocusPainted(false);
          Object localObject1 = localObject4;
          localObject2 = (localObject13 = (localImageIcon = new ImageIcon("question_mark.png")).getImage()).getScaledInstance(20, 20, 4);
          ImageIcon localImageIcon = new ImageIcon((Image)localObject2);
          ((T)localObject1).C.setText("help");
          ((T)localObject1).C.setIcon(localImageIcon);
          ((T)localObject1).C.setIconTextGap(5);
          ((T)localObject1).C.setHorizontalAlignment(0);
          ((T)localObject1).C.setBounds(((T)localObject1).getWidth() / 2 - 35, 0, 70, 30);
          ((T)localObject1).C.setBackground(new Color(153, 153, 153));
          ((T)localObject1).C.setForeground(new Color(255, 255, 255));
          ((T)localObject1).C.setBorder(new LineBorder(new Color(153, 153, 153), 0, false));
          ((T)localObject1).C.setFocusPainted(false);
          ((T)localObject4).a(str2, str3);
          if ((!bool2) && (!bool1))
          {
            ((T)localObject4).a.setVisible(true);
            ((T)localObject4).b.setVisible(false);
            ((T)localObject4).c.setVisible(false);
            ((T)localObject4).d.setVisible(true);
            ((T)localObject4).e.setVisible(false);
            ((T)localObject4).f.setVisible(false);
          }
          else if ((bool2) && (!bool1))
          {
            ((T)localObject4).a.setVisible(false);
            ((T)localObject4).b.setVisible(true);
            ((T)localObject4).c.setVisible(false);
            ((T)localObject4).d.setVisible(false);
            ((T)localObject4).e.setVisible(true);
            ((T)localObject4).f.setVisible(false);
          }
          else if ((bool2) && (bool1))
          {
            ((T)localObject4).a.setVisible(false);
            ((T)localObject4).b.setVisible(false);
            ((T)localObject4).c.setVisible(true);
            ((T)localObject4).d.setVisible(false);
            ((T)localObject4).e.setVisible(true);
            ((T)localObject4).f.setVisible(false);
          }
          ((T)localObject4).l.revalidate();
          ((T)localObject4).l.repaint();
          System.out.println(System.currentTimeMillis() - l3);
        }
        if (this.b.a.size() != 0) {
          continue;
        }
        this.x = this.w;
      }
      catch (Exception localException1)
      {
        this.m.a("Not finding Dota screen.");
        this.b.a(-1, "Exception,  Main loop, " + localException1.getMessage(), false);
        localException1.printStackTrace();
      }
      try
      {
        Thread.sleep(10L);
      }
      catch (Exception localException9)
      {
        Exception localException2;
        (localException2 = localException9).printStackTrace();
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\ClientAlphaRelease.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */