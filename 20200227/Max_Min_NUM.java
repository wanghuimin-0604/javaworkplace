public class Max_Min_NUM{
	public static void main(String[] args){
		int a=10;
		int b=50;
		int c=100;
		Method2(a,b,c);

		
	}

	private static void Method2(int a,int b,int c){
		int temp=0;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}

		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("最大值为"+c);
		System.out.println("最小值为"+a);
	}

}