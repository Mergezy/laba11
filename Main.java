public class Main {
    public static void main(String[] args) {
        Product Apple = new ProductFruits("Яблоко", 26.4, 5);
        Product Potato = new ProductVegetable("Картофель", 20.3, 5);
        Product Strawberry = new ProductBerries("Клубника", 30.6, 4);

        User Ivan = new UserAdmin("Ivan_ad", "23nsu543");
        User Shop = new UserShop("Shop", "ki93821ks");
        User Oleg = new UserBuyer("Oleg", "213ssd23");

        Purchase purchase_1 = new Purchase(Apple.getName(), Apple.getPrice(), Apple.getRating(), Oleg.getLogin(), Oleg.getPassword());

        purchase_1.printPurchase();
    }
}

interface Product {
    String getName();
    double getPrice();
    int getRating();
}

class ProductFruits implements Product {
    private String name;
    private double price;
    private int rating;

    public ProductFruits(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getRating() {
        return rating;
    }
}

class ProductVegetable implements Product {
    private String name;
    private double price;
    private int rating;

    public ProductVegetable(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getRating() {
        return rating;
    }
}

class ProductBerries implements Product {
    private String name;
    private double price;
    private int rating;

    public ProductBerries(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getRating() {
        return rating;
    }
}

interface User {
    String getLogin();
    String getPassword();
}

class UserAdmin implements User {
    private String login;
    private String password;

    public UserAdmin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

class UserShop implements User {
    private String login;
    private String password;

    public UserShop(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

class UserBuyer implements User {
    private String login;
    private String password;

    public UserBuyer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

class Purchase {
    private String productName;
    private double productPrice;
    private int productRating;
    private String userLogin;
    private String userPassword;

    public Purchase(String productName, double productPrice, int productRating, String userLogin, String userPassword) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    // Метод для вывода информации о покупке
    public void printPurchase() {
        System.out.println("Пользователь " + userLogin + " купил товар " + productName);
    }
}
