import file_managment.LocalFile;

import java.util.Arrays;

public class LocalFileTest {
    public static void main(String[] args) {
        LocalFile lf = new LocalFile("/home/un/Downloads/Test");
        for (LocalFile f: lf.listDir()) {
            System.out.println(f.toString());
        }
        for (LocalFile f: lf.listFile()) {
            System.out.println(f.toString());
            System.out.println(f.getExtension());
        }
        System.out.println(lf);
        System.out.println(lf.getParent().getParent().getParent().getParent().getName());
    }
}
