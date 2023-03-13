class Main{
    public static void main(String args[]){
        Integer hora = 11;

        if ( hora >= 6 && hora <= 10 ){
            System.out.println("Desayuno");
        }
        if ( hora >= 11 && hora <= 14 ){
            System.out.println("Almuerzo");
        }
        if ( hora >= 15 && hora <= 18 ){
            System.out.println("Comida");
        }
        if ( hora >= 19 && hora <= 24 ){
            System.out.println("Cena");
        }
    }
}