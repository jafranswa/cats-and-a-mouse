

public class Main {

    public static void main(String[] args){
        // hacker rank problem link https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
        String result = solution(1, 2, 3);
        System.out.println(result);
    }

    public static String solution(int catA, int catB, int mouse) {
        // Complete the catAndMouse function below.
            int catADistance;
            int catBDistance;
            // cata distance
            if ( catA < mouse) {
                catADistance = mouse - catA;
            } else {
                catADistance = catA - mouse;
            }
            // catb distance
            if ( catB < mouse) {
                catBDistance = mouse - catB;
            } else {
                catBDistance = catB - mouse;
            }
            // determine winner
            if (catADistance < catBDistance) {
                return "Cat A";
            }
            if (catADistance > catBDistance) {
                return "Cat B";
            }
            return "Mouse C";
    }

}
