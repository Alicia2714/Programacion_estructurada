import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Menu restaurant fulanito");
            System.out.println("1.- Platillos");
            System.out.println("2.- Bebidas");
            System.out.println("3.- Postres");
            System.out.println("0.- Cuenta");
            System.out.print("Elige una opción -> ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int platillo = 0;
                    System.out.println("Platillos");
                    System.out.println("1.- Quesadilla - $10");
                    System.out.println("2.- Chilaquiles - $15");
                    System.out.println("3.- Lonche - $25");
                    System.out.println("4.- Pozole - $35");
                    System.out.println("Elige tu platillo -> ");
                    platillo = scanner.nextInt();

                    switch (platillo) {
                        case 1:
                            total = total + 10;
                            break;
                        case 2:
                            total = total + 15;
                            break;
                        case 3:
                            total = total + 25;
                            break;
                        case 4:
                            total = total + 35;
                            break;
                        default:
                            System.out.println("Ese platillo no existe, intentalo de nuevo :'(");
                            break;
                    }
                    break;
                case 2:
                    int bebida = 0;
                    System.out.println("Bebidas");
                    System.out.println("1.- Refresco - $18");
                    System.out.println("2.- Agua fresca - $13");
                    System.out.println("3.- Agua - $10");
                    System.out.println("Elige tu bebida -> ");
                    bebida = scanner.nextInt();

                    switch (bebida) {
                        case 1:
                            total = total + 18;
                            break;
                        case 2:
                            total = total + 13;
                            break;
                        case 3:
                            total = total + 10;
                            break;
                        default:
                        System.out.println("Esa bebida no existe, intentalo de nuevo :'(");
                            break;
                    }
                    break;
                case 3:
                    int postre = 0;
                    System.out.println("Postres");
                    System.out.println("1.- Brownie - $18");
                    System.out.println("2.- Chocoflan - $23");
                    System.out.println("3.- Cheesecake - $27");
                    System.out.println("4.- Fruta - $21");
                    System.out.println("Elige tu postre -> ");
                    postre = scanner.nextInt();

                    switch (postre) {
                        case 1:
                            total = total + 18;
                            break;
                        case 2:
                            total = total + 23;
                            break;
                        case 3:
                            total = total + 27;
                            break;
                        case 4:
                            total = total + 21;
                            break;
                        default:
                            System.out.println("Ese postre no existe, intentalo de nuevo :'(");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Tu cuenta total es de: $" + total);
                    break;
                default:
                    System.out.println("Esa opcion no existe, intentalo de nuevo :'(");
                    break;
            }
        }

        System.out.print("Cantidad de personas para dividir la cuenta: ");
        int personas = scanner.nextInt();

        System.out.println("Propina:");
        System.out.println("1.- 5%");
        System.out.println("2.- 10%");
        System.out.println("3.- 15%");
        System.out.println("4.- 20%");
        System.out.println("5.- Otro");
        System.out.println("6.- No dejar propina");
        System.out.print("Elige una opción -> ");
        int propinaOpcion = scanner.nextInt();
        double propina = 0;
        double cuentaDiv = 0;

        switch (propinaOpcion) {
            case 1:
                propina = total * 0.05;
                total = total + propina;
                System.out.println("El total de la cuenta con el 5% de propina es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
                break;
            case 2:
                propina = total * 0.10;
                total = total + propina;
                System.out.println("El total de la cuenta con el 10% de propina es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
                break;
            case 3:
                propina = total * 0.15;
                total = total + propina;
                System.out.println("El total de la cuenta con el 15% de propina es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
                break;
            case 4:
                propina = total * 0.20;
                total = total + propina;
                System.out.println("El total de la cuenta con el 20% de propina es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
                break;
            case 5:
                System.out.println("Ingresa la cantidad de propina en pesos que deseas dejar: $");
                propina = scanner.nextInt();
                total = total + propina;
                System.out.println("El total de la cuenta con propina es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
                break;
            case 6:
                System.out.println("El total de la cuenta a pagar es de: $" + total);
                cuentaDiv = total / personas;
                System.out.println("La cantidad que le toca pagar a cada persona es de: $" + cuentaDiv);
            default:
                break;
        }
    }
}