package com.microsoft.azure.spring.sample.service;


import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;


public class DirectMemoryOut {

    public void run() throws Exception {
        try {
            List<ByteBuffer> list = new ArrayList<ByteBuffer>();
            for (int i = 0; ; i++) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
                list.add(byteBuffer);
                Thread.sleep(10);
                if (i % 10 == 0) {
                    System.out.println("Using direct memory. Number " + i + " with memory usage:" + MemoryTools.printDirectMemory(true));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

