import javax.swing.JFrame;

public class Display {

    private JFrame gameframe;

    private String title;
    private int width, height;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }

    private void createDisplay() {
        gameframe = new JFrame(title);
        gameframe.setSize(width, height); //set Size of Window
        gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit Window
        gameframe.setResizable(false); //not resizable
        gameframe.setLocationRelativeTo(null);
        gameframe.setVisible(true); //sichtbar

    }

}
