package Binary_Search.BS_on_1D_Array;

class Pair{
    int floor;
    int ciel;

    Pair(){
        this.floor = 0;
        this.ciel = 0;
    }

    Pair(int floor, int ciel){
        this.floor = floor;
        this.ciel = ciel;
    }
}
public class Floor_and_Ciel {
    class Solve {
        Pair getFloorAndCeil(int[] arr, int n, int x) {
            int floor = -1;
            int ciel = 1000000;
            
            for(int a : arr){
                if(a <= x && a>floor){
                    floor = a;
                }
                if(a >= x && a<ciel){
                    ciel = a;
                }
            }
            if(ciel == 1000000){
                ciel = -1;
            }
            return new Pair(floor, ciel);
        }
    }
}
