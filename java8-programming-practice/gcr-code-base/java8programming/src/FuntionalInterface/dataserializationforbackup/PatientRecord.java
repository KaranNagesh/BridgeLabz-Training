package FuntionalInterface.dataserializationforbackup;

import java.io.Serializable;

public class PatientRecord implements Serializable {

    int id;
    String name;

    PatientRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
