import file_managment.LocalFile;

public class LocalFileTest {
    public static void main(String[] args) {
        LocalFile lf = new LocalFile("J:\\Coding_Projects\\FilesExplorer");
        for (LocalFile f: lf.listDir()) {
            System.out.println(f.toString());
            System.out.println(f.getName());
        }
        for (LocalFile f: lf.listFile()) {
            System.out.println(f.toString());
            System.out.println(f.getName());
            System.out.println(f.getExtension());
        }
        System.out.println(lf);
        System.out.println(lf.getParent().getParent().getParent().getParent().getName());
    }
}
