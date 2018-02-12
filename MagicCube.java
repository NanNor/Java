package Sonntag;

public class MagicCube {
    byte[][] cube;
    MagicCube(int size){
        cube = new byte[6][size];
    }
    public void fill(){
        for(int i = 0; i < cube.length;i++){
            for(int j = 0; j < cube[i].length;j++){
                cube[i][j] = (byte)i;
            }
        }
    }
}
