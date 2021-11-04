import java.util.List;
public class tae{
    public static void main(String[] args){
    List<String> languages = List.of("Java", "C++", "C", "Go", "PHP");

    languages.stream()
    .forEach(System.out::println);
    }
}
