package Day11HW;
import java.util.regex.*;
class Regex2 {
 public static void main(String[] args) {
 Pattern p = Pattern.compile( "\\d*" );
 Matcher m = p.matcher("abc34fg");
 boolean b = false;
 while(b = m.find()) {
 System.out.print(m.start() + m.group());
 }
 }
}