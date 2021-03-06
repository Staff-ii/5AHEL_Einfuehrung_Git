import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Status;

public class Controller {
    public ListView<Status> statusListView;
    public TextField nameTextField;

    public void initialize(){

       statusListView.setItems(Status.getList());
    }
    public void itemSelected(MouseEvent mouseEvent) {

        Status s = statusListView.getSelectionModel().getSelectedItem();
        if (s!= null){
            nameTextField.setText(s.getName());
        }

    }
}
