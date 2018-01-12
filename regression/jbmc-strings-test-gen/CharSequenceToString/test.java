public class test
{
    public static void main(CharSequence cs)
    {
        String s = cs.toString();
        int i = -1;
        if(s.equals("case1"))
            i = cs.length();
        assert i==-1 || i==5;
    }
}
