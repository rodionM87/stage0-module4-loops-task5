package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String strVar = "";
        int count = 0;
        if (cathetusLength == "") {
            strVar = "test";
        } else {        
            for (char iter:cathetusLength.toCharArray()) {
                if (iter == '\n') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
