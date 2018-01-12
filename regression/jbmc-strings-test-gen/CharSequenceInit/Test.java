public class Test
{
  public static void main(String a) {
    CharSequence s = a;
    String ab = "ab";
    if (!ab.equals(s))
        assert s.length() != 2;
  }
}
