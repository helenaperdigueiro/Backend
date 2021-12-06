package dao;

public interface IDao<T> {
    public T insert(T t);
    public void update(Integer id);
    public void delete(Integer id);
    public void select(Integer id);
    public void selectAll();
}
