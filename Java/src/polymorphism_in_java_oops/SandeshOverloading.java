package polymorphism_in_java_oops;

public class SandeshOverloading {
    public void send_email( String to,String subject ,String message ,String filepath){
        System.out.println("Email Sending with attatchment");
    }
    public void send_email ( String to,String subject ,String message ){
        System.out.println("Email Sending");
    }

    public static void main(String[] args) {
        SandeshOverloading s =new SandeshOverloading();
        s.send_email("sandeshyadav@gmail.com","welcome","some message","G:// image.png");
        s.send_email("sandeshyadav@gmail.com","welcome","some message");
    }
}
