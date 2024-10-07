package tmsl.shirsak;

abstract class NABH{
    final void lineOfTreatment(){
        System.out.println("This should be followed");
    }

    abstract void hospitalSetup();
    abstract void billing();
    abstract void admissionAndEmergency();
}

class CMRI extends NABH{
    @Override
    void hospitalSetup(){
        System.out.println("Hospital has been setup");
    }

    @Override
    void billing(){
        System.out.println("Billing done");
    }

    @Override
    void admissionAndEmergency(){
        System.out.println("Admitted");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        NABH sc = new CMRI();
        sc.lineOfTreatment();
        sc.hospitalSetup();
        sc.billing();
        sc.admissionAndEmergency();
    }
}
