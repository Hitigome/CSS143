public class Consultant extends HourlyWorker{
    private double hourlyPay;
    private double minimum = 30.0;

    Consultant(String name, int social){
        super(name, social);
        hourlyPay = minimum;
    }

    Consultant(String name, int social, double pay){
        super(name, social);
        if(pay > 0.0){
            hourlyPay = pay;
        }
    }

    @Override
    public double calculateWeeklyPay(){
        return hourlyPay * 20;
    }
    
}
