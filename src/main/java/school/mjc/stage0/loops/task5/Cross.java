package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int count = 0;
        for (char iter:sideLength.toCharArray()) {
            if (iter == '\n') {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
