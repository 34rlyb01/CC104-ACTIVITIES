import java.awt.*;

class HelloGUI extends Frame { 
    public HelloGUI() {
        super("LOGIN SECURITY VER 1.0");
        
        Label l1, l2;
        TextField tf1, tf2;
        Button b1, b2;
        
        l1 = new Label("Username: ");
        l2 = new Label("Password: ");
        
        tf1 = new TextField(10);
        tf2 = new TextField(10);

        b1 = new Button("Okay");
        b2 = new Button("Cancel");

        setLayout(new GridLayout(3,2)); 
        //Layout from L to R, then middle.
        // Rows, then Columns (3 Rows, 2 Columns)

        add(l1);add(tf1);
        add(l2);add(tf2);
        add(b1);add(b2);
        pack();
        show();
    }
    
    public static void main(String EarlY[]) {
        new HelloGUI();
        //Ctrl+C to exit at command terminal.
    }
}
