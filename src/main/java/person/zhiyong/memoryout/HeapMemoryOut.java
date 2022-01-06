package person.zhiyong.memoryout;

import java.util.ArrayList;
import java.util.List;

public class HeapMemoryOut {

    public void run() {
        try {
            List<MemoryData> memoryHold = new ArrayList<>();
            for (int i = 0;; i++) {
                MemoryData memory = new MemoryData(
                        "I am very big string for memory out."+i);
                memoryHold.add(memory);
                Thread.sleep(10);
                if (i%100 == 0) {
                    System.out.println("Finish loop:" + memoryHold.size());
                    MemoryTools.printMemory();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}