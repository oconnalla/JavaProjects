package ch3;

public class exponents {
	public static void main(String[] args) { 
		printPowersofN(2,7);
		printPowersofN(5,3);
	}
	
	public static int printPowersofN(int baseNum,int power){
	    if (power==0){ 
	      baseNum = 1;
		  System.out.println();
	      System.out.print((baseNum)+ " ");
	      return baseNum;
	    }else{
	      System.out.print((baseNum *= printPowersofN(baseNum, power-1))+ " "); 
	      return baseNum;
	    }
	}

}