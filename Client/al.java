package Client;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public final class al
{
  String a;
  byte[] b;
  
  public al(BufferedImage paramBufferedImage, String paramString)
  {
    this.a = paramString;
    this.b = ((DataBufferByte)paramBufferedImage.getRaster().getDataBuffer()).getData();
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\al.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */