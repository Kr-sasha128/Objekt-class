public class App {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", " Гоголь ");
        Book deadSouls = new Book("Мёртвые души ", gogol, 1842);
        deadSouls.setYearOfTheBook(1845);
        System.out.println(deadSouls);

        Author annaAkhmatova = new Author("Анна ", "Ахматова ");
        Book grayKing = new Book("Сероглазый король ", annaAkhmatova, 1912);
        System.out.println(grayKing);
    }
}