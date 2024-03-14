public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "Portable music player", "3001", 150000, 3600);
        Book book = new Book("Dem nay dau tinh yeu nay","Tieu thuyet","2004",80000,"Hariko",350,"Tinh yeu");
        System.out.println("MP3 Info");
        mp3.showInfo();
        System.out.println("Book Info");
    }
}
