import javax.swing.*;
import java.awt.*;
/** Kjo klase vizaton gjashte shirita dhe mundeson paraqitjen e te dhenave me ane te tyre
 * shfrytezuesi  cakton titullin e grafit, vleren maksimale, vleren e secilit shirit dhe
 * titullin e secilit shirit
 */
public class BarGraphWriter extends JPanel
{
    private int height,width,y_height,x,y,height1,height2,height3,height4,height5,height6;
    private int shkalla=7;
    private String emertimi="";
    private int w=60; // gjeresia e shiritave
    JFrame a;
    Color c1,c2,c3,c4,c5,c6;
    private String shTitulli1=""; //titulli i shirit 1
    private String shTitulli2="";  // titulli i shirit 2
    private String shTitulli3=""; // titulli i shirit 3
    private String shTitulli4=""; // titulli i shirit 4
    private String shTitulli5=""; // titulli i shirit 5
    private String shTitulli6=""; // // titulli i shirit 6


    public BarGraphWriter(int w , int h)
    {
        width=w;  // gjeresia e dritares
        height=h;  // lartesia e dritares
        a=new JFrame();
        a.getContentPane().add(this);
        a.setSize(width,height);
        a.setVisible(true);
    }
     public void setTitle(String titulli)
     {
         a.setTitle(titulli);
     }   // cakton titullin  e grafit
    public void paintComponent(Graphics g)
    {   x=200;
        y=420;
        g.setColor(Color.white);
        g.fillRect(0,0,width,height);
        g.setColor(Color.black);
        g.drawLine(x,y,x+6*w+28,y);
        g.drawLine(x-1,y,x-1,y-y_height);
        g.drawString("0",x-10,y);
        g.drawString(emertimi,x-15,y-y_height+4);
        g.fillRect(x+5,y-height1+5,w,height1);
        g.setColor(c1);
        g.fillRect(x,y-height1,w,height1);
        g.setColor(Color.black);
        g.drawString(shTitulli1, x,  y+ 20);
        g.fillRect(x+w+10,y-height2+5,w,height2);
        g.setColor(c2);
        g.fillRect(x+w+5,y-height2,w,height2);
        g.setColor(Color.black);
        g.drawString(shTitulli2, x+w+5,  y+ 20);
        g.fillRect(x+2*w+15,y-height3+5,w,height3);
        g.setColor(c3);
        g.fillRect(x+2*w+10,y-height3,w,height3);
        g.setColor(Color.black);
        g.drawString(shTitulli3, x+2*w+10,  y+ 20);
        g.fillRect(x+3*w+20,y-height4+5,w,height4);
        g.setColor(c4);
        g.fillRect(x+3*w+15,y-height4,w,height4);
        g.setColor(Color.black);
        g.drawString(shTitulli4, x+3*w+15,  y+ 20);
        g.fillRect(x+4*w+25,y-height5+5,w,height5);
        g.setColor(c5);
        g.fillRect(x+4*w+20,y-height5,w,height5);
        g.setColor(Color.black);
        g.drawString(shTitulli5, x+4*w+20,  y+ 20);
        g.fillRect(x+5*w+30,y-height6+5,w,height6);
        g.setColor(c6);
        g.fillRect(x+5*w+25,y-height6,w,height6);
        g.setColor(Color.black);
        g.drawString(shTitulli6, x+5*w+25,  y+ 20);
    }
    public void setAxes(int x_pos, int y_pos, String top_label, int y_height)  // vendos boshtet se ku vizatohet grafi
    {
        x=x_pos;
        y=y_pos;
        this.y_height=y_height;
        emertimi=top_label;
        this.repaint();
    }
    public void setBar1(int height,String shTitulli,Color c)
    {
        height1=height;
        shTitulli1=shTitulli;
        c1=c;
        this.repaint();
    }
    public void setBar2(int height,String shTitulli,Color c)
    {
        height2=height;
        shTitulli2=shTitulli;
        c2=c;
        this.repaint();
    }
    public void setBar3(int height,String shTitulli,Color c)
    {
        height3=height;
        shTitulli3=shTitulli;
        c3=c;
        this.repaint();
    }
    public void setBar4(int height,String shTitulli,Color c)
    {
        height4=height;
        shTitulli4=shTitulli;
        c4=c;
        this.repaint();
    }
    public void setBar5(int height,String shTitulli,Color c)
    {
        height5=height;
        shTitulli5=shTitulli;
        c5=c;
        this.repaint();
    }
    public void setBar6(int height,String shTitulli,Color c)
    {
        height6=height;
        shTitulli6=shTitulli;
        c6=c;
        this.repaint();
    }



    public static void main(String[] args) {
        int shkalla=7;
        BarGraphWriter c=new BarGraphWriter(800,600);
        String l=JOptionPane.showInputDialog("Titulli i grafit");
        c.setTitle(l);
        l=JOptionPane.showInputDialog("Vlera maksimale");
        c.setAxes(200, 420, l, 217);
        String d=JOptionPane.showInputDialog("Vlera e shiritit 1");
        int v=new Integer(d).intValue();
        String t=JOptionPane.showInputDialog("Titulli i shiritit 1");
        c.setBar1(v*shkalla,t,Color.red);
        d=JOptionPane.showInputDialog("Vlera e shiritit 2");
        v=new Integer(d).intValue();
        t=JOptionPane.showInputDialog("Titulli i shiritit 2");
        c.setBar2(v*shkalla,t,Color.pink);
        d=JOptionPane.showInputDialog("Vlera e shiritit 3");
        v=new Integer(d).intValue();
        t=JOptionPane.showInputDialog("Titulli i shiritit 3");
        c.setBar3(v*shkalla,t,Color.blue);
        d=JOptionPane.showInputDialog("Vlera e shiritit 4");
        v=new Integer(d).intValue();
        t=JOptionPane.showInputDialog("Titulli i shiritit 4");
        c.setBar4(v*shkalla,t,Color.yellow);
        d=JOptionPane.showInputDialog("Vlera e shiritit 5");
        v=new Integer(d).intValue();
        t=JOptionPane.showInputDialog("Titulli i shiritit 5");
        c.setBar5(v*shkalla,t,Color.green);
        d=JOptionPane.showInputDialog("Vlera e shiritit 6");
        v=new Integer(d).intValue();
        t=JOptionPane.showInputDialog("Titulli i shiritit 6");
        c.setBar6(v*shkalla,t,Color.magenta);

    }
}

