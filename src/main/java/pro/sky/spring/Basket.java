package pro.sky.spring;

import java.util.Objects;

public class Basket {
    Integer idProduct;
    String nameProduct;

    public Basket(Integer idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(idProduct, basket.idProduct) && Objects.equals(nameProduct, basket.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, nameProduct);
    }
}
