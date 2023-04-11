package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String strVar = "";
        int count = 0;
        if (height == "") {
            strVar = "test";
        } else {        
            for (char iter:height.toCharArray()) {
                if (iter == '\n') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
