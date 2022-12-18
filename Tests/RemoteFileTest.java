import com.hierynomus.smbj.SMBClient;
import com.hierynomus.smbj.auth.AuthenticationContext;
import com.hierynomus.smbj.connection.Connection;
import com.hierynomus.smbj.session.Session;
import com.hierynomus.smbj.share.DiskShare;
import file_managment.RemoteFile;

import java.io.IOException;

public class RemoteFileTest {

    public static void main(String[] args) throws IOException {

        try (SMBClient c = new SMBClient()) {
            try (Connection connection = c.connect("192.168.0.163")) {
                AuthenticationContext ac = new AuthenticationContext("pi", "rpi".toCharArray(), "192.168.0.163");
                Session session = connection.authenticate(ac);

                try (DiskShare share = (DiskShare) session.connectShare("Shared")) {
                    RemoteFile rf = new RemoteFile(share, "/Python_Projects");
                    for (RemoteFile f: rf.listDir()) {
                        System.out.println(f.toString());
                        System.out.println(f.getName());
                    }
                    for (RemoteFile f: rf.listFile()) {
                        System.out.println(f.toString());
                        System.out.println(f.getName());
                        System.out.println(f.getExtension());
                    }
                    System.out.println(rf);
                    System.out.println(rf.getParent().getParent().getParent().getParent());
                }
            }
        }
    }
}
