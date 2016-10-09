package part4.Больница;

public class СоленыйОгурецImpl implements СоленыйОгурец {

    private boolean жеванный;

    public boolean isЖеванный() {
        return жеванный;
    }

    public void жеваться() {
        жеванный = true;
    }
}
