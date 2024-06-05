import java.util.Scanner;

public class Espacial extends Geometria{
    double R;
    double g;
    double k;
    double l;
    double afp;
    double abp;
    double abmp;

    Scanner scanner = new Scanner(System.in);

    public double areaBase(){
        return super.PI * Math.pow(super.r,2);
    }
    public double areaBasePiramide(){
            System.out.println("Qual a área da base da sua pirâmide?");
            double abp = scanner.nextDouble();
            return abp;
    }
    public double areaBaseMenorPiramide(){
        System.out.println("Qual a área da base menor da sua pirâmide?");
        double abmp = scanner.nextDouble();
        return abmp;
    }
    public double volumeCilindro(){
        return ((super.PI * Math.pow(super.r, 2)) * super.h);
    }
    public double volumeCone(){
        return (((super.PI * Math.pow(super.r, 2)) * super.h) / 3);
    }
    public double areaLateralPiramide(){
        System.out.println("Quantos lados tem a sua pirâmide?");
        this.l = scanner.nextDouble();
        System.out.println("Informe a área da face da sua pirâmide:");
        this.afp = scanner.nextDouble();
        return this.afp * this.l;
    }
    public double areaLateralCilindro(){
        return (2 * super.PI) * super.r * super.h;
    }
    public double areaLateralCone(){
        return super.PI * super.r * this.g;
    }
    public double volumeTroncoCone(){
        return ((super.PI * super.h)*(Math.pow(super.r, 2) + super.r * this.R + Math.pow(this.R, 2))) / 3;
    }
    public double areaTotalPiramide(){
        return this.areaLateralPiramide() + this.abp; 
    }
    public double volumePiramide(){
        return (this.abp * super.h) / 3;
    }
    public double volumeTroncoPiramide(){
        return (super.h / 3) * this.abp + Math.sqrt(this.abp * this.abmp + this.abmp);
    }
    public double areaEsfera(){
        return ((4 * super.PI) * Math.pow(super.r,( 2)));
   }
   public double volumeEsfera(){
        return ((4 / 3) * super.PI * Math.pow(super.r,( 3)));
   }  
 
}