package work4task2;

import java.util.function.Function;
/**
 * Клас, що виконує роль конктерного контексту у шаблоні Strategy.
 * Конкретні стратегії реалізують різні варіації алгоритму.(Полярна система координат)
 */
public class PolarCoordinateSystem implements CoordinateSystem {
    /**
     * Алгоритм малювання графіку функції
     */
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {//заглушка
        System.out.println("Polar coordinate system");
        //double r=end-start;
        for(double i=start;i<=end;i+=end/10) {
            double x=i;
            double y=function.apply(x*Math.toRadians(1));
            if(i%180!=0){
                System.out.println("x: "+x+" y: "+y);// y already in degrees
            }
            else{
                System.out.println("x: "+x+" y: 0.0");
            }
        }
    }
}
