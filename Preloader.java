package YOUR_PACKAGE_NAME;

import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Minimal reproducible example (MRE) - Example of a simple JavaFX preloader class.
 * @author Remzi Cavdar - ict@remzi.info - <a href="https://github.com/Remzi1993">@Remzi1993</a>
 */
public class Preloader extends javafx.application.Preloader {
    private ProgressBar progressBar;
    private Stage stage;

    private Scene createPreloaderScene() {
        progressBar = new ProgressBar();
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(progressBar);
        return new Scene(borderPane, 800, 600);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        // I also recommend to set app icon: stage.getIcons().add();
        stage.setTitle("YOUR TILE HERE");
        stage.setScene(createPreloaderScene());
        stage.show();
    }

    @Override
    public void handleProgressNotification(ProgressNotification pn) {
        progressBar.setProgress(pn.getProgress());
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification evt) {
        if (evt.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.hide();
        }
    }
}
