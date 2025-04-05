import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo {
public static void main(String[] args) {
List<String> names = Arrays.asList("Alice","Bob","Charlie","","David","");
List<String> filtered = names.stream()
.filter(s -> !s.isEmpty())
.map(String::toUpperCase)
.collect(Collectors.toList());
System.out.println("Original: " + names);
System.out.println("Filtered: " + filtered);
}
}