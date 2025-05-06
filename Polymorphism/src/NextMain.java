public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

//        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
//        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");
        Movie comedyMovie =(Comedy) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        Object unknownObject = Movie.getMovie("S","Star wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }else if(unknownObject instanceof Adventure){
            ((Adventure)  unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFriction();

        }
    }
}
