 class Area{
    void calc(int r){
        double a;
        a=3.14*r*r;
        System.out.println("\nArea of circle : "+a);
    }
    void calc(int l,int b){
        double a;
        a=l*b;
        System.out.println("\nArea of rectangle : "+a);
    }
    void calc(double b,double h){
        double a;
        a=0.5*b*h;
        System.out.println("\nArea of triangle : "+a);
    }
}
class size {
    public static void main(String args[]){
        Area a=new Area();
        a.calc(5);
        a.calc(8,9);
        a.calc(6.0,7.2);
    }
}