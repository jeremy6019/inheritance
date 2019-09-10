package define;

public class SangsokDefine {

	/* 
	     ** package import 
		         1. Package 
			         - 관련있는 클래스들을 모아놓은 클래스들의 모임 
			         - 프로그램을 만들어서 배포를 할때 package형태로 묶어서 배포합니다.
			         -클래스 이름은 패키지이름.클래스이름 입니다. 
			          어떤 클래스를 사용하려면 패키지이름.클래스이름으로 사용해야 합니다,
			          이렇게 사용하는 것은 너무 번거로운 일입니다. 
			          클래스 이름에서 패키지 이름을 생략하고 사용할 수 있도록 해주는 키워드가 import 입니다. 
			          java에서는  import는 가져오는 개념이 아니고 줄여쓰기 개념 
			          java에서는 import를 사용하지 않아도 클래스를 사용할 수 있습니다. 
			          java는 실행에 필요한 모든 클래스를 jvm과 자신의 디엑토리에 만들어 두고 실행하는데 
			          이와 유사한 방식이.Net Framework 입니다. 
			          .Net으로 만든 프로그램은 .Net Framework가 설치되어 있지 않으면 실행되지 않습니다. 
		           
		         2. import
		          
		         1) 패키지 전체를 import 
		            import 패키지 이름.*; 
		             - 패키지 안에 있는 모든 클래스를 패키지이름을 생략하고 호출할 수 있습니다.  
		             
		         2) 특정 클래스 import 
			         import 패키지이름.클래스 이름 
			         - 클래스 이름에 해당하는 클래스를  패키지 이름을 생략하고 호출할 수 있습니다. 
			     
			     3) 클래스이름만 작성하고 import 
			        - 직접 import 구문을 작성 
			        - 단축키를 이용해서 import: ctrl (command, 시작버튼)+ shift+ m(m이 아니면 o)
			        - 클래스 이름 위에서 import 명령을 클릭 
			        - 환경설정에서 auto import옵션을 설정 
				       Windows - [Windows] - [Preference]
			           mac - [Eclipse]-[환경설정] 
			           메뉴를 실행하고 [java] - [code style] - [organize import] 에서 숫자가 99로 되어있으면 
			           클래스 단위로 import가 되고 1로 수정하면 패키지 단위로 import 됩니다. 
			             
			           [java] - [Editor] - [Save Actions]  - [organize import] 에서 perform the selected action on save를 
			           체크하고 적용을 누르면 자동 import해줍니다. 
		             
		         3. 클래스를 만들때 주의할 사항 
	               -  클래스 이름만 사용했을때 클래스를 찾는 순서는 현재 작업중인 패키지에서 먼저 찾고 프로젝트내의 다른
		               패키지에서 찾고 그 다음에  java가 제공하는 패키지에서 찾고 마지막으로 외부에서 만들어 준 패키지에서 찾습니다.
		               다른 패키지에 있는 클래스 이름과 동일한 이름의 클래스 이름을 만들면 자신의 클래스가 우선권을 갖습니다. 
		               이런 경우네는 패키지이름을 전부 적어주어야 합니다. 
		               java.sql.Date와 java.util.Date가 있는데 이 클래스들을 사용할 때 주의해야 합니다. 
		             
		           - java가 제공하는 클래스 이름은 첫글자가 무조건 대문자 
		             우리가 만드는 클래스 이름도 대문자로 시작하는 것이 좋다 
		             변수나 메소드 이름은 소문자로 시작 
		             final은 모두 대문자로 시작합니다. 
		             두개 이상의 단어로 구성되는 경우는 두번째 단어의 첫글자는 반드시 대문자입니다. 
		             이러한 표기법을 Camel 표기법이라고 합니다. 
		                
                     java는 이러한 표기법이 다른 언어보다 중요합니다. 
                     java는 크고 복잡한 시스템을 개발할 때 사용하기 때문니다.
               
              
                   
		             
		                 
	 
	 */
	
	
	
	
	
	
}
