import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import  static org.junit.Assert.*;

public class PingPongTest {
    @Test
public  void runPingPongTest_replaceMultiplesOf3_ArrayList() {
    PingPong testPingPong = new PingPong();
        List<Object> expectedOutPut = new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        expectedOutPut.add("ping");
        expectedOutPut.add(7);
        expectedOutPut.add(8);
        expectedOutPut.add("ping");
        expectedOutPut.add("pong");
        expectedOutPut.add(11);
        expectedOutPut.add("ping");
        expectedOutPut.add(13);
        expectedOutPut.add(14);
        expectedOutPut.add("pingpong");
        assertEquals(expectedOutPut, testPingPong.runPingPong(15));
    }
}
