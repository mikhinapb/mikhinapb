/**
 * Класс Main для работы с классом Product
 */
public class Main {
    public static void main(String[] args) 
    {
        // создание объектов с разными значениями
        Product product1 = new Product(2, 100, 0.75); //2 товара, цена - 100, скидка 0,75%
        Product product2 = new Product(10, 550, 42.575); //10 товаров, цена - 550, скидка 42,575
        Product product3 = new Product(45, 1010, 59.1); //45 товаров, цена - 1010, скидка 59,1
        
        // вывод результатов
        System.out.println("Продукт 1:");
        product1.totalCalculations(); //вызов totalCalculation для первого товара
        
        System.out.println("Продукт 2:");
        product2.totalCalculations(); //вызов totalCalculation для второго товара
        
        System.out.println("Продукт 3:");
        product3.totalCalculations(); //вызов totalCalculation для третьего товара
    }
}
