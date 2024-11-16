import java.util.List;
import java.util.stream.Collectors;

public class CategoryFilter implements FilterStrategy {
    @Override
    public List<OscarAward> filter(List<OscarAward> awards, String category) {
        return awards.stream()
                .filter(award -> award.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}

