import javax.xml.validation.Validator;
//
//class Encrypter {
//
//    public static String getEncryptedName(String name) {
//        if(Validator.validate(name)) {
//            new StringBuilder(name).reverse();
//            name.toLowerCase();
//        }
//
//        return name;
//    }
//}


class Encrypter {

    public static String getEncryptedName(String name) {
        Validator v = new Validator();
        if (v.validate(name)) {
            try {
                name = new StringBuilder(name).reverse().toString();
                name.toLowerCase();
            } catch (Exception e) {
                System.out.println("Try again with valid name");
            }

        }
        return name;
    }
}