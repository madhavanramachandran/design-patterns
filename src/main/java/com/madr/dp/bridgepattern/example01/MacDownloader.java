package com.madr.dp.bridgepattern.example01;

public class MacDownloader implements IDownloader  {

    @Override
    public void downLoadFile(String fileName) {
        System.out.println(String.format("Downloading %s mdg from mac server...", fileName));
    }
}
