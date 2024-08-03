// // class A {

// //     int i, j;
    
// //     A(int a, int b) {
    
// //     i = a;
    
// //     j = b;
    
// //     }
    
// //     // display i and j
    
// //     void show() {
    
// //     System.out.println("i and j: " + i + " " + j);
    
// //     }
    
// //     }
    
// // class B extends A {
    
// //     int k;
    
// //     B(int a, int b, int c) {
    
// //     super(a, b);
    
// //     k = c;
    
// //     }
    
// //     // display k – this overrides show() in A
    
// //     void show() {
    
// //     System.out.println("k: " + k);
    
// //     }
    
// //     }
// //     class poly{
// //         public static void main(String[] args) {
// //             B subOB = new B(1, 2, 3);
// //             subOB.show();
// //         }
// //     }
// //Creating a parent class.

// class Bank{

//     int getRateOfInterest(){return 0;}
    
//     }
    
//     //Creating child classes.
    
//     class SBI extends Bank
    
//     { int getRateOfInterest(){return 8;} }
    
//     class ICICI extends Bank
    
//     { int getRateOfInterest(){return 7;} }
    
//     class AXIS extends Bank
    
//     { int getRateOfInterest(){return 9;} }
    
//     //Test class to create objects and call the methods
    
//     class Test2
    
//     {
    
//     public static void main(String args[]){
    
//     SBI s=new SBI();
    
//     ICICI i=new ICICI();
    
//     AXIS a=new AXIS();
    
//     System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
    
//     System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
    
//     System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
//     }
// }
class Figure {

    double dim1 ;
    double dim2 ;
    Figure(double a , double b){
        dim1 = a;
        dim2 = b ;
    }
    double area(){
        System.out.println("area for figure is undefined.");
        return 0 ;

    }
}
class Rectangle extends Figure {
    Rectangle(double a , double b){
        super(a,b);
    }
    double area(){
    System.out.println("Inside area for rectangle .");
    return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area for triangle.");
        return dim1*dim2/2;
        }
}
class FindAreas {

    public static void main(String args[]) {
    
    Figure f = new Figure(10, 10); //super class object
    
    Rectangle r = new Rectangle(9, 5);
    
    Triangle t = new Triangle(10, 8);
    
    Figure figref;
    
    figref = r;
    
    System.out.println("Area is " + figref.area());
    
    figref = t;
    
    System.out.println("Area is " + figref.area());
    
    figref = f;
    
    System.out.println("Area is " + figref.area());
    
    }
    
    }