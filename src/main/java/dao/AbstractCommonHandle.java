package dao;


public abstract class AbstractCommonHandle<T,S,K,N> implements Handle<T,S,S,K,K,N> {


    public abstract N afterHandle(K request);


    public abstract S validate(T request);


    public abstract K doHandle(S request);

    public N doSubmit(T request) {
        return this.afterHandle(this.doHandle(this.validate(request)));
    }
}
