public class Calculadora {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadorinha");
    }
    
        /**
         * Este método é utilizado para somar dois numeros inteiros
         * @param numeroUm este é o primeiro parametro do método
         * @param numeroDois este é o segundo parametro do método
         * @return int o resultado deste método é a soma dos dois numeros
         */
        public int somar(int numeroUm, int numeroDois) {
            return numeroUm + numeroDois;
        }
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variaveis
 * mas, ele tem a finalidade somar ou multiplicar
 * dois numeros
 */
        public int somaMultiplica (int n, int x, String m) {

            int r =0; 
            if (m == "M"){ 
                r= n * x;
            }
            else {
                r = n + x;
            }
            return r;
        }
    }
