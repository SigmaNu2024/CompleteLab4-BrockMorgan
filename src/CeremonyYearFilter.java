import java.util.List;
import java.util.stream.Collectors;

public class CeremonyYearFilter implements FilterStrategy {
    @Override
    public List<OscarAward> filter(List<OscarAward> awards, String yearCeremony) {
        int year = Integer.parseInt(yearCeremony);
        return awards.stream()
                .filter(award -> award.getYearCeremony() == year)
                .collect(Collectors.toList());
    }
}

