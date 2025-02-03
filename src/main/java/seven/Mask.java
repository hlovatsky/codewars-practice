package seven;

public class Mask {

    public String maskify(String value) {
        if (value.length() <= 4) {
            return value;
        } else {
            var chars = value.toCharArray();
            for (int i = 0; i < chars.length - 4; i++) {
                chars[i] = '#';
            }
            return new String(chars);
        }
    }
}