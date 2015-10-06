import java.util.*;

public class Test
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in, "UTF-8");
      String line = in.nextLine();
      if (line.startsWith(args[0]))
         System.out.println("match");
      else
         //System.out.println("no match");
         System.out.printf("no match: %x\n" , Integer.valueOf(line.charAt(0)));
   }
}