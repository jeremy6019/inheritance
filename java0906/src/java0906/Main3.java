package java0906;

public class Main3 {

	public static void main(String[] args) {
		
		//static메소드 호출 
	   Method3.staticDisplay(); 
	   
	   //instance 메소드 호출 
	   Method3 instance = new Method3();
	   instance.instanceDisplay();
	   //System클래스에는 
	   //public static long currentTimeMilis() 라는 메소드가 존재 
	   //이메소드는 1970년 1월 1일 자정 이후에 지나온 시간을 1/1000초 단위의 
	   //정수로 리턴해 주는 메서드 
	   //저메소드를 호출해서 결과를 출력  
	   
	   //메소드를 호출하고자 하는 경우에는 메소드 이름을 먼저 확인하고 
	   //static 존재여부를 확인 
	   //static 이 없으면 인스턴스 생성을 먼저 해야 합니다. 
	   //매개변수를 확인해서 어떤 종류의 데이터를 넘겨주어야 하는 지 확인 
	   //마지막으로 리턴타입을 확인해서 메소드의 이런 타입이 void가 아니면 
	   //결과를 변수에 저장하고  출력을 하면 됩니다 . 
	   
		long time = System.currentTimeMillis();
		System.out.printf("time:%d\n", time);
		
		
	}

}
