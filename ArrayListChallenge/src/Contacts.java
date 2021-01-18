import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contactListName = new ArrayList<>();
    private ArrayList<String> contactListNumber = new ArrayList<>();

    public void addContact(String name) {
        contactListName.add(name);
//        contactList.add(number);
    }

    public void addPhone(String number) {
        contactListNumber.add(number);

    }

    public void viewContactName() {
        for(int i = 0; i < contactListName.size(); i++) {
            System.out.println(i+1 + ". " + contactListName.get(i));
            System.out.println("   " + contactListNumber.get(i));
        }
    }



    public void modifyContact(String currentInfo, String newInfo) {
        /*
        Search for a name, put in new name
            ask if they want to change the name or number
         */

    }

    public void removeContact(String name) {

    }

    private int findName(String searchName) {
        return contactListName.indexOf(searchName);
    }

    private int findNumber(String searchNumber) {
        return contactListNumber.indexOf(searchNumber);
    }


}
