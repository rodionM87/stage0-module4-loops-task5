package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int count = 0;
        for (char iter:cathetusLength.toCharArray()) {
            if (iter == '\n') {
                count++;
            }
        }
        System.out.println(count);
    }
}
