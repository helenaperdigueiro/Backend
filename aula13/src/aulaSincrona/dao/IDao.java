package aulaSincrona.dao;

public interface IDao<T> {
    public T insert(T t);
    public void delete(Integer id);
    public void select(Integer id);
    public void selectAll();
    public void selectCodigo(String codigo);
}
