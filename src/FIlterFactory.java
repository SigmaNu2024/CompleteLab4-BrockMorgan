class FilterFactory {
    public static FilterStrategy getFilter(OscarAwardFilter.FilterType filterType) {
        switch (filterType) {
            case CATEGORY:
                return new CategoryFilter();
            case YEAR:
                return new YearFilter();
            case CEREMONY_YEAR:
                return new CeremonyYearFilter();
            default:
                throw new IllegalArgumentException("Invalid filter type");
        }
    }
}

