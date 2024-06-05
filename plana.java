import java.lang.Math;

public class Plana extends Geometria{
   double a;
   double b;
   double c;
   double D;
   double d;
   double l;
   double B;

   public double perimetroQuadradoLosango(){
        return 4 * this.a;
   }
   public double perimetroParalelogramoRetangulo(){
        return (2 * this.a) + (2 * this.b);
   }
   public double perimetroTriangulo(){
        return this.a + this.b + this.c;
   }
   public double perimetroTrianguloEqui(){
        return 3 * this.l;
   }
   public double perimetroTrapezio(){
        return this.c + this.b + this.d + this.B;
   }
   public double areaQuadrado(){
        return Math.pow(this.a, 2);
   }
   public double areaRetangulo(){
        return Math.pow(this.a, 2);
   }
   public double areaTriangulo(){
        return (this.a * this.h) / 2;
   }
   public double areaTrianguloEqui(){
        return (Math.pow(this.l, 2) * Math.sqrt(3)) / 4;
   }
   public double areaParalelogramo(){
        return this.a * this.h;
   }
   public double areaLosango(){
        return (this.D * this.d) / 2;
   }
   public double areaTrapezio(){
        return ((this.B + this.b) * h) / 2;
   }
   public double areaCirculo(){
        return super.PI * Math.pow(super.r, 2);
   }
   public double comprimentoCirculo(){
        return (2 * super.PI) * super.r;
   }
}