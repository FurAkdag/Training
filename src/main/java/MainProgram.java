import KAGO_framework.Config;
import KAGO_framework.control.MainController;
import KAGO_framework.model.abitur.datenstrukturen.List;

import my_project.model.Fahrzeug;

public class MainProgram {

    /**
     * Die Main-Methode von Java startet das Programm. Sie ist einzigartig im ganzen Projekt.
     * Sie startet das Framework. Weitere Details zum Ablauf kann man sehen, wenn man mit STRG+Linksklick auf
     * "startFramework()" in der Methode klickt.
     *
     * Der gesamte Prozess endet mit dem Erzeugen eines Objekts der Klasse "ProgramController", die sich im Paket "my_project > control"
     * befindet. Dort sollte deine Arbeit beginnen.
     */
    public static void main (String[] args){
        new MainProgram();
    }

    private List<Fahrzeug> fahrzeugList;

    public MainProgram(){
        fahrzeugList = new List<>();
        addLottaFahrzeugs(5000);
        howManyType(66);
        wholePS();
        threeRad();
        lowestPS();
    }

    public void addLottaFahrzeugs(int n){
        int b = 0;
        for(int i = 0; i < n ; i++ ){
            Fahrzeug fahrzeug = new Fahrzeug();
            fahrzeugList.append(fahrzeug);
            b++;
        }
        System.out.println(b + " Fahrzeuge drinnen");
    }

    public void returnTypes(){
        if(!fahrzeugList.isEmpty()) {
                Fahrzeug tmp = fahrzeugList.getContent();

            fahrzeugList.toFirst();
            while(fahrzeugList.hasAccess()){
                System.out.println("Auto Typ: " + fahrzeugList.getContent().getTyp());
                fahrzeugList.next();
            }
            fahrzeugList.toFirst();
            while (fahrzeugList.getContent() != tmp){
                fahrzeugList.next();
            }
        }

    }

    public void howManyType(int type){
        int a = 0;
        if(!fahrzeugList.isEmpty()) {
            Fahrzeug tmp = fahrzeugList.getContent();
            fahrzeugList.toFirst();
            while(fahrzeugList.hasAccess()){
                if(fahrzeugList.getContent().getTyp() == type) {
                    a++;
                }
                fahrzeugList.next();
            }
            fahrzeugList.toFirst();
            while(fahrzeugList.getContent() != tmp){
                fahrzeugList.next();
            }

        }
        System.out.println(a + " mal vorhanden");
    }

    public void wholePS(){
        int wholePS = 0;
        if(!fahrzeugList.isEmpty()) {
            Fahrzeug tmp = fahrzeugList.getContent();
            fahrzeugList.toFirst();
            while(fahrzeugList.hasAccess()){
                wholePS += fahrzeugList.getContent().getPs();
                fahrzeugList.next();
            }
            fahrzeugList.toFirst();
            while(fahrzeugList.getContent() != tmp){
                fahrzeugList.next();
            }
        }
        System.out.println("Gesamte PS von: " + wholePS);
    }

    public void threeRad(){
        int anzahl = 0;
        if(!fahrzeugList.isEmpty()) {
            Fahrzeug tmp = fahrzeugList.getContent();
            fahrzeugList.toFirst();
            while(fahrzeugList.hasAccess()){
                if(fahrzeugList.getContent().getRad() == 3){
                    System.out.println("Autonummer: " + fahrzeugList.getContent().getTyp());
                    anzahl++;
                }
                fahrzeugList.next();
            }
            fahrzeugList.toFirst();
            while(fahrzeugList.getContent() != tmp){
                fahrzeugList.next();
            }
        }
        System.out.println(anzahl + " mal vorhanden");
    }

    public Fahrzeug lowestPS(){

        if(!fahrzeugList.isEmpty()) {
            Fahrzeug tmp = fahrzeugList.getContent();
            fahrzeugList.toFirst();
            Fahrzeug lowestPS = fahrzeugList.getContent();
            while(fahrzeugList.hasAccess()){
                if(fahrzeugList.getContent().getPs() < lowestPS.getPs()){
                    lowestPS = fahrzeugList.getContent();
                }
                fahrzeugList.next();
            }
            fahrzeugList.toFirst();
            while(fahrzeugList.getContent() != tmp){
                fahrzeugList.next();
            }
        }
        return lowestPS();
    }
}
