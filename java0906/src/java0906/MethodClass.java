package java0906;

public class MethodClass {

	public int temp = 20; 
	
	public void thismethod() {
		int temp = 30;
		System.out.printf("temp:%d\n", temp);//30이 출력됩니다. 
		//변수는 가까이에서  만든것을 찾아서 사용합니다. 
		//메소드안에서 찾지말고 메소드 외부에서 찾도록 하려면 변수명 앞에 this.을 추가 
		System.out.printf("temp:%d\n", this.temp);//20이 출력됩니다. 
	}
	
	
	
	//재귀를 사용하지 않고 피보나치 수열의 값을 리턴하는 메소드   
 public int fibo(int n) { 
     //두번째 이전의 항의 값을 저장할 변수 
 	int n1 = 1; 
 	//첫번째 이전의 항의 값을 저장할 변수 
     int n2 =1; 
     //피보나치수열의 값을 저장할 변수 
     int result =1; 
     //3번째부터 n번재 까지는 n1과 n2값을 변경하면서 더해 줍니다. 
     for(int i=3; i<=n; i++){
         // 이전 2개의 항의 값을 더하기 
     	result = n1 + n2; 
         n1 =n2; 
         n2 = result; 
     }
     return result;	                     
 }
 
 //재귀를 이용한 피보나치 수열 메소드 
  public int fibo2(int n) {
      //첫번째 이거나 두번째이면 1
 	 //그 이외의 경우는 이전 2개 항의 합 
 	 if(n==1 || n==2) {
          return 1; 
      } else {
          return fibo2(n-1) + fibo2(n-2); 
     }
 }
	
	
	//Method Overloading 
	//동일한 이름의 메소드가 매개변수의 자료형과 개수를 다르게 해서 2개이상 
	// 존재하는 경우 
	
	public void add(int n1, int n2) {
		System.out.printf("n1+n2: %d\n", n1+n2);
	}
	
	public void add(double n1, double n2) {
		System.out.printf("n1+n2: %.2f\n", n1+n2);
	}
	
	//정수 매개변수를 개수에 상관없이 대입할 수 있는 메소드 
	public void sum(int ... arr) {
		//...다음에 나온 변수는 배열로 간주 
		// arr배열의 데이터 합계 
		int s = 0; 
		for(int temp : arr) {
			s += temp; 
		}
		System.out.printf("합계:%d\n",s);
		
	}
	 //정수 2개를 더해서 결과를 리턴 하는 메소드
	//return이 있으면 메소드의 수행결과를 사용할 수 있습니다. 
	public int returnadd(int n1, int n2) {  // void대신 결과값을 나타내는 자료형을 메소드명 앞에 쓴다. 
		return n1 + n2;
	}
	

   
	
	
	
}
