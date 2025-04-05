import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
public class PingTool {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("Enter host to ping: ");
String host = sc.nextLine();
Instant start = Instant.now();
InetAddress address = InetAddress.getByName(host);
boolean reachable = address.isReachable(5000);
Duration time = Duration.between(start, Instant.now());
System.out.println(reachable ? "Host is reachable" : "Host not reachable");
System.out.println("Response time: " + time.toMillis() + "ms");
sc.close();
}
}