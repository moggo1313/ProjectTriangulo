package principal;
import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    
    public static void main(String[] args) {
        Triangulo tril = new Triangulo();
        
        
        //Entrada
        tril.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base: ")));
        tril.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a altura: ")));
        
        
        //Saída
        JOptionPane.showMessageDialog(null, "A área do triangulo é " + tril.getArea());
    }
    
}
