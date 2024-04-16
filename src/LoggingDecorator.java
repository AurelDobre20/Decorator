public class LoggingDecorator implements DataService{
    private DataService wrapper;

     LoggingDecorator(DataService wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String fetchData() {
        System.out.println("Print...");
        return wrapper.fetchData();
    }
}
