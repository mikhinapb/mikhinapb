
/**
 * Абстрактный класс для животных
 */
import java.time.LocalDate; // Импортируем класс для работы с датами

public abstract class AbstractAnimal implements Animal {
    protected String breed;        // Порода животного
    protected String name;         // Имя животного
    protected double cost;         // Стоимость животного
    protected String character;    // Характер животного
    protected LocalDate birthDate; // Дата рождения животного

    // Конструктор для инициализации полей
    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    // Реализация методов интерфейса
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
    
    // Метод получения даты рождения
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    @Override
    public String toString() {
        return  getName(); // Возвращаем только имя животного для вывода
}

}

