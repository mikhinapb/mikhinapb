/**
 * Класс для создания животных
 */
import java.time.LocalDate; // Импорт для работы с датами
import java.util.ArrayList; // Импортируем ArrayList для хранения животных
import java.util.List; // Импортируем List для работы со списками
import java.util.Random; // Импортируем Random для генерации случайных данных;
import java.util.Arrays; // Для работы с массивами

// Класс для создания животных
public class CreateAnimalService {
    private List<AbstractAnimal> animals; // Список для хранения животных

    public CreateAnimalService() {
        this.animals = new ArrayList<>(); // Инициализируем список
    }

    // Метод для создания 10 уникальных животных
    public void createDefaultAnimals() {
        Random random = new Random(); // Для генерации случайных данных

        int count = 0;
        while (count < 10) { // Цикл while для создания 10 животных
            String breed = "Breed" + random.nextInt(100); // Генерируем случайную породу
            String name = "Name" + random.nextInt(100); // Генерируем случайное имя
            double cost = random.nextDouble() * 1000; // Генерируем случайную стоимость
            String character = "Character" + random.nextInt(10); // Генерируем случайный характер
            LocalDate birthDate = LocalDate.of(2000 + random.nextInt(20), random.nextInt(12) + 1, random.nextInt(28) + 1); // Генерация случайной даты рождения

            // Случайным образом выбираем, создавать хищное или домашнее животное
            AbstractAnimal animal;
            if (random.nextBoolean()) {
                animal = new Predator(breed, name, cost, character, birthDate);
            } else {
                animal = new Pet(breed, name, cost, character, birthDate);
            }

            animals.add(animal); // Добавляем животное в список
            System.out.println("Создано животное: " + animal.getName()); // Выводим информацию о новом животном
            count++; // Увеличиваем счетчик
        }
    }
    
    // Метод для получения всех животных
    public List<AbstractAnimal> getAnimals() {
        return animals; // Возвращаем список животных
    }
}


