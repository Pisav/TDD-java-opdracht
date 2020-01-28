class Main {
    public static void main(String [] args){

        // Create the ContactsManager object
        ContactManager myContactsManager = new ContactManager();
        // Create a new Contact object for jordi
        Contact friendJordi = new Contact();
        // Set the fields
        friendJordi.name = "Jordi";
        friendJordi.phoneNumber = "0613841645";
        friendJordi.email = "jordi@gmail.com";
        // Add James Contact to the ContactsManager
        myContactsManager.addContact(friendJordi);
        // Create a new Contact object for Mees
        Contact friendMees = new Contact();
        // Set the fields
        friendMees.name = "Mees";
        friendMees.phoneNumber = "0638562375";
        friendMees.email = "Mees@gmail.com";
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendMees);
        // Create a new Contact object for Regilio
        Contact friendRegilio = new Contact();
        // Set the fields
        friendRegilio.name = "Regilio";
        friendRegilio.phoneNumber = "0694821174";
        friendRegilio.email = "Regilio@gmail.com";
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendRegilio);
        // Create a new Contact object for Lucas
        Contact friendLucas = new Contact();
        // Set the fields
        friendLucas.name = "Lucas";
        friendLucas.phoneNumber = "0698335574S";
        friendLucas.email = "Lucas@gmail.com";
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendLucas);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Jordi");
        System.out.println(result.phoneNumber);
        // Now let's try to add an contact.


    }


}