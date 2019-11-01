package com.example.niobuffer;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class NioTest10 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("NioTest10","rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        FileLock fileLock = fileChannel.lock(0,5,true);
        System.out.println(fileLock.isShared());
        System.out.println(fileLock.isValid());
    }
}
