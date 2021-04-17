package dao;

public interface AfterHandle<M,N> {
    N afterHandle(M request);
}
