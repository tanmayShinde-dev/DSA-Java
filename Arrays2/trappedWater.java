public class trappedWater{
public static int trappedWater(int height[]){
    int n = height.length;


    int leftmostGreater[]= new int[n];
    leftmostGreater[0]=height[0];
    for(int i=1; i<n; i++){
        leftmostGreater[i]= Math.max(height[i], leftmostGreater[i-1]);
    }

    int rightmostGreater[]= new int[n];
    rightmostGreater[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightmostGreater[i]= Math.max(height[i], rightmostGreater[i+1]);
    }

    int trappedWater=0;
    for(int i=0; i<n; i++){
        int waterLevel=Math.min(rightmostGreater[i],leftmostGreater[i]);

        trappedWater+= waterLevel-height[i];
    }

    return trappedWater;

}    
public static void main(String args[]){

    int height[]={4,2,0,6,3,2,5};
    System.out.println("Total trapped water is:"+ trappedWater(height));

}
}