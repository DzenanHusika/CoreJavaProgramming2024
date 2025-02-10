package seven.basic;

public enum Gender {

    MALE("Muški", "Snažniji rod"),
    FEMALE("Ženski", "Nježniji i pametniji rod"),
    UNKNOWN("Unknown", "Unknown...");



    private String name;
    private String surname;

    Gender(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}
