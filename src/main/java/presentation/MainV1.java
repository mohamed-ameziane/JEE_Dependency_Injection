package presentation;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetierImpl;

public class MainV1 {
    public static void main(String[] args) {
        // Injection des dependance par instantiation statique

        IDao iDao = new IDaoImpl();
        IMetierImpl metier = new IMetierImpl();
        metier.setiDao(iDao); //Injection via Setter
        System.out.println(metier.calcul());
    }
}
