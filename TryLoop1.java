package bcs.test3;

public class TryLoop1 {

	public static void main(String[] args) {
		//실습)num=숫자, tot=합계라고 했을 때, 
		//num을 하나씩 증가시켜서 1부터 10까지의  while(true)를 써서 구하세요.
		//출력된 결과: 1  2  3  4  5  6  7  8  9  10  tot=55

		System.out.println("while(true)형식 실습");
		int num = 0, tot = 0;
		
			while (num<10) {
				num++;
				System.out.print(num+" ");
				tot = tot + num;
			}
			
		//while(true)...
		
		System.out.print("tot=" + tot);

	}// main end

}// class end
