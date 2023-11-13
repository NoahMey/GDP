public class GameOfLife {
        // Ihre Lösung kommt hier hin

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
