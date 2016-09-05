package c;

import Client.O;
import Client.x;
import Client.y;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;

public final class e
{
  private static ArrayList a;
  private static ArrayList b;
  private static ArrayList c;
  private int d;
  private int e;
  private int[][] f;
  private ArrayList g;
  private int h = 0;
  private int i = 0;
  private static boolean j = false;
  private ArrayList k;
  private int l = paramInt >= 760 ? 9 : paramInt >= 888 ? 10 : paramInt >= 952 ? 11 : (paramInt = paramInt) >= 1080 ? 12 : 8;
  
  public static void a()
  {
    if (b == null)
    {
      b = new ArrayList();
      c = new ArrayList();
      for (int m = 8; m < 13; m++) {
        try
        {
          localObject = ImageIO.read(new File("OCR/alphabet_" + m + ".png"));
          localObject = new e((BufferedImage)localObject, localObject == 9 ? 760 : localObject == 10 ? 888 : localObject == 11 ? 952 : (localObject = m) == 12 ? 1080 : 759, true);
          b.add(((e)localObject).c());
          c.add(((e)localObject).d());
          System.out.println("TEMPLATE " + m + " BUILT! " + ((ArrayList)b.get(b.size() - 1)).size());
          if (m == 8) {
            System.out.println("Writing template size " + m);
          }
        }
        catch (Exception localException)
        {
          Object localObject;
          (localObject = localException).printStackTrace();
        }
      }
    }
  }
  
