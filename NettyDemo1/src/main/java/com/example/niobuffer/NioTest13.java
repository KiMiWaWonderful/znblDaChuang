package com.example.niobuffer;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class NioTest13 {
    public static void main(String[] args) throws Exception {
        String inputFile = "NioTest13input";
        String outputFile = "NioTest13output";

        RandomAccessFile randomAccessFileInput = new RandomAccessFile(inputFile,"r");
        RandomAccessFile randomAccessFileOutput = new RandomAccessFile(outputFile,"rw");

        long inputLength = new File(inputFile).length();

        FileChannel fileChannelIn = randomAccessFileInput.getChannel();
        FileChannel fileChannelOut = randomAccessFileOutput.getChannel();

        MappedByteBuffer inputData = fileChannelIn.map(FileChannel.MapMode.READ_ONLY,0,inputLength);

        Charset charset = Charset.forName("GBK");
        CharsetDecoder decoder = charset.newDecoder();
        CharsetEncoder encoder = charset.newEncoder();

        CharBuffer charBuffer = decoder.decode(inputData);
        ByteBuffer byteBuffer = encoder.encode(charBuffer);

        fileChannelOut.write(byteBuffer);

        randomAccessFileInput.close();
        randomAccessFileOutput.close();
    }
}
