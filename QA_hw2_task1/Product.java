
/**
 * Класс Product представляет товар с количеством, ценой и скидкой
 */
public class Product
{
    // Quantity - количество товаров
    private int quantity;
    // Price - цена товара
    private double price;
    // Discount - скидка на товар
    private double discount;
    /**
     * Конструктор класса Product
     */
    public Product(int quantity, double price, double discount)
    {
        // инициализация переменных
        this.quantity = quantity; // инициализация количества товара
        this.price = price; // инициализация цены
        this.discount = discount; // инициализация скидки
    }

    /**
     * Метод вычисления суммы покупки без скидки и со скидкой
     */

    public void totalCalculations()
    {
        // вычисление цены без скидки
        double totalPrice = quantity * price; 
        // вычисление цены со скидкой
        double totalWithDiscount = totalPrice - totalPrice * (discount / 100);
        // вывод результатов
        System.out.printf("Общая сумма без скидки: %.2f%n",totalPrice); // вывод суммы без скидки
        System.out.printf("Общая сумма со скидкой: %.2f%n",totalWithDiscount); // вывод суммы со скидкой
    }
}