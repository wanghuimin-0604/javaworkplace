/*
给定两个二进制字符串，返回她们的和（用二进制表示），输入非空字符串且只包含数字0和1
 */

public class BinarySum{
	public static void main(String[] args){
		String a="110";
		String b="100";
		String str=addBinary(a,b);
		System.out.println(str);

	}
	public static  String addBinary(String a, String b) {
       int i=a.length()-1;
       int j=b.length()-1;
       int count=0;
       StringBuilder sb=new StringBuilder();//字符串缓冲区，一个长度可以变化的字符串
       while(i>=0||j>=0||count !=0){
           if(i>=0){
               count+=a.charAt(i--)-'0';
           }
           if(j>=0){
               count+=b.charAt(j--)-'0';
          }

           sb.append(count%2);//将指定的字符序列追加到此。
           count/=2;
       }


   
           return sb.reverse().toString();
}
}