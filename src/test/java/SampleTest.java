import com.example.Feline;
import com.example.Lion;

public class SampleTest {
    public static void main(String[] args) throws Exception {
        Lion lev = new Lion("Самец", new Feline());
        System.out.println(lev.doesHaveMane());
        System.out.println(lev.getFood());
        System.out.println(lev.getKittens());
        System.out.println(lev.getKittens());
        System.out.println(lev.getKittens());
    }
}