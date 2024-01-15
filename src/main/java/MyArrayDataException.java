public class MyArrayDataException extends Exception {
    public String detailing;

    public MyArrayDataException(String detailing) {
        this.detailing = detailing;
    }

    @Override
    public String toString() {
        return detailing;
    }
}