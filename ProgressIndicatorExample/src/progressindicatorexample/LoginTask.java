package progressindicatorexample;

import javafx.concurrent.Task;
/**
 *
 * @author ANONYME
 */

public class LoginTask extends Task<Boolean>{
    @Override
    protected Boolean call() throws Exception {
        Thread.sleep(2000);
        updateProgress(1, 1);
        return true;
    }
        
}
