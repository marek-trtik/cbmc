import java.io.BufferedReader;
import java.io.FileReader;

public class test {

    public static String check(BufferedReader br) throws Exception{
        String s = br.readLine();
        return s;
        }

    public static void main(String[] args) {
        String thisLine = null;
        int numLines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.class"));
            String line = check(br);
            while ((thisLine = check(br)) != null) {
                System.out.println(thisLine);
                numLines += 1;
            }
        } catch(Exception e) {
        e.printStackTrace();
        return;
        }
        assert numLines > 0;
    }
}
