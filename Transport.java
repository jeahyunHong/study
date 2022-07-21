package classpart;//### 상위 클래스 = 대중교통

//1. **Bus** - 2대 생성
//		2. **출력 Bus**
//		1. 각 Bus 번호 다른지 확인
//
//
//		**※ Bus 1대로 진행**
//
//		1. **Bus**
//		1.  승객 +2
//		2. **출력 Bus**
//		1. 탑승 승객 수 = 2
//		2. 잔여 승객 수 = 28
//		3. 요금 확인 = 2000
//		3. **Bus**
//		1. 주유량 -50
//		4. **출력 Bus**
//		1. 주유량 = 50
//		5. **Bus - 상태 변경**
//		1. 차고지행
//		6. **Bus**
//		1. 주유량 +10
//		7. **출력 Bus**
//		1. 상태 = 차고지행
//		2. 주유량 = 60
//		8. **Bus -** **상태 변경**
//		1. 운행중
//		9. **Bus**
//		1. 승객 +45
//		10. **알럿** ‘최대 승객 수 초과’
//		11. **Bus**
//		1. 승객 +5
//		12. **출력 Bus**
//		1. 탑승 승객 수 = 5
//		2. 잔여 승객 수 = 25
//		3. 요금 = 5000
//		13. **Bus**
//		1. 주유량 -55
//		14. **출력 Bus**
//		1. 주유량 = 5
//		2. 상태 = 차고지행
//		15. **알럿** ‘주유 필요’



public abstract class Transport {
 ///객체
 	int number;
	int fuel = 100;
	int speed;
	int changeSpeed;
	int maxPassenger;
	boolean status;
	public Transport(int number, int fuel, int speed, int changeSpeed, int maxPassenger, boolean status) {
		this.number = number;
		this.fuel = fuel;
		this.speed = speed;
		this.changeSpeed = changeSpeed;
		this.maxPassenger = maxPassenger;
		this.status = status;
	}







///생성자
//


	///메소드
	public void engineStart(){
		if (status){
			status = false;
		}else {status=true;}
	}
	public void changeSpeed(){
	}
	public void changeStatus(){
		if(status){
			status = false;
		}else status =true;
	}
	public void addPassenger(int passenger){
	}
	public void addPassenger2(int passenger) {
	}
	public void printStatus() {
	}

	public abstract void addPassenger(int passenger, String goal, int km);
}
