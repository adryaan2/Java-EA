module com.example.java_ea {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.naming;

    opens com.java_ea to javafx.fxml;
    exports com.java_ea;
}