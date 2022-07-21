package classpart;

public class main2 {
    public static void main(String[] args) {
        Transport bus1 = new Bus2(113);
        Bus2 bus2 = new Bus2(154);

        bus1.printStatus();
        bus2.printStatus();
        bus2.engineStart();
        bus2.addPassenger(2);
        bus2.fule1(50);
        bus2.goingGrarage();
        bus2.charingPule(10);
        bus2.addPassenger(45);
        bus2.addPassenger(5);
        bus2.fule1(55);
        bus2.goingGrarage();


        System.out.println("====================");

        Taxi texi1 = new Taxi(4885);
        Taxi texi2 = new Taxi(5854);


        texi1.printStatus();
        texi2.printStatus();

        System.out.println("===========================");
        texi1.addPassenger(2, "서울역", 2);
        texi1.getStatus();
        texi1.usingFule(80);
        texi1.getPay();
        texi1.addPassenger(5, "", 0);
        texi1.addPassenger(3, "구로디지털단지역", 12);
        texi1.usingFule(20);
        texi1.getPay();
    }


}
