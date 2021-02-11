package ru.academy.testtaskvirus;

public class Item {

    String appName;
    String appHash;

    public String getAppName() {
        return appName;
    }

    public String getAppHash() {
        return appHash;
    }

    public Item(String appName, String appHash) {
        this.appName = appName;
        this.appHash = appHash;
    }
}
