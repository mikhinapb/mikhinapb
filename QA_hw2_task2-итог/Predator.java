/**
 * Класс Predator для хищных животных
 */
import java.time.LocalDate;
public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate); // Вызов конструктора родительского класса
    }

    // Переопределение метода equals для сравнения животных
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравниваем ссылки
        if (!(obj instanceof Predator)) return false; // Проверяем тип объекта
        Predator other = (Predator) obj; // Приводим тип к Predator
        return this.breed.equals(other.breed) &&
               this.name.equals(other.name) &&
               this.cost == other.cost &&
               this.character.equals(other.character) &&
               this.birthDate.equals(other.birthDate); // Сравниваем все поля
    }
}
