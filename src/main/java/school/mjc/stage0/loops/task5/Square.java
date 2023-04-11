package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String strVar = "";
        int count = 0;
        if (sideLength == "") {
            strVar = "test";
        } else {        
            for (char iter:sideLength.toCharArray()) {
                if (iter == '\n') {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
