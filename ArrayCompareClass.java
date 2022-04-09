package arrayMethods;

public class ArrayCompareClass {

	int[] sectionA = new int[] { 100, 80, 60, 50, 90,87};
	int[] sectionB = new int[] { 35, 65, 75, 50, 95,89};
	int MaxLength = 0;

	public int findlength() {

		int length1 = sectionA.length;
		int length2 = sectionB.length;

		if (length1 > length2) {
			MaxLength = length1;
			//return MaxLength;
		} else {
			MaxLength = length2;
			//return MaxLength;
		}
		//System.out.println(MaxLength);
		return MaxLength;
	}

	public void iterateElement() {
		
		for (int indedofElement = 0; indedofElement < MaxLength; indedofElement++) {
				if (sectionA[indedofElement] > sectionB[indedofElement]) {
					System.out.println("Sec-A value is greater than Sec-B");
				} else if(sectionA[indedofElement] < sectionB[indedofElement]) {
					System.out.println("Sec-B value is greater than Sec-A");
				} else if(sectionA[indedofElement] == sectionB[indedofElement]){
					System.out.println("Both Sec-A and Sec-B are same");
				}
			
		}

	}
}
