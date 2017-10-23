package calcdistancia;
public class Calc {
    public double calcularDistancia(double Xorigem, double Yorigem, double Xdestino, double Ydestinho){
        
        double x1 = Xorigem;
        double x2 = Xdestino;
        
        double y1 = Yorigem;
        double y2 = Ydestinho;
        
        // agora, calcularemos o arco
            // arco =  é a porção compreendida entre dois pontos de uma curva. 
        
        // arco AC = ac
        double ac = 90 - y1;
        
        // arco AB = ab
        double ab = 90 - y2;
        
        // arco ABC = abc
        double abc = x2 - x1;
        
        // Formula: cos(abc) = cos(ac) * cos(ab) + sen(ac)* sen(c) * cos(abc) 
        double cossenoDeABC = Math.cos(ac) * Math.cos(ab) + Math.sin(ab) + Math.sin(ac) * Math.cos(abc);
        
        // arco Cosseno é o inverso de cosseno
        double arcoCosseno = Math.acos(cossenoDeABC);
        
        // 2 * pi * Raio da Terra = 6,28 * 6.371 = 40.030 Km 
	// 360 graus = 40.030 Km 
	// 3,2169287 = x (esse x será nosso arcoCosseno)
	// x = (40.030 * 3,2169287)/360 = 357,68 Km 
        
//        System.out.println(arcoCosseno);
        
        double distancia = (40030 * arcoCosseno) / 360;
        
        return Math.round(distancia);
    }
}
