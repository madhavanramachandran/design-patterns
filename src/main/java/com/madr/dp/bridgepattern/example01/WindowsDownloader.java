package com.madr.dp.bridgepattern.example01;

public class WindowsDownloader implements IDownloader {

    @Override
    public void downLoadFile(String fileName) {
        System.out.println(String.format("Downloading %s exe from windows server...", fileName));
    }
}
