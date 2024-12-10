
/**
 * Класс для создания животных с дополнительными методами
 */

import java.time.LocalDate;

public class CreateAnimalServiceImpl extends CreateAnimalService {

    // Метод для создания N животных
    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) { // Цикл для создания N животных
            String breed = "Breed" + i;
            String name = "Name" + i;
            double cost = Math.random() * 1000; // Случайная стоимость
            String character = "Character" + (i % 10); // Циклический характер
            LocalDate birthDate = LocalDate.of(2000 + (i % 20), 1 + (i % 12), 1); // Циклическая дата рождения
            
            // Создаем животных
            AbstractAnimal animal;
            if (i % 2 == 0) {
                animal = new Predator(breed, name, cost, character, birthDate);
            } else {
                animal = new Pet(breed, name, cost, character, birthDate);
            }

            System.out.println("Создано животное: " + animal.getName()); // Выводим информацию о новом животном
        }
    }

    // Метод для создания животных с использованием do-while
    public void createAnimalsDoWhile(int n) {
        int count = 0;
        do {
            String breed = "Breed" + count;
            String name = "Name" + count;
            double cost = Math.random() * 1000;
            String character = "Character" + (count % 10);
            LocalDate birthDate = LocalDate.of(2000 + (count % 20), 1 + (count % 12), 1); 

            AbstractAnimal animal;
            if (count % 2 == 0) {
                animal = new Predator(breed, name, cost, character, birthDate);
            } else {
                animal = new Pet(breed, name, cost, character, birthDate);
            }

            System.out.println("Создано животное: " + animal.getName());
            count++;
        } while (count < n); // Продолжаем, пока не достигнем N
    }
}


