package YOUR_PACKAGE_NAME;

import javafx.application.Application;

/**
 * Minimal reproducible example (MRE) - Example of a simple JavaFX preloader.
 * Java Main class for starting up the JavaFX application with a call to launch MainApplication.
 * @author Remzi Cavdar - ict@remzi.info - <a href="https://github.com/Remzi1993">@Remzi1993</a>
 */
public class Main {
    public static void main(String[] args) {
        /*
         * The following Java system property is important for JavaFX to recognize your custom preloader class.
         * Which should extend javafx.application.Preloader.
         */
        System.setProperty("javafx.preloader", Preloader.class.getName());
        // Launch the main JavaFX application class.
        Application.launch(MainApplication.class, args);
    }
}
