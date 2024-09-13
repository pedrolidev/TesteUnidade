package control;

public class CalculadoraImc {

    public static String calcularImc(double altura, double peso, int idade, String sexo) {
        double imc = peso / (altura * altura); // Cálculo do IMC

        if (idade >= 18) {
            // Casos para adultos
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                return "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                return "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade grau I";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (idade >= 65) {
            // Casos para idosos
            if (sexo.equals("masculino")) {
                if (imc < 21.9) {
                    return "Baixo peso";
                } else if (imc >= 21.9 && imc < 27) {
                    return "Peso normal";
                } else if (imc >= 27.1 && imc < 30) {
                    return "Sobrepeso";
                } else if (imc >= 30.1 && imc < 35) {
                    return "Obesidade grau I";
                } else if (imc >= 35.1 && imc < 40) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equals("feminino")) {
                if (imc < 21.9) {
                    return "Baixo peso";
                } else if (imc >= 21.9 && imc < 27) {
                    return "Peso normal";
                } else if (imc >= 27.1 && imc < 32) {
                    return "Sobrepeso";
                } else if (imc >= 32.1 && imc < 37) {
                    return "Obesidade grau I";
                } else if (imc >= 37.1 && imc < 42) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            }
        } else {
            // Casos para crianças
            if (idade < 18) {
                if (imc < 5) {
                    return "Baixo peso";
                } else if (imc >= 5 && imc < 85) {
                    return "Peso normal";
                } else if (imc >= 85 && imc < 95) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            }
        }
        return "falha";
    }
}