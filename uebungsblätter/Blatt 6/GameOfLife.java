public class GameOfLife {
        // Ihre Lösung kommt hier hin
        public static boolean access(boolean[][] arr, int x, int y){
            x = x-1;
            y = y-1;
            if((x>arr.length) | (x<0)){
                if (x>arr.length-1) {
                    x = (x%arr.length);      
                }

            }
            return arr[x][y];
        }

        public static int countNeighbours(boolean[][] arr, int x, int y){
            return 0;
        }

        public static void main(String[] args) {
            boolean[][] field = {
                {false, false,  true, false},
                { true, false,  true, false},
                {false,  true,  true, false},
                {false, true, false, false}
            };
            System.out.println(access(field,-2,-2)); // should return `true`
            System.out.println(countNeighbours(field,3,2)); // should return 4
        }
}
