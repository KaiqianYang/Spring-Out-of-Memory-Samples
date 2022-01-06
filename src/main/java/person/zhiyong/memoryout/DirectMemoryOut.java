package person.zhiyong.memoryout;


import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *  -XX:+PrintGC -Xmx1G -Xmn1G
 *  -XX:+AlwaysPreTouch
 *  -XX:MaxMetaspaceSize=10M
 *  -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOut {

    public void run() throws Exception {
        int i =1;
        List<ByteBuffer> list = new ArrayList<ByteBuffer>();
        while(true){
            System.out.println("Number "+(i++)+ " with memory usage:"+MemoryTools.printDirectMemory(true));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect( 1024);
            list.add(byteBuffer);
        }
    }
}

