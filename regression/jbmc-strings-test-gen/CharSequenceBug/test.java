public class test {
    public static void main(String s) {
        if (s==null)
            return;
        CharSequence target = "b";
        String replaced = "";
        if (target.length() == 1)
            replaced = s.replace('b', 'c');
        assert replaced.indexOf('b') != -1;
    }
}
