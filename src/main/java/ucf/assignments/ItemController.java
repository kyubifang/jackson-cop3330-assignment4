package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class ItemController {

    @FXML
    public void addButtonClicked(ActionEvent actionEvent) {
        //mouse clicks add button
        //check if there is a task put into the task name field
        //if there is
        //  update txt file with task name. Add date and description if applicable
        //  add task name to list. If date a/o description available, add as well.
        //else
        //  prompt user for a task name
    }

    @FXML
    public void renameButtonClicked(ActionEvent actionEvent) {
        //mouse clicks rename button
        //highlight current selected item's task name
        //allow user to input a new name
        //once clicked off of or enter is pressed
        //update txt file with new task name
        //update task list with new task name
    }

    @FXML
    public void editDateButtonClicked(ActionEvent actionEvent) {
        //mouse clicks edit date button
        //highlight current selected item's date
        //allow user to input a new due date
        //once clicked off of or enter is pressed
        //update txt file with new task due date
        //update task list with new task due date
    }

    @FXML
    public void editDescriptionButtonClicked(ActionEvent actionEvent) {
        //mouse clicks edit description button
        //highlight current selected item's description
        //allow user to input a new description
        //once clicked off of or enter is pressed
        //update txt file with new task description
        //update task list with new task description
    }

    @FXML
    public void deleteButtonClicked(ActionEvent actionEvent) {
        //mouse clicks delete button
        //gui will open for current highlighted task, prompting if the user is sure
        //if yes
        //  delete task, date, and description (if applicable) from txt file
        //  delete task, date, description, and completion (if applicable) from table
        //else no
        //  close current gui
    }

    @FXML
    public void taskColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks task column
        //task column sorts by ascending alphabetical order
        //mouse clicks task column again
        //due dates column sorts by descending alphabetical order
        //repeat unless different column clicked
    }

    @FXML
    public void dateColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks due dates column
        //due dates column sorts by what's due the soonest
        //mouse clicks due dates column again
        //due dates column sorts by what's due the longest from now
        //repeat unless different column clicked
    }

    @FXML
    public void completeColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks complete column
        //complete column sorts by what's not yet completed -> completed
        //mouse clicks due dates column again
        //complete column sorts by what's completed -> not yet completed
        //repeat unless different column clicked
    }

    @FXML
    public void descriptionColumnClicked(TableColumn.CellEditEvent cellEditEvent) {
        //mouse clicks description column
        //description column sorts by ascending alphabetical order
        //mouse clicks due dates column again
        //description column sorts by descending alphabetical order
        //repeat unless different column clicked
    }
}
