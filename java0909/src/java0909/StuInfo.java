package java0909;

public class StuInfo {
	
	//인스턴스의 일련번호를 저장할 속성  
      private int no; 
        
	  public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	// 속성 선언 
    // 속성을 선언하면 instance가 접근할 수 없게됨 
    // 이런 경우에는 접근자 메소드를 만들어서 사용할 수 있도록 해주어야 합니다. 
		
	 private String schoolNum; 
	 private String name; 
	 private boolean gender; 
	 private String mobile;
	 
	 //일련번호를 만들기 위한 static변수 
	 //static변수는 1개만 만들어지고 초기값은 0 
	 private static int autoinc; 
	
	 public StuInfo() {
		 //static변수의 값을 1증가 
		 autoinc = autoinc + 1; 
		 //no	에  대입 
		 no = autoinc;
		 schoolNum = "1";
	 }
	 //매개변수가 있는 생성자 
	 //기존에 생성자가 존재하는데 매개변수의 개수를 다르게 해서 
	 //생성자를 생성 - Overloading 
	 public StuInfo(
			       String schoolNum, String name, 
			       boolean gender, String mobile) {
		 /*
		 autoinc ++; 
		 no = autoinc;
		 */
		 //자신의 매개변수가 없는 생성자를 생성자에서 호출 
		 this(); //무조건 맨 처음에 호출해야함 
		 
		 // this를 붙이면 메소드에서 찾지 않고 메소드 외부에서 찾습니다. 
		 // this가 안붙으면 메소드 내에서 찾고 없으면 메소드 외부에서 
		 // 찾습니다. 
		 this.schoolNum = schoolNum; 
		// this(); 에러가 남  
		 this.name = name; 
		 this.gender = gender; 
		 this.mobile = mobile; 		 
	 }
	 
	  
	  // 특정 속성의 값을 상수로 설정하는 생성자 
	  //특정 속성이 일정한 값의 형태인 경우 생성자에서 하는 것이 
	  // setter를  호출하지 않아도 되므로 유리합니다.  
//	 public StuInfo() {
//		 schoolNum = "1";
//	 } 
	  
	public String getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(String schoolNum) {
		this.schoolNum = schoolNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	  
	  
	
	} 	
	  
      
	

