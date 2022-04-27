package Lol;
import li.*;
public class Ashe extends Champion implements AsheActiosnCallbacks {
    public Ashe(int id, String name, String role, String dificultad, String descripccion) {
        super(id, name, role, dificultad, descripccion);
    }

    @Override
    public void FROSTSHOT(Screen s) {
        s.setVisible(true);
        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("P.gif");
        s.setBounds(200, 100, 1100, 900);
        System.out.println("Lol.Ashe's attacks slow their target, causing her to deal increased damage to these targets.");
    }

    @Override
    public void RANGERsFOCUS(Screen s) {
        System.out.println("Q");

        s.cls();
        s.repaint();
        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Q.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void VOLLEY(Screen s) {
        System.out.println("W");
        s.cls();
        s.repaint();
        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("W.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void HAWKSHOT(Screen s) {
        System.out.println("E");
        s.cls();
        s.repaint();
        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("E.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void ENCHANTEDCRYSTALARROW(Screen s) {
        System.out.println("R");
        s.cls();
        s.repaint();
        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("R.gif");
        s.setBounds(200, 100, 1100, 900);
    }
}
