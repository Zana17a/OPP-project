public interface Flyable {
    //POLJA - sva polja su static konstante i final! staticke konstante!
    String BIRD = null;

    //u okviru interfejsa su sve apstraktne metode i public! nema potrebe staviti ispred public i abstract!!!
    void fly();

}


/// interfejsi mogu medjusobno da se nasledjuju, i onda ako implementiram jedan interface u klasu ta klasa nasledjuje oba interfejsa