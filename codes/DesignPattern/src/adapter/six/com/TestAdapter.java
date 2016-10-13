package adapter.six.com;

/**
 * Created by lj on 16/10/12.
 */
public class TestAdapter {

    public static void main(String[] args) {
        AceClass aceObject = new AceClass();
        aceObject.setName("Cary Grant");

        AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);
        System.out.println("Customer's first name: " + adapter.getFirstName());
        System.out.println("Customer's last name: " + adapter.getLastName());
    }

}