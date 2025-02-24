package dao;

public class IDaoImpl implements IDao {
    public double getData() {
        System.out.println("Version Base de données.");
        double x = 5;
        return x;
    }

}
