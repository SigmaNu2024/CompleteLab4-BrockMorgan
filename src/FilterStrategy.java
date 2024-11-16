import java.util.List;

public interface FilterStrategy {
    List<OscarAward> filter(List<OscarAward> awards, String filterValue);
}
