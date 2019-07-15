package com.madr.dp.bridgepattern;

import com.madr.dp.bridgepattern.example01.IDownloader;
import com.madr.dp.bridgepattern.example01.MacDownloader;
import com.madr.dp.bridgepattern.example01.WindowsDownloader;

public class BridgePatternTest {

    public static void main (String [] args) {
        download("windows", "node");
        download("mac", "evernote");
    }

    static void download(String environment, String fileName) {
        IDownloader downloader = null;

        switch (environment) {
            case "windows" :
                downloader = new WindowsDownloader();
                downloader.downLoadFile(fileName);
                break;

            case "mac" :
                downloader = new MacDownloader();
                downloader.downLoadFile(fileName);
                break;

            default:
                System.out.println("NO downloader found");

        }
    }
}
