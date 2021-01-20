package logic;

public interface AbstractFactory<T> {
    T produce (String whatToProduce);
}
