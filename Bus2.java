package classpart;
public class Bus2 extends Transport {

    int pay=1000;


    public Bus2(int number) {
        super(number, 100,0,0,30,true );

    }
    @Override
    public void printStatus() {
        System.out.println("버스번호 : "+number);
    }

    @Override
    public void addPassenger(int passenger, String goal, int km) {

    }

    @Override
    public void engineStart() {
        status=true;
        System.out.println(number+"번 버스의 시동이 켜집니다.");

    }


    @Override
    public void addPassenger(int passenger) {
        if (maxPassenger-passenger > 0){
            maxPassenger -=passenger;
            System.out.println("탑승 승객 수: "+passenger);
            System.out.println("잔여 승객 수 :"+maxPassenger);
            System.out.println("요금 확인 :"+pay*passenger);


        }else{
            System.out.println("최대 승객수 초과");
        }
    }

    @Override
    public void addPassenger2(int passenger) {

    }

    public void fule1(int oil){
        if (fuel > 10) {
            fuel -= oil;
            System.out.println("주행 후 주유량 : " + fuel);

        }else {
            goingGrarage();
        }
    }
    public void goingGrarage(){
        maxPassenger = 30;
        changeStatus();
        System.out.println("상태 = 차고지행");
        if(fuel < 10){
            System.out.println("주유 필요");
        }

    }
    public void charingPule(int oil){
        fuel +=oil;
        System.out.println("주유량 :"+fuel);
    }

}
