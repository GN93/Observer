package com.gn93.memento;

import java.util.Date;

public class OperatingSystemMemento {

    private int backupNumber = 0;
    private Date backupDate;

    OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    int getBackupNumber() {
        return backupNumber;
    }

    Date getBackupDate() {
        return backupDate;
    }
}
