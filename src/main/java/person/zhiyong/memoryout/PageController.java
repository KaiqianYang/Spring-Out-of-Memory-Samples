package person.zhiyong.memoryout;

import java.util.Timer;
import java.util.TimerTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping("/")
    public String home() throws Exception {
        return "This is the demo for direct memory analysis.";
    }

    @RequestMapping("/oom")
    public String oom() throws Exception {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    HeapMemoryOut heapMemoryOut = new HeapMemoryOut();
                    heapMemoryOut.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }}, 100);
        return "Now run the leak problem";
    }

}
