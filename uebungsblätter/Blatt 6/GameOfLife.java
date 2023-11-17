public class GameOfLife {
        // Ihre Lösung kommt hier hin
        public static boolean access(boolean[][] arr, int x, int y){
            x = (x)%arr.length;
            
            y = (y)%arr.length;
            // System.out.println(x);
            // System.out.println(y);
            if(x<0){
                x += 1;
                x = arr.length-1 +x;
                }

             if(y<0){
                y += 1;
                y = arr.length-1 +y;
                }
            // System.out.println(x);
            // System.out.println(y);
            return arr[x][y];
        }

        public static int countNeighbours(boolean[][] arr, int x, int y){
            int neigh =  0;
            for (int a = -1; a<= 1; a++){
                for (int b = -1; b<= 1; b++){
                    if(access(arr, a+x, b+y) == true){
                        neigh += 1;
                    }
                }
            }
            return neigh;
        }

        public static void main(String[] args) {
            boolean[][] field = {
                {false, false,  true, false},
                { true, false,  true, false},
                {false,  true,  true, false},
                {false, true, false, false}
            };
            //System.out.println(access(field,-2,-2)); // should return `true` x, y = 2
            //System.out.println(access(field,5,5)); // should return `true` x, y = 1
            //System.out.println(access(field,-5,-5)); // should return `true` x, y = 3
            //System.out.println(access(field,0,0)); // should return `true` x, y = 0
            //System.out.println(access(field,-3,-3)); // should return `true` x, y = 1
            System.out.println(countNeighbours(field,3,2)); // should return 4
        }
}
