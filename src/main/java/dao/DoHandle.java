package dao;

public interface DoHandle<V,K> {
    K doHandle(V request);
}