  public e(BufferedImage paramBufferedImage, int paramInt, boolean paramBoolean)
  {
    paramInt = ((DataBufferByte)paramBufferedImage.getRaster().getDataBuffer()).getData();
    this.d = paramBufferedImage.getWidth();
    this.e = paramBufferedImage.getHeight();
    this.f = new int[this.d][this.e];
    int m = 3;
    int n = 0;
    if (paramBufferedImage.getAlphaRaster() != null)
    {
      m = 4;
      n = 1;
    }
    paramBufferedImage = new ArrayList();
    if (paramBoolean)
    {
      paramBufferedImage.add(new d(1, 20.0F, 0.0F, 60.0F, 120.0F, 30.0F, 101.0F));
    }
    else
    {
      paramBufferedImage.add(new d(1, 20.0F, 13.0F, 70.0F, 60.0F, 26.0F, 101.0F));
      a = new ArrayList();
      for (i1 = 0; i1 < 10; i1++)
      {
        O localO;
        y localy = (localO = new O(i1 + 0)).a;
        if ((i1 != 8) && (i1 != 1) && (i1 != 2) && (i1 != 3) && (i1 != 4) && (i1 != 5)) {
          paramBufferedImage.add(new d(i1 + 3, localy.b, localy.d, localy.f, localy.a, localy.c, localy.e));
        } else if (i1 == 8) {
          paramBufferedImage.add(new d(i1 + 3, 126.0F, 70.0F, 33.0F, 136.0F, 100.0F, 65.0F));
        } else if (i1 == 1) {
          paramBufferedImage.add(new d(i1 + 3, 145.0F, 50.0F, 59.0F, 156.0F, 65.0F, 100.0F));
        } else if (i1 == 2) {
          paramBufferedImage.add(new d(i1 + 3, 295.0F, 90.0F, 34.0F, 305.0F, 100.0F, 100.0F));
        } else if (i1 == 3) {
          paramBufferedImage.add(new d(i1 + 3, 56.0F, 90.0F, 75.0F, 61.0F, 100.0F, 100.0F));
        } else if (i1 == 4) {
          paramBufferedImage.add(new d(i1 + 3, 23.0F, 80.0F, 53.0F, 27.0F, 100.0F, 100.0F));
        } else if (i1 == 5) {
          paramBufferedImage.add(new d(i1 + 3, 328.0F, 40.0F, 45.0F, 340.0F, 51.0F, 100.0F));
        }
        a.add((d)paramBufferedImage.get(paramBufferedImage.size() - 1));
      }
    }
    int i1 = 0;
    int i2 = 0;
    int i6 = 0;
    while (i1 < paramInt.length)
    {
      int i3 = paramInt[(i1 + n)] & 0xFF;
      int i5 = paramInt[(i1 + 1 + n)] & 0xFF;
      int i10;
      float f3 = Math.max(Math.max(i10 = paramInt[(i1 + 2 + n)] & 0xFF, i5), i3);
      float f5 = Math.min(Math.min(i10, i5), i3);
      float f4;
      if ((f4 = f3 - f5) != 0.0F)
      {
        if (i10 == f3) {
          f4 = (i5 - i3) / f4;
        } else if (i5 == f3) {
          f4 = 2.0F + (i3 - i10) / f4;
        } else {
          f4 = 4.0F + (i10 - i5) / f4;
        }
        if (f4 *= 60.0F < 0.0F) {
          f4 += 360.0F;
        }
      }
      else
      {
        f4 = 0.0F;
      }
      float f1 = f3 == 0.0F ? 0.0F : (f3 - f5) * 100.0F / f3;
      float f2 = 100.0F * (f3 / 255.0F);
      for (int i8 = 0; i8 < paramBufferedImage.size(); i8++)
      {
        d locald = (d)paramBufferedImage.get(i8);
        if ((f4 <= locald.a) && (f4 >= locald.b) && (f1 <= locald.c) && (f1 >= locald.d) && (f2 <= locald.e) && (f2 >= locald.f)) {
          this.f[i6][i2] = locald.g;
        }
      }
      i6++;
      if (i6 == this.d)
      {
        i6 = 0;
        i2++;
      }
      i1 += m;
    }
    if (paramBoolean) {
      for (i1 = this.f.length - 1; i1 >= 0; i1--) {
        for (i2 = this.f[0].length - 1; i2 >= 0; i2--) {
          if ((this.f[i1][i2] == 1) && (i1 + 1 < this.d)) {
            this.f[(i1 + 1)][i2] = 1;
          }
        }
      }
    }
    this.g = e();
    this.i = 0;
    this.h = 0;
    for (i1 = 0; i1 < this.g.size(); i1++)
    {
      if (((x)this.g.get(i1)).g.width > this.h) {
        this.h = ((x)this.g.get(i1)).g.width;
      }
      if (((x)this.g.get(i1)).g.height > this.i) {
        this.i = ((x)this.g.get(i1)).g.height;
      }
    }
    this.k = new ArrayList();
    for (i1 = 0; i1 < this.g.size(); i1++)
    {
      i2 = 0;
      for (i6 = 0; i6 < this.g.size(); i6++) {
        if ((i6 != i1) && (((x)this.g.get(i1)).g.y == ((x)this.g.get(i6)).g.y))
        {
          i2 = 1;
          break;
        }
      }
      if ((i2 != 0) && (((x)this.g.get(i1)).g.height <= this.l + 4))
      {
        Rectangle localRectangle2 = ((x)this.g.get(i1)).g;
        this.k.add(new Rectangle(0, localRectangle2.y, 2, localRectangle2.height));
      }
    }
    i1 = 1;
    Object localObject1;
    while (i1 != 0)
    {
      i1 = 0;
      for (i2 = 0; i2 < this.k.size(); i2++)
      {
        for (int i7 = 0; i7 < this.k.size(); i7++) {
          if ((i2 != i7) && ((a((Rectangle)this.k.get(i7), (Rectangle)this.k.get(i2))) || (((Rectangle)this.k.get(i2)).contains((Rectangle)this.k.get(i7)))))
          {
            Rectangle localRectangle4 = (Rectangle)this.k.get(i2);
            Rectangle localRectangle1 = (Rectangle)this.k.get(i7);
            localObject1 = new Rectangle(localRectangle4.x, localRectangle4.y, localRectangle4.width, localRectangle4.height);
            if (localRectangle1.y < localRectangle4.y) {
              ((Rectangle)localObject1).y = localRectangle1.y;
            }
            if (localRectangle1.y + localRectangle1.height > localRectangle4.y + localRectangle4.height) {
              ((Rectangle)localObject1).height = (localRectangle1.height + localRectangle1.y - ((Rectangle)localObject1).y);
            } else {
              ((Rectangle)localObject1).height = (localRectangle4.y + localRectangle4.height - ((Rectangle)localObject1).y);
            }
            localRectangle4.y = ((Rectangle)localObject1).y;
            localRectangle4.height = ((Rectangle)localObject1).height;
            this.k.remove(localRectangle1);
            i1 = 1;
            break;
          }
        }
        if (i1 != 0) {
          break;
        }
      }
    }
    int i9;
    Rectangle localRectangle5;
    for (i2 = 0; i2 < this.g.size(); i2++)
    {
      Rectangle localRectangle3 = ((x)this.g.get(i2)).g;
      localRectangle3 = new Rectangle(0, localRectangle3.y, 2, localRectangle3.height);
      i9 = 0;
      int i4 = 0;
      localObject1 = null;
      for (int i11 = 0; i11 < this.k.size(); i11++)
      {
        if (a(localRectangle3, (Rectangle)this.k.get(i11)))
        {
          i9++;
          localObject1 = (Rectangle)this.k.get(i11);
        }
        if (((Rectangle)this.k.get(i11)).contains(localRectangle3)) {
          i4++;
        }
      }
      if ((i4 == 0) && (i9 == 0))
      {
        this.k.add(new Rectangle(0, localRectangle3.y, 2, localRectangle3.height));
      }
      else if ((i4 == 0) && (i9 <= 1))
      {
        Object localObject2 = localObject1;
        localRectangle5 = localRectangle3;
        paramBufferedImage = new Rectangle(((Rectangle)localObject2).x, ((Rectangle)localObject2).y, ((Rectangle)localObject2).width, ((Rectangle)localObject2).height);
        if (localRectangle5.y < ((Rectangle)localObject2).y) {
          paramBufferedImage.y = localRectangle5.y;
        }
        if (localRectangle5.y + localRectangle5.height > ((Rectangle)localObject2).y + ((Rectangle)localObject2).height) {
          paramBufferedImage.height = (localRectangle5.height + localRectangle5.y - paramBufferedImage.y);
        } else {
          paramBufferedImage.height = (((Rectangle)localObject2).y + ((Rectangle)localObject2).height - paramBufferedImage.y);
        }
        ((Rectangle)localObject2).y = paramBufferedImage.y;
        ((Rectangle)localObject2).height = paramBufferedImage.height;
      }
    }
    Collections.sort(this.k, new f(this));
    for (i2 = 0; i2 < this.g.size(); i2++) {
      for (i9 = 0; i9 < this.k.size(); i9++) {
        if ((((x)this.g.get(i2)).g.y >= ((Rectangle)this.k.get(i9)).y) && (((x)this.g.get(i2)).g.y + ((x)this.g.get(i2)).g.height <= ((Rectangle)this.k.get(i9)).y + ((Rectangle)this.k.get(i9)).height)) {
          ((x)this.g.get(i2)).j = i9;
        }
      }
    }
    Collections.sort(this.g, new g(this));
    i2 = 1;
    while (i2 != 0)
    {
      i2 = 0;
      double d1 = this.f.length;
      x localx = null;
      localObject1 = null;
      for (BufferedImage localBufferedImage = 0; localBufferedImage < this.g.size(); localBufferedImage++)
      {
        localRectangle5 = new Rectangle(((x)this.g.get(localBufferedImage)).g.x - 2, ((x)this.g.get(localBufferedImage)).g.y - 1, ((x)this.g.get(localBufferedImage)).g.width + 2, ((x)this.g.get(localBufferedImage)).g.height + 2);
        for (paramBufferedImage = 0; paramBufferedImage < this.g.size(); paramBufferedImage++)
        {
          if ((localBufferedImage != paramBufferedImage) && (((x)this.g.get(localBufferedImage)).j == ((x)this.g.get(paramBufferedImage)).j) && (Math.abs(((x)this.g.get(localBufferedImage)).e - ((x)this.g.get(paramBufferedImage)).e) < 2.0D))
          {
            localx = (x)this.g.get(localBufferedImage);
            localObject1 = (x)this.g.get(paramBufferedImage);
            d1 = Math.abs(((x)this.g.get(localBufferedImage)).e - ((x)this.g.get(paramBufferedImage)).e);
          }
          if ((localBufferedImage != paramBufferedImage) && (localRectangle5.contains(((x)this.g.get(paramBufferedImage)).g)))
          {
            localx = (x)this.g.get(localBufferedImage);
            localObject1 = (x)this.g.get(paramBufferedImage);
            localx.a((x)localObject1);
            this.g.remove(localObject1);
            i2 = 1;
            break;
          }
        }
        if (i2 != 0) {
          break;
        }
      }
      if (d1 < 3.0F * this.h / 4.0F)
      {
        localx.a((x)localObject1);
        this.g.remove(localObject1);
        i2 = 1;
      }
    }
  }
  
