package arrayMethods;

public class MergeArray {
	int[] one = {10,23,44,36,89,78};
	int[] two = {13,24,35,46,55,68};
	
	int[] Three = new int[one.length+two.length];
	
	
	
	public int[] merging() {
		
		int[] Three = new int[one.length+two.length];
		
		for(int count = 0; count<one.length;count++) {
			Three[count] = one[count];
		}
		
		for(int count = 0; count<two.length;count++) {
			Three[one.length+count] = two[count];
		}
		
		for(int count = 0; count<Three.length;count++) {
			System.out.println(Three[count]);
		}
		return Three;
	}
	
	public void seperatedigits() {
		int[]Even =null;
		int[]odd = null;
		
		for(int count =0; count<Three.length ;count++) {
			try{
				if(Three[count]%2==0) {
					Even[count]=Even[count]+Three[count];
					System.out.println(Even);
			}else if(Three[count]%2 !=0) {
				odd[count] = odd[count]+Three[count];
				System.out.println(odd);
			}
			}catch(NullPointerException NE) {
				System.out.println(NE.getMessage());
			}catch(ArrayIndexOutOfBoundsException AE) {
				System.out.println(AE.getMessage());
			}
			
			
		}
		
	}

}
