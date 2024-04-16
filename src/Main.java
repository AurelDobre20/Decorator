// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
            System.out.println(myDataService.fetchData());


            DataService realDataService = new DataServiceConcrete();


            DataService loggedDataService = new LoggingDecorator(realDataService);


            String data = loggedDataService.fetchData();
            System.out.println("Data retrieved " + data);

    }
}