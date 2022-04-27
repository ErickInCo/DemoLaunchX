package Lol;
import li.*;
public class Game {
    public static void main(String[] args) throws InterruptedException {
        TestAshe();
        Screen s = new Screen();
    }

    private static void TestAshe() throws InterruptedException {
        Screen s = new Screen();
        Ashe ashe = new Ashe(1, "Lol.Ashe", "Tirador", "Facil", "Iceborn warmother of the Avarosan tribe, Lol.Ashe commands the most populous horde in the north. ");
//        s.setVisible(true);
//        s.out(ashe.showMsg(),"Helvetica",28,Colors.BlueHorizon);
        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    ashe.FROSTSHOT(s);
                    Thread.sleep(3000);
                    ashe.HAWKSHOT(s);
                    Thread.sleep(3000);
                    ashe.RANGERsFOCUS(s);
                    Thread.sleep(3000);
                    ashe.VOLLEY(s);
                    Thread.sleep(3000);
                    ashe.ENCHANTEDCRYSTALARROW(s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        Thread atkAshe = new Thread(attack);
        atkAshe.start();

    }
}
