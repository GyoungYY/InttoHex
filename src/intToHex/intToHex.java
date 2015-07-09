package intToHex;

public class intToHex {
	private static final int A = 55;
	
	private static final int ZERO = 48;
	
	public static String inttohex(int x){
		StringBuilder str=new StringBuilder();
		if(x<0)
			x=-x;
		while(x/16!=0){
			char a = inttochar(x%16);
			System.out.println(String.valueOf(a));
			str.append(a);
			x=x/16;
		}
		str.append(inttochar(x%16));
		str.reverse();
		return str.toString();
	}
	public static char inttochar(int i){
		char c;
		if(i>=0&&i<=9){
			c=(char)(i+ZERO);
			return c;
		}
		else{
			c=(char)(i+A);
			return c;
		}
			
	}
	public static void main(String[] args) {
		String str;
		int x;
		x=Integer.MAX_VALUE;
		//0,20,-10,-1,256,Integer.MAX_VALUE,Integer.MIN_VALUE
		str=inttohex(x);
		if(x>=0){
		    System.out.println("0x"+str);
		}
		else if(x==Integer.MIN_VALUE){
			System.out.println("-0x80000000");
		}
		else{
			System.out.println("-0x"+str);
		}
	}
}
