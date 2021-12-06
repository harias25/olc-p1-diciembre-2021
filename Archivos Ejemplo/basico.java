int var1 = 10;
int var2 = 20;

void main(){
    println("Probando Manejo de Entornos");
    println("El valor de var1 global es $a");  //10

    int var1 = 5*5;
    println("El valor de var1 local es $a");  //25

    println("Probando expresiones Arítmeticas");
    println(-25^(69-33*2)+22-32*2-33*(-48+48));   // -62
    println(-93.555+92.12-81.33+19+26-68+-7/(79+11)/86);    // -105.765
    println(8+67+74-1.0*((-86+22)*2)-5*6);  // 247.0
    println((51 % 49) * (9.9+90.1));    // 200.0
    println(0+9*3*(85%(46+95)));    // 2295

    println("Probando expresiones Booleanas y Lógicas");

    println(56 < 48 && 68 >=12 && 62 != 96);    // false
    println((21.0==20.5||95>=94)&&((19<39&&83<=96)||35<97));    // true
    println((68==33||(2<95&&17==37))&&63<=9||12<=42||25==1);    // true

    println("Probando expresiones Arítmeticas, Booleanas y Lógicas");
    if ((true == true && false != false) || true == false)
        println("No entra acá");
    else
        println("Entra acá");

    if (1 == (1 + 1 - (1 * 2 / 2)) && 20.5 == 20.5)
        println("Entra acá");
    else
        println("No entra acá");

    if ("Hola" == "Mundo")
        println("No entra acá");
    else
        println("Entra acá");


    
}

double operacionMatematica(char operador, int valor1, int valor2){
    switch(operador) {
        case '+':
            return valor1 + valor2;
            break;
        case '-':
            return valor1 - valor2;
            break;
        case '*':
            return valor1 * valor2;
            break;
        case '/':
            return valor1 / valor2;
            break;
        default:
            return 0;
    } 
}