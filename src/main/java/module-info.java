module com.example.cod5pedidoquesadillas {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens com.example.cod5pedidoquesadillas to javafx.fxml;
    exports com.example.cod5pedidoquesadillas;
}