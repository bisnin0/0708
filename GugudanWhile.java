package bcs.test3;

public class GugudanWhile {
	public static void main(String[] args) {
		//�밡�ٷ� �ۼ��� Gugudan1.java�� �����ϼż� �Ȱ��� ��µǵ��� while(true)���� �ۼ��غ�����.
		//dan�� cnt�� 
		int dan=7,cnt=1;		

		while(true) {
			//System.out.println(dan+"*"+1+"="+(dan*1)+);
			System.out.print(dan+"*"+cnt+"="+(dan*cnt)+" ");
			cnt++;
			if(cnt==10) break;
			
		}
	}//end
}//class END
