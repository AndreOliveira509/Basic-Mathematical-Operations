public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    Calculadora calc = new Calculadora();
    return calc.calcular(op, v1, v2);
  }
}

class Calculadora {
  public int calcular(String operador, int valor1, int valor2) {
    switch (operador) {
      case "+":
        return valor1 + valor2;
      case "-":
        return valor1 - valor2;
      case "*":
        return valor1 * valor2;
      case "/":
        if (valor2 != 0) {
          return valor1 / valor2;
        } else {
         return 0;
        }
      default:
        throw new IllegalArgumentException("Operador inválido: " + operador);
    }
  }
}
