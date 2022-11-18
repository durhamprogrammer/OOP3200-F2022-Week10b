package ca.durhamcollege.oop3200f2022week10b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Vector2ViewController implements Initializable
{

    @FXML
    private Button AddVectorButton;

    @FXML
    private ListView<?> Vector2ListView;

    @FXML
    private TextField XInputTextField;

    @FXML
    private TextField YInputTextField;

    @FXML
    void AddVectorButton_Clicked(ActionEvent event)
    {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}