import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class pr33 extends Application
{
    public void start(Stage stage)
    {
        VBox v = new VBox(10);
        Random r = new Random();

        for(int i=1;i<=5;i++)
        {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble(), 0.3 + r.nextDouble()*0.7));
            v.getChildren().add(t);
        }

        Scene s = new Scene(v,300,200);
        stage.setScene(s);
        stage.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}

/*
Output:
Window shows 5 texts with random color & opacity
*/
