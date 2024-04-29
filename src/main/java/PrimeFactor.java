import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public void test(){

    }

    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();

        for (int divieder = 2; number > 1; divieder++) {
            while (number % divieder == 0) {
                factors.add(divieder);
                number = number / divieder;
            }
        }
        return factors;
    }
}
