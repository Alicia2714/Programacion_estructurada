#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double total = 0;
    int opcion = -1;

    while (opcion != 0) {
        cout << "Menu restaurant fulanito" << endl;
        cout << "1.- Platillos" << endl;
        cout << "2.- Bebidas" << endl;
        cout << "3.- Postres" << endl;
        cout << "0.- Cuenta" << endl;
        cout << "Elige una opción -> ";
        cin >> opcion;
        
        switch(opcion) {
            case 1:
                int platillo;
                cout << "Platillos" <<endl;
                cout << "\n 1.- Quesadilla - $10" <<endl;
                cout << "\n 2.- Chilaquiles - $15" <<endl;
                cout << "\n 3.- Lonche - $25" <<endl;
                cout << "\n 4.- Pozole - $35" <<endl;
                cout << "Elige un platillo -> ";
                cin >> platillo;

                switch (platillo)
                {
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
                default:
                    break;
                }
                break;
            case 2:
                int bebida;
                cout << "\n Elige tu bebida " <<endl;
                cout << "\n 1.- Refresco - $18 " <<endl;
                cout << "\n 2.- Agua fresca - $13" <<endl;
                cout << "\n 3.- Agua - $10" <<endl;
                cin >> bebida;
                switch (bebida)
                {
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
                    break;
                }
                break;
            case 3:
                int postre;
                cout << "\n Elige tu postre " <<endl;
                cout << "\n 1.- Brownie - $18 " <<endl;
                cout << "\n 2.- Chocoflan - $23 " <<endl;
                cout << "\n 3.- Cheescake - $27 " <<endl;
                cout << "\n 4.- Fruta - $21 " <<endl;
                cin >> postre;
                switch (postre)
                {
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
                    total =  total + 21;
                    break;
                default:
                    break;
                }
                break;
            case 0:
                cout << "Tu total es de: $" << total << "\n";
                break;
            default:
                break;
        }
    }
    int personas;
    cout << "Cantidad de personas para dividir la cuenta: ";
    cin >> personas;

    cout << "Propina:" << endl;
    cout << "1.- 5%" << endl;
    cout << "2.- 10%" << endl;
    cout << "3.- 15%" << endl;
    cout << "4.- 20%" << endl;
    cout << "5.- Otro" << endl;
    cout << "6.- No dejar propina" << endl;
    cout << "Elige una opción -> ";
    int propinaOpcion;
    cin >> propinaOpcion;
    double propina = 0;
    double cuentadiv;

    switch(propinaOpcion) {
        case 1:
            propina = total * 0.05;
            total = total + propina;
            cout << "El total de la cuenta con el 5% de propina es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        case 2:
            propina = total * 0.10;
            total = total + propina;
            cout << "El total de la cuenta con el 10% de propina es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        case 3:
            propina = total * 0.15;
            total = total + propina;
            cout << "El total de la cuenta con el 15% de propina es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        case 4:
            propina = total * 0.20;
            total = total + propina;
            cout << "El total de la cuenta con el 20% de propina es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        case 5:
            cout << "Ingresa la cantidad de propina en pesos que deseas dejar: $";
            cin >> propina;
            total = total + propina;
            cout << "El total de la cuenta con la propina es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        case 6:
            cout << "El total de la cuenta es de: $" << total <<"\n";
            cuentadiv = total / personas;
            cout << "La cantidad que le toca pagar a cada persona es de: $" << cuentadiv;
            break;
        default:
            break;
    }
}