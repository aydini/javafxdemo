module aydini.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens aydini.javafxdemo to javafx.fxml;
    exports aydini.javafxdemo;
}