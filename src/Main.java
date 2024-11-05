import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String ruta = "D:\\Fundamentos\\";
        String archivo = "test.txt";
        ArrayList<Integer> valores = new ArrayList<>();


        try (FileReader fr = new FileReader(ruta + archivo)) {

            BufferedReader br = new BufferedReader(fr);
            String linea;
            int valor;

            while ((linea = br.readLine()) != null) {

                try {
                    valor = Integer.parseInt(linea);
                    valores.add(valor);

                    System.out.println(valor);

                } catch (NumberFormatException e) {
                    System.out.println(e);
                }


            }

        } catch (Exception e) {
            System.out.println(e);
        }

        int tamano = valores.size();
        int sumatoria = 0;
        int promedio = 0;

        System.out.println("El tamaño es: "  + tamano);


        for (int sum : valores) {

            sumatoria += sum;
            promedio = sumatoria / tamano;

        }

        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);

        int max = valores.get(0);
        int min = valores.get(0);

        for (int i = 1; i < valores.size(); i++) {
            if (valores.get(i) > max) {
                max = valores.get(i);


            }

            if (valores.get(i) < min) {
                min = valores.get(i);

            }

        }

        System.out.println("El Valor Mayor es: " + max);
        System.out.println("El Valor Menor es: " + min);

    }

}



