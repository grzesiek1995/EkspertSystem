package date;

import com.sun.org.apache.regexp.internal.RE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class KnowledgeBase {

    List<Record> recordList = new ArrayList<>();
    List<Rules> rulsList = new ArrayList<>();
    Record target;

    public ObservableList<String> firstList() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.add("Rada Osady ");
        list.add("Rada Miasta ");
        list.add("Ratusz");
        list.add("Kapitol");
        list.add("Fort");
        list.add("Cytadela");
        list.add("Zamek");
        list.add("Kuźnia");
        list.add("Gildia Magów p.1");
        list.add("Gildia Magów p.2");
        list.add("Gildia Magów p.3");
        list.add("Gildia Magów p.4");
        list.add("Targowisko");
        list.add("Magazyn Zasobów");
        list.add("Stajnia");
        list.add("Baston Gryfów");
        list.add("Strażnica");
        list.add("Strzelcy");
        list.add("Wierza Gryfów");
        list.add("Koszary");
        list.add("Klasztor");
        list.add("Porltal Chwały ");
        list.add("Arena Walk ");
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public ObservableList<String> secondList() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.add("Rada Miasta ");
        list.add("Ratusz");
        list.add("Kapitol");
        list.add("Cytadela");
        list.add("Zamek");
        list.add("Gildia Magów p.2");
        list.add("Gildia Magów p.3");
        list.add("Gildia Magów p.4");
        list.add("Magazyn Zasobów");
        list.add("Stajnia");
        list.add("Baston Gryfów");
        list.add("Strażnica");
        list.add("Strzelcy");
        list.add("Wierza Gryfów");
        list.add("Koszary");
        list.add("Klasztor");
        list.add("Porltal Chwały ");
        list.add("Arena Walk ");
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public void init() {
        //1----------------------
        Record nowy = new Record();
        nowy.setText("Rada Osady ");
        recordList.add(nowy);
        //2----------------------------------------
        Record nowy2 = new Record();
        nowy2.setText("Rada Miasta ");
        recordList.add(nowy2);
        //3----------------------------------------
        Record nowy3 = new Record();
        nowy3.setText("Ratusz");
        recordList.add(nowy3);
        //4----------------------------------------
        Record nowy4 = new Record();
        nowy4.setText("Kapitol");
        recordList.add(nowy4);
        //5----------------------------------------
        Record nowy5 = new Record();
        nowy5.setText("Fort");
        recordList.add(nowy5);
        //6----------------------------------------
        Record nowy6 = new Record();
        nowy6.setText("Cytadela");
        recordList.add(nowy6);
        //7----------------------------------------
        Record nowy7 = new Record();
        nowy7.setText("Zamek");
        recordList.add(nowy7);
        //8----------------------------------------
        Record nowy8 = new Record();
        nowy8.setText("Kuźnia");
        recordList.add(nowy8);
        //9----------------------------------------
        Record nowy9 = new Record();
        nowy9.setText("Gildia Magów p.1");
        recordList.add(nowy9);
        //10----------------------------------------
        Record nowy10 = new Record();
        nowy10.setText("Gildia Magów p.2");
        recordList.add(nowy10);
        //11----------------------------------------
        Record nowy11 = new Record();
        nowy11.setText("Gildia Magów p.3");
        recordList.add(nowy11);
        //12----------------------------------------
        Record nowy12 = new Record();
        nowy12.setText("Gildia Magów p.4");
        recordList.add(nowy12);
        //13----------------------------------------
        Record nowy13 = new Record();
        nowy13.setText("Targowisko");
        recordList.add(nowy13);
        //14----------------------------------------
        Record nowy14 = new Record();
        nowy14.setText("Magazyn Zasobów");
        recordList.add(nowy14);
        //15----------------------------------------
        Record nowy15 = new Record();
        nowy15.setText("Stajnia");
        recordList.add(nowy15);
        //16----------------------------------------
        Record nowy16 = new Record();
        nowy16.setText("Baston Gryfów");
        recordList.add(nowy16);
        //17----------------------------------------
        Record nowy17 = new Record();
        nowy17.setText("Strażnica");
        recordList.add(nowy17);
        //18----------------------------------------
        Record nowy18 = new Record();
        nowy18.setText("Strzelcy");
        recordList.add(nowy18);
        //19----------------------------------------
        Record nowy19 = new Record();
        nowy19.setText("Wierza Gryfów");
        recordList.add(nowy19);
        //20----------------------------------------
        Record nowy20 = new Record();
        nowy20.setText("Koszary");
        recordList.add(nowy20);
        //21----------------------------------------
        Record nowy21 = new Record();
        nowy21.setText("Klasztor");
        recordList.add(nowy21);
        //22----------------------------------------
        Record nowy22 = new Record();
        nowy22.setText("Porltal Chwały ");
        recordList.add(nowy22);
        //23----------------------------------------
        Record nowy23 = new Record();
        nowy23.setText("Arena Walk ");
        recordList.add(nowy23);

    }

    public void set(String z) {
        if (z != null) {
            for (Record record : recordList) {
                String z1 = new String(record.getText());
                if (z.equals(z1)) {
                    System.out.println("wybrano tekst: " + record.getText() + " " + record.isVarieble());
                    record.setVarieble(true);
                }

            }
            int i = 0;
            for (Record record : recordList) {
                String z1 = new String(record.getText());
                i++;
                System.out.println(i + ". " + record.getText() + " " + record.isVarieble());

            }
        }
    }

    public boolean canAdd(String z) {
        boolean restult = true;
        {
            if (z != null) {
                for (Record record : recordList) {
                    String z1 = new String(record.getText());
                    if (z.equals(z1)) {
                        if (record.isVarieble())
                            restult = false;
                    }
                }
            }
        }
        return restult;
    }

    public void delete(String z) {
        if (z != null) {
            for (Record record : recordList) {
                String z1 = new String(record.getText());
                if (z.equals(z1)) {
                    System.out.println("wybrano tekst: " + record.getText() + " " + record.isVarieble());
                    record.setVarieble(false);
                }

            }
            int i = 0;
            for (Record record : recordList) {
                String z1 = new String(record.getText());
                i++;
                System.out.println(i + ". " + record.getText() + " " + record.isVarieble());

            }
        }
    }

    public void createRule() {
        //1
        List<Record> pomlist = new ArrayList<>();
        pomlist.add(recordList.get(0));
        Rules rule1 = new Rules();
        rule1.setArgumentList(pomlist);
        rule1.setResult(recordList.get(1));
        rulsList.add(rule1);
        //2
        List<Record> pomlist2 = new ArrayList<>();
        pomlist2.add(recordList.get(4));
        Rules rule2 = new Rules();
        rule2.setArgumentList(pomlist2);
        rule2.setResult(recordList.get(5));
        rulsList.add(rule2);
        //3
        List<Record> pomlist3 = new ArrayList<>();
        pomlist3.add(recordList.get(5));
        Rules rule3 = new Rules();
        rule3.setArgumentList(pomlist3);
        rule3.setResult(recordList.get(6));
        rulsList.add(rule3);
        //4
        List<Record> pomlist4 = new ArrayList<>();
        pomlist4.add(recordList.get(8));
        Rules rule4 = new Rules();
        rule4.setArgumentList(pomlist4);
        rule4.setResult(recordList.get(9));
        rulsList.add(rule4);
        //5
        List<Record> pomlist5 = new ArrayList<>();
        pomlist5.add(recordList.get(9));
        Rules rule5 = new Rules();
        rule5.setArgumentList(pomlist5);
        rule5.setResult(recordList.get(10));
        rulsList.add(rule5);
        //6
        List<Record> pomlist6 = new ArrayList<>();
        pomlist6.add(recordList.get(10));
        Rules rule6 = new Rules();
        rule6.setArgumentList(pomlist6);
        rule6.setResult(recordList.get(11));
        rulsList.add(rule6);
        //7
        List<Record> pomlist7 = new ArrayList<>();
        pomlist7.add(recordList.get(12));
        Rules rule7 = new Rules();
        rule7.setArgumentList(pomlist7);
        rule7.setResult(recordList.get(13));
        rulsList.add(rule7);
        //8
        List<Record> pomlist8 = new ArrayList<>();
        pomlist8.add(recordList.get(8));
        pomlist8.add(recordList.get(12));
        pomlist8.add(recordList.get(7));
        pomlist8.add(recordList.get(1));
        Rules rule8 = new Rules();
        rule8.setArgumentList(pomlist8);
        rule8.setResult(recordList.get(2));
        rulsList.add(rule8);
        //9
        List<Record> pomlist9 = new ArrayList<>();
        pomlist9.add(recordList.get(5));
        pomlist9.add(recordList.get(6));
        pomlist9.add(recordList.get(2));
        Rules rule9 = new Rules();
        rule9.setArgumentList(pomlist9);
        rule9.setResult(recordList.get(3));
        rulsList.add(rule9);
        //10
        List<Record> pomlist10 = new ArrayList<>();
        pomlist10.add(recordList.get(7));
        pomlist10.add(recordList.get(19));
        Rules rule10 = new Rules();
        rule10.setArgumentList(pomlist10);
        rule10.setResult(recordList.get(14));
        rulsList.add(rule10);
        //11
        List<Record> pomlist11 = new ArrayList<>();
        pomlist11.add(recordList.get(7));
        pomlist11.add(recordList.get(19));
        pomlist11.add(recordList.get(18));
        Rules rule11 = new Rules();
        rule11.setArgumentList(pomlist11);
        rule11.setResult(recordList.get(15));
        rulsList.add(rule11);
        //12
        List<Record> pomlist12 = new ArrayList<>();
        pomlist12.add(recordList.get(4));
        Rules rule12 = new Rules();
        rule12.setArgumentList(pomlist12);
        rule12.setResult(recordList.get(16));
        rulsList.add(rule12);
        //13
        List<Record> pomlist13 = new ArrayList<>();
        pomlist13.add(recordList.get(4));
        Rules rule13 = new Rules();
        rule13.setArgumentList(pomlist13);
        rule13.setResult(recordList.get(17));
        rulsList.add(rule13);
        //14
        List<Record> pomlist14 = new ArrayList<>();
        pomlist14.add(recordList.get(7));
        pomlist14.add(recordList.get(19));
        pomlist14.add(recordList.get(4));
        Rules rule14 = new Rules();
        rule14.setArgumentList(pomlist14);
        rule14.setResult(recordList.get(18));
        rulsList.add(rule14);
        //15
        List<Record> pomlist15 = new ArrayList<>();
        pomlist15.add(recordList.get(7));
        pomlist15.add(recordList.get(4));
        Rules rule15 = new Rules();
        rule15.setArgumentList(pomlist15);
        rule15.setResult(recordList.get(19));
        rulsList.add(rule15);
        //16
        List<Record> pomlist16 = new ArrayList<>();
        pomlist16.add(recordList.get(8));
        pomlist16.add(recordList.get(7));
        pomlist16.add(recordList.get(19));
        pomlist16.add(recordList.get(4));
        Rules rule16 = new Rules();
        rule16.setArgumentList(pomlist16);
        rule16.setResult(recordList.get(20));
        rulsList.add(rule16);
        //17
        List<Record> pomlist17 = new ArrayList<>();
        pomlist17.add(recordList.get(8));
        pomlist17.add(recordList.get(7));
        pomlist17.add(recordList.get(19));
        pomlist17.add(recordList.get(20));
        pomlist17.add(recordList.get(4));
        Rules rule17 = new Rules();
        rule17.setArgumentList(pomlist17);
        rule17.setResult(recordList.get(21));
        rulsList.add(rule17);
        //18
        List<Record> pomlist18 = new ArrayList<>();
        pomlist18.add(recordList.get(7));
        pomlist18.add(recordList.get(14));
        pomlist18.add(recordList.get(19));
        Rules rule18 = new Rules();
        rule18.setArgumentList(pomlist18);
        rule18.setResult(recordList.get(22));
        rulsList.add(rule18);
       /* for(Rules rule:rulsList)
        {
            rule.showRule();
        }*/
    }

    public String checkMain() {
        String text = new String();
        String text1 = new String();
        Rules helprule = new Rules();
        for (Rules rule : rulsList) {
            if (rule.result.getText().equals(target.getText())) {
                helprule = rule;
            }
        }
        boolean canBulding=true;
        for(Record rec:helprule.getArgumentList())
        {
            for(Record rec2:recordList)
            {
               if(rec.getText().equals(rec2.getText())) {
                   if (rec2.isVarieble())
                   {

                   }
                   else
                   {
                       text1=text1+"\n "+rec2.getText();
                       canBulding=false;
                   }
               }
            }
        }
        if(canBulding)
        {
            text="Przy wprowadzonych danych \nmozna wybudować dana budowle";
        }
        else
        {
            text="Przy wprowadzonych danych\n nie mozna wybudować danej \nbudowli.Brakujące budynki to: \n"+ text1;
        }
        return text;
    }

    public void checkBack(HashSet<String> list) {
        boolean can = false;
        do {
            can=false;
            HashSet<String> nowa = new HashSet<>();
            for (String z : list) {
                nowa.add(z);
            }
            for (String z : nowa) {
                Rules pom = null;
                for (Rules rule : rulsList) {
                    if (rule.getResult().getText().equals(z))
                        pom = rule;
                }
                if (pom != null) {
                    for (Record rec : pom.getArgumentList()) {
                        for (Record rec2 : recordList) {
                            if (rec.getText().equals(rec2.getText())) {
                                boolean z1 = checkAdd(rec.getText(), list);
                                if (z1) {
                                    list.add(rec2.getText());
                                    can=true;
                                    rec2.setVarieble(true);
                                }
                            }
                        }
                    }
                }
            }
        }
        while (can);
        for (String z : list) {
            System.out.println(z);
        }
    }

    public void setTarget(String target) {

        if (target != null) {
            for (Record record : recordList) {
                String z1 = new String(record.getText());
                if (target.equals(z1)) {
                    this.target = record;
                }

            }
        }
    }

    public boolean checkAdd(String z, HashSet<String> lista) {
        boolean result = true;
        for (String abc : lista) {
            if (z.equals(abc)) {
                result = false;
            }
        }
        return result;
    }
}
