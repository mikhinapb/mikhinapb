/**
 * интерфейс SearchService
 */
import java.util.List;

public interface SearchService {
    List<String> findLeapYearNames(AbstractAnimal[] animals); // Найти животных, рожденных в високосный год
    List<AbstractAnimal> findOlderAnimal(AbstractAnimal[] animals, int years); // Найти животных старше N лет
    void findDuplicate(AbstractAnimal[] animals); // Найти дубликаты
}

