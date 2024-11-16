import java.util.List;

public class OscarAwardFilter {
    public enum FilterType {
        CATEGORY,
        YEAR,
        CEREMONY_YEAR
    }

    public List<OscarAward> filter(List<OscarAward> awards, FilterType filterType, String filterValue) {
        switch (filterType) {
            case CATEGORY:
                return new CategoryFilter().filter(awards, filterValue);
            case YEAR:
                return new YearFilter().filter(awards, filterValue);
            case CEREMONY_YEAR:
                return new CeremonyYearFilter().filter(awards, filterValue);
            default:
                throw new IllegalArgumentException("Invalid filter type");
        }
    }
}

