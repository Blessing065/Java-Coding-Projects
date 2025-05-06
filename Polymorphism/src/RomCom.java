class RomCom extends Movie{
    public RomCom (String title){
        super(title);
    }

    public void watchRomCom(){
        System.out.println("Watching Romance Comedy");
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Love story", "People get heartbroken", "Happy Ending");
    }

    public void watchRomComFilm(){
        System.out.println("Watching Romantic comedy movie");
    }
}
