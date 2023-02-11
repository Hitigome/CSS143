public class PermanentHire extends SalariedWorker{
    private int bonus;

    PermanentHire(String name, int social){

    }

    PermanentHire(String name, int social, double monthlyPay){

    }

    @Override
    public double calculateWeeklyPay(){
        return super.calculateWeeklyPay() + bonus;
    }
}
