package local.concept2_ViewController;

public class Calc {
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String hash = Integer.toHexString(hashCode());
        return "%s [@%s]".formatted(className, hash);
    }
}