  public final String b()
  {
    String str1 = "";
    int m;
    if (this.l >= 10) {
      m = 3;
    } else {
      m = 2;
    }
    ArrayList localArrayList1 = (ArrayList)b.get(Math.min(Math.max(0, this.l - 8), b.size() - 1));
    ArrayList localArrayList2 = (ArrayList)c.get(Math.min(Math.max(0, this.l - 8), b.size() - 1));
    for (int n = 0; n < this.g.size(); n++)
    {
      int i1 = Integer.MIN_VALUE;
      String str2 = 0;
      for (String str3 = 0; str3 < localArrayList1.size(); str3++) {
        if ((Math.abs(((int[][])localArrayList1.get(str3)).length - ((x)this.g.get(n)).g.width) <= m) && (Math.abs(((int[][])localArrayList1.get(str3))[0].length - ((x)this.g.get(n)).g.height) <= 1)) {
          for (int i2 = -1; i2 < 2; i2++) {
            for (int i3 = -1; i3 < 2; i3++)
            {
              int i4 = 0;
              if ((((Integer)localArrayList2.get(str3)).intValue() == ((x)this.g.get(n)).k) && (((x)this.g.get(n)).k != 1)) {
                i4 += 50;
              }
              for (int i5 = 0; i5 < ((int[][])localArrayList1.get(str3)).length; i5++) {
                for (int i6 = 0; i6 < ((int[][])localArrayList1.get(str3))[0].length; i6++) {
                  if ((i5 + i3 < this.f.length) && (i5 + i3 >= 0) && (i6 + i2 < this.f[0].length) && (i6 + i2 >= 0)) {
                    if ((i5 + i3 >= ((x)this.g.get(n)).g.width) || (i6 + i2 >= ((x)this.g.get(n)).g.height))
                    {
                      i4--;
                    }
                    else
                    {
                      int i7;
                      if ((i7 = this.f[(((x)this.g.get(n)).g.x + i5 + i3)][(((x)this.g.get(n)).g.y + i6 + i2)]) == 2) {
                        if (((int[][])localArrayList1.get(str3))[i5][i6] == 2) {
                          i4 += 10;
                        } else {
                          i4 -= 10;
                        }
                      }
                      if ((i7 != 2) && (((int[][])localArrayList1.get(str3))[i5][i6] == 2)) {
                        i4--;
                      }
                    }
                  }
                }
              }
              if (i4 > i1)
              {
                str2 = str3;
                i1 = i4;
              }
            }
          }
        }
      }
      if (n != 0)
      {
        if (((x)this.g.get(n - 1)).j == ((x)this.g.get(n)).j)
        {
          if (((x)this.g.get(n)).g.x - (((x)this.g.get(n - 1)).g.x + ((x)this.g.get(n - 1)).g.width) >= 4)
          {
            str1 = str1 + " ";
            str1 = str1 + a(((x)this.g.get(n - 1)).g.x, ((x)this.g.get(n)).g.x, ((Rectangle)this.k.get(((x)this.g.get(n)).j)).y + ((Rectangle)this.k.get(((x)this.g.get(n)).j)).height / 2 - 1);
          }
        }
        else
        {
          str1 = str1 + a(((x)this.g.get(n - 1)).g.x, this.f.length, ((Rectangle)this.k.get(((x)this.g.get(n - 1)).j)).y + ((Rectangle)this.k.get(((x)this.g.get(n - 1)).j)).height / 2 - this.l / 2 - 1);
          str1 = str1 + "\n";
          str1 = str1 + a(0, ((x)this.g.get(n)).g.x, ((Rectangle)this.k.get(((x)this.g.get(n)).j)).y + ((Rectangle)this.k.get(((x)this.g.get(n)).j)).height / 2 - 1);
        }
      }
      else {
        str1 = str1 + a(0, ((x)this.g.get(n)).g.x, ((Rectangle)this.k.get(((x)this.g.get(n)).j)).y + ((Rectangle)this.k.get(((x)this.g.get(n)).j)).height / 2 - 1);
      }
      str1 = str2;
      str1 = str1 + new StringBuilder(String.valueOf((char)(str1 + 33))).toString();
      if (n == this.g.size() - 1) {
        str1 = str1 + a(((x)this.g.get(n)).g.x, this.f.length, ((x)this.g.get(n)).g.y + ((x)this.g.get(n)).g.height / 2 - this.l / 2);
      }
    }
    return str1;
  }
  
