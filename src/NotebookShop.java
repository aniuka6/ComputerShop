public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Asuus", 13242432));
        dataStore.add(new Computer("Konn", 23323));
        dataStore.add(new Computer("Asuus", 13242432));
        dataStore.add(new Computer("Kott", 53543));

        Computer compToFind = new Computer("Asuus", 13242432);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ", " + computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
