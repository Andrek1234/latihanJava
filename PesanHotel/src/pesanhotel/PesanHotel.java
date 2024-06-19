/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesanhotel;

/**
 *
 * @author ACER
 */
public class PesanHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Home.sdhdipesan101 = false;
//        Home.sdhdipesan102 = false;
//        Home.sdhdipesan103 = false;
//        Home.sdhdipesan201 = false;
//        Home.sdhdipesan202 = false;
//        Home.sdhdipesan203 = false;
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
    
}
