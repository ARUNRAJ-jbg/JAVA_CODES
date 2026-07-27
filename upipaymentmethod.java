abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    abstract void pay();
    void receipt(){
        System.out.println("receipt genrated");
        System.out.println("amont paid:$"+amount);
    }
    void showpaymentstatus(){
        System.out.println("payment sucessfully");
    }
}
class upipayment extends payment{
    private String upiId;
    upipayment(double amount,String upiId){
        super(amount);
        this.upiId=upiId;
    }
    @Override
    void pay(){
        System.out.println("processing UIP payment........");
        System.out.println("UPI ID:"+upiId);
    }
}
class cardpayment extends payment{
    private String cardNumber;
    cardpayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber=cardNumber;
    }
    @Override
    void pay(){
        System.out.println("processing cardpayment......");
        System.out.println("cardNumber:**** ***"+cardNumber.substring(cardNumber.length()-4));
    }
}
public class Main{
 public static void main(String[]args){
     payment p1=new upipayment(559,"aruraj@");
     payment p2=new upipayment(837,"saran@");
     p1.pay();
     p1.receipt();
     p1.showpaymentstatus();
     System.out.println();
     p2.pay();
     p2.receipt();
     p2.showpaymentstatus();
 }
}
