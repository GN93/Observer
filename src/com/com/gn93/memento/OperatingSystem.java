package com.gn93.memento;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }

    public OperatingSystemMemento save(){
        System.out.println("Zapisano backup nr: " + this.backupNumber + " z datą: " + backupDate);
        return new OperatingSystemMemento(backupNumber,backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento){
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
        System.out.println("Wczytano backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }

}
