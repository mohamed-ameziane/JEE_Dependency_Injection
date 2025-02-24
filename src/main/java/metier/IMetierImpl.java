package metier;

import dao.IDao;
import dao.IDaoImpl;

public class IMetierImpl implements IMetier {
    IDao iDao = null; //Couplage faible = dependence d'une interface

    public IMetierImpl() {
    }

    public IMetierImpl(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        double x = iDao.getData();
        double y = x * 10;
        return y;
    }

    // Afin d'affecter a la var "iDao" un objet d'une classe implementant l'interface IDao
    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }
}
