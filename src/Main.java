import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
      for (int x = 1; x <=13; x++){

          switch (x){
              case 1: case 2: case 9:
                  System.out.println(x + "зима  ");
                  break;
              default:
                  System.out.println("нет такого месяца");
          }
      }
    }


    }


