import view.MainView;

import java.awt.event.ActionEvent;

public class Main {

    private final MainView view;

    public Main(MainView view){
        this.view = view;
        view.addInfoButtonHandler( this::showInfo );
    }

    public static void main(String[] args) {
        new MainView(400, 200);
    }

    private void showInfo( ActionEvent actionEvent ){

    }
}