module org.example.surfaceareaandvolumeof3dshapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.surfaceareaandvolumeof3dshapes to javafx.fxml;
    exports org.example.surfaceareaandvolumeof3dshapes;
}