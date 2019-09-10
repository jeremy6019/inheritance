package define;

public class ClassDefine {

		/*
		 
		  ** 객체 지향 프로그래밍
		  - java는 완전한 객체지향 언어 
		     java에서는 클래스를  만들지 않고 코딩을 할 수 없습니다. 
		     
		  1. 객체 지향의 3대특징 
		    1) Encapsulation(캡슐화) -변수와 함수를 하나로 묶어서 불필요한 부분을 외부로 노출시키지 않는 것 
		        - 클래스와 객체를 만드는 방법 
		    2) inheritance(상속성) - 상위 클래스의 모든 것을 하위 클래스가 물려 받는 것 
		    3) **Polymorphism(다형성) **  - 동일한 메세지에 대하여 다르게 반응하는 것 
		       동일한 코드가 상황에 따라 다른 메소드를 호출하는 것 
		       상속과 메소드의 재정의(Overriding)을 이용해서 구현 
		       면접에서 다형성을 많이 질문 
		   
		   2. 객체지향 언어의 장점과 단점 
		       - 코드의 재사용성이 증가하고 중복이 제거되서 유지보수가 편리 
		       - 작업의 단위가 메소드가 아니라 객체이기떄문에 불필요한 부분을 가지고 다닐 가능성이 있음 
		       - 안정적인 것이 장점
		    
		    3. class 와 object(최근에는 object보다 instance라는 단어를 많이 사용)
		      - class는 사용자가 만든 자료형이고, 
		        object는 class를 기반으로 메모리를 할당받은 실제 사용이 가능한 데이터
		        int는 자료형이고 a는 10이라는 데이터를 소유한 변수 
		        int가 class 이고 a가 object 
		        int b; // 이때 b를 object라고 하지는 않습니다. (데이터가 없음) 
		        
		        - class가 일반자료형과 다른 점은 class는 정해진 틀이 없어서 개발자가 마음대로 만들 수 있고,
		          자료형은 독자적으로 사용할 수 없지만, class는 class자체를 사용할 수도 있습니다 .
		        - class는 object들의 특징을 가진 정적인(한번 만들면 수정을 못하는 것 -static) 데이터이고
		          object는 class를 기반으로 해서 생성하고 특징을 변경할 수 있는 동적(만들고 난후 수정이 가능한 것 -Dynamic)인 데이터 
		          최근에는 class를 기반으로 만들어진 object를  instance라고 부르기도 합니다. 
		          
		          - class를 기반으로 instance를 만들는때 는  new 클래스 이름(매개변수);
		          
		      ** 클래스의 생성 
		         [접근지정자] + [클래스의 종류] + class + 클래스이름 + [extends 상위클래스 이름] + 
		         [implements 인터페이스 이름]{
		         		         
		         }
		        - 접근지정자: private, protected, default(package), public 중하나를 기재하는데 클래스의 사용범위를 나타내는
		           것 입니다.  
		        - 클래스 종류: abstract, final, static중 하나를 기재할 수 있는데 상속가능여부나 객체 생성가능여부 등을 지정하기
		          위해서 사용 
		        - extends는 상속을 할때 사용 
		        - implements는 구현을 할때 사용 
		        
		       ** 클래스의 구성요소 
		       1. 속성(attribute) - field, member variable, property 
		         - 클래스나 객체의 특성을 저장하기 위한 변수 
		       2. method 
		         - 클래스나 객체가 일을 할 수 있도록 만들어 놓은 기능  
		         - method가 클래스안에 만들어져 있지 않고 클래스 외부에 있으면 function이라고 합니다. 
		         - function을 만들수 있으면 함수형 프로그래밍 언어라고 합니다. 
		         java는 function을 만들수 없지만 함수형 프로그래밍언어와 유사한 형태를 구현할수 있는 람다라는  기능을 
		         제공합니다. 안드로이드에서는 우리가 작성한 코드를 람다식으로 변경해 버리기도 합니다. 
		         
		       3. constructor(생성자) 
		         - 객체를 만들때 호출해서 초기화 작업을 수행해주는 특별 용도의 메소드 
		         
		       4. inner class 
		         - 클래스 안에 클래스를 만들수 있습니다. 
		         
		       5. 클래스나 객체를 가지고 자신의 내부에 있는 속성이나 메소드 또는 inner class를 호출할 때 는 .을 이용해서 접   
		           constructor는 new 다음에 호출해야 합니다.  
		       
		       Eclipse에서는 class를 만들때 src디렉토리 위에서 마우스 오른쪽을 누르고 New - class메뉴를 실행하고
		       클래스 이름과 옵션들을 선택해주면 됩니다. 
		       src디렉토리에 만들지 않으면 번역(compile)을 해주지 않습니다.
		       
		    ** main메소드 
		      public static void main(String[] args)메소드는컴퓨터에서 바로 호출해서 실행되는 메소드 
		     이메소드를 소유한 클래스가 시행클래스 입니다.
		     실행클래스는 객체를 만들 필요가 없고 실행시켜 달라고 명령을 주면 (java클래스 이름)운영체제가 알아서 객체를 
		     생성해서 실행을 합니다.     
		     
		   ** 클래스의 객체 생성 
		     new 클래스 이름() - 이문장이 객체를 생성하고 객체의 주소를 리턴합니다. 
		     객체를 생성하고 그주소를 기억해서 재사용하기 위해서 
		     클래스이름 변수이름 = new 클래스이름(); 
		     
		   ** variable(변수) 
		       - 데이터를 재사용하기 위해서 데이터에 이름을 설정한 것 
		       - 이름은 자신의 영역에서 유일해야 합니다. 
		       1. Local Variable(지역변수) 
		         - 메소드, 제어문, 예외처리 구문안에서 만들어지는 변수로 자신이 만들어진 영역에서만 사용할 수 있는 변수 
		         - 자동 초기화가 되지 않습니다. 그렇기때문에  값을 대입해서 사용해야 합니다. 
		         - 변수를 만들때 앞에 final을 붙이면 변수의 값을 변경할  수 없습니다.   
		            읽기 전용의 변수를 만들때 final을 사용합니다.
		            [final] 자료형 변수명; 
		            
		       2. instance Variable (Member Variable)
		         - 클래스 안에 선언해서 객체가 사용하는 변수   
		         - 객체가 만들어질때 인스턴스 변수들을 저장하기 위한 공간을 생성  
		         - 자동초기화가 됩니다. 
		           숫자자료형의 경우는 0으로 boolean의 경우는 false로 그 이외의 자료형은 null로 초기화 됩니다. 
		           - 생성방법 
		           접근지정자 [final]자료형 변수명 ; 
		           
		       3. Class Variable  (static Variable) 
		           - 클래스 안에 선언해서 클래스가 사용하는 변수 
		           - 클래스가 만들어 질때 클래스 변수를 저장하기 위한 공간을 생성 
		           - 자동초기화가 됩니다. 
		           접근지정자 static[final] 자료형 변수명;
		            - instance variable가 유사하게 만드는데 앞에 static을 붙이면 됩니다. 
		            
		        4. Class Variable 과 Instance Variable의 차이 
		        - Class Variable 은 instance가 공유하기 위해서 만드는 것으로 1개만 만들어 집니다. 
		        - Instance Variable은 Instance의 상태를 저장하기 위한 것으로 Instance 마다 각각 생성 
		        
		     ** 접근 지정자
		       - private : 자신의 클래스 안에서만 사용할 수 있도록 해주는 접근 지정자 
		          외부로 노출하지 않게 하기 위해서 사용하는 접근 지정자 
		           
		       - default(package) : 접근 지정자를 붙이지 않는 것으로 패키지 내에서는 public이되고, 
		          패키지 외부에서는 private
		          
		       - protected:자신의 클래스와 상속받은 클래스 내부에서 사용 가능하도록 해주는 접근 지정자 
		         클래스 외부(객체)에서는 사용할 수 없음 
		        
		       - public: 클래스 외부에서 클래스나 객체가 호출할 수 있도록 해주는 접근 지정자 
		         외부에서 사용하기 위해서 붙이는 접근 지정자 
              
               - public > protected > default > private 순으로 접근지정자가 강하다고 합니다.  		
               
               - 일반적으로는 변수는 private로 하고 메소드를 public으로 만들어서 사용하는 것을 권장 
                  변수는 동시성 제어가 어렵지만 메서드는 동시성 제어가 쉽기 때문입니다. 
                  
              ** 변수의 초기값 설정
                1. static초기화 
                static{ 내용 } 
                - class 가 메모리에 load될때 가장 처음 수행할 코드를 작성할 수 있는 블록 
                - static변수를 사용하는 것은 가능하지만 instance변수를 사용하는 것은 안됩니다. 
                   instance는 객체가 만들어 질때 생성되기 때문입니다. 
               - 여러 번 작성이 가능  
               
              		
 		 */
		
	
}