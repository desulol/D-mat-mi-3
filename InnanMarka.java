/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn heiltölubreytu og prentar út "Ekki heiltala" ef svo er ekki.
 *            Auk þess prentar það "Innan marka" ef talan er á bilinu 5-50 en
 *            "Utan marka" annars.
 *
 *****************************************************************************/
public class InnanMarka {
    public static void main(String[] args) {
        try {
            int input = Integer.parseInt(args[0]);
            if (input >= 5 && input <= 50) {
                System.out.println("Innan marka");
            }
            else  {
                System.out.println("Utan marka");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Ekki heiltala");
        }

    }

}
