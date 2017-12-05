package controller;

import date.KnowledgeBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import javax.xml.soap.SOAPPart;
import java.util.HashSet;

public class Controller {

    @FXML
    ListView<String> buldinglist;
    ObservableList<String> list= FXCollections.observableArrayList();
    HashSet<String> hset=new HashSet<String>();

    @FXML
    ComboBox<String> list1;

    @FXML
    ComboBox<String> list2;

    @FXML
    TextArea wynikBox;

    KnowledgeBase text =new KnowledgeBase();
    @FXML
    void initialize()
    { text.init();
     list1.setItems(text.firstList());
     list2.setItems(text.secondList());
     buldinglist.setItems(list);
     text.createRule();
    }
    @FXML
    void addBulding()
    {
       String z=list1.getValue();
       if(text.canAdd(z))
       list.add(z);
       hset.add(z);
       text.set(z);
    }
    @FXML
    void  removeBulding()
    {
        int index=buldinglist.getSelectionModel().getSelectedIndex();
        text.delete(list.get(index));
        list.remove(index);
    }
    @FXML
    void checkBulding()
    {
        text.setTarget(list2.getValue());
        text.checkBack(hset);
        String result=text.checkMain();
        wynikBox.setText(result);

    }




}
