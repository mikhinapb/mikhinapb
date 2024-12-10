
/**
 * Реализация SearchService
 */
import java.util.ArrayList; // Используем эти импорты для работы со списками
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(AbstractAnimal[] animals) {
        List<String> leapYearAnimals = new ArrayList<>(); // Список для имен животных
        for (AbstractAnimal animal : animals) {
            // Проверка, был ли год рождения животного високосным
            if (animal.getBirthDate().getYear() % 4 == 0 && 
                (animal.getBirthDate().getYear() % 100 != 0 || animal.getBirthDate().getYear() % 400 == 0)) {
                leapYearAnimals.add(animal.getName()); // Добавляем имя в список
            }
        }
        return leapYearAnimals; // Возвращаем список имен
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int years) {
        List<AbstractAnimal> olderAnimals = new ArrayList<>(); // Список для старых животных
        for (AbstractAnimal animal : animals) {
            LocalDate currentDate = LocalDate.now(); // Получаем текущую дату
            // Проверяем, старше ли животное указанного количества лет
            if (currentDate.getYear() - animal.getBirthDate().getYear() > years) {
                olderAnimals.add(animal); // Добавляем животное в список
            }
        }
        return olderAnimals; // Возвращаем список старых животных
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        Set<AbstractAnimal> set = new HashSet<>(); // Множество для уникальных животных
        for (AbstractAnimal animal : animals) {
            // Попытка добавить животное в множество
            if (!set.add(animal)) {
                System.out.println("Дубликат найден: " + animal.getName()); // Если добавление не удалось, выводим сообщение
            }
        }
    }
}

