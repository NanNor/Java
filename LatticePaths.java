/**
 * Created by hepstev on 15.12.15.
 */
public class LatticePaths {
    public static void main(String[] args)
    {
        long maxways =0;
        maxways = routes(20,20);
        System.out.println(maxways);
    }

    public static long routes(int gridOne , int gridTwo)
    {
        long routes = 0;
        if(gridOne==0 || gridTwo==0){
            routes = 1;}
        else{
            routes = routes(gridOne-1,gridTwo) + routes(gridOne,gridTwo-1);}
        return(routes);
    }
}

