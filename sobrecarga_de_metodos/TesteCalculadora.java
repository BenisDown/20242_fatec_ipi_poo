public class TesteCalculadora {
    public static void main(String[] args) {
        var calc = new Calculadora();
        System.out.println(calc.somar(5, 4));
        System.out.println(calc.somar(6.9, 4.2));
        System.out.println(calc.somar("5", "9"));
        System.out.println(calc.somar(6, 9, 4));
        System.out.println(calc.somar(8, "5"));
        System.out.println(calc.somar("3", 4));
    }
}
