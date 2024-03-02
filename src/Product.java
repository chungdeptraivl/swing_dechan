public class Product {
    private String ma;
    private String ten;
    private String gia;

    public Product(String ma, String ten, String gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    // Phương thức getter và setter cho mã sản phẩm
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    // Phương thức getter và setter cho tên sản phẩm
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // Phương thức getter và setter cho giá sản phẩm
    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
