package Part4;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        // Project 3. Part3. Task 1

        Scanner in = new Scanner(System.in);

        String result_string;

        int Age;
        boolean Continue = true;

        System.out.println("Hello. I'll be your virtual assistant. Tell me about yourself so I can recommend you some books to read.");

        while (Continue) {

            System.out.println("How old are you?");
            Age = Integer.parseInt(in.nextLine());

            if (Age < 6) {
                System.out.println("I can't imagine you having preferences at such a young age. So I'll recommend you some fairy tale books.");
                System.out.println("You may enjoy \"Rapunzel\" by Bethan Woollvin, or maybe \"Prince & Knight\" by Daniel Haack.");
            } else if ((Age >= 6) && (Age < 16)) {

                System.out.println("I guess you have already developed a taste. What genre of book do you prefer?");
                result_string = in.nextLine();

                switch (result_string) {
                    case "fantasy":
                        System.out.println("Nice. Then I'll recommend you \"Ravensong\" by TJ Klune");
                        break;
                    case "science fiction":
                        System.out.println("Nice. Then I'll recommend you \"Rendezvous with Rama\"  by Arthur C. Clarke");
                        break;
                    default:
                        System.out.println("So you actually do not have preferences.");
                        System.out.println("Then I'll recommend a great fantasy book: \"The Hobbit\" by J. R. R. Tolkien.");
                }
            } else if ((Age >= 16) && (Age < 30)) {

                System.out.println("And what your favorite genre of book might be?");
                result_string = in.nextLine();

                switch (result_string) {
                    case "fantasy":
                        System.out.println("Ok. Then I'll recommend you \"The Mystery at Dunvegan Castle\" by T. L. Huchu");
                        break;
                    case "detective":
                        System.out.println("Nice. Then I'll recommend you \"The Name of the Rose\" by Umberto Eco");
                        break;
                    default:
                        System.out.println("So you actually do not have preferences.");
                        System.out.println("Then I'll recommend a great science fiction book: \"Solaris\", by Stanislaw Lem.");
                }
            } else if ((Age >= 30) && (Age < 50)) {

                System.out.println("Tell me about your exquisite taste of genres?");
                result_string = in.nextLine();

                switch (result_string) {
                    case "romance":
                        System.out.println("Sweet. Then I'll recommend you \"Glow\" by Raven Kennedy");
                        break;
                    case "classics":
                        System.out.println("Good. Then I'll recommend you \"Pride and Prejudice\" by Jane Austen");
                        break;
                    default:
                        System.out.println("So you actually do not have preferences.");
                        System.out.println("Then I'll recommend a great classics: \"Jane Eyre\" by Charlotte Bronte.");
                }
            } else if (Age >= 50) {

                System.out.println("Tell me about your exquisite taste of genres?");
                result_string = in.nextLine();

                switch (result_string) {
                    case "fantasy":
                        System.out.println("Ok. Then I'll recommend you \"The Discord of Gods\" by Jenn Lyons");
                        break;
                    case "historical fiction":
                        System.out.println("Good. Then I'll recommend you \"The Children of Jocasta\" by by Natalie Haynes");
                        break;
                    default:
                        System.out.println("So you actually do not have preferences.");
                        System.out.println("Then I'll recommend a great science fiction novel series: \"Berserker \" by Fred Saberhagen");
                }
            }

            System.out.println("Do you want to try again?");

            result_string = in.nextLine();

            switch (result_string.toLowerCase()) {
                case "y":
                    System.out.println("Ok then, lets try again.");
                    break;
                default:
                    Continue = false;
            }
        }
    }
}
