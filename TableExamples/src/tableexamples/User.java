package tableexamples;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ANONYME
 */
public class User {
    
    SimpleStringProperty name;
    SimpleStringProperty role;
    SimpleStringProperty email;

    public User() {
        this.name = new SimpleStringProperty("");
        this.role = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
    }

    public User(String name, String role, String email) {
        this.name = new SimpleStringProperty(name);
        this.role = new SimpleStringProperty(role);
        this.email = new SimpleStringProperty(email);
    }
    
    
    
}
