package b;

import java.lang.reflect.Method;
import java.util.prefs.Preferences;

public final class j
{
  private static Preferences a = ;
  private static Preferences b = Preferences.systemRoot();
  private static Class c = a.getClass();
  private static Method d = null;
  private static Method e = null;
  private static Method f = null;
  private static Method g = null;
  private static Method h = null;
  private static Method i = null;
  private static Method j = null;
  private static Method k = null;
  private static Method l = null;
  private static Method m = null;
  
  static
  {
    try
    {
      (d = c.getDeclaredMethod("WindowsRegOpenKey", new Class[] { Integer.TYPE, byte[].class, Integer.TYPE })).setAccessible(true);
      (e = c.getDeclaredMethod("WindowsRegCloseKey", new Class[] { Integer.TYPE })).setAccessible(true);
      (f = c.getDeclaredMethod("WindowsRegQueryValueEx", new Class[] { Integer.TYPE, byte[].class })).setAccessible(true);
      (g = c.getDeclaredMethod("WindowsRegEnumValue", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE })).setAccessible(true);
      (h = c.getDeclaredMethod("WindowsRegQueryInfoKey1", new Class[] { Integer.TYPE })).setAccessible(true);
      (i = c.getDeclaredMethod("WindowsRegEnumKeyEx", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE })).setAccessible(true);
      (j = c.getDeclaredMethod("WindowsRegCreateKeyEx", new Class[] { Integer.TYPE, byte[].class })).setAccessible(true);
      (k = c.getDeclaredMethod("WindowsRegSetValueEx", new Class[] { Integer.TYPE, byte[].class, byte[].class })).setAccessible(true);
      (m = c.getDeclaredMethod("WindowsRegDeleteValue", new Class[] { Integer.TYPE, byte[].class })).setAccessible(true);
      (l = c.getDeclaredMethod("WindowsRegDeleteKey", new Class[] { Integer.TYPE, byte[].class })).setAccessible(true);
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  public static String a(int paramInt, String paramString1, String paramString2)
  {
    String str = paramString2;
    paramString2 = paramString1;
    paramString1 = -2147483647;
    paramInt = a;
    if ((paramString1 = (int[])d.invoke(paramInt, new Object[] { new Integer(paramString1), a(paramString2), new Integer(131097) }))[1] == 0)
    {
      paramString2 = (byte[])f.invoke(paramInt, new Object[] { new Integer(paramString1[0]), a(str) });
      e.invoke(paramInt, new Object[] { new Integer(paramString1[0]) });
      if (paramString2 != null) {
        return new String(paramString2).trim();
      }
    }
    return null;
  }
  
  public static void a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    String str = paramString3;
    paramString3 = paramString2;
    paramString2 = paramString1;
    paramString1 = -2147483647;
    paramInt = a;
    paramString1 = (int[])d.invoke(paramInt, new Object[] { new Integer(paramString1), a(paramString2), new Integer(983103) });
    k.invoke(paramInt, new Object[] { new Integer(paramString1[0]), a(paramString3), a(str) });
    e.invoke(paramInt, new Object[] { new Integer(paramString1[0]) });
  }
  
  public static void b(int paramInt, String paramString1, String paramString2)
  {
    paramInt = 0;
    String str2 = paramString2;
    String str1 = paramString1;
    int n = -2147483647;
    paramInt = a;
    int[] arrayOfInt;
    int i1 = ((Integer)m.invoke(paramInt, new Object[] { new Integer(arrayOfInt[0]), a(str2) })).intValue();
    e.invoke(paramInt, new Object[] { new Integer(arrayOfInt[0]) });
    if ((paramInt = (arrayOfInt = (int[])d.invoke(paramInt, tmp42_34))[1] != 0 ? arrayOfInt[1] : i1) != 0) {
      throw new IllegalArgumentException("rc=" + paramInt + "  key=" + paramString1 + "  value=" + paramString2);
    }
  }
  
  private static byte[] a(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length() + 1];
    for (int n = 0; n < paramString.length(); n++) {
      arrayOfByte[n] = ((byte)paramString.charAt(n));
    }
    arrayOfByte[paramString.length()] = 0;
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\j.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */