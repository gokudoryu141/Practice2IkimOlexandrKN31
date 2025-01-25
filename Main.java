package practice.task22;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String chooseGenreType;
        Genre genre = new Genre();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter book type (drama/thriller): ");
            chooseGenreType = scanner.next().toLowerCase();
        } while (!chooseGenreType.equals("drama") && !chooseGenreType.equals("thriller"));

        GenreBuilder builder;

        if (chooseGenreType.equals("drama")) {
            builder = new DramaBuilder(genre);
        } else {
            builder = new ThrillerBuilder(genre);
        }

        builder.setBasicParams("The Tempest", "W. Shakespeare", 106);

        ArrayList<String> legibility = new ArrayList<>();
        legibility.add("Firm case");
        legibility.add("Perfect quality");
        builder.setLegibilityParams(legibility, true, true);

        GenreStatus status = new GenreStatus(true, true, false);
        builder.setStatusParams(status);

        builder.setDescription("Eternal classic in perfect quality");
        builder.build();
    }
}