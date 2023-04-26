package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String side = "";
		int middleVariable = sideLength / 2 + 1;
		for (int iter = 1; iter <= sideLength; iter++) {
			if (iter != middleVariable) {
				side = " ";
				for (int externalIter = 1; externalIter <= sideLength; externalIter++) {
					if (externalIter == middleVariable) {
						side += "8";
					}
					else if (externalIter != middleVariable) {
						side += " ";
					}
				}								
				System.out.println(side);
			}
			else if (iter == middleVariable) {
				side = " ";
				for (int intoMiddle = 1; intoMiddle <= sideLength; intoMiddle++) {
					side += "8";
				}
				System.out.println(side);
			}
			
		}
    }
}
