public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }



    public int resta() {
        int num = num1 - num2;
        return num;
    }

    public int suma() {
        int num = num1 + num2;
        return num; 
    }

    public int multiplicar() {
        int num = num1 * num2;

        return num;
    }

    public int dividir() {
        int num = num1 / num2;

        return num;
    }

    


        
}