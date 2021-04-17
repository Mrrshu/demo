package dao;

public interface CommonDispatchHandle<T,S,K,V> {

  K  getTheHandlesByCondition(T condition,S handles);

  V  doExecute(K aHandle);
}
