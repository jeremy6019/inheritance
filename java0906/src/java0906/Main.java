package java0906;

public class Main {

	public static void main(String[] args) {

		//Student 클래스의 객체 만들기 
		Student student = new Student();
		
		//메소드 호출 
		student.work(); 
		
		//매개변수 없는 메소드 호출 
		student.noArg(); 		
		System.out.println("=================");
		//매개변수 있는 메소드 호출 
		student.oneArg(3); 
		
		int k=0; 
		//메소드의 매개변수로 기본형 데이터를 넘겨주는 경우 
		//메소드를 호출해도 데이터는 변경되지 않습니다. 
		student.val(k);
		System.out.printf("k:%d\n", k);
		
		int[] brr = { 30, 40, 50, 60 };
		//메소드의 매개변수로 기본형이 아닌 데이터를 넘겨주면 
		//메소드를 호출하고 난후 데이터가 변경될 수 있습니다. 
		student.ref(brr);
		System.out.printf("brr[0]:%d\n", brr[0]);
		
		
			
/*		
		//Student 클래스 객체 만들기 
		//Student 클래스의 객체를 생성하고 그 주소를 etude1이라는 변수에 대입 
		Student student1 = new Student(); 
		Student student2 = new Student(); 
		
		//System.out.printf("%s\n", student1); 
		//studentName이라는 인스턴스 변수에 값을 대입 
		student1.stuName = " 김기범 "; 
		student2.stuName = " 김윤서 "; 
		
//		student1.num = "10"; 
//		student1.phone = "010";
	    
		int a = 10; 
		a = 7; 
		//final이 붙으면 읽기 전용 
		final int B = 20; 
	    B = 30;
		
		
		student1.schoolName= "신명초등학교 ";
		student2.schoolName= "묘곡초등학교 ";
    
		System.out.printf("%s\n", student1.stuName);
		System.out.printf("%s\n", student2.stuName);
		System.out.printf("%s\n", student1.schoolName);
		System.out.printf("%s\n", student2.schoolName);
*/

		
	}

}
