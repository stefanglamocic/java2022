package project.model;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Field extends StackPane{
    private final int ordinalNumber;
    private int diamonds;
    private boolean hole;
    private Figurine figurine;
    private GhostFigurine ghost;


    public Field(int ordinalNumber){
        this.ordinalNumber = ordinalNumber;
        Label label = new Label(String.valueOf(ordinalNumber));
        StackPane.setAlignment(label, Pos.CENTER);
        this.getChildren().add(label);
        setMinSize(50, 50);
        setStyle("-fx-border-color:black; -fx-border-width: 0.3; -fx-border-style: solid;");
    }

    public int getOrdinalNumber(){ return ordinalNumber; }

}
