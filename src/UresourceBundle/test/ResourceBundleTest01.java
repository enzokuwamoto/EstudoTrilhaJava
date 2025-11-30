package UresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle_en = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle bundle_br = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundle_en.containsKey("hello"));
        System.out.println(bundle_en.containsKey("good.morning"));

        System.out.println(bundle_br.containsKey("hello"));
        System.out.println(bundle_br.containsKey("good.morning"));

        System.out.println(bundle_en.getString("hello"));
        System.out.println(bundle_en.getString("good.morning"));

        System.out.println(bundle_br.getString("hello"));
        System.out.println(bundle_br.getString("good.morning"));
    }
}
