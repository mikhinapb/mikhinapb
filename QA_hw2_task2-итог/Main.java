
/**
 * основной класс main
 */
import java.util.List;

public class Main {
public static void main(String[] args) {
    CreateAnimalService service = new CreateAnimalServiceImpl();
    service.createDefaultAnimals(); // Создаем 10 животных

    AbstractAnimal[] animals = service.getAnimals().toArray(new AbstractAnimal[0]); // Получаем массив животных

    SearchService searchService = new SearchServiceImpl(); // Создаем экземпляр SearchService

    List<String> leapYearNames = searchService.findLeapYearNames(animals); // Ищем животных, рожденных в високосный год
    System.out.println("Животные, рожденные в високосный год: " + leapYearNames);

    List<AbstractAnimal> olderAnimals = searchService.findOlderAnimal(animals, 5); // Ищем животных старше 5 лет
    System.out.print("Животные старше 5 лет: ["); // Начинаем вывод
    for (int i = 0; i < olderAnimals.size(); i++) {
        System.out.print(olderAnimals.get(i)); // Используем новый toString() формат
        if (i < olderAnimals.size() - 1) {
            System.out.print(", "); // Если не последний элемент, добавляем запятую
        }
    }
    System.out.println("]"); // Закрываем квадратные скобки
}
}


