module com.themaestrocode.createaccount {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.themaestrocode.createaccount to javafx.fxml;
    exports com.themaestrocode.createaccount;
}