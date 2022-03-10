module com.bse2.projects {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
    requires itextpdf;


    opens com.bse2.projects to javafx.fxml;
    exports com.bse2.projects;
}