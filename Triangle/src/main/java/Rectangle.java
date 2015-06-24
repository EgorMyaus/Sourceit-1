/**
 * Created by bagirov on 23.06.2015.
 */
public class Rectangle implements Triangle {

    public boolean isTriangle(double a, double b, double c) {
        if (a<(b+c) && b<(a+c) && c<(a+b)) {
            return true;
        } else
            return false;
    }
}
