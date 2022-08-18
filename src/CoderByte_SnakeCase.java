class CoderByte_SnakeCase {

    public static String SnakeCase(String str) {
        str = str.toLowerCase();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (ascii < 97 || ascii > 122) {
                str2 += "_";
            } else {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase("sAFm diuaw"));
    }
}