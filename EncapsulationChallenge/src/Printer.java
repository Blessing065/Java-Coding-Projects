public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        tonerLevel += tonerAmount;

        if((tonerLevel > 100) || (tonerLevel  < 0)){
            return-1;}
        else{
            return tonerLevel;
        }
    }


    public int printPages(int pages){

        int jobPages = 0;
        if(duplex){
            jobPages = (pages / 2 ) + (pages % 2);
            pagesPrinted +=jobPages;
            return jobPages;
        }else{
    pagesPrinted +=jobPages;
            return pages;}
    }

//    public int printPages(int pages){
//        int jobPages = (duplex)? (pages / 2 ) + (pages % 2 ) : pages;
//        pagesPrinted += jobPages;
//        return jobPages;
//    }




        public int getPagesPrinted() {
        return pagesPrinted;
    }
}
