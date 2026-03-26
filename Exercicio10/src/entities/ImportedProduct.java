package entities;

public class ImportedProduct extends Product {

    protected Double customsFee;

    public ImportedProduct(String nome, double preco) {
        super(nome, preco);
    }

    public ImportedProduct(String nome, double preco, Double customsFee) {
        super(nome, preco);
        this.customsFee =  customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return String.format("%s $ %.2f (Customs Fee: $ %.2f)", nome, totalPrice(), customsFee);
    }

    public Double totalPrice(){
        return preco + customsFee;
    }
}
