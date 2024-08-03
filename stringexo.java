public class stringexo {
    double width;
    double height;
    double depth;
    stringexo(double w, double h , double d){
        width = w;
        height = h ;
        depth = d;

    }
    public stringexo() {
    
    }
    public String toString(){
        return "Dimensions are "+ width + "by"+ depth + "by"+ height + ".";
    }
    class stringexo{
        public static void main(String args[]){
            stringexo mybox1 = new stringexo(10, 20, 15);
            stringexo mybox2 = new stringexo(3, 6, 9);
            stringexo mybox3 = new stringexo();
            double vol;
            System.out.println("Volume of mybox1 is " + mybox1.volume());
            System.out.println("Volume of mybox2 is " + mybox2.volume());
            System.out.println("Volume of mybox3 is " + mybox3.volume()) ;

    }
    

    }
    public String volume() {
        
        throw new UnsupportedOperationException("Unimplemented method 'volume'");
    }
 
    
   
}
