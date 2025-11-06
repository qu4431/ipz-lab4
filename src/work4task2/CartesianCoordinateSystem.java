package work4task2;

import java.util.function.Function;
/**
 * Клас, що виконує роль конктерного контексту у шаблоні Strategy.
 * Конкретні стратегії реалізують різні варіації алгоритму.(Декартова система координат)
 */
public class CartesianCoordinateSystem implements CoordinateSystem {//заглушка
    /**
     * Алгоритм малювання графіку функції
     */
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {
        System.out.println("Cartesian coordinate system");
        for(double i=start;i<=end; i+=end/10){
            double x=i;
            //double y=function.apply(x);
            if(i%Math.PI!=0){
                System.out.println("x: "+x+" y: "+function.apply(x));
            }
            else{
                System.out.println("x: "+x+" y: 0.0");
            }
        }
    }
}
