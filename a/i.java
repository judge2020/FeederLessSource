package a;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public final class i
{
  private static ArrayList a;
  private static ArrayList b;
  
  public i()
  {
    try
    {
      a(localObject = ImageIO.read(new File("wards_map.png")));
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
    (a = new ArrayList()).add(Integer.valueOf(8484511));
    a.add(Integer.valueOf(1986641));
    a.add(Integer.valueOf(1168341));
    a.add(Integer.valueOf(1212545));
    a.add(Integer.valueOf(9054613));
    a.add(Integer.valueOf(1907792));
    a.add(Integer.valueOf(10587006));
    a.add(Integer.valueOf(32615));
    a.add(Integer.valueOf(10134060));
    a.add(Integer.valueOf(16776960));
    a.add(Integer.valueOf(16711930));
    a.add(Integer.valueOf(15582208));
    a.add(Integer.valueOf(16711680));
    a.add(Integer.valueOf(65280));
    a.add(Integer.valueOf(12518417));
    a.add(Integer.valueOf(13793847));
    a.add(Integer.valueOf(8298037));
    a.add(Integer.valueOf(8893551));
    a.add(Integer.valueOf(250));
    a.add(Integer.valueOf(65530));
    a.add(Integer.valueOf(13143503));
    a.add(Integer.valueOf(9078972));
    a.add(Integer.valueOf(12608820));
    a.add(Integer.valueOf(14920770));
    a.add(Integer.valueOf(12511252));
    a.add(Integer.valueOf(6254620));
    a.add(Integer.valueOf(8161105));
    a.add(Integer.valueOf(12563420));
    (b = new ArrayList()).add("radiant home");
    b.add("radiant home bot");
    b.add("radiant home mid");
    b.add("radiant home top");
    b.add("radiant top lane");
    b.add("radiant bot lane");
    b.add("radiant mid lane");
    b.add("radiant top jungle");
    b.add("radiant bot jungle");
    b.add("radiant ancient cliff");
    b.add("radiant bot rune cliff");
    b.add("radiant mid area");
    b.add("radiant top jungle cliff");
    b.add("radiant top rune cliff");
    b.add("top rune area");
    b.add("roshan area");
    b.add("dire top jungle");
    b.add("dire bot jungle");
    b.add("dire bot jungle cliff");
    b.add("dire top jungle cliff");
    b.add("dire top lane");
    b.add("dire bot lane");
    b.add("dire mid lane");
    b.add("dire mid area");
    b.add("dire home top");
    b.add("dire home mid");
    b.add("dire home bot");
    b.add("dire home");
  }
  
  private static int[][] a(BufferedImage paramBufferedImage)
  {
    byte[] arrayOfByte = ((DataBufferByte)paramBufferedImage.getRaster().getDataBuffer()).getData();
    int i = paramBufferedImage.getWidth();
    int j = paramBufferedImage.getHeight();
    paramBufferedImage = paramBufferedImage.getAlphaRaster() != null ? 1 : 0;
    int[][] arrayOfInt = new int[j][i];
    int k;
    int m;
    int n;
    if (paramBufferedImage != 0)
    {
      paramBufferedImage = 0;
      k = 0;
      m = 0;
      while (paramBufferedImage < arrayOfByte.length)
      {
        n = (n = (n = (n = 0 + ((arrayOfByte[paramBufferedImage] & 0xFF) << 24)) + (arrayOfByte[(paramBufferedImage + 1)] & 0xFF)) + ((arrayOfByte[(paramBufferedImage + 2)] & 0xFF) << 8)) + ((arrayOfByte[(paramBufferedImage + 3)] & 0xFF) << 16);
        arrayOfInt[k][m] = n;
        m++;
        if (m == i)
        {
          m = 0;
          k++;
        }
        paramBufferedImage += 4;
      }
    }
    else
    {
      paramBufferedImage = 0;
      k = 0;
      m = 0;
      while (paramBufferedImage < arrayOfByte.length)
      {
        n = (n = (n = -16777216 + (arrayOfByte[paramBufferedImage] & 0xFF)) + ((arrayOfByte[(paramBufferedImage + 1)] & 0xFF) << 8)) + ((arrayOfByte[(paramBufferedImage + 2)] & 0xFF) << 16);
        arrayOfInt[k][m] = n;
        m++;
        if (m == i)
        {
          m = 0;
          k++;
        }
        paramBufferedImage += 3;
      }
    }
    return arrayOfInt;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\a\i.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */