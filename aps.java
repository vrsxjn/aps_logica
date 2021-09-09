import java.util.Scanner;

public class aps {
  public class SistemaCor {
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";
  }
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int inicioz;
    int continua = 1;
    comeco: while(continua >= -1) {
      System.out.println("==== Inicio ====");
      System.out.println("Nome: ");
      System.out.println("RA: ");
      System.out.println(SistemaCor.GREEN + "(1) - Continuar " + SistemaCor.RESET + " " + SistemaCor.RED + " (2) - Fechar Programar" + SistemaCor.RESET);
      System.out.println("================");
      inicioz = leitor.nextInt();
    if(inicioz == 1) {
     a: while(continua >= -1) {
      System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Velocidade inicial?");
      double velociadadeInicial = leitor.nextInt();
      if(velociadadeInicial <= 0) {
        System.out.println(SistemaCor.RED + "[ERRO]" + SistemaCor.RESET + " Digita um Numero Maior que zero");
      }else {
      while (continua >= -1) {
      System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Algulo de inclinação?");
      double angulo = leitor.nextInt();
      if(angulo <= 0 || angulo >= 90) {
        System.out.println(SistemaCor.RED + "[ERRO]" + SistemaCor.RESET + " Digita um angulo entre 1 graus a 89");
      }else {
        System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Deseja informa a aceleração? Ou usar a padrão 9,81\n (1) - Padrão (2) - Mudar " + "\n" +  SistemaCor.RED + "Qualquer outro numero entra como alteração" + SistemaCor.RESET);
        int info = leitor.nextInt();
        double aceleracao = 9.81;
        if(info != 1) {
          System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Digita a aceleração");
          aceleracao = leitor.nextDouble();
        }
         double alturaMaxima;

          angulo = Math.toRadians(angulo);

          alturaMaxima = Math.pow(velociadadeInicial, 2) * Math.sin(angulo) / 2 * aceleracao;


        double tempoTrajeto;

          tempoTrajeto = 2 * velociadadeInicial * Math.sin(angulo) / aceleracao;

        double alcanceHorizontal;

         alcanceHorizontal = 2 * velociadadeInicial * (Math.cos(angulo) * Math.sin(angulo) / aceleracao);
         distancia: while(continua >= -1) {
           System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Distancia que se encontra o alvo: ");
            double distanciaalvo = leitor.nextDouble();
           if(distanciaalvo <= 0) {
             System.out.println(SistemaCor.RED + "[ERRO]" + SistemaCor.RESET + " Distancia deve ser maior que zero!!!");
           }else {
             alvo: while(continua >= -1) {
             System.out.println(SistemaCor.YELLOW + "[SISTEMA]" + SistemaCor.RESET + " Tamanho do alvo: ");
             double tamanhoalvo = leitor.nextDouble();
             if(tamanhoalvo < 20 || tamanhoalvo > 50){
               System.out.println(SistemaCor.RED + "[ERRO]" + SistemaCor.RESET + " Tamanho do alvo tem que entra 20 a 50!!");
             }else {
               tamanhoalvo = Math.abs(tamanhoalvo); // validação
               double tempo,resultado;
               String acerto;

               tempo =  2 * velociadadeInicial * Math.sin(angulo) / aceleracao;
               double distanciaMinima = distanciaalvo + 1;
               double distanciaMaxima = distanciaalvo + tamanhoalvo - 1;


              if (alcanceHorizontal < distanciaMinima) {
                  acerto = "Não alcancou";
              } else if (alcanceHorizontal > distanciaMaxima) {
                  acerto = "Passou direto";
              } else {
                  acerto = "Acertou";
              }
              int loopzin = 1;
              resposta: while(loopzin >= -1) {
              System.out.println(SistemaCor.YELLOW + "[INFORMAÇOES] " + SistemaCor.RESET +"\n\n (1) - Alvo (2) - Canhão (3) - Resultado (4) - Todas Informaçoes (5) - Sair das informaçoes" + SistemaCor.RESET);
              int consultainfo = leitor.nextInt();
              switch(consultainfo) {
                case 1:
                System.out.print(SistemaCor.YELLOW + "[ALVO] " + SistemaCor.RESET + "\n Tamanho Alvo " + tamanhoalvo + " \n Distancia Alvo " + distanciaalvo + "\n");
                break;
                case 2:
                System.out.print(SistemaCor.YELLOW + "[CANHÂO] " + SistemaCor.RESET + "\n Velocidade " + velociadadeInicial + " \n Angulo " + angulo + "\n Aceleração " + aceleracao + "\n");
                break;
                case 3:
                System.out.print(SistemaCor.YELLOW + "[RESULTADO] " + SistemaCor.RESET + "\n Alcance " + alcanceHorizontal + " \n Altura Maxima " + alturaMaxima + "\n Tempo Trajeto " + tempoTrajeto + "\n Alvo "+ acerto  + "\n");
                break;
                case 4:
                System.out.print(SistemaCor.YELLOW + "[ALVO] " + SistemaCor.RESET +  "\n Tamanho Alvo " + tamanhoalvo + " \n Distancia Alvo " + distanciaalvo + "\n");
                System.out.print(SistemaCor.YELLOW + "[CANHÂO] " + SistemaCor.RESET +  "\n Velocidade " + velociadadeInicial + " \n Angulo " + angulo + "\n Aceleração " + aceleracao + "\n");
                System.out.print(SistemaCor.YELLOW + "[RESULTADO] " + SistemaCor.RESET +  "\n Alcance " + alcanceHorizontal + " \n Altura Maxima " + alturaMaxima + "\n Tempo Trajeto " + tempoTrajeto + "\n Alvo "+ acerto + "\n");
                break;
                case 5:
                break resposta;
                default:
                System.out.print(SistemaCor.YELLOW + "[ALVO] " + SistemaCor.RESET +  "\n Tamanho Alvo " + tamanhoalvo + " \n Distancia Alvo " + distanciaalvo + "\n");
                System.out.print(SistemaCor.YELLOW + "[CANHÂO] " + SistemaCor.RESET +  "\n Velocidade " + velociadadeInicial + " \n Angulo " + angulo + "\n Aceleração " + aceleracao + "\n");
                System.out.print(SistemaCor.YELLOW + "[RESULTADO] " + SistemaCor.RESET +  "\n Alcance " + alcanceHorizontal + " \n Altura Maxima " + alturaMaxima + "\n Tempo Trajeto " + tempoTrajeto + "\n Alvo "+ acerto + "\n");
                break;
              }
              }
              System.out.println("\n \n" + SistemaCor.YELLOW + "[SISTEMA] " + SistemaCor.RESET + "Deseja Continuar: (1) - Sim (2) - Não");
              int saida = leitor.nextInt();
              if(saida == 2){
                break comeco;
              }
             }
            }
           }
         }
      }
      continua++;
      }
    }
    continua++;
     }
    }else if(inicioz == 2) {
      System.exit(0);
       break comeco;
    }else {
      System.out.println(SistemaCor.RED + "[ERRO]" + SistemaCor.RESET + " Numero não reconhecido");
      continue comeco;
    }
    continua++;
    }
  }
}
