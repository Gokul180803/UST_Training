import java.io.Serializable;
import java.io.*;

class UserAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private transient String password;  // transient → excluded from serialization
    private String email;

    // Constructor
    public UserAccount(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // toString method
    @Override
    public String toString() {
        return "UserAccount [Username: " + username +
               ", Password: " + password +
               ", Email: " + email + "]";
    }
}

public class Sensitive {
    public static void main(String[] args) {
        // Create a UserAccount object
        UserAccount user = new UserAccount("john_doe", "securePass123", "john@example.com");

        // Print original object
        System.out.println("Before Serialization:");
        System.out.println(user);

        // Serialize the object
        try (FileOutputStream fos = new FileOutputStream("user.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(user);
            System.out.println("UserAccount object serialized to user.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize the object
        UserAccount deserializedUser = null;
        try (FileInputStream fis = new FileInputStream("user.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            deserializedUser = (UserAccount) ois.readObject();
            System.out.println("UserAccount object deserialized from user.ser");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }

        // Print deserialized object
        System.out.println("After Deserialization:");
        System.out.println(deserializedUser);

        
    }
}
