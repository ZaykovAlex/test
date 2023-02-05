public class Rect {
    class Rectangular {
        private int s; int w, h;
        Rectangular(int w, int h){
            this.w = w;
            this.h = h;
            s = w * h;
        }
        int getS(){
            return s;
        }
        int getW(){
            return w;
        }
        int getH(){
            return h;
        }
    }
}
