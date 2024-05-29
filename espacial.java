public class espacial extends geometria{
    double R;
    double g;
    double k;

    public double areaBase(){
        return super.PI * Math.pow(super.r, 2)
    }
    public double volumeCilindro(){
        return (super.PI * Math.pow(super.r, 2)) * super.h
    }
    public double volumeCone(){
        return ((super.PI * Math.pow(super.r, 2)) * super.h) / 3
    }
    public double areaLateralPiramide(){
        
    }
    public double areaLateralCilindro(){
        return (2 * super.PI) * super.r * super.h
    }
    public double areaLateralCone(){
        return super.PI * super.r * this.g
    }
    public double volumeTronco(){
        return (super.PI * super.h * ())
    }
    public double areaTotalPiramide(){

    }
    public double volumePiramide(){

    }
    public double volumeTronco(){

    }  
    public double areaEsfera(){
    
   }
   public double volumeEsfera(){

   }  
}