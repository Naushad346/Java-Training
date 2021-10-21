
interface Ticket{
    void book(String bookerName, double price, String dateOfFlight);
    
    void cancel();
}
class RegularTicket implements Ticket{
      static double totalPrice = 0;
      static int count=0;
      double  temp = 0;
      public void book(String bookerName, double price, String dateOfFlight){
          temp = price;
          totalPrice += price;
          
      }
      public void cancel(){
         totalPrice -= temp;  
         }
         
      
}
class TatkalTicket implements Ticket{
    static double totalPrice = 0;
    double temp = 0;
    public void book(String bookerName, double price, String dateOfFlight){
        temp = price;
        totalPrice += price+200;
        
    }
    public void cancel(){
        totalPrice -= temp; 
        
    }
    
      
    
}
public class Main {
    public static void main(String[] args) {
        RegularTicket rt1 = new RegularTicket();
        rt1.book("naushad", 200, "10/10/21");
        RegularTicket rt2 = new RegularTicket();
        rt2.book("Mangal", 400, "10/10/21");
        RegularTicket rt3 = new RegularTicket();
        rt3.book("Naiyar", 600, "10/10/21");
        TatkalTicket tt1 = new TatkalTicket();
        tt1.book("Ram",500,"20/11/2021");
        TatkalTicket tt2 = new TatkalTicket();
        tt2.book("Mohan",450,"20/11/2021");
        rt1.cancel();
        tt2.cancel();
        
        double total = RegularTicket.totalPrice+TatkalTicket.totalPrice;
        System.out.println("total amount collected : "+total);
         
        
    }
}
