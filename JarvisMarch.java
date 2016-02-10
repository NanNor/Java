import java.awt.*;

/**
 * Created by hepstev on 03.02.16.
 */
public class JarvisMarch {
    public static void main(String[] args){
        JarvisMarch c=new JarvisMarch();
    }
        private Point[] p;
        private int n;
        private int h;
        public int computerHull(Point[] p){
            this.p =p;
            n=p.length;
            h=0;
            jarvisMarch();
            return h;
        }
    private void jarvisMarch(){
       int i =lowestPoint();
        do{
            exchange(h, i);
            i=mostPoint(p[h]);
            h++;
        }
        while(i>0);
    }
    private int lowestPoint() {
        int i, min = 0;
        for(i = 1; i<n; i++){
            if(p[i].y <p[min].y || p[i].y ==p[min].y && p[i].x < p[min].x){
                min=i;
            }
        }
        return min;
    }
    private int mostPoint(Point q){
        int i=0, j;
        for(j=1;j<n;j++){
            if(p[j] != (p[i])){
                i=j;
            }
        }
        return i;
    }
    private void exchange(int i, int j){
        Point t=p[i];
        p[i]=p[j];
        p[j]=t;
    }

}
