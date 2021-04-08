module es.joaquinjimenez.jfx.basic {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.joaquinjimenez.jfx.basic to javafx.fxml;
    exports es.joaquinjimenez.jfx.basic;
}