package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.ajdi.yassin.popularmovies.DataBinderMapperImpl());
  }
}
