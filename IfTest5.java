package bcs.test3;

public class IfTest5 {

	public static void main(String[] args) {
		int a=5,b=9,c=12; //세개의 수가 주어짐
		int temp=0; //temp는 빈컵역할
		
		//문제)if문을 써서 세개의 숫자 중 제일 큰 수를 temp에 담아 출력하세요.
//		if (a > b)
//			if (a > c) temp = a;
//			
//		if (c > b)
//			if (c > a) temp = c;
//			
//		if (b > a) 
//			if (b > c) temp = b;
							
//		if (a > b && a > c) temp = a;
//		if (b > a && b > c) temp = b;
//		if (c > a && c > b) temp = c;

		if(a>b) {temp=a;}
		if(b>a) {temp=b;}
		if(c>temp) {temp=c;}
		
		
		System.out.println(a+" "+b +" "+c);
		System.out.println("최대값 = " + temp);
	}

}
