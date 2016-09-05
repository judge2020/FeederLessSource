package a;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public final class f
{
  private static ArrayList a;
  private static ArrayList b;
  
  public f()
  {
    try
    {
      a(localObject = ImageIO.read(new File("map_regions.png")));
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
    (a = new ArrayList()).add(Integer.valueOf(-16711835));
    a.add(Integer.valueOf(39168));
    a.add(Integer.valueOf(-3342592));
    a.add(Integer.valueOf(60928));
    a.add(Integer.valueOf(-57037));
    a.add(Integer.valueOf(-62464));
    a.add(Integer.valueOf(-13435136));
    a.add(Integer.valueOf(-16751105));
    a.add(Integer.valueOf(-16711681));
    a.add(Integer.valueOf(-13434625));
    a.add(Integer.valueOf(-7046157));
    a.add(Integer.valueOf(-11620946));
    a.add(Integer.valueOf(-3195675));
    (b = new ArrayList()).add("dire home");
    b.add("radiant home");
    b.add("radiant offlane");
    b.add("radiant safelane");
    b.add("radiant midlane");
    b.add("dire offlane");
    b.add("dire safelane");
    b.add("dire midlane");
    b.add("radiant top jungle");
    b.add("radiant bot jungle");
    b.add("dire bot jungle");
    b.add("dire top jungle");
    b.add("roshan pit");
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


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\a\f.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */