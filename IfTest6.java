package bcs.test3;

public class IfTest6 {

	public static void main(String[] args) {
		//����) �Ʒ��� ���� ������ ���� �־����� ��, ���� ������� ��µǵ��� �ڵ带 �ϼ��ϼ���. 
		int a=2,b=7,c=6; //2 6 7 
		  if(a<b && a<c){
			  if(b<c) {System.out.println(a+" "+b+" "+c);}  
			  else {System.out.println(a+" "+c+" "+b);}; 
		  }else if(b<c){
		    if(a<c){System.out.println(b+" "+a+" "+c);} 
		    else {System.out.println(b+" "+c+" "+a); } 
		  }else{ 
			if(a<b) {System.out.println(c+" "+a+" "+b); } 
			else {System.out.println(c+" "+b+" "+a); }
		  }
		   	
		  			

	}

}