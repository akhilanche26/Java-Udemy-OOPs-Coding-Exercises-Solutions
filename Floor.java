public class Floor {
    private  double width;
    private double length;

    public Floor(double lenght, double width){
        if(width<0){
            width=0;
        }else{
            this.width = width;
        }
        if(lenght<0){
            lenght=0;
        }else{
            this.length = lenght;
        }
    }

    public double getArea(){
        return (width* length);
    }
}
