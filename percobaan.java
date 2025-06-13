package apparab;

public class percobaan {

    public static void main(String[] args) {
        String ArKalimat = "َلْكَلِمَةُ";
        char c = ' ';
        for (int i = 0; i < ArKalimat.length(); i++) {
            c = ArKalimat.charAt(i);
            if ((c != 'َ') && (c != 'ِ') && (c != 'ُ') && (c != 'ْ')) {
                System.out.println("Huruf ke " + i + " : " + c);
            }
            if (c == ' ') {
                ArKalimat += '\n';

            }
        }

    }
}
