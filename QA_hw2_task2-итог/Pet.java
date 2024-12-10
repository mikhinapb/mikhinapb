
/**
 * Класс Pet для домашних животных
 */
import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение по ссылке
        if (!(obj instanceof Pet)) return false;
        Pet other = (Pet) obj;
        return this.breed.equals(other.breed) &&
               this.name.equals(other.name) &&
               this.cost == other.cost &&
               this.character.equals(other.character) &&
               this.birthDate.equals(other.birthDate);
    }
}
