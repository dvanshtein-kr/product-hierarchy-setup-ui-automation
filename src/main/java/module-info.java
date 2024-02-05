module com.example.producthierarchysetupuiautomation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.producthierarchysetupuiautomation to javafx.fxml;
    exports com.example.producthierarchysetupuiautomation;
}
