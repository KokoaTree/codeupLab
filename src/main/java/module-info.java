module codeup.codeup {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens codeup.codeup to javafx.fxml;
    exports codeup.codeup;
}