import java.io.BufferedReader;
public class Vowel_Consonant
{
    public static void main(String[] args) throws Exception
    {
        char nu;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the character you want to check:");
        nu = (char) b.read();
        switch(nu)
        {
            case 'a':
            System.out.println("The given character "+n+" is vowel");
            break;

            case 'e':
            System.out.println("This character  is vowel");
            break;

            case 'i':
            System.out.println("This character  is vowel");
            break;

            case 'o':
            System.out.println("This character  is vowel");
            break;

            case 'u':
            System.out.println("This character  is vowel");
            break;

            default:
            System.out.println("This character  is consonants");
            break;
        }
    }
}
