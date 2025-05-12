package Interfaces;

public interface Payable {
    default String getMethod() {
        return "Unknown";
    }

    static boolean isValid(int amount) {
        return (amount > 0);
    }
}
