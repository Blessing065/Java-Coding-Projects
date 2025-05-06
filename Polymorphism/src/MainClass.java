import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("ScienceFiction", "Star Wars");
//
//        theMovie.watchMovie();
//

        Scanner S = new Scanner(System.in);

        while(true){
        System.out.println("Enter type (A for Adventure , C for Comedy ," +
                "S for Science Fiction or Q to quit) :");

        String type = S.nextLine();
        if("Qq".contains(type)){
            break;
        }

         System.out.print("Enter Movie Title: ");
        String title = S.nextLine();
        Movie movie = Movie.getMovie(type , title);
        movie.watchMovie();
    }
}}
