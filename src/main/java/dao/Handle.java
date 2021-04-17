package dao;


public interface Handle<T,S,V,K,M,N>  extends BeforeHandle<T,S>, DoHandle<V,K>,AfterHandle<M,N>{

}
