public class SwapNum{
	public static void main(String[] args){
		int a=10;
		int b=50;
		SwapMethod1(a,b);
		SwapMethod2(a,b);
		
	}
	public static void SwapMethod1(int a,int b){
		int temp=0;
		System.out.println("交换前"+"a="+a+" "+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后"+"a="+a+" "+"b="+b);
		System.out.println("##########################");
	}
	public static void SwapMethod2(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("交换后"+"a="+a+" "+"b="+b);

	}
}