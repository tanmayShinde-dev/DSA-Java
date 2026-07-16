public class HBpattern{

    public static void HollowBox(int totCol, int totRow){
         int i,j;
         for(i=1; i<=totCol; i++){
            for(j=1; j<=totRow; j++){
                if(i==1 || i==totCol || j==1 || j==totRow){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        
    }

    public static void IandR_half_pyramid(int n){

        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invHalfNumPyr(int n){
        int i;
        int j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        int counter=1;
        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOnePattern(int n){
        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            for(j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
         for(i=n; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            for(j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
    }

    public static void rhombus(int n){
        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
            System.out.print(" ");
        }
         for(j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
        }
        
    }

    public static void hollowRhombus(int n){
         int i,j;
         for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=n; j++){
                if(j==1 || i==1 || i==n || j==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }

    public static void diamond(int n){
        int i , j;
        for(i=1; i<=n; i++){
            for(j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=(2*i)-1; j++){
                System.out.print("*");           
                 }
            System.out.println();     
        }
        for(i=n; i>=1; i--){
            for(j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");           
                 }
            System.out.println();     
        }

    }


    public static void main(String args[]){
    //   HollowBox(5,50);
    //   IandR_half_pyramid(50);
    //   invHalfNumPyr(10);
    // floydsTriangle(5);
    // zeroOnePattern(6);
    // butterfly(10);
    // rhombus(5);
    // hollowRhombus(20);
    diamond(10);

    }
}