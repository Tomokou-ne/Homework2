package ObjectsMethods;

public class Main {
    public static void main(String[] args) {
        Author neilGaiman = new Author("Нил","Гейман");
        Author hMurakami = new Author("Харуки", "Мураками");
        Book neverWhere = new Book("Никогде", neilGaiman, 1995);
        Book aWildSheepChase = new Book("Охота на овец", hMurakami, 1982);
        Book neverWhereMore = new Book("Никогде", neilGaiman, 1996);
        neverWhere.setYear(1996);

        System.out.println(neverWhere);
        System.out.println(aWildSheepChase);
        System.out.println(neverWhereMore);
        System.out.println(neverWhere.equals(neverWhereMore));
        System.out.println(neverWhere.hashCode() == neverWhereMore.hashCode());

    }
}