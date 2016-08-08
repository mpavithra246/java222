import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;


public class Holiday {
    public static void main(String[] args){
        Scanner s=new Scanner(in);
        out.print("Enter a day : ");
        String day=s.next();
        switch(day.toLowerCase()){
            case "sunday":out.println("WorkingDay("+day+") : "+false);break;
            default:out.println("WorkingDay("+day+") : "+true);
        }
    }
}