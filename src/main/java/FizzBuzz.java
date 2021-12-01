import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> run(Integer n){
        List<String> resultado = new ArrayList<>();

        for (int i =1; i<=n; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                resultado.add("FizzBuzz");
            }else if(i % 3 == 0){
                resultado.add("Fizz");
            }else if(i % 5 == 0) {
                resultado.add("Buzz");
            }else{
                resultado.add(String.valueOf(i));

            }
        }


        System.out.println(resultado);
        return resultado;
    }
}
