package dao;

public interface BeforeHandle<T,S> {
    S validate(T request);
}
