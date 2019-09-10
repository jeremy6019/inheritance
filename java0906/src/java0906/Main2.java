package java0906;

public class Main2 {

	public static void main(String[] args) {
		
		//MethodClass의 인스턴스 생성 
		MethodClass instance = new MethodClass(); 
		
		 //동일한 이름이지만 매개변수의 모양이 다른 메서드 호출 
	    instance.add(10,20);
	    instance.add(10.4,21.5);
       
	    instance.sum(100, 300);
	    instance.sum(100, 500, 300);
	    instance.sum(100, 500, 300, 600, 800);
	    
	    int result = instance.returnadd(300, 800);
	    result = instance.returnadd(result, 800);
	    System.out.printf("결과:%d\n", result);
	    //결과를 리턴하는 메소드는 다른 메소드의 매개변수가 될 수  있습니다. 
	    System.out.printf("결과:%d\n", 
	    		instance.returnadd(
	    				instance.returnadd(300, 200),400));
	   
	    MethodClass obj = new MethodClass();
	    System.out.printf("%d\n", obj.fibo(10));
	    System.out.printf("%d\n", obj.fibo(15));
	    System.out.printf("%d\n", obj.fibo2(10));
	    System.out.printf("%d\n", obj.fibo2(15));
	   
       obj.thismethod();	    
	    
	   
	    
	    
	    
	    
	}

}
