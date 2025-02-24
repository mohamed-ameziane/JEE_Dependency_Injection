package presentation;

import dao.IDao;
import dao.IDaoImpl;
import extension.IDaoImplv2;
import metier.IMetierImpl;

public class MainV1 {
    public static void main(String[] args) {
        // Injection des dependance par instantiation statique

        IDao iDao = new IDaoImplv2();
        IMetierImpl metier = new IMetierImpl(iDao);//Injection via Constructeur
//        metier.setiDao(iDao); //Injection via Setter
        System.out.println(metier.calcul());
    }
}
