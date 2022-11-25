package pro.sky.java.course1.Objects;
public class Main {
    public static void main(String[] args) {
        Author neilGaiman = new Author("Нил","Гейман");
        Author hMurakami = new Author("Харуки", "Мураками");
        Book neverWhere = new Book("Никогде", neilGaiman, 1995);
        Book aWildSheepChase = new Book("Охота на овец", hMurakami, 1982);
        neverWhere.setYear(1996);
        System.out.println(neverWhere);
        System.out.println(aWildSheepChase);

    }
}