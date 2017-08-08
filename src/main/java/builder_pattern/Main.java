package builder_pattern;

/**
 * Created by RENT on 2017-08-08.
 */
public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail.Builder().setCoded(true).setContent("HEJ ASIA").setIpAddress("12345").setPost("gmail").setProtocol("HTTPS").create();
    }
}
