package java0909;

public class Main {

	public static void main(String[] args) {
		
	 	//Student 클래스의 instance생성 
		StuInfo student1 = 
				                   new StuInfo(); 
		// 속성에 set메소드를 이용해서 값을 설정 
	   //	student1.setSchoolNum("94101010");
		
		student1.setName("김기범 ");
		student1.setGender(true);
		student1.setMobile("01050386578");
		
		//get메소드를 이용해서 값을 가져와서 출력 
	    System.out.printf("학번:%s\n",
			                  student1.getSchoolNum());
		
        //student1 의 no값 출력 
	    System.out.printf("번호:%d\n", student1.getNo());
	    
	    StuInfo student2 = new StuInfo(); 
	    //student2 의 no값 출력 
	    System.out.printf("번호:%d\n", student2.getNo());
	    
	    //매개변수가 있는 생성자를 호출해서 초기화 
	    StuInfo student3 = new StuInfo("941010","김윤서", true, "01050387777" ); 
	    // set메소드를 호출하지 않고 속성을 초기화 
	    System.out.printf("학번 :%s\n", student3.getSchoolNum());
	    
	   
	    
	    
	}

}
