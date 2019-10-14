
package project;

public class Project {

    
    public static void main(String[] args) {
        Div hello= new Div();
    hello.initialize();
    hello.setReminderQuotient();
     hello.getQuotient();
     hello.getReminder();
        System.err.print("reminder"+hello.getReminder() +"quotient"+ hello.getQuotient());
    }
    
}
