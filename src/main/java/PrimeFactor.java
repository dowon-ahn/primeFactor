import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public void test(){

    }

    public List<Integer> of(int i) {
        List<Integer> factors = new ArrayList<>();
        if (i == 2) {
            factors.add(2);
        } else if (i == 3) {
            factors.add(3);
        }
        return factors;
    }
}
