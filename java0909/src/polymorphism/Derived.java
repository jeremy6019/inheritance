package polymorphism;

//Base클래스를 상속받는 Derived 클래스 
public class Derived extends Base{
 
	// 이 메소드는 내용은 다르지만 동일한  모양으로  Base에 존재 
	// 이러한 경우를 method overriding이라고 합니다.
	// 메소드 재정의라고 합니다.  
	@Override // 오버라이딩 된 메소드라는 것을 표시 
	public void display() {
		 System.out.printf("하위클래스의 메소드 호출!!\n");
	 }
	 
	// 일반 메소드 
	public void print() {
		System.out.printf("일반 메소드 호출!!\n");
	}
	 
}
