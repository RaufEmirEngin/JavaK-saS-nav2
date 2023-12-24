public class Main {
    public static void main(String[] args) {
        // Daire oluşturma
        Daire daire = new Daire("A101", 3, 2);
        daire.displayInfo();

        // Bina oluşturma
        Bina bina = new Bina("Bina1", 5);
        bina.displayInfo();

        // Konut oluşturma
        Konut konut = new Konut("Konut1");
        konut.displayInfo();

        // evSahibi oluşturma
        Bina evSahibiBina = new Bina("EvSahibiBina", 4);
        evSahibi evSahibi = new evSahibi("Ahmet", "Yılmaz", evSahibiBina);
        evSahibi.displayInfo();

        // Kiracı oluşturma
        Kiraci kiraci = new Kiraci("Ali", "Demir", evSahibi);
        kiraci.displayInfo();

        // evSahibi'ne daire ekleme
        evSahibi.addApartment(daire);
    }
}

class Daire implements Comparable<Daire> {
    private String apartmentNumber;
    private int floorNumber;
    private int roomCount;

    public Daire(String apartmentNumber, int floorNumber, int roomCount) {
        this.apartmentNumber = apartmentNumber;
        this.floorNumber = floorNumber;
        this.roomCount = roomCount;
    }

    public void displayInfo() {
        System.out.println("Daire Bilgileri: " + apartmentNumber + ", Kat: " + floorNumber + ", Oda Sayısı: " + roomCount);
    }

    public int compareTo(Daire otherDaire) {
        // Daireleri karşılaştırma mantığı buraya eklenebilir
        return 0;
    }
}

class Bina {
    private String buildingName;
    private int numberOfFloors;

    public Bina(String buildingName, int numberOfFloors) {
        this.buildingName = buildingName;
        this.numberOfFloors = numberOfFloors;
    }

    public void displayInfo() {
        System.out.println("Bina Bilgileri: " + buildingName + ", Kat Sayısı: " + numberOfFloors);
    }
}

class Konut {
    private String address;

    public Konut(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Konut Bilgileri: Adres: " + address);
    }
}

class evSahibi {
    private String firstName;
    private String lastName;
    private Bina ownedBuilding;

    public evSahibi(String firstName, String lastName, Bina ownedBuilding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ownedBuilding = ownedBuilding;
    }

    public void displayInfo() {
        System.out.println("Ev Sahibi Bilgileri: " + firstName + " " + lastName + ", Sahip Olduğu Bina: " + ownedBuilding);
    }

    public void addApartment(Daire daire) {
        // Daire ekleme işlemleri buraya eklenir
        System.out.println("Daire eklendi: " + daire);
    }
}

class Kiraci {
    private String firstName;
    private String lastName;
    private evSahibi landlord;

    public Kiraci(String firstName, String lastName, evSahibi landlord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.landlord = landlord;
    }

    public void displayInfo() {
        System.out.println("Kiracı Bilgileri: " + firstName + " " + lastName + ", Ev Sahibi: " + landlord);
    }
}
