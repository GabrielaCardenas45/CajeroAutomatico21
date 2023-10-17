import javax.swing.*;

class CageroAutomatico2 {
    public static void main(String[] args) {
        int opcion = 0;
        float saldo = 1000;
        float ingreso, retiro;
        while (opcion != 3) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero Andromeda\n"
                    + "1 abonar dinero a la cuennta\n"
                    + "2 retirar dinero de la cuenta\n"
                    + "3 gracias por utilizar nuestros servicios"));
            switch (opcion) {
                case 1:
                    ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que desea ingresar a la cuenta"));
                    saldo = (saldo + ingreso);
                    JOptionPane.showMessageDialog(null, "dinero en cuenta: " + saldo);
                    break;

                case 2:
                    retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar"));

                    if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "no cuenta con el saldo suficiente realizar la transaccion");
                    } else {

                        saldo = (saldo - retiro);
                        JOptionPane.showMessageDialog(null, "dinero en cuenta:" + saldo);
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu");
                    break;

            }
        }
    }
}