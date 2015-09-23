public class Triangle { 
    public static void main(String[] args){

    double x1 = 1, x2 = 3,x3 = 5, y1 = 1, y2 = 4, y3 = 3;
    double a = 0, b = 0,c = 0, ai,bi,ci;
    System.out.println();
    a=Math.sqrt(((Math.pow((x3-x2),2))+(Math.pow((y3-y2),2))));
        System.out.printf("a = %4.4f\n", a);
    
    b=Math.sqrt(((Math.pow((x1-x3),2))+(Math.pow((y1-y3),2))));
        System.out.printf("b = %4.4f\n", b);
    
    c=Math.sqrt(((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2))));
         System.out.printf("c = %4.4f\n\n", c);

    
    System.out.println("A : B : C \n");
    

    ai=Math.acos((a*a-b*b-c*c)/(-2*b*c));
         System.out.printf("A = %4.4f\n", ai);
    

    bi=Math.acos((b*b-a*a-c*c)/(-2*a*c));
         System.out.printf("B = %4.4f\n", bi);
        

    ci=Math.acos((c*c-b*b-a*a)/(-2*a*b));
         System.out.printf("C = %4.4f\n\n", ci);
    System.out.printf("THx :) ");

        }
    }
