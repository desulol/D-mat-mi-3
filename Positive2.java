/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn tvær heiltölur. Ef báðar tölurnar eru jákvæðar prentast
 *            "Báðar jákvæðar", ef önnur "Önnur jákvæð". Loks ef hvorug er
 *            jákvæð prentast "Hvorug jákvæð"
 *
 *****************************************************************************/
public class Positive2 {
    public static void main(String[]args){
        int inputOne = Integer.parseInt(args[0]);
        int inputTwo = Integer.parseInt(args[1]);

        if (inputOne >=0 && inputTwo>=0){
            System.out.println("Báðar jákvæðar");
        }
        else if (inputOne<0 && inputTwo>=0 || inputOne>=0 && inputTwo<-1) {
            System.out.println("Önnur jákvæð");
        }
        else  {
            System.out.println("Hvorug jákvæð");
        }
    }

}
