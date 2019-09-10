package java0906;

public class Method3 {
  
	// static 메소드 - 클래스 이름만으로 호출가능
	// 인스턴스 변수를 사용하지 못함 
	public static void staticDisplay() {
		System.out.printf("Hello Java!!\n");		
	}
	
	// instance 메소드 - 인스턴스를 이용해서 호출해야 합니다. 
	// 인스턴스 변수사용이 가능  
	public  void instanceDisplay() {
		System.out.printf("Hello Java!!\n");		
	}
	
	
}
