package extension;

import dao.IDao;

public class IDaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double x = 10;
        return x;
    }
}
