package es.mercaelche.prestashop.db.retrofit.prestashop;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.List;

public class ResponseProductos {

    @Element(name = "product")
    public class product {
        public int getid() {
            return this.id; }
        public void setid(int id) {
            this.id = id; }
        int id;
        public String gethref() {
            return this.href; }
        public void sethref(String href) {
            this.href = href; }
        String href;
    }

    @Element(name="products")
    public class products {
        public List<product> getproduct() {
            return this.product; }
        public void setproduct(List<product> product) {
            this.product = product; }
        List<product> product;
    }

    public class prestashop {
        public products getproducts() {
            return this.products; }
        public void setproducts(products products) {
            this.products = products; }
        products products;
        public String getxlink() {
            return this.xlink; }
        public void setxlink(String xlink) {
            this.xlink = xlink; }
        String xlink;
    }


}
