module com.example.java_ea {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens com.java_ea to javafx.fxml;
    exports com.java_ea;
}