public class Balance {
        static int weightR;
        static int weightL;

        public static void addRight(int n) {
            weightR += n;
        }
        public static void addLeft(int n) {
            weightL += n;
        }

        public static String getSituation() {
            if (weightR == weightL) {
                return  "=";
            } else if (weightR > weightL) {
                return  "R";
            } else {
                return "L";
            }
        }
    }


