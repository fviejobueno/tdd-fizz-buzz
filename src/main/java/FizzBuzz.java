import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<Integer> run(Integer n){
        List<Integer> resultado = new ArrayList<>();

        for (int i =1; i<=n; i++){
            resultado.add(i);
        }

        return resultado;
    }
}
