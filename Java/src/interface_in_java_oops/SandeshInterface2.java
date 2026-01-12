package interface_in_java_oops;

public class SandeshInterface2 implements SandeshInterface1 {

    @Override
    public void email_service() {
        System.out.println("Email Sending");
    }

    @Override
    public void sms_service() {
        System.out.println("SMS Sending");
    }

    @Override
    public void whatsapp_service() {
        System.out.println("Whatsapp Sending");
    }

    public static void main(String[] args) {
        SandeshInterface2 impl= new SandeshInterface2();
        impl.email_service();
        impl.sms_service();
        impl.whatsapp_service();
    }
}
