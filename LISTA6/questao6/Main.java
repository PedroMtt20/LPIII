public class Main {
    public static void main(String[] args) {
        RoboSimples robo = new RoboSimples("1", 3, 0, "N");
        RoboSimples robo2 = new RoboSimples("2", 3, 2, "E");
        RoboSimples robo3 = new RoboSimples("3", 3, 2, "N");
        RoboSimples robo4 = new RoboSimples("4", 3, 5, "N");
        robo3.move(0, 3);
        robo3.mudaDireção("S");
        robo3.move(3, 1);
        robo3.move(3, 4);
        robo3.mudaDireção("NO");
        robo3.move(4, 4);
        System.out.println(robo2.toString());
        System.out.println(robo3.toString());
        System.out.println(robo4.toString());
    }
}
