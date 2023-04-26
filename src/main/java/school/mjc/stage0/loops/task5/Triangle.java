package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int mainIter = 1; mainIter <= cathetusLength; mainIter++) {
			for (int eightIter = 1; eightIter <= mainIter; eightIter++) {
				System.out.print("8");
			}
			for (int emptyIter = 1; emptyIter <= cathetusLength; emptyIter++) {
				System.out.print(" ");
			}			
			System.out.println();
		}
    }
}
