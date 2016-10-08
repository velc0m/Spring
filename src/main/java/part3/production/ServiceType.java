package part3.production;

public enum ServiceType {

    WELCOME("1"), BYE("2"), TAXES("3");

    private final String dbValue;

    ServiceType(String s) {
        dbValue = s;
    }

    public String getDbValue() {
        return dbValue;
    }
}
