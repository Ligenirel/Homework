package lesson_3;

class Product {
    private String название;
    private String датаПроизводства;
    private String производитель;
    private String странаПроисхождения;
    private double цена;
    private boolean состояниеБронирования;

    public Product(String название, String датаПроизводства, String производитель,
                 String странаПроисхождения, double цена, boolean состояниеБронирования) {
        this.название = название;
        this.датаПроизводства = датаПроизводства;
        this.производитель = производитель;
        this.странаПроисхождения = странаПроисхождения;
        this.цена = цена;
        this.состояниеБронирования = состояниеБронирования;
    }

    public void вывестиИнформацию() {
        System.out.println("Название: " + название);
        System.out.println("Дата производства: " + датаПроизводства);
        System.out.println("Производитель: " + производитель);
        System.out.println("Страна происхождения: " + странаПроисхождения);
        System.out.println("Цена: " + цена);
        System.out.println("Состояние бронирования: " + состояниеБронирования);
    }

    public static void main(String[] args) {
        Product[] товары = new Product[5];

        товары[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        товары[1] = new Product("Apple iPhone 15", "10.09.2025", "Apple Inc.", "USA", 79999, false);
        товары[2] = new Product("Xiaomi Mi 12", "20.01.2025", "Xiaomi Corp.", "China", 3499, true);
        товары[3] = new Product("Sony WH-1000XM5", "05.03.2025", "Sony", "Japan", 2999, false);
        товары[4] = new Product("Dell XPS 13", "15.04.2025", "Dell", "USA", 89999, true);

        for (Product товар : товары) {
            товар.вывестиИнформацию();
            System.out.println("-------------------");
        }
    }
}

 class Park {
    private String Dream;

    public Park(String Dream) {
        this.Dream = Dream;
    }

    public class Attraction {
        private String названиеАттракциона;
        private String времяРаботы;
        private double стоимость;

        public Attraction(String названиеАттракциона, String времяРаботы, double стоимость) {
            this.названиеАттракциона = названиеАттракциона;
            this.времяРаботы = времяРаботы;
            this.стоимость = стоимость;
        }

        public void вывестиИнформацию() {
            System.out.println("Аттракцион: " + названиеАттракциона);
            System.out.println("Время работы: " + времяРаботы);
            System.out.println("Стоимость: " + стоимость + " руб.");
        }
    }

    public static void main(String[] args) {
        Park парк = new Park("Парк развлечений");

        // Создаем объект внутреннего класса
        Park.Attraction аттракцион = парк.new Attraction("Рыгачка", "09:00 - 23:00", 300);

        аттракцион.вывестиИнформацию();
    }
}
