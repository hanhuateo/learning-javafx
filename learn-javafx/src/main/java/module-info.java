module org.thh {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.thh to javafx.fxml;
    exports org.thh;
}
