package a;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;

public final class h
{
  public h()
  {
    try
    {
      a(localObject = ImageIO.read(new File("team_territory.png")));
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
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


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\a\h.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */