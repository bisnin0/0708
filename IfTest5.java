package bcs.test3;

public class IfTest5 {

	public static void main(String[] args) {
		int a=5,b=9,c=12; //������ ���� �־���
		int temp=0; //temp�� ���ſ���
		
		//����)if���� �Ἥ ������ ���� �� ���� ū ���� temp�� ��� ����ϼ���.
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
		System.out.println("�ִ밪 = " + temp);
	}

}
