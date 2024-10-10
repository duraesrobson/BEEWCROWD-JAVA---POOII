import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das 3 palavras
        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        // Determinação do animal
        String animal = "";

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    animal = "homem";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "vaca";
                } else if (palavra3.equals("carnivoro")) {
                    animal = "leão";
                }
            } else if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else if (palavra3.equals("onivoro")) {
                    animal = "pomba";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "periquito";
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("anelideo")) {
                if (palavra3.equals("onivoro")) {
                    animal = "minhoca";
                } else if (palavra3.equals("hematofago")) {
                    animal = "sanguessuga"; // Corrigido para incluir o caso
                }
            } else if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    animal = "pulga";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (palavra2.equals("molusco")) {
                if (palavra3.equals("onivoro")) {
                    animal = "polvo";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "lesma";
                }
            }
        }

        // Saída do nome do animal
        System.out.println(animal);

        sc.close();
    }
}
