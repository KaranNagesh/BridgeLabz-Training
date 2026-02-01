package FuntionalInterface.dataserializationforbackup;

import java.io.*;

public class BackupService {

    static void backup(Object obj) throws Exception {

        if (obj instanceof Serializable) {

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("backup.dat"));

            out.writeObject(obj);
            out.close();

            System.out.println("Backup completed");
        } else {
            throw new RuntimeException("Class not serializable");
        }
    }
}
