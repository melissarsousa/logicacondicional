public class Main {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
            // System.out.println("s1 != s2 " + (!s1.equals(s2)));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

        b1 = true;
        b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        i1 = 10;
        i2 = 5;
        f1 = 20f;
        f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

        //Uso do SWITCH e do IF e seus casos
        //Métodos a serem usados:
            ifFlecha();
            ifSemFlecha();
            ifFerias();
            ifMenor();

            switchSemana();
            switchNumero();
            switchFerias();
        }

        private static void ifFlecha() {
        // EFEITO DEVE SER EVITADO, pois ocupa espaço na tela e dificulta o entendimento do códgio
            int mes = 8;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else {
                if (mes == 2) {
                    System.out.println("Fevereiro");
                } else {
                    if (mes == 3) {
                        System.out.println("Março");
                    } else {
                        if (mes == 4) {
                            System.out.println("Abril");
                        } else {
                            if (mes == 5) {
                                System.out.println("Maio");
                            } else {
                                if (mes == 6) {
                                    System.out.println("Junho");
                                } else {
                                    if (mes == 7) {
                                        System.out.println("Julho");
                                    } else {
                                        if (mes == 8) {
                                            System.out.println("Agosto");
                                        } else {
                                            if (mes == 9) {
                                                System.out.println("Setembro");
                                            } else {
                                                if (mes == 10) {
                                                    System.out.println("Outubro");
                                                } else {
                                                    if (mes == 11) {
                                                        System.out.println("Novembro");
                                                    } else {
                                                        if (mes == 12) {
                                                            System.out.println("Dezembro");
                                                        } else {
                                                            System.out.println("Mês indefinido");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private static void ifSemFlecha() {
            int mes = 8;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            } else {
            System.out.println("Mês indefinido");
            }
        }

        private static void ifFerias() {
            String mes = "julho";
            if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
                // Sistema indicou uso de if (mes.equals(julho) || ...)
                System.out.println("Férias");
            }
        }

        private static void ifMenor() {
        // Criar variáveis intermediárias para facilitar o código
            double salarioMensal = 11893.58d;
            double mediaSalario = 10500d;

            int quantidadeDependentes = 4;
            int mediaDependentes = 2;

            if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
                System.out.println("Funcionário deve receber auxílio.");
            }

            boolean salarioBaixo = salarioMensal < mediaSalario;
            boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

            if ((salarioBaixo) && (muitosDependentes)) {
                System.out.println("Funcionário deve receber auxílio.");
            }

            boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
            if (recebeAuxilio) {
                System.out.println("Funcionário deve receber auxílio.");
            } else {
                System.out.println("Funcionário não deve receber auxílio.");
            }

        }

        private static void switchSemana() {

            String dia = "Segunda";
            switch (dia){
                case "Segunda":
                    System.out.println(2);
                    break;
                case "Terça":
                    System.out.println(3);
                    break;
                case "Quarta":
                    System.out.println(4);
                    break;
                case "Quinta":
                    System.out.println(5);
                    break;
                case "Sexta":
                    System.out.println(6);
                    break;
                case "Sábado":
                    System.out.println(7);
                    break;
                case "Domingo":
                    System.out.println(1);
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
                    /* switch (dia) {
                case "Segunda" -> System.out.println(2);
                case "Terça" -> System.out.println(3);
                case "Quarta" -> System.out.println(4);
                case "Quinta" -> System.out.println(5);
                case "Sexta" -> System.out.println(6);
                case "Sábado" -> System.out.println(7);
                case "Domingo" -> System.out.println(1);
                default -> System.out.println("Dia inválido");
            }*/
            }
        }

        private static void switchNumero() {
        // Switch, pois tem somente uma variável, e se fosse ser usado if teriam múltiplos casos em um unico print
        //O sistema indicou o uso do switch no seguinte formato, como enhanced switch
            int numero = 3;
            switch (numero) {
                case 1, 2, 3 -> System.out.println("Certo");
                case 4 -> System.out.println("Errado");
                case 5 -> System.out.println("Talvez");
                default -> System.out.println("Valor Indefinido");
            }
        }

        private static void switchFerias() {

            String mes = "dezembro";
            switch (mes) {
                case "dezembro":
                case "julho":
                case "janeiro":
                    System.out.println("Férias");
                    break;
                default:
                    System.out.println("Mês Indefinido");
                    break;
                    /* String mes = "dezembro";
                    switch (mes) {
                        case "dezembro", "julho", "janeiro" -> System.out.println("Férias");
                        default -> System.out.println("Mês Indefinido");
            } */
            }
        }

    }

