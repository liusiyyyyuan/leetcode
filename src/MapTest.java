import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author liusiyuan
 * @Data 2024/9/23 10:52
 * @注释：
 */
public class MapTest {

    LinkedHashMap<Integer, ArrayList<String>> map1;
    Integer i;
    Integer master1;
    Integer branch_test1;

    String stash2;
    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        Map<Integer, ArrayList<String>> map = mapTest.arrTest();
    }

    public LinkedHashMap<Integer, ArrayList<String>> arrTest() {
        return this.map1;
    }

    public void stashTestFun(){
        int a = 0;
    }

    public LinkedHashMap<Integer, ArrayList<String>> getMap1() {
        return map1;
    }

    public void setMap1(LinkedHashMap<Integer, ArrayList<String>> map1) {
        this.map1 = map1;
    }
}

class Stash3 {

}