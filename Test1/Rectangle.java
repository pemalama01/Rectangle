import javax.swing.*;

class Rectangle{
    public static void main(String[]args){
        JFrame f = new JFrame();
        f.setResizable(false);
        Rectanglepanel Rectangle = new Rectanglepanel();
        Rectanglepanel Rectangle1 = new Rectanglepanel();
        f.add(Rectangle);
        f.add(Rectangle1);
        f.setSize(500,500);
        f.setVisible(true);

    }
}