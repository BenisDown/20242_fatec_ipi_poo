import javax.swing.JOptionPane;
public class SomarDoisNumerosV2{
    public static void main(String args []){
        double a, b, resultado;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        resultado = a + b;
        JOptionPane.showMessageDialog(
            null, 
            String.format("%f + %f = %f", a, b, resultado)
        );
    }
}