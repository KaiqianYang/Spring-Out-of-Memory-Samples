package com.microsoft.azure.spring.sample.service;

import java.util.ArrayList;
import java.util.List;

public class HeapMemoryOut {

    public void run() {
        try {
            List<LongString> memoryHoldStringList = new ArrayList<>();
            for (int i = 0; ; i++) {
                LongString memory = new LongString("I am very big string for memory out. In Loop " + i + ". ");
                memoryHoldStringList.add(memory);
                Thread.sleep(10);
                if (i % 10 == 0) {
                    System.out.println("Using on-heap memory. Finish loop:" + memoryHoldStringList.size());
                    MemoryTools.printMemory();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}