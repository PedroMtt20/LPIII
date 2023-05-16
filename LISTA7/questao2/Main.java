// package LPIII.LISTA7.questao2;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(12, 20, 0);
        Time t2 = new Time(14, 50, 50);
        Time tn = Time.diffTime(t1, t2);
        Time tf = Time.diffTime(t1);
        
        tn.prnTime();
        tf.prnTime();

    }
}
