package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String side = "";
		for (int iter = 1;iter <= sideLength; iter++) {
			if (iter == 1) {
				for (int iterInSideFirst = 1;iterInSideFirst <= sideLength; iterInSideFirst++) {
					side += "8";
				}
				System.out.println(side);
			}
			else if (iter == sideLength) {
				side = "";
				for (int iterInSideFirst = 1;iterInSideFirst <= sideLength; iterInSideFirst++) {
					side += "8";
				}
				System.out.println(side);
			}			
			else if (iter > 1 && iter < sideLength) {
				side = "";				
				for (int iterInSideFirst = 1;iterInSideFirst <= sideLength; iterInSideFirst++) {
					if (iterInSideFirst > 1 && iterInSideFirst < sideLength) {
						side += " ";
					} else {
						side += "8";
					}
				}
				System.out.println(side);
			}			
		}
    }
}
