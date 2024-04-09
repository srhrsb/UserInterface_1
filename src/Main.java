import view.MainView;

import java.awt.event.ActionEvent;

public class Main {

    private final MainView view;

    public Main(MainView view){
        this.view = view;
        view.addInfoButtonHandler( this::showInfo );
    }

    public static void main(String[] args) {
        new Main( new MainView(400, 200) );
    }

    private void showInfo( ActionEvent actionEvent ){
        //hier wird die Funktionalität des infoButtons ausgeführt wird
        System.out.println("info button gedrückt");

        boolean confirm = view.confirmWindow("Willst Du das echt sehen?");

        if(confirm)
             view.showInfoWindow("Programm von Klasse 2332");
    }
}