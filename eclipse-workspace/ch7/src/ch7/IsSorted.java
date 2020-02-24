package ch7;

public class IsSorted {
	public static void main(String[] args) {
		int[] data = {1,2,3,1,5,6};
		System.out.print(isSorted(data));
	}
		
	public static boolean isSorted(int[] list){
		boolean checker = true;
		for(int i = 1; i < list.length; i++){
				if(list[i] >= list[i - 1]) {
				checker = true;
				}else {
					checker = false;
				}
			}
		return checker;
	}
}
