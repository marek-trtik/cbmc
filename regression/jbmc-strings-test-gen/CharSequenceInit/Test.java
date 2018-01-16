public class Test
{
  public static void main(String[] args) {
    if (args.length<1)
        return;
    String a = args[0];
    CharSequence s = a;
    String ab = "ab";
    if (!ab.equals(s))
        assert s.length() != 2;
  }
}