  private ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    for (int m = 0; m < this.g.size(); m++)
    {
      x localx;
      int[][] arrayOfInt = new int[(localx = (x)this.g.get(m)).g.width][localx.g.height];
      for (int n = 0; n < arrayOfInt.length; n++) {
        for (int i1 = 0; i1 < arrayOfInt[0].length; i1++) {
          if (this.f[(n + localx.g.x)][(i1 + localx.g.y)] == 2) {
            arrayOfInt[n][i1] = 2;
          } else {
            arrayOfInt[n][i1] = 0;
          }
        }
      }
      localArrayList.add(arrayOfInt);
    }
    return localArrayList;
  }
  
  private ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    for (int m = 0; m < this.g.size(); m++)
    {
      x localx = (x)this.g.get(m);
      localArrayList.add(Integer.valueOf(localx.k));
    }
    return localArrayList;
  }
  
  private ArrayList e()
  {
    ArrayList localArrayList = new ArrayList();
    for (int m = 0; m < this.d; m++) {
      for (int n = 0; n < this.e; n++) {
        if (this.f[m][n] == 1)
        {
          x localx = new x(m, n);
          localArrayList.add(localx);
          a(m, n, localx);
          localx.g.width += 1 - localx.g.x;
          localx.g.height += 1 - localx.g.y;
          localx.a();
        }
      }
    }
    return localArrayList;
  }
  
  private void a(int paramInt1, int paramInt2, x paramx)
  {
    while ((this.f[paramInt1][paramInt2] == 1) && (this.f[paramInt1][paramInt2] == 1))
    {
      this.f[paramInt1][paramInt2] = 2;
      paramx.a += 1;
      paramx.e += paramInt1;
      paramx.f += paramInt2;
      if (paramInt1 < paramx.g.x) {
        paramx.g.x = paramInt1;
      }
      if (paramInt1 > paramx.g.width) {
        paramx.g.width = paramInt1;
      }
      if (paramInt2 < paramx.g.y) {
        paramx.g.y = paramInt2;
      }
      if (paramInt2 > paramx.g.height) {
        paramx.g.height = paramInt2;
      }
      x localx = paramx;
      paramx = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = this;
      if (localx.a > 800) {
        break;
      }
      if (paramInt2 + 1 < paramInt1.d) {
        paramInt1.a(paramInt2 + 1, paramx, localx);
      }
      if ((paramInt2 + 1 < paramInt1.d) && (paramx + 1 < paramInt1.e)) {
        paramInt1.a(paramInt2 + 1, paramx + 1, localx);
      }
      if (paramInt2 - 1 >= 0) {
        paramInt1.a(paramInt2 - 1, paramx, localx);
      }
      if ((paramInt2 - 1 >= 0) && (paramx - 1 >= 0)) {
        paramInt1.a(paramInt2 - 1, paramx - 1, localx);
      }
      if (paramx + 1 < paramInt1.e) {
        paramInt1.a(paramInt2, paramx + 1, localx);
      }
      if ((paramx + 1 < paramInt1.e) && (paramInt2 - 1 >= 0)) {
        paramInt1.a(paramInt2 - 1, paramx + 1, localx);
      }
      if (paramx - 1 >= 0) {
        paramInt1.a(paramInt2, paramx - 1, localx);
      }
      if ((paramx - 1 < 0) || (paramInt2 + 1 >= paramInt1.d)) {
        break;
      }
      paramx = localx;
      paramInt2 = paramx - 1;
      paramInt1 = paramInt2 + 1;
      this = paramInt1;
    }
  }
  
  private static boolean a(Rectangle paramRectangle1, Rectangle paramRectangle2)
  {
    float f1 = Math.max(paramRectangle1.x, paramRectangle2.x);
    float f2 = paramRectangle1.x + paramRectangle1.width;
    float f3 = paramRectangle2.x + paramRectangle2.width;
    if ((f2 = Math.min(f2, f3)) >= f1)
    {
      f1 = Math.max(paramRectangle1.y, paramRectangle2.y);
      paramRectangle1 = paramRectangle1.y + paramRectangle1.height;
      paramRectangle2 = paramRectangle2.y + paramRectangle2.height;
      if ((paramRectangle1 = Math.min(paramRectangle1, paramRectangle2)) >= f1) {
        return true;
      }
    }
    return false;
  }
  
  private String a(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[10];
    String str = "";
    paramInt3 = Math.max(paramInt3, 0);
    int m;
    for (paramInt1 = paramInt1; paramInt1 < paramInt2; paramInt1++) {
      for (m = 0; m < a.size(); m++) {
        if (this.f[paramInt1][paramInt3] == ((d)a.get(m)).g) {
          arrayOfInt[m] += 1;
        }
      }
    }
    for (paramInt1 = 0; paramInt1 < 10; paramInt1++)
    {
      m = -1;
      paramInt2 = 3;
      for (paramInt3 = 0; paramInt3 < 10; paramInt3++) {
        if (arrayOfInt[paramInt3] > paramInt2)
        {
          paramInt2 = arrayOfInt[paramInt3];
          m = paramInt3;
        }
      }
      if (m == -1) {
        break;
      }
      str = str + " <p" + m + "> ";
      arrayOfInt[m] = 0;
    }
    return str;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\c\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */