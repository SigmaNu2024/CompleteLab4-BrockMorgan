import java.util.List;
import java.util.stream.Collectors;

public class YearFilter implements FilterStrategy {
    @Override
    public List<OscarAward> filter(List<OscarAward> awards, String yearFilm) {
        int year = Integer.parseInt(yearFilm);
        return awards.stream()
                .filter(award -> award.getYearFilm() == year)
                .collect(Collectors.toList());
    }
}

